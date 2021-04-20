package com.neev.practice.training;

import org.testng.annotations.*;

public class NewTest {

    @BeforeSuite
    public void beforeTestSuite()
    {
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void beforeTestClass()
    {
        System.out.println("Before NewTest Class");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before NewTest ");
    }

    @Test
    public void newTestCase()
    {
        System.out.println("****** in Test Annotation ******");

    }

    @Test
    public void newTestCase1()
    {
        System.out.println("****** in Test Annotation 1 ******");

    }
}
