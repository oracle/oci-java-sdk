/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.pki;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Unit tests for {@link Utf8} */
public class Utf8Test {

    @Test
    public void testTrim() {
        final String input = " Hello World\n";
        final Utf8 utf8 = Utf8.of(Text.bytes(input));
        assertEquals("Hello World", Text.of(utf8.trim()));
    }

    @Test
    public void testContains() {
        final String input = " Hello World\n";
        final Utf8 utf8 = Utf8.of(Text.bytes(input));
        final boolean actual = utf8.contains("Hello");
        assertTrue(actual);
    }

    @Test
    public void testIndexOfNotFound() {
        final String input = " Hello World\n";
        final Utf8 utf8 = Utf8.of(Text.bytes(input));
        final int actual = utf8.indexOf("Hallo");
        assertEquals(-1, actual);
    }

    @Test
    public void testRemoveWhitespace() {
        final String input = " Hello World\nAgain\n";
        final Utf8 utf8 = Utf8.of(Text.bytes(input));
        final Utf8 actual = utf8.removeWhitespace();
        assertEquals("HelloWorldAgain", Text.of(actual));
    }

    @Test
    public void testWithChannel() throws IOException {
        ReadableByteChannel channel =
                Channels.newChannel(new ByteArrayInputStream("Hello world!".getBytes()));
        Utf8 utf8 = Utf8.of(channel);
        assertEquals("Hello world!", Text.of(utf8));
    }
}
