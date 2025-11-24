import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.List;

public class RedBusPortal {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

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
        String dateXpath="//div[@class='dojWrapper___9b2a92']";
        WebElement datePickerInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dateXpath)));
        datePickerInput.click();
        //choosing 27 th date  from the date picker using the text value am choosing
        String selectdateXpath ="//span[@aria-hidden='true' and text()='27']";
        WebElement select_Date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectdateXpath)));
        select_Date.click();
        //if you want to choose the reservation for women

        WebElement WomenSwitch = driver.findElement(By.xpath("//input[@id='switch' and @type='checkbox']"));
        WomenSwitch.click();
        //closing the alert tab
        String alertTabXpath = "//button[@class='primaryButton___6f5313  ']";
        WebElement gotit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(alertTabXpath)));
        gotit.click();
        //click on search button
        String searchBusXpath="//button[@class='primaryButton___6f5313 searchButtonWrapper___1e2c20 ']";
        WebElement searchBus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchBusXpath)));
        searchBus.click();
        // based on the bus name Choose with text()
        String chooseBusXpath="//div[@class='topRow___aebee7']//div[text()='KMRL kalaimakal Road Lines']";
        WebElement chooseBus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(chooseBusXpath)));
        chooseBus.click();

        //select seat 3
        String seatXpath = "//div[@class='seat__ind-seat-styles-module-scss-tUu8R ' and @id='16W']";
        WebElement chooseSeat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(seatXpath)));
        chooseSeat.click();

        //confirming button boarding path

        String selectBoardingButton = "//button[@class='primaryButton___6f5313 button___71599d ']";

        WebElement select_Boarding_point = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectBoardingButton)));

        select_Boarding_point.click();

        //select boarding point
        String BPplaceXpath = "//div[@aria-label='Boarding points']//div[@class='bpdpSelection___db3da0   bpdp'and @data-id='1']";

        WebElement chooseBPplace= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BPplaceXpath)));

        chooseBPplace.click();

        //Here am using 2 nd boarding point
        String DropPointXpath = "//div[@aria-label='Dropping points'and @class='bpdpList___2d7b39 ']//div[@class='bpdpSelection___db3da0   bpdp'and@data-id='1']";
        WebElement DropPoint= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DropPointXpath)));
        DropPoint.click();

        //Fill contact details
        String PhoneNumberXpath ="//input[@type='number'and @name='Phone *']";
        WebElement EnterPhone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PhoneNumberXpath)));
        EnterPhone.click();
        EnterPhone.sendKeys("7397586821");

        //Fill the xpath for the state of res //div[@class='leftContent___c13f10']//div[text()='Tamil Nadu']
        WebElement EnterstateRes = driver.findElement(By.xpath("//input[@id='0_201']"));
        EnterstateRes.click();
        //Choose tamil nadu
        String EnterstateXpath ="//div[@class='leftContent___c13f10']//div[text()='Tamil Nadu']";
        WebElement ChooseState = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(EnterstateXpath)));
        ChooseState.click();

        //Enter the name
        String NameXpath = "//input[@type='text'and@id='0_4']";
        WebElement EnterName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(NameXpath)));
        EnterName.click();
        EnterName.sendKeys("Naveen Kumar");

        //Enter Age
        String AgeXpath ="//input[@type='number'and@id='0_1']";
        WebElement EnterAge = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AgeXpath)));
        EnterAge.click();
        EnterAge.sendKeys("25");
        //choose Gender
        String ageXpath ="//div[@class='toggleGroup___3fc3df    toggleBtn___a88956']//label[text()='Male']";
        WebElement ChooseGender = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ageXpath)));
        ChooseGender.click();

        //chooseRedbus Insurance
        String insureRedbus = "//div[@id='insuranceRejectText']";
        WebElement InsureRedBus= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(insureRedbus)));
        InsureRedBus.click();

        //Submit button

        String SubmitXpath ="//button[@class='primaryButton___6f5313  'and @aria-label='Continue booking']";
        WebElement selectButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SubmitXpath)));
        selectButton.click();






    }
}

