package org.makeMyTrip;

import java.awt.AWTException;
import java.io.IOException;

public class MakeMyTrip extends UtilityClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		
		launchApp("https://www.makemytrip.com/");
		
		max();
		
		Thread.sleep(10000);
		ss();
		
        HomePage hm=new HomePage();
		
		fill(hm.getFrom(),"Delhi");
		rob();
		
		fill(hm.getTo(),"Bengaluru");
		rob();
		
		Thread.sleep(3000);
		klick(hm.getDep());
		
		klick(hm.getDate());
		
		klick(hm.getBtn());
		
		Thread.sleep(10000);
		ss();
		
		
	}
}
