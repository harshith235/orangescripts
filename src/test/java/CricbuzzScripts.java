import io.appium.java_client.AppiumDriver;
import org.example.Logic.AppiumLaunch;
import org.example.Logic.MainClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.example.Logic.AppiumLaunch.driver;

public class CricbuzzScripts {
    AppiumLaunch appiumLaunch = new AppiumLaunch();
    //@BeforeTest
   // public void beforeTestLaunch() throws InterruptedException {
        //mainClass.launch();
    //}

    //    @Test(priority = 1)
//    public void loginWithInvalidCredentials() throws InterruptedException {
//        mainClass.login("HHHH","admin123");
//    }
    @BeforeMethod()
    public void launch() throws InterruptedException, MalformedURLException {
        appiumLaunch.appLaunch();
    }
//
    @Test(priority = 1)
    public void validLogin() throws InterruptedException {
        appiumLaunch.valiedEmailandPassword();
    }

    @AfterMethod()
    public void appReset()
    {
        driver.quit();
    }

    @Test(priority = 2)
    public void about() throws InterruptedException {
    appiumLaunch.aboutUs();
    }
   /* @Test(priority = 3)
    public void upComming() throws InterruptedException {
        appiumLaunch.upCommingMatches();
    }*/

}

