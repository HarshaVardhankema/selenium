package SureshIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsPOPUPS {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert a = driver.switchTo().alert();
        a.accept();



    }

    }
