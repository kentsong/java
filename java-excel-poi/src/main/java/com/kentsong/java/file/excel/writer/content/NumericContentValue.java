package com.kentsong.java.file.excel.writer.content;

import org.apache.poi.ss.usermodel.Cell;

public class NumericContentValue extends ContentValue {
	
	private double value;
	
	public NumericContentValue() {
		this(0.0);
	}
	
	public NumericContentValue(Double value) {
		this.value = value;
	}
	
	public NumericContentValue(Float value) {
		this.value = value;
	}
	
	public NumericContentValue(Long value) {
		this.value = value;
	}
	
	public NumericContentValue(Integer value) {
		this.value = value;
	}
	
	public void setContentValue(Double value) {
		this.value = value;
	}
	
	public void setContentValue(Float value) {
		this.value = value;
	}
	
	public void setContentValue(Long value) {
		this.value = value;
	}
	
	public void setContentValue(Integer value) {
		this.value = value;
	}

	@Override
	public void assignValueToCell(Cell cell) {
		cell.setCellValue(value);
	}
	
}
