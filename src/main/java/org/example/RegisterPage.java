package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    LoadProrp loadProrp = new LoadProrp();
   public  void registrationDetails(){
       //Type First name
       typeText(By.id("FirstName"), loadProrp.getProperty("FirstName"));
       //Type Lastname
       typeText(By.name("LastName"),loadProrp.getProperty("LastName"));

       //click on dateofbirth
       selectTextByVisibleText(By.name("DateOfBirthDay"),"15");
       // click on month of birth
       selectTextByVisibleText(By.name("DateOfBirthMonth"),"April");
       // Select year of birth
       selectTextByVisibleText(By.name("DateOfBirthYear"),"2001");
       //Type E-mail
       typeText(By.id("Email"),email);

       //Type Password
       typeText(By.id("Password"),loadProrp.getProperty("password"));

       //Type Confirmed password
       typeText(By.id("ConfirmPassword"),loadProrp.getProperty("password"));

       //Click on register Submit Button
       clickOnElement(By.id("register-button"));

   }
}
