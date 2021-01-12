package org.Pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	private WebElement sign;
	@FindBy(id = "j_username")
	private WebElement userName;
	@FindBy(id = "j_password")
	private WebElement password;
	@FindBy(id = "loginSubmit")
	private WebElement submit;

	public WebElement getSign() {
		return sign;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
