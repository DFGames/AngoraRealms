package dev.angora.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import dev.angora.gui.GameGUI;

public class Launch extends JFrame {

	public static JFrame p = new JFrame("Angora Realms");
	
	public static void createScreen() {
			
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.pack();
		p.setSize(640, 800);
		p.setVisible(true);
		p.setLayout(null);
		
		GameGUI g = new GameGUI();
		g.createGui(p);
		
	}
	
}
