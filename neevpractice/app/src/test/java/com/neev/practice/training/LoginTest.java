package com.neev.practice.training;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    @BeforeMethod
    public void beforeLoginMethod()
    {
        System.out.println("Before Login Method");
    }

    @BeforeTest
    public void beforeLoginTest()
    {
        System.out.println("Before Login Test");
    }

    @BeforeClass
    public void beforeLoginClass()
    {
        System.out.println("Before Login Class");
    }

    @Test
    public void loginTestCase()
    {
        System.out.println("****** in Test Annotation - Login ******");
        //Assert.False("Error");
        // Assert.assertTrue(false);
    }

    @Test
    public void loginTestCase1()
    {
        System.out.println("****** in Test Annotation - Login 1 ******");
    }

    @AfterMethod
    public void afterLoginMethod()
    {
        System.out.println("After Login Method");
    }

    @AfterTest
    public void afterLoginTest()
    {
        System.out.println("After Login Test");
    }

    @AfterClass
    public void afterLoginClass()
    {
        System.out.println("After Login Class");
    }

}

