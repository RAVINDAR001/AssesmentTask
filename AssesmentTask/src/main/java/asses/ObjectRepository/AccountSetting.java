package asses.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSetting {
	
	public AccountSetting (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z\"]")
	 private WebElement AccountSeting;
	
	@FindBy(xpath="(//span[@class=\"MuiTouchRipple-root css-w0pj6f\"])[30]")
	private WebElement MyWallet;

}
