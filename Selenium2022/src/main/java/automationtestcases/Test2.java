package automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test2 {

    //Go to ebay
    //click on cart from top right corner
    //validate 'You don't have any items in your cart. Let's get shopping!' message is visible

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "reso/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Go to ebay
        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        //click on cart from top right corner
        driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]")).click();

        //
        String cartText=driver.findElement(By.xpath("//*[@class='app-cart']/div/div[1]/span/span/span")).getText();
        System.out.println(cartText);

        //validate 'You don't have any items in your cart. Let's get shopping!' message is visible
        Assert.assertEquals(cartText,"You don't have any items in your cart.");
    }
}