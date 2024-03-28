package com.eCommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; // this is a method that performs a click and hold at the
//location of the source element
import org.openqa.selenium.support.FindBy; // annotation interface which is used to mark 
import org.openqa.selenium.support.PageFactory;

import com.eCommerce.actiondriver.ActionDriver;
import com.eCommerce.base.BaseClass;
// a field on a page object to indicate an alternative way for locating the element.

public class HomePage extends BaseClass{
	
	//About Us Link
	@FindBy (xpath = "//*[@id='dnn_NavigationToolbar1_MyAccountLinkToolbar']")
	WebElement aboutUsLink;  
	
	// Business Link
	@FindBy (xpath = "//*[@id=\'dnn_NavigationToolbar1_BusinessLinkToolbar\']")
	WebElement businessLink;
	
	// Community TV Link
	@FindBy (xpath = "//*[@id=\"dnn_NavigationToolbar1_TVLinkToolbar\"]")
	WebElement communityTVLink;
	
	// Find a Store
	@FindBy (xpath = "//*[@id=\"mp-pusher\"]/div/div/div[1]/div/div/div[1]/div/div/div[2]/ul/li[1]/a")
	WebElement storeLink;
	
	
	// Webmail Link
	@FindBy (xpath = "//*[@id=\"mp-pusher\"]/div/div/div[1]/div/div/div[1]/div/div/div[2]/ul/li[2]/a")
	WebElement webMailLink;
	
	
	// My Account Link
	@FindBy (xpath = "//*[@id=\"mp-pusher\"]/div/div/div[1]/div/div/div[1]/div/div/div[2]/ul/li[3]/a")
	WebElement myAccountLink;
	
	
	// Nova Scotia Link
	@FindBy (xpath = "//*[@id=\'regionSelector\']")
	WebElement novaScotiaLink;
	

	
	public HomePage() {
		// this will initialize all of the page objects of this homePage class.
		PageFactory.initElements((WebDriver) driver, this);
		
	}
	
	// create method to click on About Us link
	public AboutUsPage clickOnAboutUs() throws Throwable {
		// Use Action Driver class
		ActionDriver.click(driver, aboutUsLink);
		// link home page and about us page
		return new AboutUsPage();
		
		
	}
}
