package qa.pages;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.baseclass.baseclass;
import qa.utils.action;
import qa.utils.log;


public class homepageTest extends baseclass {
    public homepageTest(){
        super();
    }
    homepage homeObj;
    @BeforeClass
    void setUp(){
        homeObj = new homepage(driver);
        log.startTestCase("Start homepageTest");

    }

    @Test(enabled=false)
    void clickHomeLogo() throws InterruptedException {
        homeObj.clickLogo();
    }

    @Test(enabled=false)
    void clickCategory(){
        homeObj.clickCategory("category-3");

    }
    @Test(enabled=false)
    void scroll(){
//        Reporter.log("We used Google Chrome Ver 80 for this test");
        Assert.assertEquals(true, true);

//        homeObj.scrollToBottom();
//        action.rightClick(driver.findElement(By.id("rightClickBtn")));
    }

    @Test(enabled=false)
    void  clickLogin() throws InterruptedException {
        log.info("Click on Login");
        homeObj.clickLogin();
    }
    @Test
    void clickProduct(){
        homeObj.featureProduct();
    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        log.endTestCase("End homepageTest");

        super.tearDown();
    }

}
