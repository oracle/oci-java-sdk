/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The finding counts data for the SQL Tuning Advisor summary report.
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
    builder = SqlTuningAdvisorTaskSummaryFindingCounts.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskSummaryFindingCounts {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedSqlProfile")
        private Integer recommendedSqlProfile;

        public Builder recommendedSqlProfile(Integer recommendedSqlProfile) {
            this.recommendedSqlProfile = recommendedSqlProfile;
            this.__explicitlySet__.add("recommendedSqlProfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("implementedSqlProfile")
        private Integer implementedSqlProfile;

        public Builder implementedSqlProfile(Integer implementedSqlProfile) {
            this.implementedSqlProfile = implementedSqlProfile;
            this.__explicitlySet__.add("implementedSqlProfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("index")
        private Integer index;

        public Builder index(Integer index) {
            this.index = index;
            this.__explicitlySet__.add("index");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("restructure")
        private Integer restructure;

        public Builder restructure(Integer restructure) {
            this.restructure = restructure;
            this.__explicitlySet__.add("restructure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private Integer statistics;

        public Builder statistics(Integer statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alternatePlan")
        private Integer alternatePlan;

        public Builder alternatePlan(Integer alternatePlan) {
            this.alternatePlan = alternatePlan;
            this.__explicitlySet__.add("alternatePlan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryFindingCounts build() {
            SqlTuningAdvisorTaskSummaryFindingCounts __instance__ =
                    new SqlTuningAdvisorTaskSummaryFindingCounts(
                            recommendedSqlProfile,
                            implementedSqlProfile,
                            index,
                            restructure,
                            statistics,
                            alternatePlan);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryFindingCounts o) {
            Builder copiedBuilder =
                    recommendedSqlProfile(o.getRecommendedSqlProfile())
                            .implementedSqlProfile(o.getImplementedSqlProfile())
                            .index(o.getIndex())
                            .restructure(o.getRestructure())
                            .statistics(o.getStatistics())
                            .alternatePlan(o.getAlternatePlan());

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
     * The count of distinct SQL statements with recommended SQL profiles.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedSqlProfile")
    Integer recommendedSqlProfile;

    /**
     * The count of distinct SQL statements with implemented SQL profiles.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("implementedSqlProfile")
    Integer implementedSqlProfile;

    /**
     * The count of distinct SQL statements with index recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("index")
    Integer index;

    /**
     * The count of distinct SQL statements with restructure SQL recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("restructure")
    Integer restructure;

    /**
     * The count of distinct SQL statements with stale/missing optimizer statistics recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    Integer statistics;

    /**
     * The count of distinct SQL statements with alternative plan recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alternatePlan")
    Integer alternatePlan;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
