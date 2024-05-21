/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Utilities for interacting with files.
 */
public enum FileUtils {
    ; // prevent instantiation

    static final boolean IS_OS_WINDOWS;

    static {
        boolean isOsWindows = false;
        try {
            isOsWindows = System.getProperty("os.name").startsWith("Windows");
        } catch (SecurityException e) {
            isOsWindows = false;
        }
        IS_OS_WINDOWS = isOsWindows;
    }

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
            return System.getProperty("user.home") + correctPath(IS_OS_WINDOWS, path.substring(1));
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
    /**
     * Return true if the content of both files is the same.
     * @param f1 first file
     * @param f2 second file
     * @return true if the same
     * @throws IOException
     */
    public static boolean contentEquals(File f1, File f2) throws IOException {
        try (InputStream is1 = new FileInputStream(f1);
                InputStream is2 = new FileInputStream(f2)) {
            return contentEquals(is1, is2);
        }
    }

    /**
     * Return true if the content of both streams is the same.
     * @param is1 first stream
     * @param is2 second stream
     * @return true if the same
     * @throws IOException
     */
    public static boolean contentEquals(InputStream is1, InputStream is2) throws IOException {
        if (!(is1 instanceof BufferedInputStream)) {
            is1 = new BufferedInputStream(is1);
        }
        if (!(is2 instanceof BufferedInputStream)) {
            is2 = new BufferedInputStream(is2);
        }

        int ch;
        while ((ch = is1.read()) != -1) {
            if (ch != is2.read()) {
                // streams differed, or stream 1 didn't end but stream 2 did (-1)
                return false;
            }
        }

        // stream 1 ended
        if (is2.read() != -1) {
            // but stream2 didn't
            return false;
        }
        return true;
    }

    /**
     * Copy the contents of the input stream to the output stream.
     * @param source input stream
     * @param destination output stream
     * @return number of bytes read
     * @throws IOException
     */
    public static long copy(InputStream source, OutputStream destination) throws IOException {
        byte[] buf = new byte[8192];
        long totalBytes = 0;
        int bytesRead;
        while ((bytesRead = source.read(buf)) > 0) {
            destination.write(buf, 0, bytesRead);
            totalBytes += bytesRead;
        }
        return totalBytes;
    }
}
