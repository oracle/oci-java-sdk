/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.oracle.bmc.http.internal.ExplicitlySetFilter;
import com.oracle.bmc.http.internal.RFC3339DateFormat;

/**
 * Serialization gives access to the serializer/deserializer used by the OCI Java SDK.
 */
public enum Serialization {
// no-member enum to prevent instantiation
;

    private static final ObjectMapper DEFAULT_MAPPER = new ObjectMapper();

    static {
        // Our default object mapper will ignore unknown properties when
        // deserializing results
        DEFAULT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // Serialize Date instances using the DateFormat we specify, do not serialize into
        // timestamps.
        DEFAULT_MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        // set explicit formatter that will serialize correctly
        DEFAULT_MAPPER.setDateFormat(new RFC3339DateFormat());

        FilterProvider filters =
                new SimpleFilterProvider()
                        .addFilter(ExplicitlySetFilter.NAME, ExplicitlySetFilter.INSTANCE);

        DEFAULT_MAPPER.setFilterProvider(filters);
    }

    /**
     * Returns the ObjectMapper used to handle JSON requests.
     * <p>
     * Exposed only for internal use.
     * @return The ObjectMapper used.
     */
    public static ObjectMapper getObjectMapper() {
        return DEFAULT_MAPPER;
    }
}
