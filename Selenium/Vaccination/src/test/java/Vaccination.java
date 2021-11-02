import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Vaccination {

    WebDriver driver;
//    String BASE_URL = "https://selfregistration.cowin.gov.in/";

    public static void main(String[] args) throws InterruptedException {

        String BASE_URL = "https://selfregistration.cowin.gov.in/";
        String MOBILE_NUMBER = "9482039280";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(BASE_URL);

        WebElement mobile_number = driver.findElement(By.xpath("//input[@formcontrolname='mobile_number']"));
        mobile_number.sendKeys(MOBILE_NUMBER);

        WebElement get_otp = driver.findElement(By.xpath("//ion-button[@type='button']"));
        get_otp.click();

        Thread.sleep(30000);

        WebElement shedule_click = driver.findElement(By.xpath("//a[@href='/dashboard']"));
        shedule_click.click();
        System.out.println("shedule_clicked");

//        Thread.sleep(3000);


        WebElement search_by_district_tab_switch = driver.findElement(By.xpath("//div[@data-checked='Search By District']"));
        search_by_district_tab_switch.click();
        System.out.println("search_by_district_tab_switch clicked");

        Thread.sleep(3000);


        //div[contains(@class,'mat-select-value ng-tns-c101')]


        List<WebElement> select_state_dropdowns = driver.findElements(By.xpath("//div[contains(@class,'mat-select-value ng-tns-c101')]"));
        select_state_dropdowns.get(0).click();
        System.out.println("select_state_dropdowns clicked");
        Thread.sleep(3000);


        WebElement select_karnataka = driver.findElement(By.xpath("//span[contains(text(), 'Karnataka')]"));
        select_karnataka.click();
        System.out.println("select_karnataka clicked");
        Thread.sleep(3000);


        List<WebElement> select_district_dropdowns = driver.findElements(By.xpath("//div[contains(@class,'mat-select-value ng-tns-c101')]"));
        select_district_dropdowns.get(1).click();
        System.out.println("select_district_dropdowns clicked");
        Thread.sleep(3000);


        WebElement select_dakshina_kannada = driver.findElement(By.xpath("//span[contains(text(), 'Dakshina Kannada')]"));
        select_dakshina_kannada.click();
        System.out.println("select_dakshina_kannada clicked");
        Thread.sleep(3000);


//        Boolean result = slotChecking(driver);
//        System.out.println(result);

        WebElement search_button_click = driver.findElement(By.xpath("//ion-button[@class='pin-search-btn district-search md button button-solid ion-activatable ion-focusable hydrated']"));
        search_button_click.click();
        System.out.println("search_button_click clicked");

        Thread.sleep(3000);

        WebElement filter_click = driver.findElement(By.xpath("//label[contains(text(), 'Age 18+')]"));
        filter_click.click();
        System.out.println("filter_click clicked");

        Thread.sleep(3000);




    }

}
