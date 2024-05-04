package org.example;

import org.openqa.selenium.By;

public class Electronics extends Utils {
    public void clickOnCameraAndPhoto ()
    {
        //Click on Camera & photo option
        clickOnElement(By.xpath("//a[@title='Show products in category Camera & photo'][normalize-space()='Camera & photo']"));
    }
}
