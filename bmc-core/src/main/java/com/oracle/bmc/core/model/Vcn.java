/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A virtual cloud network (VCN). For more information, see
 * [Overview of the Networking Service](https://docs.cloud.oracle.com/Content/Network/Concepts/overview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Vcn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Vcn {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
        private java.util.List<String> cidrBlocks;

        public Builder cidrBlocks(java.util.List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            this.__explicitlySet__.add("cidrBlocks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultDhcpOptionsId")
        private String defaultDhcpOptionsId;

        public Builder defaultDhcpOptionsId(String defaultDhcpOptionsId) {
            this.defaultDhcpOptionsId = defaultDhcpOptionsId;
            this.__explicitlySet__.add("defaultDhcpOptionsId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultRouteTableId")
        private String defaultRouteTableId;

        public Builder defaultRouteTableId(String defaultRouteTableId) {
            this.defaultRouteTableId = defaultRouteTableId;
            this.__explicitlySet__.add("defaultRouteTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultSecurityListId")
        private String defaultSecurityListId;

        public Builder defaultSecurityListId(String defaultSecurityListId) {
            this.defaultSecurityListId = defaultSecurityListId;
            this.__explicitlySet__.add("defaultSecurityListId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
        private String dnsLabel;

        public Builder dnsLabel(String dnsLabel) {
            this.dnsLabel = dnsLabel;
            this.__explicitlySet__.add("dnsLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6PublicCidrBlock")
        private String ipv6PublicCidrBlock;

        public Builder ipv6PublicCidrBlock(String ipv6PublicCidrBlock) {
            this.ipv6PublicCidrBlock = ipv6PublicCidrBlock;
            this.__explicitlySet__.add("ipv6PublicCidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnDomainName")
        private String vcnDomainName;

        public Builder vcnDomainName(String vcnDomainName) {
            this.vcnDomainName = vcnDomainName;
            this.__explicitlySet__.add("vcnDomainName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Vcn build() {
            Vcn __instance__ =
                    new Vcn(
                            cidrBlock,
                            cidrBlocks,
                            compartmentId,
                            defaultDhcpOptionsId,
                            defaultRouteTableId,
                            defaultSecurityListId,
                            definedTags,
                            displayName,
                            dnsLabel,
                            freeformTags,
                            id,
                            ipv6CidrBlock,
                            ipv6PublicCidrBlock,
                            lifecycleState,
                            timeCreated,
                            vcnDomainName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Vcn o) {
            Builder copiedBuilder =
                    cidrBlock(o.getCidrBlock())
                            .cidrBlocks(o.getCidrBlocks())
                            .compartmentId(o.getCompartmentId())
                            .defaultDhcpOptionsId(o.getDefaultDhcpOptionsId())
                            .defaultRouteTableId(o.getDefaultRouteTableId())
                            .defaultSecurityListId(o.getDefaultSecurityListId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .dnsLabel(o.getDnsLabel())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .ipv6CidrBlock(o.getIpv6CidrBlock())
                            .ipv6PublicCidrBlock(o.getIpv6PublicCidrBlock())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .vcnDomainName(o.getVcnDomainName());

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

    /**
     * Deprecated. The first CIDR IP address from cidrBlocks.
     * <p>
     * Example: `172.16.0.0/16`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    String cidrBlock;

    /**
     * The list of IPv4 CIDR blocks the VCN will use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
    java.util.List<String> cidrBlocks;

    /**
     * The OCID of the compartment containing the VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID for the VCN's default set of DHCP options.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultDhcpOptionsId")
    String defaultDhcpOptionsId;

    /**
     * The OCID for the VCN's default route table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultRouteTableId")
    String defaultRouteTableId;

    /**
     * The OCID for the VCN's default security list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultSecurityListId")
    String defaultSecurityListId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A DNS label for the VCN, used in conjunction with the VNIC's hostname and
     * subnet's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (for example, `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Must be an alphanumeric string that begins with a letter.
     * The value cannot be changed.
     * <p>
     * The absence of this parameter means the Internet and VCN Resolver will
     * not work for this VCN.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `vcn1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    String dnsLabel;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The VCN's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * For an IPv6-enabled VCN, this is the IPv6 CIDR block for the VCN's private IP address space.
     * The VCN size is always /48. If you don't provide a value when creating the VCN, Oracle
     * provides one and uses that *same* CIDR for the `ipv6PublicCidrBlock`. If you do provide a
     * value, Oracle provides a *different* CIDR for the `ipv6PublicCidrBlock`. Note that IPv6
     * addressing is currently supported only in certain regions. See
     * [IPv6 Addresses](https://docs.cloud.oracle.com/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: `2001:0db8:0123::/48`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    String ipv6CidrBlock;

    /**
     * For an IPv6-enabled VCN, this is the IPv6 CIDR block for the VCN's public IP address space.
     * The VCN size is always /48. This CIDR is always provided by Oracle. If you don't provide a
     * custom CIDR for the `ipv6CidrBlock` when creating the VCN, Oracle assigns that value and also
     * uses it for `ipv6PublicCidrBlock`. Oracle uses addresses from this block for the `publicIpAddress`
     * attribute of an {@link Ipv6} that has internet access allowed.
     * <p>
     * Example: `2001:0db8:0123::/48`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6PublicCidrBlock")
    String ipv6PublicCidrBlock;
    /**
     * The VCN's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Updating("UPDATING"),

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
     * The VCN's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the VCN was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The VCN's domain name, which consists of the VCN's DNS label, and the
     * `oraclevcn.com` domain.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `vcn1.oraclevcn.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnDomainName")
    String vcnDomainName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
