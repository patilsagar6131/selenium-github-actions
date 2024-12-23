package org.sele.git;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestFirst {

    @Test
    public void launch1() throws InterruptedException, MalformedURLException {
       try {
            URL url = new URL("http://localhost:4444/wd/hub");
            ChromeOptions options = new ChromeOptions();
            RemoteWebDriver driver = new RemoteWebDriver(url, options);
            driver.get("https://peter.sh/experiments/chromium-command-line-switches/");
            Thread.sleep(10000);
            driver.quit();
        }
       catch (MalformedURLException e) {
           System. out.println("Invalid Selenium URL: " + e.getMessage());
       } catch (Exception e) {
           System. out.println("An error occurred: " + e.getMessage());
       }

    }

    @Test
    public void launch2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.browserstack.com/docs/automate/selenium/github-actions");
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void launch3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://github.com/features/actions");
        Thread.sleep(4000);
        driver.quit();

    }
}
