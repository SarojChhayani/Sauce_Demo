package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    // reusable methods go here
    LoadProrp loadProrp = new LoadProrp();
    // Store Email
    String email = loadProrp.getProperty("Emailpart1") + randomDate() + loadProrp.getProperty("Emailpart2");


    //Store password
    //static String password = "Abc@123";
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static String randomDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void implicitywait() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void sleep() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void selectTextByVisibleText(By by, String text) {
        //select date of birth
        Select dateofbirth = new Select(driver.findElement(by));
        dateofbirth.selectByVisibleText(text);
        //Select month of birth
        Select dateofbirthMonth = new Select(driver.findElement(by));
        dateofbirthMonth.selectByVisibleText(text);
        //Select Year of birth
        Select dateofbirthYear = new Select(driver.findElement(by));
        dateofbirthYear.selectByVisibleText(text);
    }

    public static void selectTextByValue(By by, String text) {
        //select date of birth
        Select dateofbirth = new Select(driver.findElement(by));
        dateofbirth.selectByValue(text);
        //Select month of birth
        Select dateofbirthMonth = new Select(driver.findElement(by));
        dateofbirthMonth.selectByValue(text);
        //Select Year of birth
        Select dateofbirthYear = new Select(driver.findElement(by));
        dateofbirthYear.selectByValue(text);
    }

    public static void selectTextByIndex(By by, int i) {
        //select date of birth
        Select dateofbirth = new Select(driver.findElement(by));
        dateofbirth.selectByIndex(i);
        //Select month of birth
        Select dateofbirthMonth = new Select(driver.findElement(by));
        dateofbirthMonth.selectByIndex(i);
        //Select Year of birth
        Select dateofbirthYear = new Select(driver.findElement(by));
        dateofbirthYear.selectByIndex(i);
    }

    public static void takeScreenShot(String text) {
        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        //Copy File at destination
        try {
            FileUtils.copyFile(SrcFile, new File("src\\ScreenShots\\" + text + randomDate() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void waitForElementToBeVisible(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
   public static void waitForElementToBeClickable(By by, int time) {
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
   }
   public static void waitForElementToBeInvisible(By by,int time){
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
       Boolean elementInvisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
   }


}
