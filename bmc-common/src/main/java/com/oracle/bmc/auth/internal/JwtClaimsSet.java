/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.io.IOException;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.http.client.Serialization;
import com.oracle.bmc.util.internal.Validate;

/** JSON Web Token Claim Set. */
public class JwtClaimsSet {
    private static final ObjectMapper OBJECT_MAPPER = Serialization.getObjectMapper();
    private final Map<String, Object> header;
    private final Map<String, Object> payload;
    private final String signature;

    /**
     * Create a JWT claim set from a token string.
     *
     * @param token token string (must be non-null and not empty)
     */
    public JwtClaimsSet(String token) {
        Validate.notBlank(token, "token must not be null or empty");
        String[] parts = token.split("\\.");
        if (parts.length != 3) {
            throw new IllegalArgumentException(
                    "Malformed JWT, only " + parts.length + " parts instead of 3");
        }
        try {
            Map h = OBJECT_MAPPER.readValue(AuthUtils.base64Decode(parts[0]), Map.class);
            Map p = OBJECT_MAPPER.readValue(AuthUtils.base64Decode(parts[1]), Map.class);
            this.signature = parts[2];
            if (this.signature.isEmpty()) {
                throw new IllegalArgumentException("The token doesn't have a signature");
            }
            convertToDate(p, "exp");
            convertToDate(p, "nbf");
            convertToDate(p, "iat");
            this.header = Collections.unmodifiableMap(h);
            this.payload = Collections.unmodifiableMap(p);
        } catch (IOException | ClassCastException e) {
            throw new IllegalArgumentException("Malformed JWT", e);
        }
    }

    private static void convertToDate(Map<String, Object> m, String key) {
        Object o = m.get(key);
        if (o != null) {
            m.put(key, new Date(TimeUnit.SECONDS.toMillis(Long.valueOf(o.toString()))));
        }
    }

    public Map<String, Object> getHeader() {
        return header;
    }

    public Map<String, Object> getPayload() {
        return payload;
    }

    public String getSignature() {
        return signature;
    }

    /**
     * Return the JWT expiration time
     *
     * @return expiration time
     */
    public Date getExpirationTime() {
        return (Date) getClaim("exp");
    }

    /**
     * Return the string claim for the key.
     *
     * @param name key for the claim
     * @return string claim
     * @throws ParseException if not a string
     */
    public String getStringClaim(String name) throws ParseException {
        Object claim = payload.get(name);
        if (claim == null) {
            return null;
        }
        if (claim instanceof String) {
            return (String) claim;
        } else {
            throw new ParseException(
                    "Malformed JWT, claim '"
                            + name
                            + "' is not a string, was '"
                            + claim.getClass().getName()
                            + "'",
                    0);
        }
    }

    /**
     * Return the claim for the key.
     *
     * @param name key for the claim
     * @return string claim
     */
    public Object getClaim(String name) {
        return payload.get(name);
    }
}
