package com.edureka.thirdpartytools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest
{
	
	public  WebDriver driver = null;
	public  WebDriverWait wait = null;
	
	@BeforeSuite
	public void connectToDatabase()
	{
			
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void precondition(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else
		{
			Reporter.log("Invalid browser selection");
		}

		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

	
	@AfterSuite
	public void triggerEmail()
	{
		
	}
}

//merge demp

//merge demo


