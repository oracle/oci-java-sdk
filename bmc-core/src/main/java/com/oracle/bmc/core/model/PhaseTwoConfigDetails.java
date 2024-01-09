/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Configuration details for IPSec phase two configuration parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PhaseTwoConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PhaseTwoConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isCustomPhaseTwoConfig",
        "authenticationAlgorithm",
        "encryptionAlgorithm",
        "lifetimeInSeconds",
        "isPfsEnabled",
        "pfsDhGroup"
    })
    public PhaseTwoConfigDetails(
            Boolean isCustomPhaseTwoConfig,
            AuthenticationAlgorithm authenticationAlgorithm,
            EncryptionAlgorithm encryptionAlgorithm,
            Integer lifetimeInSeconds,
            Boolean isPfsEnabled,
            PfsDhGroup pfsDhGroup) {
        super();
        this.isCustomPhaseTwoConfig = isCustomPhaseTwoConfig;
        this.authenticationAlgorithm = authenticationAlgorithm;
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.lifetimeInSeconds = lifetimeInSeconds;
        this.isPfsEnabled = isPfsEnabled;
        this.pfsDhGroup = pfsDhGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether custom configuration is enabled for phase two options. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseTwoConfig")
        private Boolean isCustomPhaseTwoConfig;

        /**
         * Indicates whether custom configuration is enabled for phase two options.
         *
         * @param isCustomPhaseTwoConfig the value to set
         * @return this builder
         */
        public Builder isCustomPhaseTwoConfig(Boolean isCustomPhaseTwoConfig) {
            this.isCustomPhaseTwoConfig = isCustomPhaseTwoConfig;
            this.__explicitlySet__.add("isCustomPhaseTwoConfig");
            return this;
        }
        /** The authentication algorithm proposed during phase two tunnel negotiation. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithm")
        private AuthenticationAlgorithm authenticationAlgorithm;

        /**
         * The authentication algorithm proposed during phase two tunnel negotiation.
         *
         * @param authenticationAlgorithm the value to set
         * @return this builder
         */
        public Builder authenticationAlgorithm(AuthenticationAlgorithm authenticationAlgorithm) {
            this.authenticationAlgorithm = authenticationAlgorithm;
            this.__explicitlySet__.add("authenticationAlgorithm");
            return this;
        }
        /** The encryption algorithm proposed during phase two tunnel negotiation. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
        private EncryptionAlgorithm encryptionAlgorithm;

        /**
         * The encryption algorithm proposed during phase two tunnel negotiation.
         *
         * @param encryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder encryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            this.__explicitlySet__.add("encryptionAlgorithm");
            return this;
        }
        /**
         * Lifetime in seconds for the IPSec session key set in phase two. The default is 3600 which
         * is equivalent to 1 hour.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifetimeInSeconds")
        private Integer lifetimeInSeconds;

        /**
         * Lifetime in seconds for the IPSec session key set in phase two. The default is 3600 which
         * is equivalent to 1 hour.
         *
         * @param lifetimeInSeconds the value to set
         * @return this builder
         */
        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = lifetimeInSeconds;
            this.__explicitlySet__.add("lifetimeInSeconds");
            return this;
        }
        /** Indicates whether perfect forward secrecy (PFS) is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPfsEnabled")
        private Boolean isPfsEnabled;

        /**
         * Indicates whether perfect forward secrecy (PFS) is enabled.
         *
         * @param isPfsEnabled the value to set
         * @return this builder
         */
        public Builder isPfsEnabled(Boolean isPfsEnabled) {
            this.isPfsEnabled = isPfsEnabled;
            this.__explicitlySet__.add("isPfsEnabled");
            return this;
        }
        /** The Diffie-Hellman group used for PFS, if PFS is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("pfsDhGroup")
        private PfsDhGroup pfsDhGroup;

        /**
         * The Diffie-Hellman group used for PFS, if PFS is enabled.
         *
         * @param pfsDhGroup the value to set
         * @return this builder
         */
        public Builder pfsDhGroup(PfsDhGroup pfsDhGroup) {
            this.pfsDhGroup = pfsDhGroup;
            this.__explicitlySet__.add("pfsDhGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PhaseTwoConfigDetails build() {
            PhaseTwoConfigDetails model =
                    new PhaseTwoConfigDetails(
                            this.isCustomPhaseTwoConfig,
                            this.authenticationAlgorithm,
                            this.encryptionAlgorithm,
                            this.lifetimeInSeconds,
                            this.isPfsEnabled,
                            this.pfsDhGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PhaseTwoConfigDetails model) {
            if (model.wasPropertyExplicitlySet("isCustomPhaseTwoConfig")) {
                this.isCustomPhaseTwoConfig(model.getIsCustomPhaseTwoConfig());
            }
            if (model.wasPropertyExplicitlySet("authenticationAlgorithm")) {
                this.authenticationAlgorithm(model.getAuthenticationAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("encryptionAlgorithm")) {
                this.encryptionAlgorithm(model.getEncryptionAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("lifetimeInSeconds")) {
                this.lifetimeInSeconds(model.getLifetimeInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isPfsEnabled")) {
                this.isPfsEnabled(model.getIsPfsEnabled());
            }
            if (model.wasPropertyExplicitlySet("pfsDhGroup")) {
                this.pfsDhGroup(model.getPfsDhGroup());
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

    /** Indicates whether custom configuration is enabled for phase two options. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseTwoConfig")
    private final Boolean isCustomPhaseTwoConfig;

    /**
     * Indicates whether custom configuration is enabled for phase two options.
     *
     * @return the value
     */
    public Boolean getIsCustomPhaseTwoConfig() {
        return isCustomPhaseTwoConfig;
    }

    /** The authentication algorithm proposed during phase two tunnel negotiation. */
    public enum AuthenticationAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        HmacSha2256128("HMAC_SHA2_256_128"),
        HmacSha1128("HMAC_SHA1_128"),
        ;

        private final String value;
        private static java.util.Map<String, AuthenticationAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticationAlgorithm v : AuthenticationAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        AuthenticationAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthenticationAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AuthenticationAlgorithm: " + key);
        }
    };
    /** The authentication algorithm proposed during phase two tunnel negotiation. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithm")
    private final AuthenticationAlgorithm authenticationAlgorithm;

    /**
     * The authentication algorithm proposed during phase two tunnel negotiation.
     *
     * @return the value
     */
    public AuthenticationAlgorithm getAuthenticationAlgorithm() {
        return authenticationAlgorithm;
    }

    /** The encryption algorithm proposed during phase two tunnel negotiation. */
    public enum EncryptionAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        Aes256Gcm("AES_256_GCM"),
        Aes192Gcm("AES_192_GCM"),
        Aes128Gcm("AES_128_GCM"),
        Aes256Cbc("AES_256_CBC"),
        Aes192Cbc("AES_192_CBC"),
        Aes128Cbc("AES_128_CBC"),
        ;

        private final String value;
        private static java.util.Map<String, EncryptionAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (EncryptionAlgorithm v : EncryptionAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        EncryptionAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EncryptionAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid EncryptionAlgorithm: " + key);
        }
    };
    /** The encryption algorithm proposed during phase two tunnel negotiation. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    private final EncryptionAlgorithm encryptionAlgorithm;

    /**
     * The encryption algorithm proposed during phase two tunnel negotiation.
     *
     * @return the value
     */
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * Lifetime in seconds for the IPSec session key set in phase two. The default is 3600 which is
     * equivalent to 1 hour.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifetimeInSeconds")
    private final Integer lifetimeInSeconds;

    /**
     * Lifetime in seconds for the IPSec session key set in phase two. The default is 3600 which is
     * equivalent to 1 hour.
     *
     * @return the value
     */
    public Integer getLifetimeInSeconds() {
        return lifetimeInSeconds;
    }

    /** Indicates whether perfect forward secrecy (PFS) is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPfsEnabled")
    private final Boolean isPfsEnabled;

    /**
     * Indicates whether perfect forward secrecy (PFS) is enabled.
     *
     * @return the value
     */
    public Boolean getIsPfsEnabled() {
        return isPfsEnabled;
    }

    /** The Diffie-Hellman group used for PFS, if PFS is enabled. */
    public enum PfsDhGroup implements com.oracle.bmc.http.internal.BmcEnum {
        Group2("GROUP2"),
        Group5("GROUP5"),
        Group14("GROUP14"),
        Group19("GROUP19"),
        Group20("GROUP20"),
        Group24("GROUP24"),
        ;

        private final String value;
        private static java.util.Map<String, PfsDhGroup> map;

        static {
            map = new java.util.HashMap<>();
            for (PfsDhGroup v : PfsDhGroup.values()) {
                map.put(v.getValue(), v);
            }
        }

        PfsDhGroup(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PfsDhGroup create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PfsDhGroup: " + key);
        }
    };
    /** The Diffie-Hellman group used for PFS, if PFS is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("pfsDhGroup")
    private final PfsDhGroup pfsDhGroup;

    /**
     * The Diffie-Hellman group used for PFS, if PFS is enabled.
     *
     * @return the value
     */
    public PfsDhGroup getPfsDhGroup() {
        return pfsDhGroup;
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
        sb.append("PhaseTwoConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isCustomPhaseTwoConfig=").append(String.valueOf(this.isCustomPhaseTwoConfig));
        sb.append(", authenticationAlgorithm=")
                .append(String.valueOf(this.authenticationAlgorithm));
        sb.append(", encryptionAlgorithm=").append(String.valueOf(this.encryptionAlgorithm));
        sb.append(", lifetimeInSeconds=").append(String.valueOf(this.lifetimeInSeconds));
        sb.append(", isPfsEnabled=").append(String.valueOf(this.isPfsEnabled));
        sb.append(", pfsDhGroup=").append(String.valueOf(this.pfsDhGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PhaseTwoConfigDetails)) {
            return false;
        }

        PhaseTwoConfigDetails other = (PhaseTwoConfigDetails) o;
        return java.util.Objects.equals(this.isCustomPhaseTwoConfig, other.isCustomPhaseTwoConfig)
                && java.util.Objects.equals(
                        this.authenticationAlgorithm, other.authenticationAlgorithm)
                && java.util.Objects.equals(this.encryptionAlgorithm, other.encryptionAlgorithm)
                && java.util.Objects.equals(this.lifetimeInSeconds, other.lifetimeInSeconds)
                && java.util.Objects.equals(this.isPfsEnabled, other.isPfsEnabled)
                && java.util.Objects.equals(this.pfsDhGroup, other.pfsDhGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isCustomPhaseTwoConfig == null
                                ? 43
                                : this.isCustomPhaseTwoConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationAlgorithm == null
                                ? 43
                                : this.authenticationAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionAlgorithm == null
                                ? 43
                                : this.encryptionAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.lifetimeInSeconds == null ? 43 : this.lifetimeInSeconds.hashCode());
        result = (result * PRIME) + (this.isPfsEnabled == null ? 43 : this.isPfsEnabled.hashCode());
        result = (result * PRIME) + (this.pfsDhGroup == null ? 43 : this.pfsDhGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
