/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Log-Analytics EM Bridge counts summary.
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
    builder = LogAnalyticsEmBridgeSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsEmBridgeSummaryReport {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("activeEmBridgeCount")
        private Integer activeEmBridgeCount;

        public Builder activeEmBridgeCount(Integer activeEmBridgeCount) {
            this.activeEmBridgeCount = activeEmBridgeCount;
            this.__explicitlySet__.add("activeEmBridgeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creatingEmBridgeCount")
        private Integer creatingEmBridgeCount;

        public Builder creatingEmBridgeCount(Integer creatingEmBridgeCount) {
            this.creatingEmBridgeCount = creatingEmBridgeCount;
            this.__explicitlySet__.add("creatingEmBridgeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("needsAttentionEmBridgeCount")
        private Integer needsAttentionEmBridgeCount;

        public Builder needsAttentionEmBridgeCount(Integer needsAttentionEmBridgeCount) {
            this.needsAttentionEmBridgeCount = needsAttentionEmBridgeCount;
            this.__explicitlySet__.add("needsAttentionEmBridgeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deletedEmBridgeCount")
        private Integer deletedEmBridgeCount;

        public Builder deletedEmBridgeCount(Integer deletedEmBridgeCount) {
            this.deletedEmBridgeCount = deletedEmBridgeCount;
            this.__explicitlySet__.add("deletedEmBridgeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalEmBridgeCount")
        private Integer totalEmBridgeCount;

        public Builder totalEmBridgeCount(Integer totalEmBridgeCount) {
            this.totalEmBridgeCount = totalEmBridgeCount;
            this.__explicitlySet__.add("totalEmBridgeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEmBridgeSummaryReport build() {
            LogAnalyticsEmBridgeSummaryReport __instance__ =
                    new LogAnalyticsEmBridgeSummaryReport(
                            compartmentId,
                            activeEmBridgeCount,
                            creatingEmBridgeCount,
                            needsAttentionEmBridgeCount,
                            deletedEmBridgeCount,
                            totalEmBridgeCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEmBridgeSummaryReport o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .activeEmBridgeCount(o.getActiveEmBridgeCount())
                            .creatingEmBridgeCount(o.getCreatingEmBridgeCount())
                            .needsAttentionEmBridgeCount(o.getNeedsAttentionEmBridgeCount())
                            .deletedEmBridgeCount(o.getDeletedEmBridgeCount())
                            .totalEmBridgeCount(o.getTotalEmBridgeCount());

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
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Total number of ACTIVE enterprise manager bridges.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeEmBridgeCount")
    Integer activeEmBridgeCount;

    /**
     * Number of enterprise manager bridges in CREATING state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("creatingEmBridgeCount")
    Integer creatingEmBridgeCount;

    /**
     * Number of enterprise manager bridges in NEEDS_ATTENTION state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("needsAttentionEmBridgeCount")
    Integer needsAttentionEmBridgeCount;

    /**
     * Number of enterprise manager bridges in DELETED state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deletedEmBridgeCount")
    Integer deletedEmBridgeCount;

    /**
     * Total number of enterprise manager bridges.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalEmBridgeCount")
    Integer totalEmBridgeCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
