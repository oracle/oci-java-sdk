/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Checksum;

/**
 * This class was refactored from the original Java 9 implementation to be compatible with Java 8.
 */
public final class CRC32C implements Checksum {

    /** CRC-32C Polynomial */
    private static final int CRC32C_POLY = 0x1EDC6F41;

    private static final int REVERSED_CRC32C_POLY = Integer.reverse(CRC32C_POLY);

    private static final int[] byteTable;
    private static final int[][] byteTables = new int[8][256];
    private static final int[] byteTable0 = byteTables[0];
    private static final int[] byteTable1 = byteTables[1];
    private static final int[] byteTable2 = byteTables[2];
    private static final int[] byteTable3 = byteTables[3];
    private static final int[] byteTable4 = byteTables[4];
    private static final int[] byteTable5 = byteTables[5];
    private static final int[] byteTable6 = byteTables[6];
    private static final int[] byteTable7 = byteTables[7];

    static {
        for (int index = 0; index < byteTables[0].length; index++) {
            int r = index;
            for (int i = 0; i < Byte.SIZE; i++) {
                if ((r & 1) != 0) {
                    r = (r >>> 1) ^ REVERSED_CRC32C_POLY;
                } else {
                    r >>>= 1;
                }
            }
            byteTables[0][index] = r;
        }

        for (int index = 0; index < byteTables[0].length; index++) {
            int r = byteTables[0][index];

            for (int k = 1; k < byteTables.length; k++) {
                r = byteTables[0][r & 0xFF] ^ (r >>> 8);
                byteTables[k][index] = r;
            }
        }

        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            byteTable = byteTables[0];
        } else {
            byteTable = new int[byteTable0.length];
            System.arraycopy(byteTable0, 0, byteTable, 0, byteTable0.length);
            for (int[] table : byteTables) {
                for (int index = 0; index < table.length; index++) {
                    table[index] = Integer.reverseBytes(table[index]);
                }
            }
        }
    }

    /** Calculated CRC-32C value */
    private int crc = 0xFFFFFFFF;

    /** Creates a new CRC32C object. */
    public CRC32C() {}

    /**
     * Updates the CRC-32C checksum with the specified byte (the low eight bits of the argument b).
     */
    @Override
    public void update(int b) {
        crc = (crc >>> 8) ^ byteTable[(crc ^ (b & 0xFF)) & 0xFF];
    }

    /**
     * Updates the CRC-32C checksum with the specified array of bytes.
     *
     * @throws ArrayIndexOutOfBoundsException if {@code off} is negative, or {@code len} is
     *     negative, or {@code off+len} is negative or greater than the length of the array {@code
     *     b}.
     */
    @Override
    public void update(byte[] b, int off, int len) {
        if (b == null) {
            throw new NullPointerException();
        }
        if (off < 0 || len < 0 || off > b.length - len) {
            throw new ArrayIndexOutOfBoundsException();
        }
        crc = updateBytes(crc, b, off, (off + len));
    }

    /**
     * Updates the CRC-32C checksum with the bytes from the specified buffer.
     *
     * <p>The checksum is updated with the remaining bytes in the buffer, starting at the buffer's
     * position. Upon return, the buffer's position will be updated to its limit; its limit will not
     * have been changed.
     */
    public void update(ByteBuffer buffer) {
        int pos = buffer.position();
        int limit = buffer.limit();
        assert (pos <= limit);
        int rem = limit - pos;
        if (rem <= 0) {
            return;
        }

        if (buffer.isDirect()) {
            crc = updateDirectByteBuffer(crc, buffer, pos, limit);
        } else if (buffer.hasArray()) {
            crc =
                    updateBytes(
                            crc,
                            buffer.array(),
                            pos + buffer.arrayOffset(),
                            limit + buffer.arrayOffset());
        } else {
            byte[] b = new byte[Math.min(buffer.remaining(), 4096)];
            while (buffer.hasRemaining()) {
                int length = Math.min(buffer.remaining(), b.length);
                buffer.get(b, 0, length);
                update(b, 0, length);
            }
        }
        // cast is necessary to avoid NoSuchMethodError in Java 8
        // see
        // https://stackoverflow.com/questions/48693695/java-nio-buffer-not-loading-clear-method-on-runtime
        ((Buffer) buffer).position(limit);
    }

    /** Resets CRC-32C to initial value. */
    @Override
    public void reset() {
        crc = 0xFFFFFFFF;
    }

    /** Returns CRC-32C value. */
    @Override
    public long getValue() {
        return (~crc) & 0xFFFFFFFFL;
    }

    /** Updates the CRC-32C checksum with the specified array of bytes. */
    private static int updateBytes(int crc, byte[] b, int off, int end) {

        if (end - off >= 8) {

            int alignLength = (8 - (off & 0x7)) & 0x7;
            for (int alignEnd = off + alignLength; off < alignEnd; off++) {
                crc = (crc >>> 8) ^ byteTable[(crc ^ b[off]) & 0xFF];
            }

            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                crc = Integer.reverseBytes(crc);
            }

            for (; off < (end - Long.BYTES); off += Long.BYTES) {
                long value = 0;
                for (int i = 0; i < Long.BYTES; i++) {
                    value |= ((long) b[off + i] & 0xFF) << (i * 8);
                }
                int firstHalf = (int) value;
                int secondHalf = (int) (value >>> 32);
                crc ^= firstHalf;
                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                    crc =
                            byteTable7[crc & 0xFF]
                                    ^ byteTable6[(crc >>> 8) & 0xFF]
                                    ^ byteTable5[(crc >>> 16) & 0xFF]
                                    ^ byteTable4[crc >>> 24]
                                    ^ byteTable3[secondHalf & 0xFF]
                                    ^ byteTable2[(secondHalf >>> 8) & 0xFF]
                                    ^ byteTable1[(secondHalf >>> 16) & 0xFF]
                                    ^ byteTable0[secondHalf >>> 24];
                } else {
                    crc =
                            byteTable0[secondHalf & 0xFF]
                                    ^ byteTable1[(secondHalf >>> 8) & 0xFF]
                                    ^ byteTable2[(secondHalf >>> 16) & 0xFF]
                                    ^ byteTable3[secondHalf >>> 24]
                                    ^ byteTable4[crc & 0xFF]
                                    ^ byteTable5[(crc >>> 8) & 0xFF]
                                    ^ byteTable6[(crc >>> 16) & 0xFF]
                                    ^ byteTable7[crc >>> 24];
                }
            }

            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                crc = Integer.reverseBytes(crc);
            }
        }

        // Tail
        for (; off < end; off++) {
            crc = (crc >>> 8) ^ byteTable[(crc ^ b[off]) & 0xFF];
        }

        return crc;
    }

    /** Updates the CRC-32C checksum reading from the specified address. */
    private static int updateDirectByteBuffer(int crc, ByteBuffer buffer, int off, int end) {

        if (end - off >= 8) {

            int alignLength = (8 - (off & 0x7)) & 0x7;
            for (int alignEnd = off + alignLength; off < alignEnd; off++) {
                crc = (crc >>> 8) ^ byteTable[(crc ^ buffer.get(off)) & 0xFF];
            }

            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                crc = Integer.reverseBytes(crc);
            }

            for (; off <= (end - Long.BYTES); off += Long.BYTES) {
                long value = buffer.getLong(off);
                int firstHalf = (int) value;
                int secondHalf = (int) (value >>> 32);
                crc ^= firstHalf;
                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                    crc =
                            byteTable7[crc & 0xFF]
                                    ^ byteTable6[(crc >>> 8) & 0xFF]
                                    ^ byteTable5[(crc >>> 16) & 0xFF]
                                    ^ byteTable4[crc >>> 24]
                                    ^ byteTable3[secondHalf & 0xFF]
                                    ^ byteTable2[(secondHalf >>> 8) & 0xFF]
                                    ^ byteTable1[(secondHalf >>> 16) & 0xFF]
                                    ^ byteTable0[secondHalf >>> 24];
                } else {
                    crc =
                            byteTable0[secondHalf & 0xFF]
                                    ^ byteTable1[(secondHalf >>> 8) & 0xFF]
                                    ^ byteTable2[(secondHalf >>> 16) & 0xFF]
                                    ^ byteTable3[secondHalf >>> 24]
                                    ^ byteTable4[crc & 0xFF]
                                    ^ byteTable5[(crc >>> 8) & 0xFF]
                                    ^ byteTable6[(crc >>> 16) & 0xFF]
                                    ^ byteTable7[crc >>> 24];
                }
            }

            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                crc = Integer.reverseBytes(crc);
            }
        }

        for (; off < end; off++) {
            crc = (crc >>> 8) ^ byteTable[(crc ^ buffer.get(off)) & 0xFF];
        }

        return crc;
    }
}
