package pages;

import wrappers.LeafTapsWrappers;

public class AssignIncident extends LeafTapsWrappers{

	public AssignIncident(){
		//System.out.println(driver.getTitle());
		if(!verifyTitlecontains("Incidents")){
			reportStep("This is NOT create incident Page", "FAIL");
		}
		switchDefault();
		switchFrame("gsft_main");
	}
	
	
   public AssignIncident selectnumber(String number) {
	 selectIndexByXpath("//select[@class='form-control']", number);
	 return this;
	
}
   public AssignIncident enternumber(String num) throws InterruptedException {
	   enterByXpathkeyentr("(//input[@class='form-control'])[1]", num);
	   Thread.sleep(3000);
	   return this;
	   
   }
   
   public AssignIncident clickfirstvalue() {
	   clickByXpath("(//a[@class='linked formlink'])[1]");
	   return this;
   }
   
   public AssignIncident assignto(String numm) {
	   enterById("sys_display.incident.assigned_to", numm);
	   return this;
   }
   
   public AssignIncident incistate(String id) {
	   selectIndexById("incident.state", id);
	   return this;
   }
   
   
   public void clicksubmit() {
	   
	   clickByXpath("(//button[@class='form_action_button  action_context btn btn-default'])[1]");
   }
}
   
   /*public void switchwin(){
	   SwitchToDefaultpage();
   }
   
   
   public void openinci() {
	   clickByXpath("//div[text()='Open']");
	   
   }
}*/
