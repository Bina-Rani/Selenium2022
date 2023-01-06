package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class collect {
    //Go to ebay.com
    //Click all category option
    //Select collectibles
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "reso/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();

        WebElement category=driver.findElement(By.cssSelector("[aria-label=\"Select a category for search\"]"));
        category.click();

        Select select=new Select(category);
        select.selectByValue("1");

        Assert.assertEquals("category", "1");

        Thread.sleep(3000);

        driver.quit();

    }

}
