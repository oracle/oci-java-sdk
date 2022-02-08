/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of the findings of the objects in a tuning task that match a given filter.
 * This includes the kind of findings that were reported, whether the benefits were analyzed, and the number of benefits obtained.
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
    builder = SqlTuningAdvisorTaskFindingSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskFindingSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectExecutionId")
        private Long sqlTuningAdvisorTaskObjectExecutionId;

        public Builder sqlTuningAdvisorTaskObjectExecutionId(
                Long sqlTuningAdvisorTaskObjectExecutionId) {
            this.sqlTuningAdvisorTaskObjectExecutionId = sqlTuningAdvisorTaskObjectExecutionId;
            this.__explicitlySet__.add("sqlTuningAdvisorTaskObjectExecutionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parsingSchema")
        private String parsingSchema;

        public Builder parsingSchema(String parsingSchema) {
            this.parsingSchema = parsingSchema;
            this.__explicitlySet__.add("parsingSchema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlKey")
        private String sqlKey;

        public Builder sqlKey(String sqlKey) {
            this.sqlKey = sqlKey;
            this.__explicitlySet__.add("sqlKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbTimeBenefit")
        private Float dbTimeBenefit;

        public Builder dbTimeBenefit(Float dbTimeBenefit) {
            this.dbTimeBenefit = dbTimeBenefit;
            this.__explicitlySet__.add("dbTimeBenefit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("perExecutionPercentage")
        private Integer perExecutionPercentage;

        public Builder perExecutionPercentage(Integer perExecutionPercentage) {
            this.perExecutionPercentage = perExecutionPercentage;
            this.__explicitlySet__.add("perExecutionPercentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isStatsFindingPresent")
        private Boolean isStatsFindingPresent;

        public Builder isStatsFindingPresent(Boolean isStatsFindingPresent) {
            this.isStatsFindingPresent = isStatsFindingPresent;
            this.__explicitlySet__.add("isStatsFindingPresent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSqlProfileFindingPresent")
        private Boolean isSqlProfileFindingPresent;

        public Builder isSqlProfileFindingPresent(Boolean isSqlProfileFindingPresent) {
            this.isSqlProfileFindingPresent = isSqlProfileFindingPresent;
            this.__explicitlySet__.add("isSqlProfileFindingPresent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSqlProfileFindingImplemented")
        private Boolean isSqlProfileFindingImplemented;

        public Builder isSqlProfileFindingImplemented(Boolean isSqlProfileFindingImplemented) {
            this.isSqlProfileFindingImplemented = isSqlProfileFindingImplemented;
            this.__explicitlySet__.add("isSqlProfileFindingImplemented");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIndexFindingPresent")
        private Boolean isIndexFindingPresent;

        public Builder isIndexFindingPresent(Boolean isIndexFindingPresent) {
            this.isIndexFindingPresent = isIndexFindingPresent;
            this.__explicitlySet__.add("isIndexFindingPresent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRestructureSqlFindingPresent")
        private Boolean isRestructureSqlFindingPresent;

        public Builder isRestructureSqlFindingPresent(Boolean isRestructureSqlFindingPresent) {
            this.isRestructureSqlFindingPresent = isRestructureSqlFindingPresent;
            this.__explicitlySet__.add("isRestructureSqlFindingPresent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAlternativePlanFindingPresent")
        private Boolean isAlternativePlanFindingPresent;

        public Builder isAlternativePlanFindingPresent(Boolean isAlternativePlanFindingPresent) {
            this.isAlternativePlanFindingPresent = isAlternativePlanFindingPresent;
            this.__explicitlySet__.add("isAlternativePlanFindingPresent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMiscellaneousFindingPresent")
        private Boolean isMiscellaneousFindingPresent;

        public Builder isMiscellaneousFindingPresent(Boolean isMiscellaneousFindingPresent) {
            this.isMiscellaneousFindingPresent = isMiscellaneousFindingPresent;
            this.__explicitlySet__.add("isMiscellaneousFindingPresent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isErrorFindingPresent")
        private Boolean isErrorFindingPresent;

        public Builder isErrorFindingPresent(Boolean isErrorFindingPresent) {
            this.isErrorFindingPresent = isErrorFindingPresent;
            this.__explicitlySet__.add("isErrorFindingPresent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTimeoutFindingPresent")
        private Boolean isTimeoutFindingPresent;

        public Builder isTimeoutFindingPresent(Boolean isTimeoutFindingPresent) {
            this.isTimeoutFindingPresent = isTimeoutFindingPresent;
            this.__explicitlySet__.add("isTimeoutFindingPresent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskFindingSummary build() {
            SqlTuningAdvisorTaskFindingSummary __instance__ =
                    new SqlTuningAdvisorTaskFindingSummary(
                            sqlTuningAdvisorTaskId,
                            sqlTuningAdvisorTaskObjectId,
                            sqlTuningAdvisorTaskObjectExecutionId,
                            sqlText,
                            parsingSchema,
                            sqlKey,
                            dbTimeBenefit,
                            perExecutionPercentage,
                            isStatsFindingPresent,
                            isSqlProfileFindingPresent,
                            isSqlProfileFindingImplemented,
                            isIndexFindingPresent,
                            isRestructureSqlFindingPresent,
                            isAlternativePlanFindingPresent,
                            isMiscellaneousFindingPresent,
                            isErrorFindingPresent,
                            isTimeoutFindingPresent);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskFindingSummary o) {
            Builder copiedBuilder =
                    sqlTuningAdvisorTaskId(o.getSqlTuningAdvisorTaskId())
                            .sqlTuningAdvisorTaskObjectId(o.getSqlTuningAdvisorTaskObjectId())
                            .sqlTuningAdvisorTaskObjectExecutionId(
                                    o.getSqlTuningAdvisorTaskObjectExecutionId())
                            .sqlText(o.getSqlText())
                            .parsingSchema(o.getParsingSchema())
                            .sqlKey(o.getSqlKey())
                            .dbTimeBenefit(o.getDbTimeBenefit())
                            .perExecutionPercentage(o.getPerExecutionPercentage())
                            .isStatsFindingPresent(o.getIsStatsFindingPresent())
                            .isSqlProfileFindingPresent(o.getIsSqlProfileFindingPresent())
                            .isSqlProfileFindingImplemented(o.getIsSqlProfileFindingImplemented())
                            .isIndexFindingPresent(o.getIsIndexFindingPresent())
                            .isRestructureSqlFindingPresent(o.getIsRestructureSqlFindingPresent())
                            .isAlternativePlanFindingPresent(o.getIsAlternativePlanFindingPresent())
                            .isMiscellaneousFindingPresent(o.getIsMiscellaneousFindingPresent())
                            .isErrorFindingPresent(o.getIsErrorFindingPresent())
                            .isTimeoutFindingPresent(o.getIsTimeoutFindingPresent());

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
     * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
    Long sqlTuningAdvisorTaskId;

    /**
     * The key of the object to which these recommendations apply.
     * This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectId")
    Long sqlTuningAdvisorTaskObjectId;

    /**
     * The execution id of the analyzed SQL object. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectExecutionId")
    Long sqlTuningAdvisorTaskObjectExecutionId;

    /**
     * The text of the SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    String sqlText;

    /**
     * The parsing schema of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsingSchema")
    String parsingSchema;

    /**
     * The unique key of this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlKey")
    String sqlKey;

    /**
     * The time benefit (in seconds) for the highest-rated finding for this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbTimeBenefit")
    Float dbTimeBenefit;

    /**
     * The per-execution percentage benefit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("perExecutionPercentage")
    Integer perExecutionPercentage;

    /**
     * Indicates whether a statistics recommendation was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStatsFindingPresent")
    Boolean isStatsFindingPresent;

    /**
     * Indicates whether a SQL Profile recommendation was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSqlProfileFindingPresent")
    Boolean isSqlProfileFindingPresent;

    /**
     * Indicates whether a SQL Profile recommendation has been implemented for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSqlProfileFindingImplemented")
    Boolean isSqlProfileFindingImplemented;

    /**
     * Indicates whether an index recommendation was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIndexFindingPresent")
    Boolean isIndexFindingPresent;

    /**
     * Indicates whether a restructure SQL recommendation was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRestructureSqlFindingPresent")
    Boolean isRestructureSqlFindingPresent;

    /**
     * Indicates whether an alternative execution plan was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAlternativePlanFindingPresent")
    Boolean isAlternativePlanFindingPresent;

    /**
     * Indicates whether a miscellaneous finding was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMiscellaneousFindingPresent")
    Boolean isMiscellaneousFindingPresent;

    /**
     * Indicates whether there is an error in this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isErrorFindingPresent")
    Boolean isErrorFindingPresent;

    /**
     * Indicates whether the task timed out.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTimeoutFindingPresent")
    Boolean isTimeoutFindingPresent;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
