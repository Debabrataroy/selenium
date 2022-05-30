package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.baseclass.baseclass;

public class loginpage extends baseclass {
    WebDriver driver;

    @FindBy(xpath = "//input[@id=\"field-email\"]")
    WebElement userName;

    @FindBy(xpath = "//input[@id=\"field-password\"]")
    WebElement password;

    public loginpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void loginPerform(){
        userName.sendKeys("dev@test.com");
        password.sendKeys("12345");
        this.click(By.xpath("//button[@id=\"submit-login\"]"));
    }

    public  void  forgotpassword(){
        this.click(By.xpath("//div[@class=\"forgot-password\"]//a"));
    }
}
