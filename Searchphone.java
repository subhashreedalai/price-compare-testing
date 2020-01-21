package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchphone {
WebDriver driver;
String s= "";
@FindBy(id="twotabsearchtextbox")WebElement searchbox;
@FindBy(xpath="//input[@type='submit']")WebElement searchicon;
@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")WebElement clickphone;
@FindBy(xpath="//span[@class='a-price-whole']")WebElement getamazonprice;
@FindBy(xpath="//input[@class='LM6RPg']")WebElement flipkartsearchbox;
@FindBy(xpath="//svg[@viewBox='0 0 17 18']")WebElement clicksearchbtn;
@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK']")WebElement getflipkartprice;
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
public void getamazonprice() throws Exception
{
	String s= getamazonprice.getText();
			System.out.println(s);
			Thread.sleep(3000);
	
	
}
public void flipkart()
{
	driver.navigate().to("https//:www.flipkart.com");
}
public void flipkartsearchbox()
{
	flipkartsearchbox.sendKeys("iphone XR(64GB)-Yellow");
		
}
public void clicksearchbtn(){
	clicksearchbtn.click();
}
public void getflipkartprice()throws Exception
{
	String s1=getflipkartprice.getText();
	System.out.println(s1);
	Thread.sleep(3000);
	s1.compareTo(s);
	
}
}
