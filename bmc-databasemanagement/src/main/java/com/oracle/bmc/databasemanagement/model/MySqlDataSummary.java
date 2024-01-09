/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The SQL performance data record for a specific SQL query. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MySqlDataSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlDataSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemaName",
        "digest",
        "digestText",
        "countStar",
        "sumTimerWait",
        "minTimerWait",
        "avgTimerWait",
        "maxTimerWait",
        "sumLockTime",
        "sumErrors",
        "sumWarnings",
        "sumRowsAffected",
        "sumRowsSent",
        "sumRowsExamined",
        "sumCreatedTempDiskTables",
        "sumCreatedTempTables",
        "sumSelectFullJoin",
        "sumSelectFullRangeJoin",
        "sumSelectRange",
        "sumSelectRangeCheck",
        "sumSelectScan",
        "sumSortMergePasses",
        "sumSortRange",
        "sumSortRows",
        "sumSortScan",
        "sumNoIndexUsed",
        "sumNoGoodIndexUsed",
        "firstSeen",
        "lastSeen",
        "quantile95",
        "quantile99",
        "quantile999"
    })
    public MySqlDataSummary(
            String schemaName,
            String digest,
            String digestText,
            java.math.BigDecimal countStar,
            java.math.BigDecimal sumTimerWait,
            java.math.BigDecimal minTimerWait,
            java.math.BigDecimal avgTimerWait,
            java.math.BigDecimal maxTimerWait,
            java.math.BigDecimal sumLockTime,
            java.math.BigDecimal sumErrors,
            java.math.BigDecimal sumWarnings,
            java.math.BigDecimal sumRowsAffected,
            java.math.BigDecimal sumRowsSent,
            java.math.BigDecimal sumRowsExamined,
            java.math.BigDecimal sumCreatedTempDiskTables,
            java.math.BigDecimal sumCreatedTempTables,
            java.math.BigDecimal sumSelectFullJoin,
            java.math.BigDecimal sumSelectFullRangeJoin,
            java.math.BigDecimal sumSelectRange,
            java.math.BigDecimal sumSelectRangeCheck,
            java.math.BigDecimal sumSelectScan,
            java.math.BigDecimal sumSortMergePasses,
            java.math.BigDecimal sumSortRange,
            java.math.BigDecimal sumSortRows,
            java.math.BigDecimal sumSortScan,
            java.math.BigDecimal sumNoIndexUsed,
            java.math.BigDecimal sumNoGoodIndexUsed,
            java.util.Date firstSeen,
            java.util.Date lastSeen,
            java.math.BigDecimal quantile95,
            java.math.BigDecimal quantile99,
            java.math.BigDecimal quantile999) {
        super();
        this.schemaName = schemaName;
        this.digest = digest;
        this.digestText = digestText;
        this.countStar = countStar;
        this.sumTimerWait = sumTimerWait;
        this.minTimerWait = minTimerWait;
        this.avgTimerWait = avgTimerWait;
        this.maxTimerWait = maxTimerWait;
        this.sumLockTime = sumLockTime;
        this.sumErrors = sumErrors;
        this.sumWarnings = sumWarnings;
        this.sumRowsAffected = sumRowsAffected;
        this.sumRowsSent = sumRowsSent;
        this.sumRowsExamined = sumRowsExamined;
        this.sumCreatedTempDiskTables = sumCreatedTempDiskTables;
        this.sumCreatedTempTables = sumCreatedTempTables;
        this.sumSelectFullJoin = sumSelectFullJoin;
        this.sumSelectFullRangeJoin = sumSelectFullRangeJoin;
        this.sumSelectRange = sumSelectRange;
        this.sumSelectRangeCheck = sumSelectRangeCheck;
        this.sumSelectScan = sumSelectScan;
        this.sumSortMergePasses = sumSortMergePasses;
        this.sumSortRange = sumSortRange;
        this.sumSortRows = sumSortRows;
        this.sumSortScan = sumSortScan;
        this.sumNoIndexUsed = sumNoIndexUsed;
        this.sumNoGoodIndexUsed = sumNoGoodIndexUsed;
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
        this.quantile95 = quantile95;
        this.quantile99 = quantile99;
        this.quantile999 = quantile999;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the default schema when executing the query. If a schema is not set as the
         * default, then the value is NULL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The name of the default schema when executing the query. If a schema is not set as the
         * default, then the value is NULL.
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** The digest information of the normalized query. */
        @com.fasterxml.jackson.annotation.JsonProperty("digest")
        private String digest;

        /**
         * The digest information of the normalized query.
         *
         * @param digest the value to set
         * @return this builder
         */
        public Builder digest(String digest) {
            this.digest = digest;
            this.__explicitlySet__.add("digest");
            return this;
        }
        /** The normalized query. */
        @com.fasterxml.jackson.annotation.JsonProperty("digestText")
        private String digestText;

        /**
         * The normalized query.
         *
         * @param digestText the value to set
         * @return this builder
         */
        public Builder digestText(String digestText) {
            this.digestText = digestText;
            this.__explicitlySet__.add("digestText");
            return this;
        }
        /** The number Of times the query has been executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("countStar")
        private java.math.BigDecimal countStar;

        /**
         * The number Of times the query has been executed.
         *
         * @param countStar the value to set
         * @return this builder
         */
        public Builder countStar(java.math.BigDecimal countStar) {
            this.countStar = countStar;
            this.__explicitlySet__.add("countStar");
            return this;
        }
        /** The total amount of time that has been spent executing the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("sumTimerWait")
        private java.math.BigDecimal sumTimerWait;

        /**
         * The total amount of time that has been spent executing the query.
         *
         * @param sumTimerWait the value to set
         * @return this builder
         */
        public Builder sumTimerWait(java.math.BigDecimal sumTimerWait) {
            this.sumTimerWait = sumTimerWait;
            this.__explicitlySet__.add("sumTimerWait");
            return this;
        }
        /** The fastest the query has been executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("minTimerWait")
        private java.math.BigDecimal minTimerWait;

        /**
         * The fastest the query has been executed.
         *
         * @param minTimerWait the value to set
         * @return this builder
         */
        public Builder minTimerWait(java.math.BigDecimal minTimerWait) {
            this.minTimerWait = minTimerWait;
            this.__explicitlySet__.add("minTimerWait");
            return this;
        }
        /** The average execution time. */
        @com.fasterxml.jackson.annotation.JsonProperty("avgTimerWait")
        private java.math.BigDecimal avgTimerWait;

        /**
         * The average execution time.
         *
         * @param avgTimerWait the value to set
         * @return this builder
         */
        public Builder avgTimerWait(java.math.BigDecimal avgTimerWait) {
            this.avgTimerWait = avgTimerWait;
            this.__explicitlySet__.add("avgTimerWait");
            return this;
        }
        /** The slowest the query has been executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTimerWait")
        private java.math.BigDecimal maxTimerWait;

        /**
         * The slowest the query has been executed.
         *
         * @param maxTimerWait the value to set
         * @return this builder
         */
        public Builder maxTimerWait(java.math.BigDecimal maxTimerWait) {
            this.maxTimerWait = maxTimerWait;
            this.__explicitlySet__.add("maxTimerWait");
            return this;
        }
        /** The total amount of time that has been spent waiting for table locks. */
        @com.fasterxml.jackson.annotation.JsonProperty("sumLockTime")
        private java.math.BigDecimal sumLockTime;

        /**
         * The total amount of time that has been spent waiting for table locks.
         *
         * @param sumLockTime the value to set
         * @return this builder
         */
        public Builder sumLockTime(java.math.BigDecimal sumLockTime) {
            this.sumLockTime = sumLockTime;
            this.__explicitlySet__.add("sumLockTime");
            return this;
        }
        /** The total number of errors that have been encountered executing the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("sumErrors")
        private java.math.BigDecimal sumErrors;

        /**
         * The total number of errors that have been encountered executing the query.
         *
         * @param sumErrors the value to set
         * @return this builder
         */
        public Builder sumErrors(java.math.BigDecimal sumErrors) {
            this.sumErrors = sumErrors;
            this.__explicitlySet__.add("sumErrors");
            return this;
        }
        /** The total number of warnings that have been encountered executing the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("sumWarnings")
        private java.math.BigDecimal sumWarnings;

        /**
         * The total number of warnings that have been encountered executing the query.
         *
         * @param sumWarnings the value to set
         * @return this builder
         */
        public Builder sumWarnings(java.math.BigDecimal sumWarnings) {
            this.sumWarnings = sumWarnings;
            this.__explicitlySet__.add("sumWarnings");
            return this;
        }
        /** The total number of rows that have been modified by the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("sumRowsAffected")
        private java.math.BigDecimal sumRowsAffected;

        /**
         * The total number of rows that have been modified by the query.
         *
         * @param sumRowsAffected the value to set
         * @return this builder
         */
        public Builder sumRowsAffected(java.math.BigDecimal sumRowsAffected) {
            this.sumRowsAffected = sumRowsAffected;
            this.__explicitlySet__.add("sumRowsAffected");
            return this;
        }
        /** The total number of rows that have been returned (sent) to the client. */
        @com.fasterxml.jackson.annotation.JsonProperty("sumRowsSent")
        private java.math.BigDecimal sumRowsSent;

        /**
         * The total number of rows that have been returned (sent) to the client.
         *
         * @param sumRowsSent the value to set
         * @return this builder
         */
        public Builder sumRowsSent(java.math.BigDecimal sumRowsSent) {
            this.sumRowsSent = sumRowsSent;
            this.__explicitlySet__.add("sumRowsSent");
            return this;
        }
        /** The total number of rows that have been examined by the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("sumRowsExamined")
        private java.math.BigDecimal sumRowsExamined;

        /**
         * The total number of rows that have been examined by the query.
         *
         * @param sumRowsExamined the value to set
         * @return this builder
         */
        public Builder sumRowsExamined(java.math.BigDecimal sumRowsExamined) {
            this.sumRowsExamined = sumRowsExamined;
            this.__explicitlySet__.add("sumRowsExamined");
            return this;
        }
        /**
         * The total number of On-Disk internal temporary tables that have been created by the
         * query.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumCreatedTempDiskTables")
        private java.math.BigDecimal sumCreatedTempDiskTables;

        /**
         * The total number of On-Disk internal temporary tables that have been created by the
         * query.
         *
         * @param sumCreatedTempDiskTables the value to set
         * @return this builder
         */
        public Builder sumCreatedTempDiskTables(java.math.BigDecimal sumCreatedTempDiskTables) {
            this.sumCreatedTempDiskTables = sumCreatedTempDiskTables;
            this.__explicitlySet__.add("sumCreatedTempDiskTables");
            return this;
        }
        /**
         * The total number of internal temporary tables (in memory or on disk), which have been
         * created by the query.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumCreatedTempTables")
        private java.math.BigDecimal sumCreatedTempTables;

        /**
         * The total number of internal temporary tables (in memory or on disk), which have been
         * created by the query.
         *
         * @param sumCreatedTempTables the value to set
         * @return this builder
         */
        public Builder sumCreatedTempTables(java.math.BigDecimal sumCreatedTempTables) {
            this.sumCreatedTempTables = sumCreatedTempTables;
            this.__explicitlySet__.add("sumCreatedTempTables");
            return this;
        }
        /**
         * The total number of joins that have performed full table scans as there was no join
         * condition or no index for the join condition. This is the same as the select_full_join
         * status variable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumSelectFullJoin")
        private java.math.BigDecimal sumSelectFullJoin;

        /**
         * The total number of joins that have performed full table scans as there was no join
         * condition or no index for the join condition. This is the same as the select_full_join
         * status variable.
         *
         * @param sumSelectFullJoin the value to set
         * @return this builder
         */
        public Builder sumSelectFullJoin(java.math.BigDecimal sumSelectFullJoin) {
            this.sumSelectFullJoin = sumSelectFullJoin;
            this.__explicitlySet__.add("sumSelectFullJoin");
            return this;
        }
        /**
         * The total number of joins that use a full range search. This is the same as the
         * select_full_range_join status variable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumSelectFullRangeJoin")
        private java.math.BigDecimal sumSelectFullRangeJoin;

        /**
         * The total number of joins that use a full range search. This is the same as the
         * select_full_range_join status variable.
         *
         * @param sumSelectFullRangeJoin the value to set
         * @return this builder
         */
        public Builder sumSelectFullRangeJoin(java.math.BigDecimal sumSelectFullRangeJoin) {
            this.sumSelectFullRangeJoin = sumSelectFullRangeJoin;
            this.__explicitlySet__.add("sumSelectFullRangeJoin");
            return this;
        }
        /**
         * The total number of times the query has used a range search. This is the same as the
         * select_range status variable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumSelectRange")
        private java.math.BigDecimal sumSelectRange;

        /**
         * The total number of times the query has used a range search. This is the same as the
         * select_range status variable.
         *
         * @param sumSelectRange the value to set
         * @return this builder
         */
        public Builder sumSelectRange(java.math.BigDecimal sumSelectRange) {
            this.sumSelectRange = sumSelectRange;
            this.__explicitlySet__.add("sumSelectRange");
            return this;
        }
        /**
         * The total number of joins by the query where the join does not have an index that checks
         * for the index usage after each row. This is the same as the select_range_check status
         * variable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumSelectRangeCheck")
        private java.math.BigDecimal sumSelectRangeCheck;

        /**
         * The total number of joins by the query where the join does not have an index that checks
         * for the index usage after each row. This is the same as the select_range_check status
         * variable.
         *
         * @param sumSelectRangeCheck the value to set
         * @return this builder
         */
        public Builder sumSelectRangeCheck(java.math.BigDecimal sumSelectRangeCheck) {
            this.sumSelectRangeCheck = sumSelectRangeCheck;
            this.__explicitlySet__.add("sumSelectRangeCheck");
            return this;
        }
        /**
         * The total number of times the query has performed a full table scan on the first table in
         * the join. This is the same as the select_scan status variable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumSelectScan")
        private java.math.BigDecimal sumSelectScan;

        /**
         * The total number of times the query has performed a full table scan on the first table in
         * the join. This is the same as the select_scan status variable.
         *
         * @param sumSelectScan the value to set
         * @return this builder
         */
        public Builder sumSelectScan(java.math.BigDecimal sumSelectScan) {
            this.sumSelectScan = sumSelectScan;
            this.__explicitlySet__.add("sumSelectScan");
            return this;
        }
        /**
         * The total number of sort merge passes that have been done to sort the result of the
         * query. This is the same as the sort_merge_passes status variable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumSortMergePasses")
        private java.math.BigDecimal sumSortMergePasses;

        /**
         * The total number of sort merge passes that have been done to sort the result of the
         * query. This is the same as the sort_merge_passes status variable.
         *
         * @param sumSortMergePasses the value to set
         * @return this builder
         */
        public Builder sumSortMergePasses(java.math.BigDecimal sumSortMergePasses) {
            this.sumSortMergePasses = sumSortMergePasses;
            this.__explicitlySet__.add("sumSortMergePasses");
            return this;
        }
        /**
         * The total number of times a sort was done using ranges. This is the same as the
         * sort_range status variable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumSortRange")
        private java.math.BigDecimal sumSortRange;

        /**
         * The total number of times a sort was done using ranges. This is the same as the
         * sort_range status variable.
         *
         * @param sumSortRange the value to set
         * @return this builder
         */
        public Builder sumSortRange(java.math.BigDecimal sumSortRange) {
            this.sumSortRange = sumSortRange;
            this.__explicitlySet__.add("sumSortRange");
            return this;
        }
        /** The total number of rows sorted. This is the same as the sort_rowsStatus variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("sumSortRows")
        private java.math.BigDecimal sumSortRows;

        /**
         * The total number of rows sorted. This is the same as the sort_rowsStatus variable.
         *
         * @param sumSortRows the value to set
         * @return this builder
         */
        public Builder sumSortRows(java.math.BigDecimal sumSortRows) {
            this.sumSortRows = sumSortRows;
            this.__explicitlySet__.add("sumSortRows");
            return this;
        }
        /**
         * The total number of times a sort was done by scanning the table. This is the same as the
         * sort_scan status variable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumSortScan")
        private java.math.BigDecimal sumSortScan;

        /**
         * The total number of times a sort was done by scanning the table. This is the same as the
         * sort_scan status variable.
         *
         * @param sumSortScan the value to set
         * @return this builder
         */
        public Builder sumSortScan(java.math.BigDecimal sumSortScan) {
            this.sumSortScan = sumSortScan;
            this.__explicitlySet__.add("sumSortScan");
            return this;
        }
        /** The total number of times no index was used to execute the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("sumNoIndexUsed")
        private java.math.BigDecimal sumNoIndexUsed;

        /**
         * The total number of times no index was used to execute the query.
         *
         * @param sumNoIndexUsed the value to set
         * @return this builder
         */
        public Builder sumNoIndexUsed(java.math.BigDecimal sumNoIndexUsed) {
            this.sumNoIndexUsed = sumNoIndexUsed;
            this.__explicitlySet__.add("sumNoIndexUsed");
            return this;
        }
        /**
         * The total number of times no good index was used. This means that the extra column in The
         * EXPLAIN output includes \u201CRange Checked For Each Record.\u201D
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sumNoGoodIndexUsed")
        private java.math.BigDecimal sumNoGoodIndexUsed;

        /**
         * The total number of times no good index was used. This means that the extra column in The
         * EXPLAIN output includes \u201CRange Checked For Each Record.\u201D
         *
         * @param sumNoGoodIndexUsed the value to set
         * @return this builder
         */
        public Builder sumNoGoodIndexUsed(java.math.BigDecimal sumNoGoodIndexUsed) {
            this.sumNoGoodIndexUsed = sumNoGoodIndexUsed;
            this.__explicitlySet__.add("sumNoGoodIndexUsed");
            return this;
        }
        /**
         * The date and time the query was first seen. If the table is truncated, the first seen
         * value is reset.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("firstSeen")
        private java.util.Date firstSeen;

        /**
         * The date and time the query was first seen. If the table is truncated, the first seen
         * value is reset.
         *
         * @param firstSeen the value to set
         * @return this builder
         */
        public Builder firstSeen(java.util.Date firstSeen) {
            this.firstSeen = firstSeen;
            this.__explicitlySet__.add("firstSeen");
            return this;
        }
        /** The date and time the query was last seen. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastSeen")
        private java.util.Date lastSeen;

        /**
         * The date and time the query was last seen.
         *
         * @param lastSeen the value to set
         * @return this builder
         */
        public Builder lastSeen(java.util.Date lastSeen) {
            this.lastSeen = lastSeen;
            this.__explicitlySet__.add("lastSeen");
            return this;
        }
        /**
         * The 95th percentile of the query latency. That is, 95% of the queries complete in the
         * time given or in less time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("quantile95")
        private java.math.BigDecimal quantile95;

        /**
         * The 95th percentile of the query latency. That is, 95% of the queries complete in the
         * time given or in less time.
         *
         * @param quantile95 the value to set
         * @return this builder
         */
        public Builder quantile95(java.math.BigDecimal quantile95) {
            this.quantile95 = quantile95;
            this.__explicitlySet__.add("quantile95");
            return this;
        }
        /** The 99th percentile of the query latency. */
        @com.fasterxml.jackson.annotation.JsonProperty("quantile99")
        private java.math.BigDecimal quantile99;

        /**
         * The 99th percentile of the query latency.
         *
         * @param quantile99 the value to set
         * @return this builder
         */
        public Builder quantile99(java.math.BigDecimal quantile99) {
            this.quantile99 = quantile99;
            this.__explicitlySet__.add("quantile99");
            return this;
        }
        /** The 99.9th percentile of the query latency. */
        @com.fasterxml.jackson.annotation.JsonProperty("quantile999")
        private java.math.BigDecimal quantile999;

        /**
         * The 99.9th percentile of the query latency.
         *
         * @param quantile999 the value to set
         * @return this builder
         */
        public Builder quantile999(java.math.BigDecimal quantile999) {
            this.quantile999 = quantile999;
            this.__explicitlySet__.add("quantile999");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlDataSummary build() {
            MySqlDataSummary model =
                    new MySqlDataSummary(
                            this.schemaName,
                            this.digest,
                            this.digestText,
                            this.countStar,
                            this.sumTimerWait,
                            this.minTimerWait,
                            this.avgTimerWait,
                            this.maxTimerWait,
                            this.sumLockTime,
                            this.sumErrors,
                            this.sumWarnings,
                            this.sumRowsAffected,
                            this.sumRowsSent,
                            this.sumRowsExamined,
                            this.sumCreatedTempDiskTables,
                            this.sumCreatedTempTables,
                            this.sumSelectFullJoin,
                            this.sumSelectFullRangeJoin,
                            this.sumSelectRange,
                            this.sumSelectRangeCheck,
                            this.sumSelectScan,
                            this.sumSortMergePasses,
                            this.sumSortRange,
                            this.sumSortRows,
                            this.sumSortScan,
                            this.sumNoIndexUsed,
                            this.sumNoGoodIndexUsed,
                            this.firstSeen,
                            this.lastSeen,
                            this.quantile95,
                            this.quantile99,
                            this.quantile999);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlDataSummary model) {
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("digest")) {
                this.digest(model.getDigest());
            }
            if (model.wasPropertyExplicitlySet("digestText")) {
                this.digestText(model.getDigestText());
            }
            if (model.wasPropertyExplicitlySet("countStar")) {
                this.countStar(model.getCountStar());
            }
            if (model.wasPropertyExplicitlySet("sumTimerWait")) {
                this.sumTimerWait(model.getSumTimerWait());
            }
            if (model.wasPropertyExplicitlySet("minTimerWait")) {
                this.minTimerWait(model.getMinTimerWait());
            }
            if (model.wasPropertyExplicitlySet("avgTimerWait")) {
                this.avgTimerWait(model.getAvgTimerWait());
            }
            if (model.wasPropertyExplicitlySet("maxTimerWait")) {
                this.maxTimerWait(model.getMaxTimerWait());
            }
            if (model.wasPropertyExplicitlySet("sumLockTime")) {
                this.sumLockTime(model.getSumLockTime());
            }
            if (model.wasPropertyExplicitlySet("sumErrors")) {
                this.sumErrors(model.getSumErrors());
            }
            if (model.wasPropertyExplicitlySet("sumWarnings")) {
                this.sumWarnings(model.getSumWarnings());
            }
            if (model.wasPropertyExplicitlySet("sumRowsAffected")) {
                this.sumRowsAffected(model.getSumRowsAffected());
            }
            if (model.wasPropertyExplicitlySet("sumRowsSent")) {
                this.sumRowsSent(model.getSumRowsSent());
            }
            if (model.wasPropertyExplicitlySet("sumRowsExamined")) {
                this.sumRowsExamined(model.getSumRowsExamined());
            }
            if (model.wasPropertyExplicitlySet("sumCreatedTempDiskTables")) {
                this.sumCreatedTempDiskTables(model.getSumCreatedTempDiskTables());
            }
            if (model.wasPropertyExplicitlySet("sumCreatedTempTables")) {
                this.sumCreatedTempTables(model.getSumCreatedTempTables());
            }
            if (model.wasPropertyExplicitlySet("sumSelectFullJoin")) {
                this.sumSelectFullJoin(model.getSumSelectFullJoin());
            }
            if (model.wasPropertyExplicitlySet("sumSelectFullRangeJoin")) {
                this.sumSelectFullRangeJoin(model.getSumSelectFullRangeJoin());
            }
            if (model.wasPropertyExplicitlySet("sumSelectRange")) {
                this.sumSelectRange(model.getSumSelectRange());
            }
            if (model.wasPropertyExplicitlySet("sumSelectRangeCheck")) {
                this.sumSelectRangeCheck(model.getSumSelectRangeCheck());
            }
            if (model.wasPropertyExplicitlySet("sumSelectScan")) {
                this.sumSelectScan(model.getSumSelectScan());
            }
            if (model.wasPropertyExplicitlySet("sumSortMergePasses")) {
                this.sumSortMergePasses(model.getSumSortMergePasses());
            }
            if (model.wasPropertyExplicitlySet("sumSortRange")) {
                this.sumSortRange(model.getSumSortRange());
            }
            if (model.wasPropertyExplicitlySet("sumSortRows")) {
                this.sumSortRows(model.getSumSortRows());
            }
            if (model.wasPropertyExplicitlySet("sumSortScan")) {
                this.sumSortScan(model.getSumSortScan());
            }
            if (model.wasPropertyExplicitlySet("sumNoIndexUsed")) {
                this.sumNoIndexUsed(model.getSumNoIndexUsed());
            }
            if (model.wasPropertyExplicitlySet("sumNoGoodIndexUsed")) {
                this.sumNoGoodIndexUsed(model.getSumNoGoodIndexUsed());
            }
            if (model.wasPropertyExplicitlySet("firstSeen")) {
                this.firstSeen(model.getFirstSeen());
            }
            if (model.wasPropertyExplicitlySet("lastSeen")) {
                this.lastSeen(model.getLastSeen());
            }
            if (model.wasPropertyExplicitlySet("quantile95")) {
                this.quantile95(model.getQuantile95());
            }
            if (model.wasPropertyExplicitlySet("quantile99")) {
                this.quantile99(model.getQuantile99());
            }
            if (model.wasPropertyExplicitlySet("quantile999")) {
                this.quantile999(model.getQuantile999());
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

    /**
     * The name of the default schema when executing the query. If a schema is not set as the
     * default, then the value is NULL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The name of the default schema when executing the query. If a schema is not set as the
     * default, then the value is NULL.
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** The digest information of the normalized query. */
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    private final String digest;

    /**
     * The digest information of the normalized query.
     *
     * @return the value
     */
    public String getDigest() {
        return digest;
    }

    /** The normalized query. */
    @com.fasterxml.jackson.annotation.JsonProperty("digestText")
    private final String digestText;

    /**
     * The normalized query.
     *
     * @return the value
     */
    public String getDigestText() {
        return digestText;
    }

    /** The number Of times the query has been executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("countStar")
    private final java.math.BigDecimal countStar;

    /**
     * The number Of times the query has been executed.
     *
     * @return the value
     */
    public java.math.BigDecimal getCountStar() {
        return countStar;
    }

    /** The total amount of time that has been spent executing the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("sumTimerWait")
    private final java.math.BigDecimal sumTimerWait;

    /**
     * The total amount of time that has been spent executing the query.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumTimerWait() {
        return sumTimerWait;
    }

    /** The fastest the query has been executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("minTimerWait")
    private final java.math.BigDecimal minTimerWait;

    /**
     * The fastest the query has been executed.
     *
     * @return the value
     */
    public java.math.BigDecimal getMinTimerWait() {
        return minTimerWait;
    }

    /** The average execution time. */
    @com.fasterxml.jackson.annotation.JsonProperty("avgTimerWait")
    private final java.math.BigDecimal avgTimerWait;

    /**
     * The average execution time.
     *
     * @return the value
     */
    public java.math.BigDecimal getAvgTimerWait() {
        return avgTimerWait;
    }

    /** The slowest the query has been executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTimerWait")
    private final java.math.BigDecimal maxTimerWait;

    /**
     * The slowest the query has been executed.
     *
     * @return the value
     */
    public java.math.BigDecimal getMaxTimerWait() {
        return maxTimerWait;
    }

    /** The total amount of time that has been spent waiting for table locks. */
    @com.fasterxml.jackson.annotation.JsonProperty("sumLockTime")
    private final java.math.BigDecimal sumLockTime;

    /**
     * The total amount of time that has been spent waiting for table locks.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumLockTime() {
        return sumLockTime;
    }

    /** The total number of errors that have been encountered executing the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("sumErrors")
    private final java.math.BigDecimal sumErrors;

    /**
     * The total number of errors that have been encountered executing the query.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumErrors() {
        return sumErrors;
    }

    /** The total number of warnings that have been encountered executing the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("sumWarnings")
    private final java.math.BigDecimal sumWarnings;

    /**
     * The total number of warnings that have been encountered executing the query.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumWarnings() {
        return sumWarnings;
    }

    /** The total number of rows that have been modified by the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("sumRowsAffected")
    private final java.math.BigDecimal sumRowsAffected;

    /**
     * The total number of rows that have been modified by the query.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumRowsAffected() {
        return sumRowsAffected;
    }

    /** The total number of rows that have been returned (sent) to the client. */
    @com.fasterxml.jackson.annotation.JsonProperty("sumRowsSent")
    private final java.math.BigDecimal sumRowsSent;

    /**
     * The total number of rows that have been returned (sent) to the client.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumRowsSent() {
        return sumRowsSent;
    }

    /** The total number of rows that have been examined by the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("sumRowsExamined")
    private final java.math.BigDecimal sumRowsExamined;

    /**
     * The total number of rows that have been examined by the query.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumRowsExamined() {
        return sumRowsExamined;
    }

    /**
     * The total number of On-Disk internal temporary tables that have been created by the query.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumCreatedTempDiskTables")
    private final java.math.BigDecimal sumCreatedTempDiskTables;

    /**
     * The total number of On-Disk internal temporary tables that have been created by the query.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumCreatedTempDiskTables() {
        return sumCreatedTempDiskTables;
    }

    /**
     * The total number of internal temporary tables (in memory or on disk), which have been created
     * by the query.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumCreatedTempTables")
    private final java.math.BigDecimal sumCreatedTempTables;

    /**
     * The total number of internal temporary tables (in memory or on disk), which have been created
     * by the query.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumCreatedTempTables() {
        return sumCreatedTempTables;
    }

    /**
     * The total number of joins that have performed full table scans as there was no join condition
     * or no index for the join condition. This is the same as the select_full_join status variable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumSelectFullJoin")
    private final java.math.BigDecimal sumSelectFullJoin;

    /**
     * The total number of joins that have performed full table scans as there was no join condition
     * or no index for the join condition. This is the same as the select_full_join status variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumSelectFullJoin() {
        return sumSelectFullJoin;
    }

    /**
     * The total number of joins that use a full range search. This is the same as the
     * select_full_range_join status variable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumSelectFullRangeJoin")
    private final java.math.BigDecimal sumSelectFullRangeJoin;

    /**
     * The total number of joins that use a full range search. This is the same as the
     * select_full_range_join status variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumSelectFullRangeJoin() {
        return sumSelectFullRangeJoin;
    }

    /**
     * The total number of times the query has used a range search. This is the same as the
     * select_range status variable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumSelectRange")
    private final java.math.BigDecimal sumSelectRange;

    /**
     * The total number of times the query has used a range search. This is the same as the
     * select_range status variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumSelectRange() {
        return sumSelectRange;
    }

    /**
     * The total number of joins by the query where the join does not have an index that checks for
     * the index usage after each row. This is the same as the select_range_check status variable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumSelectRangeCheck")
    private final java.math.BigDecimal sumSelectRangeCheck;

    /**
     * The total number of joins by the query where the join does not have an index that checks for
     * the index usage after each row. This is the same as the select_range_check status variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumSelectRangeCheck() {
        return sumSelectRangeCheck;
    }

    /**
     * The total number of times the query has performed a full table scan on the first table in the
     * join. This is the same as the select_scan status variable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumSelectScan")
    private final java.math.BigDecimal sumSelectScan;

    /**
     * The total number of times the query has performed a full table scan on the first table in the
     * join. This is the same as the select_scan status variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumSelectScan() {
        return sumSelectScan;
    }

    /**
     * The total number of sort merge passes that have been done to sort the result of the query.
     * This is the same as the sort_merge_passes status variable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumSortMergePasses")
    private final java.math.BigDecimal sumSortMergePasses;

    /**
     * The total number of sort merge passes that have been done to sort the result of the query.
     * This is the same as the sort_merge_passes status variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumSortMergePasses() {
        return sumSortMergePasses;
    }

    /**
     * The total number of times a sort was done using ranges. This is the same as the sort_range
     * status variable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumSortRange")
    private final java.math.BigDecimal sumSortRange;

    /**
     * The total number of times a sort was done using ranges. This is the same as the sort_range
     * status variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumSortRange() {
        return sumSortRange;
    }

    /** The total number of rows sorted. This is the same as the sort_rowsStatus variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("sumSortRows")
    private final java.math.BigDecimal sumSortRows;

    /**
     * The total number of rows sorted. This is the same as the sort_rowsStatus variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumSortRows() {
        return sumSortRows;
    }

    /**
     * The total number of times a sort was done by scanning the table. This is the same as the
     * sort_scan status variable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumSortScan")
    private final java.math.BigDecimal sumSortScan;

    /**
     * The total number of times a sort was done by scanning the table. This is the same as the
     * sort_scan status variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumSortScan() {
        return sumSortScan;
    }

    /** The total number of times no index was used to execute the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("sumNoIndexUsed")
    private final java.math.BigDecimal sumNoIndexUsed;

    /**
     * The total number of times no index was used to execute the query.
     *
     * @return the value
     */
    public java.math.BigDecimal getSumNoIndexUsed() {
        return sumNoIndexUsed;
    }

    /**
     * The total number of times no good index was used. This means that the extra column in The
     * EXPLAIN output includes \u201CRange Checked For Each Record.\u201D
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sumNoGoodIndexUsed")
    private final java.math.BigDecimal sumNoGoodIndexUsed;

    /**
     * The total number of times no good index was used. This means that the extra column in The
     * EXPLAIN output includes \u201CRange Checked For Each Record.\u201D
     *
     * @return the value
     */
    public java.math.BigDecimal getSumNoGoodIndexUsed() {
        return sumNoGoodIndexUsed;
    }

    /**
     * The date and time the query was first seen. If the table is truncated, the first seen value
     * is reset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("firstSeen")
    private final java.util.Date firstSeen;

    /**
     * The date and time the query was first seen. If the table is truncated, the first seen value
     * is reset.
     *
     * @return the value
     */
    public java.util.Date getFirstSeen() {
        return firstSeen;
    }

    /** The date and time the query was last seen. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastSeen")
    private final java.util.Date lastSeen;

    /**
     * The date and time the query was last seen.
     *
     * @return the value
     */
    public java.util.Date getLastSeen() {
        return lastSeen;
    }

    /**
     * The 95th percentile of the query latency. That is, 95% of the queries complete in the time
     * given or in less time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantile95")
    private final java.math.BigDecimal quantile95;

    /**
     * The 95th percentile of the query latency. That is, 95% of the queries complete in the time
     * given or in less time.
     *
     * @return the value
     */
    public java.math.BigDecimal getQuantile95() {
        return quantile95;
    }

    /** The 99th percentile of the query latency. */
    @com.fasterxml.jackson.annotation.JsonProperty("quantile99")
    private final java.math.BigDecimal quantile99;

    /**
     * The 99th percentile of the query latency.
     *
     * @return the value
     */
    public java.math.BigDecimal getQuantile99() {
        return quantile99;
    }

    /** The 99.9th percentile of the query latency. */
    @com.fasterxml.jackson.annotation.JsonProperty("quantile999")
    private final java.math.BigDecimal quantile999;

    /**
     * The 99.9th percentile of the query latency.
     *
     * @return the value
     */
    public java.math.BigDecimal getQuantile999() {
        return quantile999;
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
        sb.append("MySqlDataSummary(");
        sb.append("super=").append(super.toString());
        sb.append("schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", digest=").append(String.valueOf(this.digest));
        sb.append(", digestText=").append(String.valueOf(this.digestText));
        sb.append(", countStar=").append(String.valueOf(this.countStar));
        sb.append(", sumTimerWait=").append(String.valueOf(this.sumTimerWait));
        sb.append(", minTimerWait=").append(String.valueOf(this.minTimerWait));
        sb.append(", avgTimerWait=").append(String.valueOf(this.avgTimerWait));
        sb.append(", maxTimerWait=").append(String.valueOf(this.maxTimerWait));
        sb.append(", sumLockTime=").append(String.valueOf(this.sumLockTime));
        sb.append(", sumErrors=").append(String.valueOf(this.sumErrors));
        sb.append(", sumWarnings=").append(String.valueOf(this.sumWarnings));
        sb.append(", sumRowsAffected=").append(String.valueOf(this.sumRowsAffected));
        sb.append(", sumRowsSent=").append(String.valueOf(this.sumRowsSent));
        sb.append(", sumRowsExamined=").append(String.valueOf(this.sumRowsExamined));
        sb.append(", sumCreatedTempDiskTables=")
                .append(String.valueOf(this.sumCreatedTempDiskTables));
        sb.append(", sumCreatedTempTables=").append(String.valueOf(this.sumCreatedTempTables));
        sb.append(", sumSelectFullJoin=").append(String.valueOf(this.sumSelectFullJoin));
        sb.append(", sumSelectFullRangeJoin=").append(String.valueOf(this.sumSelectFullRangeJoin));
        sb.append(", sumSelectRange=").append(String.valueOf(this.sumSelectRange));
        sb.append(", sumSelectRangeCheck=").append(String.valueOf(this.sumSelectRangeCheck));
        sb.append(", sumSelectScan=").append(String.valueOf(this.sumSelectScan));
        sb.append(", sumSortMergePasses=").append(String.valueOf(this.sumSortMergePasses));
        sb.append(", sumSortRange=").append(String.valueOf(this.sumSortRange));
        sb.append(", sumSortRows=").append(String.valueOf(this.sumSortRows));
        sb.append(", sumSortScan=").append(String.valueOf(this.sumSortScan));
        sb.append(", sumNoIndexUsed=").append(String.valueOf(this.sumNoIndexUsed));
        sb.append(", sumNoGoodIndexUsed=").append(String.valueOf(this.sumNoGoodIndexUsed));
        sb.append(", firstSeen=").append(String.valueOf(this.firstSeen));
        sb.append(", lastSeen=").append(String.valueOf(this.lastSeen));
        sb.append(", quantile95=").append(String.valueOf(this.quantile95));
        sb.append(", quantile99=").append(String.valueOf(this.quantile99));
        sb.append(", quantile999=").append(String.valueOf(this.quantile999));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlDataSummary)) {
            return false;
        }

        MySqlDataSummary other = (MySqlDataSummary) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.digest, other.digest)
                && java.util.Objects.equals(this.digestText, other.digestText)
                && java.util.Objects.equals(this.countStar, other.countStar)
                && java.util.Objects.equals(this.sumTimerWait, other.sumTimerWait)
                && java.util.Objects.equals(this.minTimerWait, other.minTimerWait)
                && java.util.Objects.equals(this.avgTimerWait, other.avgTimerWait)
                && java.util.Objects.equals(this.maxTimerWait, other.maxTimerWait)
                && java.util.Objects.equals(this.sumLockTime, other.sumLockTime)
                && java.util.Objects.equals(this.sumErrors, other.sumErrors)
                && java.util.Objects.equals(this.sumWarnings, other.sumWarnings)
                && java.util.Objects.equals(this.sumRowsAffected, other.sumRowsAffected)
                && java.util.Objects.equals(this.sumRowsSent, other.sumRowsSent)
                && java.util.Objects.equals(this.sumRowsExamined, other.sumRowsExamined)
                && java.util.Objects.equals(
                        this.sumCreatedTempDiskTables, other.sumCreatedTempDiskTables)
                && java.util.Objects.equals(this.sumCreatedTempTables, other.sumCreatedTempTables)
                && java.util.Objects.equals(this.sumSelectFullJoin, other.sumSelectFullJoin)
                && java.util.Objects.equals(
                        this.sumSelectFullRangeJoin, other.sumSelectFullRangeJoin)
                && java.util.Objects.equals(this.sumSelectRange, other.sumSelectRange)
                && java.util.Objects.equals(this.sumSelectRangeCheck, other.sumSelectRangeCheck)
                && java.util.Objects.equals(this.sumSelectScan, other.sumSelectScan)
                && java.util.Objects.equals(this.sumSortMergePasses, other.sumSortMergePasses)
                && java.util.Objects.equals(this.sumSortRange, other.sumSortRange)
                && java.util.Objects.equals(this.sumSortRows, other.sumSortRows)
                && java.util.Objects.equals(this.sumSortScan, other.sumSortScan)
                && java.util.Objects.equals(this.sumNoIndexUsed, other.sumNoIndexUsed)
                && java.util.Objects.equals(this.sumNoGoodIndexUsed, other.sumNoGoodIndexUsed)
                && java.util.Objects.equals(this.firstSeen, other.firstSeen)
                && java.util.Objects.equals(this.lastSeen, other.lastSeen)
                && java.util.Objects.equals(this.quantile95, other.quantile95)
                && java.util.Objects.equals(this.quantile99, other.quantile99)
                && java.util.Objects.equals(this.quantile999, other.quantile999)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.digest == null ? 43 : this.digest.hashCode());
        result = (result * PRIME) + (this.digestText == null ? 43 : this.digestText.hashCode());
        result = (result * PRIME) + (this.countStar == null ? 43 : this.countStar.hashCode());
        result = (result * PRIME) + (this.sumTimerWait == null ? 43 : this.sumTimerWait.hashCode());
        result = (result * PRIME) + (this.minTimerWait == null ? 43 : this.minTimerWait.hashCode());
        result = (result * PRIME) + (this.avgTimerWait == null ? 43 : this.avgTimerWait.hashCode());
        result = (result * PRIME) + (this.maxTimerWait == null ? 43 : this.maxTimerWait.hashCode());
        result = (result * PRIME) + (this.sumLockTime == null ? 43 : this.sumLockTime.hashCode());
        result = (result * PRIME) + (this.sumErrors == null ? 43 : this.sumErrors.hashCode());
        result = (result * PRIME) + (this.sumWarnings == null ? 43 : this.sumWarnings.hashCode());
        result =
                (result * PRIME)
                        + (this.sumRowsAffected == null ? 43 : this.sumRowsAffected.hashCode());
        result = (result * PRIME) + (this.sumRowsSent == null ? 43 : this.sumRowsSent.hashCode());
        result =
                (result * PRIME)
                        + (this.sumRowsExamined == null ? 43 : this.sumRowsExamined.hashCode());
        result =
                (result * PRIME)
                        + (this.sumCreatedTempDiskTables == null
                                ? 43
                                : this.sumCreatedTempDiskTables.hashCode());
        result =
                (result * PRIME)
                        + (this.sumCreatedTempTables == null
                                ? 43
                                : this.sumCreatedTempTables.hashCode());
        result =
                (result * PRIME)
                        + (this.sumSelectFullJoin == null ? 43 : this.sumSelectFullJoin.hashCode());
        result =
                (result * PRIME)
                        + (this.sumSelectFullRangeJoin == null
                                ? 43
                                : this.sumSelectFullRangeJoin.hashCode());
        result =
                (result * PRIME)
                        + (this.sumSelectRange == null ? 43 : this.sumSelectRange.hashCode());
        result =
                (result * PRIME)
                        + (this.sumSelectRangeCheck == null
                                ? 43
                                : this.sumSelectRangeCheck.hashCode());
        result =
                (result * PRIME)
                        + (this.sumSelectScan == null ? 43 : this.sumSelectScan.hashCode());
        result =
                (result * PRIME)
                        + (this.sumSortMergePasses == null
                                ? 43
                                : this.sumSortMergePasses.hashCode());
        result = (result * PRIME) + (this.sumSortRange == null ? 43 : this.sumSortRange.hashCode());
        result = (result * PRIME) + (this.sumSortRows == null ? 43 : this.sumSortRows.hashCode());
        result = (result * PRIME) + (this.sumSortScan == null ? 43 : this.sumSortScan.hashCode());
        result =
                (result * PRIME)
                        + (this.sumNoIndexUsed == null ? 43 : this.sumNoIndexUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.sumNoGoodIndexUsed == null
                                ? 43
                                : this.sumNoGoodIndexUsed.hashCode());
        result = (result * PRIME) + (this.firstSeen == null ? 43 : this.firstSeen.hashCode());
        result = (result * PRIME) + (this.lastSeen == null ? 43 : this.lastSeen.hashCode());
        result = (result * PRIME) + (this.quantile95 == null ? 43 : this.quantile95.hashCode());
        result = (result * PRIME) + (this.quantile99 == null ? 43 : this.quantile99.hashCode());
        result = (result * PRIME) + (this.quantile999 == null ? 43 : this.quantile999.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
