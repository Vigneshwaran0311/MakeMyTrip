package org.makeMyTrip;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UtilityClass {
	
		static WebDriver driver;
		
		public static void launchApp(String s) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//div//chromedriver85.exe");
		    driver=new ChromeDriver();
			driver.get(s);
			
		}
		
		public static void max() {
			driver.manage().window().maximize();
		}
		
		public static void klick(WebElement w) {
			
	        w.click();  
		}
		
	public static void fill(WebElement w,String s) {
			
			w.sendKeys(s);	
		  
	}
	
	public static void ss() throws IOException {
	
   Date d=new Date();
   SimpleDateFormat sim=new SimpleDateFormat("dd.mm.ss");
	  
    String name = d.toString();                 
	String r = name.replaceAll(" ","_"); 
	String r1 = r.replaceAll(":","_");
	 TakesScreenshot tk =(TakesScreenshot)driver;
	 File src = tk.getScreenshotAs(OutputType.FILE);
	 File des=new File(System.getProperty("user.dir")+"//makemytrip//"+r1+".png");
	 
	 FileUtils.copyFile(src,des);
	}
	
	public static void rob() throws InterruptedException, AWTException {
		Robot r=new Robot();
		Thread.sleep(8000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	  }

}
