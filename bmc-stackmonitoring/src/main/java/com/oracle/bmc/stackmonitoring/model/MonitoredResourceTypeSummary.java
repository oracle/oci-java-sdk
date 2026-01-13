/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The summary of monitored resource type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MonitoredResourceTypeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MonitoredResourceTypeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "displayName",
        "description",
        "metricNamespace",
        "compartmentId",
        "availabilityMetricsConfig",
        "handlerConfig",
        "isSystemDefined",
        "lifecycleState",
        "sourceType",
        "resourceCategory",
        "metadata",
        "additionalNamespaceMap",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MonitoredResourceTypeSummary(
            String id,
            String name,
            String displayName,
            String description,
            String metricNamespace,
            String compartmentId,
            AvailabilityMetricsDetails availabilityMetricsConfig,
            AgentExtensionHandlerConfiguration handlerConfig,
            Boolean isSystemDefined,
            ResourceTypeLifecycleState lifecycleState,
            SourceType sourceType,
            ResourceCategory resourceCategory,
            ResourceTypeMetadataDetails metadata,
            java.util.Map<String, String> additionalNamespaceMap,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.metricNamespace = metricNamespace;
        this.compartmentId = compartmentId;
        this.availabilityMetricsConfig = availabilityMetricsConfig;
        this.handlerConfig = handlerConfig;
        this.isSystemDefined = isSystemDefined;
        this.lifecycleState = lifecycleState;
        this.sourceType = sourceType;
        this.resourceCategory = resourceCategory;
        this.metadata = metadata;
        this.additionalNamespaceMap = additionalNamespaceMap;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Monitored resource type identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Monitored resource type identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A unique monitored resource type name. The name must be unique across tenancy. Name can
         * not be changed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A unique monitored resource type name. The name must be unique across tenancy. Name can
         * not be changed.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Monitored resource type display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Monitored resource type display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A friendly description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A friendly description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Metric namespace for resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricNamespace")
        private String metricNamespace;

        /**
         * Metric namespace for resource type.
         *
         * @param metricNamespace the value to set
         * @return this builder
         */
        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = metricNamespace;
            this.__explicitlySet__.add("metricNamespace");
            return this;
        }
        /**
         * Compartment Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityMetricsConfig")
        private AvailabilityMetricsDetails availabilityMetricsConfig;

        public Builder availabilityMetricsConfig(
                AvailabilityMetricsDetails availabilityMetricsConfig) {
            this.availabilityMetricsConfig = availabilityMetricsConfig;
            this.__explicitlySet__.add("availabilityMetricsConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("handlerConfig")
        private AgentExtensionHandlerConfiguration handlerConfig;

        public Builder handlerConfig(AgentExtensionHandlerConfiguration handlerConfig) {
            this.handlerConfig = handlerConfig;
            this.__explicitlySet__.add("handlerConfig");
            return this;
        }
        /** If boolean flag is true, then the resource type cannot be modified or deleted. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSystemDefined")
        private Boolean isSystemDefined;

        /**
         * If boolean flag is true, then the resource type cannot be modified or deleted.
         *
         * @param isSystemDefined the value to set
         * @return this builder
         */
        public Builder isSystemDefined(Boolean isSystemDefined) {
            this.isSystemDefined = isSystemDefined;
            this.__explicitlySet__.add("isSystemDefined");
            return this;
        }
        /** Lifecycle state of the monitored resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ResourceTypeLifecycleState lifecycleState;

        /**
         * Lifecycle state of the monitored resource type.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ResourceTypeLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Source type to indicate if the resource is stack monitoring discovered, OCI native
         * resource, etc.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        /**
         * Source type to indicate if the resource is stack monitoring discovered, OCI native
         * resource, etc.
         *
         * @param sourceType the value to set
         * @return this builder
         */
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /** Resource Category to indicate the kind of resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceCategory")
        private ResourceCategory resourceCategory;

        /**
         * Resource Category to indicate the kind of resource type.
         *
         * @param resourceCategory the value to set
         * @return this builder
         */
        public Builder resourceCategory(ResourceCategory resourceCategory) {
            this.resourceCategory = resourceCategory;
            this.__explicitlySet__.add("resourceCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ResourceTypeMetadataDetails metadata;

        public Builder metadata(ResourceTypeMetadataDetails metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * Key/Value pair for additional namespaces used by stack monitoring services for SYSTEM
         * (SMB) resource types.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalNamespaceMap")
        private java.util.Map<String, String> additionalNamespaceMap;

        /**
         * Key/Value pair for additional namespaces used by stack monitoring services for SYSTEM
         * (SMB) resource types.
         *
         * @param additionalNamespaceMap the value to set
         * @return this builder
         */
        public Builder additionalNamespaceMap(
                java.util.Map<String, String> additionalNamespaceMap) {
            this.additionalNamespaceMap = additionalNamespaceMap;
            this.__explicitlySet__.add("additionalNamespaceMap");
            return this;
        }
        /**
         * The date and time when the monitored resource type was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the monitored resource type was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time when the monitored resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time when the monitored resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public MonitoredResourceTypeSummary build() {
            MonitoredResourceTypeSummary model =
                    new MonitoredResourceTypeSummary(
                            this.id,
                            this.name,
                            this.displayName,
                            this.description,
                            this.metricNamespace,
                            this.compartmentId,
                            this.availabilityMetricsConfig,
                            this.handlerConfig,
                            this.isSystemDefined,
                            this.lifecycleState,
                            this.sourceType,
                            this.resourceCategory,
                            this.metadata,
                            this.additionalNamespaceMap,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitoredResourceTypeSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("metricNamespace")) {
                this.metricNamespace(model.getMetricNamespace());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityMetricsConfig")) {
                this.availabilityMetricsConfig(model.getAvailabilityMetricsConfig());
            }
            if (model.wasPropertyExplicitlySet("handlerConfig")) {
                this.handlerConfig(model.getHandlerConfig());
            }
            if (model.wasPropertyExplicitlySet("isSystemDefined")) {
                this.isSystemDefined(model.getIsSystemDefined());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceCategory")) {
                this.resourceCategory(model.getResourceCategory());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("additionalNamespaceMap")) {
                this.additionalNamespaceMap(model.getAdditionalNamespaceMap());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /**
     * Monitored resource type identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Monitored resource type identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A unique monitored resource type name. The name must be unique across tenancy. Name can not
     * be changed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A unique monitored resource type name. The name must be unique across tenancy. Name can not
     * be changed.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Monitored resource type display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Monitored resource type display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A friendly description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A friendly description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Metric namespace for resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricNamespace")
    private final String metricNamespace;

    /**
     * Metric namespace for resource type.
     *
     * @return the value
     */
    public String getMetricNamespace() {
        return metricNamespace;
    }

    /**
     * Compartment Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availabilityMetricsConfig")
    private final AvailabilityMetricsDetails availabilityMetricsConfig;

    public AvailabilityMetricsDetails getAvailabilityMetricsConfig() {
        return availabilityMetricsConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("handlerConfig")
    private final AgentExtensionHandlerConfiguration handlerConfig;

    public AgentExtensionHandlerConfiguration getHandlerConfig() {
        return handlerConfig;
    }

    /** If boolean flag is true, then the resource type cannot be modified or deleted. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSystemDefined")
    private final Boolean isSystemDefined;

    /**
     * If boolean flag is true, then the resource type cannot be modified or deleted.
     *
     * @return the value
     */
    public Boolean getIsSystemDefined() {
        return isSystemDefined;
    }

    /** Lifecycle state of the monitored resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ResourceTypeLifecycleState lifecycleState;

    /**
     * Lifecycle state of the monitored resource type.
     *
     * @return the value
     */
    public ResourceTypeLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Source type to indicate if the resource is stack monitoring discovered, OCI native resource,
     * etc.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    /**
     * Source type to indicate if the resource is stack monitoring discovered, OCI native resource,
     * etc.
     *
     * @return the value
     */
    public SourceType getSourceType() {
        return sourceType;
    }

    /** Resource Category to indicate the kind of resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCategory")
    private final ResourceCategory resourceCategory;

    /**
     * Resource Category to indicate the kind of resource type.
     *
     * @return the value
     */
    public ResourceCategory getResourceCategory() {
        return resourceCategory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ResourceTypeMetadataDetails metadata;

    public ResourceTypeMetadataDetails getMetadata() {
        return metadata;
    }

    /**
     * Key/Value pair for additional namespaces used by stack monitoring services for SYSTEM (SMB)
     * resource types.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalNamespaceMap")
    private final java.util.Map<String, String> additionalNamespaceMap;

    /**
     * Key/Value pair for additional namespaces used by stack monitoring services for SYSTEM (SMB)
     * resource types.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalNamespaceMap() {
        return additionalNamespaceMap;
    }

    /**
     * The date and time when the monitored resource type was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the monitored resource type was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when the monitored resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time when the monitored resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("MonitoredResourceTypeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", metricNamespace=").append(String.valueOf(this.metricNamespace));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityMetricsConfig=")
                .append(String.valueOf(this.availabilityMetricsConfig));
        sb.append(", handlerConfig=").append(String.valueOf(this.handlerConfig));
        sb.append(", isSystemDefined=").append(String.valueOf(this.isSystemDefined));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", resourceCategory=").append(String.valueOf(this.resourceCategory));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", additionalNamespaceMap=").append(String.valueOf(this.additionalNamespaceMap));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof MonitoredResourceTypeSummary)) {
            return false;
        }

        MonitoredResourceTypeSummary other = (MonitoredResourceTypeSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.metricNamespace, other.metricNamespace)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.availabilityMetricsConfig, other.availabilityMetricsConfig)
                && java.util.Objects.equals(this.handlerConfig, other.handlerConfig)
                && java.util.Objects.equals(this.isSystemDefined, other.isSystemDefined)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.resourceCategory, other.resourceCategory)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(
                        this.additionalNamespaceMap, other.additionalNamespaceMap)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.metricNamespace == null ? 43 : this.metricNamespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityMetricsConfig == null
                                ? 43
                                : this.availabilityMetricsConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.handlerConfig == null ? 43 : this.handlerConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.isSystemDefined == null ? 43 : this.isSystemDefined.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCategory == null ? 43 : this.resourceCategory.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalNamespaceMap == null
                                ? 43
                                : this.additionalNamespaceMap.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
