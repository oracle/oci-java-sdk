/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Anomaly Job summary contains minimal information for asynchronous inference of anomalies
 * returned in list response.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetectAnomalyJobSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetectAnomalyJobSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "modelId",
        "projectId",
        "timeAccepted",
        "timeStarted",
        "timeFinished",
        "lifecycleState",
        "lifecycleStateDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DetectAnomalyJobSummary(
            String id,
            String compartmentId,
            String displayName,
            String description,
            String modelId,
            String projectId,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            DetectAnomalyJob.LifecycleState lifecycleState,
            String lifecycleStateDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, Object> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.modelId = modelId;
        this.projectId = projectId;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Id of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Id of the job.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment that starts the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that starts the job.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Detect anomaly job display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Detect anomaly job display name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Detect anomaly job description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detect anomaly job description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The OCID of the trained model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * The OCID of the trained model.
         * @param modelId the value to set
         * @return this builder
         **/
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /**
         * The OCID of the project.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The OCID of the project.
         * @param projectId the value to set
         * @return this builder
         **/
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * Job accepted time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * Job accepted time
         * @param timeAccepted the value to set
         * @return this builder
         **/
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * Job started time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Job started time
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Job finished time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * Job finished time
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The current state of the batch document job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DetectAnomalyJob.LifecycleState lifecycleState;

        /**
         * The current state of the batch document job.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(DetectAnomalyJob.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The current state details of the batch document job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * The current state details of the batch document job.
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
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
         * Example: {@code { "orcl-cloud": { "free-tier-retained": "true" } }}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, Object> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code { "orcl-cloud": { "free-tier-retained": "true" } }}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, Object> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectAnomalyJobSummary build() {
            DetectAnomalyJobSummary model =
                    new DetectAnomalyJobSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.modelId,
                            this.projectId,
                            this.timeAccepted,
                            this.timeStarted,
                            this.timeFinished,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectAnomalyJobSummary model) {
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
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
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
     * Id of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Id of the job.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment that starts the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that starts the job.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Detect anomaly job display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Detect anomaly job display name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detect anomaly job description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detect anomaly job description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The OCID of the trained model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * The OCID of the trained model.
     * @return the value
     **/
    public String getModelId() {
        return modelId;
    }

    /**
     * The OCID of the project.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The OCID of the project.
     * @return the value
     **/
    public String getProjectId() {
        return projectId;
    }

    /**
     * Job accepted time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * Job accepted time
     * @return the value
     **/
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * Job started time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Job started time
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Job finished time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * Job finished time
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The current state of the batch document job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DetectAnomalyJob.LifecycleState lifecycleState;

    /**
     * The current state of the batch document job.
     * @return the value
     **/
    public DetectAnomalyJob.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The current state details of the batch document job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * The current state details of the batch document job.
     * @return the value
     **/
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
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
     * Example: {@code { "orcl-cloud": { "free-tier-retained": "true" } }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, Object> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code { "orcl-cloud": { "free-tier-retained": "true" } }}
     *
     * @return the value
     **/
    public java.util.Map<String, Object> getSystemTags() {
        return systemTags;
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
        sb.append("DetectAnomalyJobSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
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
        if (!(o instanceof DetectAnomalyJobSummary)) {
            return false;
        }

        DetectAnomalyJobSummary other = (DetectAnomalyJobSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
