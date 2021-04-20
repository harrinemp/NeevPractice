package com.neev.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver = null;

    By searchTextbox = By.id("search_query_top");
    By searchIcon = By.name("submit_search");
    //By firstProduct = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//div[@class='product-image-container']");
    By firstProduct = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//h5[@itemprop='name']");

    public SearchPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterSearchText(String searchText)
    {
        driver.findElement(searchTextbox).sendKeys(searchText);
    }
    public void clickOnSearchIcon(){
        driver.findElement(searchIcon).click();
    }
    public boolean checkFirstProduct()
    {
        return driver.findElement(firstProduct).isDisplayed();
    }
    public void clickOnFirstProduct()
    {
        driver.findElement(firstProduct).click();
    }
}
