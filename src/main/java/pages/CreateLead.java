package pages;

import wrappers.LeafTapsWrappers;

public class CreateLead extends LeafTapsWrappers{
	
	public CreateLead(){
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is NOT Home Page", "FAIL");
		}
	}
	
	public CreateLead clickleads() {
		clickByLink("Leads");
		return this;
	}
	
	public CreateLead clickcrelead() {
		clickByLink("Create Lead");
		return this;
	}
	public CreateLead entercname(String cname) {
		enterById("createLeadForm_companyName", cname);
		return this;
	}
	
	public CreateLead enterfname(String fname) {
		enterById("createLeadForm_firstName", fname);
		return this;
	}
	public CreateLead enterlname(String lname) {
		enterById("createLeadForm_lastName", lname);
		return this;
	}
	
	public CreateLead selectindustry(String indu) {
		selectIndexByvalue("createLeadForm_industryEnumId",indu);
		return this;
	}
	public CreateLead selectcountry(String coun) {
		selectVisibileTextById("createLeadForm_generalCountryGeoId", coun);
		return this;
	}
	public void clicksubmit() {
		clickByClassName("smallSubmit");
	}
	
}
