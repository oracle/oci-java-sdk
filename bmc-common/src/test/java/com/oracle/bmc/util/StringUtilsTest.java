/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.oracle.bmc.util.internal.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {
    @Test
    public void testReplace() {
        String template = "To {verb} or not to {verb}, that is the {noun}. {thisOneStays}";

        Map<String, String> replacements = new HashMap<>();
        replacements.put("verb", "be");
        replacements.put("noun", "question");
        replacements.put("notFound", "!!!");
        assertEquals(
                "To be or not to be, that is the question. {thisOneStays}",
                StringUtils.replace(template, replacements, "{", "}"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertTrue(StringUtils.isBlank("\t"));
        assertFalse(StringUtils.isBlank("a"));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank(" "));
        assertFalse(StringUtils.isNotBlank("\t"));
        assertTrue(StringUtils.isNotBlank("a"));
    }

    @Test
    public void testJoin() {
        assertNull(StringUtils.join(null, ","));
        assertTrue(StringUtils.join(new ArrayList<>(), ",").isEmpty());
        assertTrue(StringUtils.join(Arrays.asList(new String[] {null}), ",").isEmpty());
        assertEquals("a,,1", StringUtils.join(Arrays.asList(new Object[] {"a", null, 1}), ","));
    }

    @Test
    public void testRandomPrintMinMax() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int min = r.nextInt(5) + 1;
            int max = min + r.nextInt(5) + 1;
            String s = StringUtils.randomPrint(min, max);
            assertFalse(s, s.isEmpty());
            assertTrue(String.format("'%s', min=%d", s, min), s.length() >= min);
            assertTrue(String.format("'%s', max=%d", s, max), s.length() < max);
            for (int index = 0; index < s.length(); ++index) {
                char ch = s.charAt(index);
                assertTrue(String.format("'%s', index=%d", s, index), ch >= 32);
                assertTrue(String.format("'%s', index=%d", s, index), ch <= 125);
            }
        }
        String s = StringUtils.randomPrint(0, 0);
        assertTrue(s, s.isEmpty());
        s = StringUtils.randomPrint(3, 2);
        assertEquals(s, 3, s.length());
        s = StringUtils.randomPrint(3, 3);
        assertEquals(s, 3, s.length());
    }

    @Test
    public void testRandomPrint() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int l = r.nextInt(5) + 1;
            String s = StringUtils.randomPrint(l);
            assertFalse(s, s.isEmpty());
            assertEquals(String.format("'%s', l=%d", s, l), l, s.length());
            for (int index = 0; index < s.length(); ++index) {
                char ch = s.charAt(index);
                assertTrue(String.format("'%s', index=%d", s, index), ch >= 32);
                assertTrue(String.format("'%s', index=%d", s, index), ch <= 125);
            }
        }
        String s = StringUtils.randomPrint(0);
        assertTrue(s, s.isEmpty());
    }

    @Test
    public void testRandomAlphabeticMinMax() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int min = r.nextInt(5) + 1;
            int max = min + r.nextInt(5) + 1;
            String s = StringUtils.randomAlphabetic(min, max);
            assertFalse(s, s.isEmpty());
            assertTrue(String.format("'%s', min=%d", s, min), s.length() >= min);
            assertTrue(String.format("'%s', max=%d", s, max), s.length() < max);
            for (int index = 0; index < s.length(); ++index) {
                char ch = s.charAt(index);
                assertTrue(
                        String.format("'%s', index=%d", s, index),
                        (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
            }
        }
        String s = StringUtils.randomAlphabetic(0, 0);
        assertTrue(s, s.isEmpty());
        s = StringUtils.randomAlphabetic(3, 2);
        assertEquals(s, 3, s.length());
        s = StringUtils.randomAlphabetic(3, 3);
        assertEquals(s, 3, s.length());
    }

    @Test
    public void testRandomAlphabetic() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int l = r.nextInt(5) + 1;
            String s = StringUtils.randomAlphabetic(l);
            assertFalse(s, s.isEmpty());
            assertEquals(String.format("'%s', l=%d", s, l), l, s.length());
            for (int index = 0; index < s.length(); ++index) {
                char ch = s.charAt(index);
                assertTrue(
                        String.format("'%s', index=%d", s, index),
                        (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
            }
        }
        String s = StringUtils.randomAlphabetic(0);
        assertTrue(s, s.isEmpty());
    }

    @Test
    public void testRandom() {
        Random r = new Random();

        String allowed = "abcd";

        for (int i = 0; i < 100; i++) {
            int l = r.nextInt(5) + 1;
            String s = StringUtils.random(l, allowed);
            assertFalse(s, s.isEmpty());
            assertEquals(String.format("'%s', l=%d", s, l), l, s.length());
            for (int index = 0; index < s.length(); ++index) {
                String ch = s.substring(index, index + 1);
                assertTrue(String.format("'%s', index=%d", s, index), allowed.contains(ch));
            }
        }
        String s = StringUtils.randomAlphabetic(0);
        assertTrue(s, s.isEmpty());
    }

    @Test
    public void testIsAnyBlank() {
        assertTrue(StringUtils.isAnyBlank((String) null));
        assertFalse(StringUtils.isAnyBlank((String[]) null));
        assertTrue(StringUtils.isAnyBlank(null, "foo"));
        assertTrue(StringUtils.isAnyBlank(null, null));
        assertTrue(StringUtils.isAnyBlank("", "bar"));
        assertTrue(StringUtils.isAnyBlank("bob", ""));
        assertTrue(StringUtils.isAnyBlank("  bob  ", null));
        assertTrue(StringUtils.isAnyBlank(" ", "bar"));
        assertFalse(StringUtils.isAnyBlank(new String[] {}));
        assertTrue(StringUtils.isAnyBlank(new String[] {""}));
        assertFalse(StringUtils.isAnyBlank("foo", "bar"));
    }

    @Test
    public void testIsNoneBlank() {
        assertFalse(StringUtils.isNoneBlank((String) null));
        assertTrue(StringUtils.isNoneBlank((String[]) null));
        assertFalse(StringUtils.isNoneBlank(null, "foo"));
        assertFalse(StringUtils.isNoneBlank(null, null));
        assertFalse(StringUtils.isNoneBlank("", "bar"));
        assertFalse(StringUtils.isNoneBlank("bob", ""));
        assertFalse(StringUtils.isNoneBlank("  bob  ", null));
        assertFalse(StringUtils.isNoneBlank(" ", "bar"));
        assertTrue(StringUtils.isNoneBlank(new String[] {}));
        assertFalse(StringUtils.isNoneBlank(new String[] {""}));
        assertTrue(StringUtils.isNoneBlank("foo", "bar"));
    }

    @Test
    public void testIsAllBlank() {
        assertTrue(StringUtils.isAllBlank(null));
        assertFalse(StringUtils.isAllBlank(null, "foo"));
        assertTrue(StringUtils.isAllBlank(null, null));
        assertFalse(StringUtils.isAllBlank("", "bar"));
        assertFalse(StringUtils.isAllBlank("bob", ""));
        assertFalse(StringUtils.isAllBlank("  bob  ", null));
        assertFalse(StringUtils.isAllBlank(" ", "bar"));
        assertFalse(StringUtils.isAllBlank("foo", "bar"));
        assertTrue(StringUtils.isAllBlank(new String[] {}));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("\t"));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("\t"));
        assertTrue(StringUtils.isNotEmpty("abc"));
    }

    @Test
    public void testUpperCase() {
        assertNull(StringUtils.upperCase(null));
        assertEquals("", StringUtils.upperCase(""));
        assertEquals("ABCABC123", StringUtils.upperCase("ABCabc123"));
    }

    @Test
    public void testLeft() {
        assertNull(StringUtils.left(null, 0));
        assertNull(StringUtils.left(null, -1));
        assertNull(StringUtils.left(null, 1));
        assertEquals("", StringUtils.left("abc", -1));
        assertEquals("", StringUtils.left("abc", 0));
        assertEquals("a", StringUtils.left("abc", 1));
        assertEquals("abc", StringUtils.left("abc", 3));
        assertEquals("abc", StringUtils.left("abc", 4));
    }

    @Test
    public void testLength() {
        assertEquals(0, StringUtils.length(null));
        assertEquals(0, StringUtils.length(""));
        assertEquals(1, StringUtils.length("1"));
        assertEquals(3, StringUtils.length("123"));
    }

    @Test
    public void testContainsIgnoreCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, null));
        assertFalse(StringUtils.containsIgnoreCase("abcde", null));
        assertFalse(StringUtils.containsIgnoreCase(null, "cd"));
        assertTrue(StringUtils.containsIgnoreCase("", ""));
        assertTrue(StringUtils.containsIgnoreCase("abcde", ""));
        assertFalse(StringUtils.containsIgnoreCase("abcde", "xy"));
        assertTrue(StringUtils.containsIgnoreCase("abcde", "cd"));
        assertTrue(StringUtils.containsIgnoreCase("abcde", "CD"));
        assertTrue(StringUtils.containsIgnoreCase("abcDe", "Cd"));
    }

    @Test
    public void testContains() {
        assertFalse(StringUtils.contains(null, null));
        assertFalse(StringUtils.contains("abcde", null));
        assertFalse(StringUtils.contains(null, "cd"));
        assertTrue(StringUtils.contains("", ""));
        assertTrue(StringUtils.contains("abcde", ""));
        assertFalse(StringUtils.contains("abcde", "xy"));
        assertTrue(StringUtils.contains("abcde", "cd"));
        assertFalse(StringUtils.contains("abcde", "CD"));
        assertFalse(StringUtils.contains("abcDe", "Cd"));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
        assertFalse(StringUtils.equalsIgnoreCase(null, "x"));
        assertFalse(StringUtils.equalsIgnoreCase("x", null));
        assertTrue(StringUtils.equalsIgnoreCase("x", "x"));
        assertTrue(StringUtils.equalsIgnoreCase("x", "X"));
        assertTrue(StringUtils.equalsIgnoreCase("X", "x"));
    }

    @Test
    public void testRepeat() {
        assertEquals("", StringUtils.repeat("", 0));
        assertEquals("", StringUtils.repeat("", 1));
        assertEquals("", StringUtils.repeat("", 10));
        assertEquals("", StringUtils.repeat("abc", 0));
        assertEquals("abc", StringUtils.repeat("abc", 1));
        assertEquals("abcabcabc", StringUtils.repeat("abc", 3));
    }
}
