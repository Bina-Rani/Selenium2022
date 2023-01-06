package selDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckLogoAmazon {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        boolean logo=driver.findElement(By.cssSelector("[id=\"nav-logo-sprites\"]")).isDisplayed();

        Assert.assertEquals(logo, true);

        Thread.sleep(3000);

        driver.quit();
    }
}
