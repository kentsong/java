package com.symphox.batch.fetch;

import java.io.File;
import java.io.FileFilter;

import org.apache.commons.io.filefilter.RegexFileFilter;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
//        File f = new File("D:/A");
//        if (f.mkdir()) {
//            System.out.println("建立成功");
//        } else {
//            System.out.println("建立失敗");
//        }
		
		
//		 File dir = new File("D:/test/");
//		 FileFilter fileFilter = new RegexFileFilter(".+[cC][sS][vV]$");
//		 File[] files = dir.listFiles(fileFilter);
//		 for (int i = 0; i < files.length; i++) {
//		   System.out.println(files[i]);
//		 }
		
		String str = "D:/test/dfgfdgfd0M.CSV";
		System.out.println(new File(str).getName());
		
		
	}
}
