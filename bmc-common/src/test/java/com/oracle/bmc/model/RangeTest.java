/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
}
