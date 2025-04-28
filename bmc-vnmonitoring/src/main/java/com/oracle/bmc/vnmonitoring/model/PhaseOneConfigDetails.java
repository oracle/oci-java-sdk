/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Configuration details for IKE phase one (ISAKMP) configuration parameters. <br>
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
        builder = PhaseOneConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PhaseOneConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isCustomPhaseOneConfig",
        "authenticationAlgorithm",
        "encryptionAlgorithm",
        "diffieHelmanGroup",
        "lifetimeInSeconds"
    })
    public PhaseOneConfigDetails(
            Boolean isCustomPhaseOneConfig,
            AuthenticationAlgorithm authenticationAlgorithm,
            EncryptionAlgorithm encryptionAlgorithm,
            DiffieHelmanGroup diffieHelmanGroup,
            Integer lifetimeInSeconds) {
        super();
        this.isCustomPhaseOneConfig = isCustomPhaseOneConfig;
        this.authenticationAlgorithm = authenticationAlgorithm;
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.diffieHelmanGroup = diffieHelmanGroup;
        this.lifetimeInSeconds = lifetimeInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether custom configuration is enabled for phase one options. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseOneConfig")
        private Boolean isCustomPhaseOneConfig;

        /**
         * Indicates whether custom configuration is enabled for phase one options.
         *
         * @param isCustomPhaseOneConfig the value to set
         * @return this builder
         */
        public Builder isCustomPhaseOneConfig(Boolean isCustomPhaseOneConfig) {
            this.isCustomPhaseOneConfig = isCustomPhaseOneConfig;
            this.__explicitlySet__.add("isCustomPhaseOneConfig");
            return this;
        }
        /** The custom authentication algorithm proposed during phase one tunnel negotiation. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithm")
        private AuthenticationAlgorithm authenticationAlgorithm;

        /**
         * The custom authentication algorithm proposed during phase one tunnel negotiation.
         *
         * @param authenticationAlgorithm the value to set
         * @return this builder
         */
        public Builder authenticationAlgorithm(AuthenticationAlgorithm authenticationAlgorithm) {
            this.authenticationAlgorithm = authenticationAlgorithm;
            this.__explicitlySet__.add("authenticationAlgorithm");
            return this;
        }
        /** The custom encryption algorithm proposed during phase one tunnel negotiation. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
        private EncryptionAlgorithm encryptionAlgorithm;

        /**
         * The custom encryption algorithm proposed during phase one tunnel negotiation.
         *
         * @param encryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder encryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            this.__explicitlySet__.add("encryptionAlgorithm");
            return this;
        }
        /** The custom Diffie-Hellman group proposed during phase one tunnel negotiation. */
        @com.fasterxml.jackson.annotation.JsonProperty("diffieHelmanGroup")
        private DiffieHelmanGroup diffieHelmanGroup;

        /**
         * The custom Diffie-Hellman group proposed during phase one tunnel negotiation.
         *
         * @param diffieHelmanGroup the value to set
         * @return this builder
         */
        public Builder diffieHelmanGroup(DiffieHelmanGroup diffieHelmanGroup) {
            this.diffieHelmanGroup = diffieHelmanGroup;
            this.__explicitlySet__.add("diffieHelmanGroup");
            return this;
        }
        /**
         * Internet key association (IKE) session key lifetime in seconds for IPSec phase one. The
         * default is 28800 which is equivalent to 8 hours.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifetimeInSeconds")
        private Integer lifetimeInSeconds;

        /**
         * Internet key association (IKE) session key lifetime in seconds for IPSec phase one. The
         * default is 28800 which is equivalent to 8 hours.
         *
         * @param lifetimeInSeconds the value to set
         * @return this builder
         */
        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = lifetimeInSeconds;
            this.__explicitlySet__.add("lifetimeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PhaseOneConfigDetails build() {
            PhaseOneConfigDetails model =
                    new PhaseOneConfigDetails(
                            this.isCustomPhaseOneConfig,
                            this.authenticationAlgorithm,
                            this.encryptionAlgorithm,
                            this.diffieHelmanGroup,
                            this.lifetimeInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PhaseOneConfigDetails model) {
            if (model.wasPropertyExplicitlySet("isCustomPhaseOneConfig")) {
                this.isCustomPhaseOneConfig(model.getIsCustomPhaseOneConfig());
            }
            if (model.wasPropertyExplicitlySet("authenticationAlgorithm")) {
                this.authenticationAlgorithm(model.getAuthenticationAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("encryptionAlgorithm")) {
                this.encryptionAlgorithm(model.getEncryptionAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("diffieHelmanGroup")) {
                this.diffieHelmanGroup(model.getDiffieHelmanGroup());
            }
            if (model.wasPropertyExplicitlySet("lifetimeInSeconds")) {
                this.lifetimeInSeconds(model.getLifetimeInSeconds());
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

    /** Indicates whether custom configuration is enabled for phase one options. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseOneConfig")
    private final Boolean isCustomPhaseOneConfig;

    /**
     * Indicates whether custom configuration is enabled for phase one options.
     *
     * @return the value
     */
    public Boolean getIsCustomPhaseOneConfig() {
        return isCustomPhaseOneConfig;
    }

    /** The custom authentication algorithm proposed during phase one tunnel negotiation. */
    public enum AuthenticationAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        Sha2384("SHA2_384"),
        Sha2256("SHA2_256"),
        Sha196("SHA1_96"),
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
    /** The custom authentication algorithm proposed during phase one tunnel negotiation. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithm")
    private final AuthenticationAlgorithm authenticationAlgorithm;

    /**
     * The custom authentication algorithm proposed during phase one tunnel negotiation.
     *
     * @return the value
     */
    public AuthenticationAlgorithm getAuthenticationAlgorithm() {
        return authenticationAlgorithm;
    }

    /** The custom encryption algorithm proposed during phase one tunnel negotiation. */
    public enum EncryptionAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** The custom encryption algorithm proposed during phase one tunnel negotiation. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    private final EncryptionAlgorithm encryptionAlgorithm;

    /**
     * The custom encryption algorithm proposed during phase one tunnel negotiation.
     *
     * @return the value
     */
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /** The custom Diffie-Hellman group proposed during phase one tunnel negotiation. */
    public enum DiffieHelmanGroup implements com.oracle.bmc.http.internal.BmcEnum {
        Group2("GROUP2"),
        Group5("GROUP5"),
        Group14("GROUP14"),
        Group19("GROUP19"),
        Group20("GROUP20"),
        Group24("GROUP24"),
        ;

        private final String value;
        private static java.util.Map<String, DiffieHelmanGroup> map;

        static {
            map = new java.util.HashMap<>();
            for (DiffieHelmanGroup v : DiffieHelmanGroup.values()) {
                map.put(v.getValue(), v);
            }
        }

        DiffieHelmanGroup(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiffieHelmanGroup create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DiffieHelmanGroup: " + key);
        }
    };
    /** The custom Diffie-Hellman group proposed during phase one tunnel negotiation. */
    @com.fasterxml.jackson.annotation.JsonProperty("diffieHelmanGroup")
    private final DiffieHelmanGroup diffieHelmanGroup;

    /**
     * The custom Diffie-Hellman group proposed during phase one tunnel negotiation.
     *
     * @return the value
     */
    public DiffieHelmanGroup getDiffieHelmanGroup() {
        return diffieHelmanGroup;
    }

    /**
     * Internet key association (IKE) session key lifetime in seconds for IPSec phase one. The
     * default is 28800 which is equivalent to 8 hours.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifetimeInSeconds")
    private final Integer lifetimeInSeconds;

    /**
     * Internet key association (IKE) session key lifetime in seconds for IPSec phase one. The
     * default is 28800 which is equivalent to 8 hours.
     *
     * @return the value
     */
    public Integer getLifetimeInSeconds() {
        return lifetimeInSeconds;
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
        sb.append("PhaseOneConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isCustomPhaseOneConfig=").append(String.valueOf(this.isCustomPhaseOneConfig));
        sb.append(", authenticationAlgorithm=")
                .append(String.valueOf(this.authenticationAlgorithm));
        sb.append(", encryptionAlgorithm=").append(String.valueOf(this.encryptionAlgorithm));
        sb.append(", diffieHelmanGroup=").append(String.valueOf(this.diffieHelmanGroup));
        sb.append(", lifetimeInSeconds=").append(String.valueOf(this.lifetimeInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PhaseOneConfigDetails)) {
            return false;
        }

        PhaseOneConfigDetails other = (PhaseOneConfigDetails) o;
        return java.util.Objects.equals(this.isCustomPhaseOneConfig, other.isCustomPhaseOneConfig)
                && java.util.Objects.equals(
                        this.authenticationAlgorithm, other.authenticationAlgorithm)
                && java.util.Objects.equals(this.encryptionAlgorithm, other.encryptionAlgorithm)
                && java.util.Objects.equals(this.diffieHelmanGroup, other.diffieHelmanGroup)
                && java.util.Objects.equals(this.lifetimeInSeconds, other.lifetimeInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isCustomPhaseOneConfig == null
                                ? 43
                                : this.isCustomPhaseOneConfig.hashCode());
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
                        + (this.diffieHelmanGroup == null ? 43 : this.diffieHelmanGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.lifetimeInSeconds == null ? 43 : this.lifetimeInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
