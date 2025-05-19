package SureshIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(2000);

        Select st = new Select(driver.findElement(By.id("dropdown")));
        st.selectByVisibleText("Option 1");
        Thread.sleep(2000);
    }
}
