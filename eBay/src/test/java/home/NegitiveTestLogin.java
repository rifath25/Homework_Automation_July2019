package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NegitiveTestLogin extends CommonAPI {
    @Test
    public void testUserShouldNotBeAbleToSignInSuccessfully() throws InterruptedException {
            driver.findElement(By.cssSelector("#gh-ug > a")).click();
            driver.findElement(By.cssSelector("#userid")).sendKeys("abc12");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#pass")).sendKeys("abc123");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#sgnBt")).click();

        }

}
