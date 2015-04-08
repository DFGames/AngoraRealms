package dev.angora.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import dev.angora.main.Main;
import dev.angora.sound.GameSound;
import dev.angora.stats.Gold;

public class PlayerKeyListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		
		 if (e.getKeyChar()=='i') {
			
			if (Main.g.panel != true) {
				Main.g.panel = true;
				GameSound.playSound("Open.wav");
			}
			else {
				Main.g.panel = false;
				GameSound.playSound("Close.wav");
			}	
			Main.g.guiRepaint();	
		 }
		 
		 if (e.getKeyChar()==(KeyEvent.VK_ESCAPE)) {		 
			 System.exit(0);
		 }
		 
		 if (e.getKeyChar()==(KeyEvent.VK_SPACE)) { 
			Gold.getEncounterGold();
			Main.g.drawCards();
		 }
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
