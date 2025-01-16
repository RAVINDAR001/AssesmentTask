package asses.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="men")
	WebElement mens;
	
	@FindBy(xpath="//div[contains(text(),'V')]")
	WebElement setting;
	
	@FindBy(xpath="//li[contains(text(),'Logout')]")
     WebElement logout;

	public WebElement getMens() {
		return mens;
	}

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getLogout() {
		return logout;
	}
			

}
