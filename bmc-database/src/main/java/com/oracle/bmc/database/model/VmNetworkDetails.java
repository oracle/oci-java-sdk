/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the client or backup networks in an Exadata VM cluster network. Applies to Exadata Cloud@Customer instances only.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VmNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VmNetworkDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vlanId",
        "networkType",
        "netmask",
        "gateway",
        "domainName",
        "nodes"
    })
    public VmNetworkDetails(
            String vlanId,
            NetworkType networkType,
            String netmask,
            String gateway,
            String domainName,
            java.util.List<NodeDetails> nodes) {
        super();
        this.vlanId = vlanId;
        this.networkType = networkType;
        this.netmask = netmask;
        this.gateway = gateway;
        this.domainName = domainName;
        this.nodes = nodes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The network VLAN ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * The network VLAN ID.
         * @param vlanId the value to set
         * @return this builder
         **/
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }
        /**
         * The network type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkType")
        private NetworkType networkType;

        /**
         * The network type.
         * @param networkType the value to set
         * @return this builder
         **/
        public Builder networkType(NetworkType networkType) {
            this.networkType = networkType;
            this.__explicitlySet__.add("networkType");
            return this;
        }
        /**
         * The network netmask.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netmask")
        private String netmask;

        /**
         * The network netmask.
         * @param netmask the value to set
         * @return this builder
         **/
        public Builder netmask(String netmask) {
            this.netmask = netmask;
            this.__explicitlySet__.add("netmask");
            return this;
        }
        /**
         * The network gateway.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gateway")
        private String gateway;

        /**
         * The network gateway.
         * @param gateway the value to set
         * @return this builder
         **/
        public Builder gateway(String gateway) {
            this.gateway = gateway;
            this.__explicitlySet__.add("gateway");
            return this;
        }
        /**
         * The network domain name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        /**
         * The network domain name.
         * @param domainName the value to set
         * @return this builder
         **/
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }
        /**
         * The list of node details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private java.util.List<NodeDetails> nodes;

        /**
         * The list of node details.
         * @param nodes the value to set
         * @return this builder
         **/
        public Builder nodes(java.util.List<NodeDetails> nodes) {
            this.nodes = nodes;
            this.__explicitlySet__.add("nodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmNetworkDetails build() {
            VmNetworkDetails model =
                    new VmNetworkDetails(
                            this.vlanId,
                            this.networkType,
                            this.netmask,
                            this.gateway,
                            this.domainName,
                            this.nodes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
            }
            if (model.wasPropertyExplicitlySet("networkType")) {
                this.networkType(model.getNetworkType());
            }
            if (model.wasPropertyExplicitlySet("netmask")) {
                this.netmask(model.getNetmask());
            }
            if (model.wasPropertyExplicitlySet("gateway")) {
                this.gateway(model.getGateway());
            }
            if (model.wasPropertyExplicitlySet("domainName")) {
                this.domainName(model.getDomainName());
            }
            if (model.wasPropertyExplicitlySet("nodes")) {
                this.nodes(model.getNodes());
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
     * The network VLAN ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * The network VLAN ID.
     * @return the value
     **/
    public String getVlanId() {
        return vlanId;
    }

    /**
     * The network type.
     **/
    public enum NetworkType {
        Client("CLIENT"),
        Backup("BACKUP"),
        DisasterRecovery("DISASTER_RECOVERY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NetworkType.class);

        private final String value;
        private static java.util.Map<String, NetworkType> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkType v : NetworkType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NetworkType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetworkType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The network type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    private final NetworkType networkType;

    /**
     * The network type.
     * @return the value
     **/
    public NetworkType getNetworkType() {
        return networkType;
    }

    /**
     * The network netmask.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netmask")
    private final String netmask;

    /**
     * The network netmask.
     * @return the value
     **/
    public String getNetmask() {
        return netmask;
    }

    /**
     * The network gateway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    private final String gateway;

    /**
     * The network gateway.
     * @return the value
     **/
    public String getGateway() {
        return gateway;
    }

    /**
     * The network domain name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    private final String domainName;

    /**
     * The network domain name.
     * @return the value
     **/
    public String getDomainName() {
        return domainName;
    }

    /**
     * The list of node details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.List<NodeDetails> nodes;

    /**
     * The list of node details.
     * @return the value
     **/
    public java.util.List<NodeDetails> getNodes() {
        return nodes;
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
        sb.append("VmNetworkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", networkType=").append(String.valueOf(this.networkType));
        sb.append(", netmask=").append(String.valueOf(this.netmask));
        sb.append(", gateway=").append(String.valueOf(this.gateway));
        sb.append(", domainName=").append(String.valueOf(this.domainName));
        sb.append(", nodes=").append(String.valueOf(this.nodes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmNetworkDetails)) {
            return false;
        }

        VmNetworkDetails other = (VmNetworkDetails) o;
        return java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.networkType, other.networkType)
                && java.util.Objects.equals(this.netmask, other.netmask)
                && java.util.Objects.equals(this.gateway, other.gateway)
                && java.util.Objects.equals(this.domainName, other.domainName)
                && java.util.Objects.equals(this.nodes, other.nodes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result = (result * PRIME) + (this.networkType == null ? 43 : this.networkType.hashCode());
        result = (result * PRIME) + (this.netmask == null ? 43 : this.netmask.hashCode());
        result = (result * PRIME) + (this.gateway == null ? 43 : this.gateway.hashCode());
        result = (result * PRIME) + (this.domainName == null ? 43 : this.domainName.hashCode());
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
