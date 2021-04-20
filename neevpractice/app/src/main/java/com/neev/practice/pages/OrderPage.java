package com.neev.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
    WebDriver driver = null;

    By firstOrder = By.xpath("//td[@class='history_link bold footable-first-column']");
    By productName = By.xpath("//label[normalize-space()='Printed Summer Dress - Color : Yellow, Size : S']");

    public OrderPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnFirstOrder(){
        driver.findElement(firstOrder).click();
    }
    public String getProductName()
    {
        return driver.findElement(productName).getText();
    }

}
