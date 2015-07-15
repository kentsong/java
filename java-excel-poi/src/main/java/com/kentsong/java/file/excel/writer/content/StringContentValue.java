package com.kentsong.java.file.excel.writer.content;

import org.apache.poi.ss.usermodel.Cell;

public class StringContentValue extends ContentValue {
	
	private String value;
	
	public StringContentValue() {
		this("");
	}
	
	public StringContentValue(String value) {
		this.value = value;
	}
	
	public void setCellValue(String value) {
		this.value = value;
	}

	@Override
	public void assignValueToCell(Cell cell) {
		cell.setCellValue(value);
	}

}
