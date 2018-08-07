package org.iit.mmp.test;

import java.io.IOException;

import org.iit.mmp.pages.ScheduleAppointmentPage;
import org.iit.util.TestBaseClass;
import org.iit.util.Utility;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class ScheduleAppointment extends TestBaseClass {


	/*@DataProvider(name="DP")
	public String[][] feedData() throws BiffException, IOException
	{
		String data[][] = Utility.readXLS();
		return data;
	}*/

	@Parameters({"doctorName"})
	@Test
	public void scheduleAppointment (String doctorName) throws InterruptedException
	{
		ScheduleAppointmentPage s1 = new ScheduleAppointmentPage(driver);
	    s1.createAppointment(doctorName);
	    
		boolean result = s1.verifyAppointmentDetails("fever");
		Assert.assertTrue(result);
	}

}
