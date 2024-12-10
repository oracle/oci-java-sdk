/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Enables a freeze period for the VM cluster prohibiting the VMs from getting cloud automation software updates during critical business cycles. Freeze period start date. Starts at 12:00 AM UTC on the selected date and ends at 11:59:59 PM UTC on the selected date. Validates to ensure the freeze period does not exceed 45 days.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CloudAutomationFreezePeriod.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloudAutomationFreezePeriod
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"freezePeriodStartTime", "freezePeriodEndTime"})
    public CloudAutomationFreezePeriod(String freezePeriodStartTime, String freezePeriodEndTime) {
        super();
        this.freezePeriodStartTime = freezePeriodStartTime;
        this.freezePeriodEndTime = freezePeriodEndTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Start time of the freeze period cycle.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freezePeriodStartTime")
        private String freezePeriodStartTime;

        /**
         * Start time of the freeze period cycle.
         *
         * @param freezePeriodStartTime the value to set
         * @return this builder
         **/
        public Builder freezePeriodStartTime(String freezePeriodStartTime) {
            this.freezePeriodStartTime = freezePeriodStartTime;
            this.__explicitlySet__.add("freezePeriodStartTime");
            return this;
        }
        /**
         * End time of the freeze period cycle.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freezePeriodEndTime")
        private String freezePeriodEndTime;

        /**
         * End time of the freeze period cycle.
         *
         * @param freezePeriodEndTime the value to set
         * @return this builder
         **/
        public Builder freezePeriodEndTime(String freezePeriodEndTime) {
            this.freezePeriodEndTime = freezePeriodEndTime;
            this.__explicitlySet__.add("freezePeriodEndTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudAutomationFreezePeriod build() {
            CloudAutomationFreezePeriod model =
                    new CloudAutomationFreezePeriod(
                            this.freezePeriodStartTime, this.freezePeriodEndTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudAutomationFreezePeriod model) {
            if (model.wasPropertyExplicitlySet("freezePeriodStartTime")) {
                this.freezePeriodStartTime(model.getFreezePeriodStartTime());
            }
            if (model.wasPropertyExplicitlySet("freezePeriodEndTime")) {
                this.freezePeriodEndTime(model.getFreezePeriodEndTime());
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
     * Start time of the freeze period cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freezePeriodStartTime")
    private final String freezePeriodStartTime;

    /**
     * Start time of the freeze period cycle.
     *
     * @return the value
     **/
    public String getFreezePeriodStartTime() {
        return freezePeriodStartTime;
    }

    /**
     * End time of the freeze period cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freezePeriodEndTime")
    private final String freezePeriodEndTime;

    /**
     * End time of the freeze period cycle.
     *
     * @return the value
     **/
    public String getFreezePeriodEndTime() {
        return freezePeriodEndTime;
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
        sb.append("CloudAutomationFreezePeriod(");
        sb.append("super=").append(super.toString());
        sb.append("freezePeriodStartTime=").append(String.valueOf(this.freezePeriodStartTime));
        sb.append(", freezePeriodEndTime=").append(String.valueOf(this.freezePeriodEndTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudAutomationFreezePeriod)) {
            return false;
        }

        CloudAutomationFreezePeriod other = (CloudAutomationFreezePeriod) o;
        return java.util.Objects.equals(this.freezePeriodStartTime, other.freezePeriodStartTime)
                && java.util.Objects.equals(this.freezePeriodEndTime, other.freezePeriodEndTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.freezePeriodStartTime == null
                                ? 43
                                : this.freezePeriodStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.freezePeriodEndTime == null
                                ? 43
                                : this.freezePeriodEndTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
