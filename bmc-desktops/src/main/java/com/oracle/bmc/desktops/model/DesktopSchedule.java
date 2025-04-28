/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Provides the schedule information for a desktop. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DesktopSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DesktopSchedule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cronExpression", "timezone"})
    public DesktopSchedule(String cronExpression, String timezone) {
        super();
        this.cronExpression = cronExpression;
        this.timezone = timezone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A cron expression describing the desktop's schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("cronExpression")
        private String cronExpression;

        /**
         * A cron expression describing the desktop's schedule.
         *
         * @param cronExpression the value to set
         * @return this builder
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            this.__explicitlySet__.add("cronExpression");
            return this;
        }
        /** The timezone of the desktop's schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * The timezone of the desktop's schedule.
         *
         * @param timezone the value to set
         * @return this builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DesktopSchedule build() {
            DesktopSchedule model = new DesktopSchedule(this.cronExpression, this.timezone);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DesktopSchedule model) {
            if (model.wasPropertyExplicitlySet("cronExpression")) {
                this.cronExpression(model.getCronExpression());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
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

    /** A cron expression describing the desktop's schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("cronExpression")
    private final String cronExpression;

    /**
     * A cron expression describing the desktop's schedule.
     *
     * @return the value
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /** The timezone of the desktop's schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * The timezone of the desktop's schedule.
     *
     * @return the value
     */
    public String getTimezone() {
        return timezone;
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
        sb.append("DesktopSchedule(");
        sb.append("super=").append(super.toString());
        sb.append("cronExpression=").append(String.valueOf(this.cronExpression));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DesktopSchedule)) {
            return false;
        }

        DesktopSchedule other = (DesktopSchedule) o;
        return java.util.Objects.equals(this.cronExpression, other.cronExpression)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.cronExpression == null ? 43 : this.cronExpression.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
