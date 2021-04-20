package com.neev.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver = null;

    By email = By.id("email");
    By password = By.id("passwd");
    By signInButton = By.xpath("//i[@class='icon-lock left']");
    By viewCustomerAcct = By.xpath("//a[@title='View my customer account']");
    By errorMessage = By.xpath("//p[normalize-space()='There is 1 error']");
    By emailCreate = By.xpath("//input[@id='email_create']");
    By createAcctButton = By.xpath("//span[normalize-space()='Create an account']");
    By orderHistory = By.xpath("//span[normalize-space()='Order history and details']");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void enterEmail(String emailid)
    {
        driver.findElement(email).sendKeys(emailid);
    }
    public void enterPassword(String pswd)
    {
        driver.findElement(password).sendKeys(pswd);
    }
    public void clickOnSignInButton()
    {
        driver.findElement(signInButton).click();
    }
    public void checkDisplayViewCustomerAcct()
    {
        driver.findElement(viewCustomerAcct).isDisplayed();
    }
    public String getErrorMessage()
    {
        return driver.findElement(errorMessage).getText();
    }
    public void enterEmailCreate(String emailID)
    {
        driver.findElement(emailCreate).sendKeys(emailID);
    }
    public void clickCreateAcctButton()
    {
        driver.findElement(createAcctButton).click();
    }
    public void clickOnOrderHistory()
    {
        driver.findElement(orderHistory).click();
    }
}

