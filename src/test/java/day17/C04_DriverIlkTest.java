package day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {
    // testbase class'ina extend ederek kullandigimiz driver yerine artik
    // Driver class'indan kullanacagimiz getDriver() static methodunu kullaniriz
    @Test
    public void test1() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://hepsiburada.com");
        Driver.closeDriver();
    }
}
