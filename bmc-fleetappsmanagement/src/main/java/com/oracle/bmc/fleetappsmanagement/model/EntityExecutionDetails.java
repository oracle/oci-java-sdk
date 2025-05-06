/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Resource level execution status and target associations. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EntityExecutionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EntityExecutionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "resourceDisplayName",
        "description",
        "sequence",
        "targets",
        "status",
        "timeStarted",
        "timeEnded"
    })
    public EntityExecutionDetails(
            String resourceId,
            String resourceDisplayName,
            String description,
            String sequence,
            java.util.List<ActivityResourceTarget> targets,
            JobStatus status,
            java.util.Date timeStarted,
            java.util.Date timeEnded) {
        super();
        this.resourceId = resourceId;
        this.resourceDisplayName = resourceDisplayName;
        this.description = description;
        this.sequence = sequence;
        this.targets = targets;
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Resource Identifier associated with the Work Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Resource Identifier associated with the Work Request.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Resource Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
        private String resourceDisplayName;

        /**
         * Resource Display Name.
         *
         * @param resourceDisplayName the value to set
         * @return this builder
         */
        public Builder resourceDisplayName(String resourceDisplayName) {
            this.resourceDisplayName = resourceDisplayName;
            this.__explicitlySet__.add("resourceDisplayName");
            return this;
        }
        /**
         * Description of the Resource Execution status. If there are any errors, this can also
         * include a short error message.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Resource Execution status. If there are any errors, this can also
         * include a short error message.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The sequence of the Resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("sequence")
        private String sequence;

        /**
         * The sequence of the Resource.
         *
         * @param sequence the value to set
         * @return this builder
         */
        public Builder sequence(String sequence) {
            this.sequence = sequence;
            this.__explicitlySet__.add("sequence");
            return this;
        }
        /** Targets associated with the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<ActivityResourceTarget> targets;

        /**
         * Targets associated with the resource.
         *
         * @param targets the value to set
         * @return this builder
         */
        public Builder targets(java.util.List<ActivityResourceTarget> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }
        /** Status of the Job at Resource Level. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobStatus status;

        /**
         * Status of the Job at Resource Level.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(JobStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The time the task started for the resource. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the task started for the resource. An RFC3339 formatted datetime string
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The time the task ended for the resource. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time the task ended for the resource. An RFC3339 formatted datetime string
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntityExecutionDetails build() {
            EntityExecutionDetails model =
                    new EntityExecutionDetails(
                            this.resourceId,
                            this.resourceDisplayName,
                            this.description,
                            this.sequence,
                            this.targets,
                            this.status,
                            this.timeStarted,
                            this.timeEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceDisplayName")) {
                this.resourceDisplayName(model.getResourceDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("sequence")) {
                this.sequence(model.getSequence());
            }
            if (model.wasPropertyExplicitlySet("targets")) {
                this.targets(model.getTargets());
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

    /** Resource Identifier associated with the Work Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Resource Identifier associated with the Work Request.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Resource Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
    private final String resourceDisplayName;

    /**
     * Resource Display Name.
     *
     * @return the value
     */
    public String getResourceDisplayName() {
        return resourceDisplayName;
    }

    /**
     * Description of the Resource Execution status. If there are any errors, this can also include
     * a short error message.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Resource Execution status. If there are any errors, this can also include
     * a short error message.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The sequence of the Resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    private final String sequence;

    /**
     * The sequence of the Resource.
     *
     * @return the value
     */
    public String getSequence() {
        return sequence;
    }

    /** Targets associated with the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<ActivityResourceTarget> targets;

    /**
     * Targets associated with the resource.
     *
     * @return the value
     */
    public java.util.List<ActivityResourceTarget> getTargets() {
        return targets;
    }

    /** Status of the Job at Resource Level. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobStatus status;

    /**
     * Status of the Job at Resource Level.
     *
     * @return the value
     */
    public JobStatus getStatus() {
        return status;
    }

    /** The time the task started for the resource. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the task started for the resource. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The time the task ended for the resource. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time the task ended for the resource. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
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
        sb.append("EntityExecutionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceDisplayName=").append(String.valueOf(this.resourceDisplayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", sequence=").append(String.valueOf(this.sequence));
        sb.append(", targets=").append(String.valueOf(this.targets));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityExecutionDetails)) {
            return false;
        }

        EntityExecutionDetails other = (EntityExecutionDetails) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceDisplayName, other.resourceDisplayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.sequence, other.sequence)
                && java.util.Objects.equals(this.targets, other.targets)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.sequence == null ? 43 : this.sequence.hashCode());
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
