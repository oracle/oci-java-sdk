/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Sandbox configuration under a project. Use {@code sandboxOutboundNetworkingConfig} to choose
 * whether sandbox outbound traffic originates from an Oracle-managed network or from a customer
 * subnet. The {@code warmPoolConfig} field is a read-only projection of reserved MANAGED
 * default-pool capacities. Project create and update requests must omit {@code warmPoolConfig};
 * supplying it, including null or an empty object, is rejected. Newly enabled projects start with
 * zero default-pool capacity. Use the named warm-pool APIs to change capacities or manage CUSTOM
 * pools. On Project Update, omit sandboxConfig to retain the existing configuration. When supplying
 * sandboxConfig, include isEnabled. Sandbox can be enabled after project creation but cannot be
 * disabled after it is enabled. After enablement, isPersistenceEnabled and custom outbound
 * networking cannot change; managed network policy can be updated. Omitted isPersistenceEnabled
 * retains its current value. Credential profiles require unique labels and can be added, removed,
 * or changed on Project Update. Omit credentialProfiles to retain them, or supply the complete
 * desired list; an empty array removes all profiles from the Project. When credentialProfiles is
 * supplied, omitting sandboxOutboundNetworkingConfig retains the current outbound networking
 * configuration. Updates apply to subsequently created Sandboxes after Project configuration
 * propagation. Existing Sandboxes retain their selected profile snapshot, including when that
 * profile is changed or removed from the Project. Updating a secret's CURRENT version in Vault does
 * not change the Project configuration and remains visible to existing Sandboxes that reference
 * that secret. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SandboxConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "isPersistenceEnabled",
        "warmPoolConfig",
        "sandboxOutboundNetworkingConfig",
        "credentialProfiles"
    })
    public SandboxConfig(
            Boolean isEnabled,
            Boolean isPersistenceEnabled,
            SandboxWarmPoolConfig warmPoolConfig,
            SandboxOutboundNetworkingConfig sandboxOutboundNetworkingConfig,
            java.util.List<SandboxCredentialProfile> credentialProfiles) {
        super();
        this.isEnabled = isEnabled;
        this.isPersistenceEnabled = isPersistenceEnabled;
        this.warmPoolConfig = warmPoolConfig;
        this.sandboxOutboundNetworkingConfig = sandboxOutboundNetworkingConfig;
        this.credentialProfiles = credentialProfiles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether sandbox config is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether sandbox config is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Indicates whether persistent block volume storage is enabled for sandbox workspaces in
         * this project. When omitted, the service-defined default is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPersistenceEnabled")
        private Boolean isPersistenceEnabled;

        /**
         * Indicates whether persistent block volume storage is enabled for sandbox workspaces in
         * this project. When omitted, the service-defined default is used.
         *
         * @param isPersistenceEnabled the value to set
         * @return this builder
         */
        public Builder isPersistenceEnabled(Boolean isPersistenceEnabled) {
            this.isPersistenceEnabled = isPersistenceEnabled;
            this.__explicitlySet__.add("isPersistenceEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warmPoolConfig")
        private SandboxWarmPoolConfig warmPoolConfig;

        public Builder warmPoolConfig(SandboxWarmPoolConfig warmPoolConfig) {
            this.warmPoolConfig = warmPoolConfig;
            this.__explicitlySet__.add("warmPoolConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sandboxOutboundNetworkingConfig")
        private SandboxOutboundNetworkingConfig sandboxOutboundNetworkingConfig;

        public Builder sandboxOutboundNetworkingConfig(
                SandboxOutboundNetworkingConfig sandboxOutboundNetworkingConfig) {
            this.sandboxOutboundNetworkingConfig = sandboxOutboundNetworkingConfig;
            this.__explicitlySet__.add("sandboxOutboundNetworkingConfig");
            return this;
        }
        /**
         * Named credential profiles available for Sandbox creation. A Sandbox can explicitly select
         * one profile using credentialProfileLabel; omitting that selector selects none. On Project
         * Update, omission retains existing profiles and a supplied list replaces the complete
         * list. An empty array removes all profiles from the Project. Adding, removing, or changing
         * profiles affects subsequently created Sandboxes after configuration propagation. Existing
         * Sandboxes retain their selected configuration snapshot.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialProfiles")
        private java.util.List<SandboxCredentialProfile> credentialProfiles;

        /**
         * Named credential profiles available for Sandbox creation. A Sandbox can explicitly select
         * one profile using credentialProfileLabel; omitting that selector selects none. On Project
         * Update, omission retains existing profiles and a supplied list replaces the complete
         * list. An empty array removes all profiles from the Project. Adding, removing, or changing
         * profiles affects subsequently created Sandboxes after configuration propagation. Existing
         * Sandboxes retain their selected configuration snapshot.
         *
         * @param credentialProfiles the value to set
         * @return this builder
         */
        public Builder credentialProfiles(
                java.util.List<SandboxCredentialProfile> credentialProfiles) {
            this.credentialProfiles = credentialProfiles;
            this.__explicitlySet__.add("credentialProfiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxConfig build() {
            SandboxConfig model =
                    new SandboxConfig(
                            this.isEnabled,
                            this.isPersistenceEnabled,
                            this.warmPoolConfig,
                            this.sandboxOutboundNetworkingConfig,
                            this.credentialProfiles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxConfig model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isPersistenceEnabled")) {
                this.isPersistenceEnabled(model.getIsPersistenceEnabled());
            }
            if (model.wasPropertyExplicitlySet("warmPoolConfig")) {
                this.warmPoolConfig(model.getWarmPoolConfig());
            }
            if (model.wasPropertyExplicitlySet("sandboxOutboundNetworkingConfig")) {
                this.sandboxOutboundNetworkingConfig(model.getSandboxOutboundNetworkingConfig());
            }
            if (model.wasPropertyExplicitlySet("credentialProfiles")) {
                this.credentialProfiles(model.getCredentialProfiles());
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

    /** Indicates whether sandbox config is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether sandbox config is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Indicates whether persistent block volume storage is enabled for sandbox workspaces in this
     * project. When omitted, the service-defined default is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPersistenceEnabled")
    private final Boolean isPersistenceEnabled;

    /**
     * Indicates whether persistent block volume storage is enabled for sandbox workspaces in this
     * project. When omitted, the service-defined default is used.
     *
     * @return the value
     */
    public Boolean getIsPersistenceEnabled() {
        return isPersistenceEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("warmPoolConfig")
    private final SandboxWarmPoolConfig warmPoolConfig;

    public SandboxWarmPoolConfig getWarmPoolConfig() {
        return warmPoolConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sandboxOutboundNetworkingConfig")
    private final SandboxOutboundNetworkingConfig sandboxOutboundNetworkingConfig;

    public SandboxOutboundNetworkingConfig getSandboxOutboundNetworkingConfig() {
        return sandboxOutboundNetworkingConfig;
    }

    /**
     * Named credential profiles available for Sandbox creation. A Sandbox can explicitly select one
     * profile using credentialProfileLabel; omitting that selector selects none. On Project Update,
     * omission retains existing profiles and a supplied list replaces the complete list. An empty
     * array removes all profiles from the Project. Adding, removing, or changing profiles affects
     * subsequently created Sandboxes after configuration propagation. Existing Sandboxes retain
     * their selected configuration snapshot.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialProfiles")
    private final java.util.List<SandboxCredentialProfile> credentialProfiles;

    /**
     * Named credential profiles available for Sandbox creation. A Sandbox can explicitly select one
     * profile using credentialProfileLabel; omitting that selector selects none. On Project Update,
     * omission retains existing profiles and a supplied list replaces the complete list. An empty
     * array removes all profiles from the Project. Adding, removing, or changing profiles affects
     * subsequently created Sandboxes after configuration propagation. Existing Sandboxes retain
     * their selected configuration snapshot.
     *
     * @return the value
     */
    public java.util.List<SandboxCredentialProfile> getCredentialProfiles() {
        return credentialProfiles;
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
        sb.append("SandboxConfig(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isPersistenceEnabled=").append(String.valueOf(this.isPersistenceEnabled));
        sb.append(", warmPoolConfig=").append(String.valueOf(this.warmPoolConfig));
        sb.append(", sandboxOutboundNetworkingConfig=")
                .append(String.valueOf(this.sandboxOutboundNetworkingConfig));
        sb.append(", credentialProfiles=").append(String.valueOf(this.credentialProfiles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxConfig)) {
            return false;
        }

        SandboxConfig other = (SandboxConfig) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.isPersistenceEnabled, other.isPersistenceEnabled)
                && java.util.Objects.equals(this.warmPoolConfig, other.warmPoolConfig)
                && java.util.Objects.equals(
                        this.sandboxOutboundNetworkingConfig, other.sandboxOutboundNetworkingConfig)
                && java.util.Objects.equals(this.credentialProfiles, other.credentialProfiles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isPersistenceEnabled == null
                                ? 43
                                : this.isPersistenceEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.warmPoolConfig == null ? 43 : this.warmPoolConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.sandboxOutboundNetworkingConfig == null
                                ? 43
                                : this.sandboxOutboundNetworkingConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialProfiles == null
                                ? 43
                                : this.credentialProfiles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
