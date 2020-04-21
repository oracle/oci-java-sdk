/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.oracle.bmc.encryption.KmsMasterKey;
import com.oracle.bmc.encryption.MasterKeyProvider;
import lombok.Value;

public abstract class CipherHandler {
    protected final Cipher cipher;
    protected final MasterKeyProvider provider;

    public CipherHandler(MasterKeyProvider provider) {
        this.provider = provider;
        try {
            cipher = Cipher.getInstance(provider.getCryptoAlgorithm().getMode());
        } catch (final GeneralSecurityException ex) {
            throw new IllegalStateException("Faild to create GCM cipher algorithm", ex);
        }
    }

    protected byte[] generateIV() {
        byte[] iv = new byte[provider.getCryptoAlgorithm().getIvLen() * 8];
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        return iv;
    }

    protected DataKey generateDataKey() {
        return provider.getMasterKey().generateDataEncryptionKey(provider.getCryptoAlgorithm());
    }

    private SecretKeySpec generateSecretKeySpec(DataKey dataKey) {
        byte[] secretKeyBytes = Base64.getDecoder().decode(dataKey.getPlaintext());
        return new SecretKeySpec(secretKeyBytes, provider.getCryptoAlgorithm().getAlgorithm());
    }

    protected SecretKeySpec getSecretKeySpec(
            EncryptionHeader encryptionHeader, KmsMasterKey decryptionKmsMasterKey) {
        String decryptDataKey =
                decryptionKmsMasterKey.decryptDataKey(
                        encryptionHeader.getEncryptionKey().getEncryptedDataKey(),
                        encryptionHeader.getEncryptionKey().getMasterKeyId());
        byte[] secretKeyBytes = Base64.getDecoder().decode(decryptDataKey);
        return new SecretKeySpec(secretKeyBytes, provider.getCryptoAlgorithm().getAlgorithm());
    }

    public Cipher initCipher(
            int mode, SecretKeySpec dataKeySpec, EncryptionHeader encryptionHeader) {
        String context = encryptionHeader.getAdditionalAuthenticatedData();
        final AlgorithmParameterSpec spec =
                new GCMParameterSpec(
                        provider.getCryptoAlgorithm().getTagLen() * 8,
                        encryptionHeader.getIvBytes());
        try {
            cipher.init(mode, dataKeySpec, spec);
            if (context != null && !context.isEmpty()) {
                cipher.updateAAD(context.getBytes());
            }
        } catch (InvalidKeyException e) {
            throw new RuntimeException("Cipher.init Invalid Key.", e);
        } catch (InvalidAlgorithmParameterException e) {
            throw new RuntimeException("Cipher.init Invalid Algorithm Parameter.", e);
        }
        return cipher;
    }

    @Value
    public static class WithEncryptionHeader<T> {
        T result;
        EncryptionHeader encryptionHeader;
    }
}
