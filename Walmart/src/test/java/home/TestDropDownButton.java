package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestDropDownButton extends CommonAPI {
    @Test
    public void TestToSeeIfTestDropDownButtonWorksSuccessfully() throws InterruptedException {
       driver.findElement(By.cssSelector("#global-search-dropdown-toggle > span > span.g_a.g_f")).click();
       Thread.sleep(2000);

    }
}
