import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestPackage.class, TestProduct.class, TestGGPowerJuiceFactory.class })
public class AllTests {

}
