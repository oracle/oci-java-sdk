/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.serialization.jackson.internal;

import com.fasterxml.jackson.databind.util.ISO8601Utils;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.oracle.bmc.http.client.InternalSdk;

import java.text.FieldPosition;
import java.util.Date;

/**
 * Swagger uses RFC3339 formats for date. By default, Jackson's StdDateFormatter will use a format
 * that is not exactly compatible (ex, uses hour offsets instead of 'Z').
 *
 * <p>Leave deserialization alone, only take over serialization.
 */
@InternalSdk
@SuppressWarnings({"deprecation", "serial"})
public class Rfc3339DateFormat extends StdDateFormat {
    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        // Same as ISO8601DateFormat but we always serialize millis
        toAppendTo.append(ISO8601Utils.format(date, true));
        return toAppendTo;
    }

    @Override
    public Rfc3339DateFormat clone() {
        return new Rfc3339DateFormat();
    }

    public Rfc3339DateFormat() {}
}
