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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningAdvisorTaskFindingSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningAdvisorTaskFindingSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlTuningAdvisorTaskId",
        "sqlTuningAdvisorTaskObjectId",
        "sqlTuningAdvisorTaskObjectExecutionId",
        "sqlText",
        "parsingSchema",
        "sqlKey",
        "dbTimeBenefit",
        "perExecutionPercentage",
        "isStatsFindingPresent",
        "isSqlProfileFindingPresent",
        "isSqlProfileFindingImplemented",
        "isIndexFindingPresent",
        "isRestructureSqlFindingPresent",
        "isAlternativePlanFindingPresent",
        "isMiscellaneousFindingPresent",
        "isErrorFindingPresent",
        "isTimeoutFindingPresent"
    })
    public SqlTuningAdvisorTaskFindingSummary(
            Long sqlTuningAdvisorTaskId,
            Long sqlTuningAdvisorTaskObjectId,
            Long sqlTuningAdvisorTaskObjectExecutionId,
            String sqlText,
            String parsingSchema,
            String sqlKey,
            Float dbTimeBenefit,
            Integer perExecutionPercentage,
            Boolean isStatsFindingPresent,
            Boolean isSqlProfileFindingPresent,
            Boolean isSqlProfileFindingImplemented,
            Boolean isIndexFindingPresent,
            Boolean isRestructureSqlFindingPresent,
            Boolean isAlternativePlanFindingPresent,
            Boolean isMiscellaneousFindingPresent,
            Boolean isErrorFindingPresent,
            Boolean isTimeoutFindingPresent) {
        super();
        this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
        this.sqlTuningAdvisorTaskObjectId = sqlTuningAdvisorTaskObjectId;
        this.sqlTuningAdvisorTaskObjectExecutionId = sqlTuningAdvisorTaskObjectExecutionId;
        this.sqlText = sqlText;
        this.parsingSchema = parsingSchema;
        this.sqlKey = sqlKey;
        this.dbTimeBenefit = dbTimeBenefit;
        this.perExecutionPercentage = perExecutionPercentage;
        this.isStatsFindingPresent = isStatsFindingPresent;
        this.isSqlProfileFindingPresent = isSqlProfileFindingPresent;
        this.isSqlProfileFindingImplemented = isSqlProfileFindingImplemented;
        this.isIndexFindingPresent = isIndexFindingPresent;
        this.isRestructureSqlFindingPresent = isRestructureSqlFindingPresent;
        this.isAlternativePlanFindingPresent = isAlternativePlanFindingPresent;
        this.isMiscellaneousFindingPresent = isMiscellaneousFindingPresent;
        this.isErrorFindingPresent = isErrorFindingPresent;
        this.isTimeoutFindingPresent = isTimeoutFindingPresent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
        private Long sqlTuningAdvisorTaskId;

        /**
         * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param sqlTuningAdvisorTaskId the value to set
         * @return this builder
         **/
        public Builder sqlTuningAdvisorTaskId(Long sqlTuningAdvisorTaskId) {
            this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            this.__explicitlySet__.add("sqlTuningAdvisorTaskId");
            return this;
        }
        /**
         * The key of the object to which these recommendations apply.
         * This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectId")
        private Long sqlTuningAdvisorTaskObjectId;

        /**
         * The key of the object to which these recommendations apply.
         * This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
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
         * The execution id of the analyzed SQL object. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectExecutionId")
        private Long sqlTuningAdvisorTaskObjectExecutionId;

        /**
         * The execution id of the analyzed SQL object. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param sqlTuningAdvisorTaskObjectExecutionId the value to set
         * @return this builder
         **/
        public Builder sqlTuningAdvisorTaskObjectExecutionId(
                Long sqlTuningAdvisorTaskObjectExecutionId) {
            this.sqlTuningAdvisorTaskObjectExecutionId = sqlTuningAdvisorTaskObjectExecutionId;
            this.__explicitlySet__.add("sqlTuningAdvisorTaskObjectExecutionId");
            return this;
        }
        /**
         * The text of the SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The text of the SQL statement.
         * @param sqlText the value to set
         * @return this builder
         **/
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }
        /**
         * The parsing schema of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parsingSchema")
        private String parsingSchema;

        /**
         * The parsing schema of the object.
         * @param parsingSchema the value to set
         * @return this builder
         **/
        public Builder parsingSchema(String parsingSchema) {
            this.parsingSchema = parsingSchema;
            this.__explicitlySet__.add("parsingSchema");
            return this;
        }
        /**
         * The unique key of this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlKey")
        private String sqlKey;

        /**
         * The unique key of this SQL statement.
         * @param sqlKey the value to set
         * @return this builder
         **/
        public Builder sqlKey(String sqlKey) {
            this.sqlKey = sqlKey;
            this.__explicitlySet__.add("sqlKey");
            return this;
        }
        /**
         * The time benefit (in seconds) for the highest-rated finding for this object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbTimeBenefit")
        private Float dbTimeBenefit;

        /**
         * The time benefit (in seconds) for the highest-rated finding for this object.
         * @param dbTimeBenefit the value to set
         * @return this builder
         **/
        public Builder dbTimeBenefit(Float dbTimeBenefit) {
            this.dbTimeBenefit = dbTimeBenefit;
            this.__explicitlySet__.add("dbTimeBenefit");
            return this;
        }
        /**
         * The per-execution percentage benefit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("perExecutionPercentage")
        private Integer perExecutionPercentage;

        /**
         * The per-execution percentage benefit.
         * @param perExecutionPercentage the value to set
         * @return this builder
         **/
        public Builder perExecutionPercentage(Integer perExecutionPercentage) {
            this.perExecutionPercentage = perExecutionPercentage;
            this.__explicitlySet__.add("perExecutionPercentage");
            return this;
        }
        /**
         * Indicates whether a statistics recommendation was reported for this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isStatsFindingPresent")
        private Boolean isStatsFindingPresent;

        /**
         * Indicates whether a statistics recommendation was reported for this SQL statement.
         * @param isStatsFindingPresent the value to set
         * @return this builder
         **/
        public Builder isStatsFindingPresent(Boolean isStatsFindingPresent) {
            this.isStatsFindingPresent = isStatsFindingPresent;
            this.__explicitlySet__.add("isStatsFindingPresent");
            return this;
        }
        /**
         * Indicates whether a SQL Profile recommendation was reported for this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSqlProfileFindingPresent")
        private Boolean isSqlProfileFindingPresent;

        /**
         * Indicates whether a SQL Profile recommendation was reported for this SQL statement.
         * @param isSqlProfileFindingPresent the value to set
         * @return this builder
         **/
        public Builder isSqlProfileFindingPresent(Boolean isSqlProfileFindingPresent) {
            this.isSqlProfileFindingPresent = isSqlProfileFindingPresent;
            this.__explicitlySet__.add("isSqlProfileFindingPresent");
            return this;
        }
        /**
         * Indicates whether a SQL Profile recommendation has been implemented for this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSqlProfileFindingImplemented")
        private Boolean isSqlProfileFindingImplemented;

        /**
         * Indicates whether a SQL Profile recommendation has been implemented for this SQL statement.
         * @param isSqlProfileFindingImplemented the value to set
         * @return this builder
         **/
        public Builder isSqlProfileFindingImplemented(Boolean isSqlProfileFindingImplemented) {
            this.isSqlProfileFindingImplemented = isSqlProfileFindingImplemented;
            this.__explicitlySet__.add("isSqlProfileFindingImplemented");
            return this;
        }
        /**
         * Indicates whether an index recommendation was reported for this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIndexFindingPresent")
        private Boolean isIndexFindingPresent;

        /**
         * Indicates whether an index recommendation was reported for this SQL statement.
         * @param isIndexFindingPresent the value to set
         * @return this builder
         **/
        public Builder isIndexFindingPresent(Boolean isIndexFindingPresent) {
            this.isIndexFindingPresent = isIndexFindingPresent;
            this.__explicitlySet__.add("isIndexFindingPresent");
            return this;
        }
        /**
         * Indicates whether a restructure SQL recommendation was reported for this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRestructureSqlFindingPresent")
        private Boolean isRestructureSqlFindingPresent;

        /**
         * Indicates whether a restructure SQL recommendation was reported for this SQL statement.
         * @param isRestructureSqlFindingPresent the value to set
         * @return this builder
         **/
        public Builder isRestructureSqlFindingPresent(Boolean isRestructureSqlFindingPresent) {
            this.isRestructureSqlFindingPresent = isRestructureSqlFindingPresent;
            this.__explicitlySet__.add("isRestructureSqlFindingPresent");
            return this;
        }
        /**
         * Indicates whether an alternative execution plan was reported for this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAlternativePlanFindingPresent")
        private Boolean isAlternativePlanFindingPresent;

        /**
         * Indicates whether an alternative execution plan was reported for this SQL statement.
         * @param isAlternativePlanFindingPresent the value to set
         * @return this builder
         **/
        public Builder isAlternativePlanFindingPresent(Boolean isAlternativePlanFindingPresent) {
            this.isAlternativePlanFindingPresent = isAlternativePlanFindingPresent;
            this.__explicitlySet__.add("isAlternativePlanFindingPresent");
            return this;
        }
        /**
         * Indicates whether a miscellaneous finding was reported for this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMiscellaneousFindingPresent")
        private Boolean isMiscellaneousFindingPresent;

        /**
         * Indicates whether a miscellaneous finding was reported for this SQL statement.
         * @param isMiscellaneousFindingPresent the value to set
         * @return this builder
         **/
        public Builder isMiscellaneousFindingPresent(Boolean isMiscellaneousFindingPresent) {
            this.isMiscellaneousFindingPresent = isMiscellaneousFindingPresent;
            this.__explicitlySet__.add("isMiscellaneousFindingPresent");
            return this;
        }
        /**
         * Indicates whether there is an error in this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isErrorFindingPresent")
        private Boolean isErrorFindingPresent;

        /**
         * Indicates whether there is an error in this SQL statement.
         * @param isErrorFindingPresent the value to set
         * @return this builder
         **/
        public Builder isErrorFindingPresent(Boolean isErrorFindingPresent) {
            this.isErrorFindingPresent = isErrorFindingPresent;
            this.__explicitlySet__.add("isErrorFindingPresent");
            return this;
        }
        /**
         * Indicates whether the task timed out.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTimeoutFindingPresent")
        private Boolean isTimeoutFindingPresent;

        /**
         * Indicates whether the task timed out.
         * @param isTimeoutFindingPresent the value to set
         * @return this builder
         **/
        public Builder isTimeoutFindingPresent(Boolean isTimeoutFindingPresent) {
            this.isTimeoutFindingPresent = isTimeoutFindingPresent;
            this.__explicitlySet__.add("isTimeoutFindingPresent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskFindingSummary build() {
            SqlTuningAdvisorTaskFindingSummary model =
                    new SqlTuningAdvisorTaskFindingSummary(
                            this.sqlTuningAdvisorTaskId,
                            this.sqlTuningAdvisorTaskObjectId,
                            this.sqlTuningAdvisorTaskObjectExecutionId,
                            this.sqlText,
                            this.parsingSchema,
                            this.sqlKey,
                            this.dbTimeBenefit,
                            this.perExecutionPercentage,
                            this.isStatsFindingPresent,
                            this.isSqlProfileFindingPresent,
                            this.isSqlProfileFindingImplemented,
                            this.isIndexFindingPresent,
                            this.isRestructureSqlFindingPresent,
                            this.isAlternativePlanFindingPresent,
                            this.isMiscellaneousFindingPresent,
                            this.isErrorFindingPresent,
                            this.isTimeoutFindingPresent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskFindingSummary model) {
            if (model.wasPropertyExplicitlySet("sqlTuningAdvisorTaskId")) {
                this.sqlTuningAdvisorTaskId(model.getSqlTuningAdvisorTaskId());
            }
            if (model.wasPropertyExplicitlySet("sqlTuningAdvisorTaskObjectId")) {
                this.sqlTuningAdvisorTaskObjectId(model.getSqlTuningAdvisorTaskObjectId());
            }
            if (model.wasPropertyExplicitlySet("sqlTuningAdvisorTaskObjectExecutionId")) {
                this.sqlTuningAdvisorTaskObjectExecutionId(
                        model.getSqlTuningAdvisorTaskObjectExecutionId());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("parsingSchema")) {
                this.parsingSchema(model.getParsingSchema());
            }
            if (model.wasPropertyExplicitlySet("sqlKey")) {
                this.sqlKey(model.getSqlKey());
            }
            if (model.wasPropertyExplicitlySet("dbTimeBenefit")) {
                this.dbTimeBenefit(model.getDbTimeBenefit());
            }
            if (model.wasPropertyExplicitlySet("perExecutionPercentage")) {
                this.perExecutionPercentage(model.getPerExecutionPercentage());
            }
            if (model.wasPropertyExplicitlySet("isStatsFindingPresent")) {
                this.isStatsFindingPresent(model.getIsStatsFindingPresent());
            }
            if (model.wasPropertyExplicitlySet("isSqlProfileFindingPresent")) {
                this.isSqlProfileFindingPresent(model.getIsSqlProfileFindingPresent());
            }
            if (model.wasPropertyExplicitlySet("isSqlProfileFindingImplemented")) {
                this.isSqlProfileFindingImplemented(model.getIsSqlProfileFindingImplemented());
            }
            if (model.wasPropertyExplicitlySet("isIndexFindingPresent")) {
                this.isIndexFindingPresent(model.getIsIndexFindingPresent());
            }
            if (model.wasPropertyExplicitlySet("isRestructureSqlFindingPresent")) {
                this.isRestructureSqlFindingPresent(model.getIsRestructureSqlFindingPresent());
            }
            if (model.wasPropertyExplicitlySet("isAlternativePlanFindingPresent")) {
                this.isAlternativePlanFindingPresent(model.getIsAlternativePlanFindingPresent());
            }
            if (model.wasPropertyExplicitlySet("isMiscellaneousFindingPresent")) {
                this.isMiscellaneousFindingPresent(model.getIsMiscellaneousFindingPresent());
            }
            if (model.wasPropertyExplicitlySet("isErrorFindingPresent")) {
                this.isErrorFindingPresent(model.getIsErrorFindingPresent());
            }
            if (model.wasPropertyExplicitlySet("isTimeoutFindingPresent")) {
                this.isTimeoutFindingPresent(model.getIsTimeoutFindingPresent());
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
     * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
    private final Long sqlTuningAdvisorTaskId;

    /**
     * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public Long getSqlTuningAdvisorTaskId() {
        return sqlTuningAdvisorTaskId;
    }

    /**
     * The key of the object to which these recommendations apply.
     * This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectId")
    private final Long sqlTuningAdvisorTaskObjectId;

    /**
     * The key of the object to which these recommendations apply.
     * This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     **/
    public Long getSqlTuningAdvisorTaskObjectId() {
        return sqlTuningAdvisorTaskObjectId;
    }

    /**
     * The execution id of the analyzed SQL object. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskObjectExecutionId")
    private final Long sqlTuningAdvisorTaskObjectExecutionId;

    /**
     * The execution id of the analyzed SQL object. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public Long getSqlTuningAdvisorTaskObjectExecutionId() {
        return sqlTuningAdvisorTaskObjectExecutionId;
    }

    /**
     * The text of the SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The text of the SQL statement.
     * @return the value
     **/
    public String getSqlText() {
        return sqlText;
    }

    /**
     * The parsing schema of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsingSchema")
    private final String parsingSchema;

    /**
     * The parsing schema of the object.
     * @return the value
     **/
    public String getParsingSchema() {
        return parsingSchema;
    }

    /**
     * The unique key of this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlKey")
    private final String sqlKey;

    /**
     * The unique key of this SQL statement.
     * @return the value
     **/
    public String getSqlKey() {
        return sqlKey;
    }

    /**
     * The time benefit (in seconds) for the highest-rated finding for this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbTimeBenefit")
    private final Float dbTimeBenefit;

    /**
     * The time benefit (in seconds) for the highest-rated finding for this object.
     * @return the value
     **/
    public Float getDbTimeBenefit() {
        return dbTimeBenefit;
    }

    /**
     * The per-execution percentage benefit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("perExecutionPercentage")
    private final Integer perExecutionPercentage;

    /**
     * The per-execution percentage benefit.
     * @return the value
     **/
    public Integer getPerExecutionPercentage() {
        return perExecutionPercentage;
    }

    /**
     * Indicates whether a statistics recommendation was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStatsFindingPresent")
    private final Boolean isStatsFindingPresent;

    /**
     * Indicates whether a statistics recommendation was reported for this SQL statement.
     * @return the value
     **/
    public Boolean getIsStatsFindingPresent() {
        return isStatsFindingPresent;
    }

    /**
     * Indicates whether a SQL Profile recommendation was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSqlProfileFindingPresent")
    private final Boolean isSqlProfileFindingPresent;

    /**
     * Indicates whether a SQL Profile recommendation was reported for this SQL statement.
     * @return the value
     **/
    public Boolean getIsSqlProfileFindingPresent() {
        return isSqlProfileFindingPresent;
    }

    /**
     * Indicates whether a SQL Profile recommendation has been implemented for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSqlProfileFindingImplemented")
    private final Boolean isSqlProfileFindingImplemented;

    /**
     * Indicates whether a SQL Profile recommendation has been implemented for this SQL statement.
     * @return the value
     **/
    public Boolean getIsSqlProfileFindingImplemented() {
        return isSqlProfileFindingImplemented;
    }

    /**
     * Indicates whether an index recommendation was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIndexFindingPresent")
    private final Boolean isIndexFindingPresent;

    /**
     * Indicates whether an index recommendation was reported for this SQL statement.
     * @return the value
     **/
    public Boolean getIsIndexFindingPresent() {
        return isIndexFindingPresent;
    }

    /**
     * Indicates whether a restructure SQL recommendation was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRestructureSqlFindingPresent")
    private final Boolean isRestructureSqlFindingPresent;

    /**
     * Indicates whether a restructure SQL recommendation was reported for this SQL statement.
     * @return the value
     **/
    public Boolean getIsRestructureSqlFindingPresent() {
        return isRestructureSqlFindingPresent;
    }

    /**
     * Indicates whether an alternative execution plan was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAlternativePlanFindingPresent")
    private final Boolean isAlternativePlanFindingPresent;

    /**
     * Indicates whether an alternative execution plan was reported for this SQL statement.
     * @return the value
     **/
    public Boolean getIsAlternativePlanFindingPresent() {
        return isAlternativePlanFindingPresent;
    }

    /**
     * Indicates whether a miscellaneous finding was reported for this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMiscellaneousFindingPresent")
    private final Boolean isMiscellaneousFindingPresent;

    /**
     * Indicates whether a miscellaneous finding was reported for this SQL statement.
     * @return the value
     **/
    public Boolean getIsMiscellaneousFindingPresent() {
        return isMiscellaneousFindingPresent;
    }

    /**
     * Indicates whether there is an error in this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isErrorFindingPresent")
    private final Boolean isErrorFindingPresent;

    /**
     * Indicates whether there is an error in this SQL statement.
     * @return the value
     **/
    public Boolean getIsErrorFindingPresent() {
        return isErrorFindingPresent;
    }

    /**
     * Indicates whether the task timed out.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTimeoutFindingPresent")
    private final Boolean isTimeoutFindingPresent;

    /**
     * Indicates whether the task timed out.
     * @return the value
     **/
    public Boolean getIsTimeoutFindingPresent() {
        return isTimeoutFindingPresent;
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
        sb.append("SqlTuningAdvisorTaskFindingSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sqlTuningAdvisorTaskId=").append(String.valueOf(this.sqlTuningAdvisorTaskId));
        sb.append(", sqlTuningAdvisorTaskObjectId=")
                .append(String.valueOf(this.sqlTuningAdvisorTaskObjectId));
        sb.append(", sqlTuningAdvisorTaskObjectExecutionId=")
                .append(String.valueOf(this.sqlTuningAdvisorTaskObjectExecutionId));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", parsingSchema=").append(String.valueOf(this.parsingSchema));
        sb.append(", sqlKey=").append(String.valueOf(this.sqlKey));
        sb.append(", dbTimeBenefit=").append(String.valueOf(this.dbTimeBenefit));
        sb.append(", perExecutionPercentage=").append(String.valueOf(this.perExecutionPercentage));
        sb.append(", isStatsFindingPresent=").append(String.valueOf(this.isStatsFindingPresent));
        sb.append(", isSqlProfileFindingPresent=")
                .append(String.valueOf(this.isSqlProfileFindingPresent));
        sb.append(", isSqlProfileFindingImplemented=")
                .append(String.valueOf(this.isSqlProfileFindingImplemented));
        sb.append(", isIndexFindingPresent=").append(String.valueOf(this.isIndexFindingPresent));
        sb.append(", isRestructureSqlFindingPresent=")
                .append(String.valueOf(this.isRestructureSqlFindingPresent));
        sb.append(", isAlternativePlanFindingPresent=")
                .append(String.valueOf(this.isAlternativePlanFindingPresent));
        sb.append(", isMiscellaneousFindingPresent=")
                .append(String.valueOf(this.isMiscellaneousFindingPresent));
        sb.append(", isErrorFindingPresent=").append(String.valueOf(this.isErrorFindingPresent));
        sb.append(", isTimeoutFindingPresent=")
                .append(String.valueOf(this.isTimeoutFindingPresent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskFindingSummary)) {
            return false;
        }

        SqlTuningAdvisorTaskFindingSummary other = (SqlTuningAdvisorTaskFindingSummary) o;
        return java.util.Objects.equals(this.sqlTuningAdvisorTaskId, other.sqlTuningAdvisorTaskId)
                && java.util.Objects.equals(
                        this.sqlTuningAdvisorTaskObjectId, other.sqlTuningAdvisorTaskObjectId)
                && java.util.Objects.equals(
                        this.sqlTuningAdvisorTaskObjectExecutionId,
                        other.sqlTuningAdvisorTaskObjectExecutionId)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.parsingSchema, other.parsingSchema)
                && java.util.Objects.equals(this.sqlKey, other.sqlKey)
                && java.util.Objects.equals(this.dbTimeBenefit, other.dbTimeBenefit)
                && java.util.Objects.equals(
                        this.perExecutionPercentage, other.perExecutionPercentage)
                && java.util.Objects.equals(this.isStatsFindingPresent, other.isStatsFindingPresent)
                && java.util.Objects.equals(
                        this.isSqlProfileFindingPresent, other.isSqlProfileFindingPresent)
                && java.util.Objects.equals(
                        this.isSqlProfileFindingImplemented, other.isSqlProfileFindingImplemented)
                && java.util.Objects.equals(this.isIndexFindingPresent, other.isIndexFindingPresent)
                && java.util.Objects.equals(
                        this.isRestructureSqlFindingPresent, other.isRestructureSqlFindingPresent)
                && java.util.Objects.equals(
                        this.isAlternativePlanFindingPresent, other.isAlternativePlanFindingPresent)
                && java.util.Objects.equals(
                        this.isMiscellaneousFindingPresent, other.isMiscellaneousFindingPresent)
                && java.util.Objects.equals(this.isErrorFindingPresent, other.isErrorFindingPresent)
                && java.util.Objects.equals(
                        this.isTimeoutFindingPresent, other.isTimeoutFindingPresent)
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
                        + (this.sqlTuningAdvisorTaskObjectExecutionId == null
                                ? 43
                                : this.sqlTuningAdvisorTaskObjectExecutionId.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result =
                (result * PRIME)
                        + (this.parsingSchema == null ? 43 : this.parsingSchema.hashCode());
        result = (result * PRIME) + (this.sqlKey == null ? 43 : this.sqlKey.hashCode());
        result =
                (result * PRIME)
                        + (this.dbTimeBenefit == null ? 43 : this.dbTimeBenefit.hashCode());
        result =
                (result * PRIME)
                        + (this.perExecutionPercentage == null
                                ? 43
                                : this.perExecutionPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.isStatsFindingPresent == null
                                ? 43
                                : this.isStatsFindingPresent.hashCode());
        result =
                (result * PRIME)
                        + (this.isSqlProfileFindingPresent == null
                                ? 43
                                : this.isSqlProfileFindingPresent.hashCode());
        result =
                (result * PRIME)
                        + (this.isSqlProfileFindingImplemented == null
                                ? 43
                                : this.isSqlProfileFindingImplemented.hashCode());
        result =
                (result * PRIME)
                        + (this.isIndexFindingPresent == null
                                ? 43
                                : this.isIndexFindingPresent.hashCode());
        result =
                (result * PRIME)
                        + (this.isRestructureSqlFindingPresent == null
                                ? 43
                                : this.isRestructureSqlFindingPresent.hashCode());
        result =
                (result * PRIME)
                        + (this.isAlternativePlanFindingPresent == null
                                ? 43
                                : this.isAlternativePlanFindingPresent.hashCode());
        result =
                (result * PRIME)
                        + (this.isMiscellaneousFindingPresent == null
                                ? 43
                                : this.isMiscellaneousFindingPresent.hashCode());
        result =
                (result * PRIME)
                        + (this.isErrorFindingPresent == null
                                ? 43
                                : this.isErrorFindingPresent.hashCode());
        result =
                (result * PRIME)
                        + (this.isTimeoutFindingPresent == null
                                ? 43
                                : this.isTimeoutFindingPresent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
