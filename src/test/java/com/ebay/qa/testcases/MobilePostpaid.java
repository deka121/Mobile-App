package com.ebay.qa.testcases;

import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MobilePostpaid extends base{

	@Test
	public static void main(String[] args) throws MalformedURLException {
     
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
		
	@Test
	public void LaunchApp(Properties prop) throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
	  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).ScrollIntoView(text(\"value\")");
      driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys(prop.getProperty("name"));
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(prop.getProperty("password"));
	  TouchAction t = new TouchAction(driver);
	  	driver.findElementByClassName("android.widget.EditText. 65-inch TV").click();
	   driver.manage().window().getSize() ;
				 
	}
		
}

