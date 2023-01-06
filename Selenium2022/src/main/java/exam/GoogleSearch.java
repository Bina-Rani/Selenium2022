package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSearch {

    //Go to google.com
    //Remove the No Thanks frame
    //Click on Search box
    //Type Birds on search box
    //Press Enter


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        WebElement noThanks= driver.findElement(By.cssSelector("[aria-label=\"No thanks\"]"));
        noThanks.click();

        driver.switchTo().defaultContent();

        Thread.sleep(3000);

        WebElement searchBox= driver.findElement(By.cssSelector("[class=\"gLFyf gsfi\"]"));
        searchBox.click();
        searchBox.sendKeys("Birds", Keys.ENTER);

        boolean birds=driver.findElement(By.cssSelector("[class=\"gLFyf gsfi\"]")).isDisplayed();
        Assert.assertEquals(birds, true);

        Thread.sleep(4000);
        //driver.quit();

    }
}