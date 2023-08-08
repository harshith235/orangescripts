package org.example.Logic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class AppiumLaunch {
    public AppiumDriverLocalService service;
    public static AppiumDriver<MobileElement> driver;

    public void appLaunch() throws InterruptedException, MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "1478ade0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability("appPackage", "com.cricbuzz.android");
        capabilities.setCapability("appActivity", "com.cricbuzz.android.lithium.app.view.activity.NyitoActivity");
//        driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4725/wd/hub"),capabilities);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(5000);
    }

    public void valiedEmailandPassword() throws InterruptedException {
        driver.findElement(By.xpath("//*[@resource-id='com.cricbuzz.android:id/tvLogin']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@resource-id='com.cricbuzz.android:id/editTxtEmail']")).sendKeys("harshithragirc1@gmail.com");
        driver.findElement(By.xpath("//*[@resource-id='com.cricbuzz.android:id/editTxtPhone']")).sendKeys("7760796679");
        driver.findElement(By.xpath("//*[@resource-id='com.cricbuzz.android:id/btnContinue']")).click();
    }

    public  void aboutUs() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@resource-id='com.cricbuzz.android:id/icon'])[5]")).click();
        Thread.sleep(5000);
        scrollByVerticalDimensions();
        driver.findElement(By.xpath("//*[@text='About Cricbuzz']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout'])[21]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout'])[5]")).click();
    }

    public void upCommingMatches()
    {
        driver.findElement(By.xpath("(//*[@class='android.widget.FrameLayout'])[16]")).click();
        driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout'])[6]")).click();
    }

    public static void scrollByVerticalDimensions()
    {
        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.getHeight();
        int width = dimension.getWidth();
        int x = width / 2;
        int start_y = (int) (height * 0.8);
        int end_y = (int) (height * 0.2);
        TouchAction action = new TouchAction(driver);
        action.press(point(x, start_y)).waitAction(waitOptions(ofSeconds(3))).moveTo(point(x, end_y)).release().perform();

    }
    public static void scrollByHorizontalDimensions()
    {
        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.getHeight();//10
        int width = dimension.getWidth();//1
        int y= (int) ((height/2)*0.1);
        int start_x = (int) (width* 0.8);
        int end_x = (int) (width * 0.2);
        TouchAction action = new TouchAction(driver);
        action.press(point(start_x,y)).waitAction(waitOptions(ofSeconds(3))).moveTo(point(end_x,y)).release().perform();
        System.out.println("horizontal action done");

    }

}
