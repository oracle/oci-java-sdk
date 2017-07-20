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
 * [Managing Virtual Network Interface Cards (VNICs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVNICs.htm).
 * <p>
 * Each VNIC has a *primary private IP* that is automatically assigned during launch.
 * You can add *secondary private IPs* to a VNIC after it's created. For more
 * information, see {@link #createPrivateIp(CreatePrivateIpRequest) createPrivateIp} and
 * [Managing IP Addresses](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIPaddresses.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Vnic.Builder.class)
public class Vnic {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
        private String macAddress;

        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
        private String publicIp;

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Vnic build() {
            return new Vnic(
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
                    subnetId,
                    timeCreated);
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The OCID of the compartment containing the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
     * portion of the primary private IP's fully qualified domain name (FQDN)
     * (e.g., `bminstance-1` in FQDN `bminstance-1.subnet123.vcn1.oraclevcn.com`).
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
    @javax.validation.constraints.Size(min = 1, max = 63)
    String hostnameLabel;

    /**
     * The OCID of the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    LifecycleState lifecycleState;

    /**
     * The MAC address of the VNIC.
     * <p>
     * Example: `00:00:17:B6:4D:DD`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
    @javax.validation.constraints.Size(min = 1, max = 32)
    String macAddress;

    /**
     * The private IP address of the primary `privateIp` object on the VNIC.
     * The address is within the CIDR of the VNIC's subnet.
     * <p>
     * Example: `10.0.3.3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String privateIp;

    /**
     * The public IP address of the VNIC, if one is assigned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
    String publicIp;

    /**
     * The OCID of the subnet the VNIC is in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String subnetId;

    /**
     * The date and time the VNIC was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeCreated;
}
