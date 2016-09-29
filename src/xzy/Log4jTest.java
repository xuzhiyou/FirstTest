package xzy;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.PropertyConfigurator;

public class Log4jTest {
	
	private static Logger logger = Logger.getLogger(Log4jTest.class);
	
	public Log4jTest(){
		
	}
	
	public static void main(String[] args) {
		//必须放在方法里
//		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j4.properties"));
		PropertyConfigurator.configure("src/xzy/log4j2.properties");
		logger.debug("Start of the main() in TestLog4j");
		logger.info("Just testing a log message with priority set to INFO");
		logger.warn("Just testing a log message with priority set to WARN");
		logger.error("Just testing a log message with priority set to ERROR");
		logger.fatal("Just testing a log message with priority set to FATAL");
		logger.log(Priority.WARN, "Testing a log message use a alternate form");
		logger.debug(Log4jTest.class.getName());

		// TODO Auto-generated method stub

	}

}
