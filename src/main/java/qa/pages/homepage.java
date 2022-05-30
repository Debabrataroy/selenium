package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.baseclass.baseclass;
import qa.utils.helper;

public class homepage extends baseclass {
    WebDriver driver;
    By logo = By.xpath("//*[@id=\"_desktop_logo\"]//a");

    public homepage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogo()  {
        this.driver.findElement(logo).click();
    }

    public void clickCategory(String id){
        this.driver.findElement(By.xpath("//li[@id=\""+id+"\"]/a")).click();
    }

    public void clickLogin() throws InterruptedException {
        this.click(By.xpath("//div[@class=\"user-info\"]//a"));
    }
    public void scrollToBottom(){
        helper.scrollTo(driver.findElement(By.xpath("//input[@name=\"email\"]")) );
//        helper.scrollToBottom();
    }
    public void featureProduct(){
        this.click(By.xpath("//section[@class=\"featured-products clearfix\"]//a[text()=\"Hummingbird printed t-shirt\"]"));
    }

}
