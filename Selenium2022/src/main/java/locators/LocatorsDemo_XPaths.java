package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo_XPaths {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //Absolute XPath

        //driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[5]/form/table/tbody/tr/td[1]/div[1]/div/input[1]")).sendKeys("T-Shirt");
        //driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[5]/form/table/tbody/tr/td[3]/input")).click();

        //Relative XPath
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Watch");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        //XPath with'or'
        //driver.findElement(By.xpath("//*[@id=\"gh-ac1\" or @size=\"50\"]")).sendKeys("Books");
        //driver.findElement(By.xpath("//*[@id=\"gh-btn\" or @type=\"submit1\"]")).click();

        //XPath with "and"
        //driver.findElement(By.xpath("//*[@id=\"gh-ac\" and @size=\"50\"]")).sendKeys("Umbrella");
        //driver.findElement(By.xpath("//*[@id=\"gh-btn\" or @type=\"submit\"]")).click();

        //XPath with contains()
        //driver.findElement(By.xpath("//input[contains(@id, 'gh')]")).sendKeys("Dress");
        //driver.findElement(By.xpath("//input[contains(@type, 'sub')]")).click();

        //XPath with start-with()
        //driver.findElement(By.xpath("//input[starts-with(@id, 'gh')]")).sendKeys("Dress");
        //driver.findElement(By.xpath("//input[starts-with(@type, 'sub')]")).click();

        //XPath with text()
        //driver.findElement(By.xpath("//a[text()=\"Aircraft\"]")).click();

        //XPath with chained
        //driver.findElement(By.xpath("//form[@id='gh-f']//input[@type='text']")).sendKeys("Pen");
        //driver.findElement(By.xpath("//form[@id='gh-f']//input[@type='submit']")).click();













    }
}
