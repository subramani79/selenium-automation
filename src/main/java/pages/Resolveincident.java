package pages;

import wrappers.LeafTapsWrappers;

public class Resolveincident extends LeafTapsWrappers{

	public Resolveincident(){
		//System.out.println(driver.getTitle());
		if(!verifyTitlecontains("Incidents")){
			reportStep("This is NOT create incident Page", "FAIL");
		}
		switchDefault();
		switchFrame("gsft_main");
	}
	
	
   public Resolveincident enternumber(String number) {
	   enterByXpathkeyentr("(//input[@class='form-control'])[1]", number);
	 return this;
	
}
     
   public Resolveincident clickfirstvalue() {
	   clickByXpath("(//a[@class='linked formlink'])[1]");
	   return this;
   }
   
   public Resolveincident assignto() throws InterruptedException {
	   clickByXpath("//*[@id='lookup.incident.assigned_to']/span[1]");
	   switchToWindow();
	   Thread.sleep(3000);
	return this;
	   
   }
   public Resolveincident enteruser(String user) {
	   enterByXpath("(//input[@class='form-control'])[1]", user);
	   return this;
   }
   
   public Resolveincident clickuser() {
	   clickByXpath("//a[text()='Fred Luddy']");
	   return this;
   }
   
   public Resolveincident switchwind() {
	   switchToParentWindow();
	   return this;
   }
   
   public Resolveincident switchtoframe() {
	   switchFrame("gsft_main");
	   return this;
   }
   
  
   public Resolveincident selectstate(String id){
	   selectIndexByvalue("incident.state", id);
	   return this;
   }
   
      
   public Resolveincident clicksubmit() {
	   
	   clickByXpath("(//button[@class='form_action_button  action_context btn btn-default'])[1]");
	   return this;
   }
   
 public Resolveincident switchfra() {
	   
	   SwitchToDefaultpage();
	  return this;
   }
 
 public Resolveincident resolrec() {
	   clickByXpath("//div[text()='Resolved']");
	   return this;
	   
 }
 public Resolveincident switframe(){
	 switchFrame("gsft_main");
	 return this;
	 
 }
   public Resolveincident recheck(String num) {
	   enterByXpathkeyentr("(//input[@class='form-control'])[1]", num);
	   return this;
	   
   }
   public Resolveincident verifyincivalue(String valu) {
	   verifyTextByXpath("//a[@class='linked formlink']", valu);
	   return this;
   }
   
  public Resolveincident verifyuser(String user) {
	  verifyTextByXpath("(//td[@class='vt']/a)[4]",user);
	  return this;
  }
}
   
