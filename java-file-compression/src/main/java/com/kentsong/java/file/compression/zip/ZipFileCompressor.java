package com.kentsong.java.file.compression.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

import com.kentsong.java.file.compression.IFileCompressor;

import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.io.ZipOutputStream;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class ZipFileCompressor implements IFileCompressor {
	
	public File compress(String zipFilePath, Collection<File> files) {
		return compress(zipFilePath, files, "");
	}
	
	public File compress(String zipFilePath, Collection<File> files, String password) {
		final int BUFFER_SIZE = 4096;
		
		ZipOutputStream outputStream = null;
		InputStream inputStream = null;
		
		ZipParameters parameters = new ZipParameters();
		parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
		parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
		if(password != null && !password.equals("")) {
			parameters.setEncryptFiles(true);
			parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
			parameters.setPassword(password);
		}
		
		File zipFile = new File(zipFilePath);
		Iterator<File> fileIter = files.iterator();
		try {
			outputStream = new ZipOutputStream(new FileOutputStream(zipFile));
			
			while(fileIter.hasNext()) {
				File file = fileIter.next();
				outputStream.putNextEntry(file, parameters);
			
				// If this file is a directory, then no further processing is required
				if(file.isDirectory()) {
					outputStream.closeEntry();
					continue;
				}
			
				byte[] buffer = new byte[BUFFER_SIZE];
				int len = 0;
				inputStream = new FileInputStream(file);
				while((len = inputStream.read(buffer)) != -1)
					outputStream.write(buffer, 0, len);
			
				outputStream.closeEntry();
				inputStream.close();
			}
			
			outputStream.finish();
		} catch(ZipException e) {
			throw new RuntimeException(e);
		} catch(IOException e) {
			throw new RuntimeException(e);
		} finally {
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			
			if(inputStream != null) {
				try {
					inputStream.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return zipFile;
	}

}
