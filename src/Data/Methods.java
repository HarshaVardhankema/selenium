package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods extends GeneralData {
    public WebDriver driver;

    public void OpenApplication() {
        driver = new FirefoxDriver();  // Fixed: assign to class variable
        driver.get(url);
        System.out.println("Application opened");
    }

    public void OpenBrowser() throws InterruptedException {
        driver.findElement(By.cssSelector("input.chakra-input.css-dhzvz6")).sendKeys(username, Keys.ENTER);
        System.out.println("Username entered");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input.chakra-input.css-1rsaweq")).sendKeys(password, Keys.ENTER);
        System.out.println("Password entered");
        Thread.sleep(3000);
    }

    public void CloseApplication() {
        driver.quit();
        System.out.println("Application closed");
    }
}
