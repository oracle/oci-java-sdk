/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary information for a target detector recipe <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TargetDetectorRecipeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TargetDetectorRecipeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "owner",
        "detectorRecipeId",
        "detector",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "lifecycleDetails",
        "locks",
        "detectorRecipeType",
        "sourceDataRetention"
    })
    public TargetDetectorRecipeSummary(
            String id,
            String compartmentId,
            String displayName,
            String description,
            OwnerType owner,
            String detectorRecipeId,
            DetectorEnum detector,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String lifecycleDetails,
            java.util.List<ResourceLock> locks,
            DetectorRecipeEnum detectorRecipeType,
            Integer sourceDataRetention) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.owner = owner;
        this.detectorRecipeId = detectorRecipeId;
        this.detector = detector;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleDetails = lifecycleDetails;
        this.locks = locks;
        this.detectorRecipeType = detectorRecipeType;
        this.sourceDataRetention = sourceDataRetention;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that can't be changed after creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that can't be changed after creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Compartment OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Detector recipe's display name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Detector recipe's display name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Detector recipe's description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detector recipe's description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Detector recipe's owner */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private OwnerType owner;

        /**
         * Detector recipe's owner
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(OwnerType owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** Unique identifier for detector recipe of which this is an extension */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
        private String detectorRecipeId;

        /**
         * Unique identifier for detector recipe of which this is an extension
         *
         * @param detectorRecipeId the value to set
         * @return this builder
         */
        public Builder detectorRecipeId(String detectorRecipeId) {
            this.detectorRecipeId = detectorRecipeId;
            this.__explicitlySet__.add("detectorRecipeId");
            return this;
        }
        /** Type of detector */
        @com.fasterxml.jackson.annotation.JsonProperty("detector")
        private DetectorEnum detector;

        /**
         * Type of detector
         *
         * @param detector the value to set
         * @return this builder
         */
        public Builder detector(DetectorEnum detector) {
            this.detector = detector;
            this.__explicitlySet__.add("detector");
            return this;
        }
        /** The current lifecycle state of the resource */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the resource
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The date and time the target detector recipe was created. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the target detector recipe was created. Format defined by RFC3339.
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
         * The date and time the target detector recipe was last updated. Format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the target detector recipe was last updated. Format defined by RFC3339.
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
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /** Recipe type ( STANDARD, ENTERPRISE ) */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeType")
        private DetectorRecipeEnum detectorRecipeType;

        /**
         * Recipe type ( STANDARD, ENTERPRISE )
         *
         * @param detectorRecipeType the value to set
         * @return this builder
         */
        public Builder detectorRecipeType(DetectorRecipeEnum detectorRecipeType) {
            this.detectorRecipeType = detectorRecipeType;
            this.__explicitlySet__.add("detectorRecipeType");
            return this;
        }
        /** The number of days for which source data is retained */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDataRetention")
        private Integer sourceDataRetention;

        /**
         * The number of days for which source data is retained
         *
         * @param sourceDataRetention the value to set
         * @return this builder
         */
        public Builder sourceDataRetention(Integer sourceDataRetention) {
            this.sourceDataRetention = sourceDataRetention;
            this.__explicitlySet__.add("sourceDataRetention");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetDetectorRecipeSummary build() {
            TargetDetectorRecipeSummary model =
                    new TargetDetectorRecipeSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.owner,
                            this.detectorRecipeId,
                            this.detector,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleDetails,
                            this.locks,
                            this.detectorRecipeType,
                            this.sourceDataRetention);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetDetectorRecipeSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("detectorRecipeId")) {
                this.detectorRecipeId(model.getDetectorRecipeId());
            }
            if (model.wasPropertyExplicitlySet("detector")) {
                this.detector(model.getDetector());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("detectorRecipeType")) {
                this.detectorRecipeType(model.getDetectorRecipeType());
            }
            if (model.wasPropertyExplicitlySet("sourceDataRetention")) {
                this.sourceDataRetention(model.getSourceDataRetention());
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

    /** Unique identifier that can't be changed after creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that can't be changed after creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Compartment OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Detector recipe's display name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Detector recipe's display name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Detector recipe's description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detector recipe's description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Detector recipe's owner */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final OwnerType owner;

    /**
     * Detector recipe's owner
     *
     * @return the value
     */
    public OwnerType getOwner() {
        return owner;
    }

    /** Unique identifier for detector recipe of which this is an extension */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeId")
    private final String detectorRecipeId;

    /**
     * Unique identifier for detector recipe of which this is an extension
     *
     * @return the value
     */
    public String getDetectorRecipeId() {
        return detectorRecipeId;
    }

    /** Type of detector */
    @com.fasterxml.jackson.annotation.JsonProperty("detector")
    private final DetectorEnum detector;

    /**
     * Type of detector
     *
     * @return the value
     */
    public DetectorEnum getDetector() {
        return detector;
    }

    /** The current lifecycle state of the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the resource
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The date and time the target detector recipe was created. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the target detector recipe was created. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the target detector recipe was last updated. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the target detector recipe was last updated. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
    }

    /** Recipe type ( STANDARD, ENTERPRISE ) */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRecipeType")
    private final DetectorRecipeEnum detectorRecipeType;

    /**
     * Recipe type ( STANDARD, ENTERPRISE )
     *
     * @return the value
     */
    public DetectorRecipeEnum getDetectorRecipeType() {
        return detectorRecipeType;
    }

    /** The number of days for which source data is retained */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDataRetention")
    private final Integer sourceDataRetention;

    /**
     * The number of days for which source data is retained
     *
     * @return the value
     */
    public Integer getSourceDataRetention() {
        return sourceDataRetention;
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
        sb.append("TargetDetectorRecipeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", detectorRecipeId=").append(String.valueOf(this.detectorRecipeId));
        sb.append(", detector=").append(String.valueOf(this.detector));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(", detectorRecipeType=").append(String.valueOf(this.detectorRecipeType));
        sb.append(", sourceDataRetention=").append(String.valueOf(this.sourceDataRetention));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetDetectorRecipeSummary)) {
            return false;
        }

        TargetDetectorRecipeSummary other = (TargetDetectorRecipeSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.detectorRecipeId, other.detectorRecipeId)
                && java.util.Objects.equals(this.detector, other.detector)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.locks, other.locks)
                && java.util.Objects.equals(this.detectorRecipeType, other.detectorRecipeType)
                && java.util.Objects.equals(this.sourceDataRetention, other.sourceDataRetention)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRecipeId == null ? 43 : this.detectorRecipeId.hashCode());
        result = (result * PRIME) + (this.detector == null ? 43 : this.detector.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRecipeType == null
                                ? 43
                                : this.detectorRecipeType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDataRetention == null
                                ? 43
                                : this.sourceDataRetention.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
