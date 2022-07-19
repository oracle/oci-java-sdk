/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A Summary of the work request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationType",
        "status",
        "id",
        "compartmentId",
        "percentComplete",
        "timeAccepted",
        "timeStarted",
        "timeFinished",
        "resources"
    })
    public WorkRequestSummary(
            WorkRequestOperationType operationType,
            WorkRequestStatus status,
            String id,
            String compartmentId,
            Float percentComplete,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            java.util.List<WorkRequestResource> resources) {
        super();
        this.operationType = operationType;
        this.status = status;
        this.id = id;
        this.compartmentId = compartmentId;
        this.percentComplete = percentComplete;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.resources = resources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private WorkRequestOperationType operationType;

        /**
         * The type of work request.
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(WorkRequestOperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * The status of the current work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkRequestStatus status;

        /**
         * The status of the current work request.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(WorkRequestStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The ID of the work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID of the work request.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment that contains the work request. Work requests should be scoped to the same compartment as the resource the work request affects.
         * If the work request affects multiple resources that are not in the same compartment then the system picks the primary resource whose compartment should be used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the work request. Work requests should be scoped to the same compartment as the resource the work request affects.
         * If the work request affects multiple resources that are not in the same compartment then the system picks the primary resource whose compartment should be used.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The completed percentage of the operation tracked by the work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        /**
         * The completed percentage of the operation tracked by the work request.
         * @param percentComplete the value to set
         * @return this builder
         **/
        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * The date and time the work request was accepted, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * The precision for this time object is in milliseconds.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The date and time the work request was accepted, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * The precision for this time object is in milliseconds.
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
         * The date and time the work request transitioned from ACCEPTED to IN_PROGRESS, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339). The precision for this time object is in milliseconds.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the work request transitioned from ACCEPTED to IN_PROGRESS, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339). The precision for this time object is in milliseconds.
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
         * The date and time the work request reached a terminal state, either FAILED or SUCCEEDED, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * The precision for this time object is in milliseconds.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the work request reached a terminal state, either FAILED or SUCCEEDED, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * The precision for this time object is in milliseconds.
         *
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestSummary build() {
            WorkRequestSummary __instance__ =
                    new WorkRequestSummary(
                            operationType,
                            status,
                            id,
                            compartmentId,
                            percentComplete,
                            timeAccepted,
                            timeStarted,
                            timeFinished,
                            resources);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestSummary o) {
            Builder copiedBuilder =
                    operationType(o.getOperationType())
                            .status(o.getStatus())
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .percentComplete(o.getPercentComplete())
                            .timeAccepted(o.getTimeAccepted())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished())
                            .resources(o.getResources());

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
     * The type of work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final WorkRequestOperationType operationType;

    /**
     * The type of work request.
     * @return the value
     **/
    public WorkRequestOperationType getOperationType() {
        return operationType;
    }

    /**
     * The status of the current work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final WorkRequestStatus status;

    /**
     * The status of the current work request.
     * @return the value
     **/
    public WorkRequestStatus getStatus() {
        return status;
    }

    /**
     * The ID of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID of the work request.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment that contains the work request. Work requests should be scoped to the same compartment as the resource the work request affects.
     * If the work request affects multiple resources that are not in the same compartment then the system picks the primary resource whose compartment should be used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the work request. Work requests should be scoped to the same compartment as the resource the work request affects.
     * If the work request affects multiple resources that are not in the same compartment then the system picks the primary resource whose compartment should be used.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The completed percentage of the operation tracked by the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Float percentComplete;

    /**
     * The completed percentage of the operation tracked by the work request.
     * @return the value
     **/
    public Float getPercentComplete() {
        return percentComplete;
    }

    /**
     * The date and time the work request was accepted, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * The precision for this time object is in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The date and time the work request was accepted, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * The precision for this time object is in milliseconds.
     *
     * @return the value
     **/
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * The date and time the work request transitioned from ACCEPTED to IN_PROGRESS, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339). The precision for this time object is in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the work request transitioned from ACCEPTED to IN_PROGRESS, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339). The precision for this time object is in milliseconds.
     *
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the work request reached a terminal state, either FAILED or SUCCEEDED, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * The precision for this time object is in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the work request reached a terminal state, either FAILED or SUCCEEDED, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * The precision for this time object is in milliseconds.
     *
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
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
        sb.append("operationType=").append(String.valueOf(this.operationType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
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
