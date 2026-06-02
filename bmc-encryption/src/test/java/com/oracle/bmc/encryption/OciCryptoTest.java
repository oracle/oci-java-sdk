/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.encryption.internal.CryptoAlgorithm;
import com.oracle.bmc.encryption.internal.DataKey;
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

public class OciCryptoTest {
    private static final int MAX_HEADER_SIZE = 2 * 1024 * 1024;
    private static final String INVALID_HEADER_SIZE_MESSAGE =
            "Failed to read a valid encryption header size. Check if this encrypted file has the correct format.";
    private static final String INVALID_HEADER_CREATION_SIZE_MESSAGE =
            "Failed to create a valid encryption header size. Reduce the encryption context size.";

    @Test
    public void testDecryptData_ThrowsIllegalArgumentException_WhenHeaderSizeExceedsMaxHeaderSize()
            throws Exception {
        OciCrypto ociCrypto = new OciCrypto();

        assertInvalidHeaderSizeException(
                () ->
                        ociCrypto.decryptData(
                                new CountingMasterKeyProvider(),
                                createPayloadWithHeaderSize(MAX_HEADER_SIZE + 1)));
    }

    @Test
    public void
            testCreateDecryptingStream_ThrowsIllegalArgumentException_WhenHeaderSizeExceedsMaxHeaderSize()
                    throws Exception {
        OciCrypto ociCrypto = new OciCrypto();

        assertInvalidHeaderSizeException(
                () ->
                        ociCrypto.createDecryptingStream(
                                new CountingMasterKeyProvider(),
                                new ByteArrayInputStream(
                                        createPayloadWithHeaderSize(MAX_HEADER_SIZE + 1))));
    }

    @Test
    public void
            testEncryptData_ThrowsIllegalArgumentException_WhenContextProducesHeaderExceedingMaxHeaderSize()
                    throws Exception {
        OciCrypto ociCrypto = new OciCrypto();

        assertInvalidHeaderCreationSizeException(
                () ->
                        ociCrypto.encryptData(
                                createEncryptingMasterKeyProvider(),
                                new byte[] {1, 2, 3},
                                createOversizedContext()));
    }

    @Test
    public void
            testCreateEncryptingStream_ThrowsIllegalArgumentException_WhenContextProducesHeaderExceedingMaxHeaderSize()
                    throws Exception {
        OciCrypto ociCrypto = new OciCrypto();

        assertInvalidHeaderCreationSizeException(
                () ->
                        ociCrypto.createEncryptingStream(
                                createEncryptingMasterKeyProvider(),
                                new ByteArrayInputStream(new byte[] {1, 2, 3}),
                                createOversizedContext()));
    }

    private static byte[] createPayloadWithHeaderSize(int headerSize) {
        ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.putShort((short) 1);
        buffer.putInt(headerSize);
        return buffer.array();
    }

    private static MasterKeyProvider<AbstractAuthenticationDetailsProvider>
            createEncryptingMasterKeyProvider() {
        KmsMasterKey masterKey = mock(KmsMasterKey.class);
        when(masterKey.generateDataEncryptionKey(CryptoAlgorithm.AES_256_GCM_IV12_TAG16))
                .thenReturn(createDataKey());
        when(masterKey.getRegion()).thenReturn("us-phoenix-1");
        when(masterKey.getVaultId()).thenReturn("test-vault-id");
        when(masterKey.getKmsMasterKeyId()).thenReturn("test-master-key-id");

        return new MasterKeyProvider<AbstractAuthenticationDetailsProvider>() {
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
    }

    private static DataKey createDataKey() {
        return new DataKey(
                "ciphertext",
                Base64.getEncoder().encodeToString(new byte[32]),
                "plaintextChecksum");
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

    private static final class CountingMasterKeyProvider
            implements MasterKeyProvider<AbstractAuthenticationDetailsProvider> {
        @Override
        public MasterKey getMasterKey() {
            return null;
        }

        @Override
        public AbstractAuthenticationDetailsProvider getAuthenticationProvider() {
            return null;
        }

        @Override
        public CryptoAlgorithm getCryptoAlgorithm() {
            return CryptoAlgorithm.AES_256_GCM_IV12_TAG16;
        }
    }
}
