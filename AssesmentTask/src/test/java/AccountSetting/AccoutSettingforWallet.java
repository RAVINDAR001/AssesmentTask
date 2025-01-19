package AccountSetting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assesment.GenericUtility.BaseClass;
import Assesment.GenericUtility.ExcelFileUtility;
import Assesment.GenericUtility.WebDriverutility;
import asses.ObjectRepository.HomePage;
import asses.ObjectRepository.WalletPage;

public class AccoutSettingforWallet extends BaseClass {
	
	@Test
	public void ToClickAccountSetting() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
	//To Click On Account seting
		hp.getAccountSeting().click();
		//To Click on My wallet
		WebDriverutility wutil=new WebDriverutility();
		
		wutil.ToMoveToElement(driver,hp.getMyWallet());
		hp.getMyWallet().click();
		//to click on use coupon
		
		WalletPage wp= new WalletPage(driver);
		wp.getUseCoupon().click();
		//insert couponcode
		wp.getCode();
		//to fetch coupon from excel
		ExcelFileUtility eutil=new ExcelFileUtility();
		String couponcode = eutil.toReadDataFromExcelFile("Assesment", 1, 2);
		System.out.println(couponcode);
		//to verify coupon
		WebElement verify = wp.getVerifyCoupon();
		System.out.println(verify);
		
		
		
		
	
	
}
}
