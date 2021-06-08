package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class baseClass 
{
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
	     prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Akshatha\\eclipse-workspace\\maven\\division\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	
	String browserName = prop.getProperty("browser");
	

	System.out.println(browserName);
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshatha\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		
	}

	return driver;
	}
	
	public void getScreenshotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir"+"\\reports\\"+testCaseName+".png");
		FileUtils.copyFile(source,new File(destinationFile));
	}
}
