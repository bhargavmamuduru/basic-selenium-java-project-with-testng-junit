package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Balu on 7/8/2016.
 */
public class FirstSelenium {

    public static void main(String [] args) throws InterruptedException {
        // Opening new firefox browser and passing URL
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.cheapoair.com");

        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/header/div/a")).click();
        // Entering Origin
        WebElement from = driver.findElement(By.id("ember696"));
        from.sendKeys("PDX");
        // Entering Destination
        WebElement to = driver.findElement(By.id("ember707"));
        to.sendKeys("MAA - Chennai, India");
        //Entering Date of travel
        WebElement depdate = driver.findElement(By.id("departCalendar_0"));
        depdate.click();
        // Entering Date of return
        WebElement arrdatesel = driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div[1]/div/article/div/section[1]/div/section/form/fieldset[2]/fieldset[2]/div[1]/div/fieldset/section/div/div[1]/ol/div[29]/li"));
        arrdatesel.click();
        // Click on search
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div[1]/div/article/div/section[1]/div/section/form/input")).click();
        // Closing browser
        driver.quit();
    }
}
