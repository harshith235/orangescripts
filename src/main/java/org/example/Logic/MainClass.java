package org.example.Logic;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.example.orangeHRMPages.AdminPage;
import org.example.orangeHRMPages.HomePage;
import org.example.orangeHRMPages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class MainClass extends CommonFunctions {

    public void launch () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(option);
//        ChromeOptions option = new ChromeOptions();
//        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        waitTime(5000);
    }

    public void login(String email,String password) throws InterruptedException {
        verifyElementPresent(LoginPage.objEmailInputField,"User Name Field");
        type(LoginPage.objEmailInputField,email,"UserName");
        type(LoginPage.objPassInputField,password,"Password");
        click(LoginPage.objLoginButton,"Login Button");
        waitTime(4000);
        verifyElementPresent(LoginPage.objInvalidCredentialErrorMsg,"Invalid Credential Error Msg");
    }

    public void admin() throws InterruptedException {
        click(HomePage.objSearchInputField,"Search Field");
        type(HomePage.objSearchInputField,"Admin","Search Input Field");
        click(HomePage.objMenu,"Admin Menu");
        waitTime(5000);
        verifyElementPresent(AdminPage.objAdminTxt,"Admin Title");
    }

    public void close(){
        driver.close();
    }
}
