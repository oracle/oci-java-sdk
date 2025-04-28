/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.model;

/**
 * The asynchronous API request does not take effect immediately. This request spawns an
 * asynchronous workflow to fulfill the request. WorkRequest objects provide visibility for
 * in-progress workflows. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SecurityAttributeWorkRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityAttributeWorkRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "operationType",
        "compartmentId",
        "status",
        "resources",
        "timeAccepted",
        "timeStarted",
        "timeFinished",
        "percentComplete"
    })
    public SecurityAttributeWorkRequest(
            String id,
            WorkRequestOperationType operationType,
            String compartmentId,
            WorkRequestStatus status,
            java.util.List<WorkRequestResource> resources,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Float percentComplete) {
        super();
        this.id = id;
        this.operationType = operationType;
        this.compartmentId = compartmentId;
        this.status = status;
        this.resources = resources;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.percentComplete = percentComplete;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the work request.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** An enum-like description of the type of work the work request is doing. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private WorkRequestOperationType operationType;

        /**
         * An enum-like description of the type of work the work request is doing.
         *
         * @param operationType the value to set
         * @return this builder
         */
        public Builder operationType(WorkRequestOperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /** The OCID of the compartment that contains the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the work request.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The current status of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkRequestStatus status;

        /**
         * The current status of the work request.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(WorkRequestStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The resources this work request affects. */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<WorkRequestResource> resources;

        /**
         * The resources this work request affects.
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<WorkRequestResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /**
         * Date and time the work was accepted, in the format defined by RFC3339. Example: {@code
         * 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * Date and time the work was accepted, in the format defined by RFC3339. Example: {@code
         * 2016-08-25T21:10:29.600Z}
         *
         * @param timeAccepted the value to set
         * @return this builder
         */
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * Date and time the work started, in the format defined by RFC3339. Example: {@code
         * 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Date and time the work started, in the format defined by RFC3339. Example: {@code
         * 2016-08-25T21:10:29.600Z}
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
         * Date and time the work completed, in the format defined by RFC3339. Example: {@code
         * 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * Date and time the work completed, in the format defined by RFC3339. Example: {@code
         * 2016-08-25T21:10:29.600Z}
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** How much progress the operation has made. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        /**
         * How much progress the operation has made.
         *
         * @param percentComplete the value to set
         * @return this builder
         */
        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAttributeWorkRequest build() {
            SecurityAttributeWorkRequest model =
                    new SecurityAttributeWorkRequest(
                            this.id,
                            this.operationType,
                            this.compartmentId,
                            this.status,
                            this.resources,
                            this.timeAccepted,
                            this.timeStarted,
                            this.timeFinished,
                            this.percentComplete);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAttributeWorkRequest model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
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
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
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

    /** The OCID of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the work request.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** An enum-like description of the type of work the work request is doing. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final WorkRequestOperationType operationType;

    /**
     * An enum-like description of the type of work the work request is doing.
     *
     * @return the value
     */
    public WorkRequestOperationType getOperationType() {
        return operationType;
    }

    /** The OCID of the compartment that contains the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the work request.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The current status of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final WorkRequestStatus status;

    /**
     * The current status of the work request.
     *
     * @return the value
     */
    public WorkRequestStatus getStatus() {
        return status;
    }

    /** The resources this work request affects. */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<WorkRequestResource> resources;

    /**
     * The resources this work request affects.
     *
     * @return the value
     */
    public java.util.List<WorkRequestResource> getResources() {
        return resources;
    }

    /**
     * Date and time the work was accepted, in the format defined by RFC3339. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * Date and time the work was accepted, in the format defined by RFC3339. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * Date and time the work started, in the format defined by RFC3339. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Date and time the work started, in the format defined by RFC3339. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Date and time the work completed, in the format defined by RFC3339. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * Date and time the work completed, in the format defined by RFC3339. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** How much progress the operation has made. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Float percentComplete;

    /**
     * How much progress the operation has made.
     *
     * @return the value
     */
    public Float getPercentComplete() {
        return percentComplete;
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
        sb.append("SecurityAttributeWorkRequest(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityAttributeWorkRequest)) {
            return false;
        }

        SecurityAttributeWorkRequest other = (SecurityAttributeWorkRequest) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
