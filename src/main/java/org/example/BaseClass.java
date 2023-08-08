package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BaseClass {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        String path= System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator;
        System.setProperty("webdriver.chrome.driver",path+ "chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(option);
//        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        driver.findElement(By.id(""));
        driver.findElement(By.className(""));
        driver.findElement(By.name(""));
        driver.findElement(By.tagName(""));
        driver.findElement(By.xpath(""));

















//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Admin");
//        driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Harsha");




//        driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
//        System.out.println("Logo is displayed");
//        String email = "Admin12";
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
//        System.out.println("Typed " +email+ " into input email Field");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//        System.out.println("Typed Password int password input field");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        System.out.println("Clicked on Login Button");




    }
}
