package settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeSettings {
    protected WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test Start");
        driver.get("http://dok.dbroker.com.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    };
    @After
    public  void tearDown() {
        driver.close();
        System.out.println("Test Completed");
    }
}
