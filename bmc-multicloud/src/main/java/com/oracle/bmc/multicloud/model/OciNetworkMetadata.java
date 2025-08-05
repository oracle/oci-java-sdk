/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * Oracle Cloud Infrastructure network anchor related meta data items <br>
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
        builder = OciNetworkMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciNetworkMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "networkAnchorConnectionStatus",
        "vcn",
        "dns",
        "subnets",
        "dnsListeningEndpointIpAddress",
        "dnsForwardingEndpointIpAddress",
        "dnsForwardingConfig"
    })
    public OciNetworkMetadata(
            NetworkAnchorConnectionStatus networkAnchorConnectionStatus,
            OciVcn vcn,
            OciDns dns,
            java.util.List<OciNetworkSubnet> subnets,
            String dnsListeningEndpointIpAddress,
            String dnsForwardingEndpointIpAddress,
            java.util.List<java.util.Map<String, String>> dnsForwardingConfig) {
        super();
        this.networkAnchorConnectionStatus = networkAnchorConnectionStatus;
        this.vcn = vcn;
        this.dns = dns;
        this.subnets = subnets;
        this.dnsListeningEndpointIpAddress = dnsListeningEndpointIpAddress;
        this.dnsForwardingEndpointIpAddress = dnsForwardingEndpointIpAddress;
        this.dnsForwardingConfig = dnsForwardingConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This can be merge to lifecycleState CONNECTED - Partner and CSI information is assigned
         * and MulticloudLink provisioned. DISCONNECTED - Only partner cloud information is
         * assigned. CONNECTING - Oracle Cloud Infrastructure information is assigned and the
         * control plane is provisioning resources. ACTIVE - Network anchor is connected and
         * resources (VNICs) exist within a subnet. ERROR - DRG attach fails during connection.
         * FAILED - Network anchor creation failed NEEDS_ATTENTION - Network anchor is in temporary
         * bad state UPDATING - Network anchor is getting updated. DELETING - Network anchor is
         * getting deleted DELETED - A connected network anchor is deleted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorConnectionStatus")
        private NetworkAnchorConnectionStatus networkAnchorConnectionStatus;

        /**
         * This can be merge to lifecycleState CONNECTED - Partner and CSI information is assigned
         * and MulticloudLink provisioned. DISCONNECTED - Only partner cloud information is
         * assigned. CONNECTING - Oracle Cloud Infrastructure information is assigned and the
         * control plane is provisioning resources. ACTIVE - Network anchor is connected and
         * resources (VNICs) exist within a subnet. ERROR - DRG attach fails during connection.
         * FAILED - Network anchor creation failed NEEDS_ATTENTION - Network anchor is in temporary
         * bad state UPDATING - Network anchor is getting updated. DELETING - Network anchor is
         * getting deleted DELETED - A connected network anchor is deleted.
         *
         * @param networkAnchorConnectionStatus the value to set
         * @return this builder
         */
        public Builder networkAnchorConnectionStatus(
                NetworkAnchorConnectionStatus networkAnchorConnectionStatus) {
            this.networkAnchorConnectionStatus = networkAnchorConnectionStatus;
            this.__explicitlySet__.add("networkAnchorConnectionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcn")
        private OciVcn vcn;

        public Builder vcn(OciVcn vcn) {
            this.vcn = vcn;
            this.__explicitlySet__.add("vcn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dns")
        private OciDns dns;

        public Builder dns(OciDns dns) {
            this.dns = dns;
            this.__explicitlySet__.add("dns");
            return this;
        }
        /** Network subnets */
        @com.fasterxml.jackson.annotation.JsonProperty("subnets")
        private java.util.List<OciNetworkSubnet> subnets;

        /**
         * Network subnets
         *
         * @param subnets the value to set
         * @return this builder
         */
        public Builder subnets(java.util.List<OciNetworkSubnet> subnets) {
            this.subnets = subnets;
            this.__explicitlySet__.add("subnets");
            return this;
        }
        /** The DNS Listener Endpoint Address. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsListeningEndpointIpAddress")
        private String dnsListeningEndpointIpAddress;

        /**
         * The DNS Listener Endpoint Address.
         *
         * @param dnsListeningEndpointIpAddress the value to set
         * @return this builder
         */
        public Builder dnsListeningEndpointIpAddress(String dnsListeningEndpointIpAddress) {
            this.dnsListeningEndpointIpAddress = dnsListeningEndpointIpAddress;
            this.__explicitlySet__.add("dnsListeningEndpointIpAddress");
            return this;
        }
        /** The DNS Listener Forwarding Address. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsForwardingEndpointIpAddress")
        private String dnsForwardingEndpointIpAddress;

        /**
         * The DNS Listener Forwarding Address.
         *
         * @param dnsForwardingEndpointIpAddress the value to set
         * @return this builder
         */
        public Builder dnsForwardingEndpointIpAddress(String dnsForwardingEndpointIpAddress) {
            this.dnsForwardingEndpointIpAddress = dnsForwardingEndpointIpAddress;
            this.__explicitlySet__.add("dnsForwardingEndpointIpAddress");
            return this;
        }
        /** DNS forward configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsForwardingConfig")
        private java.util.List<java.util.Map<String, String>> dnsForwardingConfig;

        /**
         * DNS forward configuration
         *
         * @param dnsForwardingConfig the value to set
         * @return this builder
         */
        public Builder dnsForwardingConfig(
                java.util.List<java.util.Map<String, String>> dnsForwardingConfig) {
            this.dnsForwardingConfig = dnsForwardingConfig;
            this.__explicitlySet__.add("dnsForwardingConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciNetworkMetadata build() {
            OciNetworkMetadata model =
                    new OciNetworkMetadata(
                            this.networkAnchorConnectionStatus,
                            this.vcn,
                            this.dns,
                            this.subnets,
                            this.dnsListeningEndpointIpAddress,
                            this.dnsForwardingEndpointIpAddress,
                            this.dnsForwardingConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciNetworkMetadata model) {
            if (model.wasPropertyExplicitlySet("networkAnchorConnectionStatus")) {
                this.networkAnchorConnectionStatus(model.getNetworkAnchorConnectionStatus());
            }
            if (model.wasPropertyExplicitlySet("vcn")) {
                this.vcn(model.getVcn());
            }
            if (model.wasPropertyExplicitlySet("dns")) {
                this.dns(model.getDns());
            }
            if (model.wasPropertyExplicitlySet("subnets")) {
                this.subnets(model.getSubnets());
            }
            if (model.wasPropertyExplicitlySet("dnsListeningEndpointIpAddress")) {
                this.dnsListeningEndpointIpAddress(model.getDnsListeningEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("dnsForwardingEndpointIpAddress")) {
                this.dnsForwardingEndpointIpAddress(model.getDnsForwardingEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("dnsForwardingConfig")) {
                this.dnsForwardingConfig(model.getDnsForwardingConfig());
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
     * This can be merge to lifecycleState CONNECTED - Partner and CSI information is assigned and
     * MulticloudLink provisioned. DISCONNECTED - Only partner cloud information is assigned.
     * CONNECTING - Oracle Cloud Infrastructure information is assigned and the control plane is
     * provisioning resources. ACTIVE - Network anchor is connected and resources (VNICs) exist
     * within a subnet. ERROR - DRG attach fails during connection. FAILED - Network anchor creation
     * failed NEEDS_ATTENTION - Network anchor is in temporary bad state UPDATING - Network anchor
     * is getting updated. DELETING - Network anchor is getting deleted DELETED - A connected
     * network anchor is deleted.
     */
    public enum NetworkAnchorConnectionStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Connected("CONNECTED"),
        Disconnected("DISCONNECTED"),
        Connecting("CONNECTING"),
        Active("ACTIVE"),
        Error("ERROR"),
        Updating("UPDATING"),
        NeedsAttention("NEEDS_ATTENTION"),
        Failed("FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NetworkAnchorConnectionStatus.class);

        private final String value;
        private static java.util.Map<String, NetworkAnchorConnectionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkAnchorConnectionStatus v : NetworkAnchorConnectionStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NetworkAnchorConnectionStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkAnchorConnectionStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetworkAnchorConnectionStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This can be merge to lifecycleState CONNECTED - Partner and CSI information is assigned and
     * MulticloudLink provisioned. DISCONNECTED - Only partner cloud information is assigned.
     * CONNECTING - Oracle Cloud Infrastructure information is assigned and the control plane is
     * provisioning resources. ACTIVE - Network anchor is connected and resources (VNICs) exist
     * within a subnet. ERROR - DRG attach fails during connection. FAILED - Network anchor creation
     * failed NEEDS_ATTENTION - Network anchor is in temporary bad state UPDATING - Network anchor
     * is getting updated. DELETING - Network anchor is getting deleted DELETED - A connected
     * network anchor is deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorConnectionStatus")
    private final NetworkAnchorConnectionStatus networkAnchorConnectionStatus;

    /**
     * This can be merge to lifecycleState CONNECTED - Partner and CSI information is assigned and
     * MulticloudLink provisioned. DISCONNECTED - Only partner cloud information is assigned.
     * CONNECTING - Oracle Cloud Infrastructure information is assigned and the control plane is
     * provisioning resources. ACTIVE - Network anchor is connected and resources (VNICs) exist
     * within a subnet. ERROR - DRG attach fails during connection. FAILED - Network anchor creation
     * failed NEEDS_ATTENTION - Network anchor is in temporary bad state UPDATING - Network anchor
     * is getting updated. DELETING - Network anchor is getting deleted DELETED - A connected
     * network anchor is deleted.
     *
     * @return the value
     */
    public NetworkAnchorConnectionStatus getNetworkAnchorConnectionStatus() {
        return networkAnchorConnectionStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vcn")
    private final OciVcn vcn;

    public OciVcn getVcn() {
        return vcn;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dns")
    private final OciDns dns;

    public OciDns getDns() {
        return dns;
    }

    /** Network subnets */
    @com.fasterxml.jackson.annotation.JsonProperty("subnets")
    private final java.util.List<OciNetworkSubnet> subnets;

    /**
     * Network subnets
     *
     * @return the value
     */
    public java.util.List<OciNetworkSubnet> getSubnets() {
        return subnets;
    }

    /** The DNS Listener Endpoint Address. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsListeningEndpointIpAddress")
    private final String dnsListeningEndpointIpAddress;

    /**
     * The DNS Listener Endpoint Address.
     *
     * @return the value
     */
    public String getDnsListeningEndpointIpAddress() {
        return dnsListeningEndpointIpAddress;
    }

    /** The DNS Listener Forwarding Address. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsForwardingEndpointIpAddress")
    private final String dnsForwardingEndpointIpAddress;

    /**
     * The DNS Listener Forwarding Address.
     *
     * @return the value
     */
    public String getDnsForwardingEndpointIpAddress() {
        return dnsForwardingEndpointIpAddress;
    }

    /** DNS forward configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsForwardingConfig")
    private final java.util.List<java.util.Map<String, String>> dnsForwardingConfig;

    /**
     * DNS forward configuration
     *
     * @return the value
     */
    public java.util.List<java.util.Map<String, String>> getDnsForwardingConfig() {
        return dnsForwardingConfig;
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
        sb.append("OciNetworkMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("networkAnchorConnectionStatus=")
                .append(String.valueOf(this.networkAnchorConnectionStatus));
        sb.append(", vcn=").append(String.valueOf(this.vcn));
        sb.append(", dns=").append(String.valueOf(this.dns));
        sb.append(", subnets=").append(String.valueOf(this.subnets));
        sb.append(", dnsListeningEndpointIpAddress=")
                .append(String.valueOf(this.dnsListeningEndpointIpAddress));
        sb.append(", dnsForwardingEndpointIpAddress=")
                .append(String.valueOf(this.dnsForwardingEndpointIpAddress));
        sb.append(", dnsForwardingConfig=").append(String.valueOf(this.dnsForwardingConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciNetworkMetadata)) {
            return false;
        }

        OciNetworkMetadata other = (OciNetworkMetadata) o;
        return java.util.Objects.equals(
                        this.networkAnchorConnectionStatus, other.networkAnchorConnectionStatus)
                && java.util.Objects.equals(this.vcn, other.vcn)
                && java.util.Objects.equals(this.dns, other.dns)
                && java.util.Objects.equals(this.subnets, other.subnets)
                && java.util.Objects.equals(
                        this.dnsListeningEndpointIpAddress, other.dnsListeningEndpointIpAddress)
                && java.util.Objects.equals(
                        this.dnsForwardingEndpointIpAddress, other.dnsForwardingEndpointIpAddress)
                && java.util.Objects.equals(this.dnsForwardingConfig, other.dnsForwardingConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.networkAnchorConnectionStatus == null
                                ? 43
                                : this.networkAnchorConnectionStatus.hashCode());
        result = (result * PRIME) + (this.vcn == null ? 43 : this.vcn.hashCode());
        result = (result * PRIME) + (this.dns == null ? 43 : this.dns.hashCode());
        result = (result * PRIME) + (this.subnets == null ? 43 : this.subnets.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsListeningEndpointIpAddress == null
                                ? 43
                                : this.dnsListeningEndpointIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsForwardingEndpointIpAddress == null
                                ? 43
                                : this.dnsForwardingEndpointIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsForwardingConfig == null
                                ? 43
                                : this.dnsForwardingConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
