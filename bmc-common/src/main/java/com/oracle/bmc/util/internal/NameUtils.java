/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Utility functions related to naming
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class NameUtils {
    /**
     * Canonicalizes a name for use in enum types. This specifically is for enum ids (values) that matched
     * the enum name except were lower case and used hyphen delimiters vs upper case and underscores (enum naming convention)
     *
     * @param name The un-canonicalized name.
     * @return The canonicalized name.
     */
    public static String canonicalizeForEnumTypes(final String name) {
        return name.toUpperCase().replaceAll("-", "_");
    }
}
