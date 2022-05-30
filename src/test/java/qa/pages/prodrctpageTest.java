package qa.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.baseclass.baseclass;
import qa.utils.log;

public class prodrctpageTest extends baseclass {
    public prodrctpageTest(){
        super();
    }
    productpage productObj;
    @BeforeClass
    void setUp(){
        productObj = new productpage(driver);
        log.startTestCase("Start prodrctpageTest");

    }
    @Test
    public void addToCard() throws InterruptedException {
        productObj.addToCart();
    }
}
