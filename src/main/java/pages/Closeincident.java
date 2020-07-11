package pages;

import wrappers.LeafTapsWrappers;

public class Closeincident extends LeafTapsWrappers{

	public Closeincident(){
		//System.out.println(driver.getTitle());
		if(!verifyTitlecontains("Incidents")){
			reportStep("This is NOT create close Page", "FAIL");
		}
		switchDefault();
		switchFrame("gsft_main");
	}
	
	
   public Closeincident enternumber(String number) {
	   enterByXpathkeyentr("(//input[@class='form-control'])[1]", number);
	 return this;
	
}
     
   public Closeincident clickfirstvalue() {
	   clickByXpath("(//a[@class='linked formlink'])[1]");
	   return this;
   }
   
   public Closeincident selectstate(String id){
	   selectIndexByvalue("incident.state", id);
	   return this;
   }
   
   public Closeincident shodes(String desc) {
	   enterById("incident.short_description", desc);
	   return this;
   }
      
   public Closeincident clicksubmit() {
	   
	   clickByXpath("(//button[@class='form_action_button  action_context btn btn-default'])[1]");
	   return this;
   }
   
   /*public Closeincident switcwin() {
	   switchToParentWindow();
	   return this;
   }
   */
   public Closeincident switchfra() {
	   
	   SwitchToDefaultpage();
	  return this;
   }
   public Closeincident recheck() {
	   clickByXpath("//div[text()='Open']");
	   return this;
	   
   }
   public Closeincident switchfrarecheck() {
	   
		  switchFrame("gsft_main");
		  return this;
	   }
   
   public Closeincident verifyincivalue(String valu) {
	   enterByXpathkeyentr("(//input[@class='form-control'])[1]", valu);	
	   return this;
   }
   
  public Closeincident verifyinci(String result) {
	  verifyTextByXpath("//td[text()='No records to display']", result);
	  return this;
  }
}
   
