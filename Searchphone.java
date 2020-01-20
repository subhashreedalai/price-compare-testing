package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchphone {
WebDriver driver;
@FindBy(id="twotabsearchtextbox")WebElement searchbox;
@FindBy(xpath="//input[@type='submit']")WebElement searchicon;
@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")WebElement clickphone;
@FindBy(xpath="//span[@class='a-price-whole']")WebElement getprice;

public void searchbox() throws Exception
{
	searchbox.sendKeys("iphone XR(64GB)-Yellow");
	Thread.sleep(3000);
}
public void searchicon()
{
	searchicon.click();
}
public void clickphone()
{
	clickphone.click();
	}
public void getprice() throws Exception
{
	String s= getprice.getText();
			System.out.println(s);
			Thread.sleep(3000);
	
	
}
public void flipkart() throws Exception
{
	
	driver.get("https://www.flipkart.com/");
	WebElement w1 = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
	w1.sendKeys("iphone XR(64GB)-Yellow");
	w1.sendKeys(Keys.ENTER);
	Thread.sleep(30000);
	
}

}