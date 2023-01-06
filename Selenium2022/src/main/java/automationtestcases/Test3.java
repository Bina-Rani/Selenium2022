package automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test3 {

    //Go to ebay
    //Search for products
    //Click on search button
    //Validate The product page is visible


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "reso/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Go to eaby
        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        //Search for products
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Shirt");

        //Click on search button
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        //Validate The product page is visible
        boolean page=driver.findElement(By.xpath("/html/body")).isDisplayed();
        //Assert.assertTrue(page);
        Assert.assertEquals(page, true);

        Thread.sleep(3000);

        driver.quit();
    }
}
