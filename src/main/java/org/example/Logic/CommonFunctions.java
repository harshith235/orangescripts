package org.example.Logic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
public static WebDriver driver;
    public static void click(By byLocator, String ValidationText) {
        try {
            WebElement element = driver.findElement(byLocator);
            element.click();
            System.out.println("Clicked on : " + ValidationText);
        }catch(Exception e){
            System.out.println("Not Clicked on : " +ValidationText);
        }
    }

    public static void type(By byLocator,String input,String ValidationText){
        try{
            WebElement element = driver.findElement(byLocator);
            element.sendKeys(input);
            System.out.println("Typed "+input+" value into "+ValidationText+" Field");
        }catch(Exception e){
            System.out.println("Not Typed "+input+" value into "+ValidationText+" Field");
        }
    }


    public static boolean verifyElementPresent(By byLocator,String ValidationText){
        try {
            WebElement element = driver.findElement(byLocator);
            element.isDisplayed();
            System.out.println(ValidationText+ " is displayed");
            return true;
        }catch (Exception e){
            System.out.println(ValidationText+ " is not displayed");
            return false;
        }
    }

    public static void waitTime(int milliSeconds) throws InterruptedException {
        Thread.sleep(milliSeconds);
    }

    public static void scroll(String direction, int length, int count){
        for(int i=1;i<=count;i++) {
            if (direction == "vertical") {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("window.scrollBy(0," + length + ")", "");
                System.out.println("Scrolled in " + direction + " direction " + count + " times");
            }
            if (direction == "Horizontal") {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("window.scrollBy(" + length + ",0)", "");
                System.out.println("Scrolled in " + direction + " direction " + count + " times");
            }
        }
    }

}
