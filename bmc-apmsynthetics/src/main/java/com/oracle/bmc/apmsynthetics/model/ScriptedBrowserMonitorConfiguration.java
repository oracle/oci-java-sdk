/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Configuration details for the SCRIPTED_BROWSER monitor type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScriptedBrowserMonitorConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScriptedBrowserMonitorConfiguration extends MonitorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
        private Boolean isFailureRetried;

        public Builder isFailureRetried(Boolean isFailureRetried) {
            this.isFailureRetried = isFailureRetried;
            this.__explicitlySet__.add("isFailureRetried");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsConfiguration")
        private DnsConfiguration dnsConfiguration;

        public Builder dnsConfiguration(DnsConfiguration dnsConfiguration) {
            this.dnsConfiguration = dnsConfiguration;
            this.__explicitlySet__.add("dnsConfiguration");
            return this;
        }
        /**
         * If certificate validation is enabled, then the call will fail in case of certification
         * errors.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
        private Boolean isCertificateValidationEnabled;

        /**
         * If certificate validation is enabled, then the call will fail in case of certification
         * errors.
         *
         * @param isCertificateValidationEnabled the value to set
         * @return this builder
         */
        public Builder isCertificateValidationEnabled(Boolean isCertificateValidationEnabled) {
            this.isCertificateValidationEnabled = isCertificateValidationEnabled;
            this.__explicitlySet__.add("isCertificateValidationEnabled");
            return this;
        }
        /** If disabled then auto snapshots are not collected. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultSnapshotEnabled")
        private Boolean isDefaultSnapshotEnabled;

        /**
         * If disabled then auto snapshots are not collected.
         *
         * @param isDefaultSnapshotEnabled the value to set
         * @return this builder
         */
        public Builder isDefaultSnapshotEnabled(Boolean isDefaultSnapshotEnabled) {
            this.isDefaultSnapshotEnabled = isDefaultSnapshotEnabled;
            this.__explicitlySet__.add("isDefaultSnapshotEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScriptedBrowserMonitorConfiguration build() {
            ScriptedBrowserMonitorConfiguration model =
                    new ScriptedBrowserMonitorConfiguration(
                            this.isFailureRetried,
                            this.dnsConfiguration,
                            this.isCertificateValidationEnabled,
                            this.isDefaultSnapshotEnabled,
                            this.networkConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScriptedBrowserMonitorConfiguration model) {
            if (model.wasPropertyExplicitlySet("isFailureRetried")) {
                this.isFailureRetried(model.getIsFailureRetried());
            }
            if (model.wasPropertyExplicitlySet("dnsConfiguration")) {
                this.dnsConfiguration(model.getDnsConfiguration());
            }
            if (model.wasPropertyExplicitlySet("isCertificateValidationEnabled")) {
                this.isCertificateValidationEnabled(model.getIsCertificateValidationEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDefaultSnapshotEnabled")) {
                this.isDefaultSnapshotEnabled(model.getIsDefaultSnapshotEnabled());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
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
    public ScriptedBrowserMonitorConfiguration(
            Boolean isFailureRetried,
            DnsConfiguration dnsConfiguration,
            Boolean isCertificateValidationEnabled,
            Boolean isDefaultSnapshotEnabled,
            NetworkConfiguration networkConfiguration) {
        super(isFailureRetried, dnsConfiguration);
        this.isCertificateValidationEnabled = isCertificateValidationEnabled;
        this.isDefaultSnapshotEnabled = isDefaultSnapshotEnabled;
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * If certificate validation is enabled, then the call will fail in case of certification
     * errors.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
    private final Boolean isCertificateValidationEnabled;

    /**
     * If certificate validation is enabled, then the call will fail in case of certification
     * errors.
     *
     * @return the value
     */
    public Boolean getIsCertificateValidationEnabled() {
        return isCertificateValidationEnabled;
    }

    /** If disabled then auto snapshots are not collected. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultSnapshotEnabled")
    private final Boolean isDefaultSnapshotEnabled;

    /**
     * If disabled then auto snapshots are not collected.
     *
     * @return the value
     */
    public Boolean getIsDefaultSnapshotEnabled() {
        return isDefaultSnapshotEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final NetworkConfiguration networkConfiguration;

    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
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
        sb.append("ScriptedBrowserMonitorConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isCertificateValidationEnabled=")
                .append(String.valueOf(this.isCertificateValidationEnabled));
        sb.append(", isDefaultSnapshotEnabled=")
                .append(String.valueOf(this.isDefaultSnapshotEnabled));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScriptedBrowserMonitorConfiguration)) {
            return false;
        }

        ScriptedBrowserMonitorConfiguration other = (ScriptedBrowserMonitorConfiguration) o;
        return java.util.Objects.equals(
                        this.isCertificateValidationEnabled, other.isCertificateValidationEnabled)
                && java.util.Objects.equals(
                        this.isDefaultSnapshotEnabled, other.isDefaultSnapshotEnabled)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isCertificateValidationEnabled == null
                                ? 43
                                : this.isCertificateValidationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultSnapshotEnabled == null
                                ? 43
                                : this.isDefaultSnapshotEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        return result;
    }
}
