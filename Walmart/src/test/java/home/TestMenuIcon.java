package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestMenuIcon extends CommonAPI {
    @Test
    public void TestToSeeIfTestMenuIconWorksSuccessfully() throws InterruptedException {
      driver.findElement(By.cssSelector("#vh-header > div > div.e_a.ak_a > button > span > span")).click();
      Thread.sleep(2000);

    }
}
