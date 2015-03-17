package dev.angora.gui;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import dev.angora.card.Cards;
import dev.angora.main.Main;

@SuppressWarnings("serial")
public class GameGUI extends JPanel implements ActionListener {

	public Image cardImage;
	
    public Button drawCard = new Button("Draw Card");
    
    public GameGUI() {
        drawCard.addActionListener(this);
        drawCard.setLocation(145, 500);
        add(drawCard);
    }

	@Override
	public void actionPerformed(ActionEvent event) {

		Object cause = event.getSource();

		if (cause == drawCard) {
			System.out.println("Ay");
			Cards c = new Cards();
			cardImage = c.getImage();
			repaint();
		}
	}
    

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(cardImage, 0, 0, 450, 700, this);
    }
}