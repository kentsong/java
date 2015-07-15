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
import org.junit.Test;

public class ExcelReaderTest {

	@Test
	public void test() {
		File file = new File("src/test/java/com/kentsong/java/file/excel/reader/source/demo.xlsx");
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sheet = wb.getSheetAt(0);
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		
		Iterator<Row> it = sheet.iterator();
		int i = 0;
		while(it.hasNext()){
			Row row = it.next();
			
			row.iterator();
			
			Cell cell = row.getCell(0);
			System.out.println(cell);
			//cell.CELL_TYPE_NUMERIC;
			System.out.println(row.getCell(0).getCellType());
			i++;
		}
		System.out.println("i = " +i);
	}

}
