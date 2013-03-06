package IUT.BoBot.SmartCells;
import static org.junit.Assert.*;

import org.junit.Test;

public class AurevoirCellTest {
	AurevoirCell cell = new AurevoirCell();

	@Test
	public void testAurevoir() {
		assertEquals("au revoir!", cell.ask("au revoir"));
	}
	
	@Test
	public void testNotBonjour() {
		assertEquals(null, cell.ask("adieu"));
	}
}
