/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Utility class for JSON operations.
 *
 * <p>This class provides centralized access to an {@link ObjectMapper} instance, which can be used
 * for JSON serialization and deserialization.
 */
public final class JsonUtils {

    /** Private constructor to prevent instantiation of this utility class. */
    private JsonUtils() {}

    /**
     * The shared instance of {@link ObjectMapper} used for JSON operations.
     *
     * <p>This instance is configured with default settings and can be used for serializing and
     * deserializing JSON data.
     */
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
}
