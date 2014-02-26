package IUT.BoBot.SmartCells;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ByeCellTest {
	
	ByeCell cell = new ByeCell();

	@Test
	public void testBonjour() {
		assertEquals("Au revoir !", cell.ask("Au revoir"));
	}
	
	@Test
	public void testNotBye() {
		assertEquals(null, cell.ask("Bonjour"));
	}

}
