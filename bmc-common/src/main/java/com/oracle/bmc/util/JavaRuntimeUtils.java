/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.oracle.bmc.InternalSdk;

import lombok.extern.slf4j.Slf4j;

/**
 * Various runtime utils.
 */
@Slf4j
@InternalSdk
public class JavaRuntimeUtils {
    // constant names are taken from the JPE so its easier to match
    private static final String VNUM = "([1-9][0-9]*)(((\\.0)*\\.[1-9][0-9]*)*)*";
    private static final String PRE = "[a-zA-Z0-9]+";
    private static final String JEP223 = String.format("^%s(-%s)?$", VNUM, PRE);
    private static final Pattern JEP223_PATTERN = Pattern.compile(JEP223);

    /**
     * JRE version as interpreted by the SDK.
     */
    public enum JreVersion {
        /** This version of the JRE is not supported. */
        Unsupported,
        /** Java 7 */
        Java_7,
        /** Java 8 */
        Java_8,
        /** Java 9 */
        Java_9,
        /** Unknown version, may not be supported. */
        Unknown;
    }

    private static final JreVersion VERSION;

    static {
        VERSION = parse();
        LOG.info("Determined JRE version as {}", VERSION);
    }

    /**
     * Parses the <code>java.version</code> system property to the appropriate
     * JreVersion.
     * <p>
     * Exposed for testing.
     * @return The JreVersion.
     */
    static JreVersion parse() {
        JreVersion version = JreVersion.Unknown;
        String versionString = System.getProperty("java.version");

        if (versionString.startsWith("1.")) {
            // Up to Java 8:
            // http://www.oracle.com/technetwork/java/javase/versioning-naming-139433.html
            String[] versionParts = versionString.split("\\.");
            int featureVersion = Integer.parseInt(versionParts[1]);
            // BMC requires TLS1.2, which is only supported on Java7+.
            if (featureVersion < 7) {
                version = JreVersion.Unsupported;
            } else if (featureVersion == 7) {
                version = JreVersion.Java_7;
            } else if (featureVersion == 8) {
                version = JreVersion.Java_8;
            } else if (featureVersion == 9) {
                // shouldn't happen per below, but leaving in for now
                version = JreVersion.Java_9;
            }
        } else {
            // Starting with Java 9:
            // http://openjdk.java.net/jeps/223
            Matcher matcher = JEP223_PATTERN.matcher(versionString);
            if (matcher.matches()) {
                int majorVersion = Integer.parseInt(matcher.group(1));
                if (majorVersion == 9) {
                    version = JreVersion.Java_9;
                }
            }
        }

        return version;
    }

    /**
     * Get the JRE version.
     * @return The JRE version.
     */
    public static JreVersion getRuntimeVersion() {
        return VERSION;
    }
}
