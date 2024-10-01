/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

import com.oracle.bmc.util.StreamUtils;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Unit tests for {@link Pem} */
public class PemTest {

    // PKCS1 -> BEGIN RSA PRIVATE KEY, PKCS8 -> BEGIN PRIVATE KEY
    private static String PKCS1_PRIVATE_KEY;

    private static String PKCS1_ENCRYPTED_PRIVATE_KEY;
    private static String X509_CERTIFICATE;

    private static String PKCS8_ENCRYPTED_PRIVATE_KEY;

    private static String PKCS1_DECRYPTED_PRIVATE_KEY;

    private static String X509_PUBLIC_KEY;

    private static String PKCS1_PUBLIC_KEY;
    private static final String CORRECT_PASSPHRASE =
            "aWCTJPET9fL7UBTp97hX99gdofeWKUf5tuxSuJeST2sEkyvkyinrfrj6EiSUTErF";
    private static final String INCORRECT_PASSPHRASE = "Th1s1sWr0ng";

    @BeforeClass
    public static void init() throws FileNotFoundException {
        PKCS1_PRIVATE_KEY =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs1_private_key.pem"),
                        StandardCharsets.UTF_8);
        PKCS1_ENCRYPTED_PRIVATE_KEY =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs1_encrypted_private_key.pem"),
                        StandardCharsets.UTF_8);
        X509_CERTIFICATE =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/x509_cert.pem"),
                        StandardCharsets.UTF_8);
        PKCS8_ENCRYPTED_PRIVATE_KEY =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs8_encrypted_private_key.pem"),
                        StandardCharsets.UTF_8);
        PKCS1_DECRYPTED_PRIVATE_KEY =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs1_decrypted_private_key.pem"),
                        StandardCharsets.UTF_8);
        X509_PUBLIC_KEY =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/x509_public_key.pem"),
                        StandardCharsets.UTF_8);
        PKCS1_PUBLIC_KEY =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/pkcs1_public_key.pem"),
                        StandardCharsets.UTF_8);
    }

    /** Test decoding and encoding an encrypted PKCS1 encoded private key */
    @Test
    public void testRoundTripPkcs1PrivateKey() {
        final PrivateKey privateKey = Pem.decoder().decodePrivateKey(Text.bytes(PKCS1_PRIVATE_KEY));
        final String serialized = Text.of(Pem.encoder().with(Pem.Format.LEGACY).encode(privateKey));

        assertEquals(PKCS1_PRIVATE_KEY, serialized);
    }

    /** Test decoding and encoding a certificate */
    @Test
    public void testRoundTripX509Certificate() {
        final Certificate certificate = Pem.decoder().decodeCertificate(X509_CERTIFICATE);
        final String serialized = Pem.encoder().encode(certificate);
        assertEquals(X509_CERTIFICATE, serialized);
    }

    /** Test decoding and encoding a certificate chain */
    @Test
    public void testRoundTripX509CertificateChain() {
        // a certificate chain is just N certificates concatenated together
        final String pemCertificateChain = X509_CERTIFICATE + "\n" + X509_CERTIFICATE;
        final Collection<? extends Certificate> certificateChain =
                Pem.decoder().decodeCertificateChain(pemCertificateChain);
        final String serialized = Pem.encoder().encode(certificateChain);
        assertEquals(pemCertificateChain, serialized);
    }

    /** Test decoding an encrypted PKCS8 encoded private key */
    @Test
    public void testEncryptedPkcs8PrivateKey() {
        try (final Pem.Passphrase passphrase =
                Pem.Passphrase.of(CORRECT_PASSPHRASE.toCharArray())) {
            final PrivateKey privateKey =
                    Pem.decoder()
                            .with(passphrase)
                            .decodePrivateKey(Text.bytes(PKCS8_ENCRYPTED_PRIVATE_KEY));
            final String serialized =
                    Text.of(Pem.encoder().with(Pem.Format.LEGACY).encode(privateKey));
            assertEquals(PKCS1_DECRYPTED_PRIVATE_KEY, serialized);
        }
    }

    /** Expect an incorrect passphrase to produce {@link PemEncryptionException} */
    @Test(expected = PemEncryptionException.class)
    public void testEncryptedPkcs8PrivateKeyIncorrectPassphrase() {
        try (final Pem.Passphrase passphrase =
                Pem.Passphrase.of(INCORRECT_PASSPHRASE.toCharArray())) {

            Pem.decoder()
                    .with(passphrase)
                    .decodePrivateKey(Text.bytes(PKCS8_ENCRYPTED_PRIVATE_KEY));
        }
    }

    /** Expect a missing passphrase to produce {@link PemEncryptedKeyException} */
    @Test(expected = PemEncryptedKeyException.class)
    public void testEncryptedPkcs8PrivateKeyNoPassphrase() {
        Pem.decoder().decodePrivateKey(Text.bytes(PKCS8_ENCRYPTED_PRIVATE_KEY));
    }

    /** Test decoding an encrypted PKCS1 encoded private key */
    @Test
    public void testEncryptedPkcs1PrivateKey() {
        try (final Pem.Passphrase passphrase =
                Pem.Passphrase.of(CORRECT_PASSPHRASE.toCharArray())) {
            final PrivateKey privateKey =
                    Pem.decoder()
                            .with(passphrase)
                            .decodePrivateKey(Text.bytes(PKCS1_ENCRYPTED_PRIVATE_KEY));
            final String serialized =
                    Text.of(Pem.encoder().with(Pem.Format.LEGACY).encode(privateKey));
            assertEquals(PKCS1_DECRYPTED_PRIVATE_KEY, serialized);
        }
    }

    /** Expect an incorrect passphrase to produce {@link PemEncryptionException} */
    @Test(expected = PemEncryptionException.class)
    public void testEncryptedPkcs1PrivateKeyIncorrectPassphrase() {
        try (final Pem.Passphrase passphrase =
                Pem.Passphrase.of(INCORRECT_PASSPHRASE.toCharArray())) {
            Pem.decoder()
                    .with(passphrase)
                    .decodePrivateKey(Text.bytes(PKCS1_ENCRYPTED_PRIVATE_KEY));
        }
    }

    /** Test decoding and encoding an X509 encoded public key */
    @Test
    public void testRoundTripX509PublicKey() {
        final PublicKey publicKey = Pem.decoder().decodePublicKey(X509_PUBLIC_KEY);
        final String serialized = Pem.encoder().encode(publicKey);
        assertEquals(X509_PUBLIC_KEY, serialized);
    }

    /** Test decoding and encoding a PKCS1 encoded public key */
    @Test
    public void testRoundTripPkcs1PublicKey() {
        final PublicKey publicKey = Pem.decoder().decodePublicKey(PKCS1_PUBLIC_KEY);
        final String serialized = Pem.encoder().with(Pem.Format.LEGACY).encode(publicKey);
        assertEquals(PKCS1_PUBLIC_KEY, serialized);
    }

    /**
     * Test decoding an encrypted private key, then encrypting it again and verify the decrypted
     * version of that matches the original
     */
    @Test
    @Ignore("Encrypted PKCS8 private key support not implemented")
    public void testEncryptPkcs8PrivateKey() {
        try (final Pem.Passphrase passphrase =
                Pem.Passphrase.of(CORRECT_PASSPHRASE.toCharArray())) {
            final Pem.Decoder decoder = Pem.decoder().with(passphrase);
            final PrivateKey privateKey =
                    decoder.decodePrivateKey(Text.bytes(PKCS8_ENCRYPTED_PRIVATE_KEY));
            final byte[] encrypted = Pem.encoder().with(passphrase).encode(privateKey);
            assertTrue(Utf8.of(encrypted).contains("----BEGIN ENCRYPTED PRIVATE KEY----"));
            final PrivateKey roundTripped = decoder.decodePrivateKey(encrypted);
            final String serialized =
                    Text.of(Pem.encoder().with(Pem.Format.LEGACY).encode(roundTripped));
            assertEquals(PKCS1_DECRYPTED_PRIVATE_KEY, serialized);
        }
    }

    /**
     * Test decoding an encrypted private key, then encrypting it again and verify the decrypted
     * version of that matches the original
     */
    @Test
    public void testEncryptPkcs1PrivateKey() {
        try (final Pem.Passphrase passphrase =
                Pem.Passphrase.of(CORRECT_PASSPHRASE.toCharArray())) {
            final Pem.Decoder decoder = Pem.decoder().with(passphrase);
            final PrivateKey privateKey =
                    decoder.decodePrivateKey(Text.bytes(PKCS1_ENCRYPTED_PRIVATE_KEY));
            final byte[] encrypted =
                    Pem.encoder().with(Pem.Format.LEGACY).with(passphrase).encode(privateKey);
            try (final Utf8 text = Utf8.of(encrypted)) {
                assertTrue(text.contains("----BEGIN RSA PRIVATE KEY----"));
                assertTrue(text.contains("DEK-Info:"));
            }
            final PrivateKey roundTripped = decoder.decodePrivateKey(encrypted);
            final String serialized =
                    Text.of(Pem.encoder().with(Pem.Format.LEGACY).encode(roundTripped));
            assertEquals(PKCS1_DECRYPTED_PRIVATE_KEY, serialized);
        }
    }
}
