package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {

    public void loginDetails(){
        //Type E|mail
        typeText(By.className("email"),email);
        //Type Password
        typeText(By.className("password"),loadProrp.getProperty("password"));
        //Click on Login button
        clickOnElement(By.xpath("//div/button[@Class='button-1 login-button']"));
    }
}
