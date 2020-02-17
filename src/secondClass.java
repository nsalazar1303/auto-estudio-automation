import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class secondClass {

    public static void main(String[] args) throws Exception{
        System.out.println("Ziggy!");
        System.out.println("Necio!");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        System.out.println("Step 1!");
        driver.navigate().to("http://automationpractice.com/index.php?");
        System.out.println("Step 2!");
        driver.manage().window().maximize();
        System.out.println("Step 3!");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        System.out.println("Step 4!");
        WebElement locator= driver.findElement(By.xpath("//ul[@id=\"homefeatured\"]//li[contains(@class,\"ajax_block_product\")][6]"));
        Actions over=new Actions(driver);
        over.moveToElement(locator).perform();
        System.out.println("Step 6!");
        WebElement addtocart = locator.findElement(By.xpath("div//a[@class=\"button ajax_add_to_cart_button btn btn-default\"]"));
        addtocart.click();
    }
}