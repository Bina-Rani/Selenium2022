package selDay5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class FindElements {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");
        //List<WebElement> footers=driver.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td/ul/li"));
        List<WebElement> footers=driver.findElements(By.cssSelector("[class='gf-t'] [class='gf-li']"));

        for (WebElement list: footers) {
            System.out.println(list.getText());



        }

        driver.quit();



    }
}
