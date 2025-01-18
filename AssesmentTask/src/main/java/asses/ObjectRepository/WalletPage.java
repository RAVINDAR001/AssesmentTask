package asses.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalletPage {
	public   WalletPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//button[@type=\"button\"])[3]")
	private WebElement UseCoupon;
	
	@FindBy(name="Coupon Code")
	private WebElement Code;
	
	
   @FindBy(name="Verify")
    private WebElement VerifyCoupon;
   
   
public WebElement getUseCoupon() {
	return UseCoupon;
}
public WebElement getCode() {
	return Code;
}
public WebElement getVerifyCoupon() {
	return VerifyCoupon;
}
}
