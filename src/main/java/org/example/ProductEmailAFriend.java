package org.example;

import org.openqa.selenium.By;

public class ProductEmailAFriend extends Utils {

    public void productReferAFriend(){
        //Entre the friend email
        typeText(By.xpath("//input[@id='FriendEmail']"),loadProrp.getProperty("FriendEmailId"));

        //Click on SEND EMAIl button
        clickOnElement(By.xpath("//button[normalize-space()='Send email']"));
    }
}
