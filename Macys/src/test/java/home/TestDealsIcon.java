package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestDealsIcon extends CommonAPI {
    @Test
    public void testToSeeIfStoresIconIsClickable(){
        driver.findElement(By.cssSelector("#link-rail > div > div > div.redesign-header-links-col.redesign-header-links-col-left.text-left.clearfix > nav > ul > li:nth-child(2) > a")).click();
    }
}
