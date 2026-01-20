/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Results of a Database Connection search. Contains DatabaseConnectionSummary items. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Job.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Job extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "migrationId",
        "type",
        "timeCreated",
        "timeUpdated",
        "progress",
        "unsupportedObjects",
        "lifecycleState",
        "lifecycleDetails",
        "parameterFileVersions",
        "collectTracesData",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Job(
            String id,
            String displayName,
            String migrationId,
            JobTypes type,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            MigrationJobProgressResource progress,
            java.util.List<UnsupportedDatabaseObject> unsupportedObjects,
            JobLifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.List<ParameterFileVersionSummary> parameterFileVersions,
            CollectTracesData collectTracesData,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.migrationId = migrationId;
        this.type = type;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.progress = progress;
        this.unsupportedObjects = unsupportedObjects;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.parameterFileVersions = parameterFileVersions;
        this.collectTracesData = collectTracesData;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the Migration Job. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Migration Job.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Name of the job. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the job.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the Migration that this job belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrationId")
        private String migrationId;

        /**
         * The OCID of the Migration that this job belongs to.
         *
         * @param migrationId the value to set
         * @return this builder
         */
        public Builder migrationId(String migrationId) {
            this.migrationId = migrationId;
            this.__explicitlySet__.add("migrationId");
            return this;
        }
        /** The job type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private JobTypes type;

        /**
         * The job type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(JobTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The time the Migration Job was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Migration Job was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the Migration Job was last updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Migration Job was last updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private MigrationJobProgressResource progress;

        public Builder progress(MigrationJobProgressResource progress) {
            this.progress = progress;
            this.__explicitlySet__.add("progress");
            return this;
        }
        /** Database objects not supported. */
        @com.fasterxml.jackson.annotation.JsonProperty("unsupportedObjects")
        private java.util.List<UnsupportedDatabaseObject> unsupportedObjects;

        /**
         * Database objects not supported.
         *
         * @param unsupportedObjects the value to set
         * @return this builder
         */
        public Builder unsupportedObjects(
                java.util.List<UnsupportedDatabaseObject> unsupportedObjects) {
            this.unsupportedObjects = unsupportedObjects;
            this.__explicitlySet__.add("unsupportedObjects");
            return this;
        }
        /** The current state of the migration job. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobLifecycleStates lifecycleState;

        /**
         * The current state of the migration job.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(JobLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
        /** A list of parameter file versions that can be viewed or edited for the current job. */
        @com.fasterxml.jackson.annotation.JsonProperty("parameterFileVersions")
        private java.util.List<ParameterFileVersionSummary> parameterFileVersions;

        /**
         * A list of parameter file versions that can be viewed or edited for the current job.
         *
         * @param parameterFileVersions the value to set
         * @return this builder
         */
        public Builder parameterFileVersions(
                java.util.List<ParameterFileVersionSummary> parameterFileVersions) {
            this.parameterFileVersions = parameterFileVersions;
            this.__explicitlySet__.add("parameterFileVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("collectTracesData")
        private CollectTracesData collectTracesData;

        public Builder collectTracesData(CollectTracesData collectTracesData) {
            this.collectTracesData = collectTracesData;
            this.__explicitlySet__.add("collectTracesData");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see Resource Tags. Example:
         * {"Department": "Finance"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see Resource Tags. Example:
         * {"Department": "Finance"}
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

        public Job build() {
            Job model =
                    new Job(
                            this.id,
                            this.displayName,
                            this.migrationId,
                            this.type,
                            this.timeCreated,
                            this.timeUpdated,
                            this.progress,
                            this.unsupportedObjects,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.parameterFileVersions,
                            this.collectTracesData,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Job model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("migrationId")) {
                this.migrationId(model.getMigrationId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("progress")) {
                this.progress(model.getProgress());
            }
            if (model.wasPropertyExplicitlySet("unsupportedObjects")) {
                this.unsupportedObjects(model.getUnsupportedObjects());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("parameterFileVersions")) {
                this.parameterFileVersions(model.getParameterFileVersions());
            }
            if (model.wasPropertyExplicitlySet("collectTracesData")) {
                this.collectTracesData(model.getCollectTracesData());
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

    /** The OCID of the Migration Job. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Migration Job.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Name of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the job.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the Migration that this job belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationId")
    private final String migrationId;

    /**
     * The OCID of the Migration that this job belongs to.
     *
     * @return the value
     */
    public String getMigrationId() {
        return migrationId;
    }

    /** The job type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final JobTypes type;

    /**
     * The job type.
     *
     * @return the value
     */
    public JobTypes getType() {
        return type;
    }

    /** The time the Migration Job was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Migration Job was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the Migration Job was last updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Migration Job was last updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("progress")
    private final MigrationJobProgressResource progress;

    public MigrationJobProgressResource getProgress() {
        return progress;
    }

    /** Database objects not supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("unsupportedObjects")
    private final java.util.List<UnsupportedDatabaseObject> unsupportedObjects;

    /**
     * Database objects not supported.
     *
     * @return the value
     */
    public java.util.List<UnsupportedDatabaseObject> getUnsupportedObjects() {
        return unsupportedObjects;
    }

    /** The current state of the migration job. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final JobLifecycleStates lifecycleState;

    /**
     * The current state of the migration job.
     *
     * @return the value
     */
    public JobLifecycleStates getLifecycleState() {
        return lifecycleState;
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

    /** A list of parameter file versions that can be viewed or edited for the current job. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameterFileVersions")
    private final java.util.List<ParameterFileVersionSummary> parameterFileVersions;

    /**
     * A list of parameter file versions that can be viewed or edited for the current job.
     *
     * @return the value
     */
    public java.util.List<ParameterFileVersionSummary> getParameterFileVersions() {
        return parameterFileVersions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("collectTracesData")
    private final CollectTracesData collectTracesData;

    public CollectTracesData getCollectTracesData() {
        return collectTracesData;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see Resource Tags. Example: {"Department":
     * "Finance"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see Resource Tags. Example: {"Department":
     * "Finance"}
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
        sb.append("Job(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", migrationId=").append(String.valueOf(this.migrationId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", progress=").append(String.valueOf(this.progress));
        sb.append(", unsupportedObjects=").append(String.valueOf(this.unsupportedObjects));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", parameterFileVersions=").append(String.valueOf(this.parameterFileVersions));
        sb.append(", collectTracesData=").append(String.valueOf(this.collectTracesData));
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
        if (!(o instanceof Job)) {
            return false;
        }

        Job other = (Job) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.migrationId, other.migrationId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.progress, other.progress)
                && java.util.Objects.equals(this.unsupportedObjects, other.unsupportedObjects)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.parameterFileVersions, other.parameterFileVersions)
                && java.util.Objects.equals(this.collectTracesData, other.collectTracesData)
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
        result = (result * PRIME) + (this.migrationId == null ? 43 : this.migrationId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.progress == null ? 43 : this.progress.hashCode());
        result =
                (result * PRIME)
                        + (this.unsupportedObjects == null
                                ? 43
                                : this.unsupportedObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterFileVersions == null
                                ? 43
                                : this.parameterFileVersions.hashCode());
        result =
                (result * PRIME)
                        + (this.collectTracesData == null ? 43 : this.collectTracesData.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
