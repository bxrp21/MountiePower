import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestGGPowerJuiceFactory {

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
	public void testGGPowerJuiceFactory() {
		GGPowerJuiceFactory factory = new GGPowerJuiceFactory();
		assertEquals(new Can(new GGPowerJuice()), factory.buildCan(new GGPowerJuice()));
		assertEquals(new SixPack(new GGPowerJuice()), factory.buildSixPack(new GGPowerJuice()));
		assertEquals(new MountiePowerPack(new GGPowerJuice()), factory.buildMountiePowerPack(new GGPowerJuice()));
	}

}
