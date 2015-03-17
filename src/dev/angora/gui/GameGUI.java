package dev.angora.gui;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameGUI extends JPanel implements ActionListener {

    public Button drawCard = new Button("Draw Card");
    BufferedImage image;
    
    public GameGUI() {
        drawCard.addActionListener(this);
        add(drawCard);
    }

	@Override
	public void actionPerformed(ActionEvent event) {

		Object cause = event.getSource();

		if (cause == drawCard) {
			System.out.println("Ay");
		}
	}
    

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        
        Image img; 
        try 
        {
        img = ImageIO.read(getClass().getResource("/dev/angora/images/plains/Cheetah.png"));
        g.drawImage(img, 0, 0, 450, 700, this);
        } 
        catch (IOException e) 
        {
        e.printStackTrace();
        }
    }
}