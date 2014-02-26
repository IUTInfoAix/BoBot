package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

/**
 * Created by w12005501 on 26/02/14.
 */
public class SalutCell implements SmartCell {
    public String ask(String question) {
        if(question.contains("Salut"))
            return "Salut!";
        else
            return null;
    }
}
