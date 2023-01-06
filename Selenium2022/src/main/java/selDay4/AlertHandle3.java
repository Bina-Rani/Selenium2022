package selDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage() .window() .maximize() ;

        driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[4]/div[2]/button")).click();
        driver.switchTo().alert().accept();

        String text=driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[4]/div[1]/span")).getText();
        System.out.println(text);





    }
}