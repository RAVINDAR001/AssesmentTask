package AddNewAddress;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Assesment.GenericUtility.BaseClass;
import Assesment.GenericUtility.ExcelFileUtility;
import Assesment.GenericUtility.WebDriverutility;
import asses.ObjectRepository.DetailAddress;
import asses.ObjectRepository.HomePage;
import asses.ObjectRepository.NewAddress;
import asses.ObjectRepository.WalletPage;

public class CreateNewAddress extends BaseClass{
	
	@Test
	public void tocreateNewAddress() throws EncryptedDocumentException, IOException {
		//navigate to home page
		HomePage hp=new HomePage(driver);
		hp.getAccountSeting();
		//use webdriver method
		
		WebDriverutility wutil=new WebDriverutility();
		wutil.ToMoveToElement(driver, hp.getMyWallet());
		hp.getMyWallet().click();
		
		//Here i use mywallet because address submodule is inside wallet module.
		
		
		//click on my address
		NewAddress na =new NewAddress(driver);
		na.getMyaddress().click();
		//click on add address
		na.getAddAddress().click();
		
		//fill full details
		 DetailAddress da=new DetailAddress(driver);
		 da.getNameTextFeild();
		 //fetch data from excel
		 ExcelFileUtility eutil =new ExcelFileUtility();
		 String name = eutil.toReadDataFromExcelFile("Address", 1, 2);
		 System.out.println(name);
		 String House = eutil.toReadDataFromExcelFile("Address", 2, 3);
		  System.out.println(House);
		  String StreetInfo = eutil.toReadDataFromExcelFile("Address", 3, 4);
		  System.out.println(StreetInfo);
		  String Landmark = eutil.toReadDataFromExcelFile("Address", 4, 5);
		
		System.out.println(Landmark);
		String Pincode = eutil.toReadDataFromExcelFile("Address", 5, 6);
		System.out.println(Pincode);
		String phone = eutil.toReadDataFromExcelFile("Address", 6, 7);
		
		System.out.println(phone);
	}

}
