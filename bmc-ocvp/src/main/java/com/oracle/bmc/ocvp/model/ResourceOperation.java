/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Status of the operation performed on the SDDC / Clster / ESXi host. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceOperation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceOperation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationName",
        "operationStatus",
        "timeOperationStarted",
        "timeOperationFinished"
    })
    public ResourceOperation(
            String operationName,
            ResourceOperationStatus operationStatus,
            java.util.Date timeOperationStarted,
            java.util.Date timeOperationFinished) {
        super();
        this.operationName = operationName;
        this.operationStatus = operationStatus;
        this.timeOperationStarted = timeOperationStarted;
        this.timeOperationFinished = timeOperationFinished;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationName")
        private String operationName;

        /**
         * Name of the operation.
         *
         * @param operationName the value to set
         * @return this builder
         */
        public Builder operationName(String operationName) {
            this.operationName = operationName;
            this.__explicitlySet__.add("operationName");
            return this;
        }
        /** The operation status. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private ResourceOperationStatus operationStatus;

        /**
         * The operation status.
         *
         * @param operationStatus the value to set
         * @return this builder
         */
        public Builder operationStatus(ResourceOperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }
        /**
         * The date and time the operation started at {@code IN_PROGRESS} state, in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOperationStarted")
        private java.util.Date timeOperationStarted;

        /**
         * The date and time the operation started at {@code IN_PROGRESS} state, in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeOperationStarted the value to set
         * @return this builder
         */
        public Builder timeOperationStarted(java.util.Date timeOperationStarted) {
            this.timeOperationStarted = timeOperationStarted;
            this.__explicitlySet__.add("timeOperationStarted");
            return this;
        }
        /**
         * The date and time the operation reached a terminal state, either {@code FAILED} OR {@code
         * SUCCEEDED}. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOperationFinished")
        private java.util.Date timeOperationFinished;

        /**
         * The date and time the operation reached a terminal state, either {@code FAILED} OR {@code
         * SUCCEEDED}. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeOperationFinished the value to set
         * @return this builder
         */
        public Builder timeOperationFinished(java.util.Date timeOperationFinished) {
            this.timeOperationFinished = timeOperationFinished;
            this.__explicitlySet__.add("timeOperationFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceOperation build() {
            ResourceOperation model =
                    new ResourceOperation(
                            this.operationName,
                            this.operationStatus,
                            this.timeOperationStarted,
                            this.timeOperationFinished);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceOperation model) {
            if (model.wasPropertyExplicitlySet("operationName")) {
                this.operationName(model.getOperationName());
            }
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("timeOperationStarted")) {
                this.timeOperationStarted(model.getTimeOperationStarted());
            }
            if (model.wasPropertyExplicitlySet("timeOperationFinished")) {
                this.timeOperationFinished(model.getTimeOperationFinished());
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

    /** Name of the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationName")
    private final String operationName;

    /**
     * Name of the operation.
     *
     * @return the value
     */
    public String getOperationName() {
        return operationName;
    }

    /** The operation status. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final ResourceOperationStatus operationStatus;

    /**
     * The operation status.
     *
     * @return the value
     */
    public ResourceOperationStatus getOperationStatus() {
        return operationStatus;
    }

    /**
     * The date and time the operation started at {@code IN_PROGRESS} state, in the format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOperationStarted")
    private final java.util.Date timeOperationStarted;

    /**
     * The date and time the operation started at {@code IN_PROGRESS} state, in the format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeOperationStarted() {
        return timeOperationStarted;
    }

    /**
     * The date and time the operation reached a terminal state, either {@code FAILED} OR {@code
     * SUCCEEDED}. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOperationFinished")
    private final java.util.Date timeOperationFinished;

    /**
     * The date and time the operation reached a terminal state, either {@code FAILED} OR {@code
     * SUCCEEDED}. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeOperationFinished() {
        return timeOperationFinished;
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
        sb.append("ResourceOperation(");
        sb.append("super=").append(super.toString());
        sb.append("operationName=").append(String.valueOf(this.operationName));
        sb.append(", operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", timeOperationStarted=").append(String.valueOf(this.timeOperationStarted));
        sb.append(", timeOperationFinished=").append(String.valueOf(this.timeOperationFinished));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceOperation)) {
            return false;
        }

        ResourceOperation other = (ResourceOperation) o;
        return java.util.Objects.equals(this.operationName, other.operationName)
                && java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.timeOperationStarted, other.timeOperationStarted)
                && java.util.Objects.equals(this.timeOperationFinished, other.timeOperationFinished)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationName == null ? 43 : this.operationName.hashCode());
        result =
                (result * PRIME)
                        + (this.operationStatus == null ? 43 : this.operationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOperationStarted == null
                                ? 43
                                : this.timeOperationStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOperationFinished == null
                                ? 43
                                : this.timeOperationFinished.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
