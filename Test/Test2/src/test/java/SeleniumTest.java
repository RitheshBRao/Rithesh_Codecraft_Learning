import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hie");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
//        Thread.sleep(5000);


//        /html/body/div[2]/div/div/button
          driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//        WebElement filterMenu = driver.findElement(By.xpath("//*[@id=\'cxeHome\']/div[1]/div/div/div/div/div/div[2]/a"));
        WebElement filterMenu = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[4]/div/div/div/div"));
//        filterMenu.cle;


        Actions action = new Actions(driver);
        action.moveToElement(filterMenu).build().perform();
        Thread.sleep(3000);
        System.out.println(" --------------------> Hie man ");

//        WebElement newsFilterOption = driver.findElement(By.xpath("//*[@id=\'html_element\']/body/div[3]/div/div/ul/li[3]"));
        WebElement newsFilterOption = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[4]/div/div/div[2]/div[2]/div/ul/li[2]/a/div"));
//        Select select = new Select(filterMenu);
//        select.selectByIndex(6);
//        Boolean val =  newsFilterOption.isDisplayed();
//        System.out.println(val);
        Actions action1 = new Actions(driver);
        action1.moveToElement(newsFilterOption).click().build().perform();

        //*[@id="container"]/div/div[1]/div[1]/div[2]/div[4]/div/div/div[2]/div[2]/div/ul/li[2]/a/div

        Thread.sleep(10000);
        driver.quit();
    }
}
