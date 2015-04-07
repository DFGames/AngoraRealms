package dev.angora.main;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dev.angora.gui.GameGUI;

public class Main {
	
    public static JFrame p = new JFrame("Angora Realms");
    
    public static GameGUI g = new GameGUI();
	
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
    public static int width = (int) screenSize.getWidth();
    public static int height = (int) screenSize.getHeight();
    
	public static void main (String[] args) {
		
		Main m = new Main();
		m.createScreen();
		
	}
	
    public void createScreen() {
    	
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setSize((width/3), height - (height/10));
        p.add(g);
        p.setLocationRelativeTo(null);
        p.setResizable(true);
        p.setVisible(true);
     
    }

} 
