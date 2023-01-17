/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

/** Utility functions related to naming */
public enum NameUtils {
    ; // prevent instantiation

    /**
     * Canonicalizes a name for use in enum types. This specifically is for enum ids (values) that
     * matched the enum name except were lower case and used hyphen delimiters vs upper case and
     * underscores (enum naming convention)
     *
     * @param name The un-canonicalized name.
     * @return The canonicalized name.
     */
    public static String canonicalizeForEnumTypes(final String name) {
        return name.toUpperCase().replaceAll("-", "_");
    }

    /** Convert enum type name to un-canonicalized name * */
    public static String decanonicalizeFromEnumTypes(final String name) {
        return name.toLowerCase().replaceAll("_", "-");
    }
}
