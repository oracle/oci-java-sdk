/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.text.ParseException;
import java.util.Date;

import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import com.oracle.bmc.util.internal.Validate;

/**
 * JSON Web Token Claim Set.
 */
public class JwtClaimsSet {
    private final JWTClaimsSet jwt;

    /**
     * Create a JWT claim set from a token string.
     *
     * @param token token string (must be non-null and not empty)
     */
    public JwtClaimsSet(String token) {
        Validate.notBlank(token, "token must not be null or empty");
        this.jwt = parse(token);
    }

    static JWTClaimsSet parse(String token) {
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
     * Return the JWT expiration time
     * @return expiration time
     */
    public Date getExpirationTime() {
        return jwt.getExpirationTime();
    }

    /**
     * Return the string claim for the key.
     * @param jwk key for the claim
     * @return string claim
     * @throws ParseException if not a string
     */
    public String getStringClaim(String jwk) throws ParseException {
        return jwt.getStringClaim(jwk);
    }

    /**
     * Return the claim for the key.
     * @param jwk key for the claim
     * @return string claim
     */
    public Object getClaim(String jwk) {
        return jwt.getClaim(jwk);
    }
}
