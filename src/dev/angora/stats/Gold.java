package dev.angora.stats;

import dev.angora.card.Cards;

public class Gold {
	
	public static int totalGold = 0;

	public static void getEncounterGold() {
		
	if (Cards.card != null) {
		if (Cards.card.equals("Cheetah")) { totalGold += 4; }
		if (Cards.card.equals("Hyena")) { totalGold += 6; }
		if (Cards.card.equals("Lion")) { totalGold += 8; }
		if (Cards.card.equals("Rhino")) { totalGold += 12; }
		if (Cards.card.equals("SnakePit")) { totalGold += 5; }
		}
	
	}
	
}
