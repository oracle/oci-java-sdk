/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * The multicloud resource, for eg. VMCluster, ExaInfra, and its attributes. The resource and
 * network anchor that represents <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MulticloudResourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MulticloudResourceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "resourceDisplayName",
        "resourceType",
        "compartmentName",
        "compartmentId",
        "vcnName",
        "vcnId",
        "networkAnchorName",
        "networkAnchorId",
        "cspResourceId",
        "timeCreated",
        "cspAdditionalProperties",
        "timeUpdated",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MulticloudResourceSummary(
            String resourceId,
            String resourceDisplayName,
            String resourceType,
            String compartmentName,
            String compartmentId,
            String vcnName,
            String vcnId,
            String networkAnchorName,
            String networkAnchorId,
            String cspResourceId,
            java.util.Date timeCreated,
            java.util.Map<String, String> cspAdditionalProperties,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.resourceId = resourceId;
        this.resourceDisplayName = resourceDisplayName;
        this.resourceType = resourceType;
        this.compartmentName = compartmentName;
        this.compartmentId = compartmentId;
        this.vcnName = vcnName;
        this.vcnId = vcnId;
        this.networkAnchorName = networkAnchorName;
        this.networkAnchorId = networkAnchorId;
        this.cspResourceId = cspResourceId;
        this.timeCreated = timeCreated;
        this.cspAdditionalProperties = cspAdditionalProperties;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Id of the multicloud resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The Id of the multicloud resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Endpoint used to retrieve displayName and lifeCycleState of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
        private String resourceDisplayName;

        /**
         * Endpoint used to retrieve displayName and lifeCycleState of the resource.
         *
         * @param resourceDisplayName the value to set
         * @return this builder
         */
        public Builder resourceDisplayName(String resourceDisplayName) {
            this.resourceDisplayName = resourceDisplayName;
            this.__explicitlySet__.add("resourceDisplayName");
            return this;
        }
        /** What resource it refers to. Eg. VMCluster, ExaInfra, etc. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * What resource it refers to. Eg. VMCluster, ExaInfra, etc.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** Compartment name associated the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        /**
         * Compartment name associated the resource.
         *
         * @param compartmentName the value to set
         * @return this builder
         */
        public Builder compartmentName(String compartmentName) {
            this.compartmentName = compartmentName;
            this.__explicitlySet__.add("compartmentName");
            return this;
        }
        /** Compartment Id of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Id of the resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Resource Anchor name. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnName")
        private String vcnName;

        /**
         * Resource Anchor name.
         *
         * @param vcnName the value to set
         * @return this builder
         */
        public Builder vcnName(String vcnName) {
            this.vcnName = vcnName;
            this.__explicitlySet__.add("vcnName");
            return this;
        }
        /** Id of the Virtual Cloud Network associated to the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * Id of the Virtual Cloud Network associated to the resource.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /** Name of the network anchor associated to the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorName")
        private String networkAnchorName;

        /**
         * Name of the network anchor associated to the resource.
         *
         * @param networkAnchorName the value to set
         * @return this builder
         */
        public Builder networkAnchorName(String networkAnchorName) {
            this.networkAnchorName = networkAnchorName;
            this.__explicitlySet__.add("networkAnchorName");
            return this;
        }
        /** OCID of the Network Anchor */
        @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorId")
        private String networkAnchorId;

        /**
         * OCID of the Network Anchor
         *
         * @param networkAnchorId the value to set
         * @return this builder
         */
        public Builder networkAnchorId(String networkAnchorId) {
            this.networkAnchorId = networkAnchorId;
            this.__explicitlySet__.add("networkAnchorId");
            return this;
        }
        /** Resource Id that comes from the Multi Cloud Control Plane */
        @com.fasterxml.jackson.annotation.JsonProperty("cspResourceId")
        private String cspResourceId;

        /**
         * Resource Id that comes from the Multi Cloud Control Plane
         *
         * @param cspResourceId the value to set
         * @return this builder
         */
        public Builder cspResourceId(String cspResourceId) {
            this.cspResourceId = cspResourceId;
            this.__explicitlySet__.add("cspResourceId");
            return this;
        }
        /**
         * The date and time the subscription was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the subscription was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** CSP Specific Additional Properties, AzureSubnetId for Azure */
        @com.fasterxml.jackson.annotation.JsonProperty("cspAdditionalProperties")
        private java.util.Map<String, String> cspAdditionalProperties;

        /**
         * CSP Specific Additional Properties, AzureSubnetId for Azure
         *
         * @param cspAdditionalProperties the value to set
         * @return this builder
         */
        public Builder cspAdditionalProperties(
                java.util.Map<String, String> cspAdditionalProperties) {
            this.cspAdditionalProperties = cspAdditionalProperties;
            this.__explicitlySet__.add("cspAdditionalProperties");
            return this;
        }
        /**
         * The date and time the subscription was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the subscription was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the multicloud resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the multicloud resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MulticloudResourceSummary build() {
            MulticloudResourceSummary model =
                    new MulticloudResourceSummary(
                            this.resourceId,
                            this.resourceDisplayName,
                            this.resourceType,
                            this.compartmentName,
                            this.compartmentId,
                            this.vcnName,
                            this.vcnId,
                            this.networkAnchorName,
                            this.networkAnchorId,
                            this.cspResourceId,
                            this.timeCreated,
                            this.cspAdditionalProperties,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MulticloudResourceSummary model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceDisplayName")) {
                this.resourceDisplayName(model.getResourceDisplayName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("compartmentName")) {
                this.compartmentName(model.getCompartmentName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("vcnName")) {
                this.vcnName(model.getVcnName());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("networkAnchorName")) {
                this.networkAnchorName(model.getNetworkAnchorName());
            }
            if (model.wasPropertyExplicitlySet("networkAnchorId")) {
                this.networkAnchorId(model.getNetworkAnchorId());
            }
            if (model.wasPropertyExplicitlySet("cspResourceId")) {
                this.cspResourceId(model.getCspResourceId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("cspAdditionalProperties")) {
                this.cspAdditionalProperties(model.getCspAdditionalProperties());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The Id of the multicloud resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The Id of the multicloud resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Endpoint used to retrieve displayName and lifeCycleState of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
    private final String resourceDisplayName;

    /**
     * Endpoint used to retrieve displayName and lifeCycleState of the resource.
     *
     * @return the value
     */
    public String getResourceDisplayName() {
        return resourceDisplayName;
    }

    /** What resource it refers to. Eg. VMCluster, ExaInfra, etc. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * What resource it refers to. Eg. VMCluster, ExaInfra, etc.
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** Compartment name associated the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    private final String compartmentName;

    /**
     * Compartment name associated the resource.
     *
     * @return the value
     */
    public String getCompartmentName() {
        return compartmentName;
    }

    /** Compartment Id of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Id of the resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Resource Anchor name. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnName")
    private final String vcnName;

    /**
     * Resource Anchor name.
     *
     * @return the value
     */
    public String getVcnName() {
        return vcnName;
    }

    /** Id of the Virtual Cloud Network associated to the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * Id of the Virtual Cloud Network associated to the resource.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /** Name of the network anchor associated to the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorName")
    private final String networkAnchorName;

    /**
     * Name of the network anchor associated to the resource.
     *
     * @return the value
     */
    public String getNetworkAnchorName() {
        return networkAnchorName;
    }

    /** OCID of the Network Anchor */
    @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorId")
    private final String networkAnchorId;

    /**
     * OCID of the Network Anchor
     *
     * @return the value
     */
    public String getNetworkAnchorId() {
        return networkAnchorId;
    }

    /** Resource Id that comes from the Multi Cloud Control Plane */
    @com.fasterxml.jackson.annotation.JsonProperty("cspResourceId")
    private final String cspResourceId;

    /**
     * Resource Id that comes from the Multi Cloud Control Plane
     *
     * @return the value
     */
    public String getCspResourceId() {
        return cspResourceId;
    }

    /**
     * The date and time the subscription was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the subscription was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** CSP Specific Additional Properties, AzureSubnetId for Azure */
    @com.fasterxml.jackson.annotation.JsonProperty("cspAdditionalProperties")
    private final java.util.Map<String, String> cspAdditionalProperties;

    /**
     * CSP Specific Additional Properties, AzureSubnetId for Azure
     *
     * @return the value
     */
    public java.util.Map<String, String> getCspAdditionalProperties() {
        return cspAdditionalProperties;
    }

    /**
     * The date and time the subscription was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the subscription was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the multicloud resource. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of the multicloud resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the multicloud resource.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MulticloudResourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceDisplayName=").append(String.valueOf(this.resourceDisplayName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", compartmentName=").append(String.valueOf(this.compartmentName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", vcnName=").append(String.valueOf(this.vcnName));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", networkAnchorName=").append(String.valueOf(this.networkAnchorName));
        sb.append(", networkAnchorId=").append(String.valueOf(this.networkAnchorId));
        sb.append(", cspResourceId=").append(String.valueOf(this.cspResourceId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", cspAdditionalProperties=")
                .append(String.valueOf(this.cspAdditionalProperties));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MulticloudResourceSummary)) {
            return false;
        }

        MulticloudResourceSummary other = (MulticloudResourceSummary) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceDisplayName, other.resourceDisplayName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.compartmentName, other.compartmentName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.vcnName, other.vcnName)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.networkAnchorName, other.networkAnchorName)
                && java.util.Objects.equals(this.networkAnchorId, other.networkAnchorId)
                && java.util.Objects.equals(this.cspResourceId, other.cspResourceId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.cspAdditionalProperties, other.cspAdditionalProperties)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceDisplayName == null
                                ? 43
                                : this.resourceDisplayName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentName == null ? 43 : this.compartmentName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.vcnName == null ? 43 : this.vcnName.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkAnchorName == null ? 43 : this.networkAnchorName.hashCode());
        result =
                (result * PRIME)
                        + (this.networkAnchorId == null ? 43 : this.networkAnchorId.hashCode());
        result =
                (result * PRIME)
                        + (this.cspResourceId == null ? 43 : this.cspResourceId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.cspAdditionalProperties == null
                                ? 43
                                : this.cspAdditionalProperties.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
