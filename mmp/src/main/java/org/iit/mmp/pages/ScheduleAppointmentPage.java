package org.iit.mmp.pages;

import org.iit.util.TestBaseClass;
import org.iit.util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ScheduleAppointmentPage extends TestBaseClass {

	
	private WebDriver driver;
	public ScheduleAppointmentPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createAppointment(String doctorName) throws InterruptedException
	{
		//driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/sheduleappointments.php");
		Thread.sleep(5000);
	   // driver.findElement(By.xpath("//span[contains(text(),'Schedule')]")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		driver.findElement(By.xpath("//h4[text()='"+doctorName+"']/ancestor::ul/following-sibling::button")).click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.id("myframe")));
		driver.findElement(By.id("datepicker")).click();
		


		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[6]/a")).click();
		new Select(driver.findElement(By.id("time"))).selectByVisibleText("10Am");

		driver.findElement(By.id("ChangeHeatName")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("sym")).sendKeys("fever");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
         

	}
	public boolean verifyAppointmentDetails(String symptom) throws InterruptedException
	{ 
		Thread.sleep(10000);
		WebElement e = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]"));
		boolean result = e.getText().contains("fever");
		System.out.println("result" + result);
		return result;
	}

	
		// TODO Auto-generated method stub
		
	}


