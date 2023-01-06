package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

    //Go to Amazon

    //Locate the elements by using Id, Name, LinkText and PartialLinkedText

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();// maximize web page(optional)

        //Id locator
        /*WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.click();

        searchbox.sendKeys("T-shirt");*/

        //name locator
        //driver.findElement(By.name("field-keywords")).click();
        //driver.findElement(By.linkText("href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice\"")).click();













    }
}
