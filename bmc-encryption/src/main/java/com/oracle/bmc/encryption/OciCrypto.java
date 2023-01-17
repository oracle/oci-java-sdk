/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.encryption.internal.DecryptionHandler;
import com.oracle.bmc.encryption.internal.EncryptionHandler;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * This is the starting point in the OCI Encryption SDK. All encryption and decryption operations
 * should be used from this class.
 *
 * <p>It allows the user to encrypt/decrypt streams using: createEncryptingStream(MasterKeyProvider
 * masterKeyProvider, final InputStream inputStream) createDecryptingStream(MasterKeyProvider
 * masterKeyProvider, final InputStream inputStream)
 *
 * <p>Or encrypt/decrypt text strings using: encryptData(MasterKeyProvider masterKeyProvider, final
 * byte[] data) decryptData(MasterKeyProvider masterKeyProvider, final byte[] data)
 *
 * <p>OciCrypto uses the {@code MasterKeyProvider} to determine which {@code MasterKeys} should be
 * used to encrypt the {@code DataKey}. The master key is used to generate a data encryption key
 * which is used to encrypt the data.
 *
 * <p>The returned encrypted data includes a header containing various metadata that allows it to be
 * decrypted by the OCI Java SDK and other OCI SDKs that support client side encryption.
 *
 * <p>The default encryption algorithm used is AES/GCM. GCM is a secure authenticated encryption
 * algorithm. The max data size that can be encrypted using the Javax.crypto library is 2GB
 * (2147483647 bytes). GCM verifies the authentication tag upon decryption. This requires buffering
 * the entire payload into memory before returning it. To avoid out of memory errors during
 * decryption, ensure that you allocate Java virtual memory four times the data size that needs to
 * be decrypted. For example, use 8GB VM (-Xmx8G) to decrypt a 2GB file.
 */
public final class OciCrypto {
    public OciCrypto() {}

    /**
     * Creates a new CryptoInputStream that allows reading data from the encrypted stream under the
     * provided master key. Note: The max data size that can be encrypted is 2GB.
     *
     * @param masterKeyProvider A MasterKeyProvider to use for decrypting the data.
     * @param inputStream The stream to be encrypt.
     * @return OciCryptoInputStream
     */
    public OciCryptoInputStream createEncryptingStream(
            MasterKeyProvider masterKeyProvider, final InputStream inputStream) {
        return createEncryptingStream(masterKeyProvider, inputStream, null);
    }

    /**
     * Creates a new CryptoInputStream that allows reading data from the encrypted stream under the
     * provided master key. Note: The max data size that can be encrypted is 2GB.
     *
     * @param masterKeyProvider A MasterKeyProvider to use for encrypting the data.
     * @param inputStream The stream to be encrypt.
     * @param context Optional additional data to be provided as input to authenticated encryption
     *     algorithms. Map Keys may NO match the prefix oci-* as that namespace is reserved for OCI
     *     internal keys that may be added to the AAD.
     * @return OciCryptoInputStream
     */
    public OciCryptoInputStream createEncryptingStream(
            MasterKeyProvider masterKeyProvider,
            final InputStream inputStream,
            Map<String, String> context) {
        EncryptionHandler crypto = new EncryptionHandler(masterKeyProvider);
        return crypto.getEncryptInputStream(inputStream, context).getResult();
    }

    /**
     * Creates a new CryptoInputStream that allows reading decrypted data from the underlying
     * encrypted stream.
     *
     * @param masterKeyProvider A MasterKeyProvider to use for decrypting the data.
     * @param inputStream The stream to decrypt.
     * @return OciCryptoInputStream
     * @throws IOException when an input stream read error occurs.
     */
    public OciCryptoInputStream createDecryptingStream(
            MasterKeyProvider masterKeyProvider, final InputStream inputStream) throws IOException {
        DecryptionHandler crypto = new DecryptionHandler(masterKeyProvider);
        return crypto.getDecryptInputStream(inputStream).getResult();
    }

    /**
     * Encrypts data.
     *
     * @param masterKeyProvider A MasterKeyProvider to use for encrypting the data.
     * @param data The data to encrypt.
     * @return OciCryptoResult
     * @throws IOException when a stream write error occurs.
     */
    public OciCryptoResult encryptData(MasterKeyProvider masterKeyProvider, final byte[] data)
            throws IOException {
        return encryptData(masterKeyProvider, data, null);
    }

    /**
     * Encrypts data.
     *
     * @param masterKeyProvider A MasterKeyProvider to use for encrypting the data.
     * @param data The data to encrypt.
     * @param context Optional additional data to be provided as input to authenticated encryption
     *     algorithms. Map Keys may NO match the prefix oci-* as that namespace is reserved for OCI
     *     internal keys that may be added to the AAD.
     * @return OciCryptoResult
     * @throws IOException when a stream write error occurs.
     */
    public OciCryptoResult encryptData(
            MasterKeyProvider masterKeyProvider,
            final byte[] data,
            final Map<String, String> context)
            throws IOException {
        EncryptionHandler crypto = new EncryptionHandler(masterKeyProvider);
        return crypto.encrypt(data, context);
    }

    /**
     * Decrypts data.
     *
     * @param masterKeyProvider A MasterKeyProvider to use for decrypting the data.
     * @param data The data to decrypt.
     * @return OciCryptoResult
     * @throws IOException when a stream write error occurs.
     */
    public OciCryptoResult decryptData(MasterKeyProvider masterKeyProvider, final byte[] data)
            throws IOException {
        DecryptionHandler crypto = new DecryptionHandler(masterKeyProvider);
        return crypto.decrypt(data);
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OciCrypto)) return false;
        final OciCrypto other = (OciCrypto) o;
        return true;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "OciCrypto()";
    }
}
