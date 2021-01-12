package org.stepDef;

import java.io.IOException;

import org.Pojo.AddLead;
import org.Pojo.LoginPage;
import org.Pojo.MenuAutomation;
import org.base.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenition extends LibGlobal {

	@Given("User is on lennox application and login using valid credentials")
	public void user_is_on_lennox_application_and_login_using_valid_credentials() {
		if (driver == null) {
			getDriver();
			loadUrl("https://www.liidaveqa.com");
			LoginPage login = new LoginPage();
			login.getSign().click();
			login.getUserName().sendKeys("lenproautomation8@lenqat.com");
			login.getPassword().sendKeys("Community17");
			login.getSubmit().click();

		}
		jsexecute();
	}

	@When("user is going to add lead")
	public void user_is_going_to_add_lead() throws InterruptedException {
		MenuAutomation a = new MenuAutomation();
		a.getMenu().click();
		Thread.sleep(3000);
		a.getSales().click();
		
		a.getBuild().click();
		btnClick(a.getLead());
		
		AddLead lead = new AddLead();
		btnClick(lead.getAdd());
	}

	@When("filling details from {string}")
	public void filling_details_from(String string) throws  InterruptedException, IOException {
		AddLead lead = new AddLead();
		int row = Integer.parseInt(string);
		type(lead.getFrstName(), excelRead("Sheet1", row, 0));
		type(lead.getLastName(), excelRead("Sheet1", row, 1));
		type(lead.getPhone(), excelRead("Sheet1", row, 2));
		type(lead.getEmail(), excelRead("Sheet1", row, 3));
		type(lead.getAdd1(), excelRead("Sheet1", row, 4));
		type(lead.getAdd2(), excelRead("Sheet1", row, 5));
		selectByText(lead.getCountry(), excelRead("Sheet1", row, 6));
		selectByText(lead.getState(), excelRead("Sheet1", row, 7));
		type(lead.getCity(), excelRead("Sheet1", row, 8));
		type(lead.getPost(), excelRead("Sheet1", row, 9));
		type(lead.getComment(),"every thing is completed");
		selectByText(lead.getAssigned(), "lenpro automation8");
		selectByText(lead.getStatus(), "New");
		selectByText(lead.getLeadsource(), "Advertising");
		selectByText(lead.getProject(), "Installation");
		selectByText(lead.getAssigned(), "lenpro automation8");
		selectByText(lead.getNewmanufact(), "Armstrong");
		type(lead.getOldmanufact()	, "Completed");
		btnClick(lead.getCalendar1());
		btnClick(lead.getScheduleReq());
		btnClick(lead.getTime1());
		btnClick(lead.getCalendar2());
		btnClick(lead.getScheduleApp());
		btnClick(lead.getTime1());
		Thread.sleep(3000);
		btnClick(lead.getSavelead());
	}

	@Then("user is going to validate lead got saved successfully")
	public void user_is_going_to_validate_lead_got_saved_successfully() {
		AddLead lead = new AddLead();
		String success = lead.getSuccessMessage().getText();
		System.out.println(success);
		
	}

}
