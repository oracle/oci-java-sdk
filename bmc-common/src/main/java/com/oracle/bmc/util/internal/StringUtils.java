/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * String manipulation utilities.
 */
public enum StringUtils {
    ; // prevent instantiation

    private static final Random RANDOM = new Random();

    /**
     * Return true if this string is either null or just whitespace.
     * @param s the string
     * @return true if this string is either null or just whitespace.
     */
    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    /**
     * Return true if this string is not null and not just whitespace.
     * @param s the string
     * @return true if this string is not null and not just whitespace.
     */
    public static boolean isNotBlank(String s) {
        return !isBlank(s);
    }

    /**
     * Join the collection of objects to a string.
     *
     * Objects that are null are represented by the empty string.
     *
     * @param objects collection of objects
     * @param delimiter delimiter between the objects
     * @return joined string
     */
    public static String join(Collection<?> objects, String delimiter) {
        if (objects == null) {
            return null;
        }
        return objects.stream()
                .map(o -> o == null ? "" : o.toString())
                .collect(Collectors.joining(delimiter));
    }

    /**
     * Replace the placeholders in the template with the values in the replacement mapping.
     * @param template template string
     * @param replacements map from key to replacement value
     * @param prefix prefix of the placeholder
     * @param suffix suffix of the placeholder
     * @return replaced string
     */
    public static String replace(
            String template, Map<String, String> replacements, String prefix, String suffix) {
        String result = template;
        for (Map.Entry<String, String> e : replacements.entrySet()) {
            result =
                    result.replaceAll(
                            Pattern.quote(prefix)
                                    + Pattern.quote(e.getKey())
                                    + Pattern.quote(suffix),
                            e.getValue());
        }
        return result;
    }

    /**
     * Returns a string of random printable characters at least minLengthInclusive characters and less than
     * maxLengthExclusive characters long.
     *
     * The characters have ASCII codes ranging from 32 to 125 (both inclusive) and include spaces.
     *
     * @param minLengthInclusive minimum length (inclusive)
     * @param maxLengthExclusive maximum length (exclusive)
     * @return the random string
     */
    public static String randomPrint(int minLengthInclusive, int maxLengthExclusive) {
        int randomLength = 0;
        if (maxLengthExclusive - minLengthInclusive > 0) {
            randomLength = RANDOM.nextInt(maxLengthExclusive - minLengthInclusive);
        }
        return randomPrint(randomLength + minLengthInclusive);
    }

    /**
     * Returns a string of random printable characters of the requested length.
     *
     * The characters have ASCII codes ranging from 32 to 125 (both inclusive) and include spaces.
     *
     * @param length length in characters
     * @return the random string
     */
    public static String randomPrint(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            char ch = (char) (RANDOM.nextInt(126 - 32) + 32);
            sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * Returns a string of random alphabetic characters at least minLengthInclusive characters and less than
     * maxLengthExclusive characters long.
     *
     * The characters range from 'A' - 'Z' or from 'a' - 'z' (all inclusive).
     *
     * @param minLengthInclusive minimum length (inclusive)
     * @param maxLengthExclusive maximum length (exclusive)
     * @return the random string
     */
    public static String randomAlphabetic(int minLengthInclusive, int maxLengthExclusive) {
        int randomLength = 0;
        if (maxLengthExclusive - minLengthInclusive > 0) {
            randomLength = RANDOM.nextInt(maxLengthExclusive - minLengthInclusive);
        }
        return randomAlphabetic(randomLength + minLengthInclusive);
    }

    /**
     * Returns a string of random alphabetic characters of the requested length.
     *
     * The characters range from 'A' - 'Z' or from 'a' - 'z' (all inclusive).
     *
     * @param length length in characters
     * @return the random string
     */
    public static String randomAlphabetic(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            int ch = RANDOM.nextInt(52); // there are 52 alphabetic characters
            if (ch < 26) {
                sb.append((char) (ch + 'A'));
            } else {
                sb.append((char) (ch + 'a' - 26));
            }
        }
        return sb.toString();
    }

    /**
     * Returns a string of the requested length, made up of characters from the allowed string.
     *
     * @param length length in characters
     * @param allowed string with allowed characters
     * @return the random string
     */
    public static String random(int length, String allowed) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            int index = RANDOM.nextInt(allowed.length());
            sb.append(allowed.charAt(index));
        }
        return sb.toString();
    }

    /**
     * Returns true if any of the strings passed in are blank, as determined by isBlank.
     * @param strings strings to check
     * @return true if any of the strings are blank
     */
    public static boolean isAnyBlank(String... strings) {
        if (strings == null) {
            return false;
        }
        if (strings.length == 0) {
            return false;
        }
        for (String s : strings) {
            if (isBlank(s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if none of the strings passed in are blank, as determined by isBlank.
     * @param strings strings to check
     * @return true if none of the strings are blank
     */
    public static boolean isNoneBlank(String... strings) {
        return !isAnyBlank(strings);
    }

    /**
     * Returns true if all of the strings passed in are blank, as determined by isBlank.
     * @param strings strings to check
     * @return true if all of the strings are blank
     */
    public static boolean isAllBlank(String... strings) {
        if (strings == null) {
            return true;
        }
        for (String s : strings) {
            if (!isBlank(s)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns true if the string is not empty.
     * @param s string to check
     * @return true if not empty
     */
    public static boolean isNotEmpty(String s) {
        return s != null && !s.isEmpty();
    }

    /**
     * Returns true if the string is empty.
     * @param s string to check
     * @return true if empty
     */
    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    /**
     * Returns the string in uppercase, or null if it was null
     * @param s string to convert to uppercase
     * @return string in uppercase, or null if it was null
     */
    public static String upperCase(String s) {
        if (s == null) {
            return null;
        }
        return s.toUpperCase();
    }

    /**
     * Return the first length characters of the string.
     * @param s string
     * @param length number of characters
     * @return first s
     */
    public static String left(String s, int length) {
        if (s == null) {
            return null;
        }
        if (length < 0) {
            return "";
        }

        return s.substring(0, Math.min(s.length(), length));
    }

    /**
     * Return the length of the string, or 0 if the string is null.
     * @param s string
     * @return length of string or 0 if string is null
     */
    public static int length(String s) {
        if (s == null) {
            return 0;
        }
        return s.length();
    }

    /**
     * Return true if the string contains the search string, ignoring case, or false if either is null.
     * @param s string
     * @param searchStr substring to search for
     * @return true if the string contains the search string, or false if either is null
     */
    public static boolean containsIgnoreCase(String s, String searchStr) {
        if (s == null || searchStr == null) {
            return false;
        }
        return s.toLowerCase().contains(searchStr.toLowerCase());
    }

    /**
     * Null-safe case-insensitive equals.
     * @param s1 first string
     * @param s2 second string
     * @return true if equals, ignoring case
     */
    public static boolean equalsIgnoreCase(String s1, String s2) {
        if (s1 == null) {
            return (s2 == null);
        } else if (s2 == null) {
            // we know s1 is NOT null, so they can't be equal
            return false;
        }
        return s1.equalsIgnoreCase(s2);
    }

    /**
     * Return true if the string contains the search string, or false if either is null.
     * @param s string
     * @param searchStr substring to search for
     * @return true if the string contains the search string, or false if either is null
     */
    public static boolean contains(String s, String searchStr) {
        if (s == null || searchStr == null) {
            return false;
        }
        return s.contains(searchStr);
    }

    /**
     * Repeat the substring count times.
     * @param substring substring
     * @param count number of times to occur
     * @return repeated substring
     */
    public static String repeat(String substring, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            sb.append(substring);
        }
        return sb.toString();
    }
}
