package com.neev.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    WebDriver driver = null;

    By firstName = By.xpath("//input[@id='customer_firstname']");
    By lastName = By.xpath("//input[@id='customer_lastname']");
    By passwd = By.xpath("//input[@id='passwd']");
    By address = By.xpath("//input[@id='address1']");
    By city = By.xpath("//input[@id='city']");
    By state = By.xpath("//select[@id='id_state']");
    By postCode = By.xpath("//input[@id='postcode']");
    By phoneNum = By.xpath("//input[@id='phone_mobile']");
    By registerButton = By.xpath("//span[normalize-space()='Register']");

    public SignUpPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void enterFirstName(String fname)
    {
        driver.findElement(firstName).sendKeys(fname);
    }
    public void enterLastName(String lname)
    {
        driver.findElement(lastName).sendKeys(lname);
    }
    public void enterPasswd(String paswd)
    {
        driver.findElement(passwd).sendKeys(paswd);
    }
    public void enterAddress(String addrs)
    {
        driver.findElement(address).sendKeys(addrs);
    }
    public void enterCity(String cityName)
    {
        driver.findElement(city).sendKeys(cityName);
    }
    public WebElement findState()
    {
        return driver.findElement(state);
    }
    public void enterPostCode(String pc)
    {
        driver.findElement(postCode).sendKeys(pc);
    }
    public void enterPhoneNum(String phone)
    {
        driver.findElement(phoneNum).sendKeys(phone);
    }
    public void clickOnRegisterButton()
    {
        driver.findElement(registerButton).click();
    }
}
