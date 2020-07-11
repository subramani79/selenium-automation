package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Createinc;
import pages.Login;
import pages.LoginLeafTaps;
import wrappers.LeafTapsWrappers;

public class TC02_EditLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setvalues(){
		dataSheetName="TC002EditLead";
		browserName="chrome";
		testCaseName="Edit Lead";
		testDescription="Create Lead";
		authors="Babu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void editlead(String username, String pwd,String name,String company){
		
		new LoginLeafTaps()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()
		.clicklink()
		.editlead()
	    .enterfirstname(name)
	    .clickfindleads()
	    .clickfirstvalue()
	    .clickedit()
	    .entercname(company)
	    .clicksubmit();
	    			
	}

}
