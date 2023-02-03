package basePages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static entidades.TimerSleeper.timesleep;



public class BasePage {
   protected WebDriver driver;

    public BasePage(WebDriver browser){
        System.setProperty("webdriver.chrome.driver","/home/familia/Drivers/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        browser = driver ;
    }

    public void saindo(){
        driver.quit();
    }

}
