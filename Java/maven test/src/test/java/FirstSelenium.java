import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FirstSelenium {
    public static void main(String[] args) throws InterruptedException, IOException {

        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream("D:\\Rithesh\\Java\\maven test\\src\\test\\java\\config.properties");
        prop.load(ip);
        System.out.println(prop.getProperty("URL"));

        String url = prop.getProperty("URL");

        System.out.println(url);
        System.setProperty("webdriver.chrome.driver","D:\\Rithesh\\Java\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get(url);
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"cxeHome\"]/div[1]/div/div/div/div/div/div/a"))).build().perform();
        Thread.sleep(3000);
        System.out.println("121");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[6]")).click();
        driver.findElement((By.linkText("fsd"))).click();
        System.out.println("123");
//        driver.quit();
    }
}
