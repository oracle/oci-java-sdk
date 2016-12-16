/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.oracle.bmc.http.internal.HttpDateUtils;

public class HttpDateUtilsTest {

    @Test
    public void dateHeader_rfc1123() {
        Date date = HttpDateUtils.parse("Date", "Sun, 06 Nov 1994 08:49:37 GMT");
        assertEquals(784111777000L, date.getTime());
    }

    @Test
    public void dateHeader_rfc1036() {
        // NOTE: interpreted as being between 2000-2100
        Date date = HttpDateUtils.parse("Date", "Sunday, 06-Nov-94 08:49:37 GMT");
        assertEquals(3939871777000L, date.getTime());
    }

    @Test
    public void lastModifiedHeader_ansiC() {
        Date date = HttpDateUtils.parse("Date", "Sun Nov  6 08:49:37 1994");
        assertEquals(784111777000L, date.getTime());
    }

    @Test
    public void otherDateHeader_rfc3339_dateTime_withMillis_utc() {
        Date date = HttpDateUtils.parse("other-date", "1985-04-12T23:20:50.52Z");
        assertEquals(482196050052L, date.getTime());
    }

    @Test
    public void otherDateHeader_rfc3339_dateTime_utc() {
        Date date = HttpDateUtils.parse("other-date", "1985-04-12T23:20:50Z");
        assertEquals(482196050000L, date.getTime());
    }

    @Test
    public void otherDateHeader_rfc3339_dateTime_withOffset() {
        // effectively 1996-12-20T00:39:57Z
        Date date = HttpDateUtils.parse("other-date", "1996-12-19T16:39:57-08:00");
        assertEquals(851042397000L, date.getTime());
    }

    @Test
    public void otherDateHeader_rfc3339_fullDate() {
        Date date = HttpDateUtils.parse("other-date", "1996-12-19");
        assertEquals(850953600000L, date.getTime());
    }
}
