package selDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://ebay.com");

        Actions actions=new Actions(driver);


       /* WebElement homeAndGarden=driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[6]"));
        actions.contextClick(homeAndGarden).build().perform();
        actions.doubleClick(homeAndGarden).build().perform();*/

        //for scroll to community

        WebElement community= driver.findElement(By.xpath("//div[@id='gf-t-box']/table/tbody/tr[1]/td/ul/li[3]/a"));

        Thread.sleep(3000);

        actions.moveToElement(community).build().perform();

    }
}
