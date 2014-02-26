package IUT.BoBot.SmartCells;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by w12005501 on 26/02/14.
 */
public class SalutCellTest {
    SalutCell cell = new SalutCell();

    @Test
    public void testSalut() {
        assertEquals("Salut!", cell.ask("Salut"));
    }

    @Test
    public void testNotSalut() {
        assertEquals(null, cell.ask("au revoir"));
    }


}
