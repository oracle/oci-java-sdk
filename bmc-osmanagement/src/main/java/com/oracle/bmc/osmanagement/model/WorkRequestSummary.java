/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A work request summary
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
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
        "description",
        "message",
        "percentComplete",
        "timeAccepted",
        "osFamily"
    })
    public WorkRequestSummary(
            OperationTypes operationType,
            OperationStatus status,
            String id,
            String compartmentId,
            String description,
            String message,
            Float percentComplete,
            java.util.Date timeAccepted,
            OsFamilies osFamily) {
        super();
        this.operationType = operationType;
        this.status = status;
        this.id = id;
        this.compartmentId = compartmentId;
        this.description = description;
        this.message = message;
        this.percentComplete = percentComplete;
        this.timeAccepted = timeAccepted;
        this.osFamily = osFamily;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * the type of operation this Work Request performs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationTypes operationType;

        /**
         * the type of operation this Work Request performs
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(OperationTypes operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * status of current work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private OperationStatus status;

        /**
         * status of current work request.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(OperationStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The id of the work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The id of the work request.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The ocid of the compartment that contains the work request. Work requests should be scoped to
         * the same compartment as the resource the work request affects. If the work request affects multiple resources,
         * and those resources are not in the same compartment, it is up to the service team to pick the primary
         * resource whose compartment should be used
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The ocid of the compartment that contains the work request. Work requests should be scoped to
         * the same compartment as the resource the work request affects. If the work request affects multiple resources,
         * and those resources are not in the same compartment, it is up to the service team to pick the primary
         * resource whose compartment should be used
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
         * Description of the type of work.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the type of work.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A progress or error message, if there is any.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A progress or error message, if there is any.
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * Percentage of the request completed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        /**
         * Percentage of the request completed.
         * @param percentComplete the value to set
         * @return this builder
         **/
        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * The date and time the request was created, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The date and time the request was created, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
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
         * The Operating System type of the managed instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamilies osFamily;

        /**
         * The Operating System type of the managed instance.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamilies osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
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
                            this.description,
                            this.message,
                            this.percentComplete,
                            this.timeAccepted,
                            this.osFamily);
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
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
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
     * the type of operation this Work Request performs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationTypes operationType;

    /**
     * the type of operation this Work Request performs
     * @return the value
     **/
    public OperationTypes getOperationType() {
        return operationType;
    }

    /**
     * status of current work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final OperationStatus status;

    /**
     * status of current work request.
     * @return the value
     **/
    public OperationStatus getStatus() {
        return status;
    }

    /**
     * The id of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The id of the work request.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The ocid of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource the work request affects. If the work request affects multiple resources,
     * and those resources are not in the same compartment, it is up to the service team to pick the primary
     * resource whose compartment should be used
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The ocid of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource the work request affects. If the work request affects multiple resources,
     * and those resources are not in the same compartment, it is up to the service team to pick the primary
     * resource whose compartment should be used
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Description of the type of work.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the type of work.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A progress or error message, if there is any.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A progress or error message, if there is any.
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * Percentage of the request completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Float percentComplete;

    /**
     * Percentage of the request completed.
     * @return the value
     **/
    public Float getPercentComplete() {
        return percentComplete;
    }

    /**
     * The date and time the request was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The date and time the request was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     **/
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * The Operating System type of the managed instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamilies osFamily;

    /**
     * The Operating System type of the managed instance.
     * @return the value
     **/
    public OsFamilies getOsFamily() {
        return osFamily;
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
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
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
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
