package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	public WebDriver driver;
	
	By id=By.id("user_email");
	By password=By.id("user_password");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement emailID()
	{
		return driver.findElement(id);
	}
	
	public WebElement password1()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginBtn()
	{
		return driver.findElement(By.xpath("//input[@name='commit']"));
	}
	

}
