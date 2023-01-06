package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AmazonCart {

    //Go to amazon.com
    //Click cart button on the top right corner
    //Validate 'Sign in to your account button' is available on empty amazon cart

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("[aria-label=\"0 items in cart\"]")).click();

        boolean signIn=driver.findElement(By.xpath("//div[@id=\"sc-active-cart\"]/div/div/div[2]/div[3]/span[1]")).isDisplayed();

        Assert.assertEquals(signIn, true);

        Thread.sleep(3000);

        driver.quit();

    }
}
