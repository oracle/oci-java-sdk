/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIPSecConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateIPSecConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeId")
        private String cpeId;

        public Builder cpeId(String cpeId) {
            this.cpeId = cpeId;
            this.__explicitlySet__.add("cpeId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifier")
        private String cpeLocalIdentifier;

        public Builder cpeLocalIdentifier(String cpeLocalIdentifier) {
            this.cpeLocalIdentifier = cpeLocalIdentifier;
            this.__explicitlySet__.add("cpeLocalIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifierType")
        private CpeLocalIdentifierType cpeLocalIdentifierType;

        public Builder cpeLocalIdentifierType(CpeLocalIdentifierType cpeLocalIdentifierType) {
            this.cpeLocalIdentifierType = cpeLocalIdentifierType;
            this.__explicitlySet__.add("cpeLocalIdentifierType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
        private java.util.List<String> staticRoutes;

        public Builder staticRoutes(java.util.List<String> staticRoutes) {
            this.staticRoutes = staticRoutes;
            this.__explicitlySet__.add("staticRoutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tunnelConfiguration")
        private java.util.List<CreateIPSecConnectionTunnelDetails> tunnelConfiguration;

        public Builder tunnelConfiguration(
                java.util.List<CreateIPSecConnectionTunnelDetails> tunnelConfiguration) {
            this.tunnelConfiguration = tunnelConfiguration;
            this.__explicitlySet__.add("tunnelConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIPSecConnectionDetails build() {
            CreateIPSecConnectionDetails __instance__ =
                    new CreateIPSecConnectionDetails(
                            compartmentId,
                            cpeId,
                            definedTags,
                            displayName,
                            drgId,
                            freeformTags,
                            cpeLocalIdentifier,
                            cpeLocalIdentifierType,
                            staticRoutes,
                            tunnelConfiguration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIPSecConnectionDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .cpeId(o.getCpeId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .drgId(o.getDrgId())
                            .freeformTags(o.getFreeformTags())
                            .cpeLocalIdentifier(o.getCpeLocalIdentifier())
                            .cpeLocalIdentifierType(o.getCpeLocalIdentifierType())
                            .staticRoutes(o.getStaticRoutes())
                            .tunnelConfiguration(o.getTunnelConfiguration());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the IPSec connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@link Cpe} object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeId")
    String cpeId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    String drgId;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Your identifier for your CPE device. Can be either an IP address or a hostname (specifically, the
     * fully qualified domain name (FQDN)). The type of identifier you provide here must correspond
     * to the value for {@code cpeLocalIdentifierType}.
     * <p>
     * If you don't provide a value, the {@code ipAddress} attribute for the {@link Cpe}
     * object specified by {@code cpeId} is used as the {@code cpeLocalIdentifier}.
     * <p>
     * For information about why you'd provide this value, see
     * [If Your CPE Is Behind a NAT Device](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm#nat).
     * <p>
     * Example IP address: {@code 10.0.3.3}
     * <p>
     * Example hostname: {@code cpe.example.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifier")
    String cpeLocalIdentifier;
    /**
     * The type of identifier for your CPE device. The value you provide here must correspond to the value
     * for {@code cpeLocalIdentifier}.
     *
     **/
    public enum CpeLocalIdentifierType {
        IpAddress("IP_ADDRESS"),
        Hostname("HOSTNAME"),
        ;

        private final String value;
        private static java.util.Map<String, CpeLocalIdentifierType> map;

        static {
            map = new java.util.HashMap<>();
            for (CpeLocalIdentifierType v : CpeLocalIdentifierType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CpeLocalIdentifierType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CpeLocalIdentifierType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CpeLocalIdentifierType: " + key);
        }
    };
    /**
     * The type of identifier for your CPE device. The value you provide here must correspond to the value
     * for {@code cpeLocalIdentifier}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifierType")
    CpeLocalIdentifierType cpeLocalIdentifierType;

    /**
     * Static routes to the CPE. A static route's CIDR must not be a
     * multicast address or class E address.
     * <p>
     * Used for routing a given IPSec tunnel's traffic only if the tunnel
     * is using static routing. If you configure at least one tunnel to use static routing, then
     * you must provide at least one valid static route. If you configure both
     * tunnels to use BGP dynamic routing, you can provide an empty list for the static routes.
     * For more information, see the important note in {@link IPSecConnection}.
     * <p>
     * The CIDR can be either IPv4 or IPv6. IPv6 addressing is supported for all commercial and government regions.
     * See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 10.0.1.0/24}
     * <p>
     * Example: {@code 2001:db8::/32}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
    java.util.List<String> staticRoutes;

    /**
     * Information for creating the individual tunnels in the IPSec connection. You can provide a
     * maximum of 2 {@code tunnelConfiguration} objects in the array (one for each of the
     * two tunnels).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tunnelConfiguration")
    java.util.List<CreateIPSecConnectionTunnelDetails> tunnelConfiguration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
