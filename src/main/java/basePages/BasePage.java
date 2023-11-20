package basePages;

import org.openqa.selenium.WebDriver;


public class BasePage  {
   protected WebDriver driver;

    public BasePage(WebDriver d){
        driver = d;
    }

}
