import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartApp {
    WebDriver driver;//Globally

@BeforeClass
    public  void  DriverSetUP(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}
    @Test
    public void TestFlipSite(){
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    WebElement searchOp = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
    searchOp.click();
    searchOp.sendKeys("redmi tv");
    WebElement SearchButton = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
    SearchButton.click();
    //Iam doing this multiple lsit option

    String TargetTV="ndfbdnbf";


                ////div[@class='tUxRFH']



}
}
