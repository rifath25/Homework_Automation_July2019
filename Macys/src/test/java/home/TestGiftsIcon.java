package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestGiftsIcon extends CommonAPI {
    @Test
    public void testToSeeIfStoresIconIsClickable(){
        driver.findElement(By.cssSelector("#giftsLink")).click();
    }
}
