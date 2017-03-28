/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

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
}
