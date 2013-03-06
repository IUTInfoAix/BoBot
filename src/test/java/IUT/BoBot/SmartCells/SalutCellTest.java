package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalutCellTest {

	SalutCell cell = new SalutCell();

	@Test
	public void testSalut() {
		assertEquals("Salut!", cell.ask("Salut"));
	}
	
	


}
