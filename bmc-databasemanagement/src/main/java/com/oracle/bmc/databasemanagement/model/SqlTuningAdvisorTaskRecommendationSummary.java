/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A recommendation for a given object in a SQL Tuning Task.
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
    builder = SqlTuningAdvisorTaskRecommendationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskRecommendationSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
        private Long sqlTuningAdvisorTaskId;

        public Builder sqlTuningAdvisorTaskId(Long sqlTuningAdvisorTaskId) {
            this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            this.__explicitlySet__.add("sqlTuningAdvisorTaskId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectId")
        private Long sqlTuningAdvisorTaskObjectId;

        public Builder sqlTuningAdvisorTaskObjectId(Long sqlTuningAdvisorTaskObjectId) {
            this.sqlTuningAdvisorTaskObjectId = sqlTuningAdvisorTaskObjectId;
            this.__explicitlySet__.add("sqlTuningAdvisorTaskObjectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationKey")
        private Integer recommendationKey;

        public Builder recommendationKey(Integer recommendationKey) {
            this.recommendationKey = recommendationKey;
            this.__explicitlySet__.add("recommendationKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationType")
        private RecommendationType recommendationType;

        public Builder recommendationType(RecommendationType recommendationType) {
            this.recommendationType = recommendationType;
            this.__explicitlySet__.add("recommendationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("finding")
        private String finding;

        public Builder finding(String finding) {
            this.finding = finding;
            this.__explicitlySet__.add("finding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rationale")
        private String rationale;

        public Builder rationale(String rationale) {
            this.rationale = rationale;
            this.__explicitlySet__.add("rationale");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("benefit")
        private Float benefit;

        public Builder benefit(Float benefit) {
            this.benefit = benefit;
            this.__explicitlySet__.add("benefit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("implementActionSql")
        private String implementActionSql;

        public Builder implementActionSql(String implementActionSql) {
            this.implementActionSql = implementActionSql;
            this.__explicitlySet__.add("implementActionSql");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskRecommendationSummary build() {
            SqlTuningAdvisorTaskRecommendationSummary __instance__ =
                    new SqlTuningAdvisorTaskRecommendationSummary(
                            sqlTuningAdvisorTaskId,
                            sqlTuningAdvisorTaskObjectId,
                            recommendationKey,
                            recommendationType,
                            finding,
                            recommendation,
                            rationale,
                            benefit,
                            implementActionSql);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskRecommendationSummary o) {
            Builder copiedBuilder =
                    sqlTuningAdvisorTaskId(o.getSqlTuningAdvisorTaskId())
                            .sqlTuningAdvisorTaskObjectId(o.getSqlTuningAdvisorTaskObjectId())
                            .recommendationKey(o.getRecommendationKey())
                            .recommendationType(o.getRecommendationType())
                            .finding(o.getFinding())
                            .recommendation(o.getRecommendation())
                            .rationale(o.getRationale())
                            .benefit(o.getBenefit())
                            .implementActionSql(o.getImplementActionSql());

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
     * The unique identifier of the task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
    Long sqlTuningAdvisorTaskId;

    /**
     * The key of the object to which these recommendations apply. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectId")
    Long sqlTuningAdvisorTaskObjectId;

    /**
     * The unique identifier of the recommendation in the scope of the task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationKey")
    Integer recommendationKey;
    /**
     * Type of recommendation.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RecommendationType {
        Statistics("STATISTICS"),
        Index("INDEX"),
        SqlProfile("SQL_PROFILE"),
        RestructureSql("RESTRUCTURE_SQL"),
        AlternativePlans("ALTERNATIVE_PLANS"),
        Error("ERROR"),
        Miscellaneous("MISCELLANEOUS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RecommendationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RecommendationType v : RecommendationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RecommendationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecommendationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RecommendationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationType")
    RecommendationType recommendationType;

    /**
     * Summary of the issue found in the SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("finding")
    String finding;

    /**
     * The recommendation for a specific finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    String recommendation;

    /**
     * Describes the reasoning behind the recommendation and how it relates to the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rationale")
    String rationale;

    /**
     * The percentage benefit of this implementation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("benefit")
    Float benefit;

    /**
     * Action sql to be implemented based on the recommendation result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("implementActionSql")
    String implementActionSql;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
