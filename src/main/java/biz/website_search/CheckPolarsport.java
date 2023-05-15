package biz.website_search;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckPolarsport {

    public void checkShoesOnPolarsport(String brandName, String model, double size) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.polarsport.pl/");
        driver.findElement(By.id("search")).sendKeys(brandName + " " + model + Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(), '" + brandName.toUpperCase() + " " + model.toUpperCase() + "')]")).click();
    }
}
