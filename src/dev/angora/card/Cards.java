package dev.angora.card;

import java.awt.Image;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Cards {

	Random random = new Random();
	
	public String getCard() {
		
		String card = null;
		String[] possibleCards = new String[] {"Cheetah", "Lion"};
		
		card = possibleCards[random.nextInt(2)];
		System.out.println(card);
	
		return card;
		
	}
	
	public Image getImage() {

		Image img = null;
		
		Cards c = new Cards();

		try {
			img = ImageIO.read(getClass().getResource("/dev/angora/images/plains/" + c.getCard() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return img;
	}
	
}
