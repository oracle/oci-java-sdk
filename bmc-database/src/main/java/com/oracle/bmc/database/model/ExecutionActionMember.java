/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The action member details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExecutionActionMember.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecutionActionMember
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "memberOrder",
        "memberId",
        "status",
        "estimatedTimeInMins",
        "totalTimeTakenInMins"
    })
    public ExecutionActionMember(
            Integer memberOrder,
            String memberId,
            String status,
            Integer estimatedTimeInMins,
            Integer totalTimeTakenInMins) {
        super();
        this.memberOrder = memberOrder;
        this.memberId = memberId;
        this.status = status;
        this.estimatedTimeInMins = estimatedTimeInMins;
        this.totalTimeTakenInMins = totalTimeTakenInMins;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The priority order of the execution action member. */
        @com.fasterxml.jackson.annotation.JsonProperty("memberOrder")
        private Integer memberOrder;

        /**
         * The priority order of the execution action member.
         *
         * @param memberOrder the value to set
         * @return this builder
         */
        public Builder memberOrder(Integer memberOrder) {
            this.memberOrder = memberOrder;
            this.__explicitlySet__.add("memberOrder");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * parent resource the execution action belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * parent resource the execution action belongs to.
         *
         * @param memberId the value to set
         * @return this builder
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }
        /**
         * The current status of the execution action member. Valid states are SCHEDULED,
         * IN_PROGRESS, FAILED, CANCELED, DURATION_EXCEEDED, RESCHEDULED and COMPLETED. enum: -
         * SCHEDULED - IN_PROGRESS - FAILED - CANCELED - DURATION_EXCEEDED - RESCHEDULED - SUCCEEDED
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The current status of the execution action member. Valid states are SCHEDULED,
         * IN_PROGRESS, FAILED, CANCELED, DURATION_EXCEEDED, RESCHEDULED and COMPLETED. enum: -
         * SCHEDULED - IN_PROGRESS - FAILED - CANCELED - DURATION_EXCEEDED - RESCHEDULED - SUCCEEDED
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The estimated time of the execution action member in minutes. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
        private Integer estimatedTimeInMins;

        /**
         * The estimated time of the execution action member in minutes.
         *
         * @param estimatedTimeInMins the value to set
         * @return this builder
         */
        public Builder estimatedTimeInMins(Integer estimatedTimeInMins) {
            this.estimatedTimeInMins = estimatedTimeInMins;
            this.__explicitlySet__.add("estimatedTimeInMins");
            return this;
        }
        /** The total time taken by corresponding resource activity in minutes. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalTimeTakenInMins")
        private Integer totalTimeTakenInMins;

        /**
         * The total time taken by corresponding resource activity in minutes.
         *
         * @param totalTimeTakenInMins the value to set
         * @return this builder
         */
        public Builder totalTimeTakenInMins(Integer totalTimeTakenInMins) {
            this.totalTimeTakenInMins = totalTimeTakenInMins;
            this.__explicitlySet__.add("totalTimeTakenInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecutionActionMember build() {
            ExecutionActionMember model =
                    new ExecutionActionMember(
                            this.memberOrder,
                            this.memberId,
                            this.status,
                            this.estimatedTimeInMins,
                            this.totalTimeTakenInMins);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecutionActionMember model) {
            if (model.wasPropertyExplicitlySet("memberOrder")) {
                this.memberOrder(model.getMemberOrder());
            }
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("estimatedTimeInMins")) {
                this.estimatedTimeInMins(model.getEstimatedTimeInMins());
            }
            if (model.wasPropertyExplicitlySet("totalTimeTakenInMins")) {
                this.totalTimeTakenInMins(model.getTotalTimeTakenInMins());
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

    /** The priority order of the execution action member. */
    @com.fasterxml.jackson.annotation.JsonProperty("memberOrder")
    private final Integer memberOrder;

    /**
     * The priority order of the execution action member.
     *
     * @return the value
     */
    public Integer getMemberOrder() {
        return memberOrder;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * parent resource the execution action belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memberId")
    private final String memberId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * parent resource the execution action belongs to.
     *
     * @return the value
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * The current status of the execution action member. Valid states are SCHEDULED, IN_PROGRESS,
     * FAILED, CANCELED, DURATION_EXCEEDED, RESCHEDULED and COMPLETED. enum: - SCHEDULED -
     * IN_PROGRESS - FAILED - CANCELED - DURATION_EXCEEDED - RESCHEDULED - SUCCEEDED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The current status of the execution action member. Valid states are SCHEDULED, IN_PROGRESS,
     * FAILED, CANCELED, DURATION_EXCEEDED, RESCHEDULED and COMPLETED. enum: - SCHEDULED -
     * IN_PROGRESS - FAILED - CANCELED - DURATION_EXCEEDED - RESCHEDULED - SUCCEEDED
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The estimated time of the execution action member in minutes. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
    private final Integer estimatedTimeInMins;

    /**
     * The estimated time of the execution action member in minutes.
     *
     * @return the value
     */
    public Integer getEstimatedTimeInMins() {
        return estimatedTimeInMins;
    }

    /** The total time taken by corresponding resource activity in minutes. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalTimeTakenInMins")
    private final Integer totalTimeTakenInMins;

    /**
     * The total time taken by corresponding resource activity in minutes.
     *
     * @return the value
     */
    public Integer getTotalTimeTakenInMins() {
        return totalTimeTakenInMins;
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
        sb.append("ExecutionActionMember(");
        sb.append("super=").append(super.toString());
        sb.append("memberOrder=").append(String.valueOf(this.memberOrder));
        sb.append(", memberId=").append(String.valueOf(this.memberId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", estimatedTimeInMins=").append(String.valueOf(this.estimatedTimeInMins));
        sb.append(", totalTimeTakenInMins=").append(String.valueOf(this.totalTimeTakenInMins));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecutionActionMember)) {
            return false;
        }

        ExecutionActionMember other = (ExecutionActionMember) o;
        return java.util.Objects.equals(this.memberOrder, other.memberOrder)
                && java.util.Objects.equals(this.memberId, other.memberId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.estimatedTimeInMins, other.estimatedTimeInMins)
                && java.util.Objects.equals(this.totalTimeTakenInMins, other.totalTimeTakenInMins)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.memberOrder == null ? 43 : this.memberOrder.hashCode());
        result = (result * PRIME) + (this.memberId == null ? 43 : this.memberId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedTimeInMins == null
                                ? 43
                                : this.estimatedTimeInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.totalTimeTakenInMins == null
                                ? 43
                                : this.totalTimeTakenInMins.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
