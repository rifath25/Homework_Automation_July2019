package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestBrandIcon extends CommonAPI {
    @Test
    public void TestToSeeIfBrandIconWorksSuccessfully() throws InterruptedException {
        driver.findElement(By.cssSelector("#modalDialog > button > svg > path")).click();
        driver.findElement(By.cssSelector("#topnav_menu2_trigger > div > div.css-1ljtfew")).click();
        Thread.sleep(2000);

    }
}