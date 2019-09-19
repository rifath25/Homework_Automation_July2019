package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

   public static WebDriver driver=null;

   @Parameters({"url"})

    @BeforeMethod
    public void setUp(String url){
       System.setProperty("webdriver.chrome.driver","/Users/jerinrinika/IdeaProjects/HomeworkAutomationJuly2019/Generic/browser-driver/mac/chromedriver");
       driver=new ChromeDriver();
       driver.navigate().to(url);
       driver.manage().window().fullscreen();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

   }

   @AfterMethod
    public void cleanUp(){
       driver.close();

   }




}
