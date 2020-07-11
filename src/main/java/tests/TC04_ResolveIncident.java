package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Createinc;
import pages.Home;
import pages.Login;
import wrappers.LeafTapsWrappers;

public class TC04_ResolveIncident extends LeafTapsWrappers {

	@BeforeClass
	public void setvalues(){
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="Resolve Incident";
		testDescription="Incident Resolve";
		authors="Babu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void createinci(String username, String pwd,String incinumm,String number, String user,String id,String num,String valu,String user1) throws InterruptedException{
		
		new Login()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()

		.typeincident(incinumm)
		.resolinci()
		.enternumber(number)
		.clickfirstvalue()
		.assignto()
		.enteruser(user)
		.clickuser()
		.switchwind()
		.switchtoframe()
		.selectstate(id)
		.clicksubmit()
		.switchfra()
		.resolrec()
		.switframe()
		.recheck(num)
		.verifyincivalue(valu)
		.verifyuser(user1);
		
	}
	}
	

