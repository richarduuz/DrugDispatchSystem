import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * A singleton patient logger class.
 */

public class PatientLogger implements GeneralLogger{
    private static PatientLogger instance = new PatientLogger();
    private static Logger logger = Logger.getLogger(App.class);

    private PatientLogger(){}

    /**
     *
     * @return the singleton instance of PatientLogger
     */
    public static PatientLogger getInstance(){
        return instance;
    }

    /**
     *
     * @return the logger with properties loaded of the PatientLogger instance.
     */
    public Logger getLogger() {
        PropertyConfigurator.configure("log.properties");
        return logger;
    }
}
