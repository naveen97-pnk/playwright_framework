/**
 * Project Name: Playwright Learning by navepilla@deloitte.com
 * Author: Naveen Kumar Pilla
 * Date: 11 Nov, 2024
 * Description: This class is used to log the details using Log4j2 library
 */

package com.playwright.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class Name: LoggerUtil
 * Description: It is easier for SDETs/Devs to capture, format, and manage log
 * data effectively. This helps in debugging applications, monitoring their
 * health, and auditing actions taken by the application.
 */
public class LoggerUtil {
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class); // logger instance

    /*
     * This method helps to capture the message as an information
     * 
     * @param message This parameter is used to pass the string data
     */
    public static void logInfo(String message) {
        logger.info(message);
    }

    /*
     * This method helps to capture the message as debug
     * 
     * @param message This parameter is used to pass the string data
     */
    public static void logDebug(String message) {
        logger.debug(message);
    }

    /*
     * This method helps to capture the message as an error
     * 
     * @param message This parameter is used to pass the string data
     */
    public static void logError(String message) {
        logger.error(message);
    }

    /*
     * This method helps to capture the message as a warning
     * 
     * @param message This parameter is used to pass the string data
     */
    public static void logWarn(String message) {
        logger.warn(message);
    }
}