package automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test4 {

    // Go to google calender
    //Validate Google logo is visible

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //Go to Google Calender
        driver.get("https://www.google.com/search?q=google+calendar&oq=&aqs=chrome.0.35i39i362l8.2753639j0j7&sourceid=chrome&ie=UTF-8");
        driver.manage().window().maximize();
        //Validate Google logo is visible
        boolean google=driver.findElement(By.xpath("//*[@id=\"logo\"]/img")).isDisplayed();

        //Assert.assertTrue(google);
        Assert.assertEquals(google, true);

        Thread.sleep(4000);
        driver.quit();

    }
}
