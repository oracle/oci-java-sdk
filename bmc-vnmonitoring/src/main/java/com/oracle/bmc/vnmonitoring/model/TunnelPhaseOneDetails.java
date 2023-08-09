/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * IPSec tunnel details specific to ISAKMP phase one. <br>
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
        builder = TunnelPhaseOneDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TunnelPhaseOneDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isCustomPhaseOneConfig",
        "lifetime",
        "remainingLifetime",
        "customAuthenticationAlgorithm",
        "negotiatedAuthenticationAlgorithm",
        "customEncryptionAlgorithm",
        "negotiatedEncryptionAlgorithm",
        "customDhGroup",
        "negotiatedDhGroup",
        "isIkeEstablished",
        "remainingLifetimeLastRetrieved"
    })
    public TunnelPhaseOneDetails(
            Boolean isCustomPhaseOneConfig,
            Long lifetime,
            Long remainingLifetime,
            String customAuthenticationAlgorithm,
            String negotiatedAuthenticationAlgorithm,
            String customEncryptionAlgorithm,
            String negotiatedEncryptionAlgorithm,
            String customDhGroup,
            String negotiatedDhGroup,
            Boolean isIkeEstablished,
            java.util.Date remainingLifetimeLastRetrieved) {
        super();
        this.isCustomPhaseOneConfig = isCustomPhaseOneConfig;
        this.lifetime = lifetime;
        this.remainingLifetime = remainingLifetime;
        this.customAuthenticationAlgorithm = customAuthenticationAlgorithm;
        this.negotiatedAuthenticationAlgorithm = negotiatedAuthenticationAlgorithm;
        this.customEncryptionAlgorithm = customEncryptionAlgorithm;
        this.negotiatedEncryptionAlgorithm = negotiatedEncryptionAlgorithm;
        this.customDhGroup = customDhGroup;
        this.negotiatedDhGroup = negotiatedDhGroup;
        this.isIkeEstablished = isIkeEstablished;
        this.remainingLifetimeLastRetrieved = remainingLifetimeLastRetrieved;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether custom phase one configuration is enabled. If this option is not
         * enabled, default settings are proposed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseOneConfig")
        private Boolean isCustomPhaseOneConfig;

        /**
         * Indicates whether custom phase one configuration is enabled. If this option is not
         * enabled, default settings are proposed.
         *
         * @param isCustomPhaseOneConfig the value to set
         * @return this builder
         */
        public Builder isCustomPhaseOneConfig(Boolean isCustomPhaseOneConfig) {
            this.isCustomPhaseOneConfig = isCustomPhaseOneConfig;
            this.__explicitlySet__.add("isCustomPhaseOneConfig");
            return this;
        }
        /** The total configured lifetime of the IKE security association. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
        private Long lifetime;

        /**
         * The total configured lifetime of the IKE security association.
         *
         * @param lifetime the value to set
         * @return this builder
         */
        public Builder lifetime(Long lifetime) {
            this.lifetime = lifetime;
            this.__explicitlySet__.add("lifetime");
            return this;
        }
        /** The remaining lifetime before the key is refreshed. */
        @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetime")
        private Long remainingLifetime;

        /**
         * The remaining lifetime before the key is refreshed.
         *
         * @param remainingLifetime the value to set
         * @return this builder
         */
        public Builder remainingLifetime(Long remainingLifetime) {
            this.remainingLifetime = remainingLifetime;
            this.__explicitlySet__.add("remainingLifetime");
            return this;
        }
        /** The proposed custom authentication algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("customAuthenticationAlgorithm")
        private String customAuthenticationAlgorithm;

        /**
         * The proposed custom authentication algorithm.
         *
         * @param customAuthenticationAlgorithm the value to set
         * @return this builder
         */
        public Builder customAuthenticationAlgorithm(String customAuthenticationAlgorithm) {
            this.customAuthenticationAlgorithm = customAuthenticationAlgorithm;
            this.__explicitlySet__.add("customAuthenticationAlgorithm");
            return this;
        }
        /** The negotiated authentication algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("negotiatedAuthenticationAlgorithm")
        private String negotiatedAuthenticationAlgorithm;

        /**
         * The negotiated authentication algorithm.
         *
         * @param negotiatedAuthenticationAlgorithm the value to set
         * @return this builder
         */
        public Builder negotiatedAuthenticationAlgorithm(String negotiatedAuthenticationAlgorithm) {
            this.negotiatedAuthenticationAlgorithm = negotiatedAuthenticationAlgorithm;
            this.__explicitlySet__.add("negotiatedAuthenticationAlgorithm");
            return this;
        }
        /** The proposed custom encryption algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionAlgorithm")
        private String customEncryptionAlgorithm;

        /**
         * The proposed custom encryption algorithm.
         *
         * @param customEncryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder customEncryptionAlgorithm(String customEncryptionAlgorithm) {
            this.customEncryptionAlgorithm = customEncryptionAlgorithm;
            this.__explicitlySet__.add("customEncryptionAlgorithm");
            return this;
        }
        /** The negotiated encryption algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("negotiatedEncryptionAlgorithm")
        private String negotiatedEncryptionAlgorithm;

        /**
         * The negotiated encryption algorithm.
         *
         * @param negotiatedEncryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder negotiatedEncryptionAlgorithm(String negotiatedEncryptionAlgorithm) {
            this.negotiatedEncryptionAlgorithm = negotiatedEncryptionAlgorithm;
            this.__explicitlySet__.add("negotiatedEncryptionAlgorithm");
            return this;
        }
        /** The proposed custom Diffie-Hellman group. */
        @com.fasterxml.jackson.annotation.JsonProperty("customDhGroup")
        private String customDhGroup;

        /**
         * The proposed custom Diffie-Hellman group.
         *
         * @param customDhGroup the value to set
         * @return this builder
         */
        public Builder customDhGroup(String customDhGroup) {
            this.customDhGroup = customDhGroup;
            this.__explicitlySet__.add("customDhGroup");
            return this;
        }
        /** The negotiated Diffie-Hellman group. */
        @com.fasterxml.jackson.annotation.JsonProperty("negotiatedDhGroup")
        private String negotiatedDhGroup;

        /**
         * The negotiated Diffie-Hellman group.
         *
         * @param negotiatedDhGroup the value to set
         * @return this builder
         */
        public Builder negotiatedDhGroup(String negotiatedDhGroup) {
            this.negotiatedDhGroup = negotiatedDhGroup;
            this.__explicitlySet__.add("negotiatedDhGroup");
            return this;
        }
        /** Indicates whether IKE phase one is established. */
        @com.fasterxml.jackson.annotation.JsonProperty("isIkeEstablished")
        private Boolean isIkeEstablished;

        /**
         * Indicates whether IKE phase one is established.
         *
         * @param isIkeEstablished the value to set
         * @return this builder
         */
        public Builder isIkeEstablished(Boolean isIkeEstablished) {
            this.isIkeEstablished = isIkeEstablished;
            this.__explicitlySet__.add("isIkeEstablished");
            return this;
        }
        /**
         * The date and time we retrieved the remaining lifetime, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetimeLastRetrieved")
        private java.util.Date remainingLifetimeLastRetrieved;

        /**
         * The date and time we retrieved the remaining lifetime, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param remainingLifetimeLastRetrieved the value to set
         * @return this builder
         */
        public Builder remainingLifetimeLastRetrieved(
                java.util.Date remainingLifetimeLastRetrieved) {
            this.remainingLifetimeLastRetrieved = remainingLifetimeLastRetrieved;
            this.__explicitlySet__.add("remainingLifetimeLastRetrieved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TunnelPhaseOneDetails build() {
            TunnelPhaseOneDetails model =
                    new TunnelPhaseOneDetails(
                            this.isCustomPhaseOneConfig,
                            this.lifetime,
                            this.remainingLifetime,
                            this.customAuthenticationAlgorithm,
                            this.negotiatedAuthenticationAlgorithm,
                            this.customEncryptionAlgorithm,
                            this.negotiatedEncryptionAlgorithm,
                            this.customDhGroup,
                            this.negotiatedDhGroup,
                            this.isIkeEstablished,
                            this.remainingLifetimeLastRetrieved);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TunnelPhaseOneDetails model) {
            if (model.wasPropertyExplicitlySet("isCustomPhaseOneConfig")) {
                this.isCustomPhaseOneConfig(model.getIsCustomPhaseOneConfig());
            }
            if (model.wasPropertyExplicitlySet("lifetime")) {
                this.lifetime(model.getLifetime());
            }
            if (model.wasPropertyExplicitlySet("remainingLifetime")) {
                this.remainingLifetime(model.getRemainingLifetime());
            }
            if (model.wasPropertyExplicitlySet("customAuthenticationAlgorithm")) {
                this.customAuthenticationAlgorithm(model.getCustomAuthenticationAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("negotiatedAuthenticationAlgorithm")) {
                this.negotiatedAuthenticationAlgorithm(
                        model.getNegotiatedAuthenticationAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("customEncryptionAlgorithm")) {
                this.customEncryptionAlgorithm(model.getCustomEncryptionAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("negotiatedEncryptionAlgorithm")) {
                this.negotiatedEncryptionAlgorithm(model.getNegotiatedEncryptionAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("customDhGroup")) {
                this.customDhGroup(model.getCustomDhGroup());
            }
            if (model.wasPropertyExplicitlySet("negotiatedDhGroup")) {
                this.negotiatedDhGroup(model.getNegotiatedDhGroup());
            }
            if (model.wasPropertyExplicitlySet("isIkeEstablished")) {
                this.isIkeEstablished(model.getIsIkeEstablished());
            }
            if (model.wasPropertyExplicitlySet("remainingLifetimeLastRetrieved")) {
                this.remainingLifetimeLastRetrieved(model.getRemainingLifetimeLastRetrieved());
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

    /**
     * Indicates whether custom phase one configuration is enabled. If this option is not enabled,
     * default settings are proposed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomPhaseOneConfig")
    private final Boolean isCustomPhaseOneConfig;

    /**
     * Indicates whether custom phase one configuration is enabled. If this option is not enabled,
     * default settings are proposed.
     *
     * @return the value
     */
    public Boolean getIsCustomPhaseOneConfig() {
        return isCustomPhaseOneConfig;
    }

    /** The total configured lifetime of the IKE security association. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
    private final Long lifetime;

    /**
     * The total configured lifetime of the IKE security association.
     *
     * @return the value
     */
    public Long getLifetime() {
        return lifetime;
    }

    /** The remaining lifetime before the key is refreshed. */
    @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetime")
    private final Long remainingLifetime;

    /**
     * The remaining lifetime before the key is refreshed.
     *
     * @return the value
     */
    public Long getRemainingLifetime() {
        return remainingLifetime;
    }

    /** The proposed custom authentication algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("customAuthenticationAlgorithm")
    private final String customAuthenticationAlgorithm;

    /**
     * The proposed custom authentication algorithm.
     *
     * @return the value
     */
    public String getCustomAuthenticationAlgorithm() {
        return customAuthenticationAlgorithm;
    }

    /** The negotiated authentication algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("negotiatedAuthenticationAlgorithm")
    private final String negotiatedAuthenticationAlgorithm;

    /**
     * The negotiated authentication algorithm.
     *
     * @return the value
     */
    public String getNegotiatedAuthenticationAlgorithm() {
        return negotiatedAuthenticationAlgorithm;
    }

    /** The proposed custom encryption algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionAlgorithm")
    private final String customEncryptionAlgorithm;

    /**
     * The proposed custom encryption algorithm.
     *
     * @return the value
     */
    public String getCustomEncryptionAlgorithm() {
        return customEncryptionAlgorithm;
    }

    /** The negotiated encryption algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("negotiatedEncryptionAlgorithm")
    private final String negotiatedEncryptionAlgorithm;

    /**
     * The negotiated encryption algorithm.
     *
     * @return the value
     */
    public String getNegotiatedEncryptionAlgorithm() {
        return negotiatedEncryptionAlgorithm;
    }

    /** The proposed custom Diffie-Hellman group. */
    @com.fasterxml.jackson.annotation.JsonProperty("customDhGroup")
    private final String customDhGroup;

    /**
     * The proposed custom Diffie-Hellman group.
     *
     * @return the value
     */
    public String getCustomDhGroup() {
        return customDhGroup;
    }

    /** The negotiated Diffie-Hellman group. */
    @com.fasterxml.jackson.annotation.JsonProperty("negotiatedDhGroup")
    private final String negotiatedDhGroup;

    /**
     * The negotiated Diffie-Hellman group.
     *
     * @return the value
     */
    public String getNegotiatedDhGroup() {
        return negotiatedDhGroup;
    }

    /** Indicates whether IKE phase one is established. */
    @com.fasterxml.jackson.annotation.JsonProperty("isIkeEstablished")
    private final Boolean isIkeEstablished;

    /**
     * Indicates whether IKE phase one is established.
     *
     * @return the value
     */
    public Boolean getIsIkeEstablished() {
        return isIkeEstablished;
    }

    /**
     * The date and time we retrieved the remaining lifetime, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remainingLifetimeLastRetrieved")
    private final java.util.Date remainingLifetimeLastRetrieved;

    /**
     * The date and time we retrieved the remaining lifetime, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getRemainingLifetimeLastRetrieved() {
        return remainingLifetimeLastRetrieved;
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
        sb.append("TunnelPhaseOneDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isCustomPhaseOneConfig=").append(String.valueOf(this.isCustomPhaseOneConfig));
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
        sb.append(", customDhGroup=").append(String.valueOf(this.customDhGroup));
        sb.append(", negotiatedDhGroup=").append(String.valueOf(this.negotiatedDhGroup));
        sb.append(", isIkeEstablished=").append(String.valueOf(this.isIkeEstablished));
        sb.append(", remainingLifetimeLastRetrieved=")
                .append(String.valueOf(this.remainingLifetimeLastRetrieved));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TunnelPhaseOneDetails)) {
            return false;
        }

        TunnelPhaseOneDetails other = (TunnelPhaseOneDetails) o;
        return java.util.Objects.equals(this.isCustomPhaseOneConfig, other.isCustomPhaseOneConfig)
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
                && java.util.Objects.equals(this.customDhGroup, other.customDhGroup)
                && java.util.Objects.equals(this.negotiatedDhGroup, other.negotiatedDhGroup)
                && java.util.Objects.equals(this.isIkeEstablished, other.isIkeEstablished)
                && java.util.Objects.equals(
                        this.remainingLifetimeLastRetrieved, other.remainingLifetimeLastRetrieved)
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
        result =
                (result * PRIME)
                        + (this.customDhGroup == null ? 43 : this.customDhGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.negotiatedDhGroup == null ? 43 : this.negotiatedDhGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.isIkeEstablished == null ? 43 : this.isIkeEstablished.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingLifetimeLastRetrieved == null
                                ? 43
                                : this.remainingLifetimeLastRetrieved.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
