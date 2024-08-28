package org.romvecart;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import org.pojo.HomePageFlipkart;
import org.pojo.SelectAddcart;
import org.reusables.PredefineClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.Before;

public class RemoveCart extends PredefineClass {

	@BeforeTest

	public void openBrowser() {
		launchBrowser("Edge");
		launchUrl("https://www.flipkart.com/");
		implitWait();
	}

	@Test(priority = 0)

	public void serachTheproduct() throws AWTException, InterruptedException {
		HomePageFlipkart h = new HomePageFlipkart();
		h.getSearchBox().sendKeys("Apple");
		Thread.sleep(2000);
		pressEnter();
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void SelectAddcartr() throws InterruptedException, IOException {
		SelectAddcart s = new SelectAddcart();
		clickWebElement(s.getClickproduct());
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String wi : windowHandles) {
			if (!wi.equals(windowHandle)) {
				driver.switchTo().window(wi);
			}

		}

		Thread.sleep(3000);
		clickWebElement(s.getClickBy());
		// clickWebElement(s.getClickAddcart());
		Thread.sleep(3000);

		// clickWebElement(s.getClickplaceOrder());

		s.getEnterPhoneNumber().sendKeys("9344453275");
		s.getClickcontinue().click();
		Thread.sleep(3000);

		TakesScreenshot take = (TakesScreenshot) driver;
		File screenshotAs = take.getScreenshotAs(OutputType.FILE);
		File f = new File(
				"C:/Users/ranji/eclipse-workspace/TrackDfect/FlipkartTrackdfect/src/test/resources/Screenshots/error.png");
		FileUtils.copyFile(screenshotAs, f);

	}

	@AfterTest
	public void CloseBrowser() {
		// driver.close();
		System.out.print("test");

	}

}
