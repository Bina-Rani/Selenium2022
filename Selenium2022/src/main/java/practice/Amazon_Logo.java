package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Amazon_Logo {

    // Go to amazon
    //Validate amazon logo is visible

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","reso/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        boolean logo= driver.findElement(By.xpath("//*[@href=\"/ref=nav_logo\"]")).isDisplayed();

        Assert.assertEquals(logo,true);
    }


}
