package SureshIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class hardcore {

    static String url = "https://midoc-patientapp-dev.azurewebsites.net/login";
    static String username = "jenson@gmail.com";
    static String Password = "midoc123";

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input.chakra-input.css-dhzvz6")).sendKeys(username, Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input.chakra-input.css-1rsaweq")).sendKeys(Password, Keys.ENTER);
        Thread.sleep(3000);

        System.out.println("Mouse over started");

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("img.chakra-image.css-ufoasi"))).click().perform();
        Thread.sleep(6000);

        driver.quit();
    }
}
