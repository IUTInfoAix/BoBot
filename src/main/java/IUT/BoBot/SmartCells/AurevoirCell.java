package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class AurevoirCell implements SmartCell {
	public String ask(String question) {
		if(question.contains("Aurevoir"))
		  return "Aurevoir!";
		else
		  return null;
	}
}
