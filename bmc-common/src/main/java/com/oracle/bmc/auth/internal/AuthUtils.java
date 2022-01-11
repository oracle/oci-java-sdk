/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

import com.oracle.bmc.auth.exception.InstancePrincipalUnavailableException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.openssl.jcajce.JcaPEMWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Utilities dealing with authorization.
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AuthUtils {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    /**
     * Gets the fingerprint of a certificate using Sha256. This is the same value that you would get by running,
     * <code>openssl x509 -in certificate.pem -noout -fingerprint</code>
     * @param certificate the certificate
     * @return Fingerprint of the certificate
     * @throws Error if there is an error
     */
    public static String getFingerPrint(X509Certificate certificate) {
        Preconditions.checkNotNull(certificate);
        try {
            final byte[] encodedCertificate = getEncodedCertificate(certificate);
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(encodedCertificate);
            String fingerprint = getHex(md.digest());

            return formatStringWithSeparator(fingerprint);
        } catch (NoSuchAlgorithmException | CertificateEncodingException e) {
            throw new Error(e.getMessage());
        }
    }

    private static String formatStringWithSeparator(String fingerprint) {
        int length = fingerprint.length();
        char[] format = new char[length * 3 / 2 - 1];

        int j = 0;
        for (int i = 0; i < length - 2; i += 2) {
            format[j++] = fingerprint.charAt(i);
            format[j++] = fingerprint.charAt(i + 1);
            format[j++] = ':';
        }
        format[j++] = fingerprint.charAt(length - 2);
        format[j] = fingerprint.charAt(length - 1);

        return String.valueOf(format);
    }

    /**
     * Computes the hex representation of a byte array.
     * @param bytes
     * @return
     */
    private static String getHex(byte bytes[]) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }

        return new String(hexChars);
    }

    /**
     * Convert JWK JSON string into a {@link RSAPublicKey}.
     *
     * @return
     */
    public static Optional<RSAPublicKey> toPublicKeyFromJson(String json) {
        Preconditions.checkArgument(!StringUtils.isBlank(json));

        Optional<JWK> jwk = toJwk(json);
        if (!jwk.isPresent()) {
            return Optional.absent();
        }

        return toPublicKeyFromJwk(jwk.get());
    }

    /**
     * Convert JSON string into {@link JWK}.
     *
     * @param json the json string
     * @return Optional of JWK
     */
    public static Optional<JWK> toJwk(String json) {
        Preconditions.checkArgument(!StringUtils.isBlank(json));

        try {
            JWK jwk = OBJECT_MAPPER.readValue(json, JWK.class);
            return Optional.of(jwk);
        } catch (IOException e) {
            LOG.debug("Exception reading or de-serializing jwk", e);
            return Optional.absent();
        }
    }

    /**
     * Convert {@link JWK} into {@link RSAPublicKey}.
     *
     * @param jwk the jwk object
     * @return Optional of RSAPublicKey
     */
    public static Optional<RSAPublicKey> toPublicKeyFromJwk(final JWK jwk) {
        Preconditions.checkNotNull(jwk);

        try {
            // modulus and exponent are unsigned, negative big integer should be converted to positive
            RSAPublicKey key =
                    (RSAPublicKey)
                            KeyFactory.getInstance("RSA")
                                    .generatePublic(
                                            new RSAPublicKeySpec(
                                                    new BigInteger(
                                                            1,
                                                            Base64.decodeBase64(jwk.getModulus())),
                                                    new BigInteger(
                                                            1,
                                                            Base64.decodeBase64(
                                                                    jwk.getPublicExponent()))));

            return Optional.of(key);
        } catch (Exception ex) {
            LOG.debug("Failed to construct public key from JWK", ex);
            return Optional.absent();
        }
    }

    /**
     * Converts a private key back to a PEM formatted input stream.
     * @param key The key to convert.
     * @return A new input stream
     */
    public static byte[] toByteArrayFromRSAPrivateKey(RSAPrivateKey key) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (JcaPEMWriter writer =
                new JcaPEMWriter(new OutputStreamWriter(baos, StandardCharsets.UTF_8))) {
            writer.writeObject(key);
            writer.flush();
        } catch (IOException e) {
            throw new IllegalStateException("Unable to write PEM object", e);
        }

        return baos.toByteArray();
    }

    /**
     * Base64 encodes a public key with no chunking.
     * @param publicKey The public key
     * @return Base64 representation
     */
    public static String base64EncodeNoChunking(RSAPublicKey publicKey) {
        return new String(
                Base64.encodeBase64(publicKey.getEncoded(), false), StandardCharsets.UTF_8);
    }

    /**
     * Base64 encodes a X509Certificate with no chunking.
     * @param certificate The certificate
     * @return Base64 representation
     * @throws CertificateEncodingException
     */
    public static String base64EncodeNoChunking(X509Certificate certificate)
            throws CertificateEncodingException {
        return new String(
                Base64.encodeBase64(getEncodedCertificate(certificate), false),
                StandardCharsets.UTF_8);
    }

    private static byte[] getEncodedCertificate(X509Certificate certificate)
            throws CertificateEncodingException {
        if (certificate instanceof X509CertificateWithOriginalPem) {
            return getEncodedCertificateFromPem(
                    ((X509CertificateWithOriginalPem) certificate).getPemEncodedCertificate());
        } else {
            return certificate.getEncoded();
        }
    }

    private static byte[] getEncodedCertificateFromPem(String pemEncodedCertificate) {
        // strip out header and footer
        return Base64.decodeBase64(
                pemEncodedCertificate
                        .replace("-----BEGIN CERTIFICATE-----", "")
                        .replace("-----END CERTIFICATE-----", ""));
    }

    /**
     * Get the tenant id from the given certificate.
     * @param certificate the given certificate.
     * @return the tenant id.
     */
    public static String getTenantIdFromCertificate(X509Certificate certificate) {
        Preconditions.checkNotNull(certificate);

        X500Name name = new X500Name(certificate.getSubjectX500Principal().getName());

        Optional<String> tenancyId =
                getValue(name, BCStyle.OU, "opc-tenant") // IP
                        .or(getValue(name, BCStyle.O, "opc-identity")); // SP
        if (tenancyId.isPresent()) {
            return tenancyId.get();
        }
        throw new InstancePrincipalUnavailableException(
                "The certificate does not contain tenant id.");
    }

    private static Optional<String> getValue(X500Name name, ASN1ObjectIdentifier id, String key) {
        String prefix = key + ":";
        for (RDN rdn : name.getRDNs(id)) {
            for (AttributeTypeAndValue typeAndValue : rdn.getTypesAndValues()) {
                String value = typeAndValue.getValue().toString();
                if (value.startsWith(prefix)) {
                    return Optional.of(value.substring(prefix.length()));
                }
            }
        }
        return Optional.absent();
    }
}
