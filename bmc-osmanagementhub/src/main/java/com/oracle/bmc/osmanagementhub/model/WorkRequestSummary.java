/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * The summary of a work request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WorkRequestSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WorkRequestSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationType",
        "status",
        "id",
        "description",
        "displayName",
        "message",
        "parentId",
        "childrenId",
        "compartmentId",
        "percentComplete",
        "timeCreated"
    })
    public WorkRequestSummary(
            WorkRequestOperationType operationType,
            OperationStatus status,
            String id,
            String description,
            String displayName,
            String message,
            String parentId,
            java.util.List<String> childrenId,
            String compartmentId,
            Float percentComplete,
            java.util.Date timeCreated) {
        super();
        this.operationType = operationType;
        this.status = status;
        this.id = id;
        this.description = description;
        this.displayName = displayName;
        this.message = message;
        this.parentId = parentId;
        this.childrenId = childrenId;
        this.compartmentId = compartmentId;
        this.percentComplete = percentComplete;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private WorkRequestOperationType operationType;

        /**
         * Type of the work request.
         *
         * @param operationType the value to set
         * @return this builder
         */
        public Builder operationType(WorkRequestOperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /** Status of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private OperationStatus status;

        /**
         * Status of the work request.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(OperationStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
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
        /** A short description about the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description about the work request.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** A short display name for the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A short display name for the work request.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A progress or error message, if there is any. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A progress or error message, if there is any.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The OCID of the parent work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * The OCID of the parent work request.
         *
         * @param parentId the value to set
         * @return this builder
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /** The list of OCIDs for the child work requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("childrenId")
        private java.util.List<String> childrenId;

        /**
         * The list of OCIDs for the child work requests.
         *
         * @param childrenId the value to set
         * @return this builder
         */
        public Builder childrenId(java.util.List<String> childrenId) {
            this.childrenId = childrenId;
            this.__explicitlySet__.add("childrenId");
            return this;
        }
        /**
         * The OCID of the compartment that contains the work request. Work requests should be
         * scoped to the same compartment as the resource the work request affects. If the work
         * request affects multiple resources, and those resources are not in the same compartment,
         * it is up to the service team to pick the primary resource whose compartment should be
         * used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the work request. Work requests should be
         * scoped to the same compartment as the resource the work request affects. If the work
         * request affects multiple resources, and those resources are not in the same compartment,
         * it is up to the service team to pick the primary resource whose compartment should be
         * used.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The percentage complete of the operation tracked by this work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        /**
         * The percentage complete of the operation tracked by this work request.
         *
         * @param percentComplete the value to set
         * @return this builder
         */
        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * The date and time the request was created - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the request was created - as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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
                            this.description,
                            this.displayName,
                            this.message,
                            this.parentId,
                            this.childrenId,
                            this.compartmentId,
                            this.percentComplete,
                            this.timeCreated);
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
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
            }
            if (model.wasPropertyExplicitlySet("childrenId")) {
                this.childrenId(model.getChildrenId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /** Type of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final WorkRequestOperationType operationType;

    /**
     * Type of the work request.
     *
     * @return the value
     */
    public WorkRequestOperationType getOperationType() {
        return operationType;
    }

    /** Status of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final OperationStatus status;

    /**
     * Status of the work request.
     *
     * @return the value
     */
    public OperationStatus getStatus() {
        return status;
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

    /** A short description about the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description about the work request.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** A short display name for the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A short display name for the work request.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A progress or error message, if there is any. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A progress or error message, if there is any.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** The OCID of the parent work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * The OCID of the parent work request.
     *
     * @return the value
     */
    public String getParentId() {
        return parentId;
    }

    /** The list of OCIDs for the child work requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("childrenId")
    private final java.util.List<String> childrenId;

    /**
     * The list of OCIDs for the child work requests.
     *
     * @return the value
     */
    public java.util.List<String> getChildrenId() {
        return childrenId;
    }

    /**
     * The OCID of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource the work request affects. If the work request affects
     * multiple resources, and those resources are not in the same compartment, it is up to the
     * service team to pick the primary resource whose compartment should be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource the work request affects. If the work request affects
     * multiple resources, and those resources are not in the same compartment, it is up to the
     * service team to pick the primary resource whose compartment should be used.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The percentage complete of the operation tracked by this work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Float percentComplete;

    /**
     * The percentage complete of the operation tracked by this work request.
     *
     * @return the value
     */
    public Float getPercentComplete() {
        return percentComplete;
    }

    /**
     * The date and time the request was created - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the request was created - as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("WorkRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("operationType=").append(String.valueOf(this.operationType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", childrenId=").append(String.valueOf(this.childrenId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
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
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.childrenId, other.childrenId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.childrenId == null ? 43 : this.childrenId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
