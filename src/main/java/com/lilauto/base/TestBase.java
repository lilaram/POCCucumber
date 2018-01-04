package com.lilauto.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.lilauto.util.Constants;
import com.stepdefination.stepfiles.LoginStepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {

	public static Properties config;
	public static WebDriver driver;
    public static Logger logger;
	public static void initBrowser() {
		logger = Logger.getLogger(LoginStepDefination.class);
		   PropertyConfigurator.configure("log4j.properties");
		initconfig();
		//driver=null;
		if (config.getProperty("Browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\workspace\\POCCucumber\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (false) {
		} else if (false) {
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.navigate().to(config.getProperty("Url"));

	}

	public void closeBrowser() {
		driver.close();
		try
		{
		//driver = null;
		}
		catch(Exception e){}

	}

	public static void initconfig() {
		config = new Properties();

		try {
			FileInputStream fin = new FileInputStream(Constants.CONFIG_FILE_PATH);
			try {
				config.load(fin);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
