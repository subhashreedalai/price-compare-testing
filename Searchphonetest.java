package testcases;
import java.sql.Driver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.Driverinstance;
import pages.Searchphone;

public class Searchphonetest extends Driverinstance 
	{
		@Test
	public void searchphone()throws Exception{
		Searchphone phn=new Searchphone();
		PageFactory.initElements(driver,phn);
		phn.searchbox();
		phn.searchicon();
		phn.clickphone();
		phn.getamazonprice();
		phn.flipkart();
		phn.flipkartsearchbox();
		phn.clicksearchbtn();
		phn.getflipkartprice();
	}

}
