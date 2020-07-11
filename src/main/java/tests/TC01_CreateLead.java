package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Createinc;
import pages.Login;
import pages.LoginLeafTaps;
import wrappers.LeafTapsWrappers;

public class TC01_CreateLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setvalues(){
		dataSheetName="TC001CreateLead";
		browserName="chrome";
		testCaseName="Create Lead";
		testDescription="Create Lead";
		authors="Babu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void createlead(String username, String pwd,String cname,String fname,String lname,String ind,String coun){
		
		new LoginLeafTaps()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()
		.clicklink()
		.createlead()
		.clickleads()
		.clickcrelead()	
		.entercname(cname)
		.enterfname(fname)
		.enterlname(lname)
		.selectindustry(ind)
		.selectcountry(coun)
		.clicksubmit();
				
	}

}
