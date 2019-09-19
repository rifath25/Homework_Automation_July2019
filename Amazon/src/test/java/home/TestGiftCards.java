package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestGiftCards extends CommonAPI {
    @Test
    public void TestToSeeiIfGiftCardsOptionWorksSuccessfully(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();
    }
}
