package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class TomorrowTestCell {

	// Tests should not depend on the current date.
		// So initialize the TodayCell with a fixed date.
		Calendar calendar = Calendar.getInstance();
		TomorrowCell cell = new TomorrowCell(calendar);
		
		@Before
		public void setUp() {
			calendar.set(2013, 2, 8);
		}
		
		@Test
		public void testToday() { 
			assertEquals("Samedi 9 mars 2013", cell.ask("Quel jour demain est-il?"));
		}
		
		@Test
		public void testNotToday() {
			assertEquals(null, cell.ask("Quel ours demain jette-il?"));
		}

}
