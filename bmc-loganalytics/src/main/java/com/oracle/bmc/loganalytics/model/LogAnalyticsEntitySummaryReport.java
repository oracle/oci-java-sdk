/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Log-Analytics entity counts summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEntitySummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsEntitySummaryReport {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("activeEntitiesCount")
        private Integer activeEntitiesCount;

        public Builder activeEntitiesCount(Integer activeEntitiesCount) {
            this.activeEntitiesCount = activeEntitiesCount;
            this.__explicitlySet__.add("activeEntitiesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithHasLogsCollectedCount")
        private Integer entitiesWithHasLogsCollectedCount;

        public Builder entitiesWithHasLogsCollectedCount(
                Integer entitiesWithHasLogsCollectedCount) {
            this.entitiesWithHasLogsCollectedCount = entitiesWithHasLogsCollectedCount;
            this.__explicitlySet__.add("entitiesWithHasLogsCollectedCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithManagementAgentCount")
        private Integer entitiesWithManagementAgentCount;

        public Builder entitiesWithManagementAgentCount(Integer entitiesWithManagementAgentCount) {
            this.entitiesWithManagementAgentCount = entitiesWithManagementAgentCount;
            this.__explicitlySet__.add("entitiesWithManagementAgentCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEntitySummaryReport build() {
            LogAnalyticsEntitySummaryReport __instance__ =
                    new LogAnalyticsEntitySummaryReport(
                            activeEntitiesCount,
                            entitiesWithHasLogsCollectedCount,
                            entitiesWithManagementAgentCount,
                            compartmentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEntitySummaryReport o) {
            Builder copiedBuilder =
                    activeEntitiesCount(o.getActiveEntitiesCount())
                            .entitiesWithHasLogsCollectedCount(
                                    o.getEntitiesWithHasLogsCollectedCount())
                            .entitiesWithManagementAgentCount(
                                    o.getEntitiesWithManagementAgentCount())
                            .compartmentId(o.getCompartmentId());

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
     * Total number of ACTIVE entities
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeEntitiesCount")
    Integer activeEntitiesCount;

    /**
     * Entities with log collection enabled
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithHasLogsCollectedCount")
    Integer entitiesWithHasLogsCollectedCount;

    /**
     * Entities with management agent
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithManagementAgentCount")
    Integer entitiesWithManagementAgentCount;

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
