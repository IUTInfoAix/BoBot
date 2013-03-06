package IUT.BoBot.SmartCells;

import java.util.Calendar;

import IUT.BoBot.SmartCell;

public class TodayCell implements SmartCell {
	
	Calendar calendar;
	
	private String[] weekDays = new String[] { 
			"Dimanche", "Lundi", "Mardi", "Mercredi",
			"Jeudi", "Vendredi", "Samedi" 
			};
	
	private String[] month = new String[] {
			"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre",
			"octobre", "novembre", "decembre"}; 

	/**
	 * Initialize the cell with the date of today.
	 */
	public TodayCell() {
		this.calendar = Calendar.getInstance();
	}

	public TodayCell(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public String ask(String question) {
		if(!question.contains("Quel jour"))
			return null;
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int mois = calendar.get(Calendar.MONTH);
		int annee = calendar.get(Calendar.YEAR);
		
		return (weekDays[dayOfWeek - 1] +' ' + day + ' ' +  month[mois] + ' ' + annee);
	}
	




}
