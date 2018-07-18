/**
 * 
 */
package mmt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import anuj.anand.Base;

/**
 * @author user
 *
 */
public class Login_MMT extends Base {
	public WebDriver driver;
	
	
	public Login_MMT(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public By login=By.id("ch_login_icon");	
	public WebElement getlogin()
	{
		return driver.findElement(login);
		
	}
	public By email=By.id("ch_login_email");
	public WebElement getemail()
	{
		return driver.findElement(email);
		
	}
	 
	public By password=By.xpath("//input[@id='ch_login_password']");
	public WebElement getpassword()
	{
		
		return driver.findElement(password);
		
	}
	
	public  By loginbutton=By.xpath("//button[@id='ch_login_btn']");
	public WebElement getloginbutton()
	{
		
		return driver.findElement(loginbutton);
	}
	
	/*
	 By login= By.id("ch_login_icon");
     By email=By.id("ch_login_email");
     By password=By.xpath("//input[@id='ch_login_password']");
     By loginbutton=By.xpath("//button[@id='ch_login_btn']");
     
     
	public  Login_MMT()
	{
		this .driver=driver;
	}

	
	 public void typelogin()
	    {
	  driver.findElement(login).click();
	    }
	    
	    public void typeemail()
	    {
	    	driver.findElement(email).sendKeys("anand.anuj91@gmail.com");
	    }
	    
	    public void typepassword()
	    {
	    	driver.findElement(password).sendKeys("anuj.0079");
	    }
	    
	    public void typeloginbutton()
	    {
	    	driver.findElement(loginbutton).click();
	    }
	
	*/
}
