package asses.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailAddress {
	public DetailAddress  (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="Name")
	private WebElement NameTextFeild;
	
	@FindBy(id="House/Office Info")
	private WebElement HouseTextFeil;
	
	@FindBy(id="Street Info-label")
	private WebElement StreetTextFail;
	
	@FindBy(id="Landmark")
	private WebElement LandmarkTextFail;
	
	@FindBy(id="Pincode")
	private WebElement PincodeTextFail;
	
	@FindBy(name="Phone Number")
	private WebElement phoneNumber;

	public WebElement getNameTextFeild() {
		return NameTextFeild;
	}

	public WebElement getHouseTextFeil() {
		return HouseTextFeil;
	}

	public WebElement getStreetTextFail() {
		return StreetTextFail;
	}

	public WebElement getLandmarkTextFail() {
		return LandmarkTextFail;
	}

	public WebElement getPincodeTextFail() {
		return PincodeTextFail;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
	
	
	
	

}
