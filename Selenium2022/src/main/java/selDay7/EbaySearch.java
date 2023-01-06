package selDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EbaySearch {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ebay.com");

        WebElement searchBox=driver.findElement(By.cssSelector("[aria-label='Search for anything']"));
        searchBox.sendKeys("sam");

        //Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        WebDriverWait wait=new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='gh-tbl2']/tbody/tr/td[1]/div[2]/ul/li[3]")));




        WebElement searchOption=driver.findElement(By.xpath("//table[@class='gh-tbl2']/tbody/tr/td[1]/div[2]/ul/li[3]"));
        searchOption.click();

        Thread.sleep(2000);

       // driver.quit();
        //driver.close();
    }
}
