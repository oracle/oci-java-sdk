/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A *public IP* is a conceptual term that refers to a public IP address and related properties.
 * The {@code publicIp} object is the API representation of a public IP.
 * <p>
 * There are two types of public IPs:
 * 1. Ephemeral
 * 2. Reserved
 * <p>
 * For more information and comparison of the two types,
 * see [Public IP Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PublicIp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PublicIp extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assignedEntityId",
        "assignedEntityType",
        "availabilityDomain",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "ipAddress",
        "lifecycleState",
        "lifetime",
        "privateIpId",
        "scope",
        "timeCreated",
        "publicIpPoolId"
    })
    public PublicIp(
            String assignedEntityId,
            AssignedEntityType assignedEntityType,
            String availabilityDomain,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            String ipAddress,
            LifecycleState lifecycleState,
            Lifetime lifetime,
            String privateIpId,
            Scope scope,
            java.util.Date timeCreated,
            String publicIpPoolId) {
        super();
        this.assignedEntityId = assignedEntityId;
        this.assignedEntityType = assignedEntityType;
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.ipAddress = ipAddress;
        this.lifecycleState = lifecycleState;
        this.lifetime = lifetime;
        this.privateIpId = privateIpId;
        this.scope = scope;
        this.timeCreated = timeCreated;
        this.publicIpPoolId = publicIpPoolId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the entity the public IP is assigned to, or in the process of
         * being assigned to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assignedEntityId")
        private String assignedEntityId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the entity the public IP is assigned to, or in the process of
         * being assigned to.
         *
         * @param assignedEntityId the value to set
         * @return this builder
         **/
        public Builder assignedEntityId(String assignedEntityId) {
            this.assignedEntityId = assignedEntityId;
            this.__explicitlySet__.add("assignedEntityId");
            return this;
        }
        /**
         * The type of entity the public IP is assigned to, or in the process of being
         * assigned to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assignedEntityType")
        private AssignedEntityType assignedEntityType;

        /**
         * The type of entity the public IP is assigned to, or in the process of being
         * assigned to.
         *
         * @param assignedEntityType the value to set
         * @return this builder
         **/
        public Builder assignedEntityType(AssignedEntityType assignedEntityType) {
            this.assignedEntityType = assignedEntityType;
            this.__explicitlySet__.add("assignedEntityType");
            return this;
        }
        /**
         * The public IP's availability domain. This property is set only for ephemeral public IPs
         * that are assigned to a private IP (that is, when the {@code scope} of the public IP is set to
         * AVAILABILITY_DOMAIN). The value is the availability domain of the assigned private IP.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The public IP's availability domain. This property is set only for ephemeral public IPs
         * that are assigned to a private IP (that is, when the {@code scope} of the public IP is set to
         * AVAILABILITY_DOMAIN). The value is the availability domain of the assigned private IP.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the public IP. For an ephemeral public IP, this is
         * the compartment of its assigned entity (which can be a private IP or a regional entity such
         * as a NAT gateway). For a reserved public IP that is currently assigned,
         * its compartment can be different from the assigned private IP's.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the public IP. For an ephemeral public IP, this is
         * the compartment of its assigned entity (which can be a private IP or a regional entity such
         * as a NAT gateway). For a reserved public IP that is currently assigned,
         * its compartment can be different from the assigned private IP's.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The public IP's Oracle ID ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The public IP's Oracle ID ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The public IP address of the {@code publicIp} object.
         * <p>
         * Example: {@code 203.0.113.2}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The public IP address of the {@code publicIp} object.
         * <p>
         * Example: {@code 203.0.113.2}
         *
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The public IP's current state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The public IP's current state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Defines when the public IP is deleted and released back to Oracle's public IP pool.
         * <p>
         * {@code EPHEMERAL}: The lifetime is tied to the lifetime of its assigned entity. An ephemeral
         * public IP must always be assigned to an entity. If the assigned entity is a private IP,
         * the ephemeral public IP is automatically deleted when the private IP is deleted, when
         * the VNIC is terminated, or when the instance is terminated. If the assigned entity is a
         * {@link NatGateway}, the ephemeral public IP is automatically
         * deleted when the NAT gateway is terminated.
         * <p>
         * {@code RESERVED}: You control the public IP's lifetime. You can delete a reserved public IP
         * whenever you like. It does not need to be assigned to a private IP at all times.
         * <p>
         * For more information and comparison of the two types,
         * see [Public IP Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
        private Lifetime lifetime;

        /**
         * Defines when the public IP is deleted and released back to Oracle's public IP pool.
         * <p>
         * {@code EPHEMERAL}: The lifetime is tied to the lifetime of its assigned entity. An ephemeral
         * public IP must always be assigned to an entity. If the assigned entity is a private IP,
         * the ephemeral public IP is automatically deleted when the private IP is deleted, when
         * the VNIC is terminated, or when the instance is terminated. If the assigned entity is a
         * {@link NatGateway}, the ephemeral public IP is automatically
         * deleted when the NAT gateway is terminated.
         * <p>
         * {@code RESERVED}: You control the public IP's lifetime. You can delete a reserved public IP
         * whenever you like. It does not need to be assigned to a private IP at all times.
         * <p>
         * For more information and comparison of the two types,
         * see [Public IP Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
         *
         * @param lifetime the value to set
         * @return this builder
         **/
        public Builder lifetime(Lifetime lifetime) {
            this.lifetime = lifetime;
            this.__explicitlySet__.add("lifetime");
            return this;
        }
        /**
         * Deprecated. Use {@code assignedEntityId} instead.
         * <p>
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private IP that the public IP is currently assigned to, or in the
         * process of being assigned to.
         * <p>
         **Note:** This is {@code null} if the public IP is not assigned to a private IP, or is
         * in the process of being assigned to one.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateIpId")
        private String privateIpId;

        /**
         * Deprecated. Use {@code assignedEntityId} instead.
         * <p>
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private IP that the public IP is currently assigned to, or in the
         * process of being assigned to.
         * <p>
         **Note:** This is {@code null} if the public IP is not assigned to a private IP, or is
         * in the process of being assigned to one.
         *
         * @param privateIpId the value to set
         * @return this builder
         **/
        public Builder privateIpId(String privateIpId) {
            this.privateIpId = privateIpId;
            this.__explicitlySet__.add("privateIpId");
            return this;
        }
        /**
         * Whether the public IP is regional or specific to a particular availability domain.
         * <p>
         * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
         * (such as a {@link NatGateway}), or can be assigned to a private
         * IP in any availability domain in the region. Reserved public IPs and ephemeral public IPs
         * assigned to a regional entity have {@code scope} = {@code REGION}.
         * <p>
         * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
         * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
         * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Scope scope;

        /**
         * Whether the public IP is regional or specific to a particular availability domain.
         * <p>
         * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
         * (such as a {@link NatGateway}), or can be assigned to a private
         * IP in any availability domain in the region. Reserved public IPs and ephemeral public IPs
         * assigned to a regional entity have {@code scope} = {@code REGION}.
         * <p>
         * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
         * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
         * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
         *
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(Scope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * The date and time the public IP was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the public IP was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pool object created in the current tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicIpPoolId")
        private String publicIpPoolId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pool object created in the current tenancy.
         * @param publicIpPoolId the value to set
         * @return this builder
         **/
        public Builder publicIpPoolId(String publicIpPoolId) {
            this.publicIpPoolId = publicIpPoolId;
            this.__explicitlySet__.add("publicIpPoolId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublicIp build() {
            PublicIp model =
                    new PublicIp(
                            this.assignedEntityId,
                            this.assignedEntityType,
                            this.availabilityDomain,
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.ipAddress,
                            this.lifecycleState,
                            this.lifetime,
                            this.privateIpId,
                            this.scope,
                            this.timeCreated,
                            this.publicIpPoolId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublicIp model) {
            if (model.wasPropertyExplicitlySet("assignedEntityId")) {
                this.assignedEntityId(model.getAssignedEntityId());
            }
            if (model.wasPropertyExplicitlySet("assignedEntityType")) {
                this.assignedEntityType(model.getAssignedEntityType());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifetime")) {
                this.lifetime(model.getLifetime());
            }
            if (model.wasPropertyExplicitlySet("privateIpId")) {
                this.privateIpId(model.getPrivateIpId());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("publicIpPoolId")) {
                this.publicIpPoolId(model.getPublicIpPoolId());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the entity the public IP is assigned to, or in the process of
     * being assigned to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignedEntityId")
    private final String assignedEntityId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the entity the public IP is assigned to, or in the process of
     * being assigned to.
     *
     * @return the value
     **/
    public String getAssignedEntityId() {
        return assignedEntityId;
    }

    /**
     * The type of entity the public IP is assigned to, or in the process of being
     * assigned to.
     *
     **/
    public enum AssignedEntityType {
        PrivateIp("PRIVATE_IP"),
        NatGateway("NAT_GATEWAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssignedEntityType.class);

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
    private final AssignedEntityType assignedEntityType;

    /**
     * The type of entity the public IP is assigned to, or in the process of being
     * assigned to.
     *
     * @return the value
     **/
    public AssignedEntityType getAssignedEntityType() {
        return assignedEntityType;
    }

    /**
     * The public IP's availability domain. This property is set only for ephemeral public IPs
     * that are assigned to a private IP (that is, when the {@code scope} of the public IP is set to
     * AVAILABILITY_DOMAIN). The value is the availability domain of the assigned private IP.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The public IP's availability domain. This property is set only for ephemeral public IPs
     * that are assigned to a private IP (that is, when the {@code scope} of the public IP is set to
     * AVAILABILITY_DOMAIN). The value is the availability domain of the assigned private IP.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the public IP. For an ephemeral public IP, this is
     * the compartment of its assigned entity (which can be a private IP or a regional entity such
     * as a NAT gateway). For a reserved public IP that is currently assigned,
     * its compartment can be different from the assigned private IP's.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the public IP. For an ephemeral public IP, this is
     * the compartment of its assigned entity (which can be a private IP or a regional entity such
     * as a NAT gateway). For a reserved public IP that is currently assigned,
     * its compartment can be different from the assigned private IP's.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The public IP's Oracle ID ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The public IP's Oracle ID ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The public IP address of the {@code publicIp} object.
     * <p>
     * Example: {@code 203.0.113.2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The public IP address of the {@code publicIp} object.
     * <p>
     * Example: {@code 203.0.113.2}
     *
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The public IP's current state.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
    private final LifecycleState lifecycleState;

    /**
     * The public IP's current state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Defines when the public IP is deleted and released back to Oracle's public IP pool.
     * <p>
     * {@code EPHEMERAL}: The lifetime is tied to the lifetime of its assigned entity. An ephemeral
     * public IP must always be assigned to an entity. If the assigned entity is a private IP,
     * the ephemeral public IP is automatically deleted when the private IP is deleted, when
     * the VNIC is terminated, or when the instance is terminated. If the assigned entity is a
     * {@link NatGateway}, the ephemeral public IP is automatically
     * deleted when the NAT gateway is terminated.
     * <p>
     * {@code RESERVED}: You control the public IP's lifetime. You can delete a reserved public IP
     * whenever you like. It does not need to be assigned to a private IP at all times.
     * <p>
     * For more information and comparison of the two types,
     * see [Public IP Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
     *
     **/
    public enum Lifetime {
        Ephemeral("EPHEMERAL"),
        Reserved("RESERVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Lifetime.class);

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
     * {@code EPHEMERAL}: The lifetime is tied to the lifetime of its assigned entity. An ephemeral
     * public IP must always be assigned to an entity. If the assigned entity is a private IP,
     * the ephemeral public IP is automatically deleted when the private IP is deleted, when
     * the VNIC is terminated, or when the instance is terminated. If the assigned entity is a
     * {@link NatGateway}, the ephemeral public IP is automatically
     * deleted when the NAT gateway is terminated.
     * <p>
     * {@code RESERVED}: You control the public IP's lifetime. You can delete a reserved public IP
     * whenever you like. It does not need to be assigned to a private IP at all times.
     * <p>
     * For more information and comparison of the two types,
     * see [Public IP Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
    private final Lifetime lifetime;

    /**
     * Defines when the public IP is deleted and released back to Oracle's public IP pool.
     * <p>
     * {@code EPHEMERAL}: The lifetime is tied to the lifetime of its assigned entity. An ephemeral
     * public IP must always be assigned to an entity. If the assigned entity is a private IP,
     * the ephemeral public IP is automatically deleted when the private IP is deleted, when
     * the VNIC is terminated, or when the instance is terminated. If the assigned entity is a
     * {@link NatGateway}, the ephemeral public IP is automatically
     * deleted when the NAT gateway is terminated.
     * <p>
     * {@code RESERVED}: You control the public IP's lifetime. You can delete a reserved public IP
     * whenever you like. It does not need to be assigned to a private IP at all times.
     * <p>
     * For more information and comparison of the two types,
     * see [Public IP Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
     *
     * @return the value
     **/
    public Lifetime getLifetime() {
        return lifetime;
    }

    /**
     * Deprecated. Use {@code assignedEntityId} instead.
     * <p>
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private IP that the public IP is currently assigned to, or in the
     * process of being assigned to.
     * <p>
     **Note:** This is {@code null} if the public IP is not assigned to a private IP, or is
     * in the process of being assigned to one.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIpId")
    private final String privateIpId;

    /**
     * Deprecated. Use {@code assignedEntityId} instead.
     * <p>
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private IP that the public IP is currently assigned to, or in the
     * process of being assigned to.
     * <p>
     **Note:** This is {@code null} if the public IP is not assigned to a private IP, or is
     * in the process of being assigned to one.
     *
     * @return the value
     **/
    public String getPrivateIpId() {
        return privateIpId;
    }

    /**
     * Whether the public IP is regional or specific to a particular availability domain.
     * <p>
     * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private
     * IP in any availability domain in the region. Reserved public IPs and ephemeral public IPs
     * assigned to a regional entity have {@code scope} = {@code REGION}.
     * <p>
     * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
     *
     **/
    public enum Scope {
        Region("REGION"),
        AvailabilityDomain("AVAILABILITY_DOMAIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Scope.class);

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
     * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private
     * IP in any availability domain in the region. Reserved public IPs and ephemeral public IPs
     * assigned to a regional entity have {@code scope} = {@code REGION}.
     * <p>
     * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final Scope scope;

    /**
     * Whether the public IP is regional or specific to a particular availability domain.
     * <p>
     * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private
     * IP in any availability domain in the region. Reserved public IPs and ephemeral public IPs
     * assigned to a regional entity have {@code scope} = {@code REGION}.
     * <p>
     * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
     *
     * @return the value
     **/
    public Scope getScope() {
        return scope;
    }

    /**
     * The date and time the public IP was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the public IP was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pool object created in the current tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicIpPoolId")
    private final String publicIpPoolId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pool object created in the current tenancy.
     * @return the value
     **/
    public String getPublicIpPoolId() {
        return publicIpPoolId;
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
        sb.append("PublicIp(");
        sb.append("super=").append(super.toString());
        sb.append("assignedEntityId=").append(String.valueOf(this.assignedEntityId));
        sb.append(", assignedEntityType=").append(String.valueOf(this.assignedEntityType));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifetime=").append(String.valueOf(this.lifetime));
        sb.append(", privateIpId=").append(String.valueOf(this.privateIpId));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", publicIpPoolId=").append(String.valueOf(this.publicIpPoolId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublicIp)) {
            return false;
        }

        PublicIp other = (PublicIp) o;
        return java.util.Objects.equals(this.assignedEntityId, other.assignedEntityId)
                && java.util.Objects.equals(this.assignedEntityType, other.assignedEntityType)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifetime, other.lifetime)
                && java.util.Objects.equals(this.privateIpId, other.privateIpId)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.publicIpPoolId, other.publicIpPoolId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.assignedEntityId == null ? 43 : this.assignedEntityId.hashCode());
        result =
                (result * PRIME)
                        + (this.assignedEntityType == null
                                ? 43
                                : this.assignedEntityType.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifetime == null ? 43 : this.lifetime.hashCode());
        result = (result * PRIME) + (this.privateIpId == null ? 43 : this.privateIpId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.publicIpPoolId == null ? 43 : this.publicIpPoolId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
