package com.kentsong.java.file.excel.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kentsong.java.converter.PatternConverter;
import com.kentsong.java.file.excel.writer.content.ContentValue;


public class ExcelWriter {
	private String filePath;
	private Workbook workbook;
	private CellStyle headerStyle;
	private CellStyle contentStyle;
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = PatternConverter.convert(filePath);
	}
	
	private void createWorkbook() {
		if (filePath.endsWith(".xlsx")) {
			workbook = new XSSFWorkbook();
		} else if (filePath.endsWith(".xls")) {
			workbook = new HSSFWorkbook();
		} else {
			throw new IllegalArgumentException("Unsupported file:" + filePath);
		}
		
		Font headerFont = workbook.createFont();
		headerFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
		headerFont.setFontHeightInPoints((short) 12);
		
		headerStyle = workbook.createCellStyle();
		headerStyle.setAlignment(CellStyle.ALIGN_CENTER);
		headerStyle.setVerticalAlignment(CellStyle.ALIGN_CENTER);
		headerStyle.setBorderBottom(CellStyle.BORDER_THIN);
		headerStyle.setBorderLeft(CellStyle.BORDER_THIN);
		headerStyle.setBorderRight(CellStyle.BORDER_THIN);
		headerStyle.setBorderTop(CellStyle.BORDER_THIN);
		headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		headerStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		headerStyle.setFont(headerFont);
		
		Font contentFont = workbook.createFont();
		contentFont.setFontHeightInPoints((short) 12);
		
		contentStyle = workbook.createCellStyle();
		contentStyle.setBorderBottom(CellStyle.BORDER_THIN);
		contentStyle.setBorderLeft(CellStyle.BORDER_THIN);
		contentStyle.setBorderRight(CellStyle.BORDER_THIN);
		contentStyle.setBorderTop(CellStyle.BORDER_THIN);
		contentStyle.setFont(contentFont);
	}
	
	public void createSheet(List<String> header, List<Map<String, ContentValue>> content) {
		createSheet("", header, content);
	}
	
	public void createSheet(String sheetName, List<String> header, List<Map<String, ContentValue>> content) {
		if (workbook == null) {
			createWorkbook();
		}
		
		Sheet sheet = null;
		if (StringUtils.isBlank(sheetName)) {
			sheet = workbook.createSheet("Sheet" + (workbook.getNumberOfSheets() + 1));
		} else {
			sheet = workbook.createSheet(sheetName);
		}

		int rowNum = 0;
		Row row = sheet.createRow(rowNum++);
		for (int i = 0; i < header.size(); i++) {
			Cell cell = row.createCell(i);
			cell.setCellStyle(headerStyle);
			cell.setCellValue(header.get(i));
			
			sheet.setColumnWidth(i, header.get(i).getBytes().length * 384);
		}
		
		for (int i = 0; i < content.size(); i++) {
			row = sheet.createRow(rowNum++)	;
			Map<String, ContentValue> data = content.get(i);
			for (int j = 0; j < header.size(); j++) {
				Cell cell = row.createCell(j);
				cell.setCellStyle(contentStyle);
				ContentValue value = data.get(header.get(j));
				
				value.assignValueToCell(cell);
			}
		}
	}
	
	public File generateFile() {
		try {
			File file = new File(filePath);
			File dir = file.getParentFile();
			if (!dir.exists()) {
				dir.mkdirs();
			}
			
			FileOutputStream fos = new FileOutputStream(file);
			workbook.write(fos);
			fos.flush();
			fos.close();
			
			return file;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
