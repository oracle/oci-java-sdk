/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.encryption.MasterKey;
import com.oracle.bmc.encryption.MasterKeyProvider;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DecryptionHandlerTest {
    private static final int MAX_HEADER_SIZE = 2 * 1024 * 1024;
    private static final String INVALID_HEADER_SIZE_MESSAGE =
            "Failed to read a valid encryption header size. Check if this encrypted file has the correct format.";

    @Test
    public void testDecrypt_ThrowsIllegalArgumentException_WhenHeaderSizeExceedsMaxHeaderSize()
            throws Exception {
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider();
        DecryptionHandler handler = new DecryptionHandler(provider);

        try {
            handler.decrypt(createPayloadWithHeaderSize(MAX_HEADER_SIZE + 1));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(INVALID_HEADER_SIZE_MESSAGE, e.getMessage());
        }
    }

    @Test
    public void testDecrypt_DoesNotCallMasterKeyProvider_WhenHeaderSizeExceedsMaxHeaderSize()
            throws Exception {
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider();
        DecryptionHandler handler = new DecryptionHandler(provider);

        try {
            handler.decrypt(createPayloadWithHeaderSize(MAX_HEADER_SIZE + 1));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(INVALID_HEADER_SIZE_MESSAGE, e.getMessage());
        }

        assertEquals(0, provider.getMasterKeyCalls);
        assertEquals(0, provider.getAuthenticationProviderCalls);
    }

    @Test
    public void
            testGetDecryptInputStream_ThrowsIllegalArgumentException_WhenHeaderSizeExceedsMaxHeaderSize()
                    throws Exception {
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider();
        DecryptionHandler handler = new DecryptionHandler(provider);

        try {
            handler.getDecryptInputStream(
                    new ByteArrayInputStream(createPayloadWithHeaderSize(MAX_HEADER_SIZE + 1)));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(INVALID_HEADER_SIZE_MESSAGE, e.getMessage());
        }
    }

    @Test
    public void
            testGetDecryptInputStream_DoesNotCallMasterKeyProvider_WhenHeaderSizeExceedsMaxHeaderSize()
                    throws Exception {
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider();
        DecryptionHandler handler = new DecryptionHandler(provider);

        try {
            handler.getDecryptInputStream(
                    new ByteArrayInputStream(createPayloadWithHeaderSize(MAX_HEADER_SIZE + 1)));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals(INVALID_HEADER_SIZE_MESSAGE, e.getMessage());
        }

        assertEquals(0, provider.getMasterKeyCalls);
        assertEquals(0, provider.getAuthenticationProviderCalls);
    }

    private static byte[] createPayloadWithHeaderSize(int headerSize) {
        ByteBuffer buffer = ByteBuffer.allocate(6);
        buffer.putShort((short) 1);
        buffer.putInt(headerSize);
        return buffer.array();
    }

    private static final class CountingMasterKeyProvider
            implements MasterKeyProvider<AbstractAuthenticationDetailsProvider> {
        private int getMasterKeyCalls = 0;
        private int getAuthenticationProviderCalls = 0;

        @Override
        public MasterKey getMasterKey() {
            getMasterKeyCalls++;
            return null;
        }

        @Override
        public AbstractAuthenticationDetailsProvider getAuthenticationProvider() {
            getAuthenticationProviderCalls++;
            return null;
        }

        @Override
        public CryptoAlgorithm getCryptoAlgorithm() {
            return CryptoAlgorithm.AES_256_GCM_IV12_TAG16;
        }
    }
}
