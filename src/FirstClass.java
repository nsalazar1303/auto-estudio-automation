import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class FirstClass {

    public static void main(String[] args) throws Exception{
        System.out.println("Ziggy!");
        System.out.println("Necio!");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage (). window().maximize ();


        WebElement buscarText = ((ChromeDriver) driver).findElementById("twotabsearchtextbox");

        buscarText.sendKeys("Power Bank");
        WebElement buscar= ((ChromeDriver) driver).findElementByClassName("nav-search-submit");
        buscar.click();
        WebElement producto = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom']//img)[1]"));
       producto.click();
        //WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement addProductBoton = ((ChromeDriver) driver).findElementById("add-to-cart-button");
        addProductBoton.click();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.close();




    }
}
