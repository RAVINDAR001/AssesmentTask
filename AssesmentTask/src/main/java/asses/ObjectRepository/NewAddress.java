package asses.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddress {
	
	public NewAddress   (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='MuiGrid-root profileDashactive css-rfnosa']")
	private WebElement Myaddress;
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement AddAddress;

	public WebElement getMyaddress() {
		return Myaddress;
	}

	public WebElement getAddAddress() {
		return AddAddress;
	}
	

}
