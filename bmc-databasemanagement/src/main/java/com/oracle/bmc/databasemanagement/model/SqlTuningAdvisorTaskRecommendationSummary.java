/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningAdvisorTaskRecommendationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningAdvisorTaskRecommendationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlTuningAdvisorTaskId",
        "sqlTuningAdvisorTaskObjectId",
        "recommendationKey",
        "recommendationType",
        "finding",
        "recommendation",
        "rationale",
        "benefit",
        "implementActionSql",
        "isParallelExecution"
    })
    public SqlTuningAdvisorTaskRecommendationSummary(
            Long sqlTuningAdvisorTaskId,
            Long sqlTuningAdvisorTaskObjectId,
            Integer recommendationKey,
            RecommendationType recommendationType,
            String finding,
            String recommendation,
            String rationale,
            Float benefit,
            String implementActionSql,
            Boolean isParallelExecution) {
        super();
        this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
        this.sqlTuningAdvisorTaskObjectId = sqlTuningAdvisorTaskObjectId;
        this.recommendationKey = recommendationKey;
        this.recommendationType = recommendationType;
        this.finding = finding;
        this.recommendation = recommendation;
        this.rationale = rationale;
        this.benefit = benefit;
        this.implementActionSql = implementActionSql;
        this.isParallelExecution = isParallelExecution;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
        private Long sqlTuningAdvisorTaskId;

        /**
         * The unique identifier of the task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param sqlTuningAdvisorTaskId the value to set
         * @return this builder
         **/
        public Builder sqlTuningAdvisorTaskId(Long sqlTuningAdvisorTaskId) {
            this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            this.__explicitlySet__.add("sqlTuningAdvisorTaskId");
            return this;
        }
        /**
         * The key of the object to which these recommendations apply. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectId")
        private Long sqlTuningAdvisorTaskObjectId;

        /**
         * The key of the object to which these recommendations apply. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param sqlTuningAdvisorTaskObjectId the value to set
         * @return this builder
         **/
        public Builder sqlTuningAdvisorTaskObjectId(Long sqlTuningAdvisorTaskObjectId) {
            this.sqlTuningAdvisorTaskObjectId = sqlTuningAdvisorTaskObjectId;
            this.__explicitlySet__.add("sqlTuningAdvisorTaskObjectId");
            return this;
        }
        /**
         * The unique identifier of the recommendation in the scope of the task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationKey")
        private Integer recommendationKey;

        /**
         * The unique identifier of the recommendation in the scope of the task.
         * @param recommendationKey the value to set
         * @return this builder
         **/
        public Builder recommendationKey(Integer recommendationKey) {
            this.recommendationKey = recommendationKey;
            this.__explicitlySet__.add("recommendationKey");
            return this;
        }
        /**
         * Type of recommendation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationType")
        private RecommendationType recommendationType;

        /**
         * Type of recommendation.
         * @param recommendationType the value to set
         * @return this builder
         **/
        public Builder recommendationType(RecommendationType recommendationType) {
            this.recommendationType = recommendationType;
            this.__explicitlySet__.add("recommendationType");
            return this;
        }
        /**
         * Summary of the issue found in the SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("finding")
        private String finding;

        /**
         * Summary of the issue found in the SQL statement.
         * @param finding the value to set
         * @return this builder
         **/
        public Builder finding(String finding) {
            this.finding = finding;
            this.__explicitlySet__.add("finding");
            return this;
        }
        /**
         * The recommendation for a specific finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        /**
         * The recommendation for a specific finding.
         * @param recommendation the value to set
         * @return this builder
         **/
        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }
        /**
         * Describes the reasoning behind the recommendation and how it relates to the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rationale")
        private String rationale;

        /**
         * Describes the reasoning behind the recommendation and how it relates to the finding.
         * @param rationale the value to set
         * @return this builder
         **/
        public Builder rationale(String rationale) {
            this.rationale = rationale;
            this.__explicitlySet__.add("rationale");
            return this;
        }
        /**
         * The percentage benefit of this implementation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("benefit")
        private Float benefit;

        /**
         * The percentage benefit of this implementation.
         * @param benefit the value to set
         * @return this builder
         **/
        public Builder benefit(Float benefit) {
            this.benefit = benefit;
            this.__explicitlySet__.add("benefit");
            return this;
        }
        /**
         * Action sql to be implemented based on the recommendation result.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("implementActionSql")
        private String implementActionSql;

        /**
         * Action sql to be implemented based on the recommendation result.
         * @param implementActionSql the value to set
         * @return this builder
         **/
        public Builder implementActionSql(String implementActionSql) {
            this.implementActionSql = implementActionSql;
            this.__explicitlySet__.add("implementActionSql");
            return this;
        }
        /**
         * Indicates whether a SQL Profile recommendation uses parallel execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isParallelExecution")
        private Boolean isParallelExecution;

        /**
         * Indicates whether a SQL Profile recommendation uses parallel execution.
         * @param isParallelExecution the value to set
         * @return this builder
         **/
        public Builder isParallelExecution(Boolean isParallelExecution) {
            this.isParallelExecution = isParallelExecution;
            this.__explicitlySet__.add("isParallelExecution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskRecommendationSummary build() {
            SqlTuningAdvisorTaskRecommendationSummary model =
                    new SqlTuningAdvisorTaskRecommendationSummary(
                            this.sqlTuningAdvisorTaskId,
                            this.sqlTuningAdvisorTaskObjectId,
                            this.recommendationKey,
                            this.recommendationType,
                            this.finding,
                            this.recommendation,
                            this.rationale,
                            this.benefit,
                            this.implementActionSql,
                            this.isParallelExecution);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskRecommendationSummary model) {
            if (model.wasPropertyExplicitlySet("sqlTuningAdvisorTaskId")) {
                this.sqlTuningAdvisorTaskId(model.getSqlTuningAdvisorTaskId());
            }
            if (model.wasPropertyExplicitlySet("sqlTuningAdvisorTaskObjectId")) {
                this.sqlTuningAdvisorTaskObjectId(model.getSqlTuningAdvisorTaskObjectId());
            }
            if (model.wasPropertyExplicitlySet("recommendationKey")) {
                this.recommendationKey(model.getRecommendationKey());
            }
            if (model.wasPropertyExplicitlySet("recommendationType")) {
                this.recommendationType(model.getRecommendationType());
            }
            if (model.wasPropertyExplicitlySet("finding")) {
                this.finding(model.getFinding());
            }
            if (model.wasPropertyExplicitlySet("recommendation")) {
                this.recommendation(model.getRecommendation());
            }
            if (model.wasPropertyExplicitlySet("rationale")) {
                this.rationale(model.getRationale());
            }
            if (model.wasPropertyExplicitlySet("benefit")) {
                this.benefit(model.getBenefit());
            }
            if (model.wasPropertyExplicitlySet("implementActionSql")) {
                this.implementActionSql(model.getImplementActionSql());
            }
            if (model.wasPropertyExplicitlySet("isParallelExecution")) {
                this.isParallelExecution(model.getIsParallelExecution());
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
     * The unique identifier of the task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
    private final Long sqlTuningAdvisorTaskId;

    /**
     * The unique identifier of the task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public Long getSqlTuningAdvisorTaskId() {
        return sqlTuningAdvisorTaskId;
    }

    /**
     * The key of the object to which these recommendations apply. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectId")
    private final Long sqlTuningAdvisorTaskObjectId;

    /**
     * The key of the object to which these recommendations apply. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     **/
    public Long getSqlTuningAdvisorTaskObjectId() {
        return sqlTuningAdvisorTaskObjectId;
    }

    /**
     * The unique identifier of the recommendation in the scope of the task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationKey")
    private final Integer recommendationKey;

    /**
     * The unique identifier of the recommendation in the scope of the task.
     * @return the value
     **/
    public Integer getRecommendationKey() {
        return recommendationKey;
    }

    /**
     * Type of recommendation.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RecommendationType.class);

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
    private final RecommendationType recommendationType;

    /**
     * Type of recommendation.
     * @return the value
     **/
    public RecommendationType getRecommendationType() {
        return recommendationType;
    }

    /**
     * Summary of the issue found in the SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("finding")
    private final String finding;

    /**
     * Summary of the issue found in the SQL statement.
     * @return the value
     **/
    public String getFinding() {
        return finding;
    }

    /**
     * The recommendation for a specific finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    private final String recommendation;

    /**
     * The recommendation for a specific finding.
     * @return the value
     **/
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * Describes the reasoning behind the recommendation and how it relates to the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rationale")
    private final String rationale;

    /**
     * Describes the reasoning behind the recommendation and how it relates to the finding.
     * @return the value
     **/
    public String getRationale() {
        return rationale;
    }

    /**
     * The percentage benefit of this implementation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("benefit")
    private final Float benefit;

    /**
     * The percentage benefit of this implementation.
     * @return the value
     **/
    public Float getBenefit() {
        return benefit;
    }

    /**
     * Action sql to be implemented based on the recommendation result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("implementActionSql")
    private final String implementActionSql;

    /**
     * Action sql to be implemented based on the recommendation result.
     * @return the value
     **/
    public String getImplementActionSql() {
        return implementActionSql;
    }

    /**
     * Indicates whether a SQL Profile recommendation uses parallel execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isParallelExecution")
    private final Boolean isParallelExecution;

    /**
     * Indicates whether a SQL Profile recommendation uses parallel execution.
     * @return the value
     **/
    public Boolean getIsParallelExecution() {
        return isParallelExecution;
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
        sb.append("SqlTuningAdvisorTaskRecommendationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sqlTuningAdvisorTaskId=").append(String.valueOf(this.sqlTuningAdvisorTaskId));
        sb.append(", sqlTuningAdvisorTaskObjectId=")
                .append(String.valueOf(this.sqlTuningAdvisorTaskObjectId));
        sb.append(", recommendationKey=").append(String.valueOf(this.recommendationKey));
        sb.append(", recommendationType=").append(String.valueOf(this.recommendationType));
        sb.append(", finding=").append(String.valueOf(this.finding));
        sb.append(", recommendation=").append(String.valueOf(this.recommendation));
        sb.append(", rationale=").append(String.valueOf(this.rationale));
        sb.append(", benefit=").append(String.valueOf(this.benefit));
        sb.append(", implementActionSql=").append(String.valueOf(this.implementActionSql));
        sb.append(", isParallelExecution=").append(String.valueOf(this.isParallelExecution));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskRecommendationSummary)) {
            return false;
        }

        SqlTuningAdvisorTaskRecommendationSummary other =
                (SqlTuningAdvisorTaskRecommendationSummary) o;
        return java.util.Objects.equals(this.sqlTuningAdvisorTaskId, other.sqlTuningAdvisorTaskId)
                && java.util.Objects.equals(
                        this.sqlTuningAdvisorTaskObjectId, other.sqlTuningAdvisorTaskObjectId)
                && java.util.Objects.equals(this.recommendationKey, other.recommendationKey)
                && java.util.Objects.equals(this.recommendationType, other.recommendationType)
                && java.util.Objects.equals(this.finding, other.finding)
                && java.util.Objects.equals(this.recommendation, other.recommendation)
                && java.util.Objects.equals(this.rationale, other.rationale)
                && java.util.Objects.equals(this.benefit, other.benefit)
                && java.util.Objects.equals(this.implementActionSql, other.implementActionSql)
                && java.util.Objects.equals(this.isParallelExecution, other.isParallelExecution)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlTuningAdvisorTaskId == null
                                ? 43
                                : this.sqlTuningAdvisorTaskId.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlTuningAdvisorTaskObjectId == null
                                ? 43
                                : this.sqlTuningAdvisorTaskObjectId.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationKey == null ? 43 : this.recommendationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationType == null
                                ? 43
                                : this.recommendationType.hashCode());
        result = (result * PRIME) + (this.finding == null ? 43 : this.finding.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendation == null ? 43 : this.recommendation.hashCode());
        result = (result * PRIME) + (this.rationale == null ? 43 : this.rationale.hashCode());
        result = (result * PRIME) + (this.benefit == null ? 43 : this.benefit.hashCode());
        result =
                (result * PRIME)
                        + (this.implementActionSql == null
                                ? 43
                                : this.implementActionSql.hashCode());
        result =
                (result * PRIME)
                        + (this.isParallelExecution == null
                                ? 43
                                : this.isParallelExecution.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
