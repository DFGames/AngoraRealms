package dev.angora.main;

import java.awt.Container;

import javax.swing.JFrame;

import dev.angora.gui.GameGUI;

public class Main {
	
    public static JFrame p = new JFrame("Angora Realms");
	
	public static void main (String[] args) {
		
		Main.createScreen();
		
	}
	
    public static void createScreen() {

        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setSize(400,600);
        GameGUI g = new GameGUI();
        p.add(g);
        p.setLocationRelativeTo(null);
        p.setResizable(false);
        p.setVisible(true);
        
        

    }
} 
