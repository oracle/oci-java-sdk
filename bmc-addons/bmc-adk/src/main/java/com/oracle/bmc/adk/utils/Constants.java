/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The Constants class provides a collection of constants used throughout the application. These
 * constants are used for configuration, logging, and other purposes.
 */
public class Constants {
    public static final Map<String, String> FREEFORM_TAGS;

    static {
        Map<String, String> freeformTags = new HashMap<>();
        freeformTags.put("ConfiguredByADK", "ADK-Java");
        FREEFORM_TAGS = Collections.unmodifiableMap(freeformTags);
    }

    public static final String DEFAULT_SESSION_NAME = "Session";
    public static final String DEFAULT_SESSION_DESCRIPTION = "Session created by ADK";

    public static final Integer DEFAULT_MAX_STEP = 10;
    public static final Integer DEFAULT_TIMEOUT_IN_MILLIS = 100000;
}
