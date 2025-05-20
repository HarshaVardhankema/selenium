package SureshIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
         WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://afd.calpoly.edu/web/sample-tables");
        // Wait for the page to load
        Thread.sleep(5000);

      //  int rows = driver.findElements(By.xpath("//td[text()=\"Farmer's Market new Embassy Suites\"]")).size();
        int row = driver.findElements(By.xpath("/html/body/div[2]/div[1]/table[5]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("/html/body/div[2]/div[1]/table[5]/tbody/tr[1]/th")).size();
        int rows_col = driver.findElements(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/th")).size();
        System.out.println("Number of rows: " + row);
        System.out.println("Number of columns: " + col);
        System.out.println("Number of rows and columns: " + rows_col);
        String celldata = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table[5]/tbody/tr[2]/td[2]")).getText();
        System.out.println("Cell data: " + celldata);
        String celldata1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table[5]/tbody/tr[2]/td[3]")).getText();
        System.out.println("Cell data1: " + celldata1);
        for (int i = 1; i <= row; i++) {
            {
                String data = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table[5]/tbody/tr["+i+"]")).getText();
                System.out.print(data + " ");
            }
            System.out.println();
        }

      //  Thread.sleep(5000);



    }

}
