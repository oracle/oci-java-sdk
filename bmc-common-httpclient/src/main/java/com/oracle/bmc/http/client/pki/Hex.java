/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

abstract class Hex {
    private Hex() {}

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    static String encode(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    static byte[] decode(final CharSequence hex) {
        final int length = hex.length();
        byte[] bytes = new byte[length / 2];
        for (int i = 0; i < length; ++i) {
            final int highNibble = Character.digit(hex.charAt(i), 16) << 4;
            final int lowNibble = Character.digit(hex.charAt(++i), 16);
            bytes[i / 2] = (byte) (highNibble + lowNibble);
        }
        return bytes;
    }
}
