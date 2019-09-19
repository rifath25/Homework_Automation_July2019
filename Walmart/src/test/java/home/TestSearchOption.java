package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearchOption extends CommonAPI {
    @Test
    public void TestToSeeIfSerarchOptionWorksSuccessfully() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys("makeup");
        driver.findElement(By.cssSelector("#global-search-submit > span > span")).click();
        Thread.sleep(2000);

    }
}
