/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.serialization.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.oracle.bmc.http.client.InternalSdk;
import com.oracle.bmc.http.client.Serializer;
import com.oracle.bmc.serialization.jackson.internal.ExplicitlySetFilter;
import com.oracle.bmc.serialization.jackson.internal.Rfc3339DateFormat;

import java.io.IOException;

import static com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME;

/**
 * Implementation of Serializer for Jackson.
 *
 * <p>Use the {@link JacksonSerializer#getDefaultSerializer()} to get the instance with default
 * configuration for java sdk.
 *
 * <p>Exposed only for internal use.
 */
@InternalSdk
public final class JacksonSerializer implements Serializer {

    private static final ObjectMapper DEFAULT_OBJECT_MAPPER = new ObjectMapper();
    private static final JacksonSerializer DEFAULT_SERIALIZER =
            new JacksonSerializer(DEFAULT_OBJECT_MAPPER);

    static {
        // Our default object mapper will ignore unknown properties when
        // deserializing results
        DEFAULT_OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // Serialize Date instances using the DateFormat we specify, do not serialize into
        // timestamps.
        DEFAULT_OBJECT_MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        // set explicit formatter that will serialize correctly
        DEFAULT_OBJECT_MAPPER.setDateFormat(new Rfc3339DateFormat());
        // Register module to serialize Duration class
        DEFAULT_OBJECT_MAPPER.registerModule(new JavaTimeModule());

        FilterProvider filters =
                new SimpleFilterProvider()
                        .addFilter(EXPLICITLY_SET_FILTER_NAME, ExplicitlySetFilter.INSTANCE);

        DEFAULT_OBJECT_MAPPER.setFilterProvider(filters);
    }

    private final ObjectMapper objectMapper;

    @InternalSdk
    JacksonSerializer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public <T> T readValue(String s, Class<T> type) throws IOException {
        return objectMapper.readValue(s, type);
    }

    @Override
    public <T> T readValue(byte[] bytes, Class<T> type) throws IOException {
        return objectMapper.readValue(bytes, type);
    }

    @Override
    public String writeValueAsString(Object o) throws IOException {
        return objectMapper.writeValueAsString(o);
    }

    /**
     * Get the instance of Jackson JSON mapper with default configuration for java sdk
     * serialization.
     *
     * @return JSON mapper to handle JSON serialization.
     */
    @InternalSdk
    public static JacksonSerializer getDefaultSerializer() {
        return DEFAULT_SERIALIZER;
    }

    /**
     * Get the instance of Object Mapper with default configuration for java sdk serialization.
     *
     * @return Object mapper to handle JSON serialization
     */
    @InternalSdk
    public static ObjectMapper getDefaultObjectMapper() {
        return DEFAULT_OBJECT_MAPPER;
    }
}
