package menSection;

import org.testng.annotations.Test;

import Assesment.GenericUtility.BaseClass;
import asses.ObjectRepository.HomePage;

public class Men  extends BaseClass{
	@Test
	public void toClickMensection() {
		HomePage hp=new HomePage(driver);
		hp.getMens().click();
	}

}
