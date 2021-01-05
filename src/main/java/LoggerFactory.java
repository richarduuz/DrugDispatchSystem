/**
 * There may be different type of loggers depending on different properties, the LoggerFactory will return the precise
 * logger, though there is only one patient logger.
 */

public class LoggerFactory {

    /**
     * Given the logger type, return the relevant logger. (Though there is only patient logger)
     * @param loggerType
     * @return The relevant type of logger given the logger type.
     */
    public GeneralLogger getLoggerType(String loggerType){
        if(loggerType == null){
            return null;
        }
        if(loggerType.equalsIgnoreCase("PATIENT")) {
            return PatientLogger.getInstance();
        }
        return null;
    }
}
