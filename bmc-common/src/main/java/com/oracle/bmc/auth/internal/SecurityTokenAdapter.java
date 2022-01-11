/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.Date;

import com.google.common.base.Optional;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import com.oracle.bmc.auth.SessionKeySupplier;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class SecurityTokenAdapter {
    private final JWTClaimsSet jwt;
    private final SessionKeySupplier sessionKeySupplier;
    @Getter private final String securityToken;

    SecurityTokenAdapter(String securityToken, SessionKeySupplier sessionKeySupplier) {
        this.securityToken = securityToken;
        if (securityToken == null || securityToken.isEmpty()) {
            jwt = null;
        } else {
            jwt = parse(securityToken);
        }
        this.sessionKeySupplier = sessionKeySupplier;
    }

    private JWTClaimsSet parse(String token) {
        try {
            SignedJWT signedJWT = SignedJWT.parse(token);
            if (signedJWT.getSignature().toString().isEmpty()) {
                throw new IllegalArgumentException("The token doesn't have a signature");
            }
            // check if payload is a valid JSON object and throws ParseException when it's not
            return signedJWT.getJWTClaimsSet();
        } catch (ParseException e) {
            throw new IllegalArgumentException(
                    "The token does not conform to signed JWT format. " + e.getMessage());
        }
    }

    /**
     * Checks to see if the current token is still valid
     * @return true if valid
     */
    boolean isValid() {
        if (jwt == null) {
            LOG.debug("Security token is not valid.");
            return false;
        }

        try {
            Date exp = jwt.getExpirationTime();
            if (exp != null) {
                // Make sure the token is not expired
                if (exp.after(new Date())) {
                    LOG.debug("Security token is not expired");

                    // Next compare the public key inside the JWT is the same
                    // from the supplier.
                    // We check this in case secrets service deploys a new key
                    // and the JWT is still not expired.
                    // In such case, we would want to re-issue the token
                    String jwk = jwt.getStringClaim("jwk");
                    if (jwk != null) {
                        Optional<RSAPublicKey> jwkRsa = AuthUtils.toPublicKeyFromJson(jwk);
                        if (jwkRsa.isPresent()
                                && isEqualPublicKey(
                                        jwkRsa.get(),
                                        (RSAPublicKey)
                                                sessionKeySupplier.getKeyPair().getPublic())) {

                            LOG.debug(
                                    "Security token is still valid. Public key matches with the JWK.");
                            return true;
                        }
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            LOG.debug("JWT parsing failed");
            return false;
        } catch (ParseException e) {
            LOG.debug("JWT parsing failed");
            return false;
        }

        return false;
    }

    /**
     * Checks if two public keys are equal
     * @param a one public key
     * @param b the other one
     * @return true if the same
     */
    private boolean isEqualPublicKey(RSAPublicKey a, RSAPublicKey b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Public key cannot be null");
        }

        String encodedKey1 = AuthUtils.base64EncodeNoChunking(a);
        String encodedKey2 = AuthUtils.base64EncodeNoChunking(b);

        return encodedKey1.equals(encodedKey2);
    }

    /**
     * Return a claim from the token
     */
    public String getStringClaim(String key) {
        if (jwt == null) {
            LOG.debug("Security token is not valid.");
            return null;
        }
        try {
            return jwt.getStringClaim(key);
        } catch (ParseException e) {
            throw new IllegalStateException("JWT parsing failed");
        }
    }
}
