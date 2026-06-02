/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.encryption.KmsMasterKey;
import com.oracle.bmc.encryption.MasterKeyProvider;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SerializeHeaderTest {
    private static final int MAX_HEADER_SIZE = 2 * 1024 * 1024;
    private static final String INVALID_HEADER_SIZE_MESSAGE =
            "Failed to read a valid encryption header size. Check if this encrypted file has the correct format.";
    private static final String INVALID_HEADER_CREATION_SIZE_MESSAGE =
            "Failed to create a valid encryption header size. Reduce the encryption context size.";

    @Test
    public void testCreateEncryptionHeader_NullContext() {
        Map<String, ?> context = null;
        assertEquals("", SerializeHeader.mapToJson(context));
    }

    @Test
    public void testCreateEncryptionHeader_SimpleContext() {
        Map<String, Object> context = new LinkedHashMap<>();
        context.put("key1", "value1");

        assertEquals("{\"key1\":\"value1\"}", SerializeHeader.mapToJson(context));
    }

    @Test
    public void testCreateEncryptionHeader_TwoSimpleContext() {
        Map<String, Object> context = new LinkedHashMap<>();
        context.put("key1", "value1");
        context.put("key2", "value2");

        assertEquals(
                "{\"key1\":\"value1\",\"key2\":\"value2\"}", SerializeHeader.mapToJson(context));
    }

    @Test
    public void testCreateEncryptionHeader_NestedContext() {
        Map<String, Object> nestedContext = new LinkedHashMap<>();
        nestedContext.put("nestedkey1", "nestedvalue1");
        nestedContext.put("nestedkey2", "nestedvalue2");

        Map<String, Object> context = new LinkedHashMap<>();
        context.put("key1", "value1");
        context.put("key2", "value2");
        context.put("key3", nestedContext);

        assertEquals(
                "{\"key1\":\"value1\",\"key2\":\"value2\",\"key3\":{\"nestedkey1\":\"nestedvalue1\",\"nestedkey2\":\"nestedvalue2\"}}",
                SerializeHeader.mapToJson(context));
    }

    @Test
    public void testCreateHeader_CreatesReadableHeader_WhenSerializedHeaderIsWithinLimit()
            throws Exception {
        SerializeHeader serializeHeader = createSerializeHeader();
        Map<String, String> context = new LinkedHashMap<>();
        context.put("key1", "value1");

        EncryptionHeader createdHeader =
                serializeHeader.createHeader(createDataKey(), createIvBytes(), context);
        EncryptionHeader readHeader =
                serializeHeader.readHeader(
                        new ByteArrayInputStream(createdHeader.getHeaderBytes()));

        assertEquals(createdHeader.getEncryptionKey(), readHeader.getEncryptionKey());
        assertEquals(createdHeader.getIV(), readHeader.getIV());
        assertEquals(context, readHeader.getContext());
    }

    @Test
    public void
            testCreateHeader_ThrowsIllegalArgumentException_WhenSerializedHeaderExceedsMaxHeaderSize() {
        SerializeHeader serializeHeader = createSerializeHeader();

        assertInvalidHeaderCreationSizeException(
                () ->
                        serializeHeader.createHeader(
                                createDataKey(), createIvBytes(), createOversizedContext()));
    }

    @Test
    public void testGetHeaderSize_ReturnsValidSize_WhenHeaderIsWithinLimit() {
        SerializeHeader serializeHeader = new SerializeHeader(null);

        assertEquals(1024, serializeHeader.getHeaderSize(createHeaderIntro((short) 1, 1024)));
    }

    @Test
    public void testGetHeaderSize_ReturnsMaxHeaderSize_WhenHeaderEqualsLimit() {
        SerializeHeader serializeHeader = new SerializeHeader(null);

        assertEquals(
                MAX_HEADER_SIZE,
                serializeHeader.getHeaderSize(createHeaderIntro((short) 1, MAX_HEADER_SIZE)));
    }

    @Test
    public void testGetHeaderSize_ThrowsIllegalArgumentException_WhenHeaderSizeIsZero() {
        SerializeHeader serializeHeader = new SerializeHeader(null);

        assertInvalidHeaderSizeException(
                () -> serializeHeader.getHeaderSize(createHeaderIntro((short) 1, 0)));
    }

    @Test
    public void testGetHeaderSize_ThrowsIllegalArgumentException_WhenHeaderSizeIsNegative() {
        SerializeHeader serializeHeader = new SerializeHeader(null);

        assertInvalidHeaderSizeException(
                () -> serializeHeader.getHeaderSize(createHeaderIntro((short) 1, -1)));
    }

    @Test
    public void
            testGetHeaderSize_ThrowsIllegalArgumentException_WhenHeaderSizeExceedsMaxHeaderSize() {
        SerializeHeader serializeHeader = new SerializeHeader(null);

        assertInvalidHeaderSizeException(
                () ->
                        serializeHeader.getHeaderSize(
                                createHeaderIntro((short) 1, MAX_HEADER_SIZE + 1)));
    }

    @Test
    public void testGetHeaderSize_ThrowsRuntimeException_WhenVersionIsInvalid() {
        SerializeHeader serializeHeader = new SerializeHeader(null);

        try {
            serializeHeader.getHeaderSize(createHeaderIntro((short) 2, 1024));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals(
                    "Encryption header from the encrypted file (2) doesn't match expected version (1). Check if this encrypted file has the correct format.",
                    e.getMessage());
        }
    }

    @Test
    public void testReadHeader_ThrowsIllegalArgumentException_WhenHeaderSizeExceedsMaxHeaderSize()
            throws Exception {
        SerializeHeader serializeHeader = new SerializeHeader(null);

        assertInvalidHeaderSizeException(
                () ->
                        serializeHeader.readHeader(
                                new ByteArrayInputStream(
                                        createHeaderIntro((short) 1, MAX_HEADER_SIZE + 1))));
    }

    private static byte[] createHeaderIntro(short version, int size) {
        ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.putShort(version);
        buffer.putInt(size);
        return buffer.array();
    }

    private static SerializeHeader createSerializeHeader() {
        KmsMasterKey masterKey = mock(KmsMasterKey.class);
        when(masterKey.getRegion()).thenReturn("us-phoenix-1");
        when(masterKey.getVaultId()).thenReturn("test-vault-id");
        when(masterKey.getKmsMasterKeyId()).thenReturn("test-master-key-id");

        MasterKeyProvider<AbstractAuthenticationDetailsProvider> provider =
                new MasterKeyProvider<AbstractAuthenticationDetailsProvider>() {
                    @Override
                    public KmsMasterKey getMasterKey() {
                        return masterKey;
                    }

                    @Override
                    public AbstractAuthenticationDetailsProvider getAuthenticationProvider() {
                        return null;
                    }

                    @Override
                    public CryptoAlgorithm getCryptoAlgorithm() {
                        return CryptoAlgorithm.AES_256_GCM_IV12_TAG16;
                    }
                };
        return new SerializeHeader(provider);
    }

    private static DataKey createDataKey() {
        return new DataKey(
                "ciphertext",
                Base64.getEncoder().encodeToString(new byte[32]),
                "plaintextChecksum");
    }

    private static byte[] createIvBytes() {
        byte[] ivBytes = new byte[12];
        Arrays.fill(ivBytes, (byte) 1);
        return ivBytes;
    }

    private static Map<String, String> createOversizedContext() {
        Map<String, String> context = new LinkedHashMap<>();
        context.put("key1", createString(MAX_HEADER_SIZE));
        return context;
    }

    private static String createString(int size) {
        char[] chars = new char[size];
        Arrays.fill(chars, 'a');
        return new String(chars);
    }

    private static void assertInvalidHeaderSizeException(ThrowingRunnable runnable) {
        try {
            runnable.run();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(INVALID_HEADER_SIZE_MESSAGE, e.getMessage());
        } catch (Exception e) {
            fail("Expected IllegalArgumentException but got " + e.getClass().getName());
        }
    }

    private static void assertInvalidHeaderCreationSizeException(ThrowingRunnable runnable) {
        try {
            runnable.run();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(INVALID_HEADER_CREATION_SIZE_MESSAGE, e.getMessage());
        } catch (Exception e) {
            fail("Expected IllegalArgumentException but got " + e.getClass().getName());
        }
    }

    private interface ThrowingRunnable {
        void run() throws Exception;
    }
}
