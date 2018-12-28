package AppDemo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	

	@Test 
	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
		
		File f = new File("src/test/java");
		File fs = new File(f,"paytm (1).apk");
		

//**********************Set Capabilitie******************************************
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		if(device.equals("emulator"))
		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,"deka");
		}
		
		else if (device.equals("RealDevice"))
		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Andriod Device");
		}
		
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
		

	}

}
