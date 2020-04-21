/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import org.apache.commons.lang3.SystemUtils;

/**
 * Utilities for interacting with files.
 */
public class FileUtils {

    /**
     * Attempts to expand paths that may contain unix-style home shorthand.
     * @param path The path
     * @return The path after expanding the home directory, if needed.
     */
    public static String expandUserHome(final String path) {
        // If the home (~) shortcut is used, then attempt to determine correct path.
        // Otherwise, leave as is to allow users to always be able to specify a path
        // without the SDK modifying it.
        if (path.startsWith("~/") || path.startsWith("~\\")) {
            return System.getProperty("user.home")
                    + correctPath(SystemUtils.IS_OS_WINDOWS, path.substring(1));
        } else {
            return path;
        }
    }

    // Handle the case where somebody is copying the config file
    // between platforms (or copying examples without changing values)
    static String correctPath(boolean isWindows, String path) {
        if (isWindows) {
            // https://msdn.microsoft.com/en-us/library/aa365247
            // forward slash is reserved, assume its not supposed to
            // be there and replace with back slash
            path = path.replace('/', '\\');
        }
        // back slash is not a reserved character on other platforms,
        // so do not attempt to modify it
        return path;
    }
}
