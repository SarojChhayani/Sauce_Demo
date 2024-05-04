package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    //static String expectedMsg = "Your registration completed";
     String expectedMsg = loadProrp.getProperty("ExpectedRegMeg");
public void userRegisteredSuccessfully(){
    //Verify correct registration message displayed
    Assert.assertEquals(getTextFromElement(By.className("result")),expectedMsg,"You're not Register");
    //Click on Continue button
    clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a"));
}
}

