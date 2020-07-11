package pages;

import wrappers.LeafTapsWrappers;

public class Createinc extends LeafTapsWrappers{

	public Createinc(){
		//System.out.println(driver.getTitle());
		if(!verifyTitlecontains("INC")){
			reportStep("This is NOT create incident Page", "FAIL");
		}
		switchDefault();
		switchFrame("gsft_main");
	}
	
	/*public void verifytitle() {
	
		verifyTextContainsByXpath("//div[text()='New Record']", "New Record");
					
}*/

   public Createinc entercallername(String caller) {
	 enterByIdTab("sys_display.incident.caller_id", caller);
	 return this;
	
}
   public Createinc entershortdesc(String shodesc) {
	   enterById("incident.short_description", shodesc);
	   return this;
	   
   }
   
   public void clicksubmit() {
	   
	   clickByXpath("(//button[@class='form_action_button  action_context btn btn-default'])[1]");
   }
}
