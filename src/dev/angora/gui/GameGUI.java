package dev.angora.gui;

import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import dev.angora.card.Cards;
import dev.angora.listener.ClickListener;
import dev.angora.listener.PlayerKeyListener;
import dev.angora.main.Main;
import dev.angora.sound.GameSound;
import dev.angora.stats.Gold;

	@SuppressWarnings("serial")
	public class GameGUI extends JPanel {

	public boolean panel = false;
		
	public Image cardImage;
	public Image title;
	public Image guiPanel;
	
	public Button drawCard = new Button("Draw Card");

	public GameGUI() {

		Main.p.addMouseListener(new ClickListener());
		Main.p.addKeyListener(new PlayerKeyListener());
		
	}

	public void drawCards() {

			Cards c = new Cards();
			cardImage = c.getImage();
			repaint();	
			GameSound.playSound("Rustle.wav");
	}
	
	public void guiRepaint() {
		
		repaint();
		
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		g.drawImage(title, 0, 0, ((Main.width/3) - 15), Main.height - ((Main.height/10 + 35)), this);
		g.drawImage(cardImage,0,0, ((Main.width/3) - 15), Main.height - ((Main.height/10 + 35)), this);	
		
		if (panel == true) {
			Font papyrus1 = new Font("Papyrus", Font.BOLD, Main.width/48);
			Font papyrus2 = new Font("Papyrus", Font.BOLD, Main.width/64);
			g.drawImage(guiPanel, 0, 0, ((Main.width/4) - 15), Main.height - ((Main.height/10 + 35)), this);
			g.fillRect(0, (int) (Main.height/10), (Main.width/4) - 15, 10);
			g.setFont(papyrus1);
			g.drawString("Stats/Inventory", (Main.width/32), (int) (Main.height/13.5));
			g.setFont(papyrus2);
			g.drawString("Gold:" + Gold.totalGold, Main.width/32, Main.height/6);
		}
		
	}
	
	public void getImages() {

		try {
			title = ImageIO.read(getClass().getResource("/dev/angora/images/game/Title.png"));
			guiPanel = ImageIO.read(getClass().getResource("/dev/angora/images/game/Panel.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
		
}