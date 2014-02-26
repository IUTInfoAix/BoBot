package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class SalutCell implements SmartCell {

	@Override
	public String ask(String question) {
		if(question.contains("Salut")) 
			return "Salut à toi !";
		return null;
	}

}
