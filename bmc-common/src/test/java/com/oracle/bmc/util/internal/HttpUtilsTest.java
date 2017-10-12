/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.http.internal.WrappedWebTarget;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import javax.ws.rs.client.WebTarget;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
        Map<String, Boolean> definedTagsExists = ImmutableMap.of(keyName1, true, keyName2, false);

        WebTarget target = mock(WebTarget.class);

        when(target.queryParam(anyString(), ArgumentMatchers.any())).thenReturn(target);

        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result = HttpUtils.encodeMapQueryParam(wrapped, prefix, definedTagsExists);

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
        Map<String, List<String>> definedTags =
                ImmutableMap.<String, List<String>>of(
                        keyName1, ImmutableList.of(option1a, option1b),
                        keyName2, ImmutableList.of(option2a, option2b));

        WebTarget target = mock(WebTarget.class);

        when(target.queryParam(anyString(), ArgumentMatchers.any())).thenReturn(target);

        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result = HttpUtils.encodeMapQueryParam(wrapped, prefix, definedTags);

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
        Map<String, Boolean> definedTagsExists = ImmutableMap.of(keyName1, true, keyName2, false);

        WebTarget target = mock(WebTarget.class);

        when(target.queryParam(anyString(), ArgumentMatchers.any())).thenReturn(target);

        WrappedWebTarget wrapped = new WrappedWebTarget(target);
        WrappedWebTarget result = HttpUtils.encodeMapQueryParam(wrapped, prefix, definedTagsExists);

        String prefixEncoded = "";
        String keyName2Encoded = "tagMust%20NotExist";

        verify(target).queryParam(prefixEncoded + keyName1, true);
        verify(target).queryParam(prefixEncoded + keyName2Encoded, false);
    }
}
