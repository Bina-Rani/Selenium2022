package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import selDay4.SelectCategory;

import java.util.List;


public class DepartmentsOfAmazon {

    //go to amazon.com
    //click all category
    //Print the names of all departments

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binar\\IdeaProjects\\Selenium2022\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        WebElement departments=driver.findElement(By.cssSelector("[aria-describedby=\"searchDropdownDescription\"]"));
        departments.click();

        List<WebElement>names=driver.findElements(By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]/option"));
        for(WebElement print:names){
            System.out.println(print.getText());

        }
        //Assert.assertEquals(names, names);

        Thread.sleep(4000);
        driver.quit();



        //Assert.assertEquals(names, "All Departments\nAlexa Skills\nAmazon Devices\nAmazon Explore\nAmazon Pharmacy\n Amazon Warehouse\nAppliances\nApps & Games\nArts, Crafts & Sewing\nAudible Books & Originals\nAutomotive Parts & Accessories\nAWS Courses\nBaby\nBeauty & Personal Care\nBooks\nCDs & Vinyl\nCell Phones & Accessories\nClothing, Shoes & Jewelry\nWomen\nMen\nGirls\nBoys\nBaby\nCollectibles & Fine Art\nComputers\nCredit and Payment Cards\nDigital Educational Resources\nDigital Music\nElectronics\nGarden & Outdoor\nGift Cards\nGrocery & Gourmet Food\nHandmade\nHealth, Household & Baby Care\nHome & Business Services\nHome & Kitchen\nIndustrial & Scientific\nJust for Prime\nKindle Store\nLuggage & Travel Gear\nLuxury Stores\nMagazine Subscriptions\nMovies & TV\nMusical Instruments\nOffice Products\nPet Supplies\nPremium Beauty\nPrime Video\nSmart Home\nSoftware\nSports & Outdoors\nSubscribe & Save\nSubscription Boxes\nTools & Home Improvement\nToys & Games\nUnder $10\nVideo Games\nWhole Foods Market");


    }
    }

