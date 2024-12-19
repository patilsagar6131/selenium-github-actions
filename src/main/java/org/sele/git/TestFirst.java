package org.sele.git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFirst {

  @Test
    public void launch1(){
        System.out.println(System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/java/org/sele/git/chromedriverlinux");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.javatpoint.com/selenium-webdriver-first-test-case");

    }
    @Test
    public void launch2(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MSI1\\IdeaProjects\\seleniumGithubActions\\src\\main\\java\\org\\sele\\git\\chromedriverlinux");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/docs/automate/selenium/github-actions");

    }
    @Test
    public void launch3(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MSI1\\IdeaProjects\\seleniumGithubActions\\src\\main\\java\\org\\sele\\git\\chromedriverlinux");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/features/actions");



    }
}
