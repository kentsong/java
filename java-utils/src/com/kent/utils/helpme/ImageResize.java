package com.kent.utils.helpme;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class ImageResize {

	private static String PATH_TARGET_DIR = "/Users/Kent/Documents/resize_pic";
	private static String PATH_HDPI_DIR = "/Users/Kent/linkwish_project/android/TurnCloud/app/src/main/res/mipmap-hdpi";
	private static String PATH_XHDPI_DIR = "/Users/Kent/linkwish_project/android/TurnCloud/app/src/main/res/mipmap-xhdpi";
	private static String PATH_XXHDPI_DIR = "/Users/Kent/linkwish_project/android/TurnCloud/app/src/main/res/mipmap-xxhdpi";

	public static void main(String[] args) {

		List<ItemW> list = new ArrayList();
		list.add(new ItemW("img_splash_logo.png", 376, 376, 376));
		list.add(new ItemW("logo.png", 200, 400, 600));

		for (ItemW item : list) {
			try {
				BufferedImage originalImage = ImageIO.read(new File(PATH_TARGET_DIR, item.fileName));

				BufferedImage resizeImage1 = resizeImageByWidth(originalImage, item.width1);
				ImageIO.write(resizeImage1, "png", new File(PATH_HDPI_DIR, item.fileName));

				BufferedImage resizeImage2 = resizeImageByWidth(originalImage, item.width2);
				ImageIO.write(resizeImage2, "png", new File(PATH_XHDPI_DIR, item.fileName));

				BufferedImage resizeImage3 = resizeImageByWidth(originalImage, item.width3);
				ImageIO.write(resizeImage3, "png", new File(PATH_XXHDPI_DIR, item.fileName));
				
				System.out.println("圖片： "+item.fileName + " resize done.");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	private static BufferedImage resizeImageByWidth(BufferedImage originalImage, int imgWidth) {

		Double d = new Double(imgWidth) / originalImage.getWidth();
		int imgHeight = (int) (originalImage.getHeight() * d);

		int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
		BufferedImage resizedImage = new BufferedImage(imgWidth, imgHeight, type);
		Graphics2D g = resizedImage.createGraphics();
		System.out.println("imgWidth = " + imgWidth + ", imgHeight = " + imgHeight);
		g.drawImage(originalImage, 0, 0, imgWidth, imgHeight, null);
		g.dispose();

		return resizedImage;
	}

	private static BufferedImage resizeImageByHeight(BufferedImage originalImage, int imgHeight) {

		Double d = new Double(imgHeight) / originalImage.getHeight();
		int imgWidth = (int) (originalImage.getWidth() * d);

		int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
		BufferedImage resizedImage = new BufferedImage(imgWidth, imgHeight, type);
		Graphics2D g = resizedImage.createGraphics();
		System.out.println("imgWidth = " + imgWidth + ", imgHeight = " + imgHeight);
		g.drawImage(originalImage, 0, 0, imgWidth, imgHeight, null);
		g.dispose();

		return resizedImage;
	}

	private static BufferedImage resizeImage(BufferedImage originalImage, int imgHeight, int imgWidth) {

		int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
		BufferedImage resizedImage = new BufferedImage(imgWidth, imgHeight, type);
		Graphics2D g = resizedImage.createGraphics();
		System.out.println("imgWidth = " + imgWidth + ", imgHeight = " + imgHeight);
		g.drawImage(originalImage, 0, 0, imgWidth, imgHeight, null);
		g.dispose();

		return resizedImage;
	}

	static class ItemW {
		public String fileName;
		public int width1;
		public int width2;
		public int width3;

		public ItemW(String fileName, int width1, int width2, int width3) {
			super();
			this.fileName = fileName;
			this.width1 = width1;
			this.width2 = width2;
			this.width3 = width3;
		}

	}

}
