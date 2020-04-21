/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/**
 * Representation of a RSA public key in JSON Web Key (JWK) format.
 *
 * @see <a href="https://tools.ietf.org/html/rfc7517">JSON Web Key Specification</a>
 */
@Immutable
public final class JWK {
    private static final String KEY_TYPE = "RSA";
    private static final String USE = "sig";
    private static final String ALGORITHM = "RS256";

    private final String n;
    private final String e;
    private final String kid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String use;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String algorithm;

    public JWK(@Nonnull String kid, @Nonnull String n, @Nonnull String e) {

        this(kid, n, e, KEY_TYPE, ALGORITHM, USE);
    }

    @JsonCreator
    public JWK(
            @JsonProperty("kid") @Nonnull String kid,
            @JsonProperty("n") @Nonnull String n,
            @JsonProperty("e") @Nonnull String e,
            @JsonProperty("kty") @Nonnull String type,
            @JsonProperty("alg") @Nonnull String algorithm,
            @JsonProperty("use") @Nullable String use) {

        Preconditions.checkArgument(!StringUtils.isBlank(kid));
        Preconditions.checkArgument(!StringUtils.isBlank(n));
        Preconditions.checkArgument(!StringUtils.isBlank(e));
        Preconditions.checkArgument(type.trim().equals(KEY_TYPE));
        this.n = n;
        this.e = e;
        this.kid = kid;
        this.algorithm = algorithm;
        this.use = use;
    }

    /**
     * @return the {@literal kty (Key Type)} for this key. Case sensitive, required.
     * @see <a href="https://tools.ietf.org/html/rfc7517#section-4.1">Key Type</a>
     */
    @JsonProperty("kty")
    public String getKeyType() {
        return KEY_TYPE;
    }

    /**
     * @return the {@literal use (Public Key use)} for this key. Optional.
     * @see <a href="https://tools.ietf.org/html/rfc7517#section-4.2">Public Key use</a>
     */
    @JsonProperty("use")
    public String getPublicKeyUse() {
        return use;
    }

    /**
     * @return the {@literal alg (Algorithm}} for this key. Optional.
     * @see <a href="https://tools.ietf.org/html/rfc7517#section-4.4">Algorithm</a>
     */
    @JsonProperty("alg")
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * @return the {@literal kid (key ID)} for this key. Case sensitive. Optional in spec, required in OPC.
     * @see <a href="https://tools.ietf.org/html/rfc7517#section-4.5">Key ID</a>
     */
    @JsonProperty("kid")
    public String getKeyId() {
        return kid;
    }

    // RSA Specific

    /**
     * base64url encoded
     * @return the RSA modulus for this key. Required.
     */
    @JsonProperty("n")
    public String getModulus() {
        return n;
    }

    /**
     * base64url encoded
     * @return the RSA public exponent for this key. Required.
     */
    @JsonProperty("e")
    public String getPublicExponent() {
        return e;
    }
}
