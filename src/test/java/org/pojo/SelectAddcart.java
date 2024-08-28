package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusables.PredefineClass;

public class SelectAddcart extends PredefineClass {

	public SelectAddcart() {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[text()='Apple iPhone 15 (Black, 128 GB)']")
	 private WebElement clickproduct;
	
	@FindBy(xpath = "//button[@class='QqFHMw vslbG+ In9uk2']")
	private WebElement clickAddcart;
	
	@FindBy(xpath = "//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")
	private WebElement clickBy;
	
	public WebElement getClickBy() {
		return clickBy;
	}
	public void setClickBy(WebElement clickBy) {
		this.clickBy = clickBy;
	}


	@FindBy(xpath = "//button[@class='QqFHMw zA2EfJ _7Pd1Fp']")
	private WebElement clickplaceOrder;
	@FindBy(xpath = "//input[@maxlength='auto']")
	private WebElement enterPhoneNumber;
	@FindBy(xpath = "//button[@class='QqFHMw YhpBe+ _7Pd1Fp']")
	private WebElement clickcontinue;
	public WebElement getClickproduct() {
		return clickproduct;
	}
	public WebElement getClickAddcart() {
		return clickAddcart;
	}
	public WebElement getClickplaceOrder() {
		return clickplaceOrder;
	}
	public WebElement getEnterPhoneNumber() {
		return enterPhoneNumber;
	}
	public WebElement getClickcontinue() {
		return clickcontinue;
	}
	

}
