package qa.pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.baseclass.baseclass;
import qa.utils.log;

public class loginpageTest extends baseclass {
    loginpage loginObj;
public loginpageTest(){
    super();
}


    @BeforeClass
    void setUp(){
        loginObj = new loginpage(driver);
        log.startTestCase("Start loginpageTest");

    }
@Test(enabled = true)
void loginPreform(){
       loginObj.loginPerform();
}
@Test(enabled = false)
void forgetPassword(){
        loginObj.forgotpassword();

}
    @AfterClass
    public void tearDown() throws InterruptedException {
        log.endTestCase("End loginpageTest");

        super.tearDown();
    }
}
