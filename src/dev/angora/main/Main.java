package dev.angora.main;

import javax.swing.JFrame;

import dev.angora.gui.GameGUI;

public class Main {
	
	public static JFrame p = new JFrame("Angora Realms");
	
	public static void main (String[] args) {
		
		new Main();
		
	}
	
    public Main() {

        JFrame p = new JFrame("Angora Realms");
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameGUI g = new GameGUI();
        p.add(g);
        p.setLocationRelativeTo(null);
        p.pack();
        p.setVisible(true);

    }
} 
