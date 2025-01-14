/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * Services for working with PEM encoded private keys, public keys and certificates.
 *
 * <h3>Read a public key</h3>
 *
 * <pre>
 * PublicKey readPublicKey(Path path) {
 *  try (ReadableByteChannel pem = Files.newByteChannel(path)) {
 *   return Pem.decoder()
 *             .decodePublicKey(pem);
 *   }
 * }
 * </pre>
 *
 * <h3>Read an unencrypted private key</h3>
 *
 * <pre>
 * PrivateKey readPrivateKey(Path path) {
 *  try (ReadableByteChannel pem = Files.newByteChannel(path)) {
 *   return Pem.decoder()
 *             .decodePrivateKey(pem);
 *   }
 * }
 * </pre>
 *
 * <h3>Read an encrypted private key</h3>
 *
 * <pre>
 * PrivateKey readPrivateKey(Path path, char[] passphrase) {
 *  try (ReadableByteChannel pem = Files.newByteChannel(path)) {
 *   return Pem.decoder()
 *             .with(passphrase)
 *             .decodePrivateKey(pem);
 *   }
 * }
 * </pre>
 *
 * <h3>Write a public key</h3>
 *
 * <pre>
 * void writePublicKey(Path path,final PublicKey publicKey) {
 *  try (WritableByteChannel pem = Files.newByteChannel(path)) {
 *   return Pem.encoder()
 *             .write(pem,publicKey);
 *   }
 * }
 * </pre>
 *
 * <h3>Write an unencrypted private key</h3>
 *
 * <pre>
 * void writePrivateKey(Path path,final PrivateKey privateKey) {
 *  try (WritableByteChannel pem = Files.newByteChannel(path)) {
 *   return Pem.encoder()
 *             .write(pem,privateKey);
 *   }
 * }
 * </pre>
 *
 * <h3>Write an encrypted private key in PKCS1 format</h3>
 *
 * <pre>
 * void writePkcs1PrivateKey(Path path,final PrivateKey privateKey, char[] passphrase) {
 *  try (WritableByteChannel pem = Files.newByteChannel(path)) {
 *   return Pem.encoder()
 *             .with(Pem.Format.LEGACY)
 *             .with(passphrase)
 *             .write(pem,privateKey);
 *   }
 * }
 * </pre>
 */
public abstract class Pem {

    // Only RSA encryption is supported
    private static final String KEY_PAIR_ALGORITHM = "RSA";
    // Only X509 Certificates are supported
    private static final String CERTIFICATE_TYPE = "X509";

    private static final int PKCS8_PRIVATE_KEY_HEADER_SIZE = 26;
    private static final int X509_PUBLIC_KEY_HEADER_SIZE = 24;
    private static final Encoder ENCODER = new Encoder(Format.DEFAULT, null);
    private static final Decoder DECODER = decoder(CERTIFICATE_TYPE, KEY_PAIR_ALGORITHM);

    private Pem() {}

    private static Decoder decoder(final String certificateType, final String keyPairAlgorithm) {

        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(certificateType);
            KeyFactory keyFactory = KeyFactory.getInstance(keyPairAlgorithm);
            return new Decoder(certificateFactory, keyFactory, null);
        } catch (CertificateException | NoSuchAlgorithmException e) {
            throw new PemException(e);
        }
    }

    /**
     * Erase (zero out) the contents of a byte array
     *
     * @param bytes The byte array to erase
     */
    private static void erase(final byte[] bytes) {
        Eraser.erase(bytes);
    }

    /**
     * All Java private keys are PKCS8 encoded. This method converts them back to PKCS1 format, by
     * stripping the PKCS8 header.
     *
     * @param pkcs8 encoded bytes
     * @return PKCS1 encoded representation of the key
     * @see <a href="https://tls.mbed.org/kb/cryptography/asn1-key-structures-in-der-and-pem">ASN1
     *     key structures in DER and PEM</a>
     */
    private static byte[] asPkcs1PrivateKey(byte[] pkcs8) {
        return Arrays.copyOfRange(pkcs8, PKCS8_PRIVATE_KEY_HEADER_SIZE, pkcs8.length);
    }

    /**
     * All Java public keys are X509 encoded. This method converts them back to PKCS1 format, by
     * stripping the X509 header.
     *
     * @param x509 X509 encoded public key bytes
     * @return PKCS1 encoded representation of the key
     * @see <a href="https://tls.mbed.org/kb/cryptography/asn1-key-structures-in-der-and-pem">ASN1
     *     key structures in DER and PEM</a>
     */
    private static byte[] asPkcs1PublicKey(byte[] x509) {
        return Arrays.copyOfRange(x509, X509_PUBLIC_KEY_HEADER_SIZE, x509.length);
    }

    /**
     * Concatenate two byte arrays
     *
     * @param first The first array
     * @param second The second array
     * @return The concatenated array
     */
    private static byte[] join(final byte[] first, final byte[] second) {
        final byte[] bytes = new byte[first.length + second.length];
        System.arraycopy(first, 0, bytes, 0, first.length);
        System.arraycopy(second, 0, bytes, first.length, second.length);
        return bytes;
    }

    /**
     * Converts PKCS1 to X509 Public KeyInfo by adding an ASN.1 header to identify the algorithm
     * used to encode the payload (PKCS1 supports RSA only, X509 supports different algorithms).
     *
     * @param pkcs1 PKCS1 encoded bytes
     * @return X509 Public KeyInfo der encoded bytes
     */
    private static byte[] adaptPkcs1PublicKey(final byte[] pkcs1) {
        final int pkcs1Length = pkcs1.length;
        final int totalLength = pkcs1Length + 20;
        // because extra 0x00 padding byte?
        final int contentLength = pkcs1Length + 1;
        final byte[] pkcs8Header =
                new byte[] {
                    0x30,
                    (byte) 0x82,
                    (byte) ((totalLength >> 8) & 0xff),
                    (byte) (totalLength & 0xff),
                    0x30,
                    0xD,
                    0x6,
                    0x9,
                    0x2A,
                    (byte) 0x86,
                    0x48,
                    (byte) 0x86,
                    (byte) 0xF7,
                    0xD,
                    0x1,
                    0x1,
                    0x1,
                    0x5,
                    0x0,
                    0x3,
                    (byte) 0x82,
                    (byte) ((contentLength >> 8) & 0xff),
                    (byte) (contentLength & 0xff),
                    0x00
                };
        final byte[] pkcs8bytes = join(pkcs8Header, pkcs1);
        return pkcs8bytes;
    }

    /**
     * Converts PKCS1 to PKCS8 by adding an ASN.1 header to identify the algorithm used to encode
     * the payload (PKCS1 supports RSA only, PKCS8 supports different algorithms).
     *
     * @param pkcs1 PKCS1 encoded bytes
     * @return PKCS8 encoded bytes
     */
    private static byte[] adaptPkcs1PrivateKey(final byte[] pkcs1) {
        final int pkcs1Length = pkcs1.length;
        final int totalLength = pkcs1Length + 22;
        final byte[] pkcs8Header =
                new byte[] {
                    0x30,
                    (byte) 0x82,
                    (byte) ((totalLength >> 8) & 0xff),
                    (byte) (totalLength & 0xff),
                    0x2,
                    0x1,
                    0x0,
                    0x30,
                    0xD,
                    0x6,
                    0x9,
                    0x2A,
                    (byte) 0x86,
                    0x48,
                    (byte) 0x86,
                    (byte) 0xF7,
                    0xD,
                    0x1,
                    0x1,
                    0x1,
                    0x5,
                    0x0,
                    0x4,
                    (byte) 0x82,
                    (byte) ((pkcs1Length >> 8) & 0xff),
                    (byte) (pkcs1Length & 0xff)
                };
        final byte[] pkcs8bytes = join(pkcs8Header, pkcs1);
        return pkcs8bytes;
    }

    private static byte[] encryptPkcs1(byte[] der, Encryption encryption) {
        try (final Pkcs1EncryptedPrivateKeyInfo encryptedPrivateKeyInfo =
                Pkcs1EncryptedPrivateKeyInfo.of(encryption)) {
            return cryptPkcs1(
                    Cipher.ENCRYPT_MODE, der, encryptedPrivateKeyInfo, encryption.passphrase());
        }
    }

    private static byte[] cryptPkcs1(
            int mode,
            byte[] content,
            Pkcs1EncryptedPrivateKeyInfo encryptedPrivateKeyInfo,
            Passphrase passphrase) {
        try {
            final SecretKey secretKey = passphrase.map(encryptedPrivateKeyInfo::secretKey);
            final Cipher cipher = Cipher.getInstance(encryptedPrivateKeyInfo.algorithmName());
            cipher.init(mode, secretKey, encryptedPrivateKeyInfo.getAlgParameters());
            final byte[] result = cipher.doFinal(content);
            return result;
        } catch (NoSuchAlgorithmException
                | NoSuchPaddingException
                | InvalidKeyException
                | InvalidAlgorithmParameterException
                | IllegalBlockSizeException
                | BadPaddingException e) {
            throw new PemEncryptionException(e);
        }
    }

    /**
     * Return an encoder that does not encrypt private keys and formats private keys in PKCS8, and
     * public keys or certificates in X509.
     *
     * <p>To encode encrypted private keys call {@link Encoder#with(Encryption)}
     *
     * <p>To format private keys and public keys in PKCS1, call {@link Encoder#with(Format)} e.g.:
     *
     * <pre>
     *     Pem.Encoder encoder = Pem.encoder().with(Format.LEGACY);
     * </pre>
     *
     * @return Encoder instance
     */
    public static Encoder encoder() {
        return ENCODER;
    }

    /**
     * Return a decoder for certificates, public keys and unencrypted private keys.
     *
     * <p>To decode encrypted private keys call {@link Decoder#with(Passphrase)}.
     *
     * @return Decoder instance
     */
    public static Decoder decoder() {
        return DECODER;
    }

    /**
     * Denotes the specific syntax used for encoding public and private keys (Does not affect the
     * encoding of certificates)
     */
    public enum Format {
        /**
         * Encodes the public key or private key in PKCS1 format e.g. a legacy private key starts
         * with {@code -----BEGIN RSA PRIVATE KEY-----}
         */
        LEGACY,
        /** Encodes private keys in PKCS8 format and public keys in X509 public key format */
        DEFAULT
    }

    /** Denotes the type of content encoded in the PEM message */
    enum Type {
        PKCS1_PRIVATE_KEY("RSA PRIVATE KEY"),
        PKCS1_ENCRYPTED_PRIVATE_KEY("RSA PRIVATE KEY"),
        PKCS1_PUBLIC_KEY("RSA PUBLIC KEY"),
        PKCS8_ENCRYPTED_PRIVATE_KEY("ENCRYPTED PRIVATE KEY"),
        PKCS8_PRIVATE_KEY("PRIVATE KEY"),
        X509_PUBLIC_KEY("PUBLIC KEY"),
        X509_CERTIFICATE("CERTIFICATE");

        static final Pattern PKCS1_ENCRYPTED_HEADER_PATTERN =
                Pattern.compile(
                        "Proc-Type:\\s+\\d+,ENCRYPTED\\nDEK-Info:\\s+([A-Z1-9-]+),([0123456789ABCDEFabcdef]+)\\n(.*)",
                        Pattern.DOTALL | Pattern.MULTILINE);
        private final String prefix;
        private final String suffix;

        Type(final String identifier) {
            this.prefix = "-----BEGIN " + identifier + "-----";
            this.suffix = "-----END " + identifier + "-----";
        }

        /**
         * Determine the PEM encoding format used
         *
         * @param text The text encoded PEM data
         * @return The matching {@link Type}
         * @throws IllegalArgumentException if the text is not any of the supported PEM encodings
         */
        static Type typeOf(final Utf8 text) {
            for (final Type type : Type.values()) {
                if (text.contains(type.prefix) && text.contains(type.suffix)) {
                    if (type == PKCS1_PRIVATE_KEY && isEncryptedPkcs1(text)) {
                        return PKCS1_ENCRYPTED_PRIVATE_KEY;
                    }
                    return type;
                }
            }
            return null;
        }

        private static boolean isEncryptedPkcs1(Utf8 text) {
            final Utf8 content = PKCS1_PRIVATE_KEY.content(text);
            final Matcher matcher = PKCS1_ENCRYPTED_HEADER_PATTERN.matcher(content);
            return matcher.matches();
        }

        private String algorithmIdentifier(final Encryption encryption) {
            return encryption.algorithm()
                    + '-'
                    + encryption.keySize()
                    + '-'
                    + encryption.blockMode();
        }

        // Encrypted PKCS1 private key header
        private String pemHeader(final Encryption encryption) {
            String header =
                    "Proc-Type: 4,ENCRYPTED\n"
                            + "DEK-Info: "
                            + algorithmIdentifier(encryption)
                            + ","
                            + Hex.encode(encryption.iv())
                            + "\n";
            return header;
        }

        byte[] encode(byte[] payload, final Encryption encryption) {
            final StringBuilder text = new StringBuilder();
            text.append(prefix);
            text.append('\n');
            if (PKCS1_ENCRYPTED_PRIVATE_KEY == this) {
                final String pemHeader = pemHeader(encryption);
                text.append(pemHeader);

                payload = encryptPkcs1(payload, encryption);
            }
            final String encoded = Base64.getEncoder().encodeToString(payload);
            final int length = encoded.length();
            final int lineLength = 64;
            int start = 0;
            int end = start + lineLength;
            while (true) {
                if (!(start < length)) break;
                text.append(encoded, start, Math.min(length, end));
                text.append('\n');
                start = end;
                end = start + lineLength;
            }
            text.append(suffix);
            return text.toString().getBytes(StandardCharsets.UTF_8);
        }

        Utf8 content(final Utf8 text) {
            final int startDecl = text.indexOf(prefix);
            if (startDecl != -1) {
                // search for -----END ?????----- delimiter
                final int endDecl = text.indexOf(suffix, startDecl);
                if (endDecl != -1) {
                    final Utf8 content = text.subSequence(startDecl + prefix.length(), endDecl);
                    return content.trim();
                }
            }
            // didn't find a BEGIN, END  pair
            throw new IllegalArgumentException();
        }

        byte[] payload(final Utf8 text) {
            try (final Utf8 encodedText = content(text);
                    final Utf8 base64 = encodedText.removeWhitespace()) {
                final byte[] decoded = Base64.getDecoder().decode(base64.bytes());
                if (this == PKCS1_PRIVATE_KEY) {
                    return adaptPkcs1PrivateKey(decoded);
                } else if (this == PKCS1_PUBLIC_KEY) {
                    return adaptPkcs1PublicKey(decoded);
                }
                return decoded;
            }
        }

        boolean isEncrypted() {
            return this == PKCS1_ENCRYPTED_PRIVATE_KEY || this == PKCS8_ENCRYPTED_PRIVATE_KEY;
        }
    }

    /**
     * Holds a passphrase using a try-with-resources model to assure the passphrase plain-text is
     * erased once it has been used
     */
    public interface Passphrase extends Sensitive {

        /**
         * An instance that represents the absence of a passphrase
         *
         * @return Passphrase instance
         */
        static Passphrase none() {
            return NoPassphrase.instance();
        }

        /**
         * Produce a Passphrase for the specified character array. The caller is responsible for
         * erasing the contents of the supplied array.
         *
         * @param content The passphrase
         * @return Passphrase instance
         */
        static Passphrase of(final char[] content) {
            if (content == null) {
                return none();
            } else {
                return CharacterPassphrase.of(content);
            }
        }

        /** Must erase the contents of the passphrase */
        @Override
        void close();

        /**
         * Map the passphrase to an instance of the desired type
         *
         * @param mapper The mapping function
         * @return The mapped instance
         * @param <T> The instance type
         */
        <T> T map(Function<char[], T> mapper);
    }

    /** Configures how private keys are encrypted */
    public static class Encryption implements Sensitive {
        static final String SUPPORTED_ENCRYPTION_ALGORITHM = "AES";

        private static final Encryption NONE =
                new Encryption("NONE", 0, null, "NONE", Passphrase.none(), false);

        private static final SecureRandom PRNG = new SecureRandom();
        private final String algorithm;
        private final int keySize;
        private final byte[] iv;
        private final String blockMode;
        private final Passphrase passphrase;
        private final boolean ownsPassphrase;

        private Encryption(Builder builder) {
            this(
                    SUPPORTED_ENCRYPTION_ALGORITHM,
                    builder.keySize,
                    builder.iv,
                    builder.blockMode,
                    builder.passphrase,
                    builder.ownsPassphrase);
        }

        public Encryption(
                String algorithm,
                int keySize,
                byte[] iv,
                String blockMode,
                Passphrase passphrase,
                boolean ownsPassphrase) {
            this.algorithm = algorithm;
            this.keySize = keySize;
            this.iv = iv;
            this.blockMode = blockMode;
            this.passphrase = passphrase;
            this.ownsPassphrase = ownsPassphrase;
        }

        /**
         * Constant representing the absence of encryption
         *
         * @return Encryption instance
         */
        public static Encryption none() {
            return NONE;
        }

        /**
         * Build {@link Encryption} instances
         *
         * @return Builder instance
         */
        public static Builder builder() {
            return new Builder();
        }

        @Override
        public void close() {
            if (ownsPassphrase && passphrase != null) {
                passphrase.close();
            }
        }

        /**
         * The encryption algorithm
         *
         * @return Encryption algorithm name
         */
        public String algorithm() {
            return algorithm;
        }

        /**
         * The key size
         *
         * @return Key size in bits
         */
        public int keySize() {
            return keySize;
        }

        /**
         * The initialization vector
         *
         * @return Initialization vector
         */
        public byte[] iv() {
            return iv;
        }

        /**
         * The block mode
         *
         * @return The block mode name
         */
        public String blockMode() {
            return blockMode;
        }

        /**
         * The encryption passphrase
         *
         * @return The passphrase
         */
        public Passphrase passphrase() {
            return passphrase;
        }

        /** Build {@link Encryption} instances */
        public static final class Builder {
            private int keySize;
            private byte[] iv;
            private String blockMode;
            private Passphrase passphrase;
            private boolean ownsPassphrase;

            private transient SecureRandom entropy;

            private Builder() {
                keySize = 128;
                blockMode = "CBC";
                entropy = PRNG;
            }

            /**
             * The encryption key-size in bits, defaults to 128
             *
             * @param keySize The key size in bits
             * @return self
             */
            public Builder keySize(int keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * Configure the entropy source to use for generating an initialization vector, if none
             * explicitly specified
             *
             * @param entropy The source of random bytes
             * @return self
             */
            public Builder entropy(final SecureRandom entropy) {
                Objects.requireNonNull(entropy);
                this.entropy = entropy;
                return this;
            }

            /**
             * The initialization vector
             *
             * @param iv The initialization vector
             * @return self
             */
            public Builder iv(byte[] iv) {
                this.iv = iv;
                return this;
            }

            /**
             * The block mode, defaults to {@code CBC}
             *
             * @param blockMode The block mode
             * @return self
             */
            public Builder blockMode(String blockMode) {
                this.blockMode = blockMode;
                return this;
            }

            /**
             * The pass phrase
             *
             * @param passphrase The passphrase
             * @return self
             */
            public Builder passphrase(Passphrase passphrase) {
                this.passphrase = passphrase;
                return this;
            }

            /**
             * Indicate if this instance owns the passphrase (and therefore must close/erase it,
             * when this instance is closed)
             *
             * @param ownsPassphrase If true the instance will own the passphrase
             * @return self
             */
            public Builder ownsPassphrase(boolean ownsPassphrase) {
                this.ownsPassphrase = ownsPassphrase;
                return this;
            }

            /**
             * Configure the passphrase from a character array. The passphrase will be erased when
             * the {@link Encryption} instance is closed
             *
             * @param passphrase The pass phrase
             * @return self
             */
            public Builder passphrase(final char[] passphrase) {
                return passphrase(Passphrase.of(passphrase)).ownsPassphrase(true);
            }

            /**
             * Build the {@link Encryption} instance. If an initialization vector has not been
             * configured, then a random one is automatically generated
             *
             * @return Encryption instance
             */
            public Encryption build() {
                // Generate an IV if none specified
                if (iv == null) {
                    iv = new byte[keySize / 8];
                    entropy.nextBytes(iv);
                }
                return new Encryption(this);
            }
        }
    }

    /** Decodes PEM encoded text streams into the desired format */
    public static class Decoder {
        private final Passphrase passphrase;
        private final CertificateFactory certificateFactory;
        private final KeyFactory keyFactory;

        private Decoder(
                final CertificateFactory certificateFactory,
                final KeyFactory keyFactory,
                final Passphrase passphrase) {
            this.certificateFactory = certificateFactory;
            this.keyFactory = keyFactory;
            // Ignore the 'none' passphrase
            this.passphrase = passphrase == Passphrase.none() ? null : passphrase;
        }

        /**
         * Produce a decoder configured to use the specified passphrase for encrypted private keys
         *
         * @param passphrase The passphrase or null if no encrypted private keys will be decoded
         * @return Decoder instance
         */
        public Decoder with(final Passphrase passphrase) {
            return new Decoder(certificateFactory, keyFactory, passphrase);
        }

        /**
         * Decode an X509 certificate
         *
         * @param contents The PEM encoded form of the X509 certificate
         * @return Certificate instance
         */
        public Certificate decodeCertificate(final String contents) {
            try (final InputStream bytes =
                    new ByteArrayInputStream(contents.getBytes(StandardCharsets.UTF_8))) {
                return certificateFactory.generateCertificate(bytes);
            } catch (IOException | CertificateException e) {
                throw new PemException(e);
            }
        }

        /**
         * Decode an X509 certificate
         *
         * @param contents The PEM encoded form of the X509 certificate
         * @return Certificate instance
         */
        public Certificate decodeCertificate(final ReadableByteChannel contents) {
            try (final InputStream bytes = Channels.newInputStream(contents)) {
                return certificateFactory.generateCertificate(bytes);
            } catch (IOException | CertificateException e) {
                throw new PemException(e);
            }
        }

        /**
         * Decode an X509 certificate chain
         *
         * @param contents The PEM encoded certificate chain
         * @return Collection of Certificate instances
         */
        public Collection<? extends Certificate> decodeCertificateChain(final String contents) {
            try (final InputStream bytes =
                    new ByteArrayInputStream(contents.getBytes(StandardCharsets.UTF_8))) {
                return certificateFactory.generateCertificates(bytes);
            } catch (IOException | CertificateException e) {
                throw new PemException(e);
            }
        }

        /**
         * Decode an X509 certificate chain
         *
         * @param contents The PEM encoded certificate chain
         * @return Collection of Certificate instances
         */
        public Collection<? extends Certificate> decodeCertificateChain(
                final ReadableByteChannel contents) {
            try (final InputStream bytes = Channels.newInputStream(contents)) {
                return certificateFactory.generateCertificates(bytes);
            } catch (IOException | CertificateException e) {
                throw new PemException(e.getMessage(), e);
            }
        }

        private PrivateKey decodeUnencryptedPrivateKey(final Type type, final Utf8 content) {
            try {
                final byte[] der = type.payload(content);
                try {
                    final PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(der);
                    return keyFactory.generatePrivate(spec);
                } finally {
                    erase(der);
                }
            } catch (InvalidKeySpecException e) {
                throw new PemException(e.getMessage(), e);
            }
        }

        private PrivateKey decodeEncryptedPrivateKey(final Type type, final Utf8 content) {
            if (passphrase == null) {
                throw new PemEncryptedKeyException();
            }
            if (type == Type.PKCS1_ENCRYPTED_PRIVATE_KEY) {
                return decodeEncryptedPkcs1PrivateKey(content);
            } else {
                return decodeEncryptedPkcs8PrivateKey(content);
            }
        }

        private String algorithmName(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo) {
            final String pbeAlgName = encryptedPrivateKeyInfo.getAlgName();

            // For PBES2 retrieve details of the specific pbe algorithm (PRF and ES) from the
            // algorithm parameters
            if (pbeAlgName.equals("PBES2") || pbeAlgName.equals("1.2.840.113549.1.5.13")) {
                return encryptedPrivateKeyInfo.getAlgParameters().toString();
            } else {
                return pbeAlgName;
            }
        }

        private PrivateKey decodeEncryptedPkcs8PrivateKey(Utf8 content) {
            try {
                final byte[] der = Type.PKCS8_ENCRYPTED_PRIVATE_KEY.payload(content);
                try {
                    // configure decryption of the DER payload
                    final EncryptedPrivateKeyInfo encryptedPrivateKeyInfo =
                            new EncryptedPrivateKeyInfo(der);
                    final String algorithmName = algorithmName(encryptedPrivateKeyInfo);
                    final SecretKeyFactory secretKeyFactory =
                            SecretKeyFactory.getInstance(algorithmName);
                    final SecretKey secretKey =
                            secretKeyFactory.generateSecret(passphrase.map(PBEKeySpec::new));
                    final Cipher cipher = Cipher.getInstance(algorithmName);
                    cipher.init(
                            Cipher.DECRYPT_MODE,
                            secretKey,
                            encryptedPrivateKeyInfo.getAlgParameters());

                    // decrypt and generate the private key
                    final PrivateKey privateKey =
                            keyFactory.generatePrivate(encryptedPrivateKeyInfo.getKeySpec(cipher));
                    return privateKey;
                } finally {
                    erase(der);
                }
            } catch (NoSuchAlgorithmException
                    | InvalidKeySpecException
                    | NoSuchPaddingException
                    | InvalidAlgorithmParameterException
                    | InvalidKeyException
                    | IOException e) {
                throw new PemEncryptionException(e);
            }
        }

        private PrivateKey decodeEncryptedPkcs1PrivateKey(Utf8 content) {
            try (final Pkcs1EncryptedPrivateKeyInfo encryptedPrivateKeyInfo =
                    Pkcs1EncryptedPrivateKeyInfo.of(content)) {

                final byte[] pkcs1 =
                        cryptPkcs1(
                                Cipher.DECRYPT_MODE,
                                encryptedPrivateKeyInfo.encoded(),
                                encryptedPrivateKeyInfo,
                                passphrase);
                try {
                    final byte[] der = adaptPkcs1PrivateKey(pkcs1);
                    try {
                        final PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(der);
                        final PrivateKey privateKey = keyFactory.generatePrivate(spec);
                        return privateKey;
                    } finally {
                        erase(der);
                    }
                } finally {
                    erase(pkcs1);
                }
            } catch (InvalidKeySpecException e) {
                throw new PemEncryptionException(e);
            }
        }

        /**
         * Decode a private key. The private key is sensitive data, the caller is responsible for
         * ensuring the input stream is closed (and any backing storage is erased)
         *
         * @param bytes The PEM encoded private key as UTF-8 encoded byte stream
         * @return PrivateKey instance
         */
        public PrivateKey decodePrivateKey(final ReadableByteChannel bytes) throws IOException {
            try (final Utf8 content = Utf8.of(bytes)) {
                return decodePrivateKey(content);
            }
        }

        /**
         * Decode a private key. The private key is sensitive data and must be provided as a byte
         * array. The caller is responsible for erasing the byte array after use.
         *
         * @param contents The PEM encoded private key as UTF-8 encoded bytes
         * @return PrivateKey instance
         */
        public PrivateKey decodePrivateKey(final byte[] contents) {
            try (final Utf8 content = Utf8.of(contents)) {
                return decodePrivateKey(content);
            }
        }

        private PrivateKey decodePrivateKey(Utf8 content) {
            final Type type = Type.typeOf(content);
            if (type == null) {
                throw new IllegalArgumentException("Private key must be in PEM format");
            }
            if (type.isEncrypted()) {
                return decodeEncryptedPrivateKey(type, content);
            } else {
                return decodeUnencryptedPrivateKey(type, content);
            }
        }

        /**
         * Decode a public key
         *
         * @param contents The PEM encoded public key
         * @return PublicKey instance
         */
        public PublicKey decodePublicKey(final String contents) {
            try (final Utf8 content = Utf8.of(contents)) {
                final Type type = Type.typeOf(content);
                if (type != null) {
                    final byte[] der = type.payload(content);
                    final X509EncodedKeySpec spec = new X509EncodedKeySpec(der);
                    return keyFactory.generatePublic(spec);
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (InvalidKeySpecException e) {
                throw new PemException(e);
            }
        }

        /**
         * Decode a public key
         *
         * @param contents The PEM encoded public key
         * @return PublicKey instance
         */
        public PublicKey decodePublicKey(final ReadableByteChannel contents) {
            try (final Utf8 content = Utf8.of(contents)) {
                final Type type = Type.typeOf(content);
                if (type != null) {
                    final byte[] der = type.payload(content);
                    final X509EncodedKeySpec spec = new X509EncodedKeySpec(der);
                    return keyFactory.generatePublic(spec);
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (InvalidKeySpecException | IOException e) {
                throw new PemException(e);
            }
        }
    }

    // Represents the absence of a passphrase
    private static class NoPassphrase implements Passphrase {

        private static final NoPassphrase INSTANCE = new NoPassphrase();

        private NoPassphrase() {}

        static NoPassphrase instance() {
            return INSTANCE;
        }

        @Override
        public void close() {}

        @Override
        public <T> T map(Function<char[], T> mapper) {
            return null;
        }
    }

    private static class CharacterPassphrase implements Passphrase {
        private final char[] content;

        private CharacterPassphrase(final char[] content) {
            this.content = content;
        }

        static CharacterPassphrase of(final char[] content) {
            return new CharacterPassphrase(Arrays.copyOf(content, content.length));
        }

        @Override
        public void close() {
            // erase the array
            for (int i = 0; i < content.length; ++i) {
                content[i] = 0;
            }
        }

        @Override
        public <T> T map(Function<char[], T> mapper) {
            return mapper.apply(content);
        }
    }

    /** Encode certificates, public keys and private keys into PEM encoded format */
    public static class Encoder {

        private final Encryption encryption;
        private final Format format;

        private Encoder(final Format format, final Encryption encryption) {
            this.format = format;
            this.encryption = encryption == Encryption.none() ? null : encryption;
        }

        /**
         * Configure a new instance with the specified PKCS format. Note that the format applies to
         * private and public keys only. Certificates always use X509 PEM encoding.
         *
         * @param format The encoding format for public and private keys
         * @return Encoder instance
         */
        public Encoder with(final Format format) {
            return new Encoder(format, encryption);
        }

        /**
         * Configure an encoder to produce encrypted private keys.
         *
         * <p>Encryption does not apply to public keys or certificates
         *
         * @param encryption The encryption configuration, or null if no encryption is required
         * @return Encoder instance
         */
        public Encoder with(final Encryption encryption) {
            return new Encoder(format, encryption);
        }

        /**
         * Configure an encoder to produce encrypted private keys.
         *
         * <p>Encryption does not apply to public keys or certificates
         *
         * @param passphrase The encryption passphrase, or null if no encryption is required
         * @return Encoder instance
         */
        public Encoder with(final Passphrase passphrase) {
            if (passphrase == null) {
                return with(Encryption.none());
            } else {
                final Encryption encryption = Encryption.builder().passphrase(passphrase).build();
                return with(encryption);
            }
        }

        /**
         * Render a public key in PEM format using PKCS1
         *
         * @param publicKey The public key
         * @return PEM encoding of the public key in PKCS1 format
         */
        public String encode(final PublicKey publicKey) {
            final byte[] der = publicKey.getEncoded();
            if (format == Format.DEFAULT) {
                return Text.of(Type.X509_PUBLIC_KEY.encode(der, null));
            } else {
                final byte[] payload = asPkcs1PublicKey(der);
                return Text.of(Type.PKCS1_PUBLIC_KEY.encode(payload, null));
            }
        }

        /**
         * Render a certificate in PEM format
         *
         * @param certificate The certificate
         * @return PEM encoding of the certificate
         */
        public String encode(final Certificate certificate) {
            try {
                final byte[] payload = certificate.getEncoded();
                return Text.of(Type.X509_CERTIFICATE.encode(payload, null));
            } catch (CertificateEncodingException e) {
                throw new PemException(e);
            }
        }

        /**
         * Render a certificate chain in PEM format
         *
         * @param certificates The certificates
         * @return PEM encoding of the certificate chain
         */
        public String encode(final Iterable<? extends Certificate> certificates) {
            final StringBuilder text = new StringBuilder();
            final Iterator<? extends Certificate> items = certificates.iterator();
            while (items.hasNext()) {
                final Certificate certificate = items.next();
                text.append(encode(certificate));
                if (items.hasNext()) {
                    text.append('\n');
                }
            }
            return text.toString();
        }

        /**
         * Render a private key in PEM format. The private key is sensitive data and is returned as
         * a byte array. The caller is responsible for erasing the byte array after use.
         *
         * @param privateKey The private key
         * @return The PEM encoded private key as UTF-8 encoded bytes
         */
        public byte[] encode(final PrivateKey privateKey) {
            final byte[] der = privateKey.getEncoded();

            if (encryption == null) {
                if (format == Format.DEFAULT) {
                    return Type.PKCS8_PRIVATE_KEY.encode(der, null);
                } else {
                    final byte[] payload = asPkcs1PrivateKey(der);
                    return Type.PKCS1_PRIVATE_KEY.encode(payload, null);
                }
            } else {
                if (format == Format.DEFAULT) {
                    return Type.PKCS8_ENCRYPTED_PRIVATE_KEY.encode(der, encryption);
                } else {
                    final byte[] payload = asPkcs1PrivateKey(der);
                    return Type.PKCS1_ENCRYPTED_PRIVATE_KEY.encode(payload, encryption);
                }
            }
        }

        /**
         * Write a private key to a byte stream
         *
         * @param output The byte stream
         * @param privateKey The private key
         * @throws IOException if an error occurs writing to the stream
         */
        public WritableByteChannel write(
                final WritableByteChannel output, final PrivateKey privateKey) throws IOException {
            final ByteBuffer buffer = ByteBuffer.wrap(encode(privateKey));
            try {
                output.write(buffer);
            } finally {
                Eraser.erase(buffer);
            }
            return output;
        }

        /**
         * Write a public key to a byte stream
         *
         * @param output The byte stream
         * @param publicKey The public key
         * @throws IOException if an error occurs writing to the stream
         */
        public WritableByteChannel write(
                final WritableByteChannel output, final PublicKey publicKey) throws IOException {
            final ByteBuffer buffer = ByteBuffer.wrap(Text.bytes(encode(publicKey)));
            output.write(buffer);
            return output;
        }

        /**
         * Write a certificate to a byte stream
         *
         * @param output The byte stream
         * @param certificate The certificate
         * @throws IOException if an error occurs writing to the stream
         */
        public WritableByteChannel write(
                final WritableByteChannel output, final Certificate certificate)
                throws IOException {
            final ByteBuffer buffer = ByteBuffer.wrap(Text.bytes(encode(certificate)));
            output.write(buffer);
            return output;
        }
    }
}
