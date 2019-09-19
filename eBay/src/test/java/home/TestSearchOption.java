package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSearchOption extends CommonAPI{
    @Test
    public void TestToSeeiIfSerarchOptionWorksSuccessfully(){
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("iPhone");
        driver.findElement(By.cssSelector("#gh-ac")).click();


    }
}
