/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A virtual network interface card. Each VNIC resides in a subnet in a VCN.
 * An instance attaches to a VNIC to obtain a network connection into the VCN
 * through that subnet. Each instance has a *primary VNIC* that is automatically
 * created and attached during launch. You can add *secondary VNICs* to an
 * instance after it's launched. For more information, see
 * [Virtual Network Interface Cards (VNICs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVNICs.htm).
 * <p>
 * Each VNIC has a *primary private IP* that is automatically assigned during launch.
 * You can add *secondary private IPs* to a VNIC after it's created. For more
 * information, see {@link #createPrivateIp(CreatePrivateIpRequest) createPrivateIp} and
 * [IP Addresses](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIPaddresses.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Vnic.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Vnic {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            this.__explicitlySet__.add("isPrimary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
        private String macAddress;

        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            this.__explicitlySet__.add("macAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
        private String publicIp;

        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            this.__explicitlySet__.add("publicIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
        private Boolean skipSourceDestCheck;

        public Builder skipSourceDestCheck(Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = skipSourceDestCheck;
            this.__explicitlySet__.add("skipSourceDestCheck");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Vnic build() {
            Vnic __instance__ =
                    new Vnic(
                            availabilityDomain,
                            compartmentId,
                            displayName,
                            hostnameLabel,
                            id,
                            isPrimary,
                            lifecycleState,
                            macAddress,
                            privateIp,
                            publicIp,
                            skipSourceDestCheck,
                            subnetId,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Vnic o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .hostnameLabel(o.getHostnameLabel())
                    .id(o.getId())
                    .isPrimary(o.getIsPrimary())
                    .lifecycleState(o.getLifecycleState())
                    .macAddress(o.getMacAddress())
                    .privateIp(o.getPrivateIp())
                    .publicIp(o.getPublicIp())
                    .skipSourceDestCheck(o.getSkipSourceDestCheck())
                    .subnetId(o.getSubnetId())
                    .timeCreated(o.getTimeCreated());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The VNIC's Availability Domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the compartment containing the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
     * portion of the primary private IP's fully qualified domain name (FQDN)
     * (for example, `bminstance-1` in FQDN `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Must be unique across all VNICs in the subnet and comply with
     * [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123).
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `bminstance-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    String hostnameLabel;

    /**
     * The OCID of the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Whether the VNIC is the primary VNIC (the VNIC that is automatically created
     * and attached during instance launch).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    Boolean isPrimary;
    /**
     * The current state of the VNIC.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The MAC address of the VNIC.
     * <p>
     * Example: `00:00:17:B6:4D:DD`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
    String macAddress;

    /**
     * The private IP address of the primary `privateIp` object on the VNIC.
     * The address is within the CIDR of the VNIC's subnet.
     * <p>
     * Example: `10.0.3.3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    String privateIp;

    /**
     * The public IP address of the VNIC, if one is assigned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
    String publicIp;

    /**
     * Whether the source/destination check is disabled on the VNIC.
     * Defaults to `false`, which means the check is performed. For information
     * about why you would skip the source/destination check, see
     * [Using a Private IP as a Route Target](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingroutetables.htm#privateip).
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
    Boolean skipSourceDestCheck;

    /**
     * The OCID of the subnet the VNIC is in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * The date and time the VNIC was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
