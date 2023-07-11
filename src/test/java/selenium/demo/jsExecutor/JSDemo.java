package selenium.demo.jsExecutor;

import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class JSDemo extends BaseTest {
    @Test
    void test(){
        driver.get("https://demoqa.com/frames");

    }
}
