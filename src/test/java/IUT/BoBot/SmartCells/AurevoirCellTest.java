package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class AurevoirCellTest {
	
	AurevoirCell cell = new AurevoirCell();
	
	@Test
	public void test() {
		assertEquals("Aurevoir!", cell.ask("Aurevoir"));
	}

}
