package OOPS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindow {
    public static void main(String[] args) throws InterruptedException {
        // Set path to GeckoDriver if not set in system PATH
        // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();


      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 1. Open YouTube
        driver.get("https://www.youtube.com");
        Thread.sleep(3000);

        // 2. Open Flipkart in tab
        ((FirefoxDriver) driver).executeScript("window.open('https://www.flipkart.com', '_blank');");
        Thread.sleep(3000);

        // 3. Open Amazon in another new tab
        ((FirefoxDriver) driver).executeScript("window.open('https://www.amazon.in', '_blank');");
        Thread.sleep(3000);

        // 4. Get all window handles
        Set<String> allHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(allHandles);

        // Optional: Print all tab titles
        for (String handle : tabs) {
            driver.switchTo().window(handle);
            System.out.println("Page Title: " + driver.getTitle());
        }

        // 5. Switch to Amazon tab (usually last)
        driver.switchTo().window(tabs.get(2));
        System.out.println("Now on Amazon: " + driver.getCurrentUrl());
        Thread.sleep(6000);

        // 6. Switch to YouTube tab (first)
        driver.switchTo().window(tabs.get(0));
        System.out.println("Switched back to YouTube: " + driver.getCurrentUrl());
        Thread.sleep(6000);




        // Cleanup
        driver.quit();
    }
}