package com.kentsong.java.file.compression;

import java.io.File;

public class Client {

	public static void main(String[] args) {
		
		File dir = new File("/Users/Kent/Desktop/sh");
		System.out.println("is dir exists:" + dir.isDirectory());
		File dir2 = new File("/Users/Kent/Desktop/sh2");
		System.out.println("is dir2 exists:" + dir2.exists());
		
		
		File[] files = dir.listFiles();
		System.out.println("files length:" + files.length);
		
		
		
	}

	
}
