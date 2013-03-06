package IUT.BoBot.SmartCells;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class YesterdayCellTest {

	// Tests should not depend on the current date.
	// So initialize the TodayCell with a fixed date.
	Calendar calendar = Calendar.getInstance();
	YesterdayCell cell = new YesterdayCell(calendar);
	
	@Before
	public void setUp() {
		calendar.set(2013, 2, 8);
	}
	
	@Test
	public void testToday() { 
		assertEquals("Jeudi 7 mars 2013", cell.ask("Quel jour hier est-il?"));
	}
	
	@Test
	public void testNotToday() {
		assertEquals(null, cell.ask("Quel ours hier jette-il?"));
	}
}
