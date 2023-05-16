package biz.website_search;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Collections;
import java.util.List;


public class Check8a{
    public void checkShoesOn8A(String brandName, String model, String size) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://8a.pl/");
        driver.findElement(By.xpath("//button[contains(text(),'Zgoda')]")).click();
        driver.findElement(By.id("search")).sendKeys(brandName + " " + model + Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(), '" + brandName + " " + model + "')]")).click();
        String price = driver.findElement(By.xpath("//span[@class='special-price']")).getText();
        List<String> sizes = Collections.singletonList(driver.findElement(By.xpath("//*[@id='product-options-wrapper']/div/div/div/div")).getText());
        for (String size8a : sizes) {
            if (size8a.contains(size)) {
                System.out.println("Your size is available");
            } else {
                System.out.println("Your size is not available");
            }
        }
        System.out.println("The current price is: " + price);
    }
}

