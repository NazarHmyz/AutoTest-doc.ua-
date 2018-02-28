package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageOne;
import settings.ChromeSettings;

public class TestOne extends ChromeSettings {

    @Test
    public void selectAutoTest() throws InterruptedException {
        PageOne pageOne = new PageOne(driver);
        pageOne.selectAuto();
        pageOne.assertPage();
    }
}
