package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Createinc;
import pages.Login;
import pages.LoginLeafTaps;
import wrappers.LeafTapsWrappers;

public class TC04_DuplicateLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setvalues(){
		dataSheetName="TC004DuplicateLead";
		browserName="chrome";
		testCaseName="Duplicate Lead";
		testDescription="Duplicate Lead";
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
		.duplicatelead()
		.enterfirstname(name)
		.clickfindleads()
		.clickfirstvalue()
		.clickduplicate()
		.clicksubmit();
			    			
	}

}
