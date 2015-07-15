package com.kentsong.java.file.compression.zip;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ZipCompressionTest {

	@Test
	public void test() {
		List<File> fileList = new ArrayList<File>();
		fileList.add(new File("src/test/java/com/kentsong/java/file/compression/zip/source/demo.txt"));
		
		ZipFileCompressor zipFileCompressor = new ZipFileCompressor();
		zipFileCompressor.compress("src/test/java/com/kentsong/java/file/compression/zip/target/demo.zip", fileList);
		zipFileCompressor.compress("src/test/java/com/kentsong/java/file/compression/zip/target/demoWithPwd.zip", fileList, "passwd");
	}

}
