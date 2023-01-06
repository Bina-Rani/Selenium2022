package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchProduct {
    //Go to ebay
    //Search for products
    //Click on search button
    //Validate The product page is visible

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "reso/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("Shirt");

        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

       boolean page= driver.findElement(By.xpath("[class=\"s-page no-touch skin-large srp--grid-view no-touch skin-large gh-flex\"]")).isDisplayed();

        Assert.assertEquals(page, "true");

        Thread.sleep(5000);

        driver.quit();
    }
}
