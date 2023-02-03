package basePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage  {
   protected WebDriver driver;



    public BasePage(WebDriver d){
        driver = d;
    }

}
