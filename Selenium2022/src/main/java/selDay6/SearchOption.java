package selDay6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchOption {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        driver.switchTo().frame(0);

        WebElement rejectOption= driver.findElement(By.cssSelector("[aria-label=\"No thanks\"]"));
        rejectOption.click();

        driver.switchTo().defaultContent();

        WebElement searchBox= driver.findElement(By.cssSelector("[class=\"gLFyf gsfi\"]"));
        searchBox.click();
        //static wait: wait full allocated time, no matter what
        //Thread.sleep(20000);

        //implicit wait:will not wait full allocated time, if the element/page is ready
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);

        //Explicitely wait:
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role=\"presentation\"]/ul/li[5]/div/div[2]/div[1]/span")));


        WebElement searchOption= driver.findElement(By.xpath("//div[@role=\"presentation\"]/ul/li[5]/div/div[2]/div[1]/span"));
        searchOption.click();







    }
}
