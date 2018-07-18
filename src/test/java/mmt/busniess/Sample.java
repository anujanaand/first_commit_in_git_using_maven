/**
 * 
 */
package mmt.busniess;

import org.openqa.selenium.WebDriver;

import mmt.pages.Login_MMT;

/**
 * @author user
 *
 */
public class Sample extends Login_MMT {

	public Sample(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	public void loginpage(String login, String email, String password, String loginbutton)
	{
		//getlogin().clear();
		getlogin().click();
		getemail().clear();
		getemail().sendKeys("anand.anuj91@gmail.com");
		getpassword().clear();
		getpassword().sendKeys("anuj.0079");
		//getloginbutton().clear();
		getloginbutton().click();
	}
	
	

}
