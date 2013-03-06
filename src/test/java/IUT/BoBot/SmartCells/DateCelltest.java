package IUT.BoBot.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateCelltest {
	DateCell date = new DateCell();
	
	@Test
	public void testDateOk (){
		assertEquals("Mercredi 6 Mars 2013", date.ask("Quelle date sommes-nous?"));
	}
	
	@Test
	public void testDateErr(){
		assertEquals(null, date.ask("Quelle date avons-nous?"));
	}

}
