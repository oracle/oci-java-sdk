/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.encryption.KmsMasterKey;
import com.oracle.bmc.encryption.MasterKeyProvider;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

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
        byte[] secretKeyBytes = AuthUtils.base64Decode(dataKey.getPlaintext());
        return new SecretKeySpec(secretKeyBytes, provider.getCryptoAlgorithm().getAlgorithm());
    }

    protected SecretKeySpec getSecretKeySpec(
            EncryptionHeader encryptionHeader, KmsMasterKey decryptionKmsMasterKey) {
        String decryptDataKey =
                decryptionKmsMasterKey.decryptDataKey(
                        encryptionHeader.getEncryptionKey().getEncryptedDataKey(),
                        encryptionHeader.getEncryptionKey().getMasterKeyId());
        byte[] secretKeyBytes = AuthUtils.base64Decode(decryptDataKey);
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

    public static final class WithEncryptionHeader<T> {
        private final T result;
        private final EncryptionHeader encryptionHeader;

        @java.beans.ConstructorProperties({"result", "encryptionHeader"})
        public WithEncryptionHeader(T result, EncryptionHeader encryptionHeader) {
            this.result = result;
            this.encryptionHeader = encryptionHeader;
        }

        public T getResult() {
            return this.result;
        }

        public EncryptionHeader getEncryptionHeader() {
            return this.encryptionHeader;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof WithEncryptionHeader)) return false;
            final WithEncryptionHeader<?> other = (WithEncryptionHeader<?>) o;
            final Object this$result = this.getResult();
            final Object other$result = other.getResult();
            if (this$result == null ? other$result != null : !this$result.equals(other$result))
                return false;
            final Object this$encryptionHeader = this.getEncryptionHeader();
            final Object other$encryptionHeader = other.getEncryptionHeader();
            if (this$encryptionHeader == null
                    ? other$encryptionHeader != null
                    : !this$encryptionHeader.equals(other$encryptionHeader)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $result = this.getResult();
            result = result * PRIME + ($result == null ? 43 : $result.hashCode());
            final Object $encryptionHeader = this.getEncryptionHeader();
            result =
                    result * PRIME
                            + ($encryptionHeader == null ? 43 : $encryptionHeader.hashCode());
            return result;
        }

        public String toString() {
            return "CipherHandler.WithEncryptionHeader(result="
                    + this.getResult()
                    + ", encryptionHeader="
                    + this.getEncryptionHeader()
                    + ")";
        }
    }
}
