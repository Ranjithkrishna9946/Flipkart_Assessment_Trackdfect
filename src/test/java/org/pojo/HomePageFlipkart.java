package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusables.PredefineClass;

public class HomePageFlipkart extends PredefineClass {
	public HomePageFlipkart() {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@title='Search for Products, Brands and More']")
	private WebElement searchBox;


	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
	
	

}
