/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import com.oracle.bmc.InternalSdk;
import org.slf4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Various runtime utils. */
@InternalSdk
public class JavaRuntimeUtils {
    // constant names are taken from the JPE so its easier to match
    private static final String VNUM = "([1-9][0-9]*)(((\\.0)*\\.[1-9][0-9]*)*)*";
    private static final String PRE = "[a-zA-Z0-9]+";
    private static final String JEP223 = String.format("^%s(-%s)?$", VNUM, PRE);
    private static final Pattern JEP223_PATTERN = Pattern.compile(JEP223);
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(JavaRuntimeUtils.class);

    /** JRE version as interpreted by the SDK. */
    public enum JreVersion {
        /** This version of the JRE is not supported. */
        Unsupported,
        /** Java 7 */
        Java_7,
        /** Java 8 */
        Java_8,
        /** Java 9 */
        Java_9,
        /** Java 11 */
        Java_11,
        /** Java 17 */
        Java_17,
        /** Java 21 */
        Java_21,
        /** Unknown version, may not be supported. */
        Unknown;
    }

    private static final JreVersion VERSION;

    static {
        VERSION = parse();
        LOG.info("Determined JRE version as {}", VERSION);
    }

    /**
     * Parses the <code>java.version</code> system property to the appropriate JreVersion.
     *
     * <p>Exposed for testing.
     *
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
            // OCI requires TLS1.2, which is only supported on Java7+.
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
                } else if (majorVersion == 11) {
                    version = JreVersion.Java_11;
                } else if (majorVersion == 17) {
                    version = JreVersion.Java_17;
                } else if (majorVersion == 21) {
                    version = JreVersion.Java_21;
                }
            }
        }

        return version;
    }

    /**
     * Get the JRE version.
     *
     * @return The JRE version.
     */
    public static JreVersion getRuntimeVersion() {
        return VERSION;
    }
}
