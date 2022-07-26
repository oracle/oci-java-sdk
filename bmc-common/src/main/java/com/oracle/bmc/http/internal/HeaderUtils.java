/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;

import javax.ws.rs.core.MultivaluedMap;

import java.util.Optional;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.internal.GuavaUtils;
import com.oracle.bmc.model.Range;

/**
 * Utilities to deal with header values.
 */
public class HeaderUtils {
    /**
     * Returns the header values for the given header key.
     *
     * @param headers
     *            The header map.
     * @param name
     *            The header to get the value for.
     * @return The values, or empty.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public static com.google.common /*Guava will be removed soon*/.base.Optional<List<String>> get(
            MultivaluedMap<String, String> headers, String name) {
        return GuavaUtils.adaptToGuava(getHeadersWithName(headers, name));
    }

    /**
     * Returns the header values for the given header key.
     *
     * @param headers
     *            The header map.
     * @param name
     *            The header to get the value for.
     * @return The values, or empty.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public static Optional<List<String>> getHeadersWithName(
            MultivaluedMap<String, String> headers, String name) {
        if (headers == null) {
            return Optional.empty();
        }
        // NOTE: this multivaluedmap should be the case-insensitive-key version,
        // but opting to do a simple search instead.
        String lowerCaseHeaderName = name.toLowerCase(Locale.ROOT);
        for (Entry<String, List<String>> entry : headers.entrySet()) {
            if (entry.getKey().toLowerCase(Locale.ROOT).equals(lowerCaseHeaderName)) {
                return Optional.of(entry.getValue());
            }
        }
        return Optional.empty();
    }

    /**
     * Deserialize a header value to its desired type if possible.
     *
     * @param headerName
     *            The header name.
     * @param value
     *            The header value.
     * @param clazz
     *            The class to convert to.
     * @return A new class instance.
     */
    @SuppressWarnings("unchecked")
    @InternalSdk(backwardCompatibilityRequired = true)
    public static <T> T toValue(String headerName, String value, Class<T> clazz) {
        if (clazz == String.class) {
            return (T) value;
        }
        if (clazz == Integer.class) {
            return (T) Integer.valueOf(value);
        }
        if (clazz == Long.class) {
            return (T) Long.valueOf(value);
        }
        if (clazz == Float.class) {
            return (T) Float.valueOf(value);
        }
        if (clazz == Double.class) {
            return (T) Double.valueOf(value);
        }
        if (clazz == Boolean.class) {
            return (T) Boolean.valueOf(value);
        }
        if (clazz == Date.class) {
            return (T) HttpDateUtils.parse(headerName, value);
        }
        if (clazz == Range.class) {
            return (T) Range.parse(value);
        }
        if (clazz == BigDecimal.class) {
            return (T) new BigDecimal(value);
        }
        if (clazz.isEnum()) {
            try {
                return clazz.cast(
                        clazz.getDeclaredMethod("create", String.class).invoke(null, value));
            } catch (IllegalAccessException
                    | InvocationTargetException
                    | NoSuchMethodException
                    | IllegalArgumentException e) {
                throw new IllegalArgumentException(
                        "Could not create enum '" + clazz.getName() + "', value '" + value + "'",
                        e);
            }
        }
        throw new IllegalArgumentException("Unknown header type: " + clazz);
    }
}
