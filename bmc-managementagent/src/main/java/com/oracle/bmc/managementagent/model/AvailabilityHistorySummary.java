/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Availability history of Management Agent.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AvailabilityHistorySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AvailabilityHistorySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
        private AvailabilityStatus availabilityStatus;

        public Builder availabilityStatus(AvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            this.__explicitlySet__.add("availabilityStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAvailabilityStatusStarted")
        private java.util.Date timeAvailabilityStatusStarted;

        public Builder timeAvailabilityStatusStarted(java.util.Date timeAvailabilityStatusStarted) {
            this.timeAvailabilityStatusStarted = timeAvailabilityStatusStarted;
            this.__explicitlySet__.add("timeAvailabilityStatusStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAvailabilityStatusEnded")
        private java.util.Date timeAvailabilityStatusEnded;

        public Builder timeAvailabilityStatusEnded(java.util.Date timeAvailabilityStatusEnded) {
            this.timeAvailabilityStatusEnded = timeAvailabilityStatusEnded;
            this.__explicitlySet__.add("timeAvailabilityStatusEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailabilityHistorySummary build() {
            AvailabilityHistorySummary __instance__ =
                    new AvailabilityHistorySummary(
                            managementAgentId,
                            availabilityStatus,
                            timeAvailabilityStatusStarted,
                            timeAvailabilityStatusEnded);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailabilityHistorySummary o) {
            Builder copiedBuilder =
                    managementAgentId(o.getManagementAgentId())
                            .availabilityStatus(o.getAvailabilityStatus())
                            .timeAvailabilityStatusStarted(o.getTimeAvailabilityStatusStarted())
                            .timeAvailabilityStatusEnded(o.getTimeAvailabilityStatusEnded());

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
     * agent identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    String managementAgentId;

    /**
     * The availability status of managementAgent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
    AvailabilityStatus availabilityStatus;

    /**
     * The time at which the Management Agent moved to the availability status. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAvailabilityStatusStarted")
    java.util.Date timeAvailabilityStatusStarted;

    /**
     * The time till which the Management Agent was known to be in the availability status. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAvailabilityStatusEnded")
    java.util.Date timeAvailabilityStatusEnded;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
