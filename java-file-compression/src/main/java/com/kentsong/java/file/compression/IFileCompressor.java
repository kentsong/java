package com.kentsong.java.file.compression;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

public interface IFileCompressor {
	/**
	 * @param files the files need to be compressed
	 * 
	 * @exception FileNotFoundException 
     * 		if the file exists but is a directory rather than a regular file, 
     *      does not exist but cannot be created, or cannot be opened for any other reason.
	 * @exception IOException
	 */
	public File compress(String zipFilePath, Collection<File> files);
	
	/**
	 * @param compressedFile the compressed file with param files
	 * @param files	the files need to be compressed
	 * 
	 * @exception FileNotFoundException 
	 * 		if the file exists but is a directory rather than a regular file, 
     *      does not exist but cannot be created, or cannot be opened for any other reason.
     * @exception IOException
	 */
	public File compress(String zipFilePath, Collection<File> files, String password);
	
}
