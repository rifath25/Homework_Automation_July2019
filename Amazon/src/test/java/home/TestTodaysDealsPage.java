package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestTodaysDealsPage extends CommonAPI {
    @Test
    public void TestToSeeiIfTestTodaysDealsPageWorksSuccessfully(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
    }
}
