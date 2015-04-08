package dev.angora.main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import dev.angora.gui.GameGUI;
import dev.angora.sound.GameSound;

public class Main {
	
    public static JFrame p = new JFrame("Angora Realms");
  
    public static GameGUI g = new GameGUI();
    
    public static boolean onMenu = true;
	
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
        g.getImages();
        g.repaint();
        g.panel = false;
        p.setLocationRelativeTo(null);
        p.setResizable(true);
        p.setVisible(true);
        GameSound.startSoundLoop("Title.wav");
     
    }

} 
