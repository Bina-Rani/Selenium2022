package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EbayCart {
    //Go to ebay.com
    //Click right corner of cart
    //Validate shopping cart is empty

    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "reso/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.ebay.com/");
      driver.manage().window().maximize();

      driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]")).click();

      String cartText=driver.findElement(By.xpath("//*[@class=\"empty-cart\"]/div[1]/span/span/span")).getText();
      System.out.println(cartText);

        Assert.assertEquals(cartText, "You don't have any items in your cart.");

        Thread.sleep(3000);
        driver.quit();

    }
}
