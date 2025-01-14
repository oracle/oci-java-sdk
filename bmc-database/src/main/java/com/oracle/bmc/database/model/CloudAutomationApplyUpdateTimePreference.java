/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Configure the time slot for applying VM cloud automation software updates to the cluster. When
 * nothing is selected, the default time slot is 12 AM to 2 AM UTC. Any 2-hour slot is available
 * starting at 12 AM. <br>
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
        builder = CloudAutomationApplyUpdateTimePreference.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloudAutomationApplyUpdateTimePreference
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "applyUpdatePreferredStartTime",
        "applyUpdatePreferredEndTime"
    })
    public CloudAutomationApplyUpdateTimePreference(
            String applyUpdatePreferredStartTime, String applyUpdatePreferredEndTime) {
        super();
        this.applyUpdatePreferredStartTime = applyUpdatePreferredStartTime;
        this.applyUpdatePreferredEndTime = applyUpdatePreferredEndTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Start time for polling VM cloud automation software updates for the cluster. If the
         * startTime is not specified, 12 AM UTC is used by default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applyUpdatePreferredStartTime")
        private String applyUpdatePreferredStartTime;

        /**
         * Start time for polling VM cloud automation software updates for the cluster. If the
         * startTime is not specified, 12 AM UTC is used by default.
         *
         * @param applyUpdatePreferredStartTime the value to set
         * @return this builder
         */
        public Builder applyUpdatePreferredStartTime(String applyUpdatePreferredStartTime) {
            this.applyUpdatePreferredStartTime = applyUpdatePreferredStartTime;
            this.__explicitlySet__.add("applyUpdatePreferredStartTime");
            return this;
        }
        /**
         * End time for polling VM cloud automation software updates for the cluster. If the endTime
         * is not specified, 2 AM UTC is used by default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applyUpdatePreferredEndTime")
        private String applyUpdatePreferredEndTime;

        /**
         * End time for polling VM cloud automation software updates for the cluster. If the endTime
         * is not specified, 2 AM UTC is used by default.
         *
         * @param applyUpdatePreferredEndTime the value to set
         * @return this builder
         */
        public Builder applyUpdatePreferredEndTime(String applyUpdatePreferredEndTime) {
            this.applyUpdatePreferredEndTime = applyUpdatePreferredEndTime;
            this.__explicitlySet__.add("applyUpdatePreferredEndTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudAutomationApplyUpdateTimePreference build() {
            CloudAutomationApplyUpdateTimePreference model =
                    new CloudAutomationApplyUpdateTimePreference(
                            this.applyUpdatePreferredStartTime, this.applyUpdatePreferredEndTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudAutomationApplyUpdateTimePreference model) {
            if (model.wasPropertyExplicitlySet("applyUpdatePreferredStartTime")) {
                this.applyUpdatePreferredStartTime(model.getApplyUpdatePreferredStartTime());
            }
            if (model.wasPropertyExplicitlySet("applyUpdatePreferredEndTime")) {
                this.applyUpdatePreferredEndTime(model.getApplyUpdatePreferredEndTime());
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
     * Start time for polling VM cloud automation software updates for the cluster. If the startTime
     * is not specified, 12 AM UTC is used by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applyUpdatePreferredStartTime")
    private final String applyUpdatePreferredStartTime;

    /**
     * Start time for polling VM cloud automation software updates for the cluster. If the startTime
     * is not specified, 12 AM UTC is used by default.
     *
     * @return the value
     */
    public String getApplyUpdatePreferredStartTime() {
        return applyUpdatePreferredStartTime;
    }

    /**
     * End time for polling VM cloud automation software updates for the cluster. If the endTime is
     * not specified, 2 AM UTC is used by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applyUpdatePreferredEndTime")
    private final String applyUpdatePreferredEndTime;

    /**
     * End time for polling VM cloud automation software updates for the cluster. If the endTime is
     * not specified, 2 AM UTC is used by default.
     *
     * @return the value
     */
    public String getApplyUpdatePreferredEndTime() {
        return applyUpdatePreferredEndTime;
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
        sb.append("CloudAutomationApplyUpdateTimePreference(");
        sb.append("super=").append(super.toString());
        sb.append("applyUpdatePreferredStartTime=")
                .append(String.valueOf(this.applyUpdatePreferredStartTime));
        sb.append(", applyUpdatePreferredEndTime=")
                .append(String.valueOf(this.applyUpdatePreferredEndTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudAutomationApplyUpdateTimePreference)) {
            return false;
        }

        CloudAutomationApplyUpdateTimePreference other =
                (CloudAutomationApplyUpdateTimePreference) o;
        return java.util.Objects.equals(
                        this.applyUpdatePreferredStartTime, other.applyUpdatePreferredStartTime)
                && java.util.Objects.equals(
                        this.applyUpdatePreferredEndTime, other.applyUpdatePreferredEndTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.applyUpdatePreferredStartTime == null
                                ? 43
                                : this.applyUpdatePreferredStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.applyUpdatePreferredEndTime == null
                                ? 43
                                : this.applyUpdatePreferredEndTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
