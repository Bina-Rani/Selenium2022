package selDay2;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckChartAmazon {

    //go to amazon.com
    //click on cart from top right corner
    //validate 'your amazon cart is empty' message is visible

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]")).click();
        String cartText=driver.findElement(By.cssSelector("[class=\"a-row sc-your-amazon-cart-is-empty\"]")).getText();
        //System.out.println(cartText);

        //check point
        Assert.assertEquals(cartText, "Your Amazon Cart is empty");
        Thread.sleep(2000);

        driver.quit();


    }
}
