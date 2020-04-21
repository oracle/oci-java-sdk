/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The configuration details for suppressing an alarm.
 * For information about alarms, see [Alarms Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#AlarmsOverview).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Suppression.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Suppression {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFrom")
        private java.util.Date timeSuppressFrom;

        public Builder timeSuppressFrom(java.util.Date timeSuppressFrom) {
            this.timeSuppressFrom = timeSuppressFrom;
            this.__explicitlySet__.add("timeSuppressFrom");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressUntil")
        private java.util.Date timeSuppressUntil;

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

    /**
     * Human-readable reason for suppressing alarm notifications.
     * It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Oracle recommends including tracking information for the event or associated work,
     * such as a ticket number.
     * <p>
     * Example: `Planned outage due to change IT-1234.`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The start date and time for the suppression to take place, inclusive. Format defined by RFC3339.
     * <p>
     * Example: `2019-02-01T01:02:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFrom")
    java.util.Date timeSuppressFrom;

    /**
     * The end date and time for the suppression to take place, inclusive. Format defined by RFC3339.
     * <p>
     * Example: `2019-02-01T02:02:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressUntil")
    java.util.Date timeSuppressUntil;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
