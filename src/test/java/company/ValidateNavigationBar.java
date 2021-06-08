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

public class ValidateNavigationBar extends baseClass
{
	public static Logger log=LogManager.getLogger(baseClass.class.getName());
	@Test
	public void homepage() throws IOException
	{
		landingPage l=new landingPage(driver);
		System.out.println(l.getNavigationBar().isDisplayed());
		
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Navigation bar is displayed");
	}
	
	
   @AfterTest
   public void testcaseclose()
   {
	   driver.quit();
   }
   
	@BeforeTest
	public void beforetesting() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}

}
