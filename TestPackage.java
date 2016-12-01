import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPackage {
	final static float CAN_DISCOUNT = 1.0f;
	final static float SIXPACK_DISCOUNT = 0.9f;
	final static float MPP_DISCOUNT = 0.7f;
	
	final static int CAN_COUNT = 1;
	final static int SIXPACK_COUNT = 6;
	final static int MPP_COUNT = 24;
	
	final static double PJ_PRICE = 3.25;

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
	public void testCan() {
		Can can_pj = new Can(new GGPowerJuice());
		assertTrue(can_pj.getPrice() == PJ_PRICE*CAN_COUNT*CAN_DISCOUNT);
	}

	@Test
	public void testSixPack() {
		SixPack sp_pj = new SixPack(new GGPowerJuice());
		assertTrue(sp_pj.getPrice() == PJ_PRICE*SIXPACK_COUNT*SIXPACK_DISCOUNT);
	}

	@Test
	public void testMountiePowerPack() {
		MountiePowerPack mpp_pj = new MountiePowerPack(new GGPowerJuice());
		assertTrue(mpp_pj.getPrice() == PJ_PRICE*MPP_COUNT*MPP_DISCOUNT);
	}

}
