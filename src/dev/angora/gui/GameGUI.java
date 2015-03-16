package dev.angora.gui;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class GameGUI extends JFrame implements ActionListener {
	
	public Button drawCard = new Button("Draw Card");
	
	public void createGui(JFrame p) {
		
		drawCard.addActionListener(this);
		drawCard.setBounds(20,30,80,30);
		p.add(drawCard);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		Object cause = event.getSource();
		
		if (cause == drawCard) {
		System.out.println("Ay");
		
		}
	}
	
}
