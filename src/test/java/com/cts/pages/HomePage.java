package com.cts.pages;

import org.openqa.selenium.By;

import com.cts.base.LaunchingWebDriver;

public class HomePage {
	public static By administrationLoc = By.xpath("//a[@href='Administration.php']");
	public static By loginLoc  = By.xpath("//input[@name='login']");
	public static By passwordLoc  = By.xpath("//input[@name='password']");
	public static By submitLoc  = By.xpath("//input[@name='DoLogin']");
			
	public static void accountLogin(String login, String password)
	{
		LaunchingWebDriver.driver.findElement(administrationLoc).click();
		LaunchingWebDriver.driver.findElement(loginLoc).sendKeys(login);
		LaunchingWebDriver.driver.findElement(passwordLoc).sendKeys(password);
		LaunchingWebDriver.driver.findElement(submitLoc).click();
	}
	
	

}
