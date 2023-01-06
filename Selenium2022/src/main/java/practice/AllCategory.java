package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllCategory {
    //Go to amazon
    //click all category
    //Print the names of all departments

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "reso/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        WebElement category=driver.findElement(By.cssSelector("[aria-describedby=\"searchDropdownDescription\"]"));
        category.click();

        List<WebElement> names=driver.findElements(By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]/option"));
        for(WebElement print:names){
            System.out.println(print.getText());
        }

    }

}
