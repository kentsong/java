package com.kent.utils.image;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResize {


	public static void main(String[] args) {

		try {
			BufferedImage originalImage = ImageIO.read(new File("E:\\ori.jpg"));

			BufferedImage resizeImageJpg = resizeImageByWidth(originalImage, 85);
			ImageIO.write(resizeImageJpg, "jpg", new File("E:\\new.jpg"));

			BufferedImage resizeImagePng = resizeImageByWidth(originalImage, 200);
			ImageIO.write(resizeImagePng, "png", new File("E:\\new.png"));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	private static BufferedImage resizeImageByWidth(BufferedImage originalImage, int imgWidth) {
		
		Double d = new Double(imgWidth) / originalImage.getWidth();
		int imgHeight = (int) (originalImage.getHeight() * d);
		
		int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
		BufferedImage resizedImage = new BufferedImage(imgWidth, imgHeight, type);
		Graphics2D g = resizedImage.createGraphics();
		System.out.println("imgWidth = " + imgWidth +", imgHeight = "+ imgHeight);
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
		System.out.println("imgWidth = " + imgWidth +", imgHeight = "+ imgHeight);
		g.drawImage(originalImage, 0, 0, imgWidth, imgHeight, null);
		g.dispose();

		return resizedImage;
	}
	
	private static BufferedImage resizeImage(BufferedImage originalImage, int imgHeight, int imgWidth) {
		
		int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
		BufferedImage resizedImage = new BufferedImage(imgWidth, imgHeight, type);
		Graphics2D g = resizedImage.createGraphics();
		System.out.println("imgWidth = " + imgWidth +", imgHeight = "+ imgHeight);
		g.drawImage(originalImage, 0, 0, imgWidth, imgHeight, null);
		g.dispose();

		return resizedImage;
	}



	
}