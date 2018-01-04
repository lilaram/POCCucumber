package com.lilauto.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.lilauto.base.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends TestBase {

	
	@Before
	public void startscenario(Scenario sc)
	{
		System.out.println(sc.getName());
	}
	
	
	@After
	public void afterscenario(Scenario sc)
	{
		
//		if(sc.isFailed())
//		{
			
			 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			   
			 try {
				 String name=sc.getName();
				FileUtils.copyFile(scrFile, new File("C:\\Users\\admin\\workspace\\POCCucumber\\screenshots\\" +name+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//}
		
	}
	
}
