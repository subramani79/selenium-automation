package pages;

import wrappers.LeafTapsWrappers;

public class DuplicateLead extends LeafTapsWrappers{
	
	public DuplicateLead(){
		if(!verifyTitle("View Leads | opentaps CRM")){
			reportStep("This is NOT Home Page", "FAIL");
		}
	}
	
	public DuplicateLead enterfirstname(String name) {
		enterByXpath(".//*[@id='ext-gen248']", name);
		return this;
	}
	public DuplicateLead clickfindleads() {
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}
	
	public DuplicateLead clickfirstvalue() {
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return this;
	}
	public DuplicateLead clickduplicate() {
		clickByLink("Duplicate Lead");
		return this;
	}
	public DuplicateLead entercomname(String cname) {
		enterById("createLeadForm_companyName", cname);
		return this;
		}
	public void clicksubmit(){
		clickByName("submitButton");
	}
	
}
