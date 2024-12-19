package org.sele.git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFirst {

    @Test
    public void launch1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MSI1\\IdeaProjects\\seleniumGithubActions\\src\\main\\java\\org\\sele\\git\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.javatpoint.com/selenium-webdriver-first-test-case");
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void launch2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MSI1\\IdeaProjects\\seleniumGithubActions\\src\\main\\java\\org\\sele\\git\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/docs/automate/selenium/github-actions");
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    public void launch3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MSI1\\IdeaProjects\\seleniumGithubActions\\src\\main\\java\\org\\sele\\git\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/features/actions");
        Thread.sleep(4000);
        driver.quit();
    }
}
