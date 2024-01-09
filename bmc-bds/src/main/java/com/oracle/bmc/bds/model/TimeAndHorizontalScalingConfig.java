/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Time of day and horizontal scaling configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TimeAndHorizontalScalingConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TimeAndHorizontalScalingConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeRecurrence", "targetNodeCount"})
    public TimeAndHorizontalScalingConfig(String timeRecurrence, Integer targetNodeCount) {
        super();
        this.timeRecurrence = timeRecurrence;
        this.targetNodeCount = targetNodeCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Day/time recurrence (specified following RFC 5545) at which to trigger autoscaling
         * action. Currently only WEEKLY frequency is supported. Days of the week are specified
         * using BYDAY field. Time of the day is specified using BYHOUR and BYMINUTE fields. Other
         * fields are not supported.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRecurrence")
        private String timeRecurrence;

        /**
         * Day/time recurrence (specified following RFC 5545) at which to trigger autoscaling
         * action. Currently only WEEKLY frequency is supported. Days of the week are specified
         * using BYDAY field. Time of the day is specified using BYHOUR and BYMINUTE fields. Other
         * fields are not supported.
         *
         * @param timeRecurrence the value to set
         * @return this builder
         */
        public Builder timeRecurrence(String timeRecurrence) {
            this.timeRecurrence = timeRecurrence;
            this.__explicitlySet__.add("timeRecurrence");
            return this;
        }
        /** This value is the desired number of nodes in the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetNodeCount")
        private Integer targetNodeCount;

        /**
         * This value is the desired number of nodes in the cluster.
         *
         * @param targetNodeCount the value to set
         * @return this builder
         */
        public Builder targetNodeCount(Integer targetNodeCount) {
            this.targetNodeCount = targetNodeCount;
            this.__explicitlySet__.add("targetNodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TimeAndHorizontalScalingConfig build() {
            TimeAndHorizontalScalingConfig model =
                    new TimeAndHorizontalScalingConfig(this.timeRecurrence, this.targetNodeCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeAndHorizontalScalingConfig model) {
            if (model.wasPropertyExplicitlySet("timeRecurrence")) {
                this.timeRecurrence(model.getTimeRecurrence());
            }
            if (model.wasPropertyExplicitlySet("targetNodeCount")) {
                this.targetNodeCount(model.getTargetNodeCount());
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
     * Day/time recurrence (specified following RFC 5545) at which to trigger autoscaling action.
     * Currently only WEEKLY frequency is supported. Days of the week are specified using BYDAY
     * field. Time of the day is specified using BYHOUR and BYMINUTE fields. Other fields are not
     * supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRecurrence")
    private final String timeRecurrence;

    /**
     * Day/time recurrence (specified following RFC 5545) at which to trigger autoscaling action.
     * Currently only WEEKLY frequency is supported. Days of the week are specified using BYDAY
     * field. Time of the day is specified using BYHOUR and BYMINUTE fields. Other fields are not
     * supported.
     *
     * @return the value
     */
    public String getTimeRecurrence() {
        return timeRecurrence;
    }

    /** This value is the desired number of nodes in the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetNodeCount")
    private final Integer targetNodeCount;

    /**
     * This value is the desired number of nodes in the cluster.
     *
     * @return the value
     */
    public Integer getTargetNodeCount() {
        return targetNodeCount;
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
        sb.append("TimeAndHorizontalScalingConfig(");
        sb.append("super=").append(super.toString());
        sb.append("timeRecurrence=").append(String.valueOf(this.timeRecurrence));
        sb.append(", targetNodeCount=").append(String.valueOf(this.targetNodeCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeAndHorizontalScalingConfig)) {
            return false;
        }

        TimeAndHorizontalScalingConfig other = (TimeAndHorizontalScalingConfig) o;
        return java.util.Objects.equals(this.timeRecurrence, other.timeRecurrence)
                && java.util.Objects.equals(this.targetNodeCount, other.targetNodeCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeRecurrence == null ? 43 : this.timeRecurrence.hashCode());
        result =
                (result * PRIME)
                        + (this.targetNodeCount == null ? 43 : this.targetNodeCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
