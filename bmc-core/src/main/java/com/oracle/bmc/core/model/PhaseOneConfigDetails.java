/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Phase 1 Configuration Details
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
    builder = PhaseOneConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PhaseOneConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseOneConfig")
        private Boolean isCustomPhaseOneConfig;

        public Builder isCustomPhaseOneConfig(Boolean isCustomPhaseOneConfig) {
            this.isCustomPhaseOneConfig = isCustomPhaseOneConfig;
            this.__explicitlySet__.add("isCustomPhaseOneConfig");
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

        @com.fasterxml.jackson.annotation.JsonProperty("diffieHelmanGroup")
        private DiffieHelmanGroup diffieHelmanGroup;

        public Builder diffieHelmanGroup(DiffieHelmanGroup diffieHelmanGroup) {
            this.diffieHelmanGroup = diffieHelmanGroup;
            this.__explicitlySet__.add("diffieHelmanGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifetimeInSeconds")
        private Integer lifetimeInSeconds;

        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = lifetimeInSeconds;
            this.__explicitlySet__.add("lifetimeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PhaseOneConfigDetails build() {
            PhaseOneConfigDetails __instance__ =
                    new PhaseOneConfigDetails(
                            isCustomPhaseOneConfig,
                            authenticationAlgorithm,
                            encryptionAlgorithm,
                            diffieHelmanGroup,
                            lifetimeInSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PhaseOneConfigDetails o) {
            Builder copiedBuilder =
                    isCustomPhaseOneConfig(o.getIsCustomPhaseOneConfig())
                            .authenticationAlgorithm(o.getAuthenticationAlgorithm())
                            .encryptionAlgorithm(o.getEncryptionAlgorithm())
                            .diffieHelmanGroup(o.getDiffieHelmanGroup())
                            .lifetimeInSeconds(o.getLifetimeInSeconds());

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
     * Indicates whether custom phase one configuration is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseOneConfig")
    Boolean isCustomPhaseOneConfig;
    /**
     * Phase one authentication algorithm supported during tunnel negotiation.
     *
     **/
    public enum AuthenticationAlgorithm {
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
    /**
     * Phase one authentication algorithm supported during tunnel negotiation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithm")
    AuthenticationAlgorithm authenticationAlgorithm;
    /**
     * Phase one encryption algorithm supported during tunnel negotiation.
     *
     **/
    public enum EncryptionAlgorithm {
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
     * Phase one encryption algorithm supported during tunnel negotiation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    EncryptionAlgorithm encryptionAlgorithm;
    /**
     * Phase One Diffie Hellman group supported during tunnel negotiation.
     *
     **/
    public enum DiffieHelmanGroup {
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
    /**
     * Phase One Diffie Hellman group supported during tunnel negotiation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diffieHelmanGroup")
    DiffieHelmanGroup diffieHelmanGroup;

    /**
     * IKE session key lifetime in seconds for IPSec phase one.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifetimeInSeconds")
    Integer lifetimeInSeconds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
