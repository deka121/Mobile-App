package AppDemo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MobilePostpaid extends base{

	@Test
	public static void main(String[] args) throws MalformedURLException {
     
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
		
	@Test
	public void LaunchApp() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
	    driver.findElementByXPath("//android.widget.Button[@text='ALLOW']").click();
	    driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	    //driver.findElementById("net.one97.paytm:id/edit_username").sendKeys("9168682671");
	    //driver.findElementById("net.one97.paytm:id/edit_password").sendKeys("dhruba121");
	    driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("9168682671");
	    driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("dhruba121");
	    driver.findElementById("net.one97.paytm:id/lyt_sign_in_button").click();
	    driver.wait(10000);
	    driver.findElementById("net.one97.paytm:id/btn_cancel").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Do It Later']").click();
	    driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	    driver.findElementByXPath("//android.widget.Button[@text='ALLOW']").click();
	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollintoView(text(\"Mobile Postpaid\"));"); 			
		driver.findElementByXPath("//android.widget.TextView[@text='Mobile Postpaid']").click();
		//Syntax - ("//tagname[@attribute='name']")
		
		
		 
	}
		

}

