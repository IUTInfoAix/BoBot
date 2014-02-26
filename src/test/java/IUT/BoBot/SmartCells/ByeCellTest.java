package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class ByeCellTest {

	ByeCell cell = new ByeCell();
	
	@Test
	public void test() {
		assertEquals("Au revoir !", cell.ask("Au revoir"));
	}

}
