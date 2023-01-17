/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Random;

import org.junit.Test;

import com.oracle.bmc.util.StreamUtils;

public class StreamUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void fileToInputStream_invalidFile() {
        StreamUtils.toInputStream(new File("/asdfjkl"));
    }

    @Test
    public void fileToInputStream() throws IOException {
        File file = File.createTempFile("StreamUtilsTest", null);
        file.deleteOnExit();

        try (InputStream stream = StreamUtils.toInputStream(file)) {
            assertNotNull(stream);
        }

        file.delete();
    }

    @Test
    public void testContentDiffers_Empty_Empty() throws IOException {
        InputStream is1 = new ByteArrayInputStream(new byte[0]);
        InputStream is2 = new ByteArrayInputStream(new byte[0]);
        assertFalse(StreamUtils.contentDiffers(is1, is2).isPresent());
    }

    @Test
    public void testContentDiffers_Same() throws IOException {
        InputStream is1 = new ByteArrayInputStream(new byte[] {1, 2, 3});
        InputStream is2 = new ByteArrayInputStream(new byte[] {1, 2, 3});
        assertFalse(StreamUtils.contentDiffers(is1, is2).isPresent());
    }

    @Test
    public void testContentDiffers_Differs() throws IOException {
        InputStream is1 = new ByteArrayInputStream(new byte[] {1, 2, 3});
        InputStream is2 = new ByteArrayInputStream(new byte[] {1, 2, 4});
        assertEquals("At offset 2: 3 != 4", StreamUtils.contentDiffers(is1, is2).get());
    }

    @Test
    public void testContentDiffers_FirstEndsTooSoon() throws IOException {
        InputStream is1 = new ByteArrayInputStream(new byte[] {1, 2, 3});
        InputStream is2 = new ByteArrayInputStream(new byte[] {1, 2, 3, 4});
        assertEquals("At offset 3: -1 != 4", StreamUtils.contentDiffers(is1, is2).get());
    }

    @Test
    public void testContentDiffers_SecondEndsTooSoon() throws IOException {
        InputStream is1 = new ByteArrayInputStream(new byte[] {1, 2, 3, 4, 5});
        InputStream is2 = new ByteArrayInputStream(new byte[] {1, 2, 3, 4});
        assertEquals("At offset 4: 5 != -1", StreamUtils.contentDiffers(is1, is2).get());
    }

    @Test
    public void testToString() {
        String value = "this is a string" + System.lineSeparator() + "and the next line";
        assertEquals(
                value,
                StreamUtils.toString(
                        new ByteArrayInputStream(value.getBytes(Charset.defaultCharset())),
                        Charset.defaultCharset()));

        value =
                "this is a string\nand the next line\rand a third line\r\nand a fourth line\n\rand is this a 5th line?";
        assertEquals(
                value,
                StreamUtils.toString(
                        new ByteArrayInputStream(value.getBytes(Charset.defaultCharset())),
                        Charset.defaultCharset()));

        value =
                "this is a string"
                        + System.lineSeparator()
                        + "and the next line"
                        + System.lineSeparator();
        assertEquals(
                value,
                StreamUtils.toString(
                        new ByteArrayInputStream(value.getBytes(Charset.defaultCharset())),
                        Charset.defaultCharset()));
    }

    @Test
    public void testToByteArray() throws IOException {
        String value = "this is a string" + System.lineSeparator() + "and the next line";
        assertArrayEquals(
                value.getBytes(Charset.defaultCharset()),
                StreamUtils.toByteArray(
                        new ByteArrayInputStream(value.getBytes(Charset.defaultCharset()))));

        value =
                "this is a string\nand the next line\rand a third line\r\nand a fourth line\n\rand is this a 5th line?";
        assertArrayEquals(
                value.getBytes(Charset.defaultCharset()),
                StreamUtils.toByteArray(
                        new ByteArrayInputStream(value.getBytes(Charset.defaultCharset()))));

        value =
                "this is a string"
                        + System.lineSeparator()
                        + "and the next line"
                        + System.lineSeparator();
        assertArrayEquals(
                value.getBytes(Charset.defaultCharset()),
                StreamUtils.toByteArray(
                        new ByteArrayInputStream(value.getBytes(Charset.defaultCharset()))));
    }

    @Test
    public void testToByteArray_Long() throws IOException {
        Random random = new Random();

        byte[] original = new byte[123456];
        random.nextBytes(original);
        assertArrayEquals(original, StreamUtils.toByteArray(new ByteArrayInputStream(original)));

        original = new byte[4096];
        random.nextBytes(original);
        assertArrayEquals(original, StreamUtils.toByteArray(new ByteArrayInputStream(original)));

        original = new byte[8192];
        random.nextBytes(original);
        assertArrayEquals(original, StreamUtils.toByteArray(new ByteArrayInputStream(original)));
    }

    @Test
    public void testSkipBytesInStream() throws IOException {
        String value = "1234567890";
        ByteArrayInputStream is =
                new ByteArrayInputStream(value.getBytes(Charset.defaultCharset()));
        StreamUtils.skipBytesInStream(is, 4);
        int r = is.read();
        assertEquals('5', (char) r);

        StreamUtils.skipBytesInStream(is, 0);
        r = is.read();
        assertEquals('6', (char) r);
    }

    @Test
    public void testLimitRemainingStreamLength() throws IOException {
        String value = "1234567890";
        ByteArrayInputStream is =
                new ByteArrayInputStream(value.getBytes(Charset.defaultCharset()));
        InputStream limited = StreamUtils.limitRemainingStreamLength(is, 4);

        String result = StreamUtils.toString(limited, Charset.defaultCharset());
        assertEquals("1234", result);

        is = new ByteArrayInputStream(value.getBytes(Charset.defaultCharset()));
        limited = StreamUtils.limitRemainingStreamLength(is, 0);
        assertEquals(-1, limited.read());

        is = new ByteArrayInputStream(value.getBytes(Charset.defaultCharset()));
        limited = StreamUtils.limitRemainingStreamLength(is, 20);
        result = StreamUtils.toString(limited, Charset.defaultCharset());
        assertEquals(value, result);
    }
}
