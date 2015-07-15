package com.kentsong.java.file.excel.writer.content;

import org.apache.poi.ss.usermodel.Cell;

public abstract class ContentValue {
	public abstract void assignValueToCell(Cell cell);
}
