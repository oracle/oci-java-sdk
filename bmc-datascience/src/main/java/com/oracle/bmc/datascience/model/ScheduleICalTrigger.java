/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The iCal schedule trigger.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScheduleICalTrigger.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "triggerType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduleICalTrigger extends ScheduleTrigger {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * This recurrence field conforms to RFC-5545 formatting
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recurrence")
        private String recurrence;

        /**
         * This recurrence field conforms to RFC-5545 formatting
         * @param recurrence the value to set
         * @return this builder
         **/
        public Builder recurrence(String recurrence) {
            this.recurrence = recurrence;
            this.__explicitlySet__.add("recurrence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleICalTrigger build() {
            ScheduleICalTrigger model =
                    new ScheduleICalTrigger(this.timeStart, this.timeEnd, this.recurrence);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleICalTrigger model) {
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("recurrence")) {
                this.recurrence(model.getRecurrence());
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

    @Deprecated
    public ScheduleICalTrigger(
            java.util.Date timeStart, java.util.Date timeEnd, String recurrence) {
        super(timeStart, timeEnd);
        this.recurrence = recurrence;
    }

    /**
     * This recurrence field conforms to RFC-5545 formatting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recurrence")
    private final String recurrence;

    /**
     * This recurrence field conforms to RFC-5545 formatting
     * @return the value
     **/
    public String getRecurrence() {
        return recurrence;
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
        sb.append("ScheduleICalTrigger(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", recurrence=").append(String.valueOf(this.recurrence));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleICalTrigger)) {
            return false;
        }

        ScheduleICalTrigger other = (ScheduleICalTrigger) o;
        return java.util.Objects.equals(this.recurrence, other.recurrence) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.recurrence == null ? 43 : this.recurrence.hashCode());
        return result;
    }
}
