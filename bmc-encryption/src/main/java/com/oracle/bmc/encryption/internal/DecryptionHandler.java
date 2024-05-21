/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.Cipher;

import com.oracle.bmc.auth.AuthenticationDetailsProvider;
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
     *  If this key provider already has the KMSMasterKey that was requested, it will return it.
     *  If it does not have a representation of the KMSMasterKey locally, it will attempt to
     *  retrieve it from KMS.
     */
    private KmsMasterKey createDecryptionKmsMasterKey(EncryptionHeader encryptionHeader) {
        KmsMasterKey kmsMasterKey = (KmsMasterKey) provider.getMasterKey();
        EncryptionKey encryptionKey = encryptionHeader.getEncryptionKey();
        if (kmsMasterKey == null
                || !kmsMasterKey.getVaultId().equals(encryptionKey.getVaultId())
                || !kmsMasterKey.getKmsMasterKeyId().equals(encryptionKey.getMasterKeyId())
                || !kmsMasterKey.getRegion().equals(encryptionKey.getRegion())) {
            return new KmsMasterKey(
                    (AuthenticationDetailsProvider) provider.getAuthenticationProvider(),
                    encryptionKey.getRegion(),
                    encryptionKey.getVaultId(),
                    encryptionKey.getMasterKeyId());
        } else {
            return (KmsMasterKey) provider.getMasterKey();
        }
    }
}
