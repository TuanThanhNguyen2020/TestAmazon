import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenAmazonHomePage {
    WebDriver driver;

    @BeforeClass
    void openHomePage(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\StarGlobal\\Testing\\Drivers\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
    }



}
