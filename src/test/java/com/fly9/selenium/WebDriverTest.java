package com.fly9.selenium;

//Importing Selenium packages
import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates that you can create a new webDriver instance object
 * Open google.com site and close
 * Created by Balu on 7/8/2016.
 */
public class WebDriverTest {

    //Main method to demonstrate running Web driver.
    public static void main(String[] args)
    {
        //Creating a Web Driver instance.
        WebDriver driver = new ChromeDriver();

        //Open google.com site
        driver.get("https://www.google.com");

        //Closing the browser session
        driver.close();
    }
}
