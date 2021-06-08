package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage 
{
	public WebDriver driver;
	
	By login=By.xpath("//span[text()='Login']");
	
	public landingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement loginPage()
	{
		return driver.findElement(login);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(By.xpath("//div[@class='text-center']/h2"));
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']"));
		
	}

}
