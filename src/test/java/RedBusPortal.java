import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class RedBusPortal {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void page1(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public  void page2(){
        driver.get("https://www.redbus.in/");

        //locating the element using text displayed
        WebElement frombutton = driver.findElement(By.xpath("//div[@class='labelCityWrapper___dd1d0e']/div[text()='From']"));
        frombutton.click();
        // It is difficult to use this popup I choose this debugger to locate the field
        WebElement inputData = driver.findElement(By.xpath("//input[@class='inputField___a5ec46']"));
        inputData.sendKeys("Banglore");
        WebElement inputClick = driver.findElement(By.xpath("//div[@class='leftContent___84cec0']"));
        inputClick.click();
        WebElement destbutton = driver.findElement(By.xpath("//div[@class='labelCityWrapper___dd1d0e']/div[text()='To']"));

        WebElement inputTodata = driver.findElement(By.xpath("//input[@id='srcDest']"));
        // Used the exact dest part to search for the element
        inputTodata.sendKeys("Chennai");
        WebElement Tobutton = driver.findElement(By.xpath("//div[@class='leftContent___84cec0']//div[text()='CMBT, Chennai, Chennai']"));

        Tobutton.click();
       //am using list to store in all Destintion

//       List <WebElement> listDestElement = driver.findElements(By.xpath("//div[@class='leftContent___84cec0']//div"));
//       WebElement FirstDataget = listDestElement.get(0);
//       String eleme = FirstDataget.getText();

     //  System.out.println(eleme);


        //Date picker
        WebElement datePickerInput = driver.findElement(By.xpath("//div[@class='dojWrapper___9b2a92']"));
        datePickerInput.click();
        //choosing 26 th date  from the date picker using the text value am choosing
        WebElement select_Date = driver.findElement(By.xpath("//span[@aria-hidden='true' and text()='27']"));
        select_Date.click();

        //if you want to choose the women optin

        WebElement WomenSwitch = driver.findElement(By.xpath("//input[@id='switch' and @type='checkbox']"));
        WomenSwitch.click();
        //closing the alert tab
        WebElement gotit = driver.findElement(By.xpath("//button[@class='primaryButton___6f5313  ']"));
        gotit.click();
        //click on search button

        WebElement searchBus = driver.findElement(By.xpath("//button[@class='primaryButton___6f5313 searchButtonWrapper___1e2c20 ']"));
        searchBus.click();
        // I choose 2 from the list

        WebElement chooseBus = driver.findElement(By.xpath("//div[@class='sectionWrapper__ind-search-styles-module-scss-AITjK  ']//ul//li[2]"));
        chooseBus.click();



    }
}

