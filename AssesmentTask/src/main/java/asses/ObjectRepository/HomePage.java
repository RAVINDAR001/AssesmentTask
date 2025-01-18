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
	private WebElement mens;
	
	public WebElement getAccountSeting() {
		return AccountSeting;
	}

	public WebElement getMyWallet() {
		return MyWallet;
	}

	@FindBy(xpath="//div[contains(text(),'V')]")
	 private WebElement setting;
	
	@FindBy(xpath="//li[contains(text(),'Logout')]")
   private  WebElement logout;
	
	@FindBy(xpath="//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z\"]")
	 private WebElement AccountSeting;
	
	@FindBy(xpath="(//span[@class=\"MuiTouchRipple-root css-w0pj6f\"])[30]")
	private WebElement MyWallet;


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
