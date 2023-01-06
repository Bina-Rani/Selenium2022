package selDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckLogoEbay {

    //go to ebay.com
    //validate logo is visible on header

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://ebay.com");

        driver.manage().window().maximize();

        boolean logoVisibility=driver.findElement(By.xpath("//*[@id=\"gh-la\"]")).isDisplayed();

        //Assert.assertTrue(logoVisibility);
        Assert.assertEquals(logoVisibility, true);

    }
}
