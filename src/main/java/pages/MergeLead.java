package pages;

import wrappers.LeafTapsWrappers;

public class MergeLead extends LeafTapsWrappers{
	
	public MergeLead(){
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is NOT Home Page", "FAIL");
		}
	}
	
	
	
	
}
