package qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import qa.baseclass.baseclass;

import java.util.List;

public class helper extends baseclass {
    public static void scrollTo(WebElement element){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true)", element);
    }
    public static void scrollToBottom(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public static WebElement findElement(WebDriver driver,By by){
        try
        {
            return driver.findElement(by);
        }
        catch (RuntimeException ee)
        {
            if (ee.toString().contains("NoSuchElementException"))
            {
                //steps
            }
            return null;
        }
    }
    public static WebElement findElement(WebElement driver,By by){
        try
        {
            return driver.findElement(by);
        }
        catch (RuntimeException ee)
        {
            if (ee.toString().contains("NoSuchElementException"))
            {
                //steps
            }
            return null;
        }
    }
    public static List<WebElement> findElements(WebDriver driver,By by){
        try
        {
            return driver.findElements(by);
        }
        catch (RuntimeException ee)
        {
            if (ee.toString().contains("NoSuchElementException"))
            {
                //steps
            }
            return null;
        }
    }
    public static List<WebElement> findElements(WebElement driver,By by){
        try
        {
            return driver.findElements(by);
        }
        catch (RuntimeException ee)
        {
            if (ee.toString().contains("NoSuchElementException"))
            {
                //steps
            }
            return null;
        }
    }
}
