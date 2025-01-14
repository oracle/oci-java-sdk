/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The configuration to update on an existing OpenSearch cluster. Software version and security
 * config are not allowed to be updated at the same time. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOpensearchClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOpensearchClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "softwareVersion",
        "securityMode",
        "securityMasterUserName",
        "securityMasterUserPasswordHash",
        "securitySamlConfig",
        "backupPolicy",
        "reverseConnectionEndpointCustomerIps",
        "outboundClusterConfig",
        "maintenanceDetails",
        "freeformTags",
        "definedTags"
    })
    public UpdateOpensearchClusterDetails(
            String displayName,
            String softwareVersion,
            SecurityMode securityMode,
            String securityMasterUserName,
            String securityMasterUserPasswordHash,
            SecuritySamlConfig securitySamlConfig,
            BackupPolicy backupPolicy,
            java.util.List<String> reverseConnectionEndpointCustomerIps,
            OutboundClusterConfig outboundClusterConfig,
            UpdateMaintenanceDetails maintenanceDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.softwareVersion = softwareVersion;
        this.securityMode = securityMode;
        this.securityMasterUserName = securityMasterUserName;
        this.securityMasterUserPasswordHash = securityMasterUserPasswordHash;
        this.securitySamlConfig = securitySamlConfig;
        this.backupPolicy = backupPolicy;
        this.reverseConnectionEndpointCustomerIps = reverseConnectionEndpointCustomerIps;
        this.outboundClusterConfig = outboundClusterConfig;
        this.maintenanceDetails = maintenanceDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the cluster. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the cluster. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
        private String softwareVersion;

        public Builder softwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            this.__explicitlySet__.add("softwareVersion");
            return this;
        }
        /** The security mode of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityMode")
        private SecurityMode securityMode;

        /**
         * The security mode of the cluster.
         *
         * @param securityMode the value to set
         * @return this builder
         */
        public Builder securityMode(SecurityMode securityMode) {
            this.securityMode = securityMode;
            this.__explicitlySet__.add("securityMode");
            return this;
        }
        /** The name of the master user that are used to manage security config */
        @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserName")
        private String securityMasterUserName;

        /**
         * The name of the master user that are used to manage security config
         *
         * @param securityMasterUserName the value to set
         * @return this builder
         */
        public Builder securityMasterUserName(String securityMasterUserName) {
            this.securityMasterUserName = securityMasterUserName;
            this.__explicitlySet__.add("securityMasterUserName");
            return this;
        }
        /** The password hash of the master user that are used to manage security config */
        @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserPasswordHash")
        private String securityMasterUserPasswordHash;

        /**
         * The password hash of the master user that are used to manage security config
         *
         * @param securityMasterUserPasswordHash the value to set
         * @return this builder
         */
        public Builder securityMasterUserPasswordHash(String securityMasterUserPasswordHash) {
            this.securityMasterUserPasswordHash = securityMasterUserPasswordHash;
            this.__explicitlySet__.add("securityMasterUserPasswordHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securitySamlConfig")
        private SecuritySamlConfig securitySamlConfig;

        public Builder securitySamlConfig(SecuritySamlConfig securitySamlConfig) {
            this.securitySamlConfig = securitySamlConfig;
            this.__explicitlySet__.add("securitySamlConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
        private BackupPolicy backupPolicy;

        public Builder backupPolicy(BackupPolicy backupPolicy) {
            this.backupPolicy = backupPolicy;
            this.__explicitlySet__.add("backupPolicy");
            return this;
        }
        /** The customer IP addresses of the endpoint in customer VCN */
        @com.fasterxml.jackson.annotation.JsonProperty("reverseConnectionEndpointCustomerIps")
        private java.util.List<String> reverseConnectionEndpointCustomerIps;

        /**
         * The customer IP addresses of the endpoint in customer VCN
         *
         * @param reverseConnectionEndpointCustomerIps the value to set
         * @return this builder
         */
        public Builder reverseConnectionEndpointCustomerIps(
                java.util.List<String> reverseConnectionEndpointCustomerIps) {
            this.reverseConnectionEndpointCustomerIps = reverseConnectionEndpointCustomerIps;
            this.__explicitlySet__.add("reverseConnectionEndpointCustomerIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outboundClusterConfig")
        private OutboundClusterConfig outboundClusterConfig;

        public Builder outboundClusterConfig(OutboundClusterConfig outboundClusterConfig) {
            this.outboundClusterConfig = outboundClusterConfig;
            this.__explicitlySet__.add("outboundClusterConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceDetails")
        private UpdateMaintenanceDetails maintenanceDetails;

        public Builder maintenanceDetails(UpdateMaintenanceDetails maintenanceDetails) {
            this.maintenanceDetails = maintenanceDetails;
            this.__explicitlySet__.add("maintenanceDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOpensearchClusterDetails build() {
            UpdateOpensearchClusterDetails model =
                    new UpdateOpensearchClusterDetails(
                            this.displayName,
                            this.softwareVersion,
                            this.securityMode,
                            this.securityMasterUserName,
                            this.securityMasterUserPasswordHash,
                            this.securitySamlConfig,
                            this.backupPolicy,
                            this.reverseConnectionEndpointCustomerIps,
                            this.outboundClusterConfig,
                            this.maintenanceDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOpensearchClusterDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("securityMode")) {
                this.securityMode(model.getSecurityMode());
            }
            if (model.wasPropertyExplicitlySet("securityMasterUserName")) {
                this.securityMasterUserName(model.getSecurityMasterUserName());
            }
            if (model.wasPropertyExplicitlySet("securityMasterUserPasswordHash")) {
                this.securityMasterUserPasswordHash(model.getSecurityMasterUserPasswordHash());
            }
            if (model.wasPropertyExplicitlySet("securitySamlConfig")) {
                this.securitySamlConfig(model.getSecuritySamlConfig());
            }
            if (model.wasPropertyExplicitlySet("backupPolicy")) {
                this.backupPolicy(model.getBackupPolicy());
            }
            if (model.wasPropertyExplicitlySet("reverseConnectionEndpointCustomerIps")) {
                this.reverseConnectionEndpointCustomerIps(
                        model.getReverseConnectionEndpointCustomerIps());
            }
            if (model.wasPropertyExplicitlySet("outboundClusterConfig")) {
                this.outboundClusterConfig(model.getOutboundClusterConfig());
            }
            if (model.wasPropertyExplicitlySet("maintenanceDetails")) {
                this.maintenanceDetails(model.getMaintenanceDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The name of the cluster. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the cluster. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
    private final String softwareVersion;

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /** The security mode of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityMode")
    private final SecurityMode securityMode;

    /**
     * The security mode of the cluster.
     *
     * @return the value
     */
    public SecurityMode getSecurityMode() {
        return securityMode;
    }

    /** The name of the master user that are used to manage security config */
    @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserName")
    private final String securityMasterUserName;

    /**
     * The name of the master user that are used to manage security config
     *
     * @return the value
     */
    public String getSecurityMasterUserName() {
        return securityMasterUserName;
    }

    /** The password hash of the master user that are used to manage security config */
    @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserPasswordHash")
    private final String securityMasterUserPasswordHash;

    /**
     * The password hash of the master user that are used to manage security config
     *
     * @return the value
     */
    public String getSecurityMasterUserPasswordHash() {
        return securityMasterUserPasswordHash;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("securitySamlConfig")
    private final SecuritySamlConfig securitySamlConfig;

    public SecuritySamlConfig getSecuritySamlConfig() {
        return securitySamlConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
    private final BackupPolicy backupPolicy;

    public BackupPolicy getBackupPolicy() {
        return backupPolicy;
    }

    /** The customer IP addresses of the endpoint in customer VCN */
    @com.fasterxml.jackson.annotation.JsonProperty("reverseConnectionEndpointCustomerIps")
    private final java.util.List<String> reverseConnectionEndpointCustomerIps;

    /**
     * The customer IP addresses of the endpoint in customer VCN
     *
     * @return the value
     */
    public java.util.List<String> getReverseConnectionEndpointCustomerIps() {
        return reverseConnectionEndpointCustomerIps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outboundClusterConfig")
    private final OutboundClusterConfig outboundClusterConfig;

    public OutboundClusterConfig getOutboundClusterConfig() {
        return outboundClusterConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceDetails")
    private final UpdateMaintenanceDetails maintenanceDetails;

    public UpdateMaintenanceDetails getMaintenanceDetails() {
        return maintenanceDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateOpensearchClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", securityMode=").append(String.valueOf(this.securityMode));
        sb.append(", securityMasterUserName=").append(String.valueOf(this.securityMasterUserName));
        sb.append(", securityMasterUserPasswordHash=")
                .append(String.valueOf(this.securityMasterUserPasswordHash));
        sb.append(", securitySamlConfig=").append(String.valueOf(this.securitySamlConfig));
        sb.append(", backupPolicy=").append(String.valueOf(this.backupPolicy));
        sb.append(", reverseConnectionEndpointCustomerIps=")
                .append(String.valueOf(this.reverseConnectionEndpointCustomerIps));
        sb.append(", outboundClusterConfig=").append(String.valueOf(this.outboundClusterConfig));
        sb.append(", maintenanceDetails=").append(String.valueOf(this.maintenanceDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOpensearchClusterDetails)) {
            return false;
        }

        UpdateOpensearchClusterDetails other = (UpdateOpensearchClusterDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(this.securityMode, other.securityMode)
                && java.util.Objects.equals(
                        this.securityMasterUserName, other.securityMasterUserName)
                && java.util.Objects.equals(
                        this.securityMasterUserPasswordHash, other.securityMasterUserPasswordHash)
                && java.util.Objects.equals(this.securitySamlConfig, other.securitySamlConfig)
                && java.util.Objects.equals(this.backupPolicy, other.backupPolicy)
                && java.util.Objects.equals(
                        this.reverseConnectionEndpointCustomerIps,
                        other.reverseConnectionEndpointCustomerIps)
                && java.util.Objects.equals(this.outboundClusterConfig, other.outboundClusterConfig)
                && java.util.Objects.equals(this.maintenanceDetails, other.maintenanceDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result = (result * PRIME) + (this.securityMode == null ? 43 : this.securityMode.hashCode());
        result =
                (result * PRIME)
                        + (this.securityMasterUserName == null
                                ? 43
                                : this.securityMasterUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.securityMasterUserPasswordHash == null
                                ? 43
                                : this.securityMasterUserPasswordHash.hashCode());
        result =
                (result * PRIME)
                        + (this.securitySamlConfig == null
                                ? 43
                                : this.securitySamlConfig.hashCode());
        result = (result * PRIME) + (this.backupPolicy == null ? 43 : this.backupPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.reverseConnectionEndpointCustomerIps == null
                                ? 43
                                : this.reverseConnectionEndpointCustomerIps.hashCode());
        result =
                (result * PRIME)
                        + (this.outboundClusterConfig == null
                                ? 43
                                : this.outboundClusterConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceDetails == null
                                ? 43
                                : this.maintenanceDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
