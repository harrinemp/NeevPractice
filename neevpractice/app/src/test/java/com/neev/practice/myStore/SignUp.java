package com.neev.practice.myStore;

import com.neev.practice.BaseTest;
import com.neev.practice.pages.HomePage;
import com.neev.practice.pages.LoginPage;
import com.neev.practice.pages.SignUpPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignUp extends BaseTest {
    @Test
    public void signUpTest()  {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        homePage.clickOnSignInLink();

        loginPage.enterEmailCreate("kavit@gmail.com");
        loginPage.clickCreateAcctButton();


        signUpPage.enterFirstName("K");
        signUpPage.enterLastName("A");

        signUpPage.enterPasswd("Kavitha");
        signUpPage.enterAddress("abc");
        signUpPage.enterCity("xyz");


        Select se = new Select(signUpPage.findState());
        se.selectByVisibleText("Alaska");

        signUpPage.enterPostCode("12345");
        signUpPage.enterPhoneNum("123");

        signUpPage.clickOnRegisterButton();

        loginPage.checkDisplayViewCustomerAcct();

    }
}