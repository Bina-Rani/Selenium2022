package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MenShirt {

    //Go to ebay.com
    //move to mouse on Clothing & Accessories
    //move to mouse to on MenShirt

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement clothing= driver.findElement(By.xpath("//div[@class=\"hl-cat-nav\"]/ul/li[7]"));


        Actions actions=new Actions(driver);
        actions.moveToElement(clothing).build().perform();

        boolean clothingAnd= driver.findElement(By.xpath("//div[@class=\"hl-cat-nav\"]/ul/li[7]")).isDisplayed();
        Assert.assertEquals(clothingAnd, true);

        WebElement shirt= driver.findElement(By.cssSelector("[_sp=\"p2481888.m1383.l3264\"]"));

        boolean menShirt=driver.findElement(By.cssSelector("[_sp=\"p2481888.m1383.l3264\"]")).isDisplayed();
        Assert.assertEquals(menShirt, true);

        Thread.sleep(3000);
        actions.moveToElement(shirt).build().perform();

        Thread.sleep(4000);
        driver.quit();

    }
}