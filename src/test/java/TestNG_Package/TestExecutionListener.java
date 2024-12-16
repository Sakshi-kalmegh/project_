package TestNG_Package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.Test;


class TestExecutionListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test  " + result.getName());
    }

    @Override
    public void onStart(ITestContext contex) {
        System.err.println("Test Passed: " );
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.err.println("Test Failed: " );
    }

   
    }
