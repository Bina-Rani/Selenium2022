package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //tag and id
        //driver.findElement(By.cssSelector("#email")).sendKeys("Mark");
        //driver.findElement(By.cssSelector("input#email")).sendKeys("Mark");

        //tag and class
        //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("John");
        //driver.findElement(By.cssSelector(".inputtext")).sendKeys("John");

        //tag and attribute
        //driver.findElement(By.cssSelector("[name=email]")).sendKeys("Sam");
        //driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Sam");

        //tag, class and attribute
        driver.findElement(By.cssSelector("input.inputtext[type=password ]")).sendKeys("abc");
        driver.findElement(By.cssSelector("input.inputtext[type=text]")).sendKeys("George");

    }
}
