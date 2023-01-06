package selDay6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.switchTo().frame(0);

        WebElement rejectFrame=driver.findElement(By.cssSelector("[aria-label=\"No thanks\"]"));
        rejectFrame.click();

        driver.switchTo().defaultContent();

        Thread.sleep(2000);


        WebElement searchBox=driver.findElement(By.cssSelector("[class='gLFyf gsfi']"));
        searchBox.click();
        searchBox.sendKeys("Books", Keys.ENTER);

    }
}
