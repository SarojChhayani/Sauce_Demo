package org.example;

import org.openqa.selenium.By;

public class BuildYourownComputer extends Utils {

    public void custmiseYourComputer(){
        //Select Processor
        selectTextByVisibleText(By.id("product_attribute_1"),"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
        //Select RAM
        selectTextByVisibleText(By.id("product_attribute_2"),"8GB [+$60.00]");
        //Select HDD
        clickOnElement(By.id("product_attribute_3_7"));
        //selectTextByVisibleText(By.id("product_attribute_3_7"),"400 GB [+$100.00]");
        //Select OS
        clickOnElement(By.id("product_attribute_4_9"));
        //selectTextByVisibleText(By.id("product_attribute_4_9"),"Vista Premium [+$60.00]");
        //Select Software
        clickOnElement(By.id("product_attribute_5_12"));
        //selectTextByVisibleText(By.id("product_attribute_5_12"),"Total Commander [+$5.00]");
        //Click On Add to Cart
        clickOnElement(By.id("add-to-cart-button-1"));

    }
}
