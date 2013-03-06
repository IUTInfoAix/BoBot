package IUT.BoBot.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SalutCellTest {

	SalutCell cell = new SalutCell();

	@Test
	public void testBonjour() {
		assertEquals("salut", cell.ask("salut"));
	}
	
	@Test
	public void testNotBonjour() {
		assertEquals(null, cell.ask("4chan"));
	}
}
