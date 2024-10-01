/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

import java.nio.ByteBuffer;

/** Services for erasing the contents of mutable data structures such as arrays */
class Eraser {

    public static void erase(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            if (byteBuffer.hasArray()) {
                erase(byteBuffer.array());
            } else {
                eraseDirectBuffer(byteBuffer);
            }
        }
    }

    private static void eraseDirectBuffer(ByteBuffer byteBuffer) {
        byteBuffer.clear();
        int length = byteBuffer.capacity();
        for (int i = 0; i < length; i++) {
            byteBuffer.put(i, (byte) 0);
        }
    }

    public static void erase(byte[] bytes) {
        if (bytes != null) {
            final int length = bytes.length;
            /* zero out first character */
            if (length > 0) {
                bytes[0] = 0;
            }
            /* copy zeroed byte to all other bytes in buf, faster than naive iteration
             * over each element in the array.
             * Duplicates bytes in 2, 4, 8, etc increments
             */
            for (int pos = 1; pos < length; pos += pos) {
                System.arraycopy(bytes, 0, bytes, pos, Math.min(length - pos, pos));
            }
        }
    }

    public static void erase(char[] chars) {
        if (chars != null) {
            final int length = chars.length;
            /* zero out first character */
            if (length > 0) {
                chars[0] = 0;
            }
            /* copy zeroed byte to all other bytes in buf, faster than naive iteration
             * over each element in the array.
             * Duplicates bytes in 2, 4, 8, etc increments
             */
            for (int pos = 1; pos < length; pos += pos) {
                System.arraycopy(chars, 0, chars, pos, Math.min(length - pos, pos));
            }
        }
    }
}
