package test;

import org.openqa.selenium.devtools.v137.page.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.BankAccountOpeningPage;


public class BankAccountOpeningTest extends BaseTest {

    @Test
    public void bankAccountOpeningTest() {

        // Create Page Object
        BankAccountOpeningPage page =
                new BankAccountOpeningPage(driver);

        // Enter name
        page.enterName("Pramod");
        
        
        page.enterEmail("pramodkale801@gmail.com");
        
        page.enterPhone("8007435317");
        
        page.selectMale();
        page.enterDateOfBirth("10/10/2020");
        page.selectBusiness("Business");
        page.selectSavingsAccount();
        
        page.enterInitialDeposit("600");
        page.enterConfirmDeposit("600");
        page.selectBranch("Pune");
        page.enteraadhaarNumber("905586198533");
        page.uploadAadhaarCard("C:\\Users\\Promod\\Desktop\\Desktop\\image");
        page.enteraddress("canda ontario");
        page.enterCity("ontario");
        page.selectState("maharashtra");
        page.enterPinCode("411001");
        page.selectNetBanking();
        page.selectLanguage();
        page.dragPuneBranchToDropZone();
        page.selectDeclaration();
        page.clickSubmitButton();
        
        Assert.assertEquals(
        	    page.getSuccessMessage(),
        	    "Account opening form submitted successfully!"
        	);


    
    

        
        
    }
}