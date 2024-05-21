/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.auth.internal.JwtClaimsSet;

import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;

public abstract class AbstractServiceAccountTokenSupplier implements ServiceAccountTokenSupplier {
    /**
     * Validate service account token and return to oke workload identity provider.
     *
     * @return kubernetes service account token
     */
    @Override
    public String getServiceAccountToken() {
        try {
            String currentToken = getTokenInner();
            if (!isValidServiceAccountToken(currentToken)) {
                throw new IllegalArgumentException("Kubernetes service account token expired.");
            }
            return currentToken;
        } catch (IOException e) {
            throw new IllegalArgumentException(
                    "Kubernetes service account token doesn't exist.", e);
        } catch (ParseException e) {
            throw new IllegalArgumentException(
                    "Fail to parse Kubernetes service account token.", e);
        }
    }

    protected abstract String getTokenInner() throws IOException;

    /**
     * Validate if the service account token already expired and validate it is a valid jwt token
     * format.
     */
    private Boolean isValidServiceAccountToken(String token) throws ParseException {
        JwtClaimsSet jwtClaims = new JwtClaimsSet(token);
        Date expirationTime = jwtClaims.getExpirationTime();
        if (expirationTime != null) {
            if (expirationTime.toInstant().isAfter(Instant.now())) {
                return true;
            }
        }
        return false;
    }
}
