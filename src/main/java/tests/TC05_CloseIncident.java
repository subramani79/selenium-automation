package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Createinc;
import pages.Home;
import pages.Login;
import wrappers.LeafTapsWrappers;

public class TC05_CloseIncident extends LeafTapsWrappers {

	@BeforeClass
	public void setvalues(){
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="Close Incident";
		testDescription="Incident Close";
		authors="Babu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void createinci(String username, String pwd,String incinumm,String number,String id,String desc,String valu,String result) throws InterruptedException{
		
		new Login()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()

		.typeincident(incinumm)
		.closein()
		.enternumber(number)
		.clickfirstvalue()
		.selectstate(id)
		.shodes(desc)
		.clicksubmit()
		//.switchfra()
		.switchfra()
		.recheck()
		.switchfrarecheck()
		.verifyincivalue(valu)
		.verifyinci(result);
		
		}
	}
	

