/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Tunnel detail information specific to IPSec phase 2.
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
    builder = TunnelPhaseTwoDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TunnelPhaseTwoDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
        private Long lifetime;

        public Builder lifetime(Long lifetime) {
            this.lifetime = lifetime;
            this.__explicitlySet__.add("lifetime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetime")
        private Long remainingLifetime;

        public Builder remainingLifetime(Long remainingLifetime) {
            this.remainingLifetime = remainingLifetime;
            this.__explicitlySet__.add("remainingLifetime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customAuthenticationAlgorithm")
        private String customAuthenticationAlgorithm;

        public Builder customAuthenticationAlgorithm(String customAuthenticationAlgorithm) {
            this.customAuthenticationAlgorithm = customAuthenticationAlgorithm;
            this.__explicitlySet__.add("customAuthenticationAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("negotiatedAuthenticationAlgorithm")
        private String negotiatedAuthenticationAlgorithm;

        public Builder negotiatedAuthenticationAlgorithm(String negotiatedAuthenticationAlgorithm) {
            this.negotiatedAuthenticationAlgorithm = negotiatedAuthenticationAlgorithm;
            this.__explicitlySet__.add("negotiatedAuthenticationAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionAlgorithm")
        private String customEncryptionAlgorithm;

        public Builder customEncryptionAlgorithm(String customEncryptionAlgorithm) {
            this.customEncryptionAlgorithm = customEncryptionAlgorithm;
            this.__explicitlySet__.add("customEncryptionAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("negotiatedEncryptionAlgorithm")
        private String negotiatedEncryptionAlgorithm;

        public Builder negotiatedEncryptionAlgorithm(String negotiatedEncryptionAlgorithm) {
            this.negotiatedEncryptionAlgorithm = negotiatedEncryptionAlgorithm;
            this.__explicitlySet__.add("negotiatedEncryptionAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dhGroup")
        private String dhGroup;

        public Builder dhGroup(String dhGroup) {
            this.dhGroup = dhGroup;
            this.__explicitlySet__.add("dhGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("negotiatedDhGroup")
        private String negotiatedDhGroup;

        public Builder negotiatedDhGroup(String negotiatedDhGroup) {
            this.negotiatedDhGroup = negotiatedDhGroup;
            this.__explicitlySet__.add("negotiatedDhGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEspEstablished")
        private Boolean isEspEstablished;

        public Builder isEspEstablished(Boolean isEspEstablished) {
            this.isEspEstablished = isEspEstablished;
            this.__explicitlySet__.add("isEspEstablished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPfsEnabled")
        private Boolean isPfsEnabled;

        public Builder isPfsEnabled(Boolean isPfsEnabled) {
            this.isPfsEnabled = isPfsEnabled;
            this.__explicitlySet__.add("isPfsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetimeLastRetrieved")
        private java.util.Date remainingLifetimeLastRetrieved;

        public Builder remainingLifetimeLastRetrieved(
                java.util.Date remainingLifetimeLastRetrieved) {
            this.remainingLifetimeLastRetrieved = remainingLifetimeLastRetrieved;
            this.__explicitlySet__.add("remainingLifetimeLastRetrieved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TunnelPhaseTwoDetails build() {
            TunnelPhaseTwoDetails __instance__ =
                    new TunnelPhaseTwoDetails(
                            isCustomPhaseTwoConfig,
                            lifetime,
                            remainingLifetime,
                            customAuthenticationAlgorithm,
                            negotiatedAuthenticationAlgorithm,
                            customEncryptionAlgorithm,
                            negotiatedEncryptionAlgorithm,
                            dhGroup,
                            negotiatedDhGroup,
                            isEspEstablished,
                            isPfsEnabled,
                            remainingLifetimeLastRetrieved);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TunnelPhaseTwoDetails o) {
            Builder copiedBuilder =
                    isCustomPhaseTwoConfig(o.getIsCustomPhaseTwoConfig())
                            .lifetime(o.getLifetime())
                            .remainingLifetime(o.getRemainingLifetime())
                            .customAuthenticationAlgorithm(o.getCustomAuthenticationAlgorithm())
                            .negotiatedAuthenticationAlgorithm(
                                    o.getNegotiatedAuthenticationAlgorithm())
                            .customEncryptionAlgorithm(o.getCustomEncryptionAlgorithm())
                            .negotiatedEncryptionAlgorithm(o.getNegotiatedEncryptionAlgorithm())
                            .dhGroup(o.getDhGroup())
                            .negotiatedDhGroup(o.getNegotiatedDhGroup())
                            .isEspEstablished(o.getIsEspEstablished())
                            .isPfsEnabled(o.getIsPfsEnabled())
                            .remainingLifetimeLastRetrieved(o.getRemainingLifetimeLastRetrieved());

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
     * Indicates whether custom phase two configuration is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseTwoConfig")
    Boolean isCustomPhaseTwoConfig;

    /**
     * The total configured lifetime of an IKE security association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
    Long lifetime;

    /**
     * The lifetime remaining before the key is refreshed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetime")
    Long remainingLifetime;

    /**
     * Phase Two authentication algorithm supported during tunnel negotiation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customAuthenticationAlgorithm")
    String customAuthenticationAlgorithm;

    /**
     * The negotiated authentication algorithm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("negotiatedAuthenticationAlgorithm")
    String negotiatedAuthenticationAlgorithm;

    /**
     * Custom Encryption Algorithm
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionAlgorithm")
    String customEncryptionAlgorithm;

    /**
     * The negotiated encryption algorithm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("negotiatedEncryptionAlgorithm")
    String negotiatedEncryptionAlgorithm;

    /**
     * Proposed Diffie-Hellman group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dhGroup")
    String dhGroup;

    /**
     * The negotiated Diffie-Hellman group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("negotiatedDhGroup")
    String negotiatedDhGroup;

    /**
     * ESP Phase 2 established
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEspEstablished")
    Boolean isEspEstablished;

    /**
     * Is PFS (perfect forward secrecy) enabled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPfsEnabled")
    Boolean isPfsEnabled;

    /**
     * The date and time we retrieved the remaining lifetime, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetimeLastRetrieved")
    java.util.Date remainingLifetimeLastRetrieved;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
