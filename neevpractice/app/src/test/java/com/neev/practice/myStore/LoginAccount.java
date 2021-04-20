package com.neev.practice.myStore;

import com.neev.practice.BaseTest;
import com.neev.practice.pages.HomePage;
import com.neev.practice.pages.LoginPage;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginAccount extends BaseTest {

   @DataProvider(name = "login")
    public static Object[][] test1()
    {
        return new Object[][]{{"harrinemp@gmail.com","harrine"},{"harrinemp@gmail.com","harrinemp"}};
    }
    @Test(dataProvider = "login")
    public void browserLoginTest(String username, String pwd)  {


        //Assert.assertEquals(driver.getTitle().trim(),"My Store","Verification for Page title");

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickOnSignInLink();

        loginPage.enterEmail(username);
        loginPage.enterPassword(pwd);
        loginPage.clickOnSignInButton();

        try
        {
            loginPage.checkDisplayViewCustomerAcct();  //Verifying successfull login

        }catch (NoSuchElementException e)
        {
            Assert.assertEquals(loginPage.getErrorMessage(),"There is 1 error","Verifying error message");
        }

    }

}

