package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Google {
    //Go to google.com
    //Remove the No Thanks frame
    //Click on Search box
    //Type Birds on search box
    //Press Enter
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "reso/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        WebElement iframe=driver.findElement((By.cssSelector("[aria-label=\"No thanks\"]")));
        iframe.click();

        driver.switchTo().defaultContent();

       WebElement searchbox= driver.findElement(By.cssSelector("[class=\"gLFyf gsfi\"]"));
       searchbox.click();
       searchbox.sendKeys("Birds", Keys.ENTER);

       boolean birds=driver.findElement(By.cssSelector("[class=\"SPZz6b\"]")).isDisplayed();
        Assert.assertEquals(birds, true);
    }
}
