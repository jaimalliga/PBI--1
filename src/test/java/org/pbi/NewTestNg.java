package org.pbi;

import java.util.Date;

import org.policy.HIPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.util.BaseClass;



public class NewTestNg extends BaseClass {
	@BeforeClass(alwaysRun=true)
	private void startChrome() {
		launchChrome();
		
		winMax();
		printTitle();
		printCurrentUrl();
		
	}
	@AfterClass(alwaysRun=true)
	private void endChrome() {
		closeChrome();
	}
	
	@BeforeMethod(alwaysRun=true)
	private void startTime() {
		System.out.println(new Date());
		loadUrl("https://www.policybazaar.com/");
	}
	
	@AfterMethod(alwaysRun=true)
	private void endTime() {
		System.out.println(new Date());
	}
	
	@Test(priority = 1, enabled = true, groups = "regression")
	private void tc1() throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		
		btnClick(p.getHomeInsurance());
		fill(p.getTxtNameBox(), "   ");
		fill(p.getTxtMobile(), "987654321");
		fill(p.getTxtEmail(), "98sa98da");
		btnClick(p.getBtnClick());
		sleep(2000);
	}
	
	@Test(priority = -10, enabled = true, groups="sanity")
	private void tc2() throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		btnClick(p.getHomeInsurance());
		jsHighLight(p.getTxtNameBox());
		fill(p.getTxtNameBox(), "jai");
		fill(p.getTxtMobile(), "987654321");
		fill(p.getTxtEmail(), "      ");
		btnClick(p.getBtnClick());
		sleep(2000);
	}
	
	@Test(enabled = true, groups="smoke")
	private void tc3() throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		btnClick(p.getHomeInsurance());
		jsHighLight(p.getTxtNameBox());
		fill(p.getTxtNameBox(), "jai");
		jsHighLight(p.getTxtMobile());
		fill(p.getTxtMobile(), "9876543210");
		fill(p.getTxtEmail(), "  @  .");
		btnClick(p.getBtnClick());
		sleep(2000);
	}
	
	
	//invocationCount How many Time to run the testcase
	//groups is use test case are group and run which group we can to select in .xml file
	//priority is which one is most priority test case given most negative value should be run it self first
	//parameters use to pass value in our text box
	//Dataprovider is pass a value in bulk to in a single testcase (positive testcase and negative testcase)
	@Parameters({"dhoni","jai"})
	@Test(invocationCount = 1, priority = -11, groups = "sanity")
	private void tc4(@Optional("jai")String s1, @Optional("jai@gmail.com")String s2) throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		btnClick(p.getHomeInsurance());
		jsHighLight(p.getTxtNameBox());
		fill(p.getTxtNameBox(), s1);
		jsHighLight(p.getTxtMobile());
		fill(p.getTxtMobile(), "9876543210");
		jsHighLight(p.getTxtEmail());
		fill(p.getTxtEmail(), s2);
		sleep(1000);
		btnClick(p.getBtnClick());
		sleep(2000);
		
//		jsHighLight(p.getTxtPinCode());
//		fill(p.getTxtPinCode(), "600032");
//		btnClick(p.getBtnPincodeContinue());		
	}
	@Test(groups = "smoke")
	private void tc5() throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		jsClick(p.getHomeInsurance());
		
		
		fill(p.getTxtNameBox(), "raj");
		fill(p.getTxtMobile(), "1989810212");			
		fill(p.getTxtEmail(), "raj@gmail.com");
		jsClick(p.getBtnClick());
		sleep(2000);
	}
	@Test
	private void tc6() throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		jsClick(p.getHomeInsurance());
		waitSleep(1);
		fill(p.getTxtNameBox(), "geetha");
		fill(p.getTxtMobile(), "1234567890");			
		fill(p.getTxtEmail(), "geetha@gmail.com");
		jsClick(p.getBtnClick());
		sleep(2000);

	}
	@Test
	private void tc7() throws InterruptedException {
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		jsClick(p.getHomeInsurance());
		waitSleep(1);
		fill(p.getTxtNameBox(), "rajeswari");
		fill(p.getTxtMobile(), "9292828210");			
		fill(p.getTxtEmail(), "raji@gmail.com");
		jsClick(p.getBtnClick());
		sleep(2000);

	}
	@Test
	private void tc8() throws InterruptedException {
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		jsClick(p.getHomeInsurance());
		waitSleep(1);
		fill(p.getTxtNameBox(), "manoj");
		fill(p.getTxtMobile(), "9810212");			
		fill(p.getTxtEmail(), "manoj@gmail.com");
		jsClick(p.getBtnClick());
		sleep(2000);

	}
	@Test
	private void tc9() throws InterruptedException {
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		jsClick(p.getHomeInsurance());
		fill(p.getTxtNameBox(), "sivani");
		fill(p.getTxtMobile(), "0000000000");			
		fill(p.getTxtEmail(), "siavani@gmail.com");
		jsClick(p.getBtnClick());
		sleep(2000);

	}
	@Test
	private void tc10() throws InterruptedException {
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		jsClick(p.getHomeInsurance());
		fill(p.getTxtNameBox(), "rajfajaiosudhfaiusohdfauhdfaoiufhaiodhfhguyaosgfougdfsdadfarfv");
		fill(p.getTxtMobile(), "1989810212");			
		fill(p.getTxtEmail(), "raj@gmailcom");
		jsClick(p.getBtnClick());
		sleep(2000);

	}
	@Test
	private void tc11() throws InterruptedException {
		HIPojo p = new HIPojo();
		jsHighLight(p.getDropDownInsurance());
		moveElementTo(p.getDropDownInsurance());
		jsHighLight(p.getHomeInsurance());
		moveElementTo(p.getHomeInsurance());
		jsClick(p.getHomeInsurance());
		fill(p.getTxtNameBox(), "r");
		fill(p.getTxtMobile(), "98765");			
		fill(p.getTxtEmail(), "ragmail.com");
		jsClick(p.getBtnClick());
		sleep(2000);
	}
  
}
