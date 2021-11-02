import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Rithesh B");
        System.setProperty("webdriver.chrome.driver","D:\\Rithesh\\Java\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("http://amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();

    }
}
