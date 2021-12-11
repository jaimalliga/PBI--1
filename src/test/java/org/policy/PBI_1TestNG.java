package org.policy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.util.BaseClass;

public class PBI_1TestNG extends BaseClass {
	@BeforeClass
	private void launchingChrome() {
		launchChrome();
		winMax();
		printTitle();
		printCurrentUrl();
	}
	
	@AfterClass
	private void closingChrome() {
		closeChrome();
	}
	
	
	
	

}
