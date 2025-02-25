/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
public final class LogAnalyticsEntitySummaryReport
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * Total number of ACTIVE entities
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activeEntitiesCount")
        private Integer activeEntitiesCount;

        /**
         * Total number of ACTIVE entities
         *
         * @param activeEntitiesCount the value to set
         * @return this builder
         **/
        public Builder activeEntitiesCount(Integer activeEntitiesCount) {
            this.activeEntitiesCount = activeEntitiesCount;
            this.__explicitlySet__.add("activeEntitiesCount");
            return this;
        }
        /**
         * Entities with log collection enabled
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithHasLogsCollectedCount")
        private Integer entitiesWithHasLogsCollectedCount;

        /**
         * Entities with log collection enabled
         *
         * @param entitiesWithHasLogsCollectedCount the value to set
         * @return this builder
         **/
        public Builder entitiesWithHasLogsCollectedCount(
                Integer entitiesWithHasLogsCollectedCount) {
            this.entitiesWithHasLogsCollectedCount = entitiesWithHasLogsCollectedCount;
            this.__explicitlySet__.add("entitiesWithHasLogsCollectedCount");
            return this;
        }
        /**
         * Entities with management agent
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithManagementAgentCount")
        private Integer entitiesWithManagementAgentCount;

        /**
         * Entities with management agent
         *
         * @param entitiesWithManagementAgentCount the value to set
         * @return this builder
         **/
        public Builder entitiesWithManagementAgentCount(Integer entitiesWithManagementAgentCount) {
            this.entitiesWithManagementAgentCount = entitiesWithManagementAgentCount;
            this.__explicitlySet__.add("entitiesWithManagementAgentCount");
            return this;
        }
        /**
         * Compartment Identifier [OCID] (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID] (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEntitySummaryReport build() {
            LogAnalyticsEntitySummaryReport model =
                    new LogAnalyticsEntitySummaryReport(
                            this.activeEntitiesCount,
                            this.entitiesWithHasLogsCollectedCount,
                            this.entitiesWithManagementAgentCount,
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEntitySummaryReport model) {
            if (model.wasPropertyExplicitlySet("activeEntitiesCount")) {
                this.activeEntitiesCount(model.getActiveEntitiesCount());
            }
            if (model.wasPropertyExplicitlySet("entitiesWithHasLogsCollectedCount")) {
                this.entitiesWithHasLogsCollectedCount(
                        model.getEntitiesWithHasLogsCollectedCount());
            }
            if (model.wasPropertyExplicitlySet("entitiesWithManagementAgentCount")) {
                this.entitiesWithManagementAgentCount(model.getEntitiesWithManagementAgentCount());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
     * Total number of ACTIVE entities
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeEntitiesCount")
    private final Integer activeEntitiesCount;

    /**
     * Total number of ACTIVE entities
     *
     * @return the value
     **/
    public Integer getActiveEntitiesCount() {
        return activeEntitiesCount;
    }

    /**
     * Entities with log collection enabled
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithHasLogsCollectedCount")
    private final Integer entitiesWithHasLogsCollectedCount;

    /**
     * Entities with log collection enabled
     *
     * @return the value
     **/
    public Integer getEntitiesWithHasLogsCollectedCount() {
        return entitiesWithHasLogsCollectedCount;
    }

    /**
     * Entities with management agent
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesWithManagementAgentCount")
    private final Integer entitiesWithManagementAgentCount;

    /**
     * Entities with management agent
     *
     * @return the value
     **/
    public Integer getEntitiesWithManagementAgentCount() {
        return entitiesWithManagementAgentCount;
    }

    /**
     * Compartment Identifier [OCID] (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID] (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("LogAnalyticsEntitySummaryReport(");
        sb.append("super=").append(super.toString());
        sb.append("activeEntitiesCount=").append(String.valueOf(this.activeEntitiesCount));
        sb.append(", entitiesWithHasLogsCollectedCount=")
                .append(String.valueOf(this.entitiesWithHasLogsCollectedCount));
        sb.append(", entitiesWithManagementAgentCount=")
                .append(String.valueOf(this.entitiesWithManagementAgentCount));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
