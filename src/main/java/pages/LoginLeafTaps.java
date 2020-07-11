package pages;

import wrappers.LeafTapsWrappers;

public class LoginLeafTaps extends LeafTapsWrappers{
	
	public LoginLeafTaps(){
		System.out.println(driver.getTitle());
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is NOT login Page", "FAIL");
		}
		//switchDefault();
		//switchFrame("gsft_main");*/
	}
	
	public LoginLeafTaps typeUserName(String uname){
		enterByXpath("(.//*[@id='username'])[1]", uname);
		return this;
	}
	
	public LoginLeafTaps typePassword(String pwd){
		enterByXpath("(.//*[@id='password'])[1]", pwd);
		return this;
	}
	
	public Homeleaftaps clickLogin(){
		clickByClassName("decorativeSubmit");
		return new Homeleaftaps();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
