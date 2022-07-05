/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.text.FieldPosition;
import java.util.Date;
import com.fasterxml.jackson.databind.util.ISO8601Utils;
import com.fasterxml.jackson.databind.util.StdDateFormat;

/**
 * Swagger uses RFC3339 formats for date.  By default, Jackson's StdDateFormatter
 * will use a format that is not exactly compatible (ex, uses hour offsets instead of 'Z').
 * <p>
 * Leave deserialization alone, only take over serialization.
 */
@SuppressWarnings({"deprecation", "serial"})
public class RFC3339DateFormat extends StdDateFormat {
    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        // Same as ISO8601DateFormat but we always serialize millis
        toAppendTo.append(formatRfc3339(date, true));
        return toAppendTo;
    }

    public static String formatRfc3339(Date date, boolean includeMillis) {
        return ISO8601Utils.format(date, includeMillis);
    }

    @Override
    public RFC3339DateFormat clone() {
        return new RFC3339DateFormat();
    }

    RFC3339DateFormat() {}
}
