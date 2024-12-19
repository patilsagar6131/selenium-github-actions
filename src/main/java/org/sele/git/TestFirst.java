package org.sele.git;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestFirst {

    @Test
    public void launch1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://en.wikipedia.org/wiki/Docker_(software)");
        Thread.sleep(4000);
        driver.quit();

    }

    @Test
    public void launch2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.browserstack.com/docs/automate/selenium/github-actions");
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void launch3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://github.com/features/actions");
        Thread.sleep(4000);
        driver.quit();

    }
}
