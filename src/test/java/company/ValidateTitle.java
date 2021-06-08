package company;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landingPage;
import resources.baseClass;

public class ValidateTitle extends baseClass
{
	public static Logger log=LogManager.getLogger(baseClass.class.getName());
	@BeforeTest
	public void beforetesting() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("homepage is intialized");
	}
	
	@Test
	public void homepage() throws IOException
	{
		landingPage l=new landingPage(driver);
		System.out.println(l.getTitle().getText());
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES123");
		log.info("Assertion is verified");
	
	
	}
	
	@AfterTest
	   public void testcaseclose()
	   {
		   driver.quit();
	   }
	
}
