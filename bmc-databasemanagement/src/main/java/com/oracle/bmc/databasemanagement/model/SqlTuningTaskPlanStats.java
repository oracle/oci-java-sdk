/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The statistics of an SQL execution plan.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningTaskPlanStats.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningTaskPlanStats {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("planType")
        private String planType;

        public Builder planType(String planType) {
            this.planType = planType;
            this.__explicitlySet__.add("planType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planStats")
        private java.util.Map<String, Double> planStats;

        public Builder planStats(java.util.Map<String, Double> planStats) {
            this.planStats = planStats;
            this.__explicitlySet__.add("planStats");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planStatus")
        private PlanStatus planStatus;

        public Builder planStatus(PlanStatus planStatus) {
            this.planStatus = planStatus;
            this.__explicitlySet__.add("planStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningTaskPlanStats build() {
            SqlTuningTaskPlanStats __instance__ =
                    new SqlTuningTaskPlanStats(planType, planStats, planStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningTaskPlanStats o) {
            Builder copiedBuilder =
                    planType(o.getPlanType())
                            .planStats(o.getPlanStats())
                            .planStatus(o.getPlanStatus());

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
     * The type of the plan for the original or the new plan with profile/index etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planType")
    String planType;

    /**
     * A map contains the statistics for the SQL execution using the plan.
     * The key of the map is the metric's name. The value of the map is the metric's value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planStats")
    java.util.Map<String, Double> planStats;
    /**
     * The status of the execution using the plan.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PlanStatus {
        Complete("COMPLETE"),
        Partial("PARTIAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PlanStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanStatus v : PlanStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlanStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlanStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlanStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the execution using the plan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planStatus")
    PlanStatus planStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
