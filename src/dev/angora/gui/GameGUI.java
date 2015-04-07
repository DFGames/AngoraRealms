package dev.angora.gui;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import dev.angora.card.Cards;
import dev.angora.listener.ClickListener;
import dev.angora.main.Main;

	public class GameGUI extends JPanel {

	public static Image cardImage;
	public Button drawCard = new Button("Draw Card");

	public GameGUI() {

		Main.p.addMouseListener(new ClickListener());
		
	}

	public void drawCards() {

			System.out.println("Ay");
			Cards c = new Cards();
			cardImage = c.getImage();
			repaint();
			
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.drawImage(cardImage,0,0, ((Main.width/3) - 15), Main.height - ((Main.height/10 + 35)), this);
		
	}
}