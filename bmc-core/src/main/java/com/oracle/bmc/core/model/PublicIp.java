/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A *public IP* is a conceptual term that refers to a public IP address and related properties.
 * The `publicIp` object is the API representation of a public IP.
 * <p>
 * There are two types of public IPs:
 * 1. Ephemeral
 * 2. Reserved
 * <p>
 * For more information and comparison of the two types,
 * see [Public IP Addresses](https://docs.cloud.oracle.com/Content/Network/Tasks/managingpublicIPs.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PublicIp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class PublicIp {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("assignedEntityId")
        private String assignedEntityId;

        public Builder assignedEntityId(String assignedEntityId) {
            this.assignedEntityId = assignedEntityId;
            this.__explicitlySet__.add("assignedEntityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assignedEntityType")
        private AssignedEntityType assignedEntityType;

        public Builder assignedEntityType(AssignedEntityType assignedEntityType) {
            this.assignedEntityType = assignedEntityType;
            this.__explicitlySet__.add("assignedEntityType");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
        private Lifetime lifetime;

        public Builder lifetime(Lifetime lifetime) {
            this.lifetime = lifetime;
            this.__explicitlySet__.add("lifetime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateIpId")
        private String privateIpId;

        public Builder privateIpId(String privateIpId) {
            this.privateIpId = privateIpId;
            this.__explicitlySet__.add("privateIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Scope scope;

        public Builder scope(Scope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
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

        public PublicIp build() {
            PublicIp __instance__ =
                    new PublicIp(
                            assignedEntityId,
                            assignedEntityType,
                            availabilityDomain,
                            compartmentId,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            ipAddress,
                            lifecycleState,
                            lifetime,
                            privateIpId,
                            scope,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublicIp o) {
            Builder copiedBuilder =
                    assignedEntityId(o.getAssignedEntityId())
                            .assignedEntityType(o.getAssignedEntityType())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .ipAddress(o.getIpAddress())
                            .lifecycleState(o.getLifecycleState())
                            .lifetime(o.getLifetime())
                            .privateIpId(o.getPrivateIpId())
                            .scope(o.getScope())
                            .timeCreated(o.getTimeCreated());

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
     * The OCID of the entity the public IP is assigned to, or in the process of
     * being assigned to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignedEntityId")
    String assignedEntityId;
    /**
     * The type of entity the public IP is assigned to, or in the process of being
     * assigned to.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AssignedEntityType {
        PrivateIp("PRIVATE_IP"),
        NatGateway("NAT_GATEWAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, AssignedEntityType> map;

        static {
            map = new java.util.HashMap<>();
            for (AssignedEntityType v : AssignedEntityType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssignedEntityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssignedEntityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssignedEntityType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of entity the public IP is assigned to, or in the process of being
     * assigned to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignedEntityType")
    AssignedEntityType assignedEntityType;

    /**
     * The public IP's availability domain. This property is set only for ephemeral public IPs
     * that are assigned to a private IP (that is, when the `scope` of the public IP is set to
     * AVAILABILITY_DOMAIN). The value is the availability domain of the assigned private IP.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the compartment containing the public IP. For an ephemeral public IP, this is
     * the compartment of its assigned entity (which can be a private IP or a regional entity such
     * as a NAT gateway). For a reserved public IP that is currently assigned,
     * its compartment can be different from the assigned private IP's.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The public IP's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The public IP address of the `publicIp` object.
     * <p>
     * Example: `129.146.2.1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    String ipAddress;
    /**
     * The public IP's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Assigning("ASSIGNING"),
        Assigned("ASSIGNED"),
        Unassigning("UNASSIGNING"),
        Unassigned("UNASSIGNED"),
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
     * The public IP's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;
    /**
     * Defines when the public IP is deleted and released back to Oracle's public IP pool.
     * <p>
     * `EPHEMERAL`: The lifetime is tied to the lifetime of its assigned entity. An ephemeral
     * public IP must always be assigned to an entity. If the assigned entity is a private IP,
     * the ephemeral public IP is automatically deleted when the private IP is deleted, when
     * the VNIC is terminated, or when the instance is terminated. If the assigned entity is a
     * {@link NatGateway}, the ephemeral public IP is automatically
     * deleted when the NAT gateway is terminated.
     * <p>
     * `RESERVED`: You control the public IP's lifetime. You can delete a reserved public IP
     * whenever you like. It does not need to be assigned to a private IP at all times.
     * <p>
     * For more information and comparison of the two types,
     * see [Public IP Addresses](https://docs.cloud.oracle.com/Content/Network/Tasks/managingpublicIPs.htm).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Lifetime {
        Ephemeral("EPHEMERAL"),
        Reserved("RESERVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Lifetime> map;

        static {
            map = new java.util.HashMap<>();
            for (Lifetime v : Lifetime.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Lifetime(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Lifetime create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Lifetime', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Defines when the public IP is deleted and released back to Oracle's public IP pool.
     * <p>
     * `EPHEMERAL`: The lifetime is tied to the lifetime of its assigned entity. An ephemeral
     * public IP must always be assigned to an entity. If the assigned entity is a private IP,
     * the ephemeral public IP is automatically deleted when the private IP is deleted, when
     * the VNIC is terminated, or when the instance is terminated. If the assigned entity is a
     * {@link NatGateway}, the ephemeral public IP is automatically
     * deleted when the NAT gateway is terminated.
     * <p>
     * `RESERVED`: You control the public IP's lifetime. You can delete a reserved public IP
     * whenever you like. It does not need to be assigned to a private IP at all times.
     * <p>
     * For more information and comparison of the two types,
     * see [Public IP Addresses](https://docs.cloud.oracle.com/Content/Network/Tasks/managingpublicIPs.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
    Lifetime lifetime;

    /**
     * Deprecated. Use `assignedEntityId` instead.
     * <p>
     * The OCID of the private IP that the public IP is currently assigned to, or in the
     * process of being assigned to.
     * <p>
     **Note:** This is `null` if the public IP is not assigned to a private IP, or is
     * in the process of being assigned to one.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIpId")
    String privateIpId;
    /**
     * Whether the public IP is regional or specific to a particular availability domain.
     * <p>
     * `REGION`: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private
     * IP in any availability domain in the region. Reserved public IPs and ephemeral public IPs
     * assigned to a regional entity have `scope` = `REGION`.
     * <p>
     * `AVAILABILITY_DOMAIN`: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the `availabilityDomain` property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have `scope` = `AVAILABILITY_DOMAIN`.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Scope {
        Region("REGION"),
        AvailabilityDomain("AVAILABILITY_DOMAIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Scope> map;

        static {
            map = new java.util.HashMap<>();
            for (Scope v : Scope.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Scope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Scope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Scope', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Whether the public IP is regional or specific to a particular availability domain.
     * <p>
     * `REGION`: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private
     * IP in any availability domain in the region. Reserved public IPs and ephemeral public IPs
     * assigned to a regional entity have `scope` = `REGION`.
     * <p>
     * `AVAILABILITY_DOMAIN`: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the `availabilityDomain` property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have `scope` = `AVAILABILITY_DOMAIN`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    Scope scope;

    /**
     * The date and time the public IP was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
