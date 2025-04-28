/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Configuration fields for manual Akamai configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AkamaiManualStreamCdnConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AkamaiManualStreamCdnConfig extends StreamCdnConfigSection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of data used to compute the signature. */
        @com.fasterxml.jackson.annotation.JsonProperty("originAuthSignType")
        private OriginAuthSignType originAuthSignType;

        /**
         * The type of data used to compute the signature.
         *
         * @param originAuthSignType the value to set
         * @return this builder
         */
        public Builder originAuthSignType(OriginAuthSignType originAuthSignType) {
            this.originAuthSignType = originAuthSignType;
            this.__explicitlySet__.add("originAuthSignType");
            return this;
        }
        /** The type of encryption used to compute the signature. */
        @com.fasterxml.jackson.annotation.JsonProperty("originAuthSignEncryption")
        private OriginAuthSignEncryption originAuthSignEncryption;

        /**
         * The type of encryption used to compute the signature.
         *
         * @param originAuthSignEncryption the value to set
         * @return this builder
         */
        public Builder originAuthSignEncryption(OriginAuthSignEncryption originAuthSignEncryption) {
            this.originAuthSignEncryption = originAuthSignEncryption;
            this.__explicitlySet__.add("originAuthSignEncryption");
            return this;
        }
        /** The shared secret key A, two for errorless key rotation. */
        @com.fasterxml.jackson.annotation.JsonProperty("originAuthSecretKeyA")
        private String originAuthSecretKeyA;

        /**
         * The shared secret key A, two for errorless key rotation.
         *
         * @param originAuthSecretKeyA the value to set
         * @return this builder
         */
        public Builder originAuthSecretKeyA(String originAuthSecretKeyA) {
            this.originAuthSecretKeyA = originAuthSecretKeyA;
            this.__explicitlySet__.add("originAuthSecretKeyA");
            return this;
        }
        /** Nonce identifier for originAuthSecretKeyA (used to determine key used to sign). */
        @com.fasterxml.jackson.annotation.JsonProperty("originAuthSecretKeyNonceA")
        private String originAuthSecretKeyNonceA;

        /**
         * Nonce identifier for originAuthSecretKeyA (used to determine key used to sign).
         *
         * @param originAuthSecretKeyNonceA the value to set
         * @return this builder
         */
        public Builder originAuthSecretKeyNonceA(String originAuthSecretKeyNonceA) {
            this.originAuthSecretKeyNonceA = originAuthSecretKeyNonceA;
            this.__explicitlySet__.add("originAuthSecretKeyNonceA");
            return this;
        }
        /** The shared secret key B, two for errorless key rotation. */
        @com.fasterxml.jackson.annotation.JsonProperty("originAuthSecretKeyB")
        private String originAuthSecretKeyB;

        /**
         * The shared secret key B, two for errorless key rotation.
         *
         * @param originAuthSecretKeyB the value to set
         * @return this builder
         */
        public Builder originAuthSecretKeyB(String originAuthSecretKeyB) {
            this.originAuthSecretKeyB = originAuthSecretKeyB;
            this.__explicitlySet__.add("originAuthSecretKeyB");
            return this;
        }
        /** Nonce identifier for originAuthSecretKeyB (used to determine key used to sign). */
        @com.fasterxml.jackson.annotation.JsonProperty("originAuthSecretKeyNonceB")
        private String originAuthSecretKeyNonceB;

        /**
         * Nonce identifier for originAuthSecretKeyB (used to determine key used to sign).
         *
         * @param originAuthSecretKeyNonceB the value to set
         * @return this builder
         */
        public Builder originAuthSecretKeyNonceB(String originAuthSecretKeyNonceB) {
            this.originAuthSecretKeyNonceB = originAuthSecretKeyNonceB;
            this.__explicitlySet__.add("originAuthSecretKeyNonceB");
            return this;
        }
        /** The hostname of the CDN edge server to use when building CDN URLs. */
        @com.fasterxml.jackson.annotation.JsonProperty("edgeHostname")
        private String edgeHostname;

        /**
         * The hostname of the CDN edge server to use when building CDN URLs.
         *
         * @param edgeHostname the value to set
         * @return this builder
         */
        public Builder edgeHostname(String edgeHostname) {
            this.edgeHostname = edgeHostname;
            this.__explicitlySet__.add("edgeHostname");
            return this;
        }
        /** The path to prepend when building CDN URLs. */
        @com.fasterxml.jackson.annotation.JsonProperty("edgePathPrefix")
        private String edgePathPrefix;

        /**
         * The path to prepend when building CDN URLs.
         *
         * @param edgePathPrefix the value to set
         * @return this builder
         */
        public Builder edgePathPrefix(String edgePathPrefix) {
            this.edgePathPrefix = edgePathPrefix;
            this.__explicitlySet__.add("edgePathPrefix");
            return this;
        }
        /** Whether token authentication should be used at the CDN edge. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEdgeTokenAuth")
        private Boolean isEdgeTokenAuth;

        /**
         * Whether token authentication should be used at the CDN edge.
         *
         * @param isEdgeTokenAuth the value to set
         * @return this builder
         */
        public Builder isEdgeTokenAuth(Boolean isEdgeTokenAuth) {
            this.isEdgeTokenAuth = isEdgeTokenAuth;
            this.__explicitlySet__.add("isEdgeTokenAuth");
            return this;
        }
        /** The encryption key to use for edge token authentication. */
        @com.fasterxml.jackson.annotation.JsonProperty("edgeTokenKey")
        private String edgeTokenKey;

        /**
         * The encryption key to use for edge token authentication.
         *
         * @param edgeTokenKey the value to set
         * @return this builder
         */
        public Builder edgeTokenKey(String edgeTokenKey) {
            this.edgeTokenKey = edgeTokenKey;
            this.__explicitlySet__.add("edgeTokenKey");
            return this;
        }
        /** Salt to use when encrypting authentication token. */
        @com.fasterxml.jackson.annotation.JsonProperty("edgeTokenSalt")
        private String edgeTokenSalt;

        /**
         * Salt to use when encrypting authentication token.
         *
         * @param edgeTokenSalt the value to set
         * @return this builder
         */
        public Builder edgeTokenSalt(String edgeTokenSalt) {
            this.edgeTokenSalt = edgeTokenSalt;
            this.__explicitlySet__.add("edgeTokenSalt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AkamaiManualStreamCdnConfig build() {
            AkamaiManualStreamCdnConfig model =
                    new AkamaiManualStreamCdnConfig(
                            this.originAuthSignType,
                            this.originAuthSignEncryption,
                            this.originAuthSecretKeyA,
                            this.originAuthSecretKeyNonceA,
                            this.originAuthSecretKeyB,
                            this.originAuthSecretKeyNonceB,
                            this.edgeHostname,
                            this.edgePathPrefix,
                            this.isEdgeTokenAuth,
                            this.edgeTokenKey,
                            this.edgeTokenSalt);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AkamaiManualStreamCdnConfig model) {
            if (model.wasPropertyExplicitlySet("originAuthSignType")) {
                this.originAuthSignType(model.getOriginAuthSignType());
            }
            if (model.wasPropertyExplicitlySet("originAuthSignEncryption")) {
                this.originAuthSignEncryption(model.getOriginAuthSignEncryption());
            }
            if (model.wasPropertyExplicitlySet("originAuthSecretKeyA")) {
                this.originAuthSecretKeyA(model.getOriginAuthSecretKeyA());
            }
            if (model.wasPropertyExplicitlySet("originAuthSecretKeyNonceA")) {
                this.originAuthSecretKeyNonceA(model.getOriginAuthSecretKeyNonceA());
            }
            if (model.wasPropertyExplicitlySet("originAuthSecretKeyB")) {
                this.originAuthSecretKeyB(model.getOriginAuthSecretKeyB());
            }
            if (model.wasPropertyExplicitlySet("originAuthSecretKeyNonceB")) {
                this.originAuthSecretKeyNonceB(model.getOriginAuthSecretKeyNonceB());
            }
            if (model.wasPropertyExplicitlySet("edgeHostname")) {
                this.edgeHostname(model.getEdgeHostname());
            }
            if (model.wasPropertyExplicitlySet("edgePathPrefix")) {
                this.edgePathPrefix(model.getEdgePathPrefix());
            }
            if (model.wasPropertyExplicitlySet("isEdgeTokenAuth")) {
                this.isEdgeTokenAuth(model.getIsEdgeTokenAuth());
            }
            if (model.wasPropertyExplicitlySet("edgeTokenKey")) {
                this.edgeTokenKey(model.getEdgeTokenKey());
            }
            if (model.wasPropertyExplicitlySet("edgeTokenSalt")) {
                this.edgeTokenSalt(model.getEdgeTokenSalt());
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
    public AkamaiManualStreamCdnConfig(
            OriginAuthSignType originAuthSignType,
            OriginAuthSignEncryption originAuthSignEncryption,
            String originAuthSecretKeyA,
            String originAuthSecretKeyNonceA,
            String originAuthSecretKeyB,
            String originAuthSecretKeyNonceB,
            String edgeHostname,
            String edgePathPrefix,
            Boolean isEdgeTokenAuth,
            String edgeTokenKey,
            String edgeTokenSalt) {
        super();
        this.originAuthSignType = originAuthSignType;
        this.originAuthSignEncryption = originAuthSignEncryption;
        this.originAuthSecretKeyA = originAuthSecretKeyA;
        this.originAuthSecretKeyNonceA = originAuthSecretKeyNonceA;
        this.originAuthSecretKeyB = originAuthSecretKeyB;
        this.originAuthSecretKeyNonceB = originAuthSecretKeyNonceB;
        this.edgeHostname = edgeHostname;
        this.edgePathPrefix = edgePathPrefix;
        this.isEdgeTokenAuth = isEdgeTokenAuth;
        this.edgeTokenKey = edgeTokenKey;
        this.edgeTokenSalt = edgeTokenSalt;
    }

    /** The type of data used to compute the signature. */
    public enum OriginAuthSignType implements com.oracle.bmc.http.internal.BmcEnum {
        ForwardUrl("ForwardURL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OriginAuthSignType.class);

        private final String value;
        private static java.util.Map<String, OriginAuthSignType> map;

        static {
            map = new java.util.HashMap<>();
            for (OriginAuthSignType v : OriginAuthSignType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OriginAuthSignType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OriginAuthSignType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OriginAuthSignType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of data used to compute the signature. */
    @com.fasterxml.jackson.annotation.JsonProperty("originAuthSignType")
    private final OriginAuthSignType originAuthSignType;

    /**
     * The type of data used to compute the signature.
     *
     * @return the value
     */
    public OriginAuthSignType getOriginAuthSignType() {
        return originAuthSignType;
    }

    /** The type of encryption used to compute the signature. */
    public enum OriginAuthSignEncryption implements com.oracle.bmc.http.internal.BmcEnum {
        Sha256Hmac("SHA256-HMAC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OriginAuthSignEncryption.class);

        private final String value;
        private static java.util.Map<String, OriginAuthSignEncryption> map;

        static {
            map = new java.util.HashMap<>();
            for (OriginAuthSignEncryption v : OriginAuthSignEncryption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OriginAuthSignEncryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OriginAuthSignEncryption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OriginAuthSignEncryption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of encryption used to compute the signature. */
    @com.fasterxml.jackson.annotation.JsonProperty("originAuthSignEncryption")
    private final OriginAuthSignEncryption originAuthSignEncryption;

    /**
     * The type of encryption used to compute the signature.
     *
     * @return the value
     */
    public OriginAuthSignEncryption getOriginAuthSignEncryption() {
        return originAuthSignEncryption;
    }

    /** The shared secret key A, two for errorless key rotation. */
    @com.fasterxml.jackson.annotation.JsonProperty("originAuthSecretKeyA")
    private final String originAuthSecretKeyA;

    /**
     * The shared secret key A, two for errorless key rotation.
     *
     * @return the value
     */
    public String getOriginAuthSecretKeyA() {
        return originAuthSecretKeyA;
    }

    /** Nonce identifier for originAuthSecretKeyA (used to determine key used to sign). */
    @com.fasterxml.jackson.annotation.JsonProperty("originAuthSecretKeyNonceA")
    private final String originAuthSecretKeyNonceA;

    /**
     * Nonce identifier for originAuthSecretKeyA (used to determine key used to sign).
     *
     * @return the value
     */
    public String getOriginAuthSecretKeyNonceA() {
        return originAuthSecretKeyNonceA;
    }

    /** The shared secret key B, two for errorless key rotation. */
    @com.fasterxml.jackson.annotation.JsonProperty("originAuthSecretKeyB")
    private final String originAuthSecretKeyB;

    /**
     * The shared secret key B, two for errorless key rotation.
     *
     * @return the value
     */
    public String getOriginAuthSecretKeyB() {
        return originAuthSecretKeyB;
    }

    /** Nonce identifier for originAuthSecretKeyB (used to determine key used to sign). */
    @com.fasterxml.jackson.annotation.JsonProperty("originAuthSecretKeyNonceB")
    private final String originAuthSecretKeyNonceB;

    /**
     * Nonce identifier for originAuthSecretKeyB (used to determine key used to sign).
     *
     * @return the value
     */
    public String getOriginAuthSecretKeyNonceB() {
        return originAuthSecretKeyNonceB;
    }

    /** The hostname of the CDN edge server to use when building CDN URLs. */
    @com.fasterxml.jackson.annotation.JsonProperty("edgeHostname")
    private final String edgeHostname;

    /**
     * The hostname of the CDN edge server to use when building CDN URLs.
     *
     * @return the value
     */
    public String getEdgeHostname() {
        return edgeHostname;
    }

    /** The path to prepend when building CDN URLs. */
    @com.fasterxml.jackson.annotation.JsonProperty("edgePathPrefix")
    private final String edgePathPrefix;

    /**
     * The path to prepend when building CDN URLs.
     *
     * @return the value
     */
    public String getEdgePathPrefix() {
        return edgePathPrefix;
    }

    /** Whether token authentication should be used at the CDN edge. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEdgeTokenAuth")
    private final Boolean isEdgeTokenAuth;

    /**
     * Whether token authentication should be used at the CDN edge.
     *
     * @return the value
     */
    public Boolean getIsEdgeTokenAuth() {
        return isEdgeTokenAuth;
    }

    /** The encryption key to use for edge token authentication. */
    @com.fasterxml.jackson.annotation.JsonProperty("edgeTokenKey")
    private final String edgeTokenKey;

    /**
     * The encryption key to use for edge token authentication.
     *
     * @return the value
     */
    public String getEdgeTokenKey() {
        return edgeTokenKey;
    }

    /** Salt to use when encrypting authentication token. */
    @com.fasterxml.jackson.annotation.JsonProperty("edgeTokenSalt")
    private final String edgeTokenSalt;

    /**
     * Salt to use when encrypting authentication token.
     *
     * @return the value
     */
    public String getEdgeTokenSalt() {
        return edgeTokenSalt;
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
        sb.append("AkamaiManualStreamCdnConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", originAuthSignType=").append(String.valueOf(this.originAuthSignType));
        sb.append(", originAuthSignEncryption=")
                .append(String.valueOf(this.originAuthSignEncryption));
        sb.append(", originAuthSecretKeyA=").append(String.valueOf(this.originAuthSecretKeyA));
        sb.append(", originAuthSecretKeyNonceA=")
                .append(String.valueOf(this.originAuthSecretKeyNonceA));
        sb.append(", originAuthSecretKeyB=").append(String.valueOf(this.originAuthSecretKeyB));
        sb.append(", originAuthSecretKeyNonceB=")
                .append(String.valueOf(this.originAuthSecretKeyNonceB));
        sb.append(", edgeHostname=").append(String.valueOf(this.edgeHostname));
        sb.append(", edgePathPrefix=").append(String.valueOf(this.edgePathPrefix));
        sb.append(", isEdgeTokenAuth=").append(String.valueOf(this.isEdgeTokenAuth));
        sb.append(", edgeTokenKey=").append(String.valueOf(this.edgeTokenKey));
        sb.append(", edgeTokenSalt=").append(String.valueOf(this.edgeTokenSalt));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AkamaiManualStreamCdnConfig)) {
            return false;
        }

        AkamaiManualStreamCdnConfig other = (AkamaiManualStreamCdnConfig) o;
        return java.util.Objects.equals(this.originAuthSignType, other.originAuthSignType)
                && java.util.Objects.equals(
                        this.originAuthSignEncryption, other.originAuthSignEncryption)
                && java.util.Objects.equals(this.originAuthSecretKeyA, other.originAuthSecretKeyA)
                && java.util.Objects.equals(
                        this.originAuthSecretKeyNonceA, other.originAuthSecretKeyNonceA)
                && java.util.Objects.equals(this.originAuthSecretKeyB, other.originAuthSecretKeyB)
                && java.util.Objects.equals(
                        this.originAuthSecretKeyNonceB, other.originAuthSecretKeyNonceB)
                && java.util.Objects.equals(this.edgeHostname, other.edgeHostname)
                && java.util.Objects.equals(this.edgePathPrefix, other.edgePathPrefix)
                && java.util.Objects.equals(this.isEdgeTokenAuth, other.isEdgeTokenAuth)
                && java.util.Objects.equals(this.edgeTokenKey, other.edgeTokenKey)
                && java.util.Objects.equals(this.edgeTokenSalt, other.edgeTokenSalt)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.originAuthSignType == null
                                ? 43
                                : this.originAuthSignType.hashCode());
        result =
                (result * PRIME)
                        + (this.originAuthSignEncryption == null
                                ? 43
                                : this.originAuthSignEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.originAuthSecretKeyA == null
                                ? 43
                                : this.originAuthSecretKeyA.hashCode());
        result =
                (result * PRIME)
                        + (this.originAuthSecretKeyNonceA == null
                                ? 43
                                : this.originAuthSecretKeyNonceA.hashCode());
        result =
                (result * PRIME)
                        + (this.originAuthSecretKeyB == null
                                ? 43
                                : this.originAuthSecretKeyB.hashCode());
        result =
                (result * PRIME)
                        + (this.originAuthSecretKeyNonceB == null
                                ? 43
                                : this.originAuthSecretKeyNonceB.hashCode());
        result = (result * PRIME) + (this.edgeHostname == null ? 43 : this.edgeHostname.hashCode());
        result =
                (result * PRIME)
                        + (this.edgePathPrefix == null ? 43 : this.edgePathPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.isEdgeTokenAuth == null ? 43 : this.isEdgeTokenAuth.hashCode());
        result = (result * PRIME) + (this.edgeTokenKey == null ? 43 : this.edgeTokenKey.hashCode());
        result =
                (result * PRIME)
                        + (this.edgeTokenSalt == null ? 43 : this.edgeTokenSalt.hashCode());
        return result;
    }
}
