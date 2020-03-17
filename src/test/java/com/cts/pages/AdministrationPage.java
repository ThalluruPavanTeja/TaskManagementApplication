package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministrationPage {

	private static By employeesLoc = By.xpath("//a[text()='Employees']");
	private static By prioritiesLoc = By.xpath("//a[text()='Priorities']");
	private static By projectsLoc = By.xpath("//a[text()='Projects']");
	private static By statusesLoc = By.xpath("//a[text()='Statuses']");
	private static By typesLoc = By.xpath("//a[text()='Types']");

	public static void clickingEmployees(WebDriver driver) {
		driver.findElement(employeesLoc).click();
	}

	public static void clickingPriorities(WebDriver driver) {
		driver.findElement(prioritiesLoc).click();
	}

	public static void clickingProjects(WebDriver driver) {
		driver.findElement(projectsLoc).click();
	}

	public static void clickingStatuses(WebDriver driver) {
		driver.findElement(statusesLoc).click();
	}

	public static void clickingTypes(WebDriver driver) {
		driver.findElement(typesLoc).click();
	}
}
