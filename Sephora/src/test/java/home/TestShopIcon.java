package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestShopIcon extends CommonAPI {
    @Test
    public void TestToSeeIfShopIconWorksSuccessfully() throws InterruptedException {
        driver.findElement(By.cssSelector("#modalDialog > button > svg > path")).click();
        driver.findElement(By.cssSelector("#topnav_menu0_trigger > div > div.css-1ljtfew")).click();
        Thread.sleep(2000);

    }
}
