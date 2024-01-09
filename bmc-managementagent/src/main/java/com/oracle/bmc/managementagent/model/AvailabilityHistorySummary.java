/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Availability history of Management Agent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AvailabilityHistorySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AvailabilityHistorySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managementAgentId",
        "availabilityStatus",
        "timeAvailabilityStatusStarted",
        "timeAvailabilityStatusEnded"
    })
    public AvailabilityHistorySummary(
            String managementAgentId,
            AvailabilityStatus availabilityStatus,
            java.util.Date timeAvailabilityStatusStarted,
            java.util.Date timeAvailabilityStatusEnded) {
        super();
        this.managementAgentId = managementAgentId;
        this.availabilityStatus = availabilityStatus;
        this.timeAvailabilityStatusStarted = timeAvailabilityStatusStarted;
        this.timeAvailabilityStatusEnded = timeAvailabilityStatusEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** agent identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * agent identifier
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /** The availability status of managementAgent */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
        private AvailabilityStatus availabilityStatus;

        /**
         * The availability status of managementAgent
         *
         * @param availabilityStatus the value to set
         * @return this builder
         */
        public Builder availabilityStatus(AvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            this.__explicitlySet__.add("availabilityStatus");
            return this;
        }
        /**
         * The time at which the Management Agent moved to the availability status. An RFC3339
         * formatted datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAvailabilityStatusStarted")
        private java.util.Date timeAvailabilityStatusStarted;

        /**
         * The time at which the Management Agent moved to the availability status. An RFC3339
         * formatted datetime string
         *
         * @param timeAvailabilityStatusStarted the value to set
         * @return this builder
         */
        public Builder timeAvailabilityStatusStarted(java.util.Date timeAvailabilityStatusStarted) {
            this.timeAvailabilityStatusStarted = timeAvailabilityStatusStarted;
            this.__explicitlySet__.add("timeAvailabilityStatusStarted");
            return this;
        }
        /**
         * The time till which the Management Agent was known to be in the availability status. An
         * RFC3339 formatted datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAvailabilityStatusEnded")
        private java.util.Date timeAvailabilityStatusEnded;

        /**
         * The time till which the Management Agent was known to be in the availability status. An
         * RFC3339 formatted datetime string
         *
         * @param timeAvailabilityStatusEnded the value to set
         * @return this builder
         */
        public Builder timeAvailabilityStatusEnded(java.util.Date timeAvailabilityStatusEnded) {
            this.timeAvailabilityStatusEnded = timeAvailabilityStatusEnded;
            this.__explicitlySet__.add("timeAvailabilityStatusEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailabilityHistorySummary build() {
            AvailabilityHistorySummary model =
                    new AvailabilityHistorySummary(
                            this.managementAgentId,
                            this.availabilityStatus,
                            this.timeAvailabilityStatusStarted,
                            this.timeAvailabilityStatusEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailabilityHistorySummary model) {
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityStatus")) {
                this.availabilityStatus(model.getAvailabilityStatus());
            }
            if (model.wasPropertyExplicitlySet("timeAvailabilityStatusStarted")) {
                this.timeAvailabilityStatusStarted(model.getTimeAvailabilityStatusStarted());
            }
            if (model.wasPropertyExplicitlySet("timeAvailabilityStatusEnded")) {
                this.timeAvailabilityStatusEnded(model.getTimeAvailabilityStatusEnded());
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

    /** agent identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * agent identifier
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /** The availability status of managementAgent */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
    private final AvailabilityStatus availabilityStatus;

    /**
     * The availability status of managementAgent
     *
     * @return the value
     */
    public AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * The time at which the Management Agent moved to the availability status. An RFC3339 formatted
     * datetime string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAvailabilityStatusStarted")
    private final java.util.Date timeAvailabilityStatusStarted;

    /**
     * The time at which the Management Agent moved to the availability status. An RFC3339 formatted
     * datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeAvailabilityStatusStarted() {
        return timeAvailabilityStatusStarted;
    }

    /**
     * The time till which the Management Agent was known to be in the availability status. An
     * RFC3339 formatted datetime string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAvailabilityStatusEnded")
    private final java.util.Date timeAvailabilityStatusEnded;

    /**
     * The time till which the Management Agent was known to be in the availability status. An
     * RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeAvailabilityStatusEnded() {
        return timeAvailabilityStatusEnded;
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
        sb.append("AvailabilityHistorySummary(");
        sb.append("super=").append(super.toString());
        sb.append("managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", availabilityStatus=").append(String.valueOf(this.availabilityStatus));
        sb.append(", timeAvailabilityStatusStarted=")
                .append(String.valueOf(this.timeAvailabilityStatusStarted));
        sb.append(", timeAvailabilityStatusEnded=")
                .append(String.valueOf(this.timeAvailabilityStatusEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailabilityHistorySummary)) {
            return false;
        }

        AvailabilityHistorySummary other = (AvailabilityHistorySummary) o;
        return java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.availabilityStatus, other.availabilityStatus)
                && java.util.Objects.equals(
                        this.timeAvailabilityStatusStarted, other.timeAvailabilityStatusStarted)
                && java.util.Objects.equals(
                        this.timeAvailabilityStatusEnded, other.timeAvailabilityStatusEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityStatus == null
                                ? 43
                                : this.availabilityStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAvailabilityStatusStarted == null
                                ? 43
                                : this.timeAvailabilityStatusStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAvailabilityStatusEnded == null
                                ? 43
                                : this.timeAvailabilityStatusEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
