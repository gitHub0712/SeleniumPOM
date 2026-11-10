package test;

import org.testng.annotations.Test;

import Base.BaseTest;

public class TestBrowser extends BaseTest {
	
	
		 @Test
		    public void verifyBankAccountForm() {

		        System.out.println("Page Title: " + driver.getTitle());
		        System.out.println("Current URL: " + driver.getCurrentUrl());

}
}