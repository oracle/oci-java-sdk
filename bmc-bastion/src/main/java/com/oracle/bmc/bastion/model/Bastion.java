/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * A bastion resource. A bastion provides secured, public access to target resources in the cloud that you cannot otherwise reach from the internet. A bastion resides in a public subnet and establishes the network infrastructure needed to connect a user to a target resource in a private subnet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Bastion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Bastion {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bastionType",
        "id",
        "name",
        "compartmentId",
        "targetVcnId",
        "targetSubnetId",
        "phoneBookEntry",
        "clientCidrBlockAllowList",
        "staticJumpHostIpAddresses",
        "privateEndpointIpAddress",
        "maxSessionTtlInSeconds",
        "maxSessionsAllowed",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Bastion(
            String bastionType,
            String id,
            String name,
            String compartmentId,
            String targetVcnId,
            String targetSubnetId,
            String phoneBookEntry,
            java.util.List<String> clientCidrBlockAllowList,
            java.util.List<String> staticJumpHostIpAddresses,
            String privateEndpointIpAddress,
            Integer maxSessionTtlInSeconds,
            Integer maxSessionsAllowed,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            BastionLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.bastionType = bastionType;
        this.id = id;
        this.name = name;
        this.compartmentId = compartmentId;
        this.targetVcnId = targetVcnId;
        this.targetSubnetId = targetSubnetId;
        this.phoneBookEntry = phoneBookEntry;
        this.clientCidrBlockAllowList = clientCidrBlockAllowList;
        this.staticJumpHostIpAddresses = staticJumpHostIpAddresses;
        this.privateEndpointIpAddress = privateEndpointIpAddress;
        this.maxSessionTtlInSeconds = maxSessionTtlInSeconds;
        this.maxSessionsAllowed = maxSessionsAllowed;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of bastion.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bastionType")
        private String bastionType;

        /**
         * The type of bastion.
         * @param bastionType the value to set
         * @return this builder
         **/
        public Builder bastionType(String bastionType) {
            this.bastionType = bastionType;
            this.__explicitlySet__.add("bastionType");
            return this;
        }
        /**
         * The unique identifier (OCID) of the bastion, which can't be changed after creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the bastion, which can't be changed after creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the bastion, which can't be changed after creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the bastion, which can't be changed after creation.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The unique identifier (OCID) of the compartment where the bastion is located.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The unique identifier (OCID) of the compartment where the bastion is located.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The unique identifier (OCID) of the virtual cloud network (VCN) that the bastion connects to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetVcnId")
        private String targetVcnId;

        /**
         * The unique identifier (OCID) of the virtual cloud network (VCN) that the bastion connects to.
         * @param targetVcnId the value to set
         * @return this builder
         **/
        public Builder targetVcnId(String targetVcnId) {
            this.targetVcnId = targetVcnId;
            this.__explicitlySet__.add("targetVcnId");
            return this;
        }
        /**
         * The unique identifier (OCID) of the subnet that the bastion connects to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetSubnetId")
        private String targetSubnetId;

        /**
         * The unique identifier (OCID) of the subnet that the bastion connects to.
         * @param targetSubnetId the value to set
         * @return this builder
         **/
        public Builder targetSubnetId(String targetSubnetId) {
            this.targetSubnetId = targetSubnetId;
            this.__explicitlySet__.add("targetSubnetId");
            return this;
        }
        /**
         * The phonebook entry of the customer's team, which can't be changed after creation. Not applicable to {@code standard} bastions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phoneBookEntry")
        private String phoneBookEntry;

        /**
         * The phonebook entry of the customer's team, which can't be changed after creation. Not applicable to {@code standard} bastions.
         *
         * @param phoneBookEntry the value to set
         * @return this builder
         **/
        public Builder phoneBookEntry(String phoneBookEntry) {
            this.phoneBookEntry = phoneBookEntry;
            this.__explicitlySet__.add("phoneBookEntry");
            return this;
        }
        /**
         * A list of address ranges in CIDR notation that you want to allow to connect to sessions hosted by this bastion.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientCidrBlockAllowList")
        private java.util.List<String> clientCidrBlockAllowList;

        /**
         * A list of address ranges in CIDR notation that you want to allow to connect to sessions hosted by this bastion.
         * @param clientCidrBlockAllowList the value to set
         * @return this builder
         **/
        public Builder clientCidrBlockAllowList(java.util.List<String> clientCidrBlockAllowList) {
            this.clientCidrBlockAllowList = clientCidrBlockAllowList;
            this.__explicitlySet__.add("clientCidrBlockAllowList");
            return this;
        }
        /**
         * A list of IP addresses of the hosts that the bastion has access to. Not applicable to {@code standard} bastions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("staticJumpHostIpAddresses")
        private java.util.List<String> staticJumpHostIpAddresses;

        /**
         * A list of IP addresses of the hosts that the bastion has access to. Not applicable to {@code standard} bastions.
         *
         * @param staticJumpHostIpAddresses the value to set
         * @return this builder
         **/
        public Builder staticJumpHostIpAddresses(java.util.List<String> staticJumpHostIpAddresses) {
            this.staticJumpHostIpAddresses = staticJumpHostIpAddresses;
            this.__explicitlySet__.add("staticJumpHostIpAddresses");
            return this;
        }
        /**
         * The private IP address of the created private endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIpAddress")
        private String privateEndpointIpAddress;

        /**
         * The private IP address of the created private endpoint.
         * @param privateEndpointIpAddress the value to set
         * @return this builder
         **/
        public Builder privateEndpointIpAddress(String privateEndpointIpAddress) {
            this.privateEndpointIpAddress = privateEndpointIpAddress;
            this.__explicitlySet__.add("privateEndpointIpAddress");
            return this;
        }
        /**
         * The maximum amount of time that any session on the bastion can remain active.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxSessionTtlInSeconds")
        private Integer maxSessionTtlInSeconds;

        /**
         * The maximum amount of time that any session on the bastion can remain active.
         * @param maxSessionTtlInSeconds the value to set
         * @return this builder
         **/
        public Builder maxSessionTtlInSeconds(Integer maxSessionTtlInSeconds) {
            this.maxSessionTtlInSeconds = maxSessionTtlInSeconds;
            this.__explicitlySet__.add("maxSessionTtlInSeconds");
            return this;
        }
        /**
         * The maximum number of active sessions allowed on the bastion.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxSessionsAllowed")
        private Integer maxSessionsAllowed;

        /**
         * The maximum number of active sessions allowed on the bastion.
         * @param maxSessionsAllowed the value to set
         * @return this builder
         **/
        public Builder maxSessionsAllowed(Integer maxSessionsAllowed) {
            this.maxSessionsAllowed = maxSessionsAllowed;
            this.__explicitlySet__.add("maxSessionsAllowed");
            return this;
        }
        /**
         * The time the bastion was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the bastion was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
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
         * The time the bastion was updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the bastion was updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the bastion.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private BastionLifecycleState lifecycleState;

        /**
         * The current state of the bastion.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(BastionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Bastion build() {
            Bastion __instance__ =
                    new Bastion(
                            bastionType,
                            id,
                            name,
                            compartmentId,
                            targetVcnId,
                            targetSubnetId,
                            phoneBookEntry,
                            clientCidrBlockAllowList,
                            staticJumpHostIpAddresses,
                            privateEndpointIpAddress,
                            maxSessionTtlInSeconds,
                            maxSessionsAllowed,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Bastion o) {
            Builder copiedBuilder =
                    bastionType(o.getBastionType())
                            .id(o.getId())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .targetVcnId(o.getTargetVcnId())
                            .targetSubnetId(o.getTargetSubnetId())
                            .phoneBookEntry(o.getPhoneBookEntry())
                            .clientCidrBlockAllowList(o.getClientCidrBlockAllowList())
                            .staticJumpHostIpAddresses(o.getStaticJumpHostIpAddresses())
                            .privateEndpointIpAddress(o.getPrivateEndpointIpAddress())
                            .maxSessionTtlInSeconds(o.getMaxSessionTtlInSeconds())
                            .maxSessionsAllowed(o.getMaxSessionsAllowed())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The type of bastion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bastionType")
    private final String bastionType;

    /**
     * The type of bastion.
     * @return the value
     **/
    public String getBastionType() {
        return bastionType;
    }

    /**
     * The unique identifier (OCID) of the bastion, which can't be changed after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the bastion, which can't be changed after creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the bastion, which can't be changed after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the bastion, which can't be changed after creation.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The unique identifier (OCID) of the compartment where the bastion is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier (OCID) of the compartment where the bastion is located.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The unique identifier (OCID) of the virtual cloud network (VCN) that the bastion connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetVcnId")
    private final String targetVcnId;

    /**
     * The unique identifier (OCID) of the virtual cloud network (VCN) that the bastion connects to.
     * @return the value
     **/
    public String getTargetVcnId() {
        return targetVcnId;
    }

    /**
     * The unique identifier (OCID) of the subnet that the bastion connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetSubnetId")
    private final String targetSubnetId;

    /**
     * The unique identifier (OCID) of the subnet that the bastion connects to.
     * @return the value
     **/
    public String getTargetSubnetId() {
        return targetSubnetId;
    }

    /**
     * The phonebook entry of the customer's team, which can't be changed after creation. Not applicable to {@code standard} bastions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phoneBookEntry")
    private final String phoneBookEntry;

    /**
     * The phonebook entry of the customer's team, which can't be changed after creation. Not applicable to {@code standard} bastions.
     *
     * @return the value
     **/
    public String getPhoneBookEntry() {
        return phoneBookEntry;
    }

    /**
     * A list of address ranges in CIDR notation that you want to allow to connect to sessions hosted by this bastion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientCidrBlockAllowList")
    private final java.util.List<String> clientCidrBlockAllowList;

    /**
     * A list of address ranges in CIDR notation that you want to allow to connect to sessions hosted by this bastion.
     * @return the value
     **/
    public java.util.List<String> getClientCidrBlockAllowList() {
        return clientCidrBlockAllowList;
    }

    /**
     * A list of IP addresses of the hosts that the bastion has access to. Not applicable to {@code standard} bastions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("staticJumpHostIpAddresses")
    private final java.util.List<String> staticJumpHostIpAddresses;

    /**
     * A list of IP addresses of the hosts that the bastion has access to. Not applicable to {@code standard} bastions.
     *
     * @return the value
     **/
    public java.util.List<String> getStaticJumpHostIpAddresses() {
        return staticJumpHostIpAddresses;
    }

    /**
     * The private IP address of the created private endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIpAddress")
    private final String privateEndpointIpAddress;

    /**
     * The private IP address of the created private endpoint.
     * @return the value
     **/
    public String getPrivateEndpointIpAddress() {
        return privateEndpointIpAddress;
    }

    /**
     * The maximum amount of time that any session on the bastion can remain active.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSessionTtlInSeconds")
    private final Integer maxSessionTtlInSeconds;

    /**
     * The maximum amount of time that any session on the bastion can remain active.
     * @return the value
     **/
    public Integer getMaxSessionTtlInSeconds() {
        return maxSessionTtlInSeconds;
    }

    /**
     * The maximum number of active sessions allowed on the bastion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSessionsAllowed")
    private final Integer maxSessionsAllowed;

    /**
     * The maximum number of active sessions allowed on the bastion.
     * @return the value
     **/
    public Integer getMaxSessionsAllowed() {
        return maxSessionsAllowed;
    }

    /**
     * The time the bastion was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the bastion was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the bastion was updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the bastion was updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the bastion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final BastionLifecycleState lifecycleState;

    /**
     * The current state of the bastion.
     * @return the value
     **/
    public BastionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Bastion(");
        sb.append("bastionType=").append(String.valueOf(this.bastionType));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetVcnId=").append(String.valueOf(this.targetVcnId));
        sb.append(", targetSubnetId=").append(String.valueOf(this.targetSubnetId));
        sb.append(", phoneBookEntry=").append(String.valueOf(this.phoneBookEntry));
        sb.append(", clientCidrBlockAllowList=")
                .append(String.valueOf(this.clientCidrBlockAllowList));
        sb.append(", staticJumpHostIpAddresses=")
                .append(String.valueOf(this.staticJumpHostIpAddresses));
        sb.append(", privateEndpointIpAddress=")
                .append(String.valueOf(this.privateEndpointIpAddress));
        sb.append(", maxSessionTtlInSeconds=").append(String.valueOf(this.maxSessionTtlInSeconds));
        sb.append(", maxSessionsAllowed=").append(String.valueOf(this.maxSessionsAllowed));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Bastion)) {
            return false;
        }

        Bastion other = (Bastion) o;
        return java.util.Objects.equals(this.bastionType, other.bastionType)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetVcnId, other.targetVcnId)
                && java.util.Objects.equals(this.targetSubnetId, other.targetSubnetId)
                && java.util.Objects.equals(this.phoneBookEntry, other.phoneBookEntry)
                && java.util.Objects.equals(
                        this.clientCidrBlockAllowList, other.clientCidrBlockAllowList)
                && java.util.Objects.equals(
                        this.staticJumpHostIpAddresses, other.staticJumpHostIpAddresses)
                && java.util.Objects.equals(
                        this.privateEndpointIpAddress, other.privateEndpointIpAddress)
                && java.util.Objects.equals(
                        this.maxSessionTtlInSeconds, other.maxSessionTtlInSeconds)
                && java.util.Objects.equals(this.maxSessionsAllowed, other.maxSessionsAllowed)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bastionType == null ? 43 : this.bastionType.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targetVcnId == null ? 43 : this.targetVcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetSubnetId == null ? 43 : this.targetSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.phoneBookEntry == null ? 43 : this.phoneBookEntry.hashCode());
        result =
                (result * PRIME)
                        + (this.clientCidrBlockAllowList == null
                                ? 43
                                : this.clientCidrBlockAllowList.hashCode());
        result =
                (result * PRIME)
                        + (this.staticJumpHostIpAddresses == null
                                ? 43
                                : this.staticJumpHostIpAddresses.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIpAddress == null
                                ? 43
                                : this.privateEndpointIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.maxSessionTtlInSeconds == null
                                ? 43
                                : this.maxSessionTtlInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.maxSessionsAllowed == null
                                ? 43
                                : this.maxSessionsAllowed.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
