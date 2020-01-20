package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Driverinstance 

{
public WebDriver driver;

@BeforeMethod
	public void openbrowser() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
@AfterMethod
public void closebrowser()
{
	driver.close();
}
}

