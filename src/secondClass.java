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
        System.out.println("Step 7!");
        Thread.sleep(5000);
        WebElement continueshopping= driver.findElement(By.xpath("//span[contains(@class,\"continue\")]"));
        continueshopping.click();
        System.out.println("Step 8!");
        Thread.sleep(5000);
        WebElement linkbestseller= driver.findElement(By.xpath("//a[@class=\"blockbestsellers\"]"));
        linkbestseller.click();
        Thread.sleep(5000);
        WebElement bestsallersadd = driver.findElement(By.xpath("//ul[@id=\"blockbestsellers\"]//li[contains(@class,\"ajax_block_product\")][2]"));
        Thread.sleep(5000);
        over.moveToElement(bestsallersadd).perform();
        Thread.sleep(5000);
        System.out.println("Step 9!");
        WebElement bestsellersaddtocart = bestsallersadd.findElement(By.xpath("div//a[@title=\"Add to cart\"]"));
        System.out.println("Step 10!");
        Thread.sleep(5000);
        bestsellersaddtocart.click();
        System.out.println("Step 11!");
        Thread.sleep(5000);

        driver.close();

    }
}