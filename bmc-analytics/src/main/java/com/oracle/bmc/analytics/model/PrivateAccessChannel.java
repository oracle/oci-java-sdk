/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
public final class PrivateAccessChannel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "vcnId",
        "subnetId",
        "ipAddress",
        "egressSourceIpAddresses",
        "privateSourceDnsZones"
    })
    public PrivateAccessChannel(
            String key,
            String displayName,
            String vcnId,
            String subnetId,
            String ipAddress,
            java.util.List<String> egressSourceIpAddresses,
            java.util.List<PrivateSourceDnsZone> privateSourceDnsZones) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.ipAddress = ipAddress;
        this.egressSourceIpAddresses = egressSourceIpAddresses;
        this.privateSourceDnsZones = privateSourceDnsZones;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("egressSourceIpAddresses")
        private java.util.List<String> egressSourceIpAddresses;

        public Builder egressSourceIpAddresses(java.util.List<String> egressSourceIpAddresses) {
            this.egressSourceIpAddresses = egressSourceIpAddresses;
            this.__explicitlySet__.add("egressSourceIpAddresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateSourceDnsZones")
        private java.util.List<PrivateSourceDnsZone> privateSourceDnsZones;

        public Builder privateSourceDnsZones(
                java.util.List<PrivateSourceDnsZone> privateSourceDnsZones) {
            this.privateSourceDnsZones = privateSourceDnsZones;
            this.__explicitlySet__.add("privateSourceDnsZones");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateAccessChannel build() {
            PrivateAccessChannel __instance__ =
                    new PrivateAccessChannel(
                            key,
                            displayName,
                            vcnId,
                            subnetId,
                            ipAddress,
                            egressSourceIpAddresses,
                            privateSourceDnsZones);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateAccessChannel o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .vcnId(o.getVcnId())
                            .subnetId(o.getSubnetId())
                            .ipAddress(o.getIpAddress())
                            .egressSourceIpAddresses(o.getEgressSourceIpAddresses())
                            .privateSourceDnsZones(o.getPrivateSourceDnsZones());

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
     * Private Access Channel unique identifier key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * Display Name of the Private Access Channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * OCID of the customer VCN peered with private access channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    public String getVcnId() {
        return vcnId;
    }

    /**
     * OCID of the customer subnet connected to private access channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    public String getSubnetId() {
        return subnetId;
    }

    /**
     * IP Address of the Private Access channel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

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

    public java.util.List<PrivateSourceDnsZone> getPrivateSourceDnsZones() {
        return privateSourceDnsZones;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PrivateAccessChannel(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", egressSourceIpAddresses=")
                .append(String.valueOf(this.egressSourceIpAddresses));
        sb.append(", privateSourceDnsZones=").append(String.valueOf(this.privateSourceDnsZones));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
