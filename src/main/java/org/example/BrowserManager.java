package org.example;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {
    //anything relate to browser to go here
    LoadProrp loadProrp = new LoadProrp();
    String browser = System.getProperty("browser");
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));


    public void openBrowser(){
        if (cloud) {
            System.out.println("Running in cloud........");
            if (browser.equalsIgnoreCase("Chrome")) {
                System.out.println("Your browser is Chrome");
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("latest");
                try {
                    driver = new RemoteWebDriver(new URL(loadProrp.getProperty("SauceLabUrl")), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.out.println("Your browser is Firefox");
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("latest");
                try {
                    driver = new RemoteWebDriver(new URL(loadProrp.getProperty("SauceLabUrl")), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else if (browser.equalsIgnoreCase("Safari")) {
                System.out.println("Your browser is Safari");
                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setPlatformName("macOS 13");
                browserOptions.setBrowserVersion("17");
                try {
                    driver = new RemoteWebDriver(new URL(loadProrp.getProperty("SauceLabUrl")), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
        }else {
            System.out.println("Running in Local.............");
            if (browser.equalsIgnoreCase("Chrome")) {
                System.out.println("Your browser is Chrome");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.out.println("Your browser is Firefox");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                System.out.println("Your browser is Edge");
                driver = new EdgeDriver();
            } else {
                System.out.println("Your browser Name is Wrong " + browser);
            }
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open URL
        driver.get(loadProrp.getProperty("url"));
    }
    public void closeBrowser(){
        driver.quit();
    }
}
