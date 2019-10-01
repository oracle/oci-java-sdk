/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
    builder = UpdateIPSecConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateIPSecConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateIPSecConnectionDetails build() {
            UpdateIPSecConnectionDetails __instance__ =
                    new UpdateIPSecConnectionDetails(
                            definedTags,
                            displayName,
                            freeformTags,
                            cpeLocalIdentifier,
                            cpeLocalIdentifierType,
                            staticRoutes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIPSecConnectionDetails o) {
            Builder copiedBuilder =
                    definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .cpeLocalIdentifier(o.getCpeLocalIdentifier())
                            .cpeLocalIdentifierType(o.getCpeLocalIdentifierType())
                            .staticRoutes(o.getStaticRoutes());

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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Your identifier for your CPE device. Can be either an IP address or a hostname (specifically, the
     * fully qualified domain name (FQDN)). The type of identifier you provide here must correspond
     * to the value for `cpeLocalIdentifierType`.
     * <p>
     * For information about why you'd provide this value, see
     * [If Your CPE Is Behind a NAT Device](https://docs.cloud.oracle.com/Content/Network/Tasks/overviewIPsec.htm#nat).
     * <p>
     * Example IP address: `10.0.3.3`
     * <p>
     * Example hostname: `cpe.example.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifier")
    String cpeLocalIdentifier;
    /**
     * The type of identifier for your CPE device. The value you provide here must correspond to the value
     * for `cpeLocalIdentifier`.
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
            throw new RuntimeException("Invalid CpeLocalIdentifierType: " + key);
        }
    };
    /**
     * The type of identifier for your CPE device. The value you provide here must correspond to the value
     * for `cpeLocalIdentifier`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifierType")
    CpeLocalIdentifierType cpeLocalIdentifierType;

    /**
     * Static routes to the CPE. If you provide this attribute, it replaces the entire current set of
     * static routes. A static route's CIDR must not be a multicast address or class E address.
     * The CIDR can be either IPv4 or IPv6. Note that IPv6 addressing is currently supported only
     * in the Government Cloud.
     * <p>
     * Example: `10.0.1.0/24`
     * <p>
     * Example: `2001:db8::/32`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
    java.util.List<String> staticRoutes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
