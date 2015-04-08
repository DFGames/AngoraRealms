package dev.angora.gui;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import dev.angora.card.Cards;
import dev.angora.listener.ClickListener;
import dev.angora.main.Main;

	public class GameGUI extends JPanel {

	public static Image cardImage;
	Image title = getTitleImage();
	
	public Button drawCard = new Button("Draw Card");


	public GameGUI() {

		Main.p.addMouseListener(new ClickListener());
		
	}

	public void drawCards() {

			Cards c = new Cards();
			cardImage = c.getImage();
			repaint();			
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.drawImage(title, 0, 0, ((Main.width/3) - 15), Main.height - ((Main.height/10 + 35)), this);
		g.drawImage(cardImage,0,0, ((Main.width/3) - 15), Main.height - ((Main.height/10 + 35)), this);	
	}
	
	public Image getTitleImage() {

		Image img = null;

		try {
			img = ImageIO.read(getClass().getResource(
					"/dev/angora/images/game/Title.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(img);

		return img;

	}
}