import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginClass {

    public static void main(String[] args) {
        System.out.println("Hie");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement loginField = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
        loginField.sendKeys("ritheshb123@outlook.com");

        WebElement passwordField = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
        passwordField.sendKeys("godisgreat31");

        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span"));
        loginButton.click();

        WebElement assertTextAfterLogin = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));

//        System.out.println(assertTextAfterLogin.isDisplayed());
        System.out.println(assertTextAfterLogin.getText());

////        Assert.assertTrue(assertTextAfterLogin.getText().contains("Rithesh"));
//        System.out.println(assertTextAfterLogin.getText().contains("Rithesh"));
////        Assert.assertTrue(assertTextAfterLogin.getText().contains("Rithesh"));
//        Assert.assertTrue(true);
    }
}
