package biz.website_search;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class CheckPolarsport {

    public void checkShoesOnPolarsport(String brandName, String model, String size) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.polarsport.pl/");
        driver.findElement(By.id("search")).sendKeys(brandName + " " + model + Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(), '" + brandName.toUpperCase() + " " + model.toUpperCase() + "')]")).click();
        String price = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[6]/div/div[3]/div[1]/div/span[2]/span/span[2]/span")).getText();
        List<String> sizes = Collections.singletonList(driver.findElement(By.xpath("//*[@id='product-options-wrapper']/div[1]/div/div[1]/div")).getText());
        for (String sizePolarsport : sizes) {
            if (sizePolarsport.contains(size)) {
                System.out.println("Your size is available");
            } else {
                System.out.println("Your size is not available");
            }
        }
        System.out.println("The current price is: " + price);

    }
}
