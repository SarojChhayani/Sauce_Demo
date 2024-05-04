package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart extends Utils {
   // String expectedproductname = "Build your own computer";


    public void addtocartproduct() {
        //Click on Shopping cart button
        clickOnElement(By.className("ico-cart"));
        //verify correct product added
        Assert.assertEquals(getTextFromElement(By.className("product-name")),loadProrp.getProperty("ExpectedProName"),"Product Name Doesn't Match");

    }
}
