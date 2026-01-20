/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Model group is a collection of the models. Model groups are represented by their associated
 * metadata. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ModelGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModelGroup extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "projectId",
        "displayName",
        "description",
        "modelGroupDetails",
        "memberModelEntries",
        "freeformTags",
        "definedTags",
        "systemTags",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "createdBy",
        "modelGroupVersionHistoryId",
        "modelGroupVersionHistoryName",
        "versionLabel",
        "versionId",
        "createType",
        "sourceModelGroupId"
    })
    public ModelGroup(
            String id,
            String compartmentId,
            String projectId,
            String displayName,
            String description,
            ModelGroupDetails modelGroupDetails,
            MemberModelEntries memberModelEntries,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            ModelGroupLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdBy,
            String modelGroupVersionHistoryId,
            String modelGroupVersionHistoryName,
            String versionLabel,
            Long versionId,
            String createType,
            String sourceModelGroupId) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.projectId = projectId;
        this.displayName = displayName;
        this.description = description;
        this.modelGroupDetails = modelGroupDetails;
        this.memberModelEntries = memberModelEntries;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.modelGroupVersionHistoryId = modelGroupVersionHistoryId;
        this.modelGroupVersionHistoryName = modelGroupVersionHistoryName;
        this.versionLabel = versionLabel;
        this.versionId = versionId;
        this.createType = createType;
        this.sourceModelGroupId = sourceModelGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * modelGroup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * modelGroup.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * modelGroup's compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * modelGroup's compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * project associated with the modelGroup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * project associated with the modelGroup.
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * A user-friendly display name for the resource. It does not have to be unique and can be
         * modified. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource. It does not have to be unique and can be
         * modified. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A short description of the modelGroup. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the modelGroup.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelGroupDetails")
        private ModelGroupDetails modelGroupDetails;

        public Builder modelGroupDetails(ModelGroupDetails modelGroupDetails) {
            this.modelGroupDetails = modelGroupDetails;
            this.__explicitlySet__.add("modelGroupDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memberModelEntries")
        private MemberModelEntries memberModelEntries;

        public Builder memberModelEntries(MemberModelEntries memberModelEntries) {
            this.memberModelEntries = memberModelEntries;
            this.__explicitlySet__.add("memberModelEntries");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /** The state of the modelGroup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ModelGroupLifecycleState lifecycleState;

        /**
         * The state of the modelGroup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ModelGroupLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the lifecycle state of the model group. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the lifecycle state of the model group.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the resource was created in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
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
         * The date and time the resource was updated in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was updated in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * user who created the modelGroup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * user who created the modelGroup.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model group version history to which the modelGroup is associated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modelGroupVersionHistoryId")
        private String modelGroupVersionHistoryId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model group version history to which the modelGroup is associated.
         *
         * @param modelGroupVersionHistoryId the value to set
         * @return this builder
         */
        public Builder modelGroupVersionHistoryId(String modelGroupVersionHistoryId) {
            this.modelGroupVersionHistoryId = modelGroupVersionHistoryId;
            this.__explicitlySet__.add("modelGroupVersionHistoryId");
            return this;
        }
        /** The name of the model group version history to which the model group is associated. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelGroupVersionHistoryName")
        private String modelGroupVersionHistoryName;

        /**
         * The name of the model group version history to which the model group is associated.
         *
         * @param modelGroupVersionHistoryName the value to set
         * @return this builder
         */
        public Builder modelGroupVersionHistoryName(String modelGroupVersionHistoryName) {
            this.modelGroupVersionHistoryName = modelGroupVersionHistoryName;
            this.__explicitlySet__.add("modelGroupVersionHistoryName");
            return this;
        }
        /** An additional description of the lifecycle state of the model group. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionLabel")
        private String versionLabel;

        /**
         * An additional description of the lifecycle state of the model group.
         *
         * @param versionLabel the value to set
         * @return this builder
         */
        public Builder versionLabel(String versionLabel) {
            this.versionLabel = versionLabel;
            this.__explicitlySet__.add("versionLabel");
            return this;
        }
        /**
         * Unique identifier assigned to each version of the model group. It would be
         * auto-incremented number generated by service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("versionId")
        private Long versionId;

        /**
         * Unique identifier assigned to each version of the model group. It would be
         * auto-incremented number generated by service.
         *
         * @param versionId the value to set
         * @return this builder
         */
        public Builder versionId(Long versionId) {
            this.versionId = versionId;
            this.__explicitlySet__.add("versionId");
            return this;
        }
        /** The type of the model group create operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("createType")
        private String createType;

        /**
         * The type of the model group create operation.
         *
         * @param createType the value to set
         * @return this builder
         */
        public Builder createType(String createType) {
            this.createType = createType;
            this.__explicitlySet__.add("createType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model group used for the clone operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceModelGroupId")
        private String sourceModelGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model group used for the clone operation.
         *
         * @param sourceModelGroupId the value to set
         * @return this builder
         */
        public Builder sourceModelGroupId(String sourceModelGroupId) {
            this.sourceModelGroupId = sourceModelGroupId;
            this.__explicitlySet__.add("sourceModelGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelGroup build() {
            ModelGroup model =
                    new ModelGroup(
                            this.id,
                            this.compartmentId,
                            this.projectId,
                            this.displayName,
                            this.description,
                            this.modelGroupDetails,
                            this.memberModelEntries,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdBy,
                            this.modelGroupVersionHistoryId,
                            this.modelGroupVersionHistoryName,
                            this.versionLabel,
                            this.versionId,
                            this.createType,
                            this.sourceModelGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelGroup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("modelGroupDetails")) {
                this.modelGroupDetails(model.getModelGroupDetails());
            }
            if (model.wasPropertyExplicitlySet("memberModelEntries")) {
                this.memberModelEntries(model.getMemberModelEntries());
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("modelGroupVersionHistoryId")) {
                this.modelGroupVersionHistoryId(model.getModelGroupVersionHistoryId());
            }
            if (model.wasPropertyExplicitlySet("modelGroupVersionHistoryName")) {
                this.modelGroupVersionHistoryName(model.getModelGroupVersionHistoryName());
            }
            if (model.wasPropertyExplicitlySet("versionLabel")) {
                this.versionLabel(model.getVersionLabel());
            }
            if (model.wasPropertyExplicitlySet("versionId")) {
                this.versionId(model.getVersionId());
            }
            if (model.wasPropertyExplicitlySet("createType")) {
                this.createType(model.getCreateType());
            }
            if (model.wasPropertyExplicitlySet("sourceModelGroupId")) {
                this.sourceModelGroupId(model.getSourceModelGroupId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * modelGroup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * modelGroup.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * modelGroup's compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * modelGroup's compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * project associated with the modelGroup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * project associated with the modelGroup.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * A user-friendly display name for the resource. It does not have to be unique and can be
     * modified. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource. It does not have to be unique and can be
     * modified. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A short description of the modelGroup. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the modelGroup.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelGroupDetails")
    private final ModelGroupDetails modelGroupDetails;

    public ModelGroupDetails getModelGroupDetails() {
        return modelGroupDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memberModelEntries")
    private final MemberModelEntries memberModelEntries;

    public MemberModelEntries getMemberModelEntries() {
        return memberModelEntries;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

    /** The state of the modelGroup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ModelGroupLifecycleState lifecycleState;

    /**
     * The state of the modelGroup.
     *
     * @return the value
     */
    public ModelGroupLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the lifecycle state of the model group. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the lifecycle state of the model group.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the resource was created in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the resource was updated in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was updated in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-08-25T21:10:29.41Z
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user
     * who created the modelGroup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user
     * who created the modelGroup.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model group version history to which the modelGroup is associated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modelGroupVersionHistoryId")
    private final String modelGroupVersionHistoryId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model group version history to which the modelGroup is associated.
     *
     * @return the value
     */
    public String getModelGroupVersionHistoryId() {
        return modelGroupVersionHistoryId;
    }

    /** The name of the model group version history to which the model group is associated. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelGroupVersionHistoryName")
    private final String modelGroupVersionHistoryName;

    /**
     * The name of the model group version history to which the model group is associated.
     *
     * @return the value
     */
    public String getModelGroupVersionHistoryName() {
        return modelGroupVersionHistoryName;
    }

    /** An additional description of the lifecycle state of the model group. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionLabel")
    private final String versionLabel;

    /**
     * An additional description of the lifecycle state of the model group.
     *
     * @return the value
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * Unique identifier assigned to each version of the model group. It would be auto-incremented
     * number generated by service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versionId")
    private final Long versionId;

    /**
     * Unique identifier assigned to each version of the model group. It would be auto-incremented
     * number generated by service.
     *
     * @return the value
     */
    public Long getVersionId() {
        return versionId;
    }

    /** The type of the model group create operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("createType")
    private final String createType;

    /**
     * The type of the model group create operation.
     *
     * @return the value
     */
    public String getCreateType() {
        return createType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model group used for the clone operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceModelGroupId")
    private final String sourceModelGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model group used for the clone operation.
     *
     * @return the value
     */
    public String getSourceModelGroupId() {
        return sourceModelGroupId;
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
        sb.append("ModelGroup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelGroupDetails=").append(String.valueOf(this.modelGroupDetails));
        sb.append(", memberModelEntries=").append(String.valueOf(this.memberModelEntries));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", modelGroupVersionHistoryId=")
                .append(String.valueOf(this.modelGroupVersionHistoryId));
        sb.append(", modelGroupVersionHistoryName=")
                .append(String.valueOf(this.modelGroupVersionHistoryName));
        sb.append(", versionLabel=").append(String.valueOf(this.versionLabel));
        sb.append(", versionId=").append(String.valueOf(this.versionId));
        sb.append(", createType=").append(String.valueOf(this.createType));
        sb.append(", sourceModelGroupId=").append(String.valueOf(this.sourceModelGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelGroup)) {
            return false;
        }

        ModelGroup other = (ModelGroup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.modelGroupDetails, other.modelGroupDetails)
                && java.util.Objects.equals(this.memberModelEntries, other.memberModelEntries)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(
                        this.modelGroupVersionHistoryId, other.modelGroupVersionHistoryId)
                && java.util.Objects.equals(
                        this.modelGroupVersionHistoryName, other.modelGroupVersionHistoryName)
                && java.util.Objects.equals(this.versionLabel, other.versionLabel)
                && java.util.Objects.equals(this.versionId, other.versionId)
                && java.util.Objects.equals(this.createType, other.createType)
                && java.util.Objects.equals(this.sourceModelGroupId, other.sourceModelGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.modelGroupDetails == null ? 43 : this.modelGroupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.memberModelEntries == null
                                ? 43
                                : this.memberModelEntries.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.modelGroupVersionHistoryId == null
                                ? 43
                                : this.modelGroupVersionHistoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.modelGroupVersionHistoryName == null
                                ? 43
                                : this.modelGroupVersionHistoryName.hashCode());
        result = (result * PRIME) + (this.versionLabel == null ? 43 : this.versionLabel.hashCode());
        result = (result * PRIME) + (this.versionId == null ? 43 : this.versionId.hashCode());
        result = (result * PRIME) + (this.createType == null ? 43 : this.createType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceModelGroupId == null
                                ? 43
                                : this.sourceModelGroupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
