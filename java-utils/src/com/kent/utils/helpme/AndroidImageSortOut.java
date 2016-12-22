package com.kent.utils.helpme;
import java.io.File;

public class AndroidImageSortOut {
	
	private static String dir_path = "/Users/Kent/Documents/all_pic";
	
	public static void main(String[] args){
		
		
		File currDir = new File(dir_path);
		if(currDir == null || !currDir.isDirectory()){
			System.out.println("查無目錄 path = " + dir_path);
			return;
		}
		System.out.println("dir path = "+dir_path + " & isDirectory = "+currDir.isDirectory());
		
		File dirHdpi = new File(dir_path + "/mipmap-hdpi");
		File dirXHdpi = new File(dir_path + "/mipmap-xhdpi");
		File dirXXHdpi = new File(dir_path + "/mipmap-xxhdpi");
		dirHdpi.mkdir();
		dirXHdpi.mkdir();
		dirXXHdpi.mkdir();
		
		for(File file : currDir.listFiles()){
			System.out.println(file.getName());
			if(file.isDirectory()){
				continue;
			}
			
			if(file.getName().contains("@3x")){
				System.out.println("do move 3x!");
				file.renameTo(new File(dirXXHdpi.getPath() +"/"+file.getName().replaceAll(" ", "_").replaceAll("@3x", "")));
			}
			else if(file.getName().contains("@2x")){
				System.out.println("do move 2x!");
				file.renameTo(new File(dirXHdpi.getPath() +"/"+file.getName().replaceAll(" ", "_").replaceAll("@2x", "")));
			}else{
				System.out.println("do move 1x!");
				file.renameTo(new File(dirHdpi.getPath() +"/"+file.getName().replaceAll(" ", "_")));
			}
			
		}
		
		
	}

}
