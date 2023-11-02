package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjects.Login_functionality;
import com.base.Testbase;
import com.utils.Utils;


	public class LoginTest extends Testbase {
private final String sheet="sheet1";
		Login_functionality lf;

		public LoginTest() throws Throwable {
			super();
		}

		@BeforeMethod

		public void setup() throws Throwable {

			Initialization();

			lf = new Login_functionality(driver);

		}

		@Test

		public void Verifylogin() {

			lf.Dologin();

			String url = driver.getCurrentUrl();

			Assert.assertEquals("http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard", url);

		
		}
		@AfterMethod

		public void teardown() {

			//driver.close();

		}

	}


