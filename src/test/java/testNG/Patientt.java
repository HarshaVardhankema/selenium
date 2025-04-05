package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Patientt {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.firefoxdriver().setup(); // Setup Firefox driver
        driver = new FirefoxDriver();   // Fixed: using class-level driver
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void openLoginPage() throws InterruptedException {
        driver.get("https://midoc-patientapp-dev.azurewebsites.net/login");
        Thread.sleep(3000); // Use WebDriverWait in real-time
    }

    @Test(priority = 2)
    public void enterEmail() throws InterruptedException {
        driver.findElement(By.cssSelector("input.chakra-input.css-dhzvz6")).sendKeys("lavanya06@gmail.com");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void clickContinueButtonEmail() throws InterruptedException {
        driver.findElement(By.xpath("//button[.='Continue']")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("midoc123");
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void clickContinueButtonPassword() throws InterruptedException {
        driver.findElement(By.xpath("//button[.='Continue']")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    public void navigateToMyHealth() throws InterruptedException {
        driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/myhealth");
        Thread.sleep(3000);
    }

    @Test(priority = 7)
    public void navigateToVitals() throws InterruptedException {
        driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/vitals");
        Thread.sleep(3000);
    }



        @Test(priority = 8)
        public void addWeight() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/button/div[1]")).click();
            Thread.sleep(5000);
        }

        @Test(priority = 9)
        public void enterWeightValue() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div/input")).click();
            Thread.sleep(5000);
        }

        @Test(priority = 10)
        public void selectWeightFromDropdown() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[3]/div/button[93]")).click();
            Thread.sleep(5000);
        }

        @Test(priority = 11)
        public void clickAddWeightButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(5000);
        }

        @Test(priority = 12)
        public void clickAIButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
            Thread.sleep(5000);
        }

        @Test(priority = 13)
        public void clickSkipButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
            Thread.sleep(5000);
        }

        @Test(priority = 14)
        public void addHeight() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/button/div[1]")).click();
            Thread.sleep(5000);
        }

        @Test(priority = 15)
        public void enterFeetValue() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div/input")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 16)
        public void selectFeetFromDropdown() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[3]/div/button[5]")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 17)
        public void enterInchesValue() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[4]/div/input")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 18)
        public void selectInchesFromDropdown() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div[5]/div/button[8]")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 19)
        public void clickAddHeightButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 20)
        public void clickAIHeightButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 21)
        public void clickAISkipButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 22)
        public void addRespiratoryRate() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/button/div[1]")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 23)
        public void enterRespiratoryValue() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 24)
        public void selectRespiratoryFromDropdown() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[5]")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 25)
        public void clickAddRespiratoryButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 26)
        public void clickAIRespiratoryButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 27)
        public void clickRespiratorySkipButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
            Thread.sleep(6000);
        }

        @Test(priority = 28)
        public void addBodyTemperature() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/button/div[1]")).click();
            Thread.sleep(9000);
        }

        @Test(priority = 29)
        public void enterBodyTemperatureValue() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
            Thread.sleep(9000);
        }

        @Test(priority = 30)
        public void selectBodyTemperatureFromDropdown() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[4]")).click();
            Thread.sleep(9000);
        }

        @Test(priority = 31)
        public void clickAddBodyTemperatureButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(9000);
        }

        @Test(priority = 32)
        public void clickAIBodyTemperatureButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[2]/div/button[1]")).click();
            Thread.sleep(9000);
        }

        @Test(priority = 33)
        public void clickBodyTemperatureSkipButton() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
            Thread.sleep(9000);
        }

        @Test(priority = 34)
        public void addOxygen() throws InterruptedException {
            // Add oxygen
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[3]/button/div[1]")).click();
            Thread.sleep(3000);
            // Enter value
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
            Thread.sleep(3000);
            // Select from dropdown
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[55]")).click();
            Thread.sleep(3000);
            // Add oxygen button
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(5000);
            // AI button
            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
            Thread.sleep(5000);
            // Skip button
            driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
            Thread.sleep(5000);
        }


        @Test(priority = 35)
        public void addHeartRate() throws InterruptedException {
            // Add heart rate
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/div[4]/div[1]/div/div[3]/button/div[1]")).click();
            Thread.sleep(3000);
            // Enter value
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[2]/div/input")).click();
            Thread.sleep(3000);
            // Select from dropdown
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/div/div[2]/div[3]/div/button[25]")).click();
            Thread.sleep(3000);
            // Add heart rate button
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(5000);
            // AI button
            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div/div[3]/div/button[1]")).click();
            Thread.sleep(5000);
            // Skip button
            driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/footer/div/div/button[3]")).click();
            Thread.sleep(5000);
        }

        @Test(priority = 36)
        public void addConditions() throws InterruptedException {
            // Conditions
            driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/conditions");
            Thread.sleep(5000);
            // Add conditions
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/button")).click();
            Thread.sleep(3000);
            // Check box of condition
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div/div/label[1]/div/div[2]/label")).click();
            Thread.sleep(3000);
            // Continue button
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);
            // Select a date
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div/div[1]/input")).click();
            Thread.sleep(3000);
            // Choosing the year dropdown
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/select")).click();
            Thread.sleep(3000);
            // Selecting the year
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/select/option[121]")).click();
            Thread.sleep(3000);
            // Choosing the month
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/select")).click();
            Thread.sleep(3000);
            // Selecting the month
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/select/option[4]")).click();
            Thread.sleep(3000);
            // Selecting the date
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[5]/button")).click();
            // Add condition button
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);
        }
        // surgeries
        @Test(priority = 37)
        public void addSurgeryDetails() throws InterruptedException, AWTException {
            driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/surgeries");
            Thread.sleep(5000);

            // Add new surgery
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div/div/label[31]/div/div[2]/label")).click();
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);

            // Fill in surgeon and hospital details
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[2]/div/input")).sendKeys("Nivas Reddy", Keys.TAB);
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[3]/input")).sendKeys("Apollo Hospital");
            Thread.sleep(3000);

            // Upload image file using Robot
            WebElement galleryButton = driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/button"));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].click();", galleryButton);
            uploadFile("C:\\Users\\hneth\\OneDrive\\Desktop\\Virtus IT\\smsa\\pics\\download (1).jpg");

            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);

            // Verify successful addition of surgery
            Assert.assertTrue(driver.getCurrentUrl().contains("surgeries"), "Failed to add surgery details.");
        }

        private void uploadFile(String filePath) throws AWTException {
            Robot robot = new Robot();
            StringSelection fileSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null);

            robot.delay(2000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
        @Test(priority = 38)
        public void addMedicationDetails() throws InterruptedException, AWTException {
            driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/medications");
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[2]/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[1]/input")).sendKeys("Dolo");
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[2]/button")).click();
            Thread.sleep(9000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[4]/div[1]/div/input")).sendKeys("120");
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[4]/div[2]/div/input")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[4]/div[3]/div/button[2]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[4]/div[4]/div[1]/input")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[4]/div[4]/div[2]/div/div/div/div/div[1]/div[3]/select/option[2]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[4]/div[4]/div[2]/div/div/div/div/div[1]/div[2]/select/option[6]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[4]/div[5]/label[1]/span[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[4]/div[6]/label[1]/span[2]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[5]/div[1]/div/input")).sendKeys("Nivas Reddy", Keys.TAB);
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[5]/div[2]/input")).sendKeys("Apollo Hospital");
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/div[5]/div[3]/label/span[1]")).click();
            Thread.sleep(3000);

            WebElement uploadButton = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div/button[2]"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", uploadButton);
            Robot rb = new Robot();

            rb.delay(2000);
            StringSelection ss = new StringSelection("C:\\Users\\hneth\\OneDrive\\Desktop\\Virtus IT\\smsa\\pics\\download (1).jpg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
            rb.delay(3000);

            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            rb.delay(3000);

            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);
            rb.delay(3000);

            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);
        }

        @Test(priority = 39)
        public void addAllergyDetails() throws InterruptedException, AWTException {
            driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/allergies");
            Thread.sleep(5000);

            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[2]/button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div/div/label[10]/div/div[2]/label/span")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[3]/div/div/div[1]/div[1]/input")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[3]/select/option[120]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/select/option[8]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div/div/div/table/tbody/tr[2]/td[5]/button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[3]/div/div/div[2]/div/div[1]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[6]/div[3]/div/div/div[3]/div[2]/div/div/div/div/label[10]/div/div[2]/label/span")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[6]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);

            WebElement button = driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[3]/div/div/button"));
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("arguments[0].click();", button);
            Robot rb = new Robot();

            rb.delay(2000);

            StringSelection ss = new StringSelection("C:\\Users\\hneth\\OneDrive\\Desktop\\Virtus IT\\smsa\\pics\\download (1).jpg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
            rb.delay(3000);

            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            rb.delay(3000);

            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);
            rb.delay(3000);

            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);
        }
        @Test(priority = 40)
        public void addFamilyHistoryDetails() throws InterruptedException, AWTException {
            driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/familyhistory");
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("Nike", Keys.TAB);
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Jordan");
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[3]/div/div/button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[4]/div/button[2]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[6]/div[2]/div/input")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[6]/div[3]/div/button[74]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[7]/div[2]/div[1]/div/input")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[7]/div[2]/div[2]/div/button[5]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[7]/div[2]/div[3]/div/input")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[7]/div[2]/div[4]/div/button[9]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[8]/div[1]/input")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[8]/div[2]/div/div/div/div/div[1]/div[3]/select")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[8]/div[2]/div/div/div/div/div[1]/div[3]/select/option[97]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[8]/div[2]/div/div/div/div/div[1]/div[2]/select")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[8]/div[2]/div/div/div/div/div[1]/div[2]/select/option[10]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[8]/div[2]/div/div/div/table/tbody/tr[4]/td[1]/button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[9]/div/input")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[10]/div/button[1]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[11]/div/div[2]/input")).sendKeys("9998887776", Keys.TAB);
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[12]/input")).sendKeys("nike@gmail.com");
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[13]/div/input")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[14]/div/button[4]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[15]/div/input")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[16]/div/button[12]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[17]/div[1]/p")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div[2]/div/div/div/div/label[53]/div/div[2]/label/span")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/div[17]/div[2]/p")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div[2]/div/div/div/div/label[10]/div/div[2]/label/span")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[3]/label[1]/span[1]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);
        }


        @Test(priority = 41)
        public void addVaccinationDetails() throws InterruptedException {
            // Navigate to the vaccination page
            driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/vaccination");
            Thread.sleep(3000);

            // Add vaccination
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/button")).click();
            Thread.sleep(3000);

            // Select the vaccine checkbox
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[2]/div/div/div/label[1]/div/div[2]/label/span")).click();
            Thread.sleep(3000);

            // Click "Continue" button
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);

            // Admin date - Open the date picker
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[1]/div[1]/input")).click();
            Thread.sleep(3000);

            // Select year
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[3]/select")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[3]/select/option[121]")).click();
            Thread.sleep(3000);

            // Select month
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/select")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/select/option[6]")).click();
            Thread.sleep(3000);

            // Select date
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/table/tbody/tr[3]/td[4]/button")).click();
            Thread.sleep(3000);

            // Due date - Open the date picker
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[2]/div[1]/input")).click();
            Thread.sleep(3000);

            // Select year
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div[3]/select")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div[3]/select/option[140]")).click();
            Thread.sleep(3000);

            // Select month
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/select")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/select/option[3]")).click();
            Thread.sleep(3000);

            // Select date
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[4]/td[5]/button")).click();
            Thread.sleep(3000);

            // Add the vaccine
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);
        }

        @Test(priority = 42)
        public void addSocialHistoryDetails() throws InterruptedException {
            // Navigate to the social history page
            driver.navigate().to("https://midoc-patientapp-dev.azurewebsites.net/socialhistory");
            Thread.sleep(3000);

            // Add social history
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div/button")).click();
            Thread.sleep(3000);

            // Select type
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div[1]/div/input")).click();
            Thread.sleep(3000);

            // Choose type option
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div[2]/div/button[2]")).click();
            Thread.sleep(3000);

            // Check box for type selection
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div[3]/div/label[1]/span[1]")).click();
            Thread.sleep(3000);

            // Smoke or other choices checkbox
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div[4]/div/label[1]/span[1]")).click();
            Thread.sleep(3000);

            // Drugs list dropdown
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div[5]/div")).click();
            Thread.sleep(3000);

            // Selecting a drug option
            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[3]/div[2]/div/div/div/div/label[1]/div/div[2]/label/span")).click();
            Thread.sleep(3000);

            // Add selected drug
            driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);

            // Start year selection
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div[6]/div[1]/div/input")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div[6]/div[2]/div/button[3]")).click();
            Thread.sleep(3000);

            // Set frequency
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div/div[7]/div/input")).sendKeys("2");
            Thread.sleep(3000);

            // Confirm and add social history
            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/footer/div/button")).click();
            Thread.sleep(3000);
        }

    }






