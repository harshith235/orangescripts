package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import  org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Alert {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, AWTException {
        launch();
        Thread.sleep(5000);
//        WebElement element = driver.findElement(By.xpath("(//*[@data-toggle='dropdown'])[3]"));
//        Actions action = new Actions(driver);
//        action.moveToElement(element).build().perform();

        WebElement from = driver.findElement(By.xpath("//*[@alt='The peaks of High Tatras']"));
        WebElement to = driver.findElement(By.xpath("//*[@id='trash']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(from,to).build().perform();



    }

    public static void launch(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
    }
}
