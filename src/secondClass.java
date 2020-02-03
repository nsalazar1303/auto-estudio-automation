import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class secondClass {

    public static void main(String[] args) throws Exception{
        System.out.println("Ziggy!");
        System.out.println("Necio!");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.manage (). window().maximize ();


       // WebElement buscarText = ((ChromeDriver) driver).findElementById("twotabsearchtextbox");

        //buscarText.sendKeys("Power Bank");
        //WebElement buscar= ((ChromeDriver) driver).findElementByClassName("nav-search-submit");
        //buscar.click();
        WebElement buscar = driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div"));
        buscar.click();



        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.close();
        //drive closed




    }
}