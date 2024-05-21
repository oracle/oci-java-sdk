/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.http.internal.WrappedWebTarget;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import javax.ws.rs.client.WebTarget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class HttpUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void encodePathSegment_emptyPathSegment() {
        HttpUtils.encodePathSegment("");
    }

    @Test
    public void encodePathSegment_string_nothingToChange() {
        assertEquals("foobar", HttpUtils.encodePathSegment("foobar"));
    }

    @Test
    public void encodePathSegment_string() {
        assertEquals(
                "%251%253D%253F%2540%255B%255D%2541%20aaaa",
                HttpUtils.encodePathSegment("%1%3D%3F%40%5B%5D%41 aaaa"));
    }

    @Test
    public void encodePathSegment_numbers() {
        assertEquals("50", HttpUtils.encodePathSegment(50));
        assertEquals("112233445566", HttpUtils.encodePathSegment(112233445566L));
        assertEquals("50.5", HttpUtils.encodePathSegment(50.5D));
        assertEquals("100.5", HttpUtils.encodePathSegment(100.5F));
        assertEquals("20", HttpUtils.encodePathSegment((short) 20));
    }

    @Test
    public void encodePathSegment_uuid() {
        UUID uuid = UUID.randomUUID();
        assertEquals(uuid.toString(), HttpUtils.encodePathSegment(uuid));
    }

    @Test
    public void encodePathSegment_character() {
        assertEquals("d", HttpUtils.encodePathSegment('d'));
    }

    @Test
    public void encodePathSegment_boolean() {
        assertEquals("true", HttpUtils.encodePathSegment(true));
    }

    @Test
    public void attemptEncodeQueryParam_notString() {
        Object o = new Object();
        assertSame(o, HttpUtils.attemptEncodeQueryParam(o));
    }

    @Test
    public void attemptEncodeQueryParam_string() {
        assertEquals(
                "%251%253D%253F%2540%255B%255D%2541%20aaaa",
                HttpUtils.attemptEncodeQueryParam("%1%3D%3F%40%5B%5D%41 aaaa"));
    }

    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    @Test
    public void encodeMapQueryParam_mapOfStringToBoolean() {
        String prefix = "definedTags Exists.";
        String keyName1 = "tagMustExist";
        String keyName2 = "tagMust NotExist";
        Map<String, Boolean> temp = new HashMap<>();
        temp.put(keyName1, true);
        temp.put(keyName2, false);
        Map<String, Boolean> definedTagsExists = Collections.unmodifiableMap(temp);

        WebTarget target = mock(WebTarget.class);

        when(target.queryParam(anyString(), any())).thenReturn(target);

        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result = HttpUtils.encodeMapQueryParam(wrapped, prefix, definedTagsExists);
        assertNotNull(result);

        String prefixEncoded = "definedTags%20Exists.";
        String keyName2Encoded = "tagMust%20NotExist";

        verify(target).queryParam(prefixEncoded + keyName1, true);
        verify(target).queryParam(prefixEncoded + keyName2Encoded, false);
    }

    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    @Test
    public void attemptEncodeQueryParam_mapOfStringToListOfString()
            throws IllegalAccessException, NoSuchFieldException {
        String prefix = "defined Tags.";
        String keyName1 = "tag1";
        String option1a = "option1a";
        String option1b = "option1 b";
        String keyName2 = "tag 2";
        String option2a = "option2a";
        String option2b = "option2 b";
        Map<String, List<String>> temp = new HashMap<>();
        temp.put(keyName1, Collections.unmodifiableList(Arrays.asList(option1a, option1b)));
        temp.put(keyName2, Collections.unmodifiableList(Arrays.asList(option2a, option2b)));
        Map<String, List<String>> definedTags = Collections.unmodifiableMap(temp);

        WebTarget target = mock(WebTarget.class);

        when(target.queryParam(anyString(), any())).thenReturn(target);

        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result = HttpUtils.encodeMapQueryParam(wrapped, prefix, definedTags);
        assertNotNull(result);

        String prefixEncoded = "defined%20Tags.";
        String keyName2Encoded = "tag%202";
        String option1bEncoded = "option1%20b";
        String option2bEncoded = "option2%20b";

        verify(target).queryParam(prefixEncoded + keyName1, option1a);
        verify(target).queryParam(prefixEncoded + keyName1, option1bEncoded);
        verify(target).queryParam(prefixEncoded + keyName2Encoded, option2a);
        verify(target).queryParam(prefixEncoded + keyName2Encoded, option2bEncoded);
    }

    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    @Test
    public void attemptEncodeQueryParam_null() {
        WebTarget target = mock(WebTarget.class);
        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result = HttpUtils.encodeMapQueryParam(wrapped, "prefix", null);
        assertTrue(result == wrapped);

        Mockito.verifyNoMoreInteractions(target);
    }

    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    @Test
    public void encodeMapQueryParam_mapOfStringToBoolean_nullPrefix() {
        String prefix = null;
        String keyName1 = "tagMustExist";
        String keyName2 = "tagMust NotExist";

        Map<String, Boolean> temp = new HashMap<>();
        temp.put(keyName1, true);
        temp.put(keyName2, false);
        Map<String, Boolean> definedTagsExists = Collections.unmodifiableMap(temp);

        WebTarget target = mock(WebTarget.class);

        when(target.queryParam(anyString(), any())).thenReturn(target);

        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result = HttpUtils.encodeMapQueryParam(wrapped, prefix, definedTagsExists);
        assertNotNull(result);

        String prefixEncoded = "";
        String keyName2Encoded = "tagMust%20NotExist";

        verify(target).queryParam(prefixEncoded + keyName1, true);
        verify(target).queryParam(prefixEncoded + keyName2Encoded, false);
    }

    @Test
    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    public void encodeCollectionFormatQueryParam_null() {
        WebTarget target = mock(WebTarget.class);
        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result =
                HttpUtils.encodeCollectionFormatQueryParam(
                        wrapped, "unitTest", null, CollectionFormatType.Multi);
        assertTrue(result == wrapped);

        Mockito.verifyNoMoreInteractions(target);
    }

    @Test
    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    public void encodeCollectionFormatQueryParam_emptyList() {
        WebTarget target = mock(WebTarget.class);
        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result =
                HttpUtils.encodeCollectionFormatQueryParam(
                        wrapped, "unitTest", new ArrayList<String>(), CollectionFormatType.Multi);
        assertTrue(result == wrapped);

        Mockito.verifyNoMoreInteractions(target);
    }

    @Test
    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    public void encodeCollectionFormatQueryParam_listOfNulls() {
        final List<String> values = new ArrayList<>();
        values.add(null);
        values.add(null);

        WebTarget target = mock(WebTarget.class);
        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result =
                HttpUtils.encodeCollectionFormatQueryParam(
                        wrapped, "unitTest", values, CollectionFormatType.Multi);
        assertTrue(result == wrapped);

        Mockito.verifyNoMoreInteractions(target);
    }

    @Test
    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    public void encodeCollectionFormatQueryParam_singleElementList() {
        final List<String> values = new ArrayList<>();
        values.add("single");

        for (CollectionFormatType cft : CollectionFormatType.values()) {
            WebTarget target = mock(WebTarget.class);
            WrappedWebTarget wrapped = new WrappedWebTarget(target);
            WrappedWebTarget result =
                    HttpUtils.encodeCollectionFormatQueryParam(wrapped, "unitTest", values, cft);
            assertNotNull(result);

            verify(target).queryParam("unitTest", "single");
        }
    }

    @Test
    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    public void encodeCollectionFormatQueryParam_multipleElementList() {
        final List<String> values = new ArrayList<>();
        values.add("number1");
        values.add("number2");

        for (CollectionFormatType cft : CollectionFormatType.values()) {
            WebTarget target = mock(WebTarget.class);
            WrappedWebTarget wrapped = new WrappedWebTarget(target);
            WrappedWebTarget result =
                    HttpUtils.encodeCollectionFormatQueryParam(wrapped, "unitTest", values, cft);
            assertNotNull(result);

            if (cft == CollectionFormatType.CommaSeparated) {
                verify(target).queryParam("unitTest", "number1,number2");
            } else if (cft == CollectionFormatType.PipeSeparated) {
                verify(target).queryParam("unitTest", "number1%7Cnumber2");
            } else if (cft == CollectionFormatType.SpaceSeparated) {
                verify(target).queryParam("unitTest", "number1%20number2");
            } else if (cft == CollectionFormatType.TabSeparated) {
                verify(target).queryParam("unitTest", "number1%09number2");
            } else if (cft == CollectionFormatType.Multi) {
                verify(target).queryParam("unitTest", "number1", "number2");
            } else {
                fail("Unrecognized CollectionFormatType: " + cft.toString());
            }
        }
    }

    @Test
    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    public void encodeCollectionFormatQueryParam_enumListMembers() {
        final List<LifecycleState> values = new ArrayList<>();
        values.add(LifecycleState.Provisioning);
        values.add(LifecycleState.Stopping);

        for (CollectionFormatType cft : CollectionFormatType.values()) {
            WebTarget target = mock(WebTarget.class);
            WrappedWebTarget wrapped = new WrappedWebTarget(target);
            WrappedWebTarget result =
                    HttpUtils.encodeCollectionFormatQueryParam(wrapped, "unitTest", values, cft);
            assertNotNull(result);

            if (cft == CollectionFormatType.CommaSeparated) {
                verify(target).queryParam("unitTest", "PROVISIONING,STOPPING");
            } else if (cft == CollectionFormatType.PipeSeparated) {
                verify(target).queryParam("unitTest", "PROVISIONING%7CSTOPPING");
            } else if (cft == CollectionFormatType.SpaceSeparated) {
                verify(target).queryParam("unitTest", "PROVISIONING%20STOPPING");
            } else if (cft == CollectionFormatType.TabSeparated) {
                verify(target).queryParam("unitTest", "PROVISIONING%09STOPPING");
            } else if (cft == CollectionFormatType.Multi) {
                verify(target).queryParam("unitTest", "PROVISIONING", "STOPPING");
            } else {
                fail("Unrecognized CollectionFormatType: " + cft.toString());
            }
        }
    }

    @Test
    @Ignore("DEX-1801: Fix Mockito Problem in Release TeamCity Job")
    public void encodeCollectionFormatQueryParam_nullMembersIgnored() {
        final List<LifecycleState> values = new ArrayList<>();
        values.add(LifecycleState.Running);
        values.add(null);

        for (CollectionFormatType cft : CollectionFormatType.values()) {
            WebTarget target = mock(WebTarget.class);
            WrappedWebTarget wrapped = new WrappedWebTarget(target);
            WrappedWebTarget result =
                    HttpUtils.encodeCollectionFormatQueryParam(wrapped, "unitTest", values, cft);
            assertNotNull(result);

            if (cft == CollectionFormatType.CommaSeparated) {
                verify(target).queryParam("unitTest", "RUNNING");
            } else if (cft == CollectionFormatType.PipeSeparated) {
                verify(target).queryParam("unitTest", "RUNNING");
            } else if (cft == CollectionFormatType.SpaceSeparated) {
                verify(target).queryParam("unitTest", "RUNNING");
            } else if (cft == CollectionFormatType.TabSeparated) {
                verify(target).queryParam("unitTest", "RUNNING");
            } else if (cft == CollectionFormatType.Multi) {
                verify(target).queryParam("unitTest", "RUNNING");
            } else {
                fail("Unrecognized CollectionFormatType: " + cft.toString());
            }
        }
    }

    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Running("RUNNING"),
        Starting("STARTING"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),
        CreatingImage("CREATING_IMAGE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * These tests are adapted from the Guava UrlEscapersTest.
     * @link https://github.com/google/guava/blob/0de7000ff521d14a1387196753118eedb3465d2d/guava-tests/test/com/google/common/net/UrlEscapersTest.java#L111
     */
    @Test
    public void testUrlPathSegmentEscape() {
        // from assertBasicUrlEscaperExceptPercent()
        // All URL escapers should leave 0-9, A-Z, a-z unescaped
        assertUnescaped('a');
        assertUnescaped('z');
        assertUnescaped('A');
        assertUnescaped('Z');
        assertUnescaped('0');
        assertUnescaped('9');

        // Unreserved characters used in java.net.URLEncoder
        assertUnescaped('-');
        assertUnescaped('_');
        assertUnescaped('.');
        assertUnescaped('*');

        assertEscaping("%00", '\u0000'); // nul
        assertEscaping("%7F", '\u007f'); // del
        assertEscaping("%C2%80", '\u0080'); // xx-00010,x-000000
        assertEscaping("%DF%BF", '\u07ff'); // xx-11111,x-111111
        assertEscaping("%E0%A0%80", '\u0800'); // xxx-0000,x-100000,x-00,0000
        assertEscaping("%EF%BF%BF", '\uffff'); // xxx-1111,x-111111,x-11,1111
        assertUnicodeEscaping("%F0%90%80%80", '\uD800', '\uDC00');
        assertUnicodeEscaping("%F4%8F%BF%BF", '\uDBFF', '\uDFFF');

        assertEquals("", HttpUtils.urlPathSegmentEscape(""));
        assertEquals("safestring", HttpUtils.urlPathSegmentEscape("safestring"));
        assertEquals("embedded%00null", HttpUtils.urlPathSegmentEscape("embedded\0null"));
        assertEquals("max%EF%BF%BFchar", HttpUtils.urlPathSegmentEscape("max\uffffchar"));

        // from assertBasicUrlEscaper()
        // The escape character must always be escaped
        assertEscaping("%25", '%');

        // from assertPathEscaper()
        assertUnescaped('!');
        assertUnescaped('\'');
        assertUnescaped('(');
        assertUnescaped(')');
        assertUnescaped('~');
        assertUnescaped(':');
        assertUnescaped('@');

        // Don't use plus for spaces
        assertEscaping("%20", ' ');

        assertEquals("safe%20with%20spaces", HttpUtils.urlPathSegmentEscape(("safe with spaces")));
        assertEquals("foo@bar.com", HttpUtils.urlPathSegmentEscape(("foo@bar.com")));

        // from testHttpUtilsEscaper()
        assertUnescaped('+');
    }

    private void assertEscaping(String expected, char unescaped) {
        assertEquals(expected, HttpUtils.urlPathSegmentEscape(String.valueOf(unescaped)));
    }

    private static void assertUnescaped(char ch) {
        assertEquals(String.valueOf(ch), HttpUtils.urlPathSegmentEscape(String.valueOf(ch)));
    }

    private void assertUnicodeEscaping(String expected, char hi, char lo) {
        int cp = Character.toCodePoint(hi, lo);
        String escaped = HttpUtils.urlPathSegmentEscape(codepointToString(cp));
        assertNotNull(escaped);
        assertEquals(expected, escaped);
    }

    private static String codepointToString(int cp) {
        StringBuilder sb = new StringBuilder();
        if (Character.isBmpCodePoint(cp)) {
            sb.append((char) cp);
        } else if (Character.isValidCodePoint(cp)) {
            sb.append(Character.highSurrogate(cp));
            sb.append(Character.lowSurrogate(cp));
        } else {
            sb.append('?');
        }
        return sb.toString();
    }
}
