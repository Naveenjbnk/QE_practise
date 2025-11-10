import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AmazonApp {

    WebDriver driver;//Globally


    @BeforeMethod
    public  void  DriverSetUP(){
        ChromeOptions option1= new ChromeOptions();
        option1.addArguments("--start-maximized");
        driver = new ChromeDriver(option1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void TestFlipSite() {
        driver.get("https://www.amazon.in/");


        WebElement searchTxt= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchTxt.click();
        searchTxt.sendKeys("Laptop");
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();
        String LoadTitle = driver.getTitle();
        // here there is parent div and by expanding there child div used here with the @class func
        //I used this as an list which has the every title of the result being showed and it takes the exact 0 th / first value
        // I can use element to show case the first "element" alone
        List <WebElement> Result= driver.findElements(By.xpath("//div[@class=\'puisg-col puisg-col-4-of-4 puisg-col-4-of-8 puisg-col-8-of-12 puisg-col-8-of-16 puisg-col-12-of-20 puisg-col-12-of-24 puis-list-col-right\']//h2"));
        //To apply implicit wait here
        WebElement showResultEle = Result.get(0);
        String showResult = showResultEle.getText();
        //creating other list for price
        List <WebElement> ResultPrice = driver.findElements(By.xpath("//div[@class=\"a-row a-size-base a-color-base\"]//div/a/span/span[@class='a-offscreen']"));
        WebElement ShowResultPrice = ResultPrice.get(0);
       // String ShowResultPriceStr = ShowResultPrice.getText();
        // Here class= a-offscreen hides the element so js executescript is used to interact with browser
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String ShowResultPriceStr = (String) js.executeScript("return arguments[0].textContent;", ShowResultPrice);
        System.out.println(showResult);
        System.out.println(ShowResultPriceStr);
        System.out.println(LoadTitle);
        Assert.assertTrue(
                LoadTitle.toLowerCase().contains("laptop"),"Not matching the tittle"

        );
        System.out.println("Passed with tittle");
        //validating the titile with laptop





    }
    }
