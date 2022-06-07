/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * IPsec tunnel detail information specific to phase two.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TunnelPhaseTwoDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TunnelPhaseTwoDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isCustomPhaseTwoConfig",
        "lifetime",
        "remainingLifetime",
        "customAuthenticationAlgorithm",
        "negotiatedAuthenticationAlgorithm",
        "customEncryptionAlgorithm",
        "negotiatedEncryptionAlgorithm",
        "dhGroup",
        "negotiatedDhGroup",
        "isEspEstablished",
        "isPfsEnabled",
        "remainingLifetimeLastRetrieved"
    })
    public TunnelPhaseTwoDetails(
            Boolean isCustomPhaseTwoConfig,
            Long lifetime,
            Long remainingLifetime,
            String customAuthenticationAlgorithm,
            String negotiatedAuthenticationAlgorithm,
            String customEncryptionAlgorithm,
            String negotiatedEncryptionAlgorithm,
            String dhGroup,
            String negotiatedDhGroup,
            Boolean isEspEstablished,
            Boolean isPfsEnabled,
            java.util.Date remainingLifetimeLastRetrieved) {
        super();
        this.isCustomPhaseTwoConfig = isCustomPhaseTwoConfig;
        this.lifetime = lifetime;
        this.remainingLifetime = remainingLifetime;
        this.customAuthenticationAlgorithm = customAuthenticationAlgorithm;
        this.negotiatedAuthenticationAlgorithm = negotiatedAuthenticationAlgorithm;
        this.customEncryptionAlgorithm = customEncryptionAlgorithm;
        this.negotiatedEncryptionAlgorithm = negotiatedEncryptionAlgorithm;
        this.dhGroup = dhGroup;
        this.negotiatedDhGroup = negotiatedDhGroup;
        this.isEspEstablished = isEspEstablished;
        this.isPfsEnabled = isPfsEnabled;
        this.remainingLifetimeLastRetrieved = remainingLifetimeLastRetrieved;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Indicates whether custom phase two configuration is enabled.
     * If this option is not enabled, default settings are proposed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseTwoConfig")
    private final Boolean isCustomPhaseTwoConfig;

    public Boolean getIsCustomPhaseTwoConfig() {
        return isCustomPhaseTwoConfig;
    }

    /**
     * The total configured lifetime of the IKE security association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
    private final Long lifetime;

    public Long getLifetime() {
        return lifetime;
    }

    /**
     * The remaining lifetime before the key is refreshed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetime")
    private final Long remainingLifetime;

    public Long getRemainingLifetime() {
        return remainingLifetime;
    }

    /**
     * Phase two authentication algorithm proposed during tunnel negotiation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customAuthenticationAlgorithm")
    private final String customAuthenticationAlgorithm;

    public String getCustomAuthenticationAlgorithm() {
        return customAuthenticationAlgorithm;
    }

    /**
     * The negotiated phase two authentication algorithm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("negotiatedAuthenticationAlgorithm")
    private final String negotiatedAuthenticationAlgorithm;

    public String getNegotiatedAuthenticationAlgorithm() {
        return negotiatedAuthenticationAlgorithm;
    }

    /**
     * The proposed custom phase two encryption algorithm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionAlgorithm")
    private final String customEncryptionAlgorithm;

    public String getCustomEncryptionAlgorithm() {
        return customEncryptionAlgorithm;
    }

    /**
     * The negotiated encryption algorithm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("negotiatedEncryptionAlgorithm")
    private final String negotiatedEncryptionAlgorithm;

    public String getNegotiatedEncryptionAlgorithm() {
        return negotiatedEncryptionAlgorithm;
    }

    /**
     * The proposed Diffie-Hellman group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dhGroup")
    private final String dhGroup;

    public String getDhGroup() {
        return dhGroup;
    }

    /**
     * The negotiated Diffie-Hellman group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("negotiatedDhGroup")
    private final String negotiatedDhGroup;

    public String getNegotiatedDhGroup() {
        return negotiatedDhGroup;
    }

    /**
     * Indicates that ESP phase two is established.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEspEstablished")
    private final Boolean isEspEstablished;

    public Boolean getIsEspEstablished() {
        return isEspEstablished;
    }

    /**
     * Indicates that PFS (perfect forward secrecy) is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPfsEnabled")
    private final Boolean isPfsEnabled;

    public Boolean getIsPfsEnabled() {
        return isPfsEnabled;
    }

    /**
     * The date and time the remaining lifetime was last retrieved, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetimeLastRetrieved")
    private final java.util.Date remainingLifetimeLastRetrieved;

    public java.util.Date getRemainingLifetimeLastRetrieved() {
        return remainingLifetimeLastRetrieved;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TunnelPhaseTwoDetails(");
        sb.append("isCustomPhaseTwoConfig=").append(String.valueOf(this.isCustomPhaseTwoConfig));
        sb.append(", lifetime=").append(String.valueOf(this.lifetime));
        sb.append(", remainingLifetime=").append(String.valueOf(this.remainingLifetime));
        sb.append(", customAuthenticationAlgorithm=")
                .append(String.valueOf(this.customAuthenticationAlgorithm));
        sb.append(", negotiatedAuthenticationAlgorithm=")
                .append(String.valueOf(this.negotiatedAuthenticationAlgorithm));
        sb.append(", customEncryptionAlgorithm=")
                .append(String.valueOf(this.customEncryptionAlgorithm));
        sb.append(", negotiatedEncryptionAlgorithm=")
                .append(String.valueOf(this.negotiatedEncryptionAlgorithm));
        sb.append(", dhGroup=").append(String.valueOf(this.dhGroup));
        sb.append(", negotiatedDhGroup=").append(String.valueOf(this.negotiatedDhGroup));
        sb.append(", isEspEstablished=").append(String.valueOf(this.isEspEstablished));
        sb.append(", isPfsEnabled=").append(String.valueOf(this.isPfsEnabled));
        sb.append(", remainingLifetimeLastRetrieved=")
                .append(String.valueOf(this.remainingLifetimeLastRetrieved));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TunnelPhaseTwoDetails)) {
            return false;
        }

        TunnelPhaseTwoDetails other = (TunnelPhaseTwoDetails) o;
        return java.util.Objects.equals(this.isCustomPhaseTwoConfig, other.isCustomPhaseTwoConfig)
                && java.util.Objects.equals(this.lifetime, other.lifetime)
                && java.util.Objects.equals(this.remainingLifetime, other.remainingLifetime)
                && java.util.Objects.equals(
                        this.customAuthenticationAlgorithm, other.customAuthenticationAlgorithm)
                && java.util.Objects.equals(
                        this.negotiatedAuthenticationAlgorithm,
                        other.negotiatedAuthenticationAlgorithm)
                && java.util.Objects.equals(
                        this.customEncryptionAlgorithm, other.customEncryptionAlgorithm)
                && java.util.Objects.equals(
                        this.negotiatedEncryptionAlgorithm, other.negotiatedEncryptionAlgorithm)
                && java.util.Objects.equals(this.dhGroup, other.dhGroup)
                && java.util.Objects.equals(this.negotiatedDhGroup, other.negotiatedDhGroup)
                && java.util.Objects.equals(this.isEspEstablished, other.isEspEstablished)
                && java.util.Objects.equals(this.isPfsEnabled, other.isPfsEnabled)
                && java.util.Objects.equals(
                        this.remainingLifetimeLastRetrieved, other.remainingLifetimeLastRetrieved)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result = (result * PRIME) + (this.lifetime == null ? 43 : this.lifetime.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingLifetime == null ? 43 : this.remainingLifetime.hashCode());
        result =
                (result * PRIME)
                        + (this.customAuthenticationAlgorithm == null
                                ? 43
                                : this.customAuthenticationAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.negotiatedAuthenticationAlgorithm == null
                                ? 43
                                : this.negotiatedAuthenticationAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.customEncryptionAlgorithm == null
                                ? 43
                                : this.customEncryptionAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.negotiatedEncryptionAlgorithm == null
                                ? 43
                                : this.negotiatedEncryptionAlgorithm.hashCode());
        result = (result * PRIME) + (this.dhGroup == null ? 43 : this.dhGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.negotiatedDhGroup == null ? 43 : this.negotiatedDhGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.isEspEstablished == null ? 43 : this.isEspEstablished.hashCode());
        result = (result * PRIME) + (this.isPfsEnabled == null ? 43 : this.isPfsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingLifetimeLastRetrieved == null
                                ? 43
                                : this.remainingLifetimeLastRetrieved.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
