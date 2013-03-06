package IUT.BoBot.SmartCells;
import java.util.Calendar;
import java.util.GregorianCalendar;

import IUT.BoBot.SmartCell;

public class DateCell implements SmartCell {

	public String ask(String question) {
		GregorianCalendar greg = new GregorianCalendar();
		if(!question.contains("Quelle date sommes"))
			return null;
		
		
		int dayOfWeek = greg.get(Calendar.DAY_OF_WEEK);
		int MonthofYear = greg.get(Calendar.MONTH);
		int Day = greg.get(Calendar.DAY_OF_MONTH);
		int Year = greg.get(Calendar.YEAR);
				
		String str = weekDays[dayOfWeek - 1] + " " +Day +
				" "+ weekMouth[MonthofYear]+" "+Year;

		return str;
	}	
	private String[] weekDays = new String[] { 
			"Dimanche", "Lundi", "Mardi", "Mercredi",
			"Jeudi", "Vendredi", "Samedi" 
			};
	private String[] weekMouth = new String[] { 
			"Janvier", "Février", "Mars", "Avril",
			"Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Décembre" 
			};
	
	

}
