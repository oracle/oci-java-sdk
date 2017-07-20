/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A *private IP* is a conceptual term that refers to a private IP address and related properties.
 * The `privateIp` object is the API representation of a private IP.
 * <p>
 * Each instance has a *primary private IP* that is automatically created and
 * assigned to the primary VNIC during instance launch. If you add a secondary
 * VNIC to the instance, it also automatically gets a primary private IP. You
 * can't remove a primary private IP from its VNIC. The primary private IP is
 * automatically deleted when the VNIC is terminated.
 * <p>
 * You can add *secondary private IPs* to a VNIC after it's created. For more
 * information, see the `privateIp` operations and also
 * [Managing IP Addresses](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIPaddresses.htm).
 * <p>
 **Note:** Only
 * {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and
 * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} work with
 * *primary* private IPs. To create and update primary private IPs, you instead
 * work with instance and VNIC operations. For example, a primary private IP's
 * properties come from the values you specify in
 * {@link CreateVnicDetails} when calling either
 * {@link #launchInstance(LaunchInstanceRequest) launchInstance} or
 * {@link #attachVnic(AttachVnicRequest) attachVnic}. To update the hostname
 * for a primary private IP, you use {@link #updateVnic(UpdateVnicRequest) updateVnic}.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PrivateIp.Builder.class)
public class PrivateIp {
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

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        public PrivateIp build() {
            return new PrivateIp(
                    availabilityDomain,
                    compartmentId,
                    displayName,
                    hostnameLabel,
                    id,
                    ipAddress,
                    isPrimary,
                    subnetId,
                    timeCreated,
                    vnicId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateIp o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .hostnameLabel(o.getHostnameLabel())
                    .id(o.getId())
                    .ipAddress(o.getIpAddress())
                    .isPrimary(o.getIsPrimary())
                    .subnetId(o.getSubnetId())
                    .timeCreated(o.getTimeCreated())
                    .vnicId(o.getVnicId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The private IP's Availability Domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The OCID of the compartment containing the private IP.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The hostname for the private IP. Used for DNS. The value is the hostname
     * portion of the private IP's fully qualified domain name (FQDN)
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
    @javax.validation.constraints.Size(min = 1, max = 63)
    String hostnameLabel;

    /**
     * The private IP's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String id;

    /**
     * The private IP address of the `privateIp` object. The address is within the CIDR
     * of the VNIC's subnet.
     * <p>
     * Example: `10.0.3.3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    String ipAddress;

    /**
     * Whether this private IP is the primary one on the VNIC. Primary private IPs
     * are unassigned and deleted automatically when the VNIC is terminated.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    Boolean isPrimary;

    /**
     * The OCID of the subnet the VNIC is in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String subnetId;

    /**
     * The date and time the private IP was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The OCID of the VNIC the private IP is assigned to. The VNIC and private IP
     * must be in the same subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String vnicId;
}
