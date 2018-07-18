/**
 * 
 */
package mmt.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import anuj.anand.Base;
import mmt.busniess.Sample;

/**
 * @author user
 *
 */
public class Test_MMT_LoginPage {
	
	
	@Test
	public void test01()
	{
		Base b=new Base();
		WebDriver driver=b.getDriver();
		 Sample sample=PageFactory.initElements(driver,  Sample.class);
		 String url="https://www.makemytrip.com";
		 driver.get(url);
		 driver.manage().window().maximize();
		 
		 sample.loginpage("", "anand.anuj91@gmail.com", "anuj.0079","");
		 driver.close();
	}
	

}
