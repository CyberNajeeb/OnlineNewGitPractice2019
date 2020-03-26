package hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

import java.time.LocalDate;

public class StatusCodes {
    WebDriver driver;

    @Test
    public void test12() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Status Codes")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.linkText("500")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='content']/div/ul/li[4]/a")).isDisplayed());

        driver.findElement(By.xpath("//*[@id='content']/div/ul/li[4]/a")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//p/text()[1]")).isDisplayed();


        System.out.println(driver.findElement(By.xpath("//p")).getText());
        if(driver.findElement(By.xpath("//p")).getText().contains( "This page returned a 500 status code")){
            System.out.println("Test passed");
        }
    }
    @Test
    public void test11(){

    }
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
