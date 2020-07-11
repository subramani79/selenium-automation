package pages;

import wrappers.LeafTapsWrappers;

public class Homeleaftaps extends LeafTapsWrappers{
	
	public Homeleaftaps(){
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is NOT Home Page", "FAIL");
		}
	}
	
	public Homeleaftaps clicklink() {
		clickByLink("CRM/SFA");
		return this;
	}
	public CreateLead createlead() {
		clickByLink("Leads");
		clickByLink("Create Lead");
		return new CreateLead();
	}
	
	public EditLead editlead() {
		clickByLink("Leads");
		clickByLink("Find Leads");
		return new EditLead();
	}
	public DeleteLEad deletelead() {
		clickByLink("Leads");
		clickByLink("Find Leads");
		return new DeleteLEad();
	}
	public DuplicateLead duplicatelead(){
		clickByLink("Leads");
		clickByLink("Find Leads");
		return new DuplicateLead();
	}
}
