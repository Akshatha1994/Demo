package company;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.landingPage;
import resources.baseClass;

public class mainClass extends baseClass
{
	public static Logger log=LogManager.getLogger(baseClass.class.getName());
	@Test(dataProvider="getData")
	public void homepage(String UserName, String Password) throws IOException
	{
		driver.manage().window().maximize();
		landingPage l=new landingPage(driver);
		l.loginPage().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.emailID().sendKeys(UserName);
		lp.password1().sendKeys(Password);
		lp.loginBtn().click();
		log.info("login button clicked");
		
	}
	
	@AfterMethod
	   public void testcaseclose()
	   {
		   driver.quit();
	   }
		
	@BeforeMethod
	public void beforetesting() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@DataProvider
	public Object[][] getData()
	{
	Object data[][]=new Object[2][2];
	data[0][0]="dalveakshatha@gmail.com";
	data[0][1]="12345";
	
	data[1][0]="akshatha@gmail.com";
	data[1][1]="23456";
	
	return data;
	}

}
