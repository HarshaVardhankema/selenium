package SureshIT;

import com.codeborne.selenide.proxy.SelenideProxyServer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FILEUPLOAD {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);

        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);

        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys("D:\\Personal\\Screenshot 2025-0.png");//

       driver.findElement(By.id("file-submit")).click();
       Thread.sleep(6000);
    }


    }

