package day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C01_DependsOnMethods extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1() {
        driver.get("https://amazon.com");
    }
    @Test (dependsOnMethods = "test1")
    public void test2() {
        driver.get("http://www.facebook.com");
    }
    @Test (dependsOnMethods = "test2")
    public void test3() {
        driver.get("http://www.bestbuy.com");
    }
    @Test (priority = -1)
    public void test4() {
        driver.get("http://www.youtube.com");
    }

}
