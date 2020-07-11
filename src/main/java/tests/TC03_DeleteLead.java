package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Createinc;
import pages.Login;
import pages.LoginLeafTaps;
import wrappers.LeafTapsWrappers;

public class TC03_DeleteLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setvalues(){
		dataSheetName="TC003DeleteLead";
		browserName="chrome";
		testCaseName="Delete Lead";
		testDescription="Delete Lead";
		authors="Babu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void editlead(String username, String pwd,String name,String text){
		
		new LoginLeafTaps()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()
		.clicklink()
		.deletelead()
		.enterfirstname(name)
		.clickfindleads()
		.clickdelete()
		.clickfind()
		.verifytext(text);
			    			
	}

}
