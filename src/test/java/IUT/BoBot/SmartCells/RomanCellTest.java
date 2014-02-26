package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class RomanCellTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@Test
	public void test_1() {
		RomanCell a = new RomanCell();
		assertEquals(1, a.decode("I"));
	}

	@Test
	public void test_5() {
		RomanCell a = new RomanCell();
		assertEquals(5, a.decode("V"));
	}

	@Test
	public void test_10() {
		RomanCell a = new RomanCell();
		assertEquals(10, a.decode("X"));
	}

	@Test
	public void test_50() {
		RomanCell a = new RomanCell();
		assertEquals(50, a.decode("L"));
	}

	@Test
	public void test_100() {
		RomanCell a = new RomanCell();
		assertEquals(100, a.decode("C"));
	}

	@Test
	public void test_500() {
		RomanCell a = new RomanCell();
		assertEquals(500, a.decode("D"));
	}

	@Test
	public void test_1000() {
		RomanCell a = new RomanCell();
		assertEquals(1000, a.decode("M"));
	}

	@Test
	public void test_25() {
		RomanCell a = new RomanCell();
		assertEquals(25, a.decode("XXV"));
	}

	@Test
	public void test_666() {
		RomanCell a = new RomanCell();
		assertEquals(666, a.decode("DCLXVI"));
	}

	@Test
	public void test_14() {
		RomanCell a = new RomanCell();
		assertEquals(14, a.decode("XIV"));
	}

	@Test
	public void test_99() {
		RomanCell a = new RomanCell();
		assertEquals(99, a.decode("XCIX"));
	}

	@Test
	public void test_458() {
		RomanCell a = new RomanCell();
		assertEquals(458, a.decode("CDLVIII"));
	}

	@Test
	public void test_552() {
		RomanCell a = new RomanCell();
		assertEquals(552, a.decode("DLII"));
	}

	@Test
	public void test_69() {
		RomanCell a = new RomanCell();
		assertEquals(69, a.decode("LXIX"));
	}

	@Test
	public void test_2751() {
		RomanCell a = new RomanCell();
		assertEquals(2751, a.decode("MMDCCLI"));
	}

	@Test
	public void test_1998() {
		RomanCell a = new RomanCell();
		assertEquals(1998, a.decode("MCMXCVIII"));
	}

	@Test
	public void test_4() {
		RomanCell a = new RomanCell();
		assertEquals(4, a.decode("IV"));
	}

	@Test
	public void test_369() {
		RomanCell a = new RomanCell();
		assertEquals(369, a.decode("CCCLXIX"));
	}

	@Test(expected = ArithmeticException.class)
	public void test_azerty() {
		RomanCell a = new RomanCell();
		a.decode("AZERTY");
	}
}
