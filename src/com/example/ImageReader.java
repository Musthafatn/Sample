package com.example;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.net.URL;
import java.util.Base64;

import javax.imageio.ImageIO;

public class ImageReader {

	public static void main(final String[] args) {
		String base64Image;
		byte[] imageBytes;
		URL imageUrl;
		BufferedImage image;
		String url = "https://ichef.bbci.co.uk/news/976/cpsprodpb/D750/production/_118702155_mediaitem118702154.jpg";
		try {
			if (url.isEmpty()) {
				throw new Exception("Empty url");
			}
			url = url.trim();
			if (url.indexOf('d') == 0) {
				base64Image = url.split(",")[1];
				imageBytes = Base64.getDecoder().decode(base64Image);
				image = ImageIO.read(new ByteArrayInputStream(imageBytes));
			} else {
				imageUrl = new URL(url);
				image = ImageIO.read(imageUrl);
			}
			final File imageDirectory = new File("images");
			if (!imageDirectory.exists()) {
				imageDirectory.mkdirs();
			}
			ImageIO.write(image, "jpg", new File("images/image.jpg"));
			System.out.println("success");
		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
