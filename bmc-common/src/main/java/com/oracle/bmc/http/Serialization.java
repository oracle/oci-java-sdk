/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.oracle.bmc.http.internal.ExplicitlySetFilter;
import com.oracle.bmc.http.internal.RFC3339DateFormat;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.util.internal.StringUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Serialization gives access to the serializer/deserializer used by the OCI Java SDK.
 */
public enum Serialization {
// no-member enum to prevent instantiation
;
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(Serialization.class);

    private static final String CUSTOM_OBJECT_MAPPER_CLASS_SYSTEM_PROPERTY =
            "oci.javasdk.http.serialization.defaultObjectMapper";

    private static ObjectMapper DEFAULT_MAPPER;

    static {
        ObjectMapper customMapper = getCustomObjectMapper();
        DEFAULT_MAPPER = customMapper != null ? customMapper : createDefaultMapper();
    }

    private static ObjectMapper createDefaultMapper() {
        final ObjectMapper defaultMapper = new ObjectMapper();
        // Our default object mapper will ignore unknown properties when
        // deserializing results
        defaultMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // Serialize Date instances using the DateFormat we specify, do not serialize into
        // timestamps.
        defaultMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        // set explicit formatter that will serialize correctly
        defaultMapper.setDateFormat(new RFC3339DateFormat());
        // Register module to serialize Duration class
        defaultMapper.registerModule(new JavaTimeModule());
        FilterProvider filters =
                new SimpleFilterProvider()
                        .addFilter(ExplicitlySetFilter.NAME, ExplicitlySetFilter.INSTANCE);
        defaultMapper.setFilterProvider(filters);
        return defaultMapper;
    }

    static ObjectMapper getCustomObjectMapper() {
        ObjectMapper mapperClass = null;
        final String className = System.getProperty(CUSTOM_OBJECT_MAPPER_CLASS_SYSTEM_PROPERTY);
        if (!StringUtils.isBlank(className)) {
            try {
                final Class<?> customClass = Class.forName(className);
                mapperClass = (ObjectMapper) customClass.newInstance();
                return mapperClass;
            } catch (final ClassNotFoundException e) {
                LOG.info(
                        "Configured to create custom object mapper class for '"
                                + className
                                + "', but none exists");
            } catch (final SecurityException | IllegalAccessException | InstantiationException e) {
                LOG.info("Unable to create new custom object mapper instance", e);
            } catch (final ClassCastException e) {
                LOG.info("Unable to cast '" + className + "' into an instance of ObjectMapper");
            }
        }
        return mapperClass;
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
