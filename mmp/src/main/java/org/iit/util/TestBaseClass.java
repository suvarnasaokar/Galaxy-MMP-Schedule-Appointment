package org.iit.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBaseClass {

	
		protected WebDriver driver;
		@Parameters({"sBrowsertype","sURL"})
		@BeforeClass
		public void launchBrowser(String sBrowsertype ,String sURL)

		{
			
			if(sBrowsertype.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
				 driver = new ChromeDriver();
				
			}
			
			else if(sBrowsertype.equals("FireFox"))
			{
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
			}
			

				
			
			driver.get(sURL);
			driver.manage().window().maximize();
			

		}


		}

