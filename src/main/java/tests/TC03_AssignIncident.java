package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Createinc;
import pages.Home;
import pages.Login;
import wrappers.LeafTapsWrappers;

public class TC03_AssignIncident extends LeafTapsWrappers {

	@BeforeClass
	public void setvalues(){
		dataSheetName="TC003";
		browserName="chrome";
		testCaseName="Assign Incident";
		testDescription="Incident assign";
		authors="Babu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void createinci(String username, String pwd,String incinumm,String number, String num,String numm,String id) throws InterruptedException{
		
		new Login()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()

		.typeincident(incinumm)
		.assigninci()
		.selectnumber(number)
		.enternumber(num)
		.clickfirstvalue()
		.assignto(numm)
		.incistate(id)
		.clicksubmit();
		
	}
	}
	

