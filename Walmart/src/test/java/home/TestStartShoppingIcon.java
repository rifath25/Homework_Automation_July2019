package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestStartShoppingIcon extends CommonAPI {
    @Test
    public void TestToSeeIfTestStartShoppingIconWorksSuccessfully() throws InterruptedException {
        driver.findElement(By.cssSelector("body > div.js-content > div > div > div.js-body-content.page-content-wrapper > div > div > div:nth-child(1) > div:nth-child(3) > div > div.CustomerConnection-StoreTile.Grid-col.u-size-1-1-xs.u-size-1-3-m > div > div.CCTileStore-aside--right.text-left.display-inline-block > div.CCTileStore-put > a")).click();
        Thread.sleep(2000);

    }
}