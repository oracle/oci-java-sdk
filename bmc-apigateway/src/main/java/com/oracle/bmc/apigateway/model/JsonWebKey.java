/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A JSON Web Key that represents the public key used for verifying the JWT signature. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JsonWebKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "format")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JsonWebKey extends StaticPublicKey {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("kid")
        private String kid;

        public Builder kid(String kid) {
            this.kid = kid;
            this.__explicitlySet__.add("kid");
            return this;
        }
        /** The key type. */
        @com.fasterxml.jackson.annotation.JsonProperty("kty")
        private Kty kty;

        /**
         * The key type.
         *
         * @param kty the value to set
         * @return this builder
         */
        public Builder kty(Kty kty) {
            this.kty = kty;
            this.__explicitlySet__.add("kty");
            return this;
        }
        /** The intended use of the public key. */
        @com.fasterxml.jackson.annotation.JsonProperty("use")
        private Use use;

        /**
         * The intended use of the public key.
         *
         * @param use the value to set
         * @return this builder
         */
        public Builder use(Use use) {
            this.use = use;
            this.__explicitlySet__.add("use");
            return this;
        }
        /** The operations for which this key is to be used. */
        @com.fasterxml.jackson.annotation.JsonProperty("key_ops")
        private java.util.List<KeyOps> keyOps;

        /**
         * The operations for which this key is to be used.
         *
         * @param keyOps the value to set
         * @return this builder
         */
        public Builder keyOps(java.util.List<KeyOps> keyOps) {
            this.keyOps = keyOps;
            this.__explicitlySet__.add("keyOps");
            return this;
        }
        /** The algorithm intended for use with this key. */
        @com.fasterxml.jackson.annotation.JsonProperty("alg")
        private String alg;

        /**
         * The algorithm intended for use with this key.
         *
         * @param alg the value to set
         * @return this builder
         */
        public Builder alg(String alg) {
            this.alg = alg;
            this.__explicitlySet__.add("alg");
            return this;
        }
        /** The base64 url encoded modulus of the RSA public key represented by this key. */
        @com.fasterxml.jackson.annotation.JsonProperty("n")
        private String n;

        /**
         * The base64 url encoded modulus of the RSA public key represented by this key.
         *
         * @param n the value to set
         * @return this builder
         */
        public Builder n(String n) {
            this.n = n;
            this.__explicitlySet__.add("n");
            return this;
        }
        /** The base64 url encoded exponent of the RSA public key represented by this key. */
        @com.fasterxml.jackson.annotation.JsonProperty("e")
        private String e;

        /**
         * The base64 url encoded exponent of the RSA public key represented by this key.
         *
         * @param e the value to set
         * @return this builder
         */
        public Builder e(String e) {
            this.e = e;
            this.__explicitlySet__.add("e");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JsonWebKey build() {
            JsonWebKey model =
                    new JsonWebKey(
                            this.kid, this.kty, this.use, this.keyOps, this.alg, this.n, this.e);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JsonWebKey model) {
            if (model.wasPropertyExplicitlySet("kid")) {
                this.kid(model.getKid());
            }
            if (model.wasPropertyExplicitlySet("kty")) {
                this.kty(model.getKty());
            }
            if (model.wasPropertyExplicitlySet("use")) {
                this.use(model.getUse());
            }
            if (model.wasPropertyExplicitlySet("keyOps")) {
                this.keyOps(model.getKeyOps());
            }
            if (model.wasPropertyExplicitlySet("alg")) {
                this.alg(model.getAlg());
            }
            if (model.wasPropertyExplicitlySet("n")) {
                this.n(model.getN());
            }
            if (model.wasPropertyExplicitlySet("e")) {
                this.e(model.getE());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
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

    /** The key type. */
    public enum Kty implements com.oracle.bmc.http.internal.BmcEnum {
        Rsa("RSA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Kty.class);

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
    /** The key type. */
    @com.fasterxml.jackson.annotation.JsonProperty("kty")
    private final Kty kty;

    /**
     * The key type.
     *
     * @return the value
     */
    public Kty getKty() {
        return kty;
    }

    /** The intended use of the public key. */
    public enum Use implements com.oracle.bmc.http.internal.BmcEnum {
        Sig("sig"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Use.class);

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
    /** The intended use of the public key. */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    private final Use use;

    /**
     * The intended use of the public key.
     *
     * @return the value
     */
    public Use getUse() {
        return use;
    }

    /** */
    public enum KeyOps implements com.oracle.bmc.http.internal.BmcEnum {
        Verify("verify"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(KeyOps.class);

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
    /** The operations for which this key is to be used. */
    @com.fasterxml.jackson.annotation.JsonProperty("key_ops")
    private final java.util.List<KeyOps> keyOps;

    /**
     * The operations for which this key is to be used.
     *
     * @return the value
     */
    public java.util.List<KeyOps> getKeyOps() {
        return keyOps;
    }

    /** The algorithm intended for use with this key. */
    @com.fasterxml.jackson.annotation.JsonProperty("alg")
    private final String alg;

    /**
     * The algorithm intended for use with this key.
     *
     * @return the value
     */
    public String getAlg() {
        return alg;
    }

    /** The base64 url encoded modulus of the RSA public key represented by this key. */
    @com.fasterxml.jackson.annotation.JsonProperty("n")
    private final String n;

    /**
     * The base64 url encoded modulus of the RSA public key represented by this key.
     *
     * @return the value
     */
    public String getN() {
        return n;
    }

    /** The base64 url encoded exponent of the RSA public key represented by this key. */
    @com.fasterxml.jackson.annotation.JsonProperty("e")
    private final String e;

    /**
     * The base64 url encoded exponent of the RSA public key represented by this key.
     *
     * @return the value
     */
    public String getE() {
        return e;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JsonWebKey(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", kty=").append(String.valueOf(this.kty));
        sb.append(", use=").append(String.valueOf(this.use));
        sb.append(", keyOps=").append(String.valueOf(this.keyOps));
        sb.append(", alg=").append(String.valueOf(this.alg));
        sb.append(", n=").append(String.valueOf(this.n));
        sb.append(", e=").append(String.valueOf(this.e));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonWebKey)) {
            return false;
        }

        JsonWebKey other = (JsonWebKey) o;
        return java.util.Objects.equals(this.kty, other.kty)
                && java.util.Objects.equals(this.use, other.use)
                && java.util.Objects.equals(this.keyOps, other.keyOps)
                && java.util.Objects.equals(this.alg, other.alg)
                && java.util.Objects.equals(this.n, other.n)
                && java.util.Objects.equals(this.e, other.e)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.kty == null ? 43 : this.kty.hashCode());
        result = (result * PRIME) + (this.use == null ? 43 : this.use.hashCode());
        result = (result * PRIME) + (this.keyOps == null ? 43 : this.keyOps.hashCode());
        result = (result * PRIME) + (this.alg == null ? 43 : this.alg.hashCode());
        result = (result * PRIME) + (this.n == null ? 43 : this.n.hashCode());
        result = (result * PRIME) + (this.e == null ? 43 : this.e.hashCode());
        return result;
    }
}
