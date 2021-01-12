package org.Pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuAutomation extends LibGlobal {

	public MenuAutomation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'gor-navigation pull-')]")
	private WebElement menu;
	@FindBy(xpath = "//a[contains(text(),'Sales Tools')][1]")
	private WebElement sales;
	@FindBy(xpath = "//a[contains(text(),'Build a Proposal')]")
	private WebElement build;
	@FindBy(linkText = "SELECT LEAD")
	private WebElement lead;

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getSales() {
		return sales;
	}

	public WebElement getBuild() {
		return build;
	}

	public WebElement getLead() {
		return lead;
	}

}
