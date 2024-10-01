/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static com.oracle.bmc.http.client.pki.Eraser.erase;

abstract class Text {

    private Text() {}

    static String of(byte[] utf8) {
        if (utf8 == null) {
            return null;
        } else {
            return new String(utf8, StandardCharsets.UTF_8);
        }
    }

    static String of(Utf8 utf8) {
        if (utf8 == null) {
            return null;
        } else {
            return of(utf8.bytes());
        }
    }

    static byte[] bytes(String text) {
        if (text == null) {
            return null;
        } else {
            return text.getBytes(StandardCharsets.UTF_8);
        }
    }

    static char[] chars(final byte[] content) {
        final ByteBuffer bytes = ByteBuffer.wrap(content);
        final CharBuffer buffer = StandardCharsets.UTF_8.decode(bytes);

        final char[] buf = buffer.array();
        final int position = buffer.position();
        final int limit = buffer.limit();
        final int offset = buffer.arrayOffset();
        if (offset == 0 && position == 0 && limit == buf.length) {
            // no copy needed
            return buf;
        } else {
            // must copy subsection of backing array
            final char[] chars = Arrays.copyOfRange(buf, offset + position, offset + limit);
            Eraser.erase(buf);
            return chars;
        }
    }

    static byte[] bytes(final CharBuffer text) {
        if (text == null) {
            return null;
        } else {
            final CharBuffer chars = text.asReadOnlyBuffer();
            final ByteBuffer buffer = StandardCharsets.UTF_8.encode(chars);
            final byte[] buf = buffer.array();

            final int position = buffer.position();
            final int limit = buffer.limit();
            final int offset = buffer.arrayOffset();
            if (offset == 0 && position == 0 && limit == buf.length) {
                // no copy needed
                return buf;
            } else {
                // must copy subsection of backing array
                final byte[] bytes = Arrays.copyOfRange(buf, offset + position, offset + limit);
                Eraser.erase(buf);
                return bytes;
            }
        }
    }
}
