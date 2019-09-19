package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestDropDownMenu extends CommonAPI {
    @Test
    public void testToSeeIfTheDropdownMenuMfAllCategoriesOptionIsClickable(){
        driver.findElement(By.cssSelector("#showByDepartmentCaret")).click();
    }
}
