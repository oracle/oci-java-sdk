/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal.guava;

/*
 * Copyright (C) 2009 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import static com.google.common /*Guava will be removed soon*/.escape.Escapers.computeReplacement;

import com.google.common /*Guava will be removed soon*/.escape.UnicodeEscaper;

import junit.framework.Assert;

/**
 * Adapted from the Guava EscaperAsserts. This will be removed once we have migrated away from Guava.
 *
 * Extra assert methods for testing Escaper implementations.
 *
 * @author David Beaumont
 * @since 15.0
 */
public final class EscaperAsserts {
    private EscaperAsserts() {}

    /**
     * Asserts that a Unicode escaper escapes the given code point into the expected string.
     *
     * @param escaper the non-null escaper to test
     * @param expected the expected output string
     * @param cp the Unicode code point to escape
     */
    public static void assertEscaping(UnicodeEscaper escaper, String expected, int cp) {

        String escaped = computeReplacement(escaper, cp);
        Assert.assertNotNull(escaped);
        Assert.assertEquals(expected, escaped);
    }

    /**
     * Asserts that a Unicode escaper does not escape the given character.
     *
     * @param escaper the non-null escaper to test
     * @param cp the Unicode code point to test
     */
    public static void assertUnescaped(UnicodeEscaper escaper, int cp) {
        Assert.assertNull(computeReplacement(escaper, cp));
    }

    /**
     * Asserts that a Unicode escaper escapes the given hi/lo surrogate pair into the expected string.
     *
     * @param escaper the non-null escaper to test
     * @param expected the expected output string
     * @param hi the high surrogate pair character
     * @param lo the low surrogate pair character
     */
    public static void assertUnicodeEscaping(
            UnicodeEscaper escaper, String expected, char hi, char lo) {

        int cp = Character.toCodePoint(hi, lo);
        String escaped = computeReplacement(escaper, cp);
        Assert.assertNotNull(escaped);
        Assert.assertEquals(expected, escaped);
    }
}
