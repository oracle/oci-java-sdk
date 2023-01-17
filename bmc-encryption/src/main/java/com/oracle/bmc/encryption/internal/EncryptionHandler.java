/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.encryption.MasterKeyProvider;
import com.oracle.bmc.encryption.OciCryptoInputStream;
import com.oracle.bmc.encryption.OciCryptoResult;

public class EncryptionHandler extends CipherHandler {
    private final SerializeHeader serializeHeader;

    public EncryptionHandler(MasterKeyProvider provider) {
        super(provider);
        if (provider.getMasterKey() == null) {
            throw new IllegalArgumentException(
                    "Encryption Key info is missing in KmsMasterKey. Provide the vaultID and masterKeyID in KmsMasterKey.");
        }
        serializeHeader = new SerializeHeader(provider);
    }

    private SecretKeySpec generateSecretKeySpec(DataKey dataKey) {
        byte[] secretKeyBytes = AuthUtils.base64Decode(dataKey.getPlaintext());
        return new SecretKeySpec(secretKeyBytes, provider.getCryptoAlgorithm().getAlgorithm());
    }

    public WithEncryptionHeader<OciCryptoInputStream> getEncryptInputStream(
            final InputStream inputStream, final Map<String, String> context) {
        DataKey dataKey = super.generateDataKey();
        EncryptionHeader encryptionHeader =
                serializeHeader.createHeader(dataKey, super.generateIV(), context);
        Cipher cipher =
                initCipher(Cipher.ENCRYPT_MODE, generateSecretKeySpec(dataKey), encryptionHeader);
        return new WithEncryptionHeader<>(
                new EncryptionStream(inputStream, cipher, encryptionHeader), encryptionHeader);
    }

    public OciCryptoResult encrypt(byte[] data, final Map<String, String> context)
            throws IOException {
        DataKey dataKey = super.generateDataKey();
        EncryptionHeader encryptionHeader =
                serializeHeader.createHeader(dataKey, super.generateIV(), context);

        Cipher cipher =
                initCipher(Cipher.ENCRYPT_MODE, generateSecretKeySpec(dataKey), encryptionHeader);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(encryptionHeader.getHeaderBytes());

        try {
            outputStream.write(cipher.doFinal(data));
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            throw new RuntimeException(e);
        }
        return new OciCryptoResult(outputStream.toByteArray(), encryptionHeader);
    }
}
