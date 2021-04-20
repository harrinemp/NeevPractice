package com.neev.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebDriver driver = null;

    By addToCartButton = By.id("add_to_cart");
    By productAddedMessage = By.xpath("//h2[normalize-space()='Product successfully added to your shopping cart']");

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnAddToCart()
    {
        driver.findElement(addToCartButton).click();
    }
   public boolean checkProductAddedMsg(){
        return driver.findElement(productAddedMessage).isDisplayed();
    }
}
