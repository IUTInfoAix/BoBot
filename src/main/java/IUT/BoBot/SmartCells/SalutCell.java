package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class SalutCell implements SmartCell {
	/**
	 * Reply to Salut.
	 *
	 */
		
		public String ask(String question) {
			if(question.contains("Salut"))
			  return "Salut!";
			else
			  return null;
		}
}
