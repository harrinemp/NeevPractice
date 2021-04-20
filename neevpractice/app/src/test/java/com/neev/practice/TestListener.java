package com.neev.practice;

import com.neev.practice.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestListener extends BaseTest implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        try {
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File(""+result.getName()+".png"));
           // FileUtils.copyFile(file, new File(System.getProperty("user.dir")+File.separator +
            //        result.getName()+"_"+result.getEndMillis()+".png"));
            System.out.println("*******Screenshot captured********");
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
    public void onFinish(ITestContext context) {}

    public void onTestStart(ITestResult result) {   }

    public void onTestSuccess(ITestResult result) {   }

    public void onTestSkipped(ITestResult result) {   }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }

    public void onStart(ITestContext context) {   }
}
