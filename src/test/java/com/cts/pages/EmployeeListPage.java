package com.cts.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EmployeeListPage {
	WebDriver driver;
	private static By newEmployeeLoc = By.xpath("//a[text()='Add New Employee']");
	private static By nameLoc = By.name("full_name");
	private static By emailLoc = By.xpath("//input[@name='email']");
	private static By loginLoc = By.xpath("//input[@name='login']");
	private static By passwordLoc = By.xpath("//input[@name='password']");
	private static By securityLevelLoc = By.xpath("//th[text()='Security Level *']");

	public EmployeeListPage(WebDriver driver) {
		this.driver = driver;
	}

	public static void selectingSecurityLevel(WebDriver driver, String text) {
		WebElement securityLevelEle = driver.findElement(securityLevelLoc);
		Select selectingSecurityLevel = new Select(securityLevelEle);
		selectingSecurityLevel.selectByVisibleText(text);
	}

	public static void enteringName(WebDriver driver, String name) {
		driver.findElement(nameLoc).sendKeys(name);
	}

	public static void enteringEmail(WebDriver driver, String email) {
		driver.findElement(emailLoc).sendKeys(email);
	}

	public static void enteringLogin(WebDriver driver, String login) {
		driver.findElement(loginLoc).sendKeys(login);
	}

	public static void enteringPassword(WebDriver driver, String password) {
		driver.findElement(passwordLoc).sendKeys(password);
	}
	
	public static void clickingNewEmployee(WebDriver driver) {
		driver.findElement(newEmployeeLoc).click();
	}

}
