package com.neev.practice.myStore;

import com.neev.practice.BaseTest;
import com.neev.practice.TestListener;
import com.neev.practice.pages.HomePage;
import com.neev.practice.pages.LoginPage;
import com.neev.practice.pages.ProductPage;
import com.neev.practice.pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)

public class Search extends BaseTest {

    @Test
    public void searchTest() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.clickOnSignInLink();

        loginPage.enterEmail("harrinemp@gmail.com");
        loginPage.enterPassword("harrine");
        loginPage.clickOnSignInButton();

        loginPage.checkDisplayViewCustomerAcct();  //Verifying successfull login

        searchPage.enterSearchText("abc");
        searchPage.clickOnSearchIcon();
        Assert.assertTrue(searchPage.checkFirstProduct());

        searchPage.clickOnFirstProduct();
        //Assert.assertEquals(driver.getTitle(),"Printed Summer Dress - My Store");

        productPage.clickOnAddToCart();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Product successfully added to your shopping cart']")));

        Assert.assertTrue(productPage.checkProductAddedMsg());
       /* driver.findElement(By.className("cross")).click();
        driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
        Assert.assertEquals(driver.getTitle(),"Order - My Store");*/

    }
}
