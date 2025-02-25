/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.io.IOException;
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
import java.util.Base64;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.auth.exception.InstancePrincipalUnavailableException;
import com.oracle.bmc.http.signing.pki.Pem;
import com.oracle.bmc.util.internal.Validate;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;

import org.slf4j.Logger;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.security.auth.x500.X500Principal;

/**
 * Utilities dealing with authorization.
 */
public class AuthUtils {
    private static final ObjectMapper OBJECT_MAPPER =
            com.oracle.bmc.http.Serialization.getObjectMapper();
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(AuthUtils.class);

    private AuthUtils() {}

    /**
     * Gets the fingerprint of a certificate using Sha256. This is the same value that you would get by running,
     * <code>openssl x509 -in certificate.pem -noout -fingerprint</code>
     * @param certificate the certificate
     * @return Fingerprint of the certificate
     * @throws Error if there is an error
     */
    public static String getFingerPrint(X509Certificate certificate) {
        Validate.notNull(certificate, "certificate may not be null");
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
     * @return Hex representation of a byte array
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
     * @return Optional of RSAPublicKey
     */
    public static Optional<RSAPublicKey> toPublicKeyFromJson(String json) {
        Validate.notBlank(json, "JSON for public key may not be blank");

        Optional<JWK> jwk = toJwk(json);
        if (!jwk.isPresent()) {
            return Optional.empty();
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
        Validate.notBlank(json, "JSON for JWK may not be blank");

        try {
            JWK jwk = OBJECT_MAPPER.readValue(json, JWK.class);
            return Optional.of(jwk);
        } catch (IOException e) {
            LOG.debug("Exception reading or de-serializing jwk", e);
            return Optional.empty();
        }
    }

    /**
     * Convert {@link JWK} into {@link RSAPublicKey}.
     *
     * @param jwk the jwk object
     * @return Optional of RSAPublicKey
     */
    public static Optional<RSAPublicKey> toPublicKeyFromJwk(final JWK jwk) {
        Validate.notNull(jwk, "JWK may not be null");

        try {
            // modulus and exponent are unsigned, negative big integer should be converted to positive
            RSAPublicKey key =
                    (RSAPublicKey)
                            KeyFactory.getInstance("RSA")
                                    .generatePublic(
                                            new RSAPublicKeySpec(
                                                    new BigInteger(
                                                            1, base64Decode(jwk.getModulus())),
                                                    new BigInteger(
                                                            1,
                                                            base64Decode(
                                                                    jwk.getPublicExponent()))));

            return Optional.of(key);
        } catch (Exception ex) {
            LOG.debug("Failed to construct public key from JWK", ex);
            return Optional.empty();
        }
    }

    /**
     * Converts a private key back to a PEM formatted input stream.
     * @param key The key to convert.
     * @return A new input stream
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public static byte[] toByteArrayFromRSAPrivateKey(RSAPrivateKey key) {
        return Pem.encoder().with(Pem.Format.LEGACY).encode(key);
    }

    /**
     * Base64 encodes a public key with no chunking.
     * @param publicKey The public key
     * @return Base64 representation
     */
    public static String base64EncodeNoChunking(RSAPublicKey publicKey) {
        return new String(
                Base64.getEncoder().encode(publicKey.getEncoded()), StandardCharsets.UTF_8);
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
                Base64.getEncoder().encode(getEncodedCertificate(certificate)),
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

    /**
     * Decode the base64 string. This supports both '+' and '/' as well as '-' and '_'.
     * @param base64 base64 string
     * @return decoded bytes
     */
    public static byte[] base64Decode(String base64) {
        // compatibility with Apache Commons Codec Base64: decoding null yields null
        if (base64 == null) {
            return null;
        }
        // compatibility with Apache Commons Codec Base64:
        // urlSafe - Instead of emitting '+' and '/' we emit '-' and '_' respectively. urlSafe is only applied to encode operations. Decoding seamlessly handles both modes.
        return Base64.getDecoder().decode(base64.replace('-', '+').replace('_', '/'));
    }

    static byte[] getEncodedCertificateFromPem(String pemEncodedCertificate) {
        // strip out header and footer
        return base64Decode(
                pemEncodedCertificate
                        .replace("-----BEGIN CERTIFICATE-----", "")
                        .replace("-----END CERTIFICATE-----", "")
                        .replace("\n", "")
                        .replace("\r", ""));
    }

    /**
     * Get the tenant id from the given certificate.
     * @param certificate the given certificate.
     * @return the tenant id.
     */
    public static String getTenantIdFromCertificate(X509Certificate certificate) {
        Validate.notNull(certificate, "certificate may not be null");

        final X500Principal principal = certificate.getSubjectX500Principal();
        final String name = principal.getName();
        Optional<String> tenancyId = getValue(name, "OU", "opc-tenant"); // IP
        if (!tenancyId.isPresent()) {
            tenancyId = getValue(name, "O", "opc-identity"); // SP
        }
        if (tenancyId.isPresent()) {
            return tenancyId.get();
        }
        throw new InstancePrincipalUnavailableException(
                "The certificate does not contain tenant id.");
    }

    private static Optional<String> getValue(String name, String type, String key) {
        try {
            final LdapName ldapName = new LdapName(name);
            final String prefix = key + ":";

            for (Rdn rdn : ldapName.getRdns()) {
                final String rdnType = rdn.getType();
                if (type.equalsIgnoreCase(rdnType)) {
                    final Attribute attribute = rdn.toAttributes().get(type);
                    if (attribute != null) {
                        final NamingEnumeration<?> values = attribute.getAll();
                        while (values.hasMore()) {
                            final Object value = values.next();
                            if (value != null) {
                                final String text = value.toString().trim();
                                if (text.startsWith(prefix)) {
                                    return Optional.of(text.substring(prefix.length()));
                                }
                            }
                        }
                    }
                }
            }
            return Optional.empty();
        } catch (NamingException e) {
            throw new InstancePrincipalUnavailableException(
                    "Error parsing the certificate name", e);
        }
    }
}
