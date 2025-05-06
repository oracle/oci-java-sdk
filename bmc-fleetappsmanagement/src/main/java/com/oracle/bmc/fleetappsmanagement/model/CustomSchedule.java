/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Custom schedule details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CustomSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomSchedule extends Schedule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("executionStartdate")
        private java.util.Date executionStartdate;

        public Builder executionStartdate(java.util.Date executionStartdate) {
            this.executionStartdate = executionStartdate;
            this.__explicitlySet__.add("executionStartdate");
            return this;
        }
        /** Recurrence rule specification if recurring */
        @com.fasterxml.jackson.annotation.JsonProperty("recurrences")
        private String recurrences;

        /**
         * Recurrence rule specification if recurring
         *
         * @param recurrences the value to set
         * @return this builder
         */
        public Builder recurrences(String recurrences) {
            this.recurrences = recurrences;
            this.__explicitlySet__.add("recurrences");
            return this;
        }
        /** Duration of the schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private String duration;

        /**
         * Duration of the schedule.
         *
         * @param duration the value to set
         * @return this builder
         */
        public Builder duration(String duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomSchedule build() {
            CustomSchedule model =
                    new CustomSchedule(this.executionStartdate, this.recurrences, this.duration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomSchedule model) {
            if (model.wasPropertyExplicitlySet("executionStartdate")) {
                this.executionStartdate(model.getExecutionStartdate());
            }
            if (model.wasPropertyExplicitlySet("recurrences")) {
                this.recurrences(model.getRecurrences());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
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

    @Deprecated
    public CustomSchedule(java.util.Date executionStartdate, String recurrences, String duration) {
        super(executionStartdate);
        this.recurrences = recurrences;
        this.duration = duration;
    }

    /** Recurrence rule specification if recurring */
    @com.fasterxml.jackson.annotation.JsonProperty("recurrences")
    private final String recurrences;

    /**
     * Recurrence rule specification if recurring
     *
     * @return the value
     */
    public String getRecurrences() {
        return recurrences;
    }

    /** Duration of the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final String duration;

    /**
     * Duration of the schedule.
     *
     * @return the value
     */
    public String getDuration() {
        return duration;
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
        sb.append("CustomSchedule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", recurrences=").append(String.valueOf(this.recurrences));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomSchedule)) {
            return false;
        }

        CustomSchedule other = (CustomSchedule) o;
        return java.util.Objects.equals(this.recurrences, other.recurrences)
                && java.util.Objects.equals(this.duration, other.duration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.recurrences == null ? 43 : this.recurrences.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        return result;
    }
}
