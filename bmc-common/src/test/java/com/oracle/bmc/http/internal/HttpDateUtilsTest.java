/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

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
        Date date = HttpDateUtils.parse("other-date", "1985-04-12T23:20:50.052Z");
        assertEquals(482196050052L, date.getTime());
    }

    @Test
    public void otherDateHeader_rfc3339_dateTime_withNanos() {
        Date date = HttpDateUtils.parse("other-date", "1996-12-19T16:39:57.0527396-08:00");
        assertEquals(851042397052L, date.getTime());
    }

    @Test
    public void otherDateHeader_rfc3339_dateTime_withNanos_utc() {
        Date date = HttpDateUtils.parse("other-date", "1985-04-12T23:20:50.0527396Z");
        assertEquals(482196050052L, date.getTime());
    }

    @Test
    public void otherDateHeader_rfc3339_dateTime_utc() {
        Date date = HttpDateUtils.parse("other-date", "1985-04-12T23:20:50Z");
        assertEquals(482196050000L, date.getTime());

        date = HttpDateUtils.parse("other-date", "1937-01-01T12:00:27.873834939+00:20");
        assertEquals(-1041337172127L, date.getTime());

        date = HttpDateUtils.parse("other-date", "1937-01-01T12:00:27.873834939Z");
        assertEquals(-1041335972127L, date.getTime());

        date = HttpDateUtils.parse("other-date", "2021-04-29T10:00:00Z");
        assertEquals(1619690400000L, date.getTime());

        date = HttpDateUtils.parse("other-date", "2021-05-13T10:58:09.628313-07:00");
        assertEquals(1620928689628L, date.getTime());
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

    @Test
    public void format_rfc3339_zeroMillis() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(1985, 3, 12, 23, 20, 50);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        assertEquals("1985-04-12T23:20:50Z", HttpDateUtils.format(date));
    }

    @Test
    public void format_rfc3339_nonZeroMillis() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(1985, 3, 12, 23, 20, 50);
        cal.set(Calendar.MILLISECOND, 52);
        Date date = cal.getTime();
        assertEquals("1985-04-12T23:20:50.052Z", HttpDateUtils.format(date));
    }
}
