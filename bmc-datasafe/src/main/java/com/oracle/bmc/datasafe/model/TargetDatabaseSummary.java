/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a Data Safe target database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TargetDatabaseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TargetDatabaseSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "id",
        "displayName",
        "description",
        "infrastructureType",
        "databaseType",
        "associatedResourceIds",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "freeformTags",
        "definedTags"
    })
    public TargetDatabaseSummary(
            String compartmentId,
            String id,
            String displayName,
            String description,
            InfrastructureType infrastructureType,
            DatabaseType databaseType,
            java.util.List<String> associatedResourceIds,
            TargetDatabaseLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.infrastructureType = infrastructureType;
        this.databaseType = databaseType;
        this.associatedResourceIds = associatedResourceIds;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment that contains the Data Safe target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the Data Safe target database.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the Data Safe target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Data Safe target database.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The display name of the target database in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the target database in Data Safe.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The description of the target database in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the target database in Data Safe.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The infrastructure type the database is running on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
        private InfrastructureType infrastructureType;

        /**
         * The infrastructure type the database is running on.
         * @param infrastructureType the value to set
         * @return this builder
         **/
        public Builder infrastructureType(InfrastructureType infrastructureType) {
            this.infrastructureType = infrastructureType;
            this.__explicitlySet__.add("infrastructureType");
            return this;
        }
        /**
         * The database type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        /**
         * The database type.
         * @param databaseType the value to set
         * @return this builder
         **/
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * The OCIDs of associated resources like Database, Data Safe private endpoint etc.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceIds")
        private java.util.List<String> associatedResourceIds;

        /**
         * The OCIDs of associated resources like Database, Data Safe private endpoint etc.
         * @param associatedResourceIds the value to set
         * @return this builder
         **/
        public Builder associatedResourceIds(java.util.List<String> associatedResourceIds) {
            this.associatedResourceIds = associatedResourceIds;
            this.__explicitlySet__.add("associatedResourceIds");
            return this;
        }
        /**
         * The current state of the target database in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private TargetDatabaseLifecycleState lifecycleState;

        /**
         * The current state of the target database in Data Safe.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(TargetDatabaseLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details about the current state of the target database in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the target database in Data Safe.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the database was registered in Data Safe and created as a target database in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the database was registered in Data Safe and created as a target database in Data Safe.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetDatabaseSummary build() {
            TargetDatabaseSummary __instance__ =
                    new TargetDatabaseSummary(
                            compartmentId,
                            id,
                            displayName,
                            description,
                            infrastructureType,
                            databaseType,
                            associatedResourceIds,
                            lifecycleState,
                            lifecycleDetails,
                            timeCreated,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetDatabaseSummary o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .id(o.getId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .infrastructureType(o.getInfrastructureType())
                            .databaseType(o.getDatabaseType())
                            .associatedResourceIds(o.getAssociatedResourceIds())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeCreated(o.getTimeCreated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the compartment that contains the Data Safe target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the Data Safe target database.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the Data Safe target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Data Safe target database.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The display name of the target database in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the target database in Data Safe.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The description of the target database in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the target database in Data Safe.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The infrastructure type the database is running on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
    private final InfrastructureType infrastructureType;

    /**
     * The infrastructure type the database is running on.
     * @return the value
     **/
    public InfrastructureType getInfrastructureType() {
        return infrastructureType;
    }

    /**
     * The database type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseType databaseType;

    /**
     * The database type.
     * @return the value
     **/
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /**
     * The OCIDs of associated resources like Database, Data Safe private endpoint etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceIds")
    private final java.util.List<String> associatedResourceIds;

    /**
     * The OCIDs of associated resources like Database, Data Safe private endpoint etc.
     * @return the value
     **/
    public java.util.List<String> getAssociatedResourceIds() {
        return associatedResourceIds;
    }

    /**
     * The current state of the target database in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final TargetDatabaseLifecycleState lifecycleState;

    /**
     * The current state of the target database in Data Safe.
     * @return the value
     **/
    public TargetDatabaseLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the current state of the target database in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the target database in Data Safe.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the database was registered in Data Safe and created as a target database in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the database was registered in Data Safe and created as a target database in Data Safe.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("TargetDatabaseSummary(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", infrastructureType=").append(String.valueOf(this.infrastructureType));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", associatedResourceIds=").append(String.valueOf(this.associatedResourceIds));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetDatabaseSummary)) {
            return false;
        }

        TargetDatabaseSummary other = (TargetDatabaseSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.infrastructureType, other.infrastructureType)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.associatedResourceIds, other.associatedResourceIds)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureType == null
                                ? 43
                                : this.infrastructureType.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResourceIds == null
                                ? 43
                                : this.associatedResourceIds.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
