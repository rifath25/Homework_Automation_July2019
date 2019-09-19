package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSearchOption extends CommonAPI {
    @Test
    public void TestToSeeiIfSerarchOptionWorksSuccessfully(){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iPhone cases");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
    }
}
