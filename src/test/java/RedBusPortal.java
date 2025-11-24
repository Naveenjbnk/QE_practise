import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

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
        //inputTodata.sendKeys("Chennai");





    }
}
