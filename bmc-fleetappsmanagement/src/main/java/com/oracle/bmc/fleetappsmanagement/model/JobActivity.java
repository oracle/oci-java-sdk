/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Activity details including status corresponding to an Action Group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobActivity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobActivity extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "status",
        "timeStarted",
        "timeEnded",
        "runbookId",
        "runbookVersionName",
        "runbookName",
        "description",
        "resourceLevelExecutions"
    })
    public JobActivity(
            String id,
            JobStatus status,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            String runbookId,
            String runbookVersionName,
            String runbookName,
            String description,
            java.util.List<EntityExecutionDetails> resourceLevelExecutions) {
        super();
        this.id = id;
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.runbookId = runbookId;
        this.runbookVersionName = runbookVersionName;
        this.runbookName = runbookName;
        this.description = description;
        this.resourceLevelExecutions = resourceLevelExecutions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique activity id at the action group level. In most cases, this would be a generated
         * ActionGroupId.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique activity id at the action group level. In most cases, this would be a generated
         * ActionGroupId.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Status of the Job at Action Group Level. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobStatus status;

        /**
         * Status of the Job at Action Group Level.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(JobStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The time the execution for the Action Group started. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the execution for the Action Group started. An RFC3339 formatted datetime
         * string.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time the execution for the Action Group ended. An RFC3339 formatted datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time the execution for the Action Group ended. An RFC3339 formatted datetime string
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** OCID of the runbook associated with the Action Group. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
        private String runbookId;

        /**
         * OCID of the runbook associated with the Action Group.
         *
         * @param runbookId the value to set
         * @return this builder
         */
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            this.__explicitlySet__.add("runbookId");
            return this;
        }
        /** Name of the RunbookVersion associated with the Action Group. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookVersionName")
        private String runbookVersionName;

        /**
         * Name of the RunbookVersion associated with the Action Group.
         *
         * @param runbookVersionName the value to set
         * @return this builder
         */
        public Builder runbookVersionName(String runbookVersionName) {
            this.runbookVersionName = runbookVersionName;
            this.__explicitlySet__.add("runbookVersionName");
            return this;
        }
        /** Name of the runbook associated with the Action Group. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookName")
        private String runbookName;

        /**
         * Name of the runbook associated with the Action Group.
         *
         * @param runbookName the value to set
         * @return this builder
         */
        public Builder runbookName(String runbookName) {
            this.runbookName = runbookName;
            this.__explicitlySet__.add("runbookName");
            return this;
        }
        /**
         * A description of the Job Activity status. If there are any errors, this can also include
         * a short error message.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the Job Activity status. If there are any errors, this can also include
         * a short error message.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** List of Resource executions associated with the Action Group. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceLevelExecutions")
        private java.util.List<EntityExecutionDetails> resourceLevelExecutions;

        /**
         * List of Resource executions associated with the Action Group.
         *
         * @param resourceLevelExecutions the value to set
         * @return this builder
         */
        public Builder resourceLevelExecutions(
                java.util.List<EntityExecutionDetails> resourceLevelExecutions) {
            this.resourceLevelExecutions = resourceLevelExecutions;
            this.__explicitlySet__.add("resourceLevelExecutions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobActivity build() {
            JobActivity model =
                    new JobActivity(
                            this.id,
                            this.status,
                            this.timeStarted,
                            this.timeEnded,
                            this.runbookId,
                            this.runbookVersionName,
                            this.runbookName,
                            this.description,
                            this.resourceLevelExecutions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobActivity model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("runbookId")) {
                this.runbookId(model.getRunbookId());
            }
            if (model.wasPropertyExplicitlySet("runbookVersionName")) {
                this.runbookVersionName(model.getRunbookVersionName());
            }
            if (model.wasPropertyExplicitlySet("runbookName")) {
                this.runbookName(model.getRunbookName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("resourceLevelExecutions")) {
                this.resourceLevelExecutions(model.getResourceLevelExecutions());
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
     * Unique activity id at the action group level. In most cases, this would be a generated
     * ActionGroupId.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique activity id at the action group level. In most cases, this would be a generated
     * ActionGroupId.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Status of the Job at Action Group Level. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobStatus status;

    /**
     * Status of the Job at Action Group Level.
     *
     * @return the value
     */
    public JobStatus getStatus() {
        return status;
    }

    /**
     * The time the execution for the Action Group started. An RFC3339 formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the execution for the Action Group started. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The time the execution for the Action Group ended. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time the execution for the Action Group ended. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** OCID of the runbook associated with the Action Group. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
    private final String runbookId;

    /**
     * OCID of the runbook associated with the Action Group.
     *
     * @return the value
     */
    public String getRunbookId() {
        return runbookId;
    }

    /** Name of the RunbookVersion associated with the Action Group. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookVersionName")
    private final String runbookVersionName;

    /**
     * Name of the RunbookVersion associated with the Action Group.
     *
     * @return the value
     */
    public String getRunbookVersionName() {
        return runbookVersionName;
    }

    /** Name of the runbook associated with the Action Group. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookName")
    private final String runbookName;

    /**
     * Name of the runbook associated with the Action Group.
     *
     * @return the value
     */
    public String getRunbookName() {
        return runbookName;
    }

    /**
     * A description of the Job Activity status. If there are any errors, this can also include a
     * short error message.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the Job Activity status. If there are any errors, this can also include a
     * short error message.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** List of Resource executions associated with the Action Group. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceLevelExecutions")
    private final java.util.List<EntityExecutionDetails> resourceLevelExecutions;

    /**
     * List of Resource executions associated with the Action Group.
     *
     * @return the value
     */
    public java.util.List<EntityExecutionDetails> getResourceLevelExecutions() {
        return resourceLevelExecutions;
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
        sb.append("JobActivity(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", runbookId=").append(String.valueOf(this.runbookId));
        sb.append(", runbookVersionName=").append(String.valueOf(this.runbookVersionName));
        sb.append(", runbookName=").append(String.valueOf(this.runbookName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", resourceLevelExecutions=")
                .append(String.valueOf(this.resourceLevelExecutions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobActivity)) {
            return false;
        }

        JobActivity other = (JobActivity) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.runbookVersionName, other.runbookVersionName)
                && java.util.Objects.equals(this.runbookName, other.runbookName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.resourceLevelExecutions, other.resourceLevelExecutions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result =
                (result * PRIME)
                        + (this.runbookVersionName == null
                                ? 43
                                : this.runbookVersionName.hashCode());
        result = (result * PRIME) + (this.runbookName == null ? 43 : this.runbookName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceLevelExecutions == null
                                ? 43
                                : this.resourceLevelExecutions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
