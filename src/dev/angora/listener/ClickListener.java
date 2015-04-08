package dev.angora.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import dev.angora.main.Main;
import dev.angora.sound.GameSound;
import dev.angora.stats.Gold;

public class ClickListener extends MouseAdapter {
	
	public void mousePressed(MouseEvent e){

		Gold.getEncounterGold();
		Main.g.drawCards();
		
		if (Main.onMenu == true) {
			GameSound.startSoundLoop("Plains.wav");
			Main.onMenu = false;
		}
		
    }
    public void mouseClicked(MouseEvent e) {

    }
    public void mouseEntered(MouseEvent e) {

    }
    public void mouseExited(MouseEvent e) {

    }
    public void mouseReleased(MouseEvent e) {

    }

}
