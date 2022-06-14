/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The number of findings in the SQL Tuning Advisor summary report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningAdvisorTaskSummaryFindingCounts.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningAdvisorTaskSummaryFindingCounts {
    @Deprecated
    @java.beans.ConstructorProperties({
        "recommendedSqlProfile",
        "implementedSqlProfile",
        "index",
        "restructure",
        "statistics",
        "alternatePlan"
    })
    public SqlTuningAdvisorTaskSummaryFindingCounts(
            Integer recommendedSqlProfile,
            Integer implementedSqlProfile,
            Integer index,
            Integer restructure,
            Integer statistics,
            Integer alternatePlan) {
        super();
        this.recommendedSqlProfile = recommendedSqlProfile;
        this.implementedSqlProfile = implementedSqlProfile;
        this.index = index;
        this.restructure = restructure;
        this.statistics = statistics;
        this.alternatePlan = alternatePlan;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of distinct SQL statements with recommended SQL profiles.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedSqlProfile")
        private Integer recommendedSqlProfile;

        /**
         * The number of distinct SQL statements with recommended SQL profiles.
         * @param recommendedSqlProfile the value to set
         * @return this builder
         **/
        public Builder recommendedSqlProfile(Integer recommendedSqlProfile) {
            this.recommendedSqlProfile = recommendedSqlProfile;
            this.__explicitlySet__.add("recommendedSqlProfile");
            return this;
        }
        /**
         * The number of distinct SQL statements with implemented SQL profiles.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("implementedSqlProfile")
        private Integer implementedSqlProfile;

        /**
         * The number of distinct SQL statements with implemented SQL profiles.
         * @param implementedSqlProfile the value to set
         * @return this builder
         **/
        public Builder implementedSqlProfile(Integer implementedSqlProfile) {
            this.implementedSqlProfile = implementedSqlProfile;
            this.__explicitlySet__.add("implementedSqlProfile");
            return this;
        }
        /**
         * The number of distinct SQL statements with index recommendations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("index")
        private Integer index;

        /**
         * The number of distinct SQL statements with index recommendations.
         * @param index the value to set
         * @return this builder
         **/
        public Builder index(Integer index) {
            this.index = index;
            this.__explicitlySet__.add("index");
            return this;
        }
        /**
         * The number of distinct SQL statements with restructured SQL recommendations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("restructure")
        private Integer restructure;

        /**
         * The number of distinct SQL statements with restructured SQL recommendations.
         * @param restructure the value to set
         * @return this builder
         **/
        public Builder restructure(Integer restructure) {
            this.restructure = restructure;
            this.__explicitlySet__.add("restructure");
            return this;
        }
        /**
         * The number of distinct SQL statements with stale or missing optimizer statistics recommendations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private Integer statistics;

        /**
         * The number of distinct SQL statements with stale or missing optimizer statistics recommendations.
         * @param statistics the value to set
         * @return this builder
         **/
        public Builder statistics(Integer statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
            return this;
        }
        /**
         * The number of distinct SQL statements with alternative plan recommendations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alternatePlan")
        private Integer alternatePlan;

        /**
         * The number of distinct SQL statements with alternative plan recommendations.
         * @param alternatePlan the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The number of distinct SQL statements with recommended SQL profiles.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedSqlProfile")
    private final Integer recommendedSqlProfile;

    /**
     * The number of distinct SQL statements with recommended SQL profiles.
     * @return the value
     **/
    public Integer getRecommendedSqlProfile() {
        return recommendedSqlProfile;
    }

    /**
     * The number of distinct SQL statements with implemented SQL profiles.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("implementedSqlProfile")
    private final Integer implementedSqlProfile;

    /**
     * The number of distinct SQL statements with implemented SQL profiles.
     * @return the value
     **/
    public Integer getImplementedSqlProfile() {
        return implementedSqlProfile;
    }

    /**
     * The number of distinct SQL statements with index recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("index")
    private final Integer index;

    /**
     * The number of distinct SQL statements with index recommendations.
     * @return the value
     **/
    public Integer getIndex() {
        return index;
    }

    /**
     * The number of distinct SQL statements with restructured SQL recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("restructure")
    private final Integer restructure;

    /**
     * The number of distinct SQL statements with restructured SQL recommendations.
     * @return the value
     **/
    public Integer getRestructure() {
        return restructure;
    }

    /**
     * The number of distinct SQL statements with stale or missing optimizer statistics recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    private final Integer statistics;

    /**
     * The number of distinct SQL statements with stale or missing optimizer statistics recommendations.
     * @return the value
     **/
    public Integer getStatistics() {
        return statistics;
    }

    /**
     * The number of distinct SQL statements with alternative plan recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alternatePlan")
    private final Integer alternatePlan;

    /**
     * The number of distinct SQL statements with alternative plan recommendations.
     * @return the value
     **/
    public Integer getAlternatePlan() {
        return alternatePlan;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlTuningAdvisorTaskSummaryFindingCounts(");
        sb.append("recommendedSqlProfile=").append(String.valueOf(this.recommendedSqlProfile));
        sb.append(", implementedSqlProfile=").append(String.valueOf(this.implementedSqlProfile));
        sb.append(", index=").append(String.valueOf(this.index));
        sb.append(", restructure=").append(String.valueOf(this.restructure));
        sb.append(", statistics=").append(String.valueOf(this.statistics));
        sb.append(", alternatePlan=").append(String.valueOf(this.alternatePlan));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskSummaryFindingCounts)) {
            return false;
        }

        SqlTuningAdvisorTaskSummaryFindingCounts other =
                (SqlTuningAdvisorTaskSummaryFindingCounts) o;
        return java.util.Objects.equals(this.recommendedSqlProfile, other.recommendedSqlProfile)
                && java.util.Objects.equals(this.implementedSqlProfile, other.implementedSqlProfile)
                && java.util.Objects.equals(this.index, other.index)
                && java.util.Objects.equals(this.restructure, other.restructure)
                && java.util.Objects.equals(this.statistics, other.statistics)
                && java.util.Objects.equals(this.alternatePlan, other.alternatePlan)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.recommendedSqlProfile == null
                                ? 43
                                : this.recommendedSqlProfile.hashCode());
        result =
                (result * PRIME)
                        + (this.implementedSqlProfile == null
                                ? 43
                                : this.implementedSqlProfile.hashCode());
        result = (result * PRIME) + (this.index == null ? 43 : this.index.hashCode());
        result = (result * PRIME) + (this.restructure == null ? 43 : this.restructure.hashCode());
        result = (result * PRIME) + (this.statistics == null ? 43 : this.statistics.hashCode());
        result =
                (result * PRIME)
                        + (this.alternatePlan == null ? 43 : this.alternatePlan.hashCode());
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
