/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.auth.RegionProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.encryption.KmsMasterKey;
import com.oracle.bmc.encryption.MasterKey;
import com.oracle.bmc.encryption.MasterKeyProvider;
import com.oracle.bmc.http.Serialization;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;

public class DecryptionHandlerTest {
    private static final int MAX_HEADER_SIZE = 2 * 1024 * 1024;
    private static final String INVALID_HEADER_SIZE_MESSAGE =
            "Failed to read a valid encryption header size. Check if this encrypted file has the correct format.";
    private static final String REGION = "us-phoenix-1";
    private static final String VAULT_ID = "test-vault-id";
    private static final String MASTER_KEY_ID = "test-master-key-id";

    @Test
    public void decryptingStreamAcceptsBlobWhenPinnedMetadataMatches() throws Exception {
        KmsMasterKey pinnedKey = createMasterKey(REGION, VAULT_ID, MASTER_KEY_ID);
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider(pinnedKey, null);
        DecryptionHandler handler = new DecryptionHandler(provider);

        assertNotNull(
                handler.getDecryptInputStream(
                        new ByteArrayInputStream(
                                createPayload(
                                        createEncryptionHeader(REGION, VAULT_ID, MASTER_KEY_ID)))));
        assertEquals(0, provider.getAuthenticationProviderCalls);
    }

    @Test
    public void decryptRejectsDifferentPinnedMasterKeyId() {
        assertPinnedMetadataRejected(
                createEncryptionHeader(REGION, VAULT_ID, "different-master-key-id"),
                "Encrypted blob master key ID does not match the configured KMS master key.");
    }

    @Test
    public void decryptRejectsDifferentPinnedVaultId() {
        assertPinnedMetadataRejected(
                createEncryptionHeader(REGION, "different-vault-id", MASTER_KEY_ID),
                "Encrypted blob vault ID does not match the configured KMS master key.");
    }

    @Test
    public void decryptRejectsDifferentPinnedRegion() {
        assertPinnedMetadataRejected(
                createEncryptionHeader("us-ashburn-1", VAULT_ID, MASTER_KEY_ID),
                "Encrypted blob region does not match the configured KMS master key.");
    }

    @Test
    public void decryptingStreamAcceptsPinnedRegionShortName() throws Exception {
        KmsMasterKey pinnedKey = createMasterKey(REGION, VAULT_ID, MASTER_KEY_ID);
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider(pinnedKey, null);
        DecryptionHandler handler = new DecryptionHandler(provider);

        assertNotNull(
                handler.getDecryptInputStream(
                        new ByteArrayInputStream(
                                createPayload(
                                        createEncryptionHeader("phx", VAULT_ID, MASTER_KEY_ID)))));
        assertEquals(0, provider.getAuthenticationProviderCalls);
    }

    @Test
    public void decryptingStreamAcceptsPinnedRegionCaseDifference() throws Exception {
        KmsMasterKey pinnedKey = createMasterKey(REGION, VAULT_ID, MASTER_KEY_ID);
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider(pinnedKey, null);
        DecryptionHandler handler = new DecryptionHandler(provider);

        assertNotNull(
                handler.getDecryptInputStream(
                        new ByteArrayInputStream(
                                createPayload(
                                        createEncryptionHeader(
                                                "US-PHOENIX-1", VAULT_ID, MASTER_KEY_ID)))));
        assertEquals(0, provider.getAuthenticationProviderCalls);
    }

    @Test
    public void decryptingStreamAcceptsMatchingPinnedPrivateRegion() throws Exception {
        String privateRegion = "private.customer.example.com";
        KmsMasterKey pinnedKey = createMasterKey(privateRegion, VAULT_ID, MASTER_KEY_ID);
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider(pinnedKey, null);
        DecryptionHandler handler = new DecryptionHandler(provider);

        assertNotNull(
                handler.getDecryptInputStream(
                        new ByteArrayInputStream(
                                createPayload(
                                        createEncryptionHeader(
                                                privateRegion, VAULT_ID, MASTER_KEY_ID)))));
        assertEquals(0, provider.getAuthenticationProviderCalls);
    }

    @Test
    public void decryptOnlyProviderRejectsUnknownDottedRegionBeforeCreatingKey() {
        assertDiscoveryRejectedBeforeCreatingKey("attacker.example.com");
    }

    @Test
    public void decryptOnlyProviderRejectsUnknownRegionBeforeCreatingKey() {
        assertDiscoveryRejectedBeforeCreatingKey("unknown-region-1");
    }

    @Test
    public void decryptOnlyProviderRequiresMasterKeyId() {
        assertMissingMetadataRejected(
                createEncryptionHeader(REGION, VAULT_ID, null),
                "Encrypted blob master key ID is missing.");
    }

    @Test
    public void decryptOnlyProviderRequiresVaultId() {
        assertMissingMetadataRejected(
                createEncryptionHeader(REGION, "", MASTER_KEY_ID),
                "Encrypted blob vault ID is missing.");
    }

    @Test
    public void decryptOnlyProviderRequiresRegion() {
        assertMissingMetadataRejected(
                createEncryptionHeader(null, VAULT_ID, MASTER_KEY_ID),
                "Encrypted blob region is missing.");
    }

    @Test
    public void decryptRequiresKmsKeyMetadata() {
        assertMissingMetadataRejected(
                new EncryptionHeader(), "Encrypted blob KMS key metadata is missing.");
    }

    @Test
    public void decryptRejectsMissingEncryptionHeader() {
        assertMissingMetadataRejected(null, "Encrypted blob header is missing.");
    }

    @Test
    public void configFileProviderAllowsItsMatchingUnregisteredRegion() {
        String regionId = "config-file.private.example.com";
        Region configuredRegion = Region.registerFromConfigFileFallback(regionId, Realm.OC1);
        assertFalse(Region.resolveRegisteredRegion(regionId).isPresent());

        ConfigFileAuthenticationDetailsProvider authenticationDetailsProvider =
                mock(ConfigFileAuthenticationDetailsProvider.class);
        when(authenticationDetailsProvider.getRegion()).thenReturn(configuredRegion);

        Optional<Region> result =
                DecryptionHandler.getMatchingConfiguredRegion(
                        authenticationDetailsProvider, "CONFIG-FILE.PRIVATE.EXAMPLE.COM");

        assertTrue(result.isPresent());
        assertSame(configuredRegion, result.get());
        verify(authenticationDetailsProvider).getRegion();
    }

    @Test
    public void decryptOnlyProviderRejectsUnregisteredRegionWhenConfiguredRegionDiffers()
            throws Exception {
        String region = "configured-by-another-provider.example.com";
        Region.registerFromConfigFileFallback(region, Realm.OC1);
        ConfigFileAuthenticationDetailsProvider authenticationDetailsProvider =
                mock(ConfigFileAuthenticationDetailsProvider.class);
        when(authenticationDetailsProvider.getRegion()).thenReturn(Region.US_ASHBURN_1);
        CountingMasterKeyProvider provider =
                new CountingMasterKeyProvider(null, authenticationDetailsProvider);
        DecryptionHandler handler = new DecryptionHandler(provider);

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () ->
                                handler.getDecryptInputStream(
                                        new ByteArrayInputStream(
                                                createPayload(
                                                        createEncryptionHeader(
                                                                region,
                                                                VAULT_ID,
                                                                MASTER_KEY_ID)))));

        assertEquals(
                "Encrypted blob region is not registered with the SDK.", exception.getMessage());
        assertEquals(1, provider.getAuthenticationProviderCalls);
        verify(authenticationDetailsProvider).getRegion();
    }

    @Test
    public void sessionTokenProviderAllowsItsMatchingUnregisteredRegion() {
        String regionId = "session-token.private.example.com";
        Region configuredRegion = Region.registerFromConfigFileFallback(regionId, Realm.OC1);
        assertFalse(Region.resolveRegisteredRegion(regionId).isPresent());

        SessionTokenAuthenticationDetailsProvider authenticationDetailsProvider =
                mock(SessionTokenAuthenticationDetailsProvider.class);
        when(authenticationDetailsProvider.getRegion()).thenReturn(configuredRegion);

        Optional<Region> result =
                DecryptionHandler.getMatchingConfiguredRegion(
                        authenticationDetailsProvider, "SESSION-TOKEN.PRIVATE.EXAMPLE.COM");

        assertTrue(result.isPresent());
        assertSame(configuredRegion, result.get());
        verify(authenticationDetailsProvider).getRegion();
    }

    @Test
    public void sessionTokenProviderRejectsDifferentUnregisteredRegion() {
        String requestedRegion = "different-session-token.private.example.com";
        Region configuredRegion =
                Region.registerFromConfigFileFallback(
                        "configured-session-token.private.example.com", Realm.OC1);
        SessionTokenAuthenticationDetailsProvider authenticationDetailsProvider =
                mock(SessionTokenAuthenticationDetailsProvider.class);
        when(authenticationDetailsProvider.getRegion()).thenReturn(configuredRegion);

        assertFalse(
                DecryptionHandler.getMatchingConfiguredRegion(
                                authenticationDetailsProvider, requestedRegion)
                        .isPresent());
        verify(authenticationDetailsProvider).getRegion();
    }

    @Test
    public void decryptOnlyProviderDoesNotTrustRegionFromGenericRegionProvider() throws Exception {
        String region = "signer-only.private.example.com";
        Region fallbackRegion = Region.registerFromConfigFileFallback(region, Realm.OC1);
        BasicAuthenticationDetailsProvider authenticationDetailsProvider =
                mock(
                        BasicAuthenticationDetailsProvider.class,
                        withSettings().extraInterfaces(RegionProvider.class));
        when(((RegionProvider) authenticationDetailsProvider).getRegion())
                .thenReturn(fallbackRegion);
        CountingMasterKeyProvider provider =
                new CountingMasterKeyProvider(null, authenticationDetailsProvider);
        DecryptionHandler handler = new DecryptionHandler(provider);

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () ->
                                handler.decrypt(
                                        createPayload(
                                                createEncryptionHeader(
                                                        region, VAULT_ID, MASTER_KEY_ID))));

        assertEquals(
                "Encrypted blob region is not registered with the SDK.", exception.getMessage());
        verify((RegionProvider) authenticationDetailsProvider, never()).getRegion();
    }

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

    private static EncryptionHeader createEncryptionHeader(
            String region, String vaultId, String masterKeyId) {
        EncryptionHeader encryptionHeader = new EncryptionHeader();
        encryptionHeader.setEncryptionHeader(
                new EncryptionKey(region, vaultId, masterKeyId, "encrypted-data-key"),
                "AAAAAAAAAAAAAAAA",
                "");
        return encryptionHeader;
    }

    private static byte[] createPayload(EncryptionHeader encryptionHeader) throws Exception {
        byte[] header =
                Serialization.getObjectMapper()
                        .writeValueAsString(encryptionHeader)
                        .getBytes(StandardCharsets.UTF_8);
        ByteBuffer buffer = ByteBuffer.allocate(6 + header.length);
        buffer.putShort((short) 1);
        buffer.putInt(header.length);
        buffer.put(header);
        return buffer.array();
    }

    private static KmsMasterKey createMasterKey(String region, String vaultId, String masterKeyId) {
        KmsMasterKey masterKey = mock(KmsMasterKey.class);
        when(masterKey.getRegion()).thenReturn(region);
        when(masterKey.getVaultId()).thenReturn(vaultId);
        when(masterKey.getKmsMasterKeyId()).thenReturn(masterKeyId);
        when(masterKey.decryptDataKey("encrypted-data-key", masterKeyId))
                .thenReturn(Base64.getEncoder().encodeToString(new byte[32]));
        return masterKey;
    }

    private static void assertPinnedMetadataRejected(
            EncryptionHeader encryptionHeader, String expectedMessage) {
        KmsMasterKey pinnedKey = createMasterKey(REGION, VAULT_ID, MASTER_KEY_ID);
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider(pinnedKey, null);
        DecryptionHandler handler = new DecryptionHandler(provider);

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> handler.decrypt(createPayload(encryptionHeader)));

        assertEquals(expectedMessage, exception.getMessage());
        assertEquals(0, provider.getAuthenticationProviderCalls);
        verify(pinnedKey, never()).decryptDataKey(anyString(), anyString());
    }

    private static void assertDiscoveryRejectedBeforeCreatingKey(String region) {
        BasicAuthenticationDetailsProvider authenticationDetailsProvider =
                mock(BasicAuthenticationDetailsProvider.class);
        CountingMasterKeyProvider provider =
                new CountingMasterKeyProvider(null, authenticationDetailsProvider);
        DecryptionHandler handler = new DecryptionHandler(provider);

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () ->
                                handler.decrypt(
                                        createPayload(
                                                createEncryptionHeader(
                                                        region, VAULT_ID, MASTER_KEY_ID))));

        assertEquals(
                "Encrypted blob region is not registered with the SDK.", exception.getMessage());
        assertEquals(1, provider.getAuthenticationProviderCalls);
    }

    private static void assertMissingMetadataRejected(
            EncryptionHeader encryptionHeader, String expectedMessage) {
        CountingMasterKeyProvider provider = new CountingMasterKeyProvider();
        DecryptionHandler handler = new DecryptionHandler(provider);

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> handler.decrypt(createPayload(encryptionHeader)));

        assertEquals(expectedMessage, exception.getMessage());
        assertEquals(0, provider.getMasterKeyCalls);
        assertEquals(0, provider.getAuthenticationProviderCalls);
    }

    private static final class CountingMasterKeyProvider
            implements MasterKeyProvider<AbstractAuthenticationDetailsProvider> {
        private final MasterKey masterKey;
        private final AbstractAuthenticationDetailsProvider authenticationDetailsProvider;
        private int getMasterKeyCalls = 0;
        private int getAuthenticationProviderCalls = 0;

        private CountingMasterKeyProvider() {
            this(null, null);
        }

        private CountingMasterKeyProvider(
                MasterKey masterKey,
                AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            this.masterKey = masterKey;
            this.authenticationDetailsProvider = authenticationDetailsProvider;
        }

        @Override
        public MasterKey getMasterKey() {
            getMasterKeyCalls++;
            return masterKey;
        }

        @Override
        public AbstractAuthenticationDetailsProvider getAuthenticationProvider() {
            getAuthenticationProviderCalls++;
            return authenticationDetailsProvider;
        }

        @Override
        public CryptoAlgorithm getCryptoAlgorithm() {
            return CryptoAlgorithm.AES_256_GCM_IV12_TAG16;
        }
    }
}
