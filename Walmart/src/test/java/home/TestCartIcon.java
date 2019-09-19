package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCartIcon extends CommonAPI {
    @Test
    public void TestToSeeIfTestCartIconWorksSuccessfully() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"header-bubble-links\"]/div[4]/a/span/span/span[2]")).click();
        Thread.sleep(1000);

    }
}
