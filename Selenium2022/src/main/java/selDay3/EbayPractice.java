package selDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EbayPractice {

    public static void main(String[] argds) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        String category=driver.findElement(By.xpath("//li[@data-currenttabindex=\"4\"]/a")).getText();
        System.out.println(category);

        Assert.assertEquals(category, "Clothing & Accessories");

        Thread.sleep(2000);
        driver .quit();
    }
}
