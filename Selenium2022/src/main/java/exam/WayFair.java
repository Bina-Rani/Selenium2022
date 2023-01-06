package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WayFair {

    //Go to wayfair
    //Click on first header on top left corner
    //Click on Alert


    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.wayfair.com/?&experiencetype=1");
        driver.manage().window().maximize();

        //WebElement furniture=driver.findElement(By.xpath("//header[@class='WayfairHeader']/nav/ul/li[1]"));
        //furniture.click();

        //driver.switchTo().alert().accept();
        //driver.findElement(By.cssSelector("[class=\"recaptcha-checkbox-border\"]")).click();

        //driver.switchTo().frame(3);




    }
}
