import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestProduct {
	private static double PJ_PRICE = 3.25;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGGPowerJuice() {
		GGPowerJuice pj = new GGPowerJuice();
		assertTrue(pj.getPrice() == PJ_PRICE);
	}

}
