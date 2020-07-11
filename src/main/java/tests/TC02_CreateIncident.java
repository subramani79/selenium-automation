package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Createinc;
import pages.Home;
import pages.Login;
import wrappers.LeafTapsWrappers;

public class TC02_CreateIncident extends LeafTapsWrappers {

	@BeforeClass
	public void setvalues(){
		dataSheetName="TC002";
		browserName="chrome";
		testCaseName="Create Incident";
		testDescription="Incident creation";
		authors="Babu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void createinci(String username, String pwd,String incinumm,String calnam, String descri){
		
		new Login()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()

		.typeincident(incinumm)
		.createnew()
		.entercallername(calnam)
		.entershortdesc(descri);
			
	}
	
}
