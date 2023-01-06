package selDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogo {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        WebElement logo=driver.findElement(By.xpath("//header[@id='navbar-main']/div/div[1]/div[1]/div[1]"));
        logo.click();
       // System.out.println(logo.isDisplayed());
        driver.navigate().back();
        driver.navigate().to("https://facebook.com");

    }


}
