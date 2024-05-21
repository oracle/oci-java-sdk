/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Analytics Instance Private Access Channel model.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PrivateAccessChannel.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PrivateAccessChannel extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "vcnId",
        "subnetId",
        "ipAddress",
        "egressSourceIpAddresses",
        "privateSourceDnsZones",
        "privateSourceScanHosts",
        "networkSecurityGroupIds"
    })
    public PrivateAccessChannel(
            String key,
            String displayName,
            String vcnId,
            String subnetId,
            String ipAddress,
            java.util.List<String> egressSourceIpAddresses,
            java.util.List<PrivateSourceDnsZone> privateSourceDnsZones,
            java.util.List<PrivateSourceScanHost> privateSourceScanHosts,
            java.util.List<String> networkSecurityGroupIds) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.ipAddress = ipAddress;
        this.egressSourceIpAddresses = egressSourceIpAddresses;
        this.privateSourceDnsZones = privateSourceDnsZones;
        this.privateSourceScanHosts = privateSourceScanHosts;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Private Access Channel unique identifier key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Private Access Channel unique identifier key.
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Display Name of the Private Access Channel.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display Name of the Private Access Channel.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * OCID of the customer VCN peered with private access channel.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * OCID of the customer VCN peered with private access channel.
         *
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * OCID of the customer subnet connected to private access channel.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * OCID of the customer subnet connected to private access channel.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * IP Address of the Private Access channel.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * IP Address of the Private Access channel.
         *
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The list of IP addresses from the customer subnet connected to private access channel, used as a source Ip by Private Access Channel
         * for network traffic from the AnalyticsInstance to Private Sources.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("egressSourceIpAddresses")
        private java.util.List<String> egressSourceIpAddresses;

        /**
         * The list of IP addresses from the customer subnet connected to private access channel, used as a source Ip by Private Access Channel
         * for network traffic from the AnalyticsInstance to Private Sources.
         *
         * @param egressSourceIpAddresses the value to set
         * @return this builder
         **/
        public Builder egressSourceIpAddresses(java.util.List<String> egressSourceIpAddresses) {
            this.egressSourceIpAddresses = egressSourceIpAddresses;
            this.__explicitlySet__.add("egressSourceIpAddresses");
            return this;
        }
        /**
         * List of Private Source DNS zones registered with Private Access Channel,
         * where datasource hostnames from these dns zones / domains will be resolved in the peered VCN for access from Analytics Instance.
         * Min of 1 is required and Max of 30 Private Source DNS zones can be registered.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateSourceDnsZones")
        private java.util.List<PrivateSourceDnsZone> privateSourceDnsZones;

        /**
         * List of Private Source DNS zones registered with Private Access Channel,
         * where datasource hostnames from these dns zones / domains will be resolved in the peered VCN for access from Analytics Instance.
         * Min of 1 is required and Max of 30 Private Source DNS zones can be registered.
         *
         * @param privateSourceDnsZones the value to set
         * @return this builder
         **/
        public Builder privateSourceDnsZones(
                java.util.List<PrivateSourceDnsZone> privateSourceDnsZones) {
            this.privateSourceDnsZones = privateSourceDnsZones;
            this.__explicitlySet__.add("privateSourceDnsZones");
            return this;
        }
        /**
         * List of Private Source DB SCAN hosts registered with Private Access Channel for access from Analytics Instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateSourceScanHosts")
        private java.util.List<PrivateSourceScanHost> privateSourceScanHosts;

        /**
         * List of Private Source DB SCAN hosts registered with Private Access Channel for access from Analytics Instance.
         *
         * @param privateSourceScanHosts the value to set
         * @return this builder
         **/
        public Builder privateSourceScanHosts(
                java.util.List<PrivateSourceScanHost> privateSourceScanHosts) {
            this.privateSourceScanHosts = privateSourceScanHosts;
            this.__explicitlySet__.add("privateSourceScanHosts");
            return this;
        }
        /**
         * Network Security Group OCIDs for an Analytics instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * Network Security Group OCIDs for an Analytics instance.
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         **/
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateAccessChannel build() {
            PrivateAccessChannel model =
                    new PrivateAccessChannel(
                            this.key,
                            this.displayName,
                            this.vcnId,
                            this.subnetId,
                            this.ipAddress,
                            this.egressSourceIpAddresses,
                            this.privateSourceDnsZones,
                            this.privateSourceScanHosts,
                            this.networkSecurityGroupIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateAccessChannel model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("egressSourceIpAddresses")) {
                this.egressSourceIpAddresses(model.getEgressSourceIpAddresses());
            }
            if (model.wasPropertyExplicitlySet("privateSourceDnsZones")) {
                this.privateSourceDnsZones(model.getPrivateSourceDnsZones());
            }
            if (model.wasPropertyExplicitlySet("privateSourceScanHosts")) {
                this.privateSourceScanHosts(model.getPrivateSourceScanHosts());
            }
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
            }
            return this;
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
     * Private Access Channel unique identifier key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Private Access Channel unique identifier key.
     *
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Display Name of the Private Access Channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display Name of the Private Access Channel.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * OCID of the customer VCN peered with private access channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * OCID of the customer VCN peered with private access channel.
     *
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * OCID of the customer subnet connected to private access channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * OCID of the customer subnet connected to private access channel.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * IP Address of the Private Access channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * IP Address of the Private Access channel.
     *
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The list of IP addresses from the customer subnet connected to private access channel, used as a source Ip by Private Access Channel
     * for network traffic from the AnalyticsInstance to Private Sources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("egressSourceIpAddresses")
    private final java.util.List<String> egressSourceIpAddresses;

    /**
     * The list of IP addresses from the customer subnet connected to private access channel, used as a source Ip by Private Access Channel
     * for network traffic from the AnalyticsInstance to Private Sources.
     *
     * @return the value
     **/
    public java.util.List<String> getEgressSourceIpAddresses() {
        return egressSourceIpAddresses;
    }

    /**
     * List of Private Source DNS zones registered with Private Access Channel,
     * where datasource hostnames from these dns zones / domains will be resolved in the peered VCN for access from Analytics Instance.
     * Min of 1 is required and Max of 30 Private Source DNS zones can be registered.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateSourceDnsZones")
    private final java.util.List<PrivateSourceDnsZone> privateSourceDnsZones;

    /**
     * List of Private Source DNS zones registered with Private Access Channel,
     * where datasource hostnames from these dns zones / domains will be resolved in the peered VCN for access from Analytics Instance.
     * Min of 1 is required and Max of 30 Private Source DNS zones can be registered.
     *
     * @return the value
     **/
    public java.util.List<PrivateSourceDnsZone> getPrivateSourceDnsZones() {
        return privateSourceDnsZones;
    }

    /**
     * List of Private Source DB SCAN hosts registered with Private Access Channel for access from Analytics Instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateSourceScanHosts")
    private final java.util.List<PrivateSourceScanHost> privateSourceScanHosts;

    /**
     * List of Private Source DB SCAN hosts registered with Private Access Channel for access from Analytics Instance.
     *
     * @return the value
     **/
    public java.util.List<PrivateSourceScanHost> getPrivateSourceScanHosts() {
        return privateSourceScanHosts;
    }

    /**
     * Network Security Group OCIDs for an Analytics instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * Network Security Group OCIDs for an Analytics instance.
     *
     * @return the value
     **/
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PrivateAccessChannel(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", egressSourceIpAddresses=")
                .append(String.valueOf(this.egressSourceIpAddresses));
        sb.append(", privateSourceDnsZones=").append(String.valueOf(this.privateSourceDnsZones));
        sb.append(", privateSourceScanHosts=").append(String.valueOf(this.privateSourceScanHosts));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateAccessChannel)) {
            return false;
        }

        PrivateAccessChannel other = (PrivateAccessChannel) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(
                        this.egressSourceIpAddresses, other.egressSourceIpAddresses)
                && java.util.Objects.equals(this.privateSourceDnsZones, other.privateSourceDnsZones)
                && java.util.Objects.equals(
                        this.privateSourceScanHosts, other.privateSourceScanHosts)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.egressSourceIpAddresses == null
                                ? 43
                                : this.egressSourceIpAddresses.hashCode());
        result =
                (result * PRIME)
                        + (this.privateSourceDnsZones == null
                                ? 43
                                : this.privateSourceDnsZones.hashCode());
        result =
                (result * PRIME)
                        + (this.privateSourceScanHosts == null
                                ? 43
                                : this.privateSourceScanHosts.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
