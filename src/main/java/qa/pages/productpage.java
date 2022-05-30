package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import qa.baseclass.baseclass;
import qa.utils.helper;

import java.util.List;

public class productpage  extends baseclass {
    WebDriver driver;
    By variants = By.cssSelector(".product-variants");

    public productpage(WebDriver driver){
        this.driver = driver;
    }

    public void addToCart() throws InterruptedException {
        if(helper.findElement(driver,variants) != null){
            chooseVariant();
        }
        helper.findElement(driver,By.cssSelector("#quantity_wanted")).sendKeys("5");
        Thread.sleep(1000);
        helper.findElement(driver,By.cssSelector(".btn.btn-primary.add-to-cart")).click();
    }
    public void chooseVariant(){
        var allVariants = helper.findElements(driver,By.cssSelector(".product-variants div"));
        allVariants.forEach((e) ->{
          if  (helper.findElement(e,By.tagName("select")) != null){
              Select dropdown = new Select(helper.findElement(e,By.tagName("select")));
             if( dropdown.getOptions().size() > 1){
                 dropdown.selectByIndex(1);
             }
            }else if (helper.findElement(e,By.tagName("ul")) != null){
              var colorList = helper.findElements(driver,By.cssSelector(".product-variants ul li"));
              if(colorList.size()>1){
                  if(helper.findElement(driver,By.cssSelector(".product-variants ul>li:nth-child(2) input")) != null){
                      helper.findElement(driver,By.cssSelector(".product-variants ul>li:nth-child(2) input")).click();
                  }
              }
          }

        });

    }

}
