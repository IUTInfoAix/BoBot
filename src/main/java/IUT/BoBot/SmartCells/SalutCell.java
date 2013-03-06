package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

/**
 * Reply to Salut.
 *
 */
public class SalutCell implements SmartCell{
	
	public String ask(String question) {
		
		if(question.contains("salut"))
		  return "salut";
		else
		  return null;
	}

}
