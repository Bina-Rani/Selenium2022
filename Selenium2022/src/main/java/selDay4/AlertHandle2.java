package selDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle2 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[3]/div[2]/button")).click();
        driver.switchTo().alert().accept();

        System.out.println(driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[2]/div[1]/span")).getText());

    }
}
