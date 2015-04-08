package dev.angora.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import dev.angora.gui.GameGUI;
import dev.angora.main.Main;

public class ClickListener extends MouseAdapter {

	public void mousePressed(MouseEvent e){

		Main.g.drawCards();
		
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
