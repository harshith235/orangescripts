package org.example.orangeHRMPages;

import org.openqa.selenium.By;

public class HomePage {


    public static By objSearchInputField = By.xpath("//*[@placeholder='Search']");

    public static By objMenu = By.xpath("//*[@class='oxd-main-menu-item']");

    public static By objJobDropdown = By.xpath("//*[@class='--active oxd-topbar-body-nav-tab --parent']");
    public static By objTime = By.xpath("(//*[@class='oxd-text oxd-text--p'])[1]");
}
