/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * A summary of the status of a work request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationType",
        "status",
        "id",
        "compartmentId",
        "resources",
        "percentComplete",
        "timeAccepted",
        "timeStarted",
        "timeFinished"
    })
    public WorkRequestSummary(
            WorkRequest.OperationType operationType,
            WorkRequest.Status status,
            String id,
            String compartmentId,
            java.util.List<WorkRequestResource> resources,
            Float percentComplete,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeFinished) {
        super();
        this.operationType = operationType;
        this.status = status;
        this.id = id;
        this.compartmentId = compartmentId;
        this.resources = resources;
        this.percentComplete = percentComplete;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The asynchronous operation tracked by this work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private WorkRequest.OperationType operationType;

        /**
         * The asynchronous operation tracked by this work request.
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(WorkRequest.OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * The status of the specified work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkRequest.Status status;

        /**
         * The status of the specified work request.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(WorkRequest.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) identifying this work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) identifying this work request.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique identifier ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the compartment that contains the work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Unique identifier ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the compartment that contains the work request.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The resources affected by this work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<WorkRequestResource> resources;

        /**
         * The resources affected by this work request.
         * @param resources the value to set
         * @return this builder
         **/
        public Builder resources(java.util.List<WorkRequestResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /**
         * Percentage of the work request completed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        /**
         * Percentage of the work request completed.
         * @param percentComplete the value to set
         * @return this builder
         **/
        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * The date and time when the work request was created.
         * Format is defined by RFC3339.
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The date and time when the work request was created.
         * Format is defined by RFC3339.
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeAccepted the value to set
         * @return this builder
         **/
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * The date and time when the work request transitioned from ACCEPTED to IN_PROGRESS.
         * Format is defined by RFC3339.
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time when the work request transitioned from ACCEPTED to IN_PROGRESS.
         * Format is defined by RFC3339.
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time when the work request reached a terminal state (FAILED or SUCCEEDED).
         * Format is defined by RFC3339.
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time when the work request reached a terminal state (FAILED or SUCCEEDED).
         * Format is defined by RFC3339.
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestSummary build() {
            WorkRequestSummary model =
                    new WorkRequestSummary(
                            this.operationType,
                            this.status,
                            this.id,
                            this.compartmentId,
                            this.resources,
                            this.percentComplete,
                            this.timeAccepted,
                            this.timeStarted,
                            this.timeFinished);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestSummary model) {
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
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
     * The asynchronous operation tracked by this work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final WorkRequest.OperationType operationType;

    /**
     * The asynchronous operation tracked by this work request.
     * @return the value
     **/
    public WorkRequest.OperationType getOperationType() {
        return operationType;
    }

    /**
     * The status of the specified work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final WorkRequest.Status status;

    /**
     * The status of the specified work request.
     * @return the value
     **/
    public WorkRequest.Status getStatus() {
        return status;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) identifying this work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) identifying this work request.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique identifier ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the compartment that contains the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Unique identifier ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the compartment that contains the work request.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The resources affected by this work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<WorkRequestResource> resources;

    /**
     * The resources affected by this work request.
     * @return the value
     **/
    public java.util.List<WorkRequestResource> getResources() {
        return resources;
    }

    /**
     * Percentage of the work request completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Float percentComplete;

    /**
     * Percentage of the work request completed.
     * @return the value
     **/
    public Float getPercentComplete() {
        return percentComplete;
    }

    /**
     * The date and time when the work request was created.
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The date and time when the work request was created.
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * The date and time when the work request transitioned from ACCEPTED to IN_PROGRESS.
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time when the work request transitioned from ACCEPTED to IN_PROGRESS.
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time when the work request reached a terminal state (FAILED or SUCCEEDED).
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time when the work request reached a terminal state (FAILED or SUCCEEDED).
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
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
        sb.append("WorkRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("operationType=").append(String.valueOf(this.operationType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestSummary)) {
            return false;
        }

        WorkRequestSummary other = (WorkRequestSummary) o;
        return java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
