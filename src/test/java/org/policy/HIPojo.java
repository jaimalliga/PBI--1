 package org.policy;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.util.BaseClass;

public class HIPojo extends BaseClass {
	public HIPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBys({
		@FindBy(xpath="//a[text()='Insurance Products ']"),
		@FindBy(xpath="(//i[@class='arrow'])[1]")
	})
	private WebElement dropDownInsurance;
	
	@FindBy(xpath="(//span[text()='Home Insurance'])[1]")
	private WebElement homeInsurance;
	
	@FindBy(name="radio-group-gender")
	private WebElement txtName;
	
	@FindBy(name="homename")
	private WebElement txtNameBox;
	
	@FindBy(name="homemobile")
	private WebElement txtMobile;
	
	@FindBy(id="homeemail_hi")
	private WebElement txtEmail;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement btnClick;
	
	@FindBy(id="homeInsurancePincode")
	private WebElement txtPinCode;
	
	@FindBy(xpath="//input[@class='proceedBtn btnHIStep2']")
	private WebElement btnPincodeContinue;
	
	public WebElement getBtnPincodeContinue() {
		return btnPincodeContinue;
	}
	public WebElement getTxtPinCode() {
		return txtPinCode;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}
	public WebElement getTxtMobile() {
		return txtMobile;
	}
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtNameBox() {
		return txtNameBox;
	}
	public WebElement getTxtName() {
		return txtName;
	}
	public WebElement getDropDownInsurance() {
		return dropDownInsurance;
	}
	public WebElement getHomeInsurance() {
		return homeInsurance;
	}
	
	
}
