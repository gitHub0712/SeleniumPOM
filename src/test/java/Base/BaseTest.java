package Base;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Apply implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Bank Account Form
        driver.get("https://localhost:7048/forms/BankAccountForm.html");
    }

  //  @AfterMethod
  //  public void tearDown() {

        // Close browser after test execution
      //  if (driver != null) {
            //driver.quit();
        }
    
