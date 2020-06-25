import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectByVisibleText {

    @Test
    void chooseProduct(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\StarGlobal\\Testing\\Drivers\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.thegioididong.com/dtdd");
        driver.manage().window().maximize();

        Select select = new Select(driver.findElement(By.xpath("//div[@class='fr sort expand']")));
        select.selectByVisibleText("Giá cao đến thấp");
    }
}
