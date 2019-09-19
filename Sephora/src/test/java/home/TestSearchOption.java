package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearchOption extends CommonAPI {
    @Test
    public void TestToSeeIfSerarchOptionWorksSuccessfully() {
        driver.findElement(By.cssSelector("#modalDialog > button > svg > path")).click();
       driver.findElement(By.xpath("//*[@id=\"site_search_input\"]")).sendKeys("skin care",Keys.ENTER);

    }
}