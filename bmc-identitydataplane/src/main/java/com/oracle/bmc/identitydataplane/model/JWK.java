/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JWK.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JWK {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("n")
        private String n;

        public Builder n(String n) {
            this.n = n;
            this.__explicitlySet__.add("n");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("e")
        private String e;

        public Builder e(String e) {
            this.e = e;
            this.__explicitlySet__.add("e");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kid")
        private String kid;

        public Builder kid(String kid) {
            this.kid = kid;
            this.__explicitlySet__.add("kid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("use")
        private String use;

        public Builder use(String use) {
            this.use = use;
            this.__explicitlySet__.add("use");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alg")
        private String alg;

        public Builder alg(String alg) {
            this.alg = alg;
            this.__explicitlySet__.add("alg");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kty")
        private String kty;

        public Builder kty(String kty) {
            this.kty = kty;
            this.__explicitlySet__.add("kty");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JWK build() {
            JWK __instance__ = new JWK(n, e, kid, use, alg, kty);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JWK o) {
            Builder copiedBuilder =
                    n(o.getN())
                            .e(o.getE())
                            .kid(o.getKid())
                            .use(o.getUse())
                            .alg(o.getAlg())
                            .kty(o.getKty());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The modulus.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("n")
    String n;

    /**
     * The exponent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("e")
    String e;

    /**
     * The key id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kid")
    String kid;

    /**
     * The key use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    String use;

    /**
     * The algorithm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alg")
    String alg;

    /**
     * The key type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kty")
    String kty;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
