/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Optional;
import com.oracle.bmc.auth.SessionKeySupplier;
import org.slf4j.Logger;

public class SecurityTokenAdapter {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(SecurityTokenAdapter.class);
    private final Optional<JwtClaimsSet> jwt;
    private final Optional<RSAPublicKey> jwkAsJce;
    private final SessionKeySupplier sessionKeySupplier;
    private final String securityToken;
    private static final String JWK = "jwk";

    public SecurityTokenAdapter(String securityToken, SessionKeySupplier sessionKeySupplier) {
        this.securityToken = securityToken;
        if (securityToken != null && !securityToken.isEmpty()) {
            JwtClaimsSet jwtClaims = new JwtClaimsSet(securityToken);
            this.jwt = Optional.of(jwtClaims);
            this.jwkAsJce = retrievePublicKey(jwtClaims);
        } else {
            this.jwt = Optional.empty();
            this.jwkAsJce = Optional.empty();
        }
        this.sessionKeySupplier = sessionKeySupplier;
    }

    /**
     * Checks to see if the current token is still valid
     *
     * @return true if valid
     */
    public boolean isValid() {
        return isValid(java.util.Optional.empty());
    }

    /**
     * Checks to see if the current token is still valid after reducing buffer time
     *
     * @return true if valid
     */
    boolean isValid(java.util.Optional<Duration> time) {
        if (!jwt.isPresent()) {
            LOG.debug("Security token is not valid.");
            return false;
        }

        try {
            Date exp = jwt.get().getExpirationTime();
            if (exp != null) {
                // Make sure the token is not expired
                final Duration bufferTime = time.isPresent() ? time.get() : Duration.ZERO;
                if (exp.toInstant().minus(bufferTime).isAfter(Instant.now())) {
                    LOG.debug("Security token is not expired");

                    // Next compare the public key from the JWT is the same
                    // from the supplier.
                    // We check this in case secrets service deploys a new key
                    // and the JWT is still not expired.
                    // In such case, we would want to re-issue the token
                    if (jwkAsJce.isPresent()
                            && isEqualPublicKey(
                                    jwkAsJce.get(),
                                    (RSAPublicKey) sessionKeySupplier.getKeyPair().getPublic())) {

                        LOG.debug(
                                "Security token is still valid. Public key matches with the JWK.");
                        return true;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            LOG.debug("JWT parsing failed");
            return false;
        }
        return false;
    }

    /**
     * Convert the JWK to JCE
     *
     * @param jwtClaimSet JWT claims
     * @return JCE Public Key if JWK is present
     */
    private static Optional<RSAPublicKey> retrievePublicKey(JwtClaimsSet jwtClaimSet) {
        try {
            String jwk = jwtClaimSet.getStringClaim(JWK);
            if (jwk != null) {
                return AuthUtils.toPublicKeyFromJson(jwk);
            }
        } catch (ParseException pe) {
            LOG.debug("JWT parsing failed");
        }
        return Optional.empty();
    }

    /**
     * Checks if two public keys are equal
     *
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

    /** Return a claim from the token */
    public String getStringClaim(String key) {
        if (!jwt.isPresent()) {
            LOG.debug("Security token is not valid.");
            return null;
        }
        try {
            return jwt.get().getStringClaim(key);
        } catch (ParseException e) {
            throw new IllegalStateException("JWT parsing failed");
        }
    }

    /**
     * Get the duration the token is valid, from issue time to expiration time.
     *
     * @return token validity duration
     */
    public Duration getTokenValidDuration() {
        if (!jwt.isPresent()) {
            return null;
        }
        return Duration.ofMillis(
                jwt.get().getExpirationTime().getTime() - jwt.get().getIssueTime().getTime());
    }

    public String getSecurityToken() {
        return this.securityToken;
    }
}
