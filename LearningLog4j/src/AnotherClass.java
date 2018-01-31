import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnotherClass {

	static Logger logger = LogManager.getLogger();
	
	public void testMethod() {
		logger.log(Level.FATAL, "Fatal event");
		logger.log(Level.INFO, "Info event");
		
		
	}
}
