package AmazonPackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchProducts {
    WebDriver driver;

    @BeforeTest
    void openHomePage(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\StarGlobal\\Testing\\Drivers\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    void searchProduct1() throws InterruptedException {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 11 Pro Max");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    void searchProduct2() throws InterruptedException {

        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Canon EOS M50");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        Thread.sleep(3000);
    }

//    @Test(priority = 2)
//    void searchProduct3(){
//        driver.findElement(By.id("searchDropdownBox")).click();
//        driver.findElement(By.xpath("//option[contains(text(),'Baby')]")).click();
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("clothes");
//        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
//    }

}
