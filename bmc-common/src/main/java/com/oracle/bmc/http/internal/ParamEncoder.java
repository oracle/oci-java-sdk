/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

import com.oracle.bmc.InternalSdk;

@InternalSdk
public final class ParamEncoder {
    private static final BitSet QUERY_PARAM_KEEP_SET;
    private static final BitSet PATH_PARAM_KEEP_SET;
    private static final char[] HEX = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static String encodeQueryParam(String input) {
        return encode(input, QUERY_PARAM_KEEP_SET);
    }

    public static String encodePathParam(String input) {
        return encode(input, PATH_PARAM_KEEP_SET);
    }

    private static String encode(String input, BitSet keepSet) {
        // first, fast path if no encoding necessary
        boolean needEscape = false;
        for (int i = 0; i < input.length(); i++) {
            if (!keepSet.get(input.charAt(i))) {
                needEscape = true;
                break;
            }
        }
        if (!needEscape) {
            return input;
        }

        StringBuilder builder = new StringBuilder();
        int off = 0;
        while (off < input.length()) {
            int cp = input.codePointAt(off);
            off += Character.charCount(cp);

            if (keepSet.get(cp)) {
                builder.appendCodePoint(cp);
            } else {
                if (cp < 0x80) {
                    appendPercentEncodedByte(builder, (byte) cp);
                } else {
                    ByteBuffer bytes =
                            StandardCharsets.UTF_8.encode(CharBuffer.wrap(Character.toChars(cp)));
                    while (bytes.hasRemaining()) {
                        appendPercentEncodedByte(builder, bytes.get());
                    }
                }
            }
        }
        return builder.toString();
    }

    private static boolean isHex(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    private static void appendPercentEncodedByte(StringBuilder builder, byte b) {
        builder.append('%');
        builder.append(HEX[(b >> 4) & 0xf]);
        builder.append(HEX[b & 0xf]);
    }

    static {
        // this is a set of code points that will *not* be encoded. We fill it gradually from the
        // spec:
        // https://url.spec.whatwg.org/#c0-control-percent-encode-set
        BitSet keepSet = new BitSet(256);

        // First, the C0 set: Everything except 0x20-0x7e is encoded.
        keepSet.set(0x20, 0x7f);

        // technically according to the spec, we should only escape percent when it's required. But
        // we do it all the
        // time anyway.
        keepSet.clear('%');

        // query percent-encode set
        keepSet.clear(' ');
        keepSet.clear('"');
        keepSet.clear('#');
        keepSet.clear('<');
        keepSet.clear('>');

        // path percent-encode set
        keepSet.clear('?');
        keepSet.clear('`');
        keepSet.clear('{');
        keepSet.clear('}');
        PATH_PARAM_KEEP_SET = (BitSet) keepSet.clone();
        PATH_PARAM_KEEP_SET.clear('/');

        // userinfo percent-encode set
        keepSet.clear('/');
        keepSet.clear(':');
        keepSet.clear(';');
        keepSet.clear('=');
        keepSet.clear('@');
        keepSet.clear('[', '^' + 1);
        keepSet.clear('|');

        // component percent-encode set
        keepSet.clear('$', '&' + 1);
        keepSet.clear('+');
        keepSet.clear(',');

        // application/x-www-form-urlencoded percent-encode set
        keepSet.clear('!');
        keepSet.clear('\'', ')' + 1);
        keepSet.clear('~');

        // weirdness: jersey slightly diverges from the standard, it encodes * but not ~
        // let's just encode * also to be sure
        keepSet.clear('*');

        QUERY_PARAM_KEEP_SET = keepSet;
    }
}
