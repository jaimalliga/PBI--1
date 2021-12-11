package org.policy;


import org.util.BaseClass;

public class AutoMation extends BaseClass{
	public static void main(String[] args) {
		launchChrome();
		winMax();
		loadUrl("https://www.policybazaar.com/");
		HIPojo p = new HIPojo();
		moveElementTo(p.getDropDownInsurance());
		moveElementTo(p.getHomeInsurance());
		actionsClick();
		fill(p.getTxtNameBox(),"John");
		fill(p.getTxtMobile(), "9876543210");
		fill(p.getTxtEmail(), "jojo@gmail.com");
		btnClick(p.getBtnClick());
		
		fill(p.getTxtPinCode(), "600032");
		jsClick(p.getBtnPincodeContinue());
	}
}
