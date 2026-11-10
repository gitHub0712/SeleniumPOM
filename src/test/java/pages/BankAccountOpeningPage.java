package pages;

import java.time.Duration;
import java.util.List;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankAccountOpeningPage {

   

    private WebDriver driver;





	// Constructor
    public BankAccountOpeningPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    // Add the exact locators from your BankAccountForm HTML here.

    // Example:
     By name = By.id("fullName");
    By email = By.id("emailField");
     By phone = By.xpath("//input[@placeholder='Enter Mobile Number']");
     
     By maleRadio = By.xpath("//input[@type='radio']");
     
     By dateOfBirth= By.id("dobField");
     
     By occupation= By.id("occupation");
     
     By savingsAccount = By.xpath("//input[@name='accountType' and @value='savings']");
     
     By initialDeposit = By.xpath("//input[@id='initialDeposit']");
     
     By confirmDeposit= By.id("confirmDeposit");
     
     By selectBranch = By.xpath("//select[@id='branch']");
     
     By aadhaarNumber=By.id("aadhaarNumber");
     By aadhaarUpload = By.id("aadhaarUpload");
     By address =By.id("address");
     
     By city =By.id("city");
     By declaration = By.id("declaration");
     
  // State Dropdown
  
     By selectState = By.id("state");

     // 1. PIN Code
     
     By pinCode = By.id("pincode");
     By netBanking = By.xpath("//input[@name='service' and @value='netbanking']");
     // Preferred Communication Language
     
     By languageDropdown = By.id("customDropdown");
     By english = By.xpath("//*[normalize-space()='English']");
     
  // Available Branches
     By puneBranch = By.id("branchPune");
     By dropLocation = By.id("branchDropZone");
     By selectedBranch = By.id("selectedBranch");
     By submitButton = By.id("submitButton");
     By successMessage = By.id("successMessage");

     
     
    

    // Methods

     public void enterName(String value) {
        driver.findElement(name).sendKeys(value);
     }

     public void enterEmail(String value) {
        driver.findElement(email).sendKeys(value);
     }

     public void enterPhone(String value) {
         driver.findElement(phone).sendKeys(value);
     }
     
     public void selectMale() {
    	    driver.findElement(maleRadio).click();
    	}
     
     public void enterDateOfBirth(String value) {
    	    driver.findElement(dateOfBirth).sendKeys(value);
    	}

     
    	 public void selectBusiness(String value) {
    		    driver.findElement(occupation).sendKeys(value);
    		}
    	 
    	 public void selectSavingsAccount() {
    		    driver.findElement(savingsAccount).click();
    		}
    	 public void enterInitialDeposit(String amount) {
    		    driver.findElement(initialDeposit).sendKeys(amount);
    		}
    	 
    	 public void enterConfirmDeposit(String amount) {
    		 driver.findElement(confirmDeposit).sendKeys(amount);
    	 }
    	 
    	 public void selectBranch(String branchName) {
    		    driver.findElement(selectBranch).click();
    		    new Select(driver.findElement(selectBranch))
    		            .selectByVisibleText(branchName);
    	 }
    		    public void enteraadhaarNumber(String value) {
    		    	driver.findElement(aadhaarNumber).sendKeys(value);
    		    }
    		    public void uploadAadhaarCard(String filePath) {
    		        driver.findElement(aadhaarUpload).sendKeys(filePath);
    		    }
    		    
    		    public void enteraddress(String value) {
    		    	driver.findElement(address).sendKeys(value);
    		    }
    		    
    		    public void enterCity(String value) {
    		    	driver.findElement(city).sendKeys(value);
    		    }
    		    
    		 // Select State
    		    public void selectState(String stateName) {

    		        WebElement state = driver.findElement(By.id("state"));

    		        state.click();

    		        Select select = new Select(state);

    		        select.selectByValue(stateName);
    		    }
    		    public void enterPinCode(String pin) {

    		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    		        WebElement element = wait.until(
    		            ExpectedConditions.visibilityOfElementLocated(pinCode)
    		        );

    		        // Scroll to PIN Code field
    		        ((JavascriptExecutor) driver).executeScript(
    		            "arguments[0].scrollIntoView({block:'center'});", element
    		        );

    		        // Wait until clickable
    		        wait.until(ExpectedConditions.elementToBeClickable(pinCode));

    		        element.click();
    		        element.clear();
    		        element.sendKeys(pin);
    		    }
    		        public void selectNetBanking() {

    		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    		            WebElement element = wait.until(
    		                ExpectedConditions.elementToBeClickable(netBanking)
    		            );

    		            element.click();
    		        }
    		            public void selectLanguage() {

    		                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    		                // Click dropdown
    		                wait.until(ExpectedConditions.elementToBeClickable(languageDropdown)).click();
    		             // Select English
    		                wait.until(ExpectedConditions.elementToBeClickable(english)).click();
    		      }
    		            public void dragPuneBranchToDropZone() {

    		                WebElement source = driver.findElement(puneBranch);
    		                WebElement target = driver.findElement(dropLocation);

    		                JavascriptExecutor js = (JavascriptExecutor) driver;

    		                js.executeScript(
    		                    "const source = arguments[0];" +
    		                    "const target = arguments[1];" +
    		                    "const dt = new DataTransfer();" +

    		                    "source.dispatchEvent(new DragEvent('dragstart', {" +
    		                    "dataTransfer: dt, bubbles: true" +
    		                    "}));" +

    		                    "target.dispatchEvent(new DragEvent('dragover', {" +
    		                    "dataTransfer: dt, bubbles: true" +
    		                    "}));" +

    		                    "target.dispatchEvent(new DragEvent('drop', {" +
    		                    "dataTransfer: dt, bubbles: true" +
    		                    "}));",

    		                    source, target
    		                );
    		            }
    		            
    		                public void selectDeclaration() {
    		                    WebElement checkbox = driver.findElement(declaration);

    		                    if (!checkbox.isSelected()) {
    		                        checkbox.click();
    		          
    		                    }}
    		                    
    		                    public void clickSubmitButton() {
    		                        driver.findElement(submitButton).click();
    		               
    		            
    		                
    		                }
    		                    public String getSuccessMessage() {
    		                        return driver.findElement(successMessage).getText();
    		                    }
    		                    

    		    

}