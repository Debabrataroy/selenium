package qa.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import qa.baseclass.baseclass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ListenerTest implements ITestListener
    {

        @Override
        public void onFinish(ITestContext arg0) {
            Reporter.log("onFinish method finished"+arg0.getName());

            System.out.println("onFinish method finished");
            // TODO Auto-generated method stub

        }

        @Override
        public void onStart(ITestContext arg0) {
            Reporter.log("onStart method finished"+arg0.getName());

            // TODO Auto-generated method stub

        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
            Reporter.log("onTestFailedButWithinSuccessPercentage method finished"+arg0.getName());

            // TODO Auto-generated method stub

        }

        @Override
        public void onTestFailure(ITestResult arg0) {
            Reporter.log("onTestFailure method finished"+arg0.getName());
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
            String methodName = arg0.getName();
            if(!arg0.isSuccess()){
                File scrFile = ((TakesScreenshot) baseclass.driver).getScreenshotAs(OutputType.FILE);
                try {
                    String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/target/surefire-reports";
                    File destFile = new File((String) reportDirectory+"/failure_screenshots/"+methodName+"_"+formater.format(calendar.getTime())+".png");
                    FileUtils.copyFile(scrFile, destFile);
                    Reporter.log("<a href='"+ destFile.getAbsolutePath() + "'> <img src='"+ destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        @Override
        public void onTestSkipped(ITestResult arg0) {
            Reporter.log("onTestSkipped method finished"+arg0.getName());

            // TODO Auto-generated method stub

        }

        @Override
        public void onTestStart(ITestResult arg0) {
            System.out.println("onTestStart method finished"+arg0.getName());
            Reporter.log("onTestStart method finished"+arg0.getName());

            // TODO Auto-generated method stub

        }

        @Override
        public void onTestSuccess(ITestResult arg0) {
            Reporter.log("onTestSuccess method finished"+arg0.getName());

            // TODO Auto-generated method stub

        }
    }

