package pages;

import wrappers.LeafTapsWrappers;

public class EditLead extends LeafTapsWrappers{
	
	public EditLead(){
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is NOT Home Page", "FAIL");
		}
	}
	
	public EditLead enterfirstname(String name) {
		enterByXpath(".//*[@id='ext-gen248']", name);
		return this;
	}
	public EditLead clickfindleads() {
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}
	
	public EditLead clickfirstvalue() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return this;
	}
	public EditLead clickedit() {
		clickByLink("Edit");
		return this;
	}
	public EditLead entercname(String company) {
		enterById("updateLeadForm_companyName", company);
		return this;
	}
	public void clicksubmit() {
		clickByName("submitButton");
	}
	
	
	
}
