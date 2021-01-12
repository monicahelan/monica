package org.Pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLead extends LibGlobal {

	public AddLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@class,'btn btn-primary hide-mobile')]")
	private WebElement add;
	@FindBy(id = "firstName")
	private WebElement frstName;
	@FindBy(id = "lastName")
	private WebElement lastName;
	@FindBy(id = "phNo")
	private WebElement phone;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "addressLine1")
	private WebElement add1;
	@FindBy(id = "addressLine2")
	private WebElement add2;
	@FindBy(id = "countryIso")
	private WebElement country;
	@FindBy(id = "regionIso")
	private WebElement state;
	@FindBy(id = "townCity")
	private WebElement city;
	@FindBy(id = "postal-code")
	private WebElement post;
	@FindBy(id = "comments")
	private WebElement comment;
	@FindBy(id = "uid")
	private WebElement assigned;
	@FindBy(id = "status")
	private WebElement status;
	@FindBy(id = "leadSource")
	private WebElement leadsource;
	@FindBy(id = "projectType")
	private WebElement project;
	@FindBy(className = "col-sm-10 equipment-to-install")
	private WebElement equipment;
	@FindBy(id = "oldSystemManufacturer")
	private WebElement newmanufact;
	@FindBy(id = "oldSystemDescription")
	private WebElement oldmanufact;
	@FindBy(id = "calender1")
	private WebElement calendar1;
	@FindBy(id = "scheduleRequestTime")
	private WebElement time1;
	@FindBy(id = "calender2")
	private WebElement calendar2;
	@FindBy(name = "appointmentRequestTime")
	private WebElement time2;
	@FindBy(id = "select0")
	private WebElement system;
	@FindBy(id = "sysReq0")
	private WebElement model;
	@FindBy(id = "sysRequest0")
	private WebElement catalog;
	@FindBy(className = "formInput patternCheck")
	private WebElement leadcost;
	@FindBy(xpath = "//p[contains(text(),'Add Document')]")
	private WebElement document;
	@FindBy(xpath = "//select[@name='documents[1].documentType']")
	private WebElement drpSelectDocument;
	@FindBy(id = "multipleImageSelect[0]")
	private WebElement image;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]")
	private WebElement scheduleReq;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]")
	private WebElement scheduleApp;
	@FindBy(xpath="//ul[@class='success-msg']")
	private WebElement successMessage;
	public WebElement getSuccessMessage() {
		return successMessage;
	}

	public WebElement getScheduleReq() {
		return scheduleReq;
	}

	public WebElement getScheduleApp() {
		return scheduleApp;
	}

	public WebElement getDrpSelectDocument() {
		return drpSelectDocument;
	}

	@FindBy(xpath = "//span[contains(text(),'SAVE LEAD')]")
	private WebElement savelead;

	public WebElement getAdd() {
		return add;
	}

	public WebElement getFrstName() {
		return frstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAdd1() {
		return add1;
	}

	public WebElement getAdd2() {
		return add2;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPost() {
		return post;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getAssigned() {
		return assigned;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getLeadsource() {
		return leadsource;
	}

	public WebElement getProject() {
		return project;
	}

	public WebElement getEquipment() {
		return equipment;
	}

	public WebElement getNewmanufact() {
		return newmanufact;
	}

	public WebElement getOldmanufact() {
		return oldmanufact;
	}

	public WebElement getCalendar1() {
		return calendar1;
	}

	public WebElement getTime1() {
		return time1;
	}

	public WebElement getCalendar2() {
		return calendar2;
	}

	public WebElement getTime2() {
		return time2;
	}

	public WebElement getSystem() {
		return system;
	}

	public WebElement getModel() {
		return model;
	}

	public WebElement getCatalog() {
		return catalog;
	}

	public WebElement getLeadcost() {
		return leadcost;
	}

	public WebElement getDocument() {
		return document;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getSavelead() {
		return savelead;
	}

}
