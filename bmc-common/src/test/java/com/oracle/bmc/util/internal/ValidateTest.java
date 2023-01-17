/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidateTest {
    @Test
    public void testNotNull() {
        String value = "Foobar";
        assertEquals(value, Validate.notNull(value, "should not be %s", "null"));

        try {
            Validate.notNull(null, "should not be %s", "null");
        } catch (NullPointerException npe) {
            assertEquals("should not be null", npe.getMessage());
        }
    }

    @Test
    public void testIsInstanceOf() {
        Integer value = 3;
        assertEquals(
                value, Validate.isInstanceOf(Integer.class, value, "should be an %s", "Integer"));
        assertEquals(value, Validate.isInstanceOf(Number.class, value, "should be a %s", "Number"));

        try {
            Validate.isInstanceOf(Number.class, "foo", "should be a %s", "Number");
        } catch (IllegalArgumentException e) {
            assertEquals("should be a Number", e.getMessage());
        }
    }

    @Test
    public void testNotBlank() {
        String value = "Foobar";
        assertEquals(value, Validate.notBlank(value, "should not be %s", "blank"));

        try {
            Validate.notBlank(null, "should not be %s", "blank");
        } catch (NullPointerException npe) {
            assertEquals("should not be blank", npe.getMessage());
        }

        try {
            Validate.notBlank("", "should not be %s", "blank");
        } catch (IllegalArgumentException npe) {
            assertEquals("should not be blank", npe.getMessage());
        }

        try {
            Validate.notBlank(" ", "should not be %s", "blank");
        } catch (IllegalArgumentException npe) {
            assertEquals("should not be blank", npe.getMessage());
        }

        try {
            Validate.notBlank("\t", "should not be %s", "blank");
        } catch (IllegalArgumentException npe) {
            assertEquals("should not be blank", npe.getMessage());
        }
    }

    @Test
    public void testIsTrue() {
        Validate.isTrue(true, "should be %s", true);

        try {
            Validate.isTrue(false, "should be %s", true);
        } catch (IllegalArgumentException e) {
            assertEquals("should be true", e.getMessage());
        }
    }

    @Test
    public void testInclusiveBetween() {
        long value = 123;
        assertEquals(
                value,
                Validate.inclusiveBetween(123, 124, value, "must be between %d and %d", 123, 124));
        assertEquals(
                value,
                Validate.inclusiveBetween(123, 123, value, "must be between %d and %d", 123, 123));
        assertEquals(
                value,
                Validate.inclusiveBetween(122, 124, value, "must be between %d and %d", 122, 124));
        assertEquals(
                value,
                Validate.inclusiveBetween(122, 123, value, "must be between %d and %d", 122, 123));

        try {
            Validate.inclusiveBetween(124, 125, value, "must be between %d and %d", 124, 125);
        } catch (IllegalArgumentException e) {
            assertEquals("must be between 124 and 125", e.getMessage());
        }

        try {
            Validate.inclusiveBetween(121, 122, value, "must be between %d and %d", 121, 122);
        } catch (IllegalArgumentException e) {
            assertEquals("must be between 121 and 122", e.getMessage());
        }

        try {
            Validate.inclusiveBetween(122, 121, value, "must be between %d and %d", 121, 122);
        } catch (IllegalArgumentException e) {
            assertEquals("minimum '122' was greater than maximum '121'", e.getMessage());
        }
    }

    @Test
    public void testNoNullElements() {
        String[] value = new String[] {};
        assertArrayEquals(value, Validate.noNullElements(value, "no %s elements", null));
        value = new String[] {"abc", "def", "null", " ", "\t"};
        assertArrayEquals(value, Validate.noNullElements(value, "no %s elements", null));
        Integer[] value2 = new Integer[] {123, 456};
        assertArrayEquals(value2, Validate.noNullElements(value2, "no %s elements", null));

        try {
            Validate.noNullElements(null, "no %s elements", null);
        } catch (NullPointerException e) {
            assertEquals("no null elements", e.getMessage());
        }
        try {
            Validate.noNullElements(new String[] {"abc", null, "def"}, "no %s elements", null);
        } catch (IllegalArgumentException e) {
            assertEquals("no null elements", e.getMessage());
        }
    }

    @Test
    public void testNotEmpty() {
        String[] value = new String[] {"abc", "def", "null", " ", "\t"};
        assertArrayEquals(value, Validate.notEmpty(value, "not %s", "empty"));
        Integer[] value2 = new Integer[] {123, 456};
        assertArrayEquals(value2, Validate.notEmpty(value2, "not %s", "empty"));

        try {
            Validate.noNullElements(null, "not %s", "empty");
        } catch (NullPointerException e) {
            assertEquals("not empty", e.getMessage());
        }
        try {
            Validate.noNullElements(new String[] {}, "not %s", "empty");
        } catch (IllegalArgumentException e) {
            assertEquals("not empty", e.getMessage());
        }
    }
}
