package automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test5 {

    //Go to YouTube

    //Validate YouTube logo is visible

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //Go to YouTube
        driver.get("https://www.youtube.com/");

        //Validate YouTube logo is visible
        boolean youtube=driver.findElement(By.xpath("//*[@id=\"logo-icon\"]")).isDisplayed();
        Assert.assertTrue(youtube);

    }
}
