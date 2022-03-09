package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test32_1 {
    WebDriver wd; //обращение к Webdriver

    @BeforeMethod
    public void preCondition(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:/Users/natal/ProjectQA32/QA-32StartWeb/chromedriver.exe");
        wd.navigate().to("https://trello.com/");
    }


    @Test
            public void test(){

        WebElement el = wd.findElement(By.tagName("a"));
        WebElement el1 = wd.findElement(By.tagName("div"));

        WebElement el2 = wd.findElement(By.id("hero"));
        WebElement el3 = wd.findElement(By.cssSelector("#hero"));

        WebElement el4 = wd.findElement(By.cssSelector("d-block float-left"));
        WebElement el5 = wd.findElement(By.cssSelector(".float-left"));

        WebElement link = wd.findElement(By.linkText("Sign up"));
        WebElement link1 = wd.findElement(By.cssSelector("[href='/signup']"));// поиск по атрибуту

    }



    @AfterMethod
    public void postConditions(){
        wd.close();
        wd.quit();
    }
}
