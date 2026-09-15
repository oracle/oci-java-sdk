/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import javax.crypto.Cipher;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.encryption.*;

public class DecryptionHandler extends CipherHandler {
    private final SerializeHeader serializeHeader;
    private final MasterKeyProvider provider;

    public DecryptionHandler(MasterKeyProvider provider) {
        super(provider);
        this.provider = provider;
        serializeHeader = new SerializeHeader(provider);
    }

    public WithEncryptionHeader<OciCryptoInputStream> getDecryptInputStream(
            final InputStream inputStream) throws IOException {
        EncryptionHeader encryptionHeader = serializeHeader.readHeader(inputStream);
        KmsMasterKey kmsMasterKey = createDecryptionKmsMasterKey(encryptionHeader);
        Cipher cipher =
                initCipher(
                        Cipher.DECRYPT_MODE,
                        super.getSecretKeySpec(encryptionHeader, kmsMasterKey),
                        encryptionHeader);
        return new WithEncryptionHeader<>(
                new DecryptionStream(inputStream, cipher, encryptionHeader), encryptionHeader);
    }

    public OciCryptoResult decrypt(byte[] dataWithHeader) throws IOException {
        ByteArrayInputStream decryptInputStream = new ByteArrayInputStream(dataWithHeader);
        EncryptionHeader encryptionHeader = serializeHeader.readHeader(decryptInputStream);
        KmsMasterKey kmsMasterKey = createDecryptionKmsMasterKey(encryptionHeader);
        Cipher cipher =
                initCipher(
                        Cipher.DECRYPT_MODE,
                        getSecretKeySpec(encryptionHeader, kmsMasterKey),
                        encryptionHeader);
        DecryptionStream inputStream =
                new DecryptionStream(decryptInputStream, cipher, encryptionHeader);
        return new OciCryptoResult(inputStream.decrypt(), encryptionHeader);
    }

    /**
     * If this key provider already has the requested KmsMasterKey, it will return it after
     * validating the encrypted blob metadata. If it does not have a representation of the
     * KmsMasterKey locally, it will attempt to retrieve it from KMS only when the blob region is
     * registered with the SDK or matches the provider's configured region.
     */
    private KmsMasterKey createDecryptionKmsMasterKey(EncryptionHeader encryptionHeader) {
        if (encryptionHeader == null) {
            throw new IllegalArgumentException("Encrypted blob header is missing.");
        }

        if (encryptionHeader.getEncryptedDataKeys() == null
                || encryptionHeader.getEncryptedDataKeys().isEmpty()
                || encryptionHeader.getEncryptionKey() == null) {
            throw new IllegalArgumentException("Encrypted blob KMS key metadata is missing.");
        }

        EncryptionKey encryptionKey = encryptionHeader.getEncryptionKey();
        validateRequiredMetadata(encryptionKey.getMasterKeyId(), "master key ID");
        validateRequiredMetadata(encryptionKey.getVaultId(), "vault ID");
        validateRequiredMetadata(encryptionKey.getRegion(), "region");

        KmsMasterKey kmsMasterKey = (KmsMasterKey) provider.getMasterKey();
        if (kmsMasterKey != null) {
            if (!kmsMasterKey.getKmsMasterKeyId().equals(encryptionKey.getMasterKeyId())) {
                throw new IllegalArgumentException(
                        "Encrypted blob master key ID does not match the configured KMS master key.");
            }
            if (!kmsMasterKey.getVaultId().equals(encryptionKey.getVaultId())) {
                throw new IllegalArgumentException(
                        "Encrypted blob vault ID does not match the configured KMS master key.");
            }
            if (!regionsMatch(kmsMasterKey.getRegion(), encryptionKey.getRegion())) {
                throw new IllegalArgumentException(
                        "Encrypted blob region does not match the configured KMS master key.");
            }
            return kmsMasterKey;
        }

        Optional<Region> resolvedRegion =
                Region.resolveRegionWithoutDefaultRealmFallback(encryptionKey.getRegion());
        BasicAuthenticationDetailsProvider authenticationDetailsProvider = null;
        if (!resolvedRegion.isPresent()) {
            authenticationDetailsProvider =
                    (BasicAuthenticationDetailsProvider) provider.getAuthenticationProvider();
            resolvedRegion =
                    getMatchingConfiguredRegion(
                            authenticationDetailsProvider, encryptionKey.getRegion());
        }

        Region region =
                resolvedRegion.orElseThrow(
                        () ->
                                new IllegalArgumentException(
                                        "Encrypted blob region is not registered with the SDK."));
        if (authenticationDetailsProvider == null) {
            authenticationDetailsProvider =
                    (BasicAuthenticationDetailsProvider) provider.getAuthenticationProvider();
        }
        return new KmsMasterKey(
                authenticationDetailsProvider,
                region.getRegionId(),
                encryptionKey.getVaultId(),
                encryptionKey.getMasterKeyId());
    }

    static Optional<Region> getMatchingConfiguredRegion(
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            String requestedRegion) {
        Region configuredRegion;
        if (authenticationDetailsProvider instanceof ConfigFileAuthenticationDetailsProvider) {
            configuredRegion =
                    ((ConfigFileAuthenticationDetailsProvider) authenticationDetailsProvider)
                            .getRegion();
        } else if (authenticationDetailsProvider
                instanceof SessionTokenAuthenticationDetailsProvider) {
            configuredRegion =
                    ((SessionTokenAuthenticationDetailsProvider) authenticationDetailsProvider)
                            .getRegion();
        } else {
            return Optional.empty();
        }

        if (configuredRegion != null
                && configuredRegion.getRegionId().equalsIgnoreCase(requestedRegion)) {
            return Optional.of(configuredRegion);
        }
        return Optional.empty();
    }

    private static boolean regionsMatch(String configuredRegion, String blobRegion) {
        if (configuredRegion.equalsIgnoreCase(blobRegion)) {
            return true;
        }

        return Region.resolveRegisteredRegion(configuredRegion)
                .flatMap(
                        configured ->
                                Region.resolveRegisteredRegion(blobRegion).map(configured::equals))
                .orElse(false);
    }

    private static void validateRequiredMetadata(String value, String fieldName) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Encrypted blob " + fieldName + " is missing.");
        }
    }
}
