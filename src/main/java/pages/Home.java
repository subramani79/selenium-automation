package pages;

import wrappers.LeafTapsWrappers;

public class Home extends LeafTapsWrappers{
	
	public Home(){
		if(!verifyTitle("System Administration | ServiceNow")){
			reportStep("This is NOT Home Page", "FAIL");
		}
	}
	public Home typeincident(String incinum) {
		enterByXpath("//input[@id='filter']", incinum);
		return this;
	}
	
	public Createinc createnew() {
		clickByXpath("(//div[text()='Create New'])[1]");
		//switchFrame("(//iframe[@id='gsft_main'])[1]");
		return new Createinc();
		
	}
	
	public AssignIncident assigninci() {
		clickByXpath("//div[text()='Open - Unassigned']");
		return new AssignIncident();
	}
	public Resolveincident resolinci() {
		clickByXpath("//div[text()='Open']");
		return new Resolveincident();
	
}
	public Closeincident closein() {
		clickByXpath("//div[text()='Resolved']");
		return new Closeincident();
		
	}
}
