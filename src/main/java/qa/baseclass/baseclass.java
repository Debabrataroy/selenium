package qa.baseclass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import qa.utils.ListenerTest;

@Listeners(ListenerTest.class)
public class baseclass {
    protected static WebDriver driver;
    static Properties prop;

    public baseclass() {
        try {
            System.out.println(System.getProperty("user.dir") + "/src/main/java/qa/config/config.properties");
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/qa/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @BeforeSuite(alwaysRun = true)
    public void initClass() throws InterruptedException {
        DOMConfigurator.configure("log4j.xml");
        driver = browserSetup(prop.getProperty("browser"));
        driver.get(prop.getProperty("url"));

    }

    public WebDriver browserSetup(String browser){
        if ("chrome".equals(browser)) {
            System.out.println(browser);
        WebDriverManager.chromedriver().setup();
            driver = WebDriverManager.chromedriver().create();
        }
        return driver;
    }

    public void  TestMethod() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        System.out.println("Run Test Cases");
        Thread.sleep(10000);

    }

    public void runTest(By element ){
        driver.findElement(element);
    }
    public void click(By element ){
        driver.findElement(element).click();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
//        driver.quit();

    }

}

