/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The configuration details for suppressing an alarm.
 * For information about alarms, see [Alarms Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#AlarmsOverview).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Suppression.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Suppression {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "timeSuppressFrom", "timeSuppressUntil"})
    public Suppression(
            String description, java.util.Date timeSuppressFrom, java.util.Date timeSuppressUntil) {
        super();
        this.description = description;
        this.timeSuppressFrom = timeSuppressFrom;
        this.timeSuppressUntil = timeSuppressUntil;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Human-readable reason for suppressing alarm notifications.
         * It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Oracle recommends including tracking information for the event or associated work,
         * such as a ticket number.
         * <p>
         * Example: {@code Planned outage due to change IT-1234.}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Human-readable reason for suppressing alarm notifications.
         * It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Oracle recommends including tracking information for the event or associated work,
         * such as a ticket number.
         * <p>
         * Example: {@code Planned outage due to change IT-1234.}
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The start date and time for the suppression to take place, inclusive. Format defined by RFC3339.
         * <p>
         * Example: {@code 2019-02-01T01:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFrom")
        private java.util.Date timeSuppressFrom;

        /**
         * The start date and time for the suppression to take place, inclusive. Format defined by RFC3339.
         * <p>
         * Example: {@code 2019-02-01T01:02:29.600Z}
         *
         * @param timeSuppressFrom the value to set
         * @return this builder
         **/
        public Builder timeSuppressFrom(java.util.Date timeSuppressFrom) {
            this.timeSuppressFrom = timeSuppressFrom;
            this.__explicitlySet__.add("timeSuppressFrom");
            return this;
        }
        /**
         * The end date and time for the suppression to take place, inclusive. Format defined by RFC3339.
         * <p>
         * Example: {@code 2019-02-01T02:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressUntil")
        private java.util.Date timeSuppressUntil;

        /**
         * The end date and time for the suppression to take place, inclusive. Format defined by RFC3339.
         * <p>
         * Example: {@code 2019-02-01T02:02:29.600Z}
         *
         * @param timeSuppressUntil the value to set
         * @return this builder
         **/
        public Builder timeSuppressUntil(java.util.Date timeSuppressUntil) {
            this.timeSuppressUntil = timeSuppressUntil;
            this.__explicitlySet__.add("timeSuppressUntil");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Suppression build() {
            Suppression __instance__ =
                    new Suppression(description, timeSuppressFrom, timeSuppressUntil);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Suppression o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .timeSuppressFrom(o.getTimeSuppressFrom())
                            .timeSuppressUntil(o.getTimeSuppressUntil());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Human-readable reason for suppressing alarm notifications.
     * It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Oracle recommends including tracking information for the event or associated work,
     * such as a ticket number.
     * <p>
     * Example: {@code Planned outage due to change IT-1234.}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Human-readable reason for suppressing alarm notifications.
     * It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Oracle recommends including tracking information for the event or associated work,
     * such as a ticket number.
     * <p>
     * Example: {@code Planned outage due to change IT-1234.}
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The start date and time for the suppression to take place, inclusive. Format defined by RFC3339.
     * <p>
     * Example: {@code 2019-02-01T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFrom")
    private final java.util.Date timeSuppressFrom;

    /**
     * The start date and time for the suppression to take place, inclusive. Format defined by RFC3339.
     * <p>
     * Example: {@code 2019-02-01T01:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeSuppressFrom() {
        return timeSuppressFrom;
    }

    /**
     * The end date and time for the suppression to take place, inclusive. Format defined by RFC3339.
     * <p>
     * Example: {@code 2019-02-01T02:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressUntil")
    private final java.util.Date timeSuppressUntil;

    /**
     * The end date and time for the suppression to take place, inclusive. Format defined by RFC3339.
     * <p>
     * Example: {@code 2019-02-01T02:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeSuppressUntil() {
        return timeSuppressUntil;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Suppression(");
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", timeSuppressFrom=").append(String.valueOf(this.timeSuppressFrom));
        sb.append(", timeSuppressUntil=").append(String.valueOf(this.timeSuppressUntil));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Suppression)) {
            return false;
        }

        Suppression other = (Suppression) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeSuppressFrom, other.timeSuppressFrom)
                && java.util.Objects.equals(this.timeSuppressUntil, other.timeSuppressUntil)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSuppressFrom == null ? 43 : this.timeSuppressFrom.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSuppressUntil == null ? 43 : this.timeSuppressUntil.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
