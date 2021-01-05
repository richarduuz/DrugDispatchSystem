import org.apache.log4j.Logger;

/**
 * A collection of all type of loggers(only one type right now.)
 */
public interface GeneralLogger {
    /**
     * To return the logger in different classes.
     * @return the logger in the related instance.
     */
    Logger getLogger();
}
