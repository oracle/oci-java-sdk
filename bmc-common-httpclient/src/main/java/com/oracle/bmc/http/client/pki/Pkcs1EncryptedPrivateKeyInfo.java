/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Pkcs1EncryptedPrivateKeyInfo implements AutoCloseable {
    private static final Pattern PKCS1_ALGORITHM_PATTERN = Pattern.compile("(...)-(...)-(...)");

    private final String transformation;
    private final int keySize;
    private final AlgorithmParameterSpec algParamSpec;
    private final byte[] salt;
    private final byte[] encoded;

    private Pkcs1EncryptedPrivateKeyInfo(Builder builder) {
        transformation = builder.transformation;
        keySize = builder.keySize;
        encoded = builder.encoded;
        final byte[] iv = builder.iv;
        salt = builder.salt == null ? Arrays.copyOf(iv, 8) : builder.salt;
        algParamSpec = new IvParameterSpec(builder.iv);
    }

    static Pkcs1EncryptedPrivateKeyInfo of(final Pem.Encryption encryption) {
        final String transformation =
                transformation(encryption.algorithm(), encryption.blockMode());
        final int keySize = encryption.keySize();
        final byte[] iv = encryption.iv();
        return builder().transformation(transformation).keySize(keySize).iv(iv).build();
    }

    private static String transformation(final String algorithmName, final String algorithmMode) {
        String blockMode = "CBC";
        String padding = "PKCS5Padding";

        // Figure out block mode and padding.
        if ("CFB".equals(algorithmMode)) {
            blockMode = "CFB";
            padding = "NoPadding";
        }
        if ("ECB".equals(algorithmMode)) {
            blockMode = "ECB";
        }
        if ("OFB".equals(algorithmMode)) {
            blockMode = "OFB";
            padding = "NoPadding";
        }

        final String transformation = algorithmName + "/" + blockMode + "/" + padding;

        return transformation;
    }

    static Pkcs1EncryptedPrivateKeyInfo of(final Utf8 content) {
        try (final Utf8 payload = Pem.Type.PKCS1_ENCRYPTED_PRIVATE_KEY.content(content)) {
            final Matcher matcher = Pem.Type.PKCS1_ENCRYPTED_HEADER_PATTERN.matcher(payload);
            if (matcher.matches()) {
                final String algorithm = matcher.group(1);
                final byte[] ivBytes = Hex.decode(matcher.group(2));
                final String base64 = matcher.group(3).replaceAll("\\s+", "");
                final Matcher algorithmMatcher = PKCS1_ALGORITHM_PATTERN.matcher(algorithm);
                if (algorithmMatcher.matches()) {
                    final String algorithmName = algorithmMatcher.group(1);
                    final int keySize = Integer.parseInt(algorithmMatcher.group(2));
                    final String algorithmMode = algorithmMatcher.group(3);

                    final String transformation = transformation(algorithmName, algorithmMode);
                    byte[] encoded = Base64.getDecoder().decode(base64);
                    return builder()
                            .transformation(transformation)
                            .keySize(keySize)
                            .iv(ivBytes)
                            .encoded(encoded)
                            .build();
                }
            }
            throw new PemException(new IllegalArgumentException());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    SecretKey secretKey(final char[] passphrase) {
        try {
            final PBEKeySpec spec = new PBEKeySpec(passphrase, salt, 1, keySize);
            final OpenSslPbeSecretKeyFactory keyFactory = new OpenSslPbeSecretKeyFactory();

            final byte[] key = keyFactory.generateSecret(spec).getEncoded();

            return new SecretKeySpec(key, Pem.Encryption.SUPPORTED_ENCRYPTION_ALGORITHM);
        } catch (InvalidKeySpecException e) {
            throw new PemException(e);
        }
    }

    String algorithmName() {
        return transformation;
    }

    AlgorithmParameterSpec getAlgParameters() {
        return algParamSpec;
    }

    byte[] encoded() {
        return encoded;
    }

    @Override
    public void close() {
        Eraser.erase(encoded);
    }

    static final class Builder {
        private String transformation;
        private int keySize;

        private byte[] iv;
        private byte[] salt;
        private byte[] encoded;

        private Builder() {
            transformation = "AES/CBC/PKCS5Padding";
            keySize = 128;
        }

        public Builder transformation(String transformation) {
            this.transformation = transformation;
            return this;
        }

        public Builder keySize(int keySize) {
            this.keySize = keySize;
            return this;
        }

        public Builder salt(byte[] salt) {
            this.salt = salt;
            return this;
        }

        public Builder iv(byte[] iv) {
            this.iv = iv;
            return this;
        }

        public Builder encoded(byte[] encoded) {
            this.encoded = encoded;
            return this;
        }

        public Pkcs1EncryptedPrivateKeyInfo build() {
            return new Pkcs1EncryptedPrivateKeyInfo(this);
        }
    }
}
