/*
 * Author: Sayantan Nath
 * 
 * */



package com.crm.qa.testcases;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BaseUrl;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.RetryAnalyzer;
import com.crm.qa.util.TestUtil;

public class BaseUrlTest extends TestBase{
	
	BaseUrl baseurl;
	LoginPage loginpage;
	
	public BaseUrlTest()
	{
		super();
	}
	
	
	@BeforeMethod	
	public void setUp()
	{
		initialization();
		 baseurl= new BaseUrl();		
	}
	
	@Test (priority=3, groups =  "Tittle")  //,retryAnalyzer = RetryAnalyzer.class
	public void T03_BaseUrlTittletest()
	{
		String tittle= baseurl.validateHomePageTittle();
		
		
			Assert.assertEquals(tittle, "#1 Free CRM customer relationship management software");  // cloud
	}
	
	
	@Test (priority=2, groups =  "Logo")
	public void T02_BaseUrlPageLogoTest()
	{
		Boolean logo= baseurl.validateHomePageLogo();
		
//		Assert.assertTrue(logo);
			Assert.assertTrue(false);
			
	}
	
	
	@Test (priority=1, groups =  "Login")
	public void T01_clickLoginTest()
	{
		loginpage= baseurl.clickLogin();
	}
	
	
	@AfterMethod()
	public void tearDown()
	{
		
		driver.quit();
	}

}
