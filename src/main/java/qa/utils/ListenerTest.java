package qa.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

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

            // TODO Auto-generated method stub

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

