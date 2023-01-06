package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ebay.com/");

        //locate multiple web element
        //class name
        int sliders=driver.findElements(By.className("title-banner__layer")).size();
        System.out.println(sliders);

        //tag name
       int links= driver.findElements(By.tagName("a")).size();
        System.out.println("links");


    }
}
