/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Summary of a log analytics entity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsEntitySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsEntitySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "compartmentId",
        "entityTypeName",
        "entityTypeInternalName",
        "lifecycleState",
        "lifecycleDetails",
        "managementAgentId",
        "cloudResourceId",
        "timezoneRegion",
        "timeCreated",
        "timeUpdated",
        "timeLastDiscovered",
        "metadata",
        "areLogsCollected",
        "sourceId",
        "creationSource",
        "freeformTags",
        "definedTags"
    })
    public LogAnalyticsEntitySummary(
            String id,
            String name,
            String compartmentId,
            String entityTypeName,
            String entityTypeInternalName,
            EntityLifecycleStates lifecycleState,
            String lifecycleDetails,
            String managementAgentId,
            String cloudResourceId,
            String timezoneRegion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastDiscovered,
            LogAnalyticsMetadataCollection metadata,
            Boolean areLogsCollected,
            String sourceId,
            CreationSource creationSource,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.name = name;
        this.compartmentId = compartmentId;
        this.entityTypeName = entityTypeName;
        this.entityTypeInternalName = entityTypeInternalName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.managementAgentId = managementAgentId;
        this.cloudResourceId = cloudResourceId;
        this.timezoneRegion = timezoneRegion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeLastDiscovered = timeLastDiscovered;
        this.metadata = metadata;
        this.areLogsCollected = areLogsCollected;
        this.sourceId = sourceId;
        this.creationSource = creationSource;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Log analytics entity name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Log analytics entity name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Log analytics entity type name. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
        private String entityTypeName;

        /**
         * Log analytics entity type name.
         *
         * @param entityTypeName the value to set
         * @return this builder
         */
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = entityTypeName;
            this.__explicitlySet__.add("entityTypeName");
            return this;
        }
        /** Internal name for the log analytics entity type. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeInternalName")
        private String entityTypeInternalName;

        /**
         * Internal name for the log analytics entity type.
         *
         * @param entityTypeInternalName the value to set
         * @return this builder
         */
        public Builder entityTypeInternalName(String entityTypeInternalName) {
            this.entityTypeInternalName = entityTypeInternalName;
            this.__explicitlySet__.add("entityTypeInternalName");
            return this;
        }
        /** The current state of the log analytics entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private EntityLifecycleStates lifecycleState;

        /**
         * The current state of the log analytics entity.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(EntityLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * lifecycleDetails has additional information regarding substeps such as management agent
         * plugin deployment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * lifecycleDetails has additional information regarding substeps such as management agent
         * plugin deployment.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The OCID of the Management Agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * The OCID of the Management Agent.
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /**
         * The OCID of the Cloud resource which this entity is a representation of. This may be
         * blank when the entity represents a non-cloud resource that the customer may have on their
         * premises.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudResourceId")
        private String cloudResourceId;

        /**
         * The OCID of the Cloud resource which this entity is a representation of. This may be
         * blank when the entity represents a non-cloud resource that the customer may have on their
         * premises.
         *
         * @param cloudResourceId the value to set
         * @return this builder
         */
        public Builder cloudResourceId(String cloudResourceId) {
            this.cloudResourceId = cloudResourceId;
            this.__explicitlySet__.add("cloudResourceId");
            return this;
        }
        /** The timezone region of the log analytics entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("timezoneRegion")
        private String timezoneRegion;

        /**
         * The timezone region of the log analytics entity.
         *
         * @param timezoneRegion the value to set
         * @return this builder
         */
        public Builder timezoneRegion(String timezoneRegion) {
            this.timezoneRegion = timezoneRegion;
            this.__explicitlySet__.add("timezoneRegion");
            return this;
        }
        /** The date and time the resource was created, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, in the format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the resource was last updated, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was last updated, in the format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The date and time the resource was last discovered, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDiscovered")
        private java.util.Date timeLastDiscovered;

        /**
         * The date and time the resource was last discovered, in the format defined by RFC3339.
         *
         * @param timeLastDiscovered the value to set
         * @return this builder
         */
        public Builder timeLastDiscovered(java.util.Date timeLastDiscovered) {
            this.timeLastDiscovered = timeLastDiscovered;
            this.__explicitlySet__.add("timeLastDiscovered");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private LogAnalyticsMetadataCollection metadata;

        public Builder metadata(LogAnalyticsMetadataCollection metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The Boolean flag to indicate if logs are collected for an entity for log analytics usage.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areLogsCollected")
        private Boolean areLogsCollected;

        /**
         * The Boolean flag to indicate if logs are collected for an entity for log analytics usage.
         *
         * @param areLogsCollected the value to set
         * @return this builder
         */
        public Builder areLogsCollected(Boolean areLogsCollected) {
            this.areLogsCollected = areLogsCollected;
            this.__explicitlySet__.add("areLogsCollected");
            return this;
        }
        /**
         * This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationSource")
        private CreationSource creationSource;

        public Builder creationSource(CreationSource creationSource) {
            this.creationSource = creationSource;
            this.__explicitlySet__.add("creationSource");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEntitySummary build() {
            LogAnalyticsEntitySummary model =
                    new LogAnalyticsEntitySummary(
                            this.id,
                            this.name,
                            this.compartmentId,
                            this.entityTypeName,
                            this.entityTypeInternalName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.managementAgentId,
                            this.cloudResourceId,
                            this.timezoneRegion,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeLastDiscovered,
                            this.metadata,
                            this.areLogsCollected,
                            this.sourceId,
                            this.creationSource,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEntitySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("entityTypeName")) {
                this.entityTypeName(model.getEntityTypeName());
            }
            if (model.wasPropertyExplicitlySet("entityTypeInternalName")) {
                this.entityTypeInternalName(model.getEntityTypeInternalName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("cloudResourceId")) {
                this.cloudResourceId(model.getCloudResourceId());
            }
            if (model.wasPropertyExplicitlySet("timezoneRegion")) {
                this.timezoneRegion(model.getTimezoneRegion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeLastDiscovered")) {
                this.timeLastDiscovered(model.getTimeLastDiscovered());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("areLogsCollected")) {
                this.areLogsCollected(model.getAreLogsCollected());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("creationSource")) {
                this.creationSource(model.getCreationSource());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Log analytics entity name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Log analytics entity name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Log analytics entity type name. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
    private final String entityTypeName;

    /**
     * Log analytics entity type name.
     *
     * @return the value
     */
    public String getEntityTypeName() {
        return entityTypeName;
    }

    /** Internal name for the log analytics entity type. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeInternalName")
    private final String entityTypeInternalName;

    /**
     * Internal name for the log analytics entity type.
     *
     * @return the value
     */
    public String getEntityTypeInternalName() {
        return entityTypeInternalName;
    }

    /** The current state of the log analytics entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final EntityLifecycleStates lifecycleState;

    /**
     * The current state of the log analytics entity.
     *
     * @return the value
     */
    public EntityLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * lifecycleDetails has additional information regarding substeps such as management agent
     * plugin deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * lifecycleDetails has additional information regarding substeps such as management agent
     * plugin deployment.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The OCID of the Management Agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * The OCID of the Management Agent.
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * The OCID of the Cloud resource which this entity is a representation of. This may be blank
     * when the entity represents a non-cloud resource that the customer may have on their premises.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudResourceId")
    private final String cloudResourceId;

    /**
     * The OCID of the Cloud resource which this entity is a representation of. This may be blank
     * when the entity represents a non-cloud resource that the customer may have on their premises.
     *
     * @return the value
     */
    public String getCloudResourceId() {
        return cloudResourceId;
    }

    /** The timezone region of the log analytics entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("timezoneRegion")
    private final String timezoneRegion;

    /**
     * The timezone region of the log analytics entity.
     *
     * @return the value
     */
    public String getTimezoneRegion() {
        return timezoneRegion;
    }

    /** The date and time the resource was created, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the resource was last updated, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was last updated, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The date and time the resource was last discovered, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDiscovered")
    private final java.util.Date timeLastDiscovered;

    /**
     * The date and time the resource was last discovered, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeLastDiscovered() {
        return timeLastDiscovered;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final LogAnalyticsMetadataCollection metadata;

    public LogAnalyticsMetadataCollection getMetadata() {
        return metadata;
    }

    /** The Boolean flag to indicate if logs are collected for an entity for log analytics usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("areLogsCollected")
    private final Boolean areLogsCollected;

    /**
     * The Boolean flag to indicate if logs are collected for an entity for log analytics usage.
     *
     * @return the value
     */
    public Boolean getAreLogsCollected() {
        return areLogsCollected;
    }

    /** This indicates the type of source. It is primarily for Enterprise Manager Repository ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("creationSource")
    private final CreationSource creationSource;

    public CreationSource getCreationSource() {
        return creationSource;
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
        sb.append("LogAnalyticsEntitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", entityTypeName=").append(String.valueOf(this.entityTypeName));
        sb.append(", entityTypeInternalName=").append(String.valueOf(this.entityTypeInternalName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", cloudResourceId=").append(String.valueOf(this.cloudResourceId));
        sb.append(", timezoneRegion=").append(String.valueOf(this.timezoneRegion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeLastDiscovered=").append(String.valueOf(this.timeLastDiscovered));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", areLogsCollected=").append(String.valueOf(this.areLogsCollected));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", creationSource=").append(String.valueOf(this.creationSource));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsEntitySummary)) {
            return false;
        }

        LogAnalyticsEntitySummary other = (LogAnalyticsEntitySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.entityTypeName, other.entityTypeName)
                && java.util.Objects.equals(
                        this.entityTypeInternalName, other.entityTypeInternalName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.cloudResourceId, other.cloudResourceId)
                && java.util.Objects.equals(this.timezoneRegion, other.timezoneRegion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeLastDiscovered, other.timeLastDiscovered)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.areLogsCollected, other.areLogsCollected)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.creationSource, other.creationSource)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeName == null ? 43 : this.entityTypeName.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeInternalName == null
                                ? 43
                                : this.entityTypeInternalName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudResourceId == null ? 43 : this.cloudResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.timezoneRegion == null ? 43 : this.timezoneRegion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDiscovered == null
                                ? 43
                                : this.timeLastDiscovered.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.areLogsCollected == null ? 43 : this.areLogsCollected.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.creationSource == null ? 43 : this.creationSource.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
