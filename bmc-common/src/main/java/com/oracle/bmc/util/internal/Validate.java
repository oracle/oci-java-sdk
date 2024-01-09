/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import java.util.Arrays;

/** Argument validation. */
public enum Validate {
    ; // prevent instantiation

    /**
     * Throw {@link NullPointerException} if the object is null.
     *
     * @param o object that has to be non-null
     * @param reason exception message
     * @param values values to be put in placeholders in reason (e.g. "%s").
     * @return the object
     * @throws NullPointerException if the object is null
     */
    public static <T> T notNull(T o, String reason, Object... values) {
        if (o == null) {
            throw new NullPointerException(String.format(reason, values));
        }
        return o;
    }

    /**
     * Throw {@link IllegalArgumentException} if the object is not an instance of the class.
     *
     * @param clazz the class the object has to be
     * @param o the object
     * @param reason the exception message
     * @param values values to be put in placeholders in reason (e.g. "%s").
     * @return the object
     * @throws IllegalArgumentException if the object is not an instance of the class
     */
    public static <T> T isInstanceOf(Class<?> clazz, T o, String reason, Object... values) {
        if (!(clazz.isInstance(o))) {
            throw new IllegalArgumentException(String.format(reason, values));
        }
        return o;
    }

    /**
     * Throw @{@link NullPointerException} if the string is null, or {@link
     * IllegalArgumentException} if the string is just whitespace.
     *
     * @param s string
     * @param reason exception message
     * @param values values to be put in placeholders in reason (e.g. "%s").
     * @return the string
     * @throws NullPointerException if the object is null
     * @throws IllegalArgumentException if the object is just whitespace.
     */
    public static String notBlank(String s, String reason, Object... values) {
        if (s == null) {
            throw new NullPointerException(String.format(reason, values));
        }
        if (s.trim().isEmpty()) {
            throw new IllegalArgumentException(String.format(reason, values));
        }
        return s;
    }

    /**
     * Throw {@link IllegalArgumentException} if the condition is false.
     *
     * @param condition the condition
     * @param reason exception message
     * @param values values to be put in placeholders in reason (e.g. "%s").
     * @throws NullPointerException if the condition is false
     */
    public static void isTrue(boolean condition, String reason, Object... values) {
        if (!condition) {
            throw new IllegalArgumentException(String.format(reason, values));
        }
    }

    /**
     * Throw {@link IllegalArgumentException} if value is strictly less than minimum or strictly
     * greater than maximum.
     *
     * @param minimum the minimum, inclusive
     * @param maximum the maximum, inclusive
     * @param value the value to check
     * @param reason the exception message
     * @param values values to be put in placeholders in reason (e.g. "%s").
     * @return the value
     * @throws IllegalArgumentException if the value is out of bounds
     */
    public static long inclusiveBetween(
            long minimum, long maximum, long value, String reason, Object... values) {
        if (minimum > maximum) {
            throw new IllegalArgumentException(
                    String.format("minimum '%d' was greater than maximum '%d'", minimum, maximum));
        }
        if (minimum > value || maximum < value) {
            throw new IllegalArgumentException(String.format(reason, values));
        }
        return value;
    }

    /**
     * Throw {@link IllegalArgumentException} if one of the array elements is null.
     *
     * @param array array to check
     * @param reason exception message
     * @param values values to be put in placeholders in reason (e.g. "%s").
     * @param <T> array element type
     * @return the array
     * @throws IllegalArgumentException if one of the array elements is null
     */
    public static <T> T[] noNullElements(T[] array, String reason, Object... values) {
        if (array == null) {
            throw new NullPointerException(String.format(reason, values));
        }
        if (Arrays.stream(array).anyMatch(o -> o == null)) {
            throw new IllegalArgumentException(String.format(reason, values));
        }
        return array;
    }

    /**
     * Throw {@link IllegalArgumentException} if the array is empty
     *
     * @param array array to check
     * @param reason exception message
     * @param values values to be put in placeholders in reason (e.g. "%s").
     * @param <T> array element type
     * @return the array
     * @throws IllegalArgumentException if the array is empty
     */
    public static <T> T[] notEmpty(T[] array, String reason, Object... values) {
        if (array == null) {
            throw new NullPointerException(String.format(reason, values));
        }
        if (array.length == 0) {
            throw new IllegalArgumentException(String.format(reason, values));
        }
        return array;
    }
}
