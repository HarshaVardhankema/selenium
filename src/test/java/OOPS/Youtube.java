package OOPS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

    public static void main (String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
        System.out.println("Title: " + driver.getTitle());

        driver.findElement(By.cssSelector("input.chakra-input.css-dhzvz6")).sendKeys("", Keys.ENTER);
        Thread.sleep(2000);




    }
}
