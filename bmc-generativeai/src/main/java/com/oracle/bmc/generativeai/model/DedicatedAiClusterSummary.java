/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Summary information about a dedicated AI cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DedicatedAiClusterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DedicatedAiClusterSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "type",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "unitCount",
        "unitShape",
        "capacity",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DedicatedAiClusterSummary(
            String id,
            String displayName,
            String description,
            DedicatedAiCluster.Type type,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            DedicatedAiCluster.LifecycleState lifecycleState,
            String lifecycleDetails,
            Integer unitCount,
            DedicatedAiCluster.UnitShape unitShape,
            DedicatedAiClusterCapacity capacity,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.unitCount = unitCount;
        this.unitShape = unitShape;
        this.capacity = capacity;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the dedicated AI cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the dedicated AI cluster.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-friendly name. Does not have to be unique, and it's changeable. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** An optional description of the dedicated AI cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of the dedicated AI cluster.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The dedicated AI cluster type indicating whether this is a fine-tuning/training processor
         * or hosting/inference processor.
         *
         * <p>Allowed values are: - HOSTING - FINE_TUNING
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DedicatedAiCluster.Type type;

        /**
         * The dedicated AI cluster type indicating whether this is a fine-tuning/training processor
         * or hosting/inference processor.
         *
         * <p>Allowed values are: - HOSTING - FINE_TUNING
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(DedicatedAiCluster.Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The compartment OCID to create the dedicated AI cluster in. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID to create the dedicated AI cluster in.
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
         * The date and time the dedicated AI cluster was created, in the format defined by RFC
         * 3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the dedicated AI cluster was created, in the format defined by RFC
         * 3339.
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
         * The date and time the dedicated AI cluster was updated, in the format defined by RFC
         * 3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the dedicated AI cluster was updated, in the format defined by RFC
         * 3339.
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
         * The current state of the dedicated AI cluster.
         *
         * <p>Allowed values are: - CREATING - ACTIVE - UPDATING - DELETING - DELETED - FAILED -
         * NEEDS_ATTENTION
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DedicatedAiCluster.LifecycleState lifecycleState;

        /**
         * The current state of the dedicated AI cluster.
         *
         * <p>Allowed values are: - CREATING - ACTIVE - UPDATING - DELETING - DELETED - FAILED -
         * NEEDS_ATTENTION
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(DedicatedAiCluster.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state of the dedicated AI cluster in more detail that
         * can provide actionable information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state of the dedicated AI cluster in more detail that
         * can provide actionable information.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The number of dedicated units in this AI cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("unitCount")
        private Integer unitCount;

        /**
         * The number of dedicated units in this AI cluster.
         *
         * @param unitCount the value to set
         * @return this builder
         */
        public Builder unitCount(Integer unitCount) {
            this.unitCount = unitCount;
            this.__explicitlySet__.add("unitCount");
            return this;
        }
        /**
         * The shape of dedicated unit in this AI cluster. The underlying hardware configuration is
         * hidden from customers.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unitShape")
        private DedicatedAiCluster.UnitShape unitShape;

        /**
         * The shape of dedicated unit in this AI cluster. The underlying hardware configuration is
         * hidden from customers.
         *
         * @param unitShape the value to set
         * @return this builder
         */
        public Builder unitShape(DedicatedAiCluster.UnitShape unitShape) {
            this.unitShape = unitShape;
            this.__explicitlySet__.add("unitShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private DedicatedAiClusterCapacity capacity;

        public Builder capacity(DedicatedAiClusterCapacity capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        public DedicatedAiClusterSummary build() {
            DedicatedAiClusterSummary model =
                    new DedicatedAiClusterSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.type,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.unitCount,
                            this.unitShape,
                            this.capacity,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DedicatedAiClusterSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("unitCount")) {
                this.unitCount(model.getUnitCount());
            }
            if (model.wasPropertyExplicitlySet("unitShape")) {
                this.unitShape(model.getUnitShape());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the dedicated AI cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the dedicated AI cluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-friendly name. Does not have to be unique, and it's changeable. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** An optional description of the dedicated AI cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of the dedicated AI cluster.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The dedicated AI cluster type indicating whether this is a fine-tuning/training processor or
     * hosting/inference processor.
     *
     * <p>Allowed values are: - HOSTING - FINE_TUNING
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DedicatedAiCluster.Type type;

    /**
     * The dedicated AI cluster type indicating whether this is a fine-tuning/training processor or
     * hosting/inference processor.
     *
     * <p>Allowed values are: - HOSTING - FINE_TUNING
     *
     * @return the value
     */
    public DedicatedAiCluster.Type getType() {
        return type;
    }

    /** The compartment OCID to create the dedicated AI cluster in. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID to create the dedicated AI cluster in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time the dedicated AI cluster was created, in the format defined by RFC 3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the dedicated AI cluster was created, in the format defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the dedicated AI cluster was updated, in the format defined by RFC 3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the dedicated AI cluster was updated, in the format defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the dedicated AI cluster.
     *
     * <p>Allowed values are: - CREATING - ACTIVE - UPDATING - DELETING - DELETED - FAILED -
     * NEEDS_ATTENTION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DedicatedAiCluster.LifecycleState lifecycleState;

    /**
     * The current state of the dedicated AI cluster.
     *
     * <p>Allowed values are: - CREATING - ACTIVE - UPDATING - DELETING - DELETED - FAILED -
     * NEEDS_ATTENTION
     *
     * @return the value
     */
    public DedicatedAiCluster.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state of the dedicated AI cluster in more detail that can
     * provide actionable information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state of the dedicated AI cluster in more detail that can
     * provide actionable information.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The number of dedicated units in this AI cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("unitCount")
    private final Integer unitCount;

    /**
     * The number of dedicated units in this AI cluster.
     *
     * @return the value
     */
    public Integer getUnitCount() {
        return unitCount;
    }

    /**
     * The shape of dedicated unit in this AI cluster. The underlying hardware configuration is
     * hidden from customers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unitShape")
    private final DedicatedAiCluster.UnitShape unitShape;

    /**
     * The shape of dedicated unit in this AI cluster. The underlying hardware configuration is
     * hidden from customers.
     *
     * @return the value
     */
    public DedicatedAiCluster.UnitShape getUnitShape() {
        return unitShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final DedicatedAiClusterCapacity capacity;

    public DedicatedAiClusterCapacity getCapacity() {
        return capacity;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("DedicatedAiClusterSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", unitCount=").append(String.valueOf(this.unitCount));
        sb.append(", unitShape=").append(String.valueOf(this.unitShape));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
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
        if (!(o instanceof DedicatedAiClusterSummary)) {
            return false;
        }

        DedicatedAiClusterSummary other = (DedicatedAiClusterSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.unitCount, other.unitCount)
                && java.util.Objects.equals(this.unitShape, other.unitShape)
                && java.util.Objects.equals(this.capacity, other.capacity)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.unitCount == null ? 43 : this.unitCount.hashCode());
        result = (result * PRIME) + (this.unitShape == null ? 43 : this.unitShape.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
