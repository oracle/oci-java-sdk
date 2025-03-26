/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * Configuration information for the Compute Cloud@Customer infrastructure. This
 * network configuration information cannot be updated and is retrieved from the data center.
 * The information will only be available
 * after the connectionState is transitioned to CONNECTED.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CccInfrastructureNetworkConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CccInfrastructureNetworkConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managementNodes",
        "uplinkPortSpeedInGbps",
        "uplinkPortCount",
        "uplinkVlanMtu",
        "uplinkNetmask",
        "uplinkPortForwardErrorCorrection",
        "uplinkDomain",
        "uplinkGatewayIp",
        "spineIps",
        "spineVip",
        "mgmtVipHostname",
        "mgmtVipIp",
        "dnsIps",
        "infrastructureRoutingStatic",
        "infrastructureRoutingDynamic"
    })
    public CccInfrastructureNetworkConfiguration(
            java.util.List<CccInfrastructureManagementNode> managementNodes,
            Integer uplinkPortSpeedInGbps,
            Integer uplinkPortCount,
            Integer uplinkVlanMtu,
            String uplinkNetmask,
            UplinkPortForwardErrorCorrection uplinkPortForwardErrorCorrection,
            String uplinkDomain,
            String uplinkGatewayIp,
            java.util.List<String> spineIps,
            String spineVip,
            String mgmtVipHostname,
            String mgmtVipIp,
            java.util.List<String> dnsIps,
            CccInfrastructureRoutingStaticDetails infrastructureRoutingStatic,
            CccInfrastructureRoutingDynamicDetails infrastructureRoutingDynamic) {
        super();
        this.managementNodes = managementNodes;
        this.uplinkPortSpeedInGbps = uplinkPortSpeedInGbps;
        this.uplinkPortCount = uplinkPortCount;
        this.uplinkVlanMtu = uplinkVlanMtu;
        this.uplinkNetmask = uplinkNetmask;
        this.uplinkPortForwardErrorCorrection = uplinkPortForwardErrorCorrection;
        this.uplinkDomain = uplinkDomain;
        this.uplinkGatewayIp = uplinkGatewayIp;
        this.spineIps = spineIps;
        this.spineVip = spineVip;
        this.mgmtVipHostname = mgmtVipHostname;
        this.mgmtVipIp = mgmtVipIp;
        this.dnsIps = dnsIps;
        this.infrastructureRoutingStatic = infrastructureRoutingStatic;
        this.infrastructureRoutingDynamic = infrastructureRoutingDynamic;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Information about the management nodes that are provisioned in the Compute Cloud@Customer
         * infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementNodes")
        private java.util.List<CccInfrastructureManagementNode> managementNodes;

        /**
         * Information about the management nodes that are provisioned in the Compute Cloud@Customer
         * infrastructure.
         *
         * @param managementNodes the value to set
         * @return this builder
         **/
        public Builder managementNodes(
                java.util.List<CccInfrastructureManagementNode> managementNodes) {
            this.managementNodes = managementNodes;
            this.__explicitlySet__.add("managementNodes");
            return this;
        }
        /**
         * Uplink port speed defined in gigabytes per second.
         * All uplink ports must have identical speed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uplinkPortSpeedInGbps")
        private Integer uplinkPortSpeedInGbps;

        /**
         * Uplink port speed defined in gigabytes per second.
         * All uplink ports must have identical speed.
         *
         * @param uplinkPortSpeedInGbps the value to set
         * @return this builder
         **/
        public Builder uplinkPortSpeedInGbps(Integer uplinkPortSpeedInGbps) {
            this.uplinkPortSpeedInGbps = uplinkPortSpeedInGbps;
            this.__explicitlySet__.add("uplinkPortSpeedInGbps");
            return this;
        }
        /**
         * Number of uplink ports per spine switch. Connectivity is identical on both spine switches.
         * For example, if input is two 100 gigabyte ports; then port-1 and port-2 on both spines will be configured.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uplinkPortCount")
        private Integer uplinkPortCount;

        /**
         * Number of uplink ports per spine switch. Connectivity is identical on both spine switches.
         * For example, if input is two 100 gigabyte ports; then port-1 and port-2 on both spines will be configured.
         *
         * @param uplinkPortCount the value to set
         * @return this builder
         **/
        public Builder uplinkPortCount(Integer uplinkPortCount) {
            this.uplinkPortCount = uplinkPortCount;
            this.__explicitlySet__.add("uplinkPortCount");
            return this;
        }
        /**
         * The virtual local area network (VLAN) maximum transmission unit (MTU) size
         * for the uplink ports.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uplinkVlanMtu")
        private Integer uplinkVlanMtu;

        /**
         * The virtual local area network (VLAN) maximum transmission unit (MTU) size
         * for the uplink ports.
         *
         * @param uplinkVlanMtu the value to set
         * @return this builder
         **/
        public Builder uplinkVlanMtu(Integer uplinkVlanMtu) {
            this.uplinkVlanMtu = uplinkVlanMtu;
            this.__explicitlySet__.add("uplinkVlanMtu");
            return this;
        }
        /**
         * Netmask of the subnet that the Compute Cloud@Customer infrastructure is
         * connected to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uplinkNetmask")
        private String uplinkNetmask;

        /**
         * Netmask of the subnet that the Compute Cloud@Customer infrastructure is
         * connected to.
         *
         * @param uplinkNetmask the value to set
         * @return this builder
         **/
        public Builder uplinkNetmask(String uplinkNetmask) {
            this.uplinkNetmask = uplinkNetmask;
            this.__explicitlySet__.add("uplinkNetmask");
            return this;
        }
        /**
         * The port forward error correction (FEC) setting for the uplink port on the
         * Compute Cloud@Customer infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uplinkPortForwardErrorCorrection")
        private UplinkPortForwardErrorCorrection uplinkPortForwardErrorCorrection;

        /**
         * The port forward error correction (FEC) setting for the uplink port on the
         * Compute Cloud@Customer infrastructure.
         *
         * @param uplinkPortForwardErrorCorrection the value to set
         * @return this builder
         **/
        public Builder uplinkPortForwardErrorCorrection(
                UplinkPortForwardErrorCorrection uplinkPortForwardErrorCorrection) {
            this.uplinkPortForwardErrorCorrection = uplinkPortForwardErrorCorrection;
            this.__explicitlySet__.add("uplinkPortForwardErrorCorrection");
            return this;
        }
        /**
         * Domain name to be used as the base domain for the internal network and by
         * public facing services.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uplinkDomain")
        private String uplinkDomain;

        /**
         * Domain name to be used as the base domain for the internal network and by
         * public facing services.
         *
         * @param uplinkDomain the value to set
         * @return this builder
         **/
        public Builder uplinkDomain(String uplinkDomain) {
            this.uplinkDomain = uplinkDomain;
            this.__explicitlySet__.add("uplinkDomain");
            return this;
        }
        /**
         * Uplink gateway in the datacenter network that the Compute Cloud@Customer
         * connects to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uplinkGatewayIp")
        private String uplinkGatewayIp;

        /**
         * Uplink gateway in the datacenter network that the Compute Cloud@Customer
         * connects to.
         *
         * @param uplinkGatewayIp the value to set
         * @return this builder
         **/
        public Builder uplinkGatewayIp(String uplinkGatewayIp) {
            this.uplinkGatewayIp = uplinkGatewayIp;
            this.__explicitlySet__.add("uplinkGatewayIp");
            return this;
        }
        /**
         * Addresses of the network spine switches.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spineIps")
        private java.util.List<String> spineIps;

        /**
         * Addresses of the network spine switches.
         * @param spineIps the value to set
         * @return this builder
         **/
        public Builder spineIps(java.util.List<String> spineIps) {
            this.spineIps = spineIps;
            this.__explicitlySet__.add("spineIps");
            return this;
        }
        /**
         * The spine switch public virtual IP (VIP). Traffic routed to the
         * Compute Cloud@Customer infrastructure and
         * and virtual cloud networks (VCNs) should have this address as next hop.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spineVip")
        private String spineVip;

        /**
         * The spine switch public virtual IP (VIP). Traffic routed to the
         * Compute Cloud@Customer infrastructure and
         * and virtual cloud networks (VCNs) should have this address as next hop.
         *
         * @param spineVip the value to set
         * @return this builder
         **/
        public Builder spineVip(String spineVip) {
            this.spineVip = spineVip;
            this.__explicitlySet__.add("spineVip");
            return this;
        }
        /**
         * The hostname corresponding to the virtual IP (VIP) address of the management nodes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mgmtVipHostname")
        private String mgmtVipHostname;

        /**
         * The hostname corresponding to the virtual IP (VIP) address of the management nodes.
         *
         * @param mgmtVipHostname the value to set
         * @return this builder
         **/
        public Builder mgmtVipHostname(String mgmtVipHostname) {
            this.mgmtVipHostname = mgmtVipHostname;
            this.__explicitlySet__.add("mgmtVipHostname");
            return this;
        }
        /**
         * The IP address used as the virtual IP (VIP) address of the management nodes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mgmtVipIp")
        private String mgmtVipIp;

        /**
         * The IP address used as the virtual IP (VIP) address of the management nodes.
         * @param mgmtVipIp the value to set
         * @return this builder
         **/
        public Builder mgmtVipIp(String mgmtVipIp) {
            this.mgmtVipIp = mgmtVipIp;
            this.__explicitlySet__.add("mgmtVipIp");
            return this;
        }
        /**
         * The domain name system (DNS) addresses that the Compute Cloud@Customer infrastructure
         * uses for the data center network.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsIps")
        private java.util.List<String> dnsIps;

        /**
         * The domain name system (DNS) addresses that the Compute Cloud@Customer infrastructure
         * uses for the data center network.
         *
         * @param dnsIps the value to set
         * @return this builder
         **/
        public Builder dnsIps(java.util.List<String> dnsIps) {
            this.dnsIps = dnsIps;
            this.__explicitlySet__.add("dnsIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureRoutingStatic")
        private CccInfrastructureRoutingStaticDetails infrastructureRoutingStatic;

        public Builder infrastructureRoutingStatic(
                CccInfrastructureRoutingStaticDetails infrastructureRoutingStatic) {
            this.infrastructureRoutingStatic = infrastructureRoutingStatic;
            this.__explicitlySet__.add("infrastructureRoutingStatic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureRoutingDynamic")
        private CccInfrastructureRoutingDynamicDetails infrastructureRoutingDynamic;

        public Builder infrastructureRoutingDynamic(
                CccInfrastructureRoutingDynamicDetails infrastructureRoutingDynamic) {
            this.infrastructureRoutingDynamic = infrastructureRoutingDynamic;
            this.__explicitlySet__.add("infrastructureRoutingDynamic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CccInfrastructureNetworkConfiguration build() {
            CccInfrastructureNetworkConfiguration model =
                    new CccInfrastructureNetworkConfiguration(
                            this.managementNodes,
                            this.uplinkPortSpeedInGbps,
                            this.uplinkPortCount,
                            this.uplinkVlanMtu,
                            this.uplinkNetmask,
                            this.uplinkPortForwardErrorCorrection,
                            this.uplinkDomain,
                            this.uplinkGatewayIp,
                            this.spineIps,
                            this.spineVip,
                            this.mgmtVipHostname,
                            this.mgmtVipIp,
                            this.dnsIps,
                            this.infrastructureRoutingStatic,
                            this.infrastructureRoutingDynamic);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CccInfrastructureNetworkConfiguration model) {
            if (model.wasPropertyExplicitlySet("managementNodes")) {
                this.managementNodes(model.getManagementNodes());
            }
            if (model.wasPropertyExplicitlySet("uplinkPortSpeedInGbps")) {
                this.uplinkPortSpeedInGbps(model.getUplinkPortSpeedInGbps());
            }
            if (model.wasPropertyExplicitlySet("uplinkPortCount")) {
                this.uplinkPortCount(model.getUplinkPortCount());
            }
            if (model.wasPropertyExplicitlySet("uplinkVlanMtu")) {
                this.uplinkVlanMtu(model.getUplinkVlanMtu());
            }
            if (model.wasPropertyExplicitlySet("uplinkNetmask")) {
                this.uplinkNetmask(model.getUplinkNetmask());
            }
            if (model.wasPropertyExplicitlySet("uplinkPortForwardErrorCorrection")) {
                this.uplinkPortForwardErrorCorrection(model.getUplinkPortForwardErrorCorrection());
            }
            if (model.wasPropertyExplicitlySet("uplinkDomain")) {
                this.uplinkDomain(model.getUplinkDomain());
            }
            if (model.wasPropertyExplicitlySet("uplinkGatewayIp")) {
                this.uplinkGatewayIp(model.getUplinkGatewayIp());
            }
            if (model.wasPropertyExplicitlySet("spineIps")) {
                this.spineIps(model.getSpineIps());
            }
            if (model.wasPropertyExplicitlySet("spineVip")) {
                this.spineVip(model.getSpineVip());
            }
            if (model.wasPropertyExplicitlySet("mgmtVipHostname")) {
                this.mgmtVipHostname(model.getMgmtVipHostname());
            }
            if (model.wasPropertyExplicitlySet("mgmtVipIp")) {
                this.mgmtVipIp(model.getMgmtVipIp());
            }
            if (model.wasPropertyExplicitlySet("dnsIps")) {
                this.dnsIps(model.getDnsIps());
            }
            if (model.wasPropertyExplicitlySet("infrastructureRoutingStatic")) {
                this.infrastructureRoutingStatic(model.getInfrastructureRoutingStatic());
            }
            if (model.wasPropertyExplicitlySet("infrastructureRoutingDynamic")) {
                this.infrastructureRoutingDynamic(model.getInfrastructureRoutingDynamic());
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
     * Information about the management nodes that are provisioned in the Compute Cloud@Customer
     * infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementNodes")
    private final java.util.List<CccInfrastructureManagementNode> managementNodes;

    /**
     * Information about the management nodes that are provisioned in the Compute Cloud@Customer
     * infrastructure.
     *
     * @return the value
     **/
    public java.util.List<CccInfrastructureManagementNode> getManagementNodes() {
        return managementNodes;
    }

    /**
     * Uplink port speed defined in gigabytes per second.
     * All uplink ports must have identical speed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uplinkPortSpeedInGbps")
    private final Integer uplinkPortSpeedInGbps;

    /**
     * Uplink port speed defined in gigabytes per second.
     * All uplink ports must have identical speed.
     *
     * @return the value
     **/
    public Integer getUplinkPortSpeedInGbps() {
        return uplinkPortSpeedInGbps;
    }

    /**
     * Number of uplink ports per spine switch. Connectivity is identical on both spine switches.
     * For example, if input is two 100 gigabyte ports; then port-1 and port-2 on both spines will be configured.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uplinkPortCount")
    private final Integer uplinkPortCount;

    /**
     * Number of uplink ports per spine switch. Connectivity is identical on both spine switches.
     * For example, if input is two 100 gigabyte ports; then port-1 and port-2 on both spines will be configured.
     *
     * @return the value
     **/
    public Integer getUplinkPortCount() {
        return uplinkPortCount;
    }

    /**
     * The virtual local area network (VLAN) maximum transmission unit (MTU) size
     * for the uplink ports.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uplinkVlanMtu")
    private final Integer uplinkVlanMtu;

    /**
     * The virtual local area network (VLAN) maximum transmission unit (MTU) size
     * for the uplink ports.
     *
     * @return the value
     **/
    public Integer getUplinkVlanMtu() {
        return uplinkVlanMtu;
    }

    /**
     * Netmask of the subnet that the Compute Cloud@Customer infrastructure is
     * connected to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uplinkNetmask")
    private final String uplinkNetmask;

    /**
     * Netmask of the subnet that the Compute Cloud@Customer infrastructure is
     * connected to.
     *
     * @return the value
     **/
    public String getUplinkNetmask() {
        return uplinkNetmask;
    }

    /**
     * The port forward error correction (FEC) setting for the uplink port on the
     * Compute Cloud@Customer infrastructure.
     *
     **/
    public enum UplinkPortForwardErrorCorrection {
        Auto("AUTO"),
        FireCodeFec("FIRE_CODE_FEC"),
        ReedSolomonConsortium16("REED_SOLOMON_CONSORTIUM_16"),
        ReedSolomonFec("REED_SOLOMON_FEC"),
        ReedSolomonIeee("REED_SOLOMON_IEEE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UplinkPortForwardErrorCorrection.class);

        private final String value;
        private static java.util.Map<String, UplinkPortForwardErrorCorrection> map;

        static {
            map = new java.util.HashMap<>();
            for (UplinkPortForwardErrorCorrection v : UplinkPortForwardErrorCorrection.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UplinkPortForwardErrorCorrection(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UplinkPortForwardErrorCorrection create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UplinkPortForwardErrorCorrection', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The port forward error correction (FEC) setting for the uplink port on the
     * Compute Cloud@Customer infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uplinkPortForwardErrorCorrection")
    private final UplinkPortForwardErrorCorrection uplinkPortForwardErrorCorrection;

    /**
     * The port forward error correction (FEC) setting for the uplink port on the
     * Compute Cloud@Customer infrastructure.
     *
     * @return the value
     **/
    public UplinkPortForwardErrorCorrection getUplinkPortForwardErrorCorrection() {
        return uplinkPortForwardErrorCorrection;
    }

    /**
     * Domain name to be used as the base domain for the internal network and by
     * public facing services.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uplinkDomain")
    private final String uplinkDomain;

    /**
     * Domain name to be used as the base domain for the internal network and by
     * public facing services.
     *
     * @return the value
     **/
    public String getUplinkDomain() {
        return uplinkDomain;
    }

    /**
     * Uplink gateway in the datacenter network that the Compute Cloud@Customer
     * connects to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uplinkGatewayIp")
    private final String uplinkGatewayIp;

    /**
     * Uplink gateway in the datacenter network that the Compute Cloud@Customer
     * connects to.
     *
     * @return the value
     **/
    public String getUplinkGatewayIp() {
        return uplinkGatewayIp;
    }

    /**
     * Addresses of the network spine switches.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spineIps")
    private final java.util.List<String> spineIps;

    /**
     * Addresses of the network spine switches.
     * @return the value
     **/
    public java.util.List<String> getSpineIps() {
        return spineIps;
    }

    /**
     * The spine switch public virtual IP (VIP). Traffic routed to the
     * Compute Cloud@Customer infrastructure and
     * and virtual cloud networks (VCNs) should have this address as next hop.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spineVip")
    private final String spineVip;

    /**
     * The spine switch public virtual IP (VIP). Traffic routed to the
     * Compute Cloud@Customer infrastructure and
     * and virtual cloud networks (VCNs) should have this address as next hop.
     *
     * @return the value
     **/
    public String getSpineVip() {
        return spineVip;
    }

    /**
     * The hostname corresponding to the virtual IP (VIP) address of the management nodes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mgmtVipHostname")
    private final String mgmtVipHostname;

    /**
     * The hostname corresponding to the virtual IP (VIP) address of the management nodes.
     *
     * @return the value
     **/
    public String getMgmtVipHostname() {
        return mgmtVipHostname;
    }

    /**
     * The IP address used as the virtual IP (VIP) address of the management nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mgmtVipIp")
    private final String mgmtVipIp;

    /**
     * The IP address used as the virtual IP (VIP) address of the management nodes.
     * @return the value
     **/
    public String getMgmtVipIp() {
        return mgmtVipIp;
    }

    /**
     * The domain name system (DNS) addresses that the Compute Cloud@Customer infrastructure
     * uses for the data center network.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsIps")
    private final java.util.List<String> dnsIps;

    /**
     * The domain name system (DNS) addresses that the Compute Cloud@Customer infrastructure
     * uses for the data center network.
     *
     * @return the value
     **/
    public java.util.List<String> getDnsIps() {
        return dnsIps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureRoutingStatic")
    private final CccInfrastructureRoutingStaticDetails infrastructureRoutingStatic;

    public CccInfrastructureRoutingStaticDetails getInfrastructureRoutingStatic() {
        return infrastructureRoutingStatic;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureRoutingDynamic")
    private final CccInfrastructureRoutingDynamicDetails infrastructureRoutingDynamic;

    public CccInfrastructureRoutingDynamicDetails getInfrastructureRoutingDynamic() {
        return infrastructureRoutingDynamic;
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
        sb.append("CccInfrastructureNetworkConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("managementNodes=").append(String.valueOf(this.managementNodes));
        sb.append(", uplinkPortSpeedInGbps=").append(String.valueOf(this.uplinkPortSpeedInGbps));
        sb.append(", uplinkPortCount=").append(String.valueOf(this.uplinkPortCount));
        sb.append(", uplinkVlanMtu=").append(String.valueOf(this.uplinkVlanMtu));
        sb.append(", uplinkNetmask=").append(String.valueOf(this.uplinkNetmask));
        sb.append(", uplinkPortForwardErrorCorrection=")
                .append(String.valueOf(this.uplinkPortForwardErrorCorrection));
        sb.append(", uplinkDomain=").append(String.valueOf(this.uplinkDomain));
        sb.append(", uplinkGatewayIp=").append(String.valueOf(this.uplinkGatewayIp));
        sb.append(", spineIps=").append(String.valueOf(this.spineIps));
        sb.append(", spineVip=").append(String.valueOf(this.spineVip));
        sb.append(", mgmtVipHostname=").append(String.valueOf(this.mgmtVipHostname));
        sb.append(", mgmtVipIp=").append(String.valueOf(this.mgmtVipIp));
        sb.append(", dnsIps=").append(String.valueOf(this.dnsIps));
        sb.append(", infrastructureRoutingStatic=")
                .append(String.valueOf(this.infrastructureRoutingStatic));
        sb.append(", infrastructureRoutingDynamic=")
                .append(String.valueOf(this.infrastructureRoutingDynamic));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CccInfrastructureNetworkConfiguration)) {
            return false;
        }

        CccInfrastructureNetworkConfiguration other = (CccInfrastructureNetworkConfiguration) o;
        return java.util.Objects.equals(this.managementNodes, other.managementNodes)
                && java.util.Objects.equals(this.uplinkPortSpeedInGbps, other.uplinkPortSpeedInGbps)
                && java.util.Objects.equals(this.uplinkPortCount, other.uplinkPortCount)
                && java.util.Objects.equals(this.uplinkVlanMtu, other.uplinkVlanMtu)
                && java.util.Objects.equals(this.uplinkNetmask, other.uplinkNetmask)
                && java.util.Objects.equals(
                        this.uplinkPortForwardErrorCorrection,
                        other.uplinkPortForwardErrorCorrection)
                && java.util.Objects.equals(this.uplinkDomain, other.uplinkDomain)
                && java.util.Objects.equals(this.uplinkGatewayIp, other.uplinkGatewayIp)
                && java.util.Objects.equals(this.spineIps, other.spineIps)
                && java.util.Objects.equals(this.spineVip, other.spineVip)
                && java.util.Objects.equals(this.mgmtVipHostname, other.mgmtVipHostname)
                && java.util.Objects.equals(this.mgmtVipIp, other.mgmtVipIp)
                && java.util.Objects.equals(this.dnsIps, other.dnsIps)
                && java.util.Objects.equals(
                        this.infrastructureRoutingStatic, other.infrastructureRoutingStatic)
                && java.util.Objects.equals(
                        this.infrastructureRoutingDynamic, other.infrastructureRoutingDynamic)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managementNodes == null ? 43 : this.managementNodes.hashCode());
        result =
                (result * PRIME)
                        + (this.uplinkPortSpeedInGbps == null
                                ? 43
                                : this.uplinkPortSpeedInGbps.hashCode());
        result =
                (result * PRIME)
                        + (this.uplinkPortCount == null ? 43 : this.uplinkPortCount.hashCode());
        result =
                (result * PRIME)
                        + (this.uplinkVlanMtu == null ? 43 : this.uplinkVlanMtu.hashCode());
        result =
                (result * PRIME)
                        + (this.uplinkNetmask == null ? 43 : this.uplinkNetmask.hashCode());
        result =
                (result * PRIME)
                        + (this.uplinkPortForwardErrorCorrection == null
                                ? 43
                                : this.uplinkPortForwardErrorCorrection.hashCode());
        result = (result * PRIME) + (this.uplinkDomain == null ? 43 : this.uplinkDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.uplinkGatewayIp == null ? 43 : this.uplinkGatewayIp.hashCode());
        result = (result * PRIME) + (this.spineIps == null ? 43 : this.spineIps.hashCode());
        result = (result * PRIME) + (this.spineVip == null ? 43 : this.spineVip.hashCode());
        result =
                (result * PRIME)
                        + (this.mgmtVipHostname == null ? 43 : this.mgmtVipHostname.hashCode());
        result = (result * PRIME) + (this.mgmtVipIp == null ? 43 : this.mgmtVipIp.hashCode());
        result = (result * PRIME) + (this.dnsIps == null ? 43 : this.dnsIps.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureRoutingStatic == null
                                ? 43
                                : this.infrastructureRoutingStatic.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureRoutingDynamic == null
                                ? 43
                                : this.infrastructureRoutingDynamic.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
