import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchProducts {
    WebDriver driver;
    @Test
    void searchProducts(){
        driver.findElement(By.id("https://www.amazon.com/")).sendKeys("iPhone 11 Pro Max");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
    }
}
