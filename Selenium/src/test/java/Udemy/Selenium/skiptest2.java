/**
 * 
 */
package Udemy.Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * 
 */
public class skiptest2 {
	
	@Test(enabled=false)
	public void log()
	{
		System.setProperty("configuration.xml","/Users/shubham-qa/Documents/GitCloneSumit/PlasmaTest/Selenium/configuration.xml");
		Logger logger=LogManager.getLogger(skiptest2.class);
		logger.trace("Configuration File Defined To Be :: "+System.getProperty("configuration.xml"));
		logger.info("Starting application...");
        logger.error("Encountered an error.s");
        logger.debug("Debugging information...");
	}
	
	@Test(enabled=true)
	public void reverse()
	{
		String s= "a/b$$xA";
		int l=0; 
		int r=s.length()-1;
		for(String c: s.split(""))
		{
			if(s.matches("[A-Za-z]"))
			{
				System.out.println("Matches");
			}
		}
	}
}
