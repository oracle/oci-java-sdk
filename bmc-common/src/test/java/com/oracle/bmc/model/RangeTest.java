/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest {

    @Test
    public void parse_noContentLength() {
        Range range = Range.parse("bytes 5-10/*");
        assertEquals(5L, (long) range.getStartByte());
        assertEquals(10L, (long) range.getEndByte());
        assertNull(range.getContentLength());
    }

    @Test
    public void parse_hasContentLength() {
        Range range = Range.parse("bytes 5-10/25");
        assertEquals(5L, (long) range.getStartByte());
        assertEquals(10L, (long) range.getEndByte());
        assertEquals(25L, (long) range.getContentLength());
    }

    @Test
    public void parse_noStartnoContentLength() {
        Range range = Range.parse("bytes -10/*");
        assertNull(range.getStartByte());
        assertEquals(10L, (long) range.getEndByte());
        assertNull(range.getContentLength());
    }

    @Test
    public void parse_noStartHasContentLength() {
        Range range = Range.parse("bytes -10/25");
        assertNull(range.getStartByte());
        assertEquals(10L, (long) range.getEndByte());
        assertEquals(25L, (long) range.getContentLength());
    }

    @Test
    public void parse_noEndContentLength() {
        Range range = Range.parse("bytes 5-/*");
        assertEquals(5L, (long) range.getStartByte());
        assertNull(range.getEndByte());
        assertNull(range.getContentLength());
    }

    @Test
    public void parse_noEndHasContentLength() {
        Range range = Range.parse("bytes 5-/25");
        assertEquals(5L, (long) range.getStartByte());
        assertNull(range.getEndByte());
        assertEquals(25L, (long) range.getContentLength());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_noStartNoEndHasContentLength() {
        Range.parse("bytes -/25");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_noSlash() {
        Range.parse("bytes 1-10");
    }
}
