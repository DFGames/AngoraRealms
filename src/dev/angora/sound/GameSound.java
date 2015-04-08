package dev.angora.sound;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import dev.angora.main.Main;

public class GameSound {
	
	private static Clip activeClip;
	
	public static synchronized void playSound(final String url) {
		  new Thread(new Runnable() {
		  // The wrapper thread is unnecessary, unless it blocks on the
		  // Clip finishing; see comments.
		    public void run() {
		      try {
		        Clip clip = AudioSystem.getClip();
		        AudioInputStream inputStream = AudioSystem.getAudioInputStream(Main.class.getResourceAsStream("/dev/angora/sounds/" + url));
		        clip.open(inputStream);
		        clip.start(); 
		      } catch (Exception e) {
		        System.err.println(e.getMessage());
		      }
		    }
		  }).start();
		}  
	
	public static synchronized void startSoundLoop(String file) {
		 if (activeClip != null && activeClip.isRunning()) {
			 activeClip.stop();
		 }
		   
		try {
			Clip clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(Main.class.getResourceAsStream("/dev/angora/sounds/" + file));
			clip.open(inputStream);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			activeClip = clip;
			clip.start();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		 }
		}

}
