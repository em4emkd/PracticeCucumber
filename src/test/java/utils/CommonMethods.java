package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import steps.PageInitializer;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {

  public static WebDriver driver;

  public void openBrowser () {
      ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);

      switch (ConfigReader.getPropertyValue("browser")) {

          case "chrome":
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
              break;
          case "firefox":
              WebDriverManager.chromedriver().setup();
              driver = new FirefoxDriver();
              break;
          default:
              throw new RuntimeException("Invalid browser");

      }
      driver.get(ConfigReader.getPropertyValue("url"));

  }

     public static void sendText(WebElement element, String textToSend) {
         element.clear();
         element.sendKeys(textToSend);

  }

  public static JavascriptExecutor getJSExecutor(){
      JavascriptExecutor js=(JavascriptExecutor)driver;
      return js;
  }

  public static void click(WebElement element){
      element.click();
  }

  public static void tearDown(){driver.quit();}

}