/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Configuration details for IPSec phase two configuration parameters.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PhaseTwoConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PhaseTwoConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseTwoConfig")
        private Boolean isCustomPhaseTwoConfig;

        public Builder isCustomPhaseTwoConfig(Boolean isCustomPhaseTwoConfig) {
            this.isCustomPhaseTwoConfig = isCustomPhaseTwoConfig;
            this.__explicitlySet__.add("isCustomPhaseTwoConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithm")
        private AuthenticationAlgorithm authenticationAlgorithm;

        public Builder authenticationAlgorithm(AuthenticationAlgorithm authenticationAlgorithm) {
            this.authenticationAlgorithm = authenticationAlgorithm;
            this.__explicitlySet__.add("authenticationAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
        private EncryptionAlgorithm encryptionAlgorithm;

        public Builder encryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            this.__explicitlySet__.add("encryptionAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifetimeInSeconds")
        private Integer lifetimeInSeconds;

        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = lifetimeInSeconds;
            this.__explicitlySet__.add("lifetimeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPfsEnabled")
        private Boolean isPfsEnabled;

        public Builder isPfsEnabled(Boolean isPfsEnabled) {
            this.isPfsEnabled = isPfsEnabled;
            this.__explicitlySet__.add("isPfsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pfsDhGroup")
        private PfsDhGroup pfsDhGroup;

        public Builder pfsDhGroup(PfsDhGroup pfsDhGroup) {
            this.pfsDhGroup = pfsDhGroup;
            this.__explicitlySet__.add("pfsDhGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PhaseTwoConfigDetails build() {
            PhaseTwoConfigDetails __instance__ =
                    new PhaseTwoConfigDetails(
                            isCustomPhaseTwoConfig,
                            authenticationAlgorithm,
                            encryptionAlgorithm,
                            lifetimeInSeconds,
                            isPfsEnabled,
                            pfsDhGroup);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PhaseTwoConfigDetails o) {
            Builder copiedBuilder =
                    isCustomPhaseTwoConfig(o.getIsCustomPhaseTwoConfig())
                            .authenticationAlgorithm(o.getAuthenticationAlgorithm())
                            .encryptionAlgorithm(o.getEncryptionAlgorithm())
                            .lifetimeInSeconds(o.getLifetimeInSeconds())
                            .isPfsEnabled(o.getIsPfsEnabled())
                            .pfsDhGroup(o.getPfsDhGroup());

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
     * Indicates whether custom configuration is enabled for phase two options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseTwoConfig")
    Boolean isCustomPhaseTwoConfig;
    /**
     * The authentication algorithm proposed during phase two tunnel negotiation.
     *
     **/
    public enum AuthenticationAlgorithm {
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
    /**
     * The authentication algorithm proposed during phase two tunnel negotiation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithm")
    AuthenticationAlgorithm authenticationAlgorithm;
    /**
     * The encryption algorithm proposed during phase two tunnel negotiation.
     *
     **/
    public enum EncryptionAlgorithm {
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
    /**
     * The encryption algorithm proposed during phase two tunnel negotiation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    EncryptionAlgorithm encryptionAlgorithm;

    /**
     * Lifetime in seconds for the IPSec session key set in phase two. The default is 3600 which is equivalent to 1 hour.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifetimeInSeconds")
    Integer lifetimeInSeconds;

    /**
     * Indicates whether perfect forward secrecy (PFS) is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPfsEnabled")
    Boolean isPfsEnabled;
    /**
     * The Diffie-Hellman group used for PFS, if PFS is enabled.
     **/
    public enum PfsDhGroup {
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
    /**
     * The Diffie-Hellman group used for PFS, if PFS is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pfsDhGroup")
    PfsDhGroup pfsDhGroup;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
