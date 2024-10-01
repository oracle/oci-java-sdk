/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * Derives the secret key used for <a
 * href="https://www.openssl.org/docs/man3.1/man3/EVP_BytesToKey.html">OpenSSL style encryption.</a>
 *
 * <ul>
 *   <li>By default the message digest algorithm used is MD5 :(
 *   <li>The iteration count is 1
 *   <li>A digest of the password and a random 8 byte salt is produced
 *   <li>The digest is repeatedly generated until sufficient bytes have been generated for the
 *       specified key size
 * </ul>
 *
 * @see <a
 *     href="https://github.com/openssl/openssl/blob/4a6f70c03182b421d326831532edca32bcdb3fb1/crypto/evp/evp_key.c#L78">EVP_BytesToKey
 *     source code</a>
 */
class OpenSslPbeSecretKeyGenerator {

    private final MessageDigest digest;
    private final byte[] password;
    private final byte[] salt;

    private final int keyLength;

    private OpenSslPbeSecretKeyGenerator(Builder builder) {
        digest = builder.digest;
        password = builder.password;
        salt = builder.salt;
        keyLength = builder.keyLength;
    }

    private static byte[] toBytes(char[] chars) {
        CharBuffer charBuffer = CharBuffer.wrap(chars);
        ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(charBuffer);
        byte[] bytes =
                Arrays.copyOfRange(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        Eraser.erase(byteBuffer); // clear sensitive data
        return bytes;
    }

    static Builder builder() {
        return new Builder();
    }

    byte[] generate() {
        int bytesNeeded = keyLength / 8;
        byte[] key = new byte[bytesNeeded];
        int offset = 0;

        for (; ; ) {
            digest.update(password, 0, password.length);
            digest.update(salt, 0, salt.length);

            final byte[] digested = digest.digest();

            int len = (bytesNeeded > digested.length) ? digested.length : bytesNeeded;
            System.arraycopy(digested, 0, key, offset, len);
            offset += len;

            // check if we need any more
            bytesNeeded -= len;
            if (bytesNeeded == 0) {
                break;
            }

            // do another round
            digest.reset();
        }

        return key;
    }

    static final class Builder {
        private MessageDigest digest;
        private byte[] password;
        private byte[] salt;
        private int keyLength;

        private Builder() {
            try {
                this.digest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e);
            }
        }

        Builder digest(MessageDigest digest) {
            this.digest = digest;
            return this;
        }

        Builder password(char[] password) {
            this.password = toBytes(password);
            return this;
        }

        Builder salt(byte[] salt) {
            this.salt = salt;
            return this;
        }

        Builder keyLength(int keyLength) {
            this.keyLength = keyLength;
            return this;
        }

        OpenSslPbeSecretKeyGenerator build() {
            return new OpenSslPbeSecretKeyGenerator(this);
        }
    }
}
