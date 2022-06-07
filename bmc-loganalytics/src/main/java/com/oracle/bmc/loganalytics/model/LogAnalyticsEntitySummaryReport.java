/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEntitySummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsEntitySummaryReport {
    @Deprecated
    @java.beans.ConstructorProperties({
        "activeEntitiesCount",
        "entitiesWithHasLogsCollectedCount",
        "entitiesWithManagementAgentCount",
        "compartmentId"
    })
    public LogAnalyticsEntitySummaryReport(
            Integer activeEntitiesCount,
            Integer entitiesWithHasLogsCollectedCount,
            Integer entitiesWithManagementAgentCount,
            String compartmentId) {
        super();
        this.activeEntitiesCount = activeEntitiesCount;
        this.entitiesWithHasLogsCollectedCount = entitiesWithHasLogsCollectedCount;
        this.entitiesWithManagementAgentCount = entitiesWithManagementAgentCount;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Total number of ACTIVE entities
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeEntitiesCount")
    private final Integer activeEntitiesCount;

    public Integer getActiveEntitiesCount() {
        return activeEntitiesCount;
    }

    /**
     * Entities with log collection enabled
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithHasLogsCollectedCount")
    private final Integer entitiesWithHasLogsCollectedCount;

    public Integer getEntitiesWithHasLogsCollectedCount() {
        return entitiesWithHasLogsCollectedCount;
    }

    /**
     * Entities with management agent
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithManagementAgentCount")
    private final Integer entitiesWithManagementAgentCount;

    public Integer getEntitiesWithManagementAgentCount() {
        return entitiesWithManagementAgentCount;
    }

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsEntitySummaryReport(");
        sb.append("activeEntitiesCount=").append(String.valueOf(this.activeEntitiesCount));
        sb.append(", entitiesWithHasLogsCollectedCount=")
                .append(String.valueOf(this.entitiesWithHasLogsCollectedCount));
        sb.append(", entitiesWithManagementAgentCount=")
                .append(String.valueOf(this.entitiesWithManagementAgentCount));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsEntitySummaryReport)) {
            return false;
        }

        LogAnalyticsEntitySummaryReport other = (LogAnalyticsEntitySummaryReport) o;
        return java.util.Objects.equals(this.activeEntitiesCount, other.activeEntitiesCount)
                && java.util.Objects.equals(
                        this.entitiesWithHasLogsCollectedCount,
                        other.entitiesWithHasLogsCollectedCount)
                && java.util.Objects.equals(
                        this.entitiesWithManagementAgentCount,
                        other.entitiesWithManagementAgentCount)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.activeEntitiesCount == null
                                ? 43
                                : this.activeEntitiesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.entitiesWithHasLogsCollectedCount == null
                                ? 43
                                : this.entitiesWithHasLogsCollectedCount.hashCode());
        result =
                (result * PRIME)
                        + (this.entitiesWithManagementAgentCount == null
                                ? 43
                                : this.entitiesWithManagementAgentCount.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
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
