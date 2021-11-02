import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstProgram {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        System.out.println("Hi This is Rithesh B Rao");
        int a = 1;
        int b = ++a;
//        System.out.println(b);
//        System.out.println(a++);

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
////        driver.get("https://www.google.com/");
//        driver.get("https://dev.elitegamer.gg/");
//        driver.manage().window().maximize();
//        String title = driver.getTitle();
//        System.out.println(title);
//        Thread.sleep(3000);
////        WebElement element = driver.findElement(By.xpath("//*[@id=\'video-carousel\']/div[2]/div/div/div/div[1]/div/section/div[2]/div[1]/div/video"));
////        Actions actions = new Actions(driver);
////        actions.moveToElement(element).click().build().perform();
//        WebElement element = driver.findElement(By.xpath("//*[@id=\'cxeHome\']/div[1]/div/div/div/div/div/div[1]/div/span/span/span[2]/input"));
//        element.sendKeys("Fortnite");
//        Thread.sleep(1000);
//        element.sendKeys(Keys.ENTER);
////        Actions actions = new Actions(driver);
////        actions.moveToElement(element).click().build().perform();
//        System.out.println(title);
//        Thread.sleep(2000);

//        http://makeseleniumeasy.com/2020/05/25/elementclickinterceptedexception-element-click-intercepted-not-clickable-at-point-other-element-would-receive-the-click/




//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setCapability("deviceName", "JCAAGF04C267VTV");
//        dc.setCapability("platformName", "android");
//        dc.setCapability("appPackage", "com.asus.calculator");
//        dc.setCapability("appActivity", ".Calculator");
//        dc.setCapability("noReset", false);
//
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//        WebDriver driver = new AndroidDriver(url, dc);
//        MobileElement el1 = (MobileElement) driver.findElement(By.id("com.asus.calculator:id/digit6"));
//        el1.click();
//        MobileElement elp = (MobileElement) driver.findElement(By.id("com.asus.calculator:id/plus"));
//        elp.click();
//        MobileElement el5 = (MobileElement) driver.findElement(By.id("com.asus.calculator:id/digit5"));
//        el5.click();
//        MobileElement ele = (MobileElement) driver.findElement(By.id("com.asus.calculator:id/equal"));
//        ele.click();
//        Thread.sleep(3000);
//        driver.quit();
    }
}
