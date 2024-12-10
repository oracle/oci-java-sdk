/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * Alarm suppression recurring schedule. Only one recurrence condition is supported within the list of preconditions for a suppression ({@code suppressionConditions}).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Recurrence.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "conditionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Recurrence extends SuppressionCondition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Frequency and start time of the recurring suppression. The format follows
         * [the iCalendar specification (RFC 5545, section 3.3.10)](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10).
         * Supported rule parts:
         * * {@code FREQ}: Frequency of the recurring suppression: {@code WEEKLY} or {@code DAILY} only.
         * * {@code BYDAY}: Comma separated days. Use with weekly suppressions only. Supported values: {@code MO}, {@code TU}, {@code WE}, {@code TH}, {@code FR}, {@code SA} ,{@code SU}.
         * * {@code BYHOUR}, {@code BYMINUTE}, {@code BYSECOND}: Start time in UTC, after {@code timeSuppressFrom} value. Default is 00:00:00 UTC after {@code timeSuppressFrom}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("suppressionRecurrence")
        private String suppressionRecurrence;

        /**
         * Frequency and start time of the recurring suppression. The format follows
         * [the iCalendar specification (RFC 5545, section 3.3.10)](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10).
         * Supported rule parts:
         * * {@code FREQ}: Frequency of the recurring suppression: {@code WEEKLY} or {@code DAILY} only.
         * * {@code BYDAY}: Comma separated days. Use with weekly suppressions only. Supported values: {@code MO}, {@code TU}, {@code WE}, {@code TH}, {@code FR}, {@code SA} ,{@code SU}.
         * * {@code BYHOUR}, {@code BYMINUTE}, {@code BYSECOND}: Start time in UTC, after {@code timeSuppressFrom} value. Default is 00:00:00 UTC after {@code timeSuppressFrom}.
         *
         * @param suppressionRecurrence the value to set
         * @return this builder
         **/
        public Builder suppressionRecurrence(String suppressionRecurrence) {
            this.suppressionRecurrence = suppressionRecurrence;
            this.__explicitlySet__.add("suppressionRecurrence");
            return this;
        }
        /**
         * Duration of the recurring suppression. Specified as a string in ISO 8601 format. Minimum: {@code PT1M} (1 minute). Maximum: {@code PT24H} (24 hours).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("suppressionDuration")
        private String suppressionDuration;

        /**
         * Duration of the recurring suppression. Specified as a string in ISO 8601 format. Minimum: {@code PT1M} (1 minute). Maximum: {@code PT24H} (24 hours).
         *
         * @param suppressionDuration the value to set
         * @return this builder
         **/
        public Builder suppressionDuration(String suppressionDuration) {
            this.suppressionDuration = suppressionDuration;
            this.__explicitlySet__.add("suppressionDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Recurrence build() {
            Recurrence model = new Recurrence(this.suppressionRecurrence, this.suppressionDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Recurrence model) {
            if (model.wasPropertyExplicitlySet("suppressionRecurrence")) {
                this.suppressionRecurrence(model.getSuppressionRecurrence());
            }
            if (model.wasPropertyExplicitlySet("suppressionDuration")) {
                this.suppressionDuration(model.getSuppressionDuration());
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
    public Recurrence(String suppressionRecurrence, String suppressionDuration) {
        super();
        this.suppressionRecurrence = suppressionRecurrence;
        this.suppressionDuration = suppressionDuration;
    }

    /**
     * Frequency and start time of the recurring suppression. The format follows
     * [the iCalendar specification (RFC 5545, section 3.3.10)](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10).
     * Supported rule parts:
     * * {@code FREQ}: Frequency of the recurring suppression: {@code WEEKLY} or {@code DAILY} only.
     * * {@code BYDAY}: Comma separated days. Use with weekly suppressions only. Supported values: {@code MO}, {@code TU}, {@code WE}, {@code TH}, {@code FR}, {@code SA} ,{@code SU}.
     * * {@code BYHOUR}, {@code BYMINUTE}, {@code BYSECOND}: Start time in UTC, after {@code timeSuppressFrom} value. Default is 00:00:00 UTC after {@code timeSuppressFrom}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suppressionRecurrence")
    private final String suppressionRecurrence;

    /**
     * Frequency and start time of the recurring suppression. The format follows
     * [the iCalendar specification (RFC 5545, section 3.3.10)](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10).
     * Supported rule parts:
     * * {@code FREQ}: Frequency of the recurring suppression: {@code WEEKLY} or {@code DAILY} only.
     * * {@code BYDAY}: Comma separated days. Use with weekly suppressions only. Supported values: {@code MO}, {@code TU}, {@code WE}, {@code TH}, {@code FR}, {@code SA} ,{@code SU}.
     * * {@code BYHOUR}, {@code BYMINUTE}, {@code BYSECOND}: Start time in UTC, after {@code timeSuppressFrom} value. Default is 00:00:00 UTC after {@code timeSuppressFrom}.
     *
     * @return the value
     **/
    public String getSuppressionRecurrence() {
        return suppressionRecurrence;
    }

    /**
     * Duration of the recurring suppression. Specified as a string in ISO 8601 format. Minimum: {@code PT1M} (1 minute). Maximum: {@code PT24H} (24 hours).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suppressionDuration")
    private final String suppressionDuration;

    /**
     * Duration of the recurring suppression. Specified as a string in ISO 8601 format. Minimum: {@code PT1M} (1 minute). Maximum: {@code PT24H} (24 hours).
     *
     * @return the value
     **/
    public String getSuppressionDuration() {
        return suppressionDuration;
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
        sb.append("Recurrence(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", suppressionRecurrence=").append(String.valueOf(this.suppressionRecurrence));
        sb.append(", suppressionDuration=").append(String.valueOf(this.suppressionDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Recurrence)) {
            return false;
        }

        Recurrence other = (Recurrence) o;
        return java.util.Objects.equals(this.suppressionRecurrence, other.suppressionRecurrence)
                && java.util.Objects.equals(this.suppressionDuration, other.suppressionDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.suppressionRecurrence == null
                                ? 43
                                : this.suppressionRecurrence.hashCode());
        result =
                (result * PRIME)
                        + (this.suppressionDuration == null
                                ? 43
                                : this.suppressionDuration.hashCode());
        return result;
    }
}
