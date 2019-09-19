package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSellOption extends CommonAPI {
    @Test
    public void TestToSeeIfSellOptionWorksSuccessfully(){
        driver.findElement(By.cssSelector("#gh-p-2 > a")).click();
    }
}
