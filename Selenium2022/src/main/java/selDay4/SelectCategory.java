package selDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCategory {

    public static void main(String[] argds) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.amazon.com/");

        //Select select=new Select(driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")));
        //select.selectByIndex(7);
       // select.selectByValue("search-alias=stripbooks");

        driver.get("https://www.ebay.com");
        //Select select=new Select(driver.findElement(By.xpath("//select[@aria-label='Select a category for search']")));
        WebElement category= driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
        Select select=new Select(category);


        //select.selectByIndex(5);
        select.selectByValue("14339");






    }
}