package org.example.orangeHRMPages;

import org.openqa.selenium.By;

public class LoginPage {
    //Email Input Field
    public static By objEmailInputField = By.xpath("//input[@name='username']");
    //Password Input Field
    public static By objPassInputField = By.xpath("//input[@name='password']")  ;
    //Login Button
    public static By objLoginButton = By.xpath("//button[@type='submit']");
    public static By objInvalidCredentialErrorMsg = By.xpath("//*[@class='oxd-text oxd-text--p oxd-alert-content-text']");
}
