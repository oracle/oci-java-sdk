/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Save current list of Sql statements into another Sql tuning set. It takes either
 * credentialDetails or databaseCredential. It's recommended to provide databaseCredential <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SaveSqlTuningSetAsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SaveSqlTuningSetAsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "databaseCredential",
        "showSqlOnly",
        "owner",
        "name",
        "destinationSqlTuningSetName",
        "destinationSqlTuningSetDescription",
        "destinationSqlTuningSetOwner",
        "createNew",
        "basicFilter",
        "planFilter",
        "recursiveSql",
        "resultPercentage",
        "resultLimit",
        "rankingMeasure1",
        "rankingMeasure2",
        "rankingMeasure3",
        "attributeList",
        "loadOption",
        "updateOption",
        "updateCondition",
        "updateAttributes",
        "isIgnoreNull",
        "commitRows"
    })
    public SaveSqlTuningSetAsDetails(
            SqlTuningSetAdminCredentialDetails credentialDetails,
            DatabaseCredentialDetails databaseCredential,
            Integer showSqlOnly,
            String owner,
            String name,
            String destinationSqlTuningSetName,
            String destinationSqlTuningSetDescription,
            String destinationSqlTuningSetOwner,
            Integer createNew,
            String basicFilter,
            PlanFilter planFilter,
            RecursiveSql recursiveSql,
            Double resultPercentage,
            Integer resultLimit,
            RankingMeasure rankingMeasure1,
            RankingMeasure rankingMeasure2,
            RankingMeasure rankingMeasure3,
            String attributeList,
            LoadOption loadOption,
            UpdateOption updateOption,
            UpdateCondition updateCondition,
            String updateAttributes,
            Boolean isIgnoreNull,
            Integer commitRows) {
        super();
        this.credentialDetails = credentialDetails;
        this.databaseCredential = databaseCredential;
        this.showSqlOnly = showSqlOnly;
        this.owner = owner;
        this.name = name;
        this.destinationSqlTuningSetName = destinationSqlTuningSetName;
        this.destinationSqlTuningSetDescription = destinationSqlTuningSetDescription;
        this.destinationSqlTuningSetOwner = destinationSqlTuningSetOwner;
        this.createNew = createNew;
        this.basicFilter = basicFilter;
        this.planFilter = planFilter;
        this.recursiveSql = recursiveSql;
        this.resultPercentage = resultPercentage;
        this.resultLimit = resultLimit;
        this.rankingMeasure1 = rankingMeasure1;
        this.rankingMeasure2 = rankingMeasure2;
        this.rankingMeasure3 = rankingMeasure3;
        this.attributeList = attributeList;
        this.loadOption = loadOption;
        this.updateOption = updateOption;
        this.updateCondition = updateCondition;
        this.updateAttributes = updateAttributes;
        this.isIgnoreNull = isIgnoreNull;
        this.commitRows = commitRows;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private SqlTuningSetAdminCredentialDetails credentialDetails;

        public Builder credentialDetails(SqlTuningSetAdminCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private DatabaseCredentialDetails databaseCredential;

        public Builder databaseCredential(DatabaseCredentialDetails databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }
        /**
         * Flag to indicate whether to save the Sql tuning set or just display the plsql used to
         * save Sql tuning set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("showSqlOnly")
        private Integer showSqlOnly;

        /**
         * Flag to indicate whether to save the Sql tuning set or just display the plsql used to
         * save Sql tuning set.
         *
         * @param showSqlOnly the value to set
         * @return this builder
         */
        public Builder showSqlOnly(Integer showSqlOnly) {
            this.showSqlOnly = showSqlOnly;
            this.__explicitlySet__.add("showSqlOnly");
            return this;
        }
        /** The owner of the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * The owner of the Sql tuning set.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** The name of the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Sql tuning set.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The name of the destination Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationSqlTuningSetName")
        private String destinationSqlTuningSetName;

        /**
         * The name of the destination Sql tuning set.
         *
         * @param destinationSqlTuningSetName the value to set
         * @return this builder
         */
        public Builder destinationSqlTuningSetName(String destinationSqlTuningSetName) {
            this.destinationSqlTuningSetName = destinationSqlTuningSetName;
            this.__explicitlySet__.add("destinationSqlTuningSetName");
            return this;
        }
        /** The description for the destination Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationSqlTuningSetDescription")
        private String destinationSqlTuningSetDescription;

        /**
         * The description for the destination Sql tuning set.
         *
         * @param destinationSqlTuningSetDescription the value to set
         * @return this builder
         */
        public Builder destinationSqlTuningSetDescription(
                String destinationSqlTuningSetDescription) {
            this.destinationSqlTuningSetDescription = destinationSqlTuningSetDescription;
            this.__explicitlySet__.add("destinationSqlTuningSetDescription");
            return this;
        }
        /** Owner of the destination Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationSqlTuningSetOwner")
        private String destinationSqlTuningSetOwner;

        /**
         * Owner of the destination Sql tuning set.
         *
         * @param destinationSqlTuningSetOwner the value to set
         * @return this builder
         */
        public Builder destinationSqlTuningSetOwner(String destinationSqlTuningSetOwner) {
            this.destinationSqlTuningSetOwner = destinationSqlTuningSetOwner;
            this.__explicitlySet__.add("destinationSqlTuningSetOwner");
            return this;
        }
        /**
         * Specifies whether to create a new Sql tuning set or not. Possible values 1 - Create a new
         * Sql tuning set 0 - Do not create a new Sql tuning set
         */
        @com.fasterxml.jackson.annotation.JsonProperty("createNew")
        private Integer createNew;

        /**
         * Specifies whether to create a new Sql tuning set or not. Possible values 1 - Create a new
         * Sql tuning set 0 - Do not create a new Sql tuning set
         *
         * @param createNew the value to set
         * @return this builder
         */
        public Builder createNew(Integer createNew) {
            this.createNew = createNew;
            this.__explicitlySet__.add("createNew");
            return this;
        }
        /**
         * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on
         * attributes of the SQLSET_ROW. User could use any combination of the following columns
         * with appropriate values as Sql predicate Refer to the documentation
         * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
         */
        @com.fasterxml.jackson.annotation.JsonProperty("basicFilter")
        private String basicFilter;

        /**
         * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on
         * attributes of the SQLSET_ROW. User could use any combination of the following columns
         * with appropriate values as Sql predicate Refer to the documentation
         * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
         *
         * @param basicFilter the value to set
         * @return this builder
         */
        public Builder basicFilter(String basicFilter) {
            this.basicFilter = basicFilter;
            this.__explicitlySet__.add("basicFilter");
            return this;
        }
        /**
         * Specifies the plan filter. This parameter enables you to select a single plan when a
         * statement has multiple plans. Refer to the documentation
         * https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_SQLSET.html#GUID-9D995019-91AB-4B1E-9EAF-031050789B21
         */
        @com.fasterxml.jackson.annotation.JsonProperty("planFilter")
        private PlanFilter planFilter;

        /**
         * Specifies the plan filter. This parameter enables you to select a single plan when a
         * statement has multiple plans. Refer to the documentation
         * https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_SQLSET.html#GUID-9D995019-91AB-4B1E-9EAF-031050789B21
         *
         * @param planFilter the value to set
         * @return this builder
         */
        public Builder planFilter(PlanFilter planFilter) {
            this.planFilter = planFilter;
            this.__explicitlySet__.add("planFilter");
            return this;
        }
        /** Specifies that the filter must include recursive Sql in the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("recursiveSql")
        private RecursiveSql recursiveSql;

        /**
         * Specifies that the filter must include recursive Sql in the Sql tuning set.
         *
         * @param recursiveSql the value to set
         * @return this builder
         */
        public Builder recursiveSql(RecursiveSql recursiveSql) {
            this.recursiveSql = recursiveSql;
            this.__explicitlySet__.add("recursiveSql");
            return this;
        }
        /**
         * Specifies a filter that picks the top n% according to the supplied ranking measure. Note
         * that this parameter applies only if one ranking measure is supplied.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resultPercentage")
        private Double resultPercentage;

        /**
         * Specifies a filter that picks the top n% according to the supplied ranking measure. Note
         * that this parameter applies only if one ranking measure is supplied.
         *
         * @param resultPercentage the value to set
         * @return this builder
         */
        public Builder resultPercentage(Double resultPercentage) {
            this.resultPercentage = resultPercentage;
            this.__explicitlySet__.add("resultPercentage");
            return this;
        }
        /** The top limit Sql from the filtered source, ranked by the ranking measure. */
        @com.fasterxml.jackson.annotation.JsonProperty("resultLimit")
        private Integer resultLimit;

        /**
         * The top limit Sql from the filtered source, ranked by the ranking measure.
         *
         * @param resultLimit the value to set
         * @return this builder
         */
        public Builder resultLimit(Integer resultLimit) {
            this.resultLimit = resultLimit;
            this.__explicitlySet__.add("resultLimit");
            return this;
        }
        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure1")
        private RankingMeasure rankingMeasure1;

        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         *
         * @param rankingMeasure1 the value to set
         * @return this builder
         */
        public Builder rankingMeasure1(RankingMeasure rankingMeasure1) {
            this.rankingMeasure1 = rankingMeasure1;
            this.__explicitlySet__.add("rankingMeasure1");
            return this;
        }
        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure2")
        private RankingMeasure rankingMeasure2;

        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         *
         * @param rankingMeasure2 the value to set
         * @return this builder
         */
        public Builder rankingMeasure2(RankingMeasure rankingMeasure2) {
            this.rankingMeasure2 = rankingMeasure2;
            this.__explicitlySet__.add("rankingMeasure2");
            return this;
        }
        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure3")
        private RankingMeasure rankingMeasure3;

        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         *
         * @param rankingMeasure3 the value to set
         * @return this builder
         */
        public Builder rankingMeasure3(RankingMeasure rankingMeasure3) {
            this.rankingMeasure3 = rankingMeasure3;
            this.__explicitlySet__.add("rankingMeasure3");
            return this;
        }
        /**
         * Specifies the list of Sql statement attributes to return in the result. Note that this
         * parameter cannot be made an enum since custom value can take a list of comma separated
         * attribute names. Attribute list can take one of the following values. TYPICAL - Specifies
         * BASIC plus Sql plan (without row source statistics) and without object reference list
         * (default). BASIC - Specifies all attributes (such as execution statistics and binds)
         * except the plans. The execution context is always part of the result. ALL - Specifies all
         * attributes. CUSTOM - Comma-separated list of the following attribute names. -
         * EXECUTION_STATISTICS - BIND_LIST - OBJECT_LIST - SQL_PLAN - SQL_PLAN_STATISTICS Usage
         * examples: 1. "attributeList": "TYPICAL" 2. "attributeList": "ALL" 3. "attributeList":
         * "EXECUTION_STATISTICS,OBJECT_LIST,SQL_PLAN"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeList")
        private String attributeList;

        /**
         * Specifies the list of Sql statement attributes to return in the result. Note that this
         * parameter cannot be made an enum since custom value can take a list of comma separated
         * attribute names. Attribute list can take one of the following values. TYPICAL - Specifies
         * BASIC plus Sql plan (without row source statistics) and without object reference list
         * (default). BASIC - Specifies all attributes (such as execution statistics and binds)
         * except the plans. The execution context is always part of the result. ALL - Specifies all
         * attributes. CUSTOM - Comma-separated list of the following attribute names. -
         * EXECUTION_STATISTICS - BIND_LIST - OBJECT_LIST - SQL_PLAN - SQL_PLAN_STATISTICS Usage
         * examples: 1. "attributeList": "TYPICAL" 2. "attributeList": "ALL" 3. "attributeList":
         * "EXECUTION_STATISTICS,OBJECT_LIST,SQL_PLAN"
         *
         * @param attributeList the value to set
         * @return this builder
         */
        public Builder attributeList(String attributeList) {
            this.attributeList = attributeList;
            this.__explicitlySet__.add("attributeList");
            return this;
        }
        /**
         * Specifies which statements are loaded into the Sql tuning set. The possible values are. -
         * INSERT (default) Adds only new statements. - UPDATE Updates existing the Sql statements
         * and ignores any new statements. - MERGE Inserts new statements and updates the
         * information of the existing ones.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loadOption")
        private LoadOption loadOption;

        /**
         * Specifies which statements are loaded into the Sql tuning set. The possible values are. -
         * INSERT (default) Adds only new statements. - UPDATE Updates existing the Sql statements
         * and ignores any new statements. - MERGE Inserts new statements and updates the
         * information of the existing ones.
         *
         * @param loadOption the value to set
         * @return this builder
         */
        public Builder loadOption(LoadOption loadOption) {
            this.loadOption = loadOption;
            this.__explicitlySet__.add("loadOption");
            return this;
        }
        /**
         * Specifies how existing Sql statements are updated. This parameter is applicable only if
         * load_option is specified with UPDATE or MERGE as an option. Update option can take one of
         * the following values. REPLACE (default) - Updates the statement using the new statistics,
         * bind list, object list, and so on. ACCUMULATE - Combines attributes when possible (for
         * example, statistics such as elapsed_time), otherwise replaces the existing values (for
         * example, module and action) with the provided values. Following Sql statement attributes
         * can be accumulated. elapsed_time buffer_gets direct_writes disk_reads row_processed
         * fetches executions end_of_fetch_count stat_period active_stat_period
         */
        @com.fasterxml.jackson.annotation.JsonProperty("updateOption")
        private UpdateOption updateOption;

        /**
         * Specifies how existing Sql statements are updated. This parameter is applicable only if
         * load_option is specified with UPDATE or MERGE as an option. Update option can take one of
         * the following values. REPLACE (default) - Updates the statement using the new statistics,
         * bind list, object list, and so on. ACCUMULATE - Combines attributes when possible (for
         * example, statistics such as elapsed_time), otherwise replaces the existing values (for
         * example, module and action) with the provided values. Following Sql statement attributes
         * can be accumulated. elapsed_time buffer_gets direct_writes disk_reads row_processed
         * fetches executions end_of_fetch_count stat_period active_stat_period
         *
         * @param updateOption the value to set
         * @return this builder
         */
        public Builder updateOption(UpdateOption updateOption) {
            this.updateOption = updateOption;
            this.__explicitlySet__.add("updateOption");
            return this;
        }
        /**
         * Specifies when to perform the update. The procedure only performs the update when the
         * specified condition is satisfied. The condition can refer to either the data source or
         * destination. The condition must use the following prefixes to refer to attributes from
         * the source or the destination: OLD \u2014 Refers to statement attributes from the SQL
         * tuning set (destination). NEW \u2014 Refers to statement attributes from the input
         * statements (source). NULL \u2014 No updates are performed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("updateCondition")
        private UpdateCondition updateCondition;

        /**
         * Specifies when to perform the update. The procedure only performs the update when the
         * specified condition is satisfied. The condition can refer to either the data source or
         * destination. The condition must use the following prefixes to refer to attributes from
         * the source or the destination: OLD \u2014 Refers to statement attributes from the SQL
         * tuning set (destination). NEW \u2014 Refers to statement attributes from the input
         * statements (source). NULL \u2014 No updates are performed.
         *
         * @param updateCondition the value to set
         * @return this builder
         */
        public Builder updateCondition(UpdateCondition updateCondition) {
            this.updateCondition = updateCondition;
            this.__explicitlySet__.add("updateCondition");
            return this;
        }
        /**
         * Specifies the list of Sql statement attributes to update during a merge or update. Note
         * that this parameter cannot be made an enum since custom value can take a list of comma
         * separated attribute names. Update attributes can take one of the following values. NULL
         * (default) - Specifies the content of the input cursor except the execution context. On
         * other terms, it is equivalent to ALL without execution contexts such as module and
         * action. BASIC - Specifies statistics and binds only. TYPICAL - Specifies BASIC with Sql
         * plans (without row source statistics) and without an object reference list. ALL -
         * Specifies all attributes, including the execution context attributes such as module and
         * action. CUSTOM - List of comma separated attribute names to update EXECUTION_CONTEXT
         * EXECUTION_STATISTICS SQL_BINDS SQL_PLAN SQL_PLAN_STATISTICS (similar to SQL_PLAN with
         * added row source statistics) Usage examples: 1. "updateAttributes": "TYPICAL" 2.
         * "updateAttributes": "BASIC" 3. "updateAttributes":
         * "EXECUTION_STATISTICS,SQL_PLAN_STATISTICS,SQL_PLAN" 4. "updateAttributes":
         * "EXECUTION_STATISTICS,SQL_PLAN"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("updateAttributes")
        private String updateAttributes;

        /**
         * Specifies the list of Sql statement attributes to update during a merge or update. Note
         * that this parameter cannot be made an enum since custom value can take a list of comma
         * separated attribute names. Update attributes can take one of the following values. NULL
         * (default) - Specifies the content of the input cursor except the execution context. On
         * other terms, it is equivalent to ALL without execution contexts such as module and
         * action. BASIC - Specifies statistics and binds only. TYPICAL - Specifies BASIC with Sql
         * plans (without row source statistics) and without an object reference list. ALL -
         * Specifies all attributes, including the execution context attributes such as module and
         * action. CUSTOM - List of comma separated attribute names to update EXECUTION_CONTEXT
         * EXECUTION_STATISTICS SQL_BINDS SQL_PLAN SQL_PLAN_STATISTICS (similar to SQL_PLAN with
         * added row source statistics) Usage examples: 1. "updateAttributes": "TYPICAL" 2.
         * "updateAttributes": "BASIC" 3. "updateAttributes":
         * "EXECUTION_STATISTICS,SQL_PLAN_STATISTICS,SQL_PLAN" 4. "updateAttributes":
         * "EXECUTION_STATISTICS,SQL_PLAN"
         *
         * @param updateAttributes the value to set
         * @return this builder
         */
        public Builder updateAttributes(String updateAttributes) {
            this.updateAttributes = updateAttributes;
            this.__explicitlySet__.add("updateAttributes");
            return this;
        }
        /**
         * Specifies whether to update attributes when the new value is NULL. If TRUE, then the
         * procedure does not update an attribute when the new value is NULL. That is, do not
         * override with NULL values unless intentional. Possible values - true or false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreNull")
        private Boolean isIgnoreNull;

        /**
         * Specifies whether to update attributes when the new value is NULL. If TRUE, then the
         * procedure does not update an attribute when the new value is NULL. That is, do not
         * override with NULL values unless intentional. Possible values - true or false
         *
         * @param isIgnoreNull the value to set
         * @return this builder
         */
        public Builder isIgnoreNull(Boolean isIgnoreNull) {
            this.isIgnoreNull = isIgnoreNull;
            this.__explicitlySet__.add("isIgnoreNull");
            return this;
        }
        /**
         * Specifies whether to commit statements after DML. If a value is provided, then the load
         * commits after each specified number of statements is inserted. If NULL is provided, then
         * the load commits only once, at the end of the operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("commitRows")
        private Integer commitRows;

        /**
         * Specifies whether to commit statements after DML. If a value is provided, then the load
         * commits after each specified number of statements is inserted. If NULL is provided, then
         * the load commits only once, at the end of the operation.
         *
         * @param commitRows the value to set
         * @return this builder
         */
        public Builder commitRows(Integer commitRows) {
            this.commitRows = commitRows;
            this.__explicitlySet__.add("commitRows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SaveSqlTuningSetAsDetails build() {
            SaveSqlTuningSetAsDetails model =
                    new SaveSqlTuningSetAsDetails(
                            this.credentialDetails,
                            this.databaseCredential,
                            this.showSqlOnly,
                            this.owner,
                            this.name,
                            this.destinationSqlTuningSetName,
                            this.destinationSqlTuningSetDescription,
                            this.destinationSqlTuningSetOwner,
                            this.createNew,
                            this.basicFilter,
                            this.planFilter,
                            this.recursiveSql,
                            this.resultPercentage,
                            this.resultLimit,
                            this.rankingMeasure1,
                            this.rankingMeasure2,
                            this.rankingMeasure3,
                            this.attributeList,
                            this.loadOption,
                            this.updateOption,
                            this.updateCondition,
                            this.updateAttributes,
                            this.isIgnoreNull,
                            this.commitRows);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SaveSqlTuningSetAsDetails model) {
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("databaseCredential")) {
                this.databaseCredential(model.getDatabaseCredential());
            }
            if (model.wasPropertyExplicitlySet("showSqlOnly")) {
                this.showSqlOnly(model.getShowSqlOnly());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("destinationSqlTuningSetName")) {
                this.destinationSqlTuningSetName(model.getDestinationSqlTuningSetName());
            }
            if (model.wasPropertyExplicitlySet("destinationSqlTuningSetDescription")) {
                this.destinationSqlTuningSetDescription(
                        model.getDestinationSqlTuningSetDescription());
            }
            if (model.wasPropertyExplicitlySet("destinationSqlTuningSetOwner")) {
                this.destinationSqlTuningSetOwner(model.getDestinationSqlTuningSetOwner());
            }
            if (model.wasPropertyExplicitlySet("createNew")) {
                this.createNew(model.getCreateNew());
            }
            if (model.wasPropertyExplicitlySet("basicFilter")) {
                this.basicFilter(model.getBasicFilter());
            }
            if (model.wasPropertyExplicitlySet("planFilter")) {
                this.planFilter(model.getPlanFilter());
            }
            if (model.wasPropertyExplicitlySet("recursiveSql")) {
                this.recursiveSql(model.getRecursiveSql());
            }
            if (model.wasPropertyExplicitlySet("resultPercentage")) {
                this.resultPercentage(model.getResultPercentage());
            }
            if (model.wasPropertyExplicitlySet("resultLimit")) {
                this.resultLimit(model.getResultLimit());
            }
            if (model.wasPropertyExplicitlySet("rankingMeasure1")) {
                this.rankingMeasure1(model.getRankingMeasure1());
            }
            if (model.wasPropertyExplicitlySet("rankingMeasure2")) {
                this.rankingMeasure2(model.getRankingMeasure2());
            }
            if (model.wasPropertyExplicitlySet("rankingMeasure3")) {
                this.rankingMeasure3(model.getRankingMeasure3());
            }
            if (model.wasPropertyExplicitlySet("attributeList")) {
                this.attributeList(model.getAttributeList());
            }
            if (model.wasPropertyExplicitlySet("loadOption")) {
                this.loadOption(model.getLoadOption());
            }
            if (model.wasPropertyExplicitlySet("updateOption")) {
                this.updateOption(model.getUpdateOption());
            }
            if (model.wasPropertyExplicitlySet("updateCondition")) {
                this.updateCondition(model.getUpdateCondition());
            }
            if (model.wasPropertyExplicitlySet("updateAttributes")) {
                this.updateAttributes(model.getUpdateAttributes());
            }
            if (model.wasPropertyExplicitlySet("isIgnoreNull")) {
                this.isIgnoreNull(model.getIsIgnoreNull());
            }
            if (model.wasPropertyExplicitlySet("commitRows")) {
                this.commitRows(model.getCommitRows());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final SqlTuningSetAdminCredentialDetails credentialDetails;

    public SqlTuningSetAdminCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final DatabaseCredentialDetails databaseCredential;

    public DatabaseCredentialDetails getDatabaseCredential() {
        return databaseCredential;
    }

    /**
     * Flag to indicate whether to save the Sql tuning set or just display the plsql used to save
     * Sql tuning set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("showSqlOnly")
    private final Integer showSqlOnly;

    /**
     * Flag to indicate whether to save the Sql tuning set or just display the plsql used to save
     * Sql tuning set.
     *
     * @return the value
     */
    public Integer getShowSqlOnly() {
        return showSqlOnly;
    }

    /** The owner of the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * The owner of the Sql tuning set.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    /** The name of the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Sql tuning set.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The name of the destination Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationSqlTuningSetName")
    private final String destinationSqlTuningSetName;

    /**
     * The name of the destination Sql tuning set.
     *
     * @return the value
     */
    public String getDestinationSqlTuningSetName() {
        return destinationSqlTuningSetName;
    }

    /** The description for the destination Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationSqlTuningSetDescription")
    private final String destinationSqlTuningSetDescription;

    /**
     * The description for the destination Sql tuning set.
     *
     * @return the value
     */
    public String getDestinationSqlTuningSetDescription() {
        return destinationSqlTuningSetDescription;
    }

    /** Owner of the destination Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationSqlTuningSetOwner")
    private final String destinationSqlTuningSetOwner;

    /**
     * Owner of the destination Sql tuning set.
     *
     * @return the value
     */
    public String getDestinationSqlTuningSetOwner() {
        return destinationSqlTuningSetOwner;
    }

    /**
     * Specifies whether to create a new Sql tuning set or not. Possible values 1 - Create a new Sql
     * tuning set 0 - Do not create a new Sql tuning set
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createNew")
    private final Integer createNew;

    /**
     * Specifies whether to create a new Sql tuning set or not. Possible values 1 - Create a new Sql
     * tuning set 0 - Do not create a new Sql tuning set
     *
     * @return the value
     */
    public Integer getCreateNew() {
        return createNew;
    }

    /**
     * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on attributes
     * of the SQLSET_ROW. User could use any combination of the following columns with appropriate
     * values as Sql predicate Refer to the documentation
     * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basicFilter")
    private final String basicFilter;

    /**
     * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on attributes
     * of the SQLSET_ROW. User could use any combination of the following columns with appropriate
     * values as Sql predicate Refer to the documentation
     * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
     *
     * @return the value
     */
    public String getBasicFilter() {
        return basicFilter;
    }

    /**
     * Specifies the plan filter. This parameter enables you to select a single plan when a
     * statement has multiple plans. Refer to the documentation
     * https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_SQLSET.html#GUID-9D995019-91AB-4B1E-9EAF-031050789B21
     */
    public enum PlanFilter implements com.oracle.bmc.http.internal.BmcEnum {
        LastGenerated("LAST_GENERATED"),
        FirstGenerated("FIRST_GENERATED"),
        LastLoaded("LAST_LOADED"),
        FirstLoaded("FIRST_LOADED"),
        MaxElapsedTime("MAX_ELAPSED_TIME"),
        MaxBufferGets("MAX_BUFFER_GETS"),
        MaxDiskReads("MAX_DISK_READS"),
        MaxDirectWrites("MAX_DIRECT_WRITES"),
        MaxOptimizerCost("MAX_OPTIMIZER_COST"),
        ;

        private final String value;
        private static java.util.Map<String, PlanFilter> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanFilter v : PlanFilter.values()) {
                map.put(v.getValue(), v);
            }
        }

        PlanFilter(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlanFilter create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PlanFilter: " + key);
        }
    };
    /**
     * Specifies the plan filter. This parameter enables you to select a single plan when a
     * statement has multiple plans. Refer to the documentation
     * https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_SQLSET.html#GUID-9D995019-91AB-4B1E-9EAF-031050789B21
     */
    @com.fasterxml.jackson.annotation.JsonProperty("planFilter")
    private final PlanFilter planFilter;

    /**
     * Specifies the plan filter. This parameter enables you to select a single plan when a
     * statement has multiple plans. Refer to the documentation
     * https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_SQLSET.html#GUID-9D995019-91AB-4B1E-9EAF-031050789B21
     *
     * @return the value
     */
    public PlanFilter getPlanFilter() {
        return planFilter;
    }

    /** Specifies that the filter must include recursive Sql in the Sql tuning set. */
    public enum RecursiveSql implements com.oracle.bmc.http.internal.BmcEnum {
        HasRecursiveSql("HAS_RECURSIVE_SQL"),
        NoRecursiveSql("NO_RECURSIVE_SQL"),
        ;

        private final String value;
        private static java.util.Map<String, RecursiveSql> map;

        static {
            map = new java.util.HashMap<>();
            for (RecursiveSql v : RecursiveSql.values()) {
                map.put(v.getValue(), v);
            }
        }

        RecursiveSql(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecursiveSql create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RecursiveSql: " + key);
        }
    };
    /** Specifies that the filter must include recursive Sql in the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("recursiveSql")
    private final RecursiveSql recursiveSql;

    /**
     * Specifies that the filter must include recursive Sql in the Sql tuning set.
     *
     * @return the value
     */
    public RecursiveSql getRecursiveSql() {
        return recursiveSql;
    }

    /**
     * Specifies a filter that picks the top n% according to the supplied ranking measure. Note that
     * this parameter applies only if one ranking measure is supplied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resultPercentage")
    private final Double resultPercentage;

    /**
     * Specifies a filter that picks the top n% according to the supplied ranking measure. Note that
     * this parameter applies only if one ranking measure is supplied.
     *
     * @return the value
     */
    public Double getResultPercentage() {
        return resultPercentage;
    }

    /** The top limit Sql from the filtered source, ranked by the ranking measure. */
    @com.fasterxml.jackson.annotation.JsonProperty("resultLimit")
    private final Integer resultLimit;

    /**
     * The top limit Sql from the filtered source, ranked by the ranking measure.
     *
     * @return the value
     */
    public Integer getResultLimit() {
        return resultLimit;
    }

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure1")
    private final RankingMeasure rankingMeasure1;

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     *
     * @return the value
     */
    public RankingMeasure getRankingMeasure1() {
        return rankingMeasure1;
    }

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure2")
    private final RankingMeasure rankingMeasure2;

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     *
     * @return the value
     */
    public RankingMeasure getRankingMeasure2() {
        return rankingMeasure2;
    }

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure3")
    private final RankingMeasure rankingMeasure3;

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     *
     * @return the value
     */
    public RankingMeasure getRankingMeasure3() {
        return rankingMeasure3;
    }

    /**
     * Specifies the list of Sql statement attributes to return in the result. Note that this
     * parameter cannot be made an enum since custom value can take a list of comma separated
     * attribute names. Attribute list can take one of the following values. TYPICAL - Specifies
     * BASIC plus Sql plan (without row source statistics) and without object reference list
     * (default). BASIC - Specifies all attributes (such as execution statistics and binds) except
     * the plans. The execution context is always part of the result. ALL - Specifies all
     * attributes. CUSTOM - Comma-separated list of the following attribute names. -
     * EXECUTION_STATISTICS - BIND_LIST - OBJECT_LIST - SQL_PLAN - SQL_PLAN_STATISTICS Usage
     * examples: 1. "attributeList": "TYPICAL" 2. "attributeList": "ALL" 3. "attributeList":
     * "EXECUTION_STATISTICS,OBJECT_LIST,SQL_PLAN"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeList")
    private final String attributeList;

    /**
     * Specifies the list of Sql statement attributes to return in the result. Note that this
     * parameter cannot be made an enum since custom value can take a list of comma separated
     * attribute names. Attribute list can take one of the following values. TYPICAL - Specifies
     * BASIC plus Sql plan (without row source statistics) and without object reference list
     * (default). BASIC - Specifies all attributes (such as execution statistics and binds) except
     * the plans. The execution context is always part of the result. ALL - Specifies all
     * attributes. CUSTOM - Comma-separated list of the following attribute names. -
     * EXECUTION_STATISTICS - BIND_LIST - OBJECT_LIST - SQL_PLAN - SQL_PLAN_STATISTICS Usage
     * examples: 1. "attributeList": "TYPICAL" 2. "attributeList": "ALL" 3. "attributeList":
     * "EXECUTION_STATISTICS,OBJECT_LIST,SQL_PLAN"
     *
     * @return the value
     */
    public String getAttributeList() {
        return attributeList;
    }

    /**
     * Specifies which statements are loaded into the Sql tuning set. The possible values are. -
     * INSERT (default) Adds only new statements. - UPDATE Updates existing the Sql statements and
     * ignores any new statements. - MERGE Inserts new statements and updates the information of the
     * existing ones.
     */
    public enum LoadOption implements com.oracle.bmc.http.internal.BmcEnum {
        Insert("INSERT"),
        Update("UPDATE"),
        Merge("MERGE"),
        ;

        private final String value;
        private static java.util.Map<String, LoadOption> map;

        static {
            map = new java.util.HashMap<>();
            for (LoadOption v : LoadOption.values()) {
                map.put(v.getValue(), v);
            }
        }

        LoadOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LoadOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LoadOption: " + key);
        }
    };
    /**
     * Specifies which statements are loaded into the Sql tuning set. The possible values are. -
     * INSERT (default) Adds only new statements. - UPDATE Updates existing the Sql statements and
     * ignores any new statements. - MERGE Inserts new statements and updates the information of the
     * existing ones.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadOption")
    private final LoadOption loadOption;

    /**
     * Specifies which statements are loaded into the Sql tuning set. The possible values are. -
     * INSERT (default) Adds only new statements. - UPDATE Updates existing the Sql statements and
     * ignores any new statements. - MERGE Inserts new statements and updates the information of the
     * existing ones.
     *
     * @return the value
     */
    public LoadOption getLoadOption() {
        return loadOption;
    }

    /**
     * Specifies how existing Sql statements are updated. This parameter is applicable only if
     * load_option is specified with UPDATE or MERGE as an option. Update option can take one of the
     * following values. REPLACE (default) - Updates the statement using the new statistics, bind
     * list, object list, and so on. ACCUMULATE - Combines attributes when possible (for example,
     * statistics such as elapsed_time), otherwise replaces the existing values (for example, module
     * and action) with the provided values. Following Sql statement attributes can be accumulated.
     * elapsed_time buffer_gets direct_writes disk_reads row_processed fetches executions
     * end_of_fetch_count stat_period active_stat_period
     */
    public enum UpdateOption implements com.oracle.bmc.http.internal.BmcEnum {
        Replace("REPLACE"),
        Accumulate("ACCUMULATE"),
        ;

        private final String value;
        private static java.util.Map<String, UpdateOption> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateOption v : UpdateOption.values()) {
                map.put(v.getValue(), v);
            }
        }

        UpdateOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UpdateOption: " + key);
        }
    };
    /**
     * Specifies how existing Sql statements are updated. This parameter is applicable only if
     * load_option is specified with UPDATE or MERGE as an option. Update option can take one of the
     * following values. REPLACE (default) - Updates the statement using the new statistics, bind
     * list, object list, and so on. ACCUMULATE - Combines attributes when possible (for example,
     * statistics such as elapsed_time), otherwise replaces the existing values (for example, module
     * and action) with the provided values. Following Sql statement attributes can be accumulated.
     * elapsed_time buffer_gets direct_writes disk_reads row_processed fetches executions
     * end_of_fetch_count stat_period active_stat_period
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateOption")
    private final UpdateOption updateOption;

    /**
     * Specifies how existing Sql statements are updated. This parameter is applicable only if
     * load_option is specified with UPDATE or MERGE as an option. Update option can take one of the
     * following values. REPLACE (default) - Updates the statement using the new statistics, bind
     * list, object list, and so on. ACCUMULATE - Combines attributes when possible (for example,
     * statistics such as elapsed_time), otherwise replaces the existing values (for example, module
     * and action) with the provided values. Following Sql statement attributes can be accumulated.
     * elapsed_time buffer_gets direct_writes disk_reads row_processed fetches executions
     * end_of_fetch_count stat_period active_stat_period
     *
     * @return the value
     */
    public UpdateOption getUpdateOption() {
        return updateOption;
    }

    /**
     * Specifies when to perform the update. The procedure only performs the update when the
     * specified condition is satisfied. The condition can refer to either the data source or
     * destination. The condition must use the following prefixes to refer to attributes from the
     * source or the destination: OLD \u2014 Refers to statement attributes from the SQL tuning set
     * (destination). NEW \u2014 Refers to statement attributes from the input statements (source).
     * NULL \u2014 No updates are performed.
     */
    public enum UpdateCondition implements com.oracle.bmc.http.internal.BmcEnum {
        Old("OLD"),
        New("NEW"),
        Null("NULL"),
        ;

        private final String value;
        private static java.util.Map<String, UpdateCondition> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateCondition v : UpdateCondition.values()) {
                map.put(v.getValue(), v);
            }
        }

        UpdateCondition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateCondition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UpdateCondition: " + key);
        }
    };
    /**
     * Specifies when to perform the update. The procedure only performs the update when the
     * specified condition is satisfied. The condition can refer to either the data source or
     * destination. The condition must use the following prefixes to refer to attributes from the
     * source or the destination: OLD \u2014 Refers to statement attributes from the SQL tuning set
     * (destination). NEW \u2014 Refers to statement attributes from the input statements (source).
     * NULL \u2014 No updates are performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateCondition")
    private final UpdateCondition updateCondition;

    /**
     * Specifies when to perform the update. The procedure only performs the update when the
     * specified condition is satisfied. The condition can refer to either the data source or
     * destination. The condition must use the following prefixes to refer to attributes from the
     * source or the destination: OLD \u2014 Refers to statement attributes from the SQL tuning set
     * (destination). NEW \u2014 Refers to statement attributes from the input statements (source).
     * NULL \u2014 No updates are performed.
     *
     * @return the value
     */
    public UpdateCondition getUpdateCondition() {
        return updateCondition;
    }

    /**
     * Specifies the list of Sql statement attributes to update during a merge or update. Note that
     * this parameter cannot be made an enum since custom value can take a list of comma separated
     * attribute names. Update attributes can take one of the following values. NULL (default) -
     * Specifies the content of the input cursor except the execution context. On other terms, it is
     * equivalent to ALL without execution contexts such as module and action. BASIC - Specifies
     * statistics and binds only. TYPICAL - Specifies BASIC with Sql plans (without row source
     * statistics) and without an object reference list. ALL - Specifies all attributes, including
     * the execution context attributes such as module and action. CUSTOM - List of comma separated
     * attribute names to update EXECUTION_CONTEXT EXECUTION_STATISTICS SQL_BINDS SQL_PLAN
     * SQL_PLAN_STATISTICS (similar to SQL_PLAN with added row source statistics) Usage examples: 1.
     * "updateAttributes": "TYPICAL" 2. "updateAttributes": "BASIC" 3. "updateAttributes":
     * "EXECUTION_STATISTICS,SQL_PLAN_STATISTICS,SQL_PLAN" 4. "updateAttributes":
     * "EXECUTION_STATISTICS,SQL_PLAN"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateAttributes")
    private final String updateAttributes;

    /**
     * Specifies the list of Sql statement attributes to update during a merge or update. Note that
     * this parameter cannot be made an enum since custom value can take a list of comma separated
     * attribute names. Update attributes can take one of the following values. NULL (default) -
     * Specifies the content of the input cursor except the execution context. On other terms, it is
     * equivalent to ALL without execution contexts such as module and action. BASIC - Specifies
     * statistics and binds only. TYPICAL - Specifies BASIC with Sql plans (without row source
     * statistics) and without an object reference list. ALL - Specifies all attributes, including
     * the execution context attributes such as module and action. CUSTOM - List of comma separated
     * attribute names to update EXECUTION_CONTEXT EXECUTION_STATISTICS SQL_BINDS SQL_PLAN
     * SQL_PLAN_STATISTICS (similar to SQL_PLAN with added row source statistics) Usage examples: 1.
     * "updateAttributes": "TYPICAL" 2. "updateAttributes": "BASIC" 3. "updateAttributes":
     * "EXECUTION_STATISTICS,SQL_PLAN_STATISTICS,SQL_PLAN" 4. "updateAttributes":
     * "EXECUTION_STATISTICS,SQL_PLAN"
     *
     * @return the value
     */
    public String getUpdateAttributes() {
        return updateAttributes;
    }

    /**
     * Specifies whether to update attributes when the new value is NULL. If TRUE, then the
     * procedure does not update an attribute when the new value is NULL. That is, do not override
     * with NULL values unless intentional. Possible values - true or false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreNull")
    private final Boolean isIgnoreNull;

    /**
     * Specifies whether to update attributes when the new value is NULL. If TRUE, then the
     * procedure does not update an attribute when the new value is NULL. That is, do not override
     * with NULL values unless intentional. Possible values - true or false
     *
     * @return the value
     */
    public Boolean getIsIgnoreNull() {
        return isIgnoreNull;
    }

    /**
     * Specifies whether to commit statements after DML. If a value is provided, then the load
     * commits after each specified number of statements is inserted. If NULL is provided, then the
     * load commits only once, at the end of the operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commitRows")
    private final Integer commitRows;

    /**
     * Specifies whether to commit statements after DML. If a value is provided, then the load
     * commits after each specified number of statements is inserted. If NULL is provided, then the
     * load commits only once, at the end of the operation.
     *
     * @return the value
     */
    public Integer getCommitRows() {
        return commitRows;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SaveSqlTuningSetAsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(", showSqlOnly=").append(String.valueOf(this.showSqlOnly));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", destinationSqlTuningSetName=")
                .append(String.valueOf(this.destinationSqlTuningSetName));
        sb.append(", destinationSqlTuningSetDescription=")
                .append(String.valueOf(this.destinationSqlTuningSetDescription));
        sb.append(", destinationSqlTuningSetOwner=")
                .append(String.valueOf(this.destinationSqlTuningSetOwner));
        sb.append(", createNew=").append(String.valueOf(this.createNew));
        sb.append(", basicFilter=").append(String.valueOf(this.basicFilter));
        sb.append(", planFilter=").append(String.valueOf(this.planFilter));
        sb.append(", recursiveSql=").append(String.valueOf(this.recursiveSql));
        sb.append(", resultPercentage=").append(String.valueOf(this.resultPercentage));
        sb.append(", resultLimit=").append(String.valueOf(this.resultLimit));
        sb.append(", rankingMeasure1=").append(String.valueOf(this.rankingMeasure1));
        sb.append(", rankingMeasure2=").append(String.valueOf(this.rankingMeasure2));
        sb.append(", rankingMeasure3=").append(String.valueOf(this.rankingMeasure3));
        sb.append(", attributeList=").append(String.valueOf(this.attributeList));
        sb.append(", loadOption=").append(String.valueOf(this.loadOption));
        sb.append(", updateOption=").append(String.valueOf(this.updateOption));
        sb.append(", updateCondition=").append(String.valueOf(this.updateCondition));
        sb.append(", updateAttributes=").append(String.valueOf(this.updateAttributes));
        sb.append(", isIgnoreNull=").append(String.valueOf(this.isIgnoreNull));
        sb.append(", commitRows=").append(String.valueOf(this.commitRows));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SaveSqlTuningSetAsDetails)) {
            return false;
        }

        SaveSqlTuningSetAsDetails other = (SaveSqlTuningSetAsDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && java.util.Objects.equals(this.showSqlOnly, other.showSqlOnly)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.destinationSqlTuningSetName, other.destinationSqlTuningSetName)
                && java.util.Objects.equals(
                        this.destinationSqlTuningSetDescription,
                        other.destinationSqlTuningSetDescription)
                && java.util.Objects.equals(
                        this.destinationSqlTuningSetOwner, other.destinationSqlTuningSetOwner)
                && java.util.Objects.equals(this.createNew, other.createNew)
                && java.util.Objects.equals(this.basicFilter, other.basicFilter)
                && java.util.Objects.equals(this.planFilter, other.planFilter)
                && java.util.Objects.equals(this.recursiveSql, other.recursiveSql)
                && java.util.Objects.equals(this.resultPercentage, other.resultPercentage)
                && java.util.Objects.equals(this.resultLimit, other.resultLimit)
                && java.util.Objects.equals(this.rankingMeasure1, other.rankingMeasure1)
                && java.util.Objects.equals(this.rankingMeasure2, other.rankingMeasure2)
                && java.util.Objects.equals(this.rankingMeasure3, other.rankingMeasure3)
                && java.util.Objects.equals(this.attributeList, other.attributeList)
                && java.util.Objects.equals(this.loadOption, other.loadOption)
                && java.util.Objects.equals(this.updateOption, other.updateOption)
                && java.util.Objects.equals(this.updateCondition, other.updateCondition)
                && java.util.Objects.equals(this.updateAttributes, other.updateAttributes)
                && java.util.Objects.equals(this.isIgnoreNull, other.isIgnoreNull)
                && java.util.Objects.equals(this.commitRows, other.commitRows)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCredential == null
                                ? 43
                                : this.databaseCredential.hashCode());
        result = (result * PRIME) + (this.showSqlOnly == null ? 43 : this.showSqlOnly.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationSqlTuningSetName == null
                                ? 43
                                : this.destinationSqlTuningSetName.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationSqlTuningSetDescription == null
                                ? 43
                                : this.destinationSqlTuningSetDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationSqlTuningSetOwner == null
                                ? 43
                                : this.destinationSqlTuningSetOwner.hashCode());
        result = (result * PRIME) + (this.createNew == null ? 43 : this.createNew.hashCode());
        result = (result * PRIME) + (this.basicFilter == null ? 43 : this.basicFilter.hashCode());
        result = (result * PRIME) + (this.planFilter == null ? 43 : this.planFilter.hashCode());
        result = (result * PRIME) + (this.recursiveSql == null ? 43 : this.recursiveSql.hashCode());
        result =
                (result * PRIME)
                        + (this.resultPercentage == null ? 43 : this.resultPercentage.hashCode());
        result = (result * PRIME) + (this.resultLimit == null ? 43 : this.resultLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.rankingMeasure1 == null ? 43 : this.rankingMeasure1.hashCode());
        result =
                (result * PRIME)
                        + (this.rankingMeasure2 == null ? 43 : this.rankingMeasure2.hashCode());
        result =
                (result * PRIME)
                        + (this.rankingMeasure3 == null ? 43 : this.rankingMeasure3.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeList == null ? 43 : this.attributeList.hashCode());
        result = (result * PRIME) + (this.loadOption == null ? 43 : this.loadOption.hashCode());
        result = (result * PRIME) + (this.updateOption == null ? 43 : this.updateOption.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCondition == null ? 43 : this.updateCondition.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAttributes == null ? 43 : this.updateAttributes.hashCode());
        result = (result * PRIME) + (this.isIgnoreNull == null ? 43 : this.isIgnoreNull.hashCode());
        result = (result * PRIME) + (this.commitRows == null ? 43 : this.commitRows.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
