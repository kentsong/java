package com.kentsong.java.file.excel.reader;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 半成品,依情況再調整
 * @author 635_kentsong
 *
 */

public class ExcelReader {
	
	private File file;
	private Workbook wb;
	private Sheet sheet;
	private Iterator<Row> rowIterator;
	
	public void setFile(File file){
		this.file = file;
		try {
			wb = WorkbookFactory.create(this.file);
		} catch (InvalidFormatException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void setFilePath(String filePath) {
		this.setFile(new File(filePath));
	}
	
	public void selectedSheetAt(Integer index){
		sheet = wb.getSheetAt(index);
		rowIterator = sheet.iterator();
	}
	
	public boolean hasNextRowRecord(){
		return this.rowIterator.hasNext();
	}
	
	public Row readNextRowRecord(){
		Row row = this.rowIterator.next();
		return row;
	}
	
	
	@Deprecated
	public Object getCellValue(Cell cell){
		switch(cell.getCellType()){
			case Cell.CELL_TYPE_BLANK:
				//空白格
				return ""; 
			case Cell.CELL_TYPE_BOOLEAN:
				return cell.getBooleanCellValue();
			case Cell.CELL_TYPE_NUMERIC:
				return cell.getNumericCellValue();
			case Cell.CELL_TYPE_STRING:
				return cell.getStringCellValue();
			default:
				return "";
		}
		
		
	}
	
	
	
	
	
	

}
