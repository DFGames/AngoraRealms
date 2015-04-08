package dev.angora.card;

import java.awt.Image;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Cards {

	Random random = new Random();
	
	public String getCard() {
		
		String card = null;
		String[] possibleCards = new String[] {"Cheetah", "Cheetah", "Cheetah", "Lion", "Lion", "Lion", "Hyena", "Hyena", "Hyena", "Rhino", "SnakePit", "SnakePit"};
		
		card = possibleCards[random.nextInt(12)];
	
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
