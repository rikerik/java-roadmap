package com.rikerik;


import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    /*
    The code initializes a logger object named "logger" using the LoggerFactory.getLogger() method from the SLF4J library.
    The logger is associated with the "App" class. The main() method is the starting point of the program.
    Inside this method, a log message is generated using the logger. The logger's info() method is invoked,
    and it logs a message indicating an example log from the "App" class using the placeholder "{}" and the simple name of the class obtained via App.class.getSimpleName().
     */
    private static final Logger logger = LoggerFactory.getLogger(App.class); //It is a generic logger from the SLF4J framework.

    /*
      The SLF4J interface does not have the setLevel() method because it depends on the specific logging framework being used.
      When we obtain a logger using LoggerFactory.getLogger("com.rikerik.App"), SLF4J returns a logger object specific to the chosen logging framework.
      However, SLF4J only provides a generic interface and does not include the setLevel() method.
      To access the logging framework's specific functionalities, such as setLevel(),
      We need to perform a typecast of the logger object returned by SLF4J to the corresponding logger class of the logging framework. In this case, we cast it to ch.qos.logback.classic.Logger for Logback.
       */
    private static final ch.qos.logback.classic.Logger parentLogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.rikerik.App"); // It is a logger specifically from the Logback logging framework (a concrete implementation of SLF4J).
    private static final ch.qos.logback.classic.Logger childlogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.rikerik.App.tests"); //It is also a Logback logger,
    private static final Logger rootLogger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
    //It is the root logger of the Logback framework.
    //It is used to configure and manage logging at the root level, affecting all loggers under it.


    public static void main(String[] args) {
        logger.info("Example log from {}", App.class.getSimpleName());
        System.out.println("---------------------------");

        parentLogger.setLevel(Level.INFO);     // Set the log level of parentLogger to INFO.
        parentLogger.warn("This message is logged because WARN > INFO.");
        parentLogger.debug("This message is not logged because DEBUG < INFO.");
        childlogger.info("INFO == INFO");     // Log an informational message with the childlogger, which will be logged because its log level is set to INFO.
        childlogger.debug("DEBUG < INFO");
        System.out.println("---------------------------");

        //It is another Logback logger specifically for the "com.rikerik" package.
        //It is separate from the logger variable of type org.slf4j.Logger.
        ch.qos.logback.classic.Logger logger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.rikerik");
        logger.debug("Hi there!");     // Log a debug message using the logger associated with "com.rikerik".
        logger.debug("This message is logged because DEBUG == DEBUG.");
        ((ch.qos.logback.classic.Logger) rootLogger).setLevel(Level.ERROR);  // Set the log level of the rootLogger to ERROR by casting it to Logback's Logger type.
        logger.warn("This message is not logged because WARN < ERROR.");
        logger.error("This is logged.");
        System.out.println("---------------------------");

        // Set log level to DEBUG
        parentLogger.setLevel(Level.DEBUG);
        childlogger.setLevel(Level.DEBUG);
        ((ch.qos.logback.classic.Logger) rootLogger).setLevel(Level.DEBUG);
        logger.setLevel(Level.DEBUG);

        //logging with parameters
        String message = "This is a String";
        Integer zero = 0;

        try {
            //The braces {} will accept any Object and uses its toString() method
            //to build a message only after verifying that the log message is required.
            logger.debug("Logging message: {}", message);
            logger.debug("Divide {} by {}", 42, zero);
            int result = 42 / zero;
        } catch (Exception e) {
            logger.error("Error dividing {} by {}", 42, zero);
        }

    }
}
