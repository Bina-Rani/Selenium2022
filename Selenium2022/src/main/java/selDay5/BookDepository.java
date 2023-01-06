package selDay5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BookDepository {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        WebElement bookLink=driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr[5]/td[3]/a"));
        String book= bookLink.getText();
        System.out.println(book);
        boolean b=bookLink.isDisplayed();
        Assert.assertEquals(b, true);
        Assert.assertEquals(book, "Book Depository\n" + "Books With Free\n" + "Delivery Worldwide");



    }
}
