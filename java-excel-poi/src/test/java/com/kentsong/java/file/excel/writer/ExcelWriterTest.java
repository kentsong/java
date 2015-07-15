package com.kentsong.java.file.excel.writer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.kentsong.java.collection.FailFastHashMap;
import com.kentsong.java.file.excel.writer.ExcelWriter;
import com.kentsong.java.file.excel.writer.content.ContentValue;
import com.kentsong.java.file.excel.writer.content.NumericContentValue;
import com.kentsong.java.file.excel.writer.content.StringContentValue;


public class ExcelWriterTest {
	
	private ExcelWriter tester;
	private List<String> header;
	private List<Map<String, ContentValue>> content;

	@Before
	public void setUp() throws Exception {
		tester = new ExcelWriter();
		header = new ArrayList<String>();
		header.add("下單日期");
		header.add("Header2");
		header.add("Header3");
		
		content = new ArrayList<Map<String, ContentValue>>();
		
		Map<String, ContentValue> data = new FailFastHashMap<String, ContentValue>();
		data.put("下單日期", new StringContentValue("A"));
		data.put("Header2", new StringContentValue("1"));
		data.put("Header3", new NumericContentValue(1));
		content.add(data);
		
		data = new FailFastHashMap<String, ContentValue>();
		data.put("下單日期", new StringContentValue("B"));
		data.put("Header2", new StringContentValue("2"));
		data.put("Header3", new NumericContentValue(2));
		content.add(data);
		
		data = new FailFastHashMap<String, ContentValue>();
		data.put("下單日期", new StringContentValue("C"));
		data.put("Header2", new StringContentValue("3"));
		data.put("Header3", new NumericContentValue(3));
		content.add(data);
	}

	@Test
	public void testCreateXlsxFile() {
		tester.setFilePath("src/test/java/com/kentsong/java/file/excel/writer/output/ExcelWriterTest_%d{yyyy-MM-dd}.xlsx");
		tester.createSheet("TestSheetName", header, content);
		tester.createSheet(header, content);
		tester.generateFile();
	}

	@Test
	public void testCreateXlsFile() {
		tester.setFilePath("src/test/java/com/kentsong/java/file/excel/writer/output//ExcelWriterTest.xls");
		tester.createSheet("TestSheetName", header, content);
		tester.createSheet(header, content);
		tester.generateFile();
	}
	
	@Test
	public void testCreateXlsFileWithUtf8() {
		tester.setFilePath("src/test/java/com/kentsong/java/file/excel/writer/output/ExcelWriterUTF8Test.xls");
		tester.createSheet("TestSheetName", header, content);
		tester.createSheet(header, content);
		tester.generateFile();
	}
	
}
