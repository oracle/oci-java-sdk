/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import com.oracle.bmc.util.StreamUtils;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPrivateKey;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertNull;

/** Tests for {@link PEMFileRSAPrivateKeySupplierTest}. */
public class PEMFileRSAPrivateKeySupplierTest {

    private static final char[] INCORRECT_PASSPHRASE = "incorrect_passphrase".toCharArray();

    private static final char[] CORRECT_PASSPHRASE =
            "aWCTJPET9fL7UBTp97hX99gdofeWKUf5tuxSuJeST2sEkyvkyinrfrj6EiSUTErF".toCharArray();

    @Test(expected = IllegalArgumentException.class)
    public void ctor_invalidFile() throws IOException {
        InputStream notAPem = new ByteArrayInputStream(new byte[0]);
        // not a valid key file
        new PEMFileRSAPrivateKeySupplier(notAPem, null);
        fail("Should have thrown an IllegalArgumentException");
    }

    /** Test PKCS#1 encrypted parsing */
    @Test
    public void testSupplyKeyPKCS1() throws IOException {

        String pkcs1EncryptedPrivateKey =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs1_encrypted_private_key.pem"),
                        StandardCharsets.UTF_8);

        InputStream pkcs1EncryptedPrivateKeyStream =
                new ByteArrayInputStream(pkcs1EncryptedPrivateKey.getBytes(StandardCharsets.UTF_8));

        String pkcs1DecryptedPrivateKey =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs1_decrypted_private_key.pem"),
                        StandardCharsets.UTF_8);
        InputStream pkcs1DecryptedPrivateKeyStream =
                new ByteArrayInputStream(pkcs1DecryptedPrivateKey.getBytes(StandardCharsets.UTF_8));

        Optional<RSAPrivateKey> encryptedKey =
                new PEMFileRSAPrivateKeySupplier(pkcs1EncryptedPrivateKeyStream, CORRECT_PASSPHRASE)
                        .supplyKey();
        assertTrue(encryptedKey.isPresent());
        assertTrue(encryptedKey.get() instanceof RSAPrivateKey);

        Optional<RSAPrivateKey> decryptedKey =
                new PEMFileRSAPrivateKeySupplier(pkcs1DecryptedPrivateKeyStream, null).supplyKey();
        assertTrue(decryptedKey.isPresent());
        assertTrue(decryptedKey.get() instanceof RSAPrivateKey);

        assertEquals(decryptedKey.get(), encryptedKey.get());
    }

    /** Test PKCS#8 encrypted parsing */
    @Test
    public void testSupplyKeyPKCS8() throws IOException {

        String pkcs8EncryptedPrivateKey =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs8_encrypted_private_key.pem"),
                        StandardCharsets.UTF_8);

        InputStream pkcs8EncryptedPrivateKeyStream =
                new ByteArrayInputStream(pkcs8EncryptedPrivateKey.getBytes(StandardCharsets.UTF_8));
        // When representing the same RSA private key, the decrypted key for PKCS#1 and PKCS#8
        // contains the same underlying key material like modulus, private exponent. Hence, PKCS#1
        // decrypted key is used
        String pkcs8DecryptedPrivateKey =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs1_decrypted_private_key.pem"),
                        StandardCharsets.UTF_8);
        InputStream pkcs8DecryptedPrivateKeyStream =
                new ByteArrayInputStream(pkcs8DecryptedPrivateKey.getBytes(StandardCharsets.UTF_8));

        Optional<RSAPrivateKey> encryptedKey =
                new PEMFileRSAPrivateKeySupplier(pkcs8EncryptedPrivateKeyStream, CORRECT_PASSPHRASE)
                        .supplyKey();
        assertTrue(encryptedKey.isPresent());
        assertTrue(encryptedKey.get() instanceof RSAPrivateKey);

        Optional<RSAPrivateKey> decryptedKey =
                new PEMFileRSAPrivateKeySupplier(pkcs8DecryptedPrivateKeyStream, null).supplyKey();
        assertTrue(decryptedKey.isPresent());
        assertTrue(decryptedKey.get() instanceof RSAPrivateKey);

        assertEquals(decryptedKey.get(), encryptedKey.get());
    }

    /** Test PKCS#1 key with invalid passphrase */
    @Test()
    public void testSupplyKeyPKCS1IncorrectPassphrase() {

        try {
            String pkcs1EncryptedPrivateKey =
                    StreamUtils.toString(
                            new FileInputStream(
                                    "src/test/resources/pkcs1_encrypted_private_key.pem"),
                            StandardCharsets.UTF_8);

            InputStream pkcs1EncryptedPrivateKeyStream =
                    new ByteArrayInputStream(
                            pkcs1EncryptedPrivateKey.getBytes(StandardCharsets.UTF_8));

            new PEMFileRSAPrivateKeySupplier(pkcs1EncryptedPrivateKeyStream, INCORRECT_PASSPHRASE);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals("The provided passphrase is incorrect.", e.getMessage());
        }
    }

    /** Test PKCS#8 key with invalid passphrase */
    @Test()
    public void testSupplyKeyPKCS8IncorrectPassphrase() {

        try {
            String pkcs8EncryptedPrivateKey =
                    StreamUtils.toString(
                            new FileInputStream(
                                    "src/test/resources/pkcs8_encrypted_private_key.pem"),
                            StandardCharsets.UTF_8);

            InputStream pkcs8EncryptedPrivateKeyStream =
                    new ByteArrayInputStream(
                            pkcs8EncryptedPrivateKey.getBytes(StandardCharsets.UTF_8));

            new PEMFileRSAPrivateKeySupplier(pkcs8EncryptedPrivateKeyStream, INCORRECT_PASSPHRASE);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals("The provided passphrase is incorrect.", e.getMessage());
        }
    }

    /** Test PKCS#1 key with no passphrase */
    @Test()
    public void testSupplyKeyPKCS1NoPassphrase() {

        try {
            String pkcs1EncryptedPrivateKey =
                    StreamUtils.toString(
                            new FileInputStream(
                                    "src/test/resources/pkcs1_encrypted_private_key.pem"),
                            StandardCharsets.UTF_8);

            InputStream pkcs1EncryptedPrivateKeyStream =
                    new ByteArrayInputStream(
                            pkcs1EncryptedPrivateKey.getBytes(StandardCharsets.UTF_8));

            new PEMFileRSAPrivateKeySupplier(pkcs1EncryptedPrivateKeyStream, null);
            assert false : "The test should fail with IllegalArgumentException";
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals("The provided passphrase is incorrect.", e.getMessage());
        }
    }

    /** Test PKCS#8 key with no passphrase */
    @Test()
    public void testSupplyKeyPKCS8NoPassphrase() {

        try {
            String pkcs8EncryptedPrivateKey =
                    StreamUtils.toString(
                            new FileInputStream(
                                    "src/test/resources/pkcs8_encrypted_private_key.pem"),
                            StandardCharsets.UTF_8);

            InputStream pkcs8EncryptedPrivateKeyStream =
                    new ByteArrayInputStream(
                            pkcs8EncryptedPrivateKey.getBytes(StandardCharsets.UTF_8));

            new PEMFileRSAPrivateKeySupplier(pkcs8EncryptedPrivateKeyStream, null);
            assert false : "The test should fail with IllegalArgumentException";
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals("The provided passphrase is incorrect.", e.getMessage());
        }
    }

    /** Test failure with invalid key */
    @Test
    public void testSupplyKeyIncorrectPEMFormat() {
        try {
            InputStream invalidInputStream =
                    new ByteArrayInputStream("invalid key data".getBytes());
            new PEMFileRSAPrivateKeySupplier(invalidInputStream, null);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals("Private key must be in PEM format", e.getMessage());
        }
    }

    /** Test failure with public key */
    @Test
    public void testSupplyKeyPublicKey() {
        try {
            String pkcs1PublicKey =
                    StreamUtils.toString(
                            new FileInputStream("src/test/resources/pkcs1_public_key.pem"),
                            StandardCharsets.UTF_8);

            InputStream pkcs1PublicKeyStream =
                    new ByteArrayInputStream(pkcs1PublicKey.getBytes(StandardCharsets.UTF_8));
            new PEMFileRSAPrivateKeySupplier(pkcs1PublicKeyStream, null);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals("Private key must be in PEM format", e.getMessage());
        }
    }

    /** Thread interruption should not stop the decryption */
    @Test
    public void testClosedByInterruptException() throws IOException, InterruptedException {

        String pkcs8DecryptedPrivateKey =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs1_decrypted_private_key.pem"),
                        StandardCharsets.UTF_8);
        InputStream pkcs8DecryptedPrivateKeyStream =
                new ByteArrayInputStream(pkcs8DecryptedPrivateKey.getBytes(StandardCharsets.UTF_8));

        // Create a thread that attempts to read the private key
        AtomicReference<Exception> threadException = new AtomicReference<>();

        Thread t1 =
                new Thread(
                        () -> {
                            try {
                                new PEMFileRSAPrivateKeySupplier(
                                                pkcs8DecryptedPrivateKeyStream, null)
                                        .supplyKey();
                            } catch (Exception e) {
                                threadException.set(e);
                            }
                        });
        t1.setName("first-thread");

        t1.start();
        t1.interrupt();
        t1.join();
        assertNull(threadException.get());
    }
}
