package automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test1 {

    //Go to amazon
    //Validate the search button is visible

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "reso/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

       boolean searchButton= driver.findElement(By.xpath("//*[@id='nav-search-bar-form']/div[3]/div")).isDisplayed();

        Assert.assertEquals(searchButton, true);

    }
}
