package com.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjects.Login_functionality;
import com.base.Testbase;
import com.utils.Utils;


	public class LoginTest extends Testbase {
		
		Login_functionality lf;
		private String sheetname="Sheet1";
		public LoginTest() throws Throwable {
			super();
		}

		@BeforeMethod

		public void setup() throws Throwable {

			Initialization();

			lf = new Login_functionality(driver);

		}

		@Test

		public void Verifylogin() throws Throwable  {

			lf.Dologin();

			String url = driver.getCurrentUrl();

			Assert.assertEquals("http://empirehome.myprojectsonline.co.in/EmpireHome/", url);
	}
	@Test(dataProvider="getdata",dataProviderClass=LoginTest.class)
	public void login(String Username,String Password) throws Throwable  {
	lf.DologinwithExcel(Username,Password);
	String url=driver.getCurrentUrl();
   Assert.assertEquals("http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard", url);
	}
	@DataProvider
	public Object[][] getdata() throws IOException {
		return Utils.readDataFromExcel(sheetname);
	}
		
		
		@AfterMethod

		public void teardown() {

			//driver.close();

		}

	}


