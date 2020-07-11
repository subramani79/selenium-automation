package pages;

import wrappers.LeafTapsWrappers;

public class DeleteLEad extends LeafTapsWrappers{
	
	public DeleteLEad(){
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is NOT Home Page", "FAIL");
		}
	}
	
	public DeleteLEad enterfirstname(String name) {
		enterByXpath(".//*[@id='ext-gen248']", name);
		return this;
	}
	public DeleteLEad clickfindleads() {
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}
	
	public DeleteLEad clickfirstvalue() {
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return this;
	}
	public DeleteLEad clickdelete() {
		clickByLink("Delete");
		return this;
	}
	public DeleteLEad clickfind() {
		clickByLink("Find Leads");
		clickByXpath("//button[text()='Find Leads']");
		return this;
	}
	public DeleteLEad verifytext(String text) {
		verifyTextByXpath("//div[text()='No records to display']",text);
		return this;
	}
	
	
}
