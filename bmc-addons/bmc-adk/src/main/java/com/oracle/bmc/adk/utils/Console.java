/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The Console class provides methods for logging messages to the console with colored output. */
public class Console {

    private static final Logger LOG = LoggerFactory.getLogger(Console.class);

    /**
     * Enum representing the available colors for logging.
     *
     * <p>Each color is associated with an ANSI escape code.
     */
    public enum Color {
        RESET("\u001B[0m"),
        BLACK("\u001B[30m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"),
        PURPLE("\u001B[35m"),
        CYAN("\u001B[36m"),
        WHITE("\u001B[37m");

        private final String colorCode;

        /**
         * Constructs a new Color enum with the given ANSI escape code.
         *
         * @param colorCode the ANSI escape code for the color
         */
        Color(String colorCode) {
            this.colorCode = colorCode;
        }

        /**
         * Returns the ANSI escape code for this color.
         *
         * @return the ANSI escape code
         */
        public String getColorCode() {
            return colorCode;
        }
    }

    /**
     * Logs a message at the INFO level with the specified color.
     *
     * @param color the color to use for the message
     * @param message the message to log
     */
    public static void log(Color color, String message) {
        // Log at INFO level; adjust as needed
        LOG.info(color.getColorCode() + message + Color.RESET.getColorCode());
    }

    /**
     * Logs a message at the DEBUG level with the specified color.
     *
     * @param color the color to use for the message
     * @param message the message to log
     */
    public static void debug(Color color, String message) {
        // Log at INFO level; adjust as needed
        LOG.debug(color.getColorCode() + message + Color.RESET.getColorCode());
    }

    /**
     * Logs a message at the ERROR level with the specified color.
     *
     * @param color the color to use for the message
     * @param message the message to log
     */
    public static void error(Color color, String message) {
        // Log at INFO level; adjust as needed
        LOG.error(color.getColorCode() + message + Color.RESET.getColorCode());
    }
}
