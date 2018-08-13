package traininglog4j;

import org.apache.log4j.Logger;

public class Sample
{
	static Logger logger = Logger.getLogger(Sample.class);
	
	public static void main(String args[])
	{		
		logger.info("***** NEW RUN *****");
		logger.info("Starting the log messages");
		logger.debug("Starting the log messages");
		logger.error("Starting the log messages");
		logger.warn("Starting the log messages");
	}
}
