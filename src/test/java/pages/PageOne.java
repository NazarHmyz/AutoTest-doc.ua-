package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import settings.ChromeSettings;

public class PageOne extends ChromeSettings {
    private WebDriver driver;

    public PageOne(WebDriver driver) {
        this.driver = driver;
    }

    By yearLocator = By.xpath("//a[@data-year=\"2002\" and 1]");
    By markaLocator = By.xpath("//a[text()='BMW']");
    By modelLocator = By.xpath("//a[text()='5 Series']");
    By cuzovLocator = By.xpath("//a[text()='седан']");
    By engineLocator = By.xpath("//a[text()='2.5 Дизель']");
    By enginemodLocator = By.xpath("//a[text()='525 tds 143 л.с.']");
    By pageNameLocator = By.xpath("//H1[text()='Каталог запчастей на BMW 5 Series 2002']");

    public void selectAuto() {
        WebElement year = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(yearLocator));
        year.click();
        System.out.println("Year selected");
        WebElement marka = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(markaLocator));
        marka.click();
        System.out.println("Marka selected");
        WebElement model = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(modelLocator));
        model.click();
        System.out.println("Model selected");
        WebElement cuzov = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(cuzovLocator));
        cuzov.click();
        System.out.println("Cuzov selected");
        WebElement engine = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(engineLocator));
        engine.click();
        System.out.println("Engine selected");
        WebElement enginemod = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(enginemodLocator));
        enginemod.click();
        System.out.println("Enginemod selected");

    }

    public void assertPage() {
        Assert.assertEquals("Wrong page", driver.findElement(pageNameLocator).getText(), "Каталог запчастей на BMW 5 Series 2002");
        System.out.println("Page is True");
    }
}
