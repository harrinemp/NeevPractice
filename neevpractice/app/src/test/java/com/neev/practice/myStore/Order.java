package com.neev.practice.myStore;

import com.neev.practice.BaseTest;
import com.neev.practice.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Order extends BaseTest {

    @Test
    public void orderTest(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        //ProductPage productPage = new ProductPage(driver);
        OrderPage orderPage = new OrderPage(driver);

        homePage.clickOnSignInLink();

        loginPage.enterEmail("harrinemp@gmail.com");
        loginPage.enterPassword("harrine");
        loginPage.clickOnSignInButton();

        loginPage.checkDisplayViewCustomerAcct();

        loginPage.clickOnOrderHistory();
        orderPage.clickOnFirstOrder();

        Assert.assertEquals(orderPage.getProductName(),"Printed Summer Dress - Color : Yellow, Size : S");
    }
}
