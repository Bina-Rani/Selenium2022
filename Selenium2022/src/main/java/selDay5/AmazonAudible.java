package selDay5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class AmazonAudible {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        /*WebElement audible=driver.findElement(By.xpath("//table[@class=\"navFooterMoreOnAmazon\"]/tbody/tr[5]/td[1]/a"));
        String A=audible.getText();
        System.out.println(A);
        boolean ad= audible.isDisplayed();
        Assert.assertEquals(ad, true);

        Assert.assertEquals("A", "Audible\nListen to Books & Original\nAudio Performances" );*/

        //findElements
        List<WebElement> footerLinks = driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr/td/a"));

        //foreach loop
        for (WebElement link : footerLinks) {
            System.out.println(link.getText());


        }

    }


    }

