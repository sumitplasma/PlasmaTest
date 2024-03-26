/**
 * 
 */
package Udemy.Selenium;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * 
 */
public class skiptest2 {
	
	@Test
	public void log()
	{
		System.setProperty("configuration.xml","/Users/shubham-qa/Documents/GitCloneSumit/PlasmaTest/Selenium/configuration.xml");
		Logger logger=LogManager.getLogger(skiptest2.class);
		logger.trace("Configuration File Defined To Be :: "+System.getProperty("configuration.xml"));
		logger.info("Starting application...");
        logger.error("Encountered an error.s");
        logger.debug("Debugging information...");
	}
}
