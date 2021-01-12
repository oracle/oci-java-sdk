/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A JSON Web Key that represents the public key used for verifying the JWT signature.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JsonWebKey.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "format"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JsonWebKey extends StaticPublicKey {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("kid")
        private String kid;

        public Builder kid(String kid) {
            this.kid = kid;
            this.__explicitlySet__.add("kid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kty")
        private Kty kty;

        public Builder kty(Kty kty) {
            this.kty = kty;
            this.__explicitlySet__.add("kty");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("use")
        private Use use;

        public Builder use(Use use) {
            this.use = use;
            this.__explicitlySet__.add("use");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("key_ops")
        private java.util.List<KeyOps> keyOps;

        public Builder keyOps(java.util.List<KeyOps> keyOps) {
            this.keyOps = keyOps;
            this.__explicitlySet__.add("keyOps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alg")
        private String alg;

        public Builder alg(String alg) {
            this.alg = alg;
            this.__explicitlySet__.add("alg");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JsonWebKey build() {
            JsonWebKey __instance__ = new JsonWebKey(kid, kty, use, keyOps, alg, n, e);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JsonWebKey o) {
            Builder copiedBuilder =
                    kid(o.getKid())
                            .kty(o.getKty())
                            .use(o.getUse())
                            .keyOps(o.getKeyOps())
                            .alg(o.getAlg())
                            .n(o.getN())
                            .e(o.getE());

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

    @Deprecated
    public JsonWebKey(
            String kid,
            Kty kty,
            Use use,
            java.util.List<KeyOps> keyOps,
            String alg,
            String n,
            String e) {
        super(kid);
        this.kty = kty;
        this.use = use;
        this.keyOps = keyOps;
        this.alg = alg;
        this.n = n;
        this.e = e;
    }

    /**
     * The key type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Kty {
        Rsa("RSA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Kty> map;

        static {
            map = new java.util.HashMap<>();
            for (Kty v : Kty.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Kty(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Kty create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Kty', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The key type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kty")
    Kty kty;
    /**
     * The intended use of the public key.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Use {
        Sig("sig"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Use> map;

        static {
            map = new java.util.HashMap<>();
            for (Use v : Use.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Use(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Use create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Use', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The intended use of the public key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    Use use;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum KeyOps {
        Verify("verify"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, KeyOps> map;

        static {
            map = new java.util.HashMap<>();
            for (KeyOps v : KeyOps.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        KeyOps(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static KeyOps create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'KeyOps', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The operations for which this key is to be used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key_ops")
    java.util.List<KeyOps> keyOps;

    /**
     * The algorithm intended for use with this key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alg")
    String alg;

    /**
     * The base64 url encoded modulus of the RSA public key represented
     * by this key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("n")
    String n;

    /**
     * The base64 url encoded exponent of the RSA public key represented
     * by this key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("e")
    String e;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
