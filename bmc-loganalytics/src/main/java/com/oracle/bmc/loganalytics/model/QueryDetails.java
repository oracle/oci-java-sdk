/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Input arguments for running a log anlaytics query. If the request is set to run in asynchronous
 * mode then shouldIncludeColumns and shouldIncludeFields can be overwritten when retrieving the
 * results. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueryDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "compartmentIdInSubtree",
        "savedSearchId",
        "queryString",
        "subSystem",
        "maxTotalCount",
        "timeFilter",
        "scopeFilters",
        "queryTimeoutInSeconds",
        "shouldRunAsync",
        "asyncMode",
        "shouldIncludeTotalCount",
        "shouldIncludeColumns",
        "shouldIncludeFields",
        "shouldUseAcceleration"
    })
    public QueryDetails(
            String compartmentId,
            Boolean compartmentIdInSubtree,
            String savedSearchId,
            String queryString,
            SubSystemName subSystem,
            Integer maxTotalCount,
            TimeRange timeFilter,
            java.util.List<ScopeFilter> scopeFilters,
            Integer queryTimeoutInSeconds,
            Boolean shouldRunAsync,
            JobMode asyncMode,
            Boolean shouldIncludeTotalCount,
            Boolean shouldIncludeColumns,
            Boolean shouldIncludeFields,
            Boolean shouldUseAcceleration) {
        super();
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.savedSearchId = savedSearchId;
        this.queryString = queryString;
        this.subSystem = subSystem;
        this.maxTotalCount = maxTotalCount;
        this.timeFilter = timeFilter;
        this.scopeFilters = scopeFilters;
        this.queryTimeoutInSeconds = queryTimeoutInSeconds;
        this.shouldRunAsync = shouldRunAsync;
        this.asyncMode = asyncMode;
        this.shouldIncludeTotalCount = shouldIncludeTotalCount;
        this.shouldIncludeColumns = shouldIncludeColumns;
        this.shouldIncludeFields = shouldIncludeFields;
        this.shouldUseAcceleration = shouldUseAcceleration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Flag to search all child compartments of the compartment Id specified in the
         * compartmentId query parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        /**
         * Flag to search all child compartments of the compartment Id specified in the
         * compartmentId query parameter.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }
        /** Saved search OCID for this query if known. */
        @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
        private String savedSearchId;

        /**
         * Saved search OCID for this query if known.
         *
         * @param savedSearchId the value to set
         * @return this builder
         */
        public Builder savedSearchId(String savedSearchId) {
            this.savedSearchId = savedSearchId;
            this.__explicitlySet__.add("savedSearchId");
            return this;
        }
        /**
         * Query to perform. Must conform to logging analytic querylanguage syntax. Syntax errors
         * will be returned if present.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryString")
        private String queryString;

        /**
         * Query to perform. Must conform to logging analytic querylanguage syntax. Syntax errors
         * will be returned if present.
         *
         * @param queryString the value to set
         * @return this builder
         */
        public Builder queryString(String queryString) {
            this.queryString = queryString;
            this.__explicitlySet__.add("queryString");
            return this;
        }
        /** Default subsystem to qualify fields with in the queryString if not specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
        private SubSystemName subSystem;

        /**
         * Default subsystem to qualify fields with in the queryString if not specified.
         *
         * @param subSystem the value to set
         * @return this builder
         */
        public Builder subSystem(SubSystemName subSystem) {
            this.subSystem = subSystem;
            this.__explicitlySet__.add("subSystem");
            return this;
        }
        /**
         * Maximum number of results to count. Note a maximum of 2001 will be enforced; that is,
         * actualMaxTotalCountUsed = Math.min(maxTotalCount, 2001).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTotalCount")
        private Integer maxTotalCount;

        /**
         * Maximum number of results to count. Note a maximum of 2001 will be enforced; that is,
         * actualMaxTotalCountUsed = Math.min(maxTotalCount, 2001).
         *
         * @param maxTotalCount the value to set
         * @return this builder
         */
        public Builder maxTotalCount(Integer maxTotalCount) {
            this.maxTotalCount = maxTotalCount;
            this.__explicitlySet__.add("maxTotalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
        private TimeRange timeFilter;

        public Builder timeFilter(TimeRange timeFilter) {
            this.timeFilter = timeFilter;
            this.__explicitlySet__.add("timeFilter");
            return this;
        }
        /**
         * List of filters to be applied when the query executes. More than one filter per field is
         * not permitted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
        private java.util.List<ScopeFilter> scopeFilters;

        /**
         * List of filters to be applied when the query executes. More than one filter per field is
         * not permitted.
         *
         * @param scopeFilters the value to set
         * @return this builder
         */
        public Builder scopeFilters(java.util.List<ScopeFilter> scopeFilters) {
            this.scopeFilters = scopeFilters;
            this.__explicitlySet__.add("scopeFilters");
            return this;
        }
        /**
         * Amount of time, in seconds, allowed for a query to execute. If this time expires before
         * the query is complete, any partial results will be returned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryTimeoutInSeconds")
        private Integer queryTimeoutInSeconds;

        /**
         * Amount of time, in seconds, allowed for a query to execute. If this time expires before
         * the query is complete, any partial results will be returned.
         *
         * @param queryTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder queryTimeoutInSeconds(Integer queryTimeoutInSeconds) {
            this.queryTimeoutInSeconds = queryTimeoutInSeconds;
            this.__explicitlySet__.add("queryTimeoutInSeconds");
            return this;
        }
        /**
         * Option to run the query asynchronously. This will lead to a
         * LogAnalyticsQueryJobWorkRequest being submitted and the {workRequestId} will be returned
         * to use for fetching the results.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldRunAsync")
        private Boolean shouldRunAsync;

        /**
         * Option to run the query asynchronously. This will lead to a
         * LogAnalyticsQueryJobWorkRequest being submitted and the {workRequestId} will be returned
         * to use for fetching the results.
         *
         * @param shouldRunAsync the value to set
         * @return this builder
         */
        public Builder shouldRunAsync(Boolean shouldRunAsync) {
            this.shouldRunAsync = shouldRunAsync;
            this.__explicitlySet__.add("shouldRunAsync");
            return this;
        }
        /**
         * Execution mode for the query if running asynchronously i.e (shouldRunAsync is set to
         * true).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("asyncMode")
        private JobMode asyncMode;

        /**
         * Execution mode for the query if running asynchronously i.e (shouldRunAsync is set to
         * true).
         *
         * @param asyncMode the value to set
         * @return this builder
         */
        public Builder asyncMode(JobMode asyncMode) {
            this.asyncMode = asyncMode;
            this.__explicitlySet__.add("asyncMode");
            return this;
        }
        /**
         * Include the total number of results from the query. Note, this value will always be equal
         * to or less than maxTotalCount.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTotalCount")
        private Boolean shouldIncludeTotalCount;

        /**
         * Include the total number of results from the query. Note, this value will always be equal
         * to or less than maxTotalCount.
         *
         * @param shouldIncludeTotalCount the value to set
         * @return this builder
         */
        public Builder shouldIncludeTotalCount(Boolean shouldIncludeTotalCount) {
            this.shouldIncludeTotalCount = shouldIncludeTotalCount;
            this.__explicitlySet__.add("shouldIncludeTotalCount");
            return this;
        }
        /** Include columns in response */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeColumns")
        private Boolean shouldIncludeColumns;

        /**
         * Include columns in response
         *
         * @param shouldIncludeColumns the value to set
         * @return this builder
         */
        public Builder shouldIncludeColumns(Boolean shouldIncludeColumns) {
            this.shouldIncludeColumns = shouldIncludeColumns;
            this.__explicitlySet__.add("shouldIncludeColumns");
            return this;
        }
        /** Include fields in response */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeFields")
        private Boolean shouldIncludeFields;

        /**
         * Include fields in response
         *
         * @param shouldIncludeFields the value to set
         * @return this builder
         */
        public Builder shouldIncludeFields(Boolean shouldIncludeFields) {
            this.shouldIncludeFields = shouldIncludeFields;
            this.__explicitlySet__.add("shouldIncludeFields");
            return this;
        }
        /**
         * Controls if query should ignore pre-calculated results if available and only use raw
         * data. If set and no acceleration data is found it will fallback to raw data.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldUseAcceleration")
        private Boolean shouldUseAcceleration;

        /**
         * Controls if query should ignore pre-calculated results if available and only use raw
         * data. If set and no acceleration data is found it will fallback to raw data.
         *
         * @param shouldUseAcceleration the value to set
         * @return this builder
         */
        public Builder shouldUseAcceleration(Boolean shouldUseAcceleration) {
            this.shouldUseAcceleration = shouldUseAcceleration;
            this.__explicitlySet__.add("shouldUseAcceleration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryDetails build() {
            QueryDetails model =
                    new QueryDetails(
                            this.compartmentId,
                            this.compartmentIdInSubtree,
                            this.savedSearchId,
                            this.queryString,
                            this.subSystem,
                            this.maxTotalCount,
                            this.timeFilter,
                            this.scopeFilters,
                            this.queryTimeoutInSeconds,
                            this.shouldRunAsync,
                            this.asyncMode,
                            this.shouldIncludeTotalCount,
                            this.shouldIncludeColumns,
                            this.shouldIncludeFields,
                            this.shouldUseAcceleration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentIdInSubtree")) {
                this.compartmentIdInSubtree(model.getCompartmentIdInSubtree());
            }
            if (model.wasPropertyExplicitlySet("savedSearchId")) {
                this.savedSearchId(model.getSavedSearchId());
            }
            if (model.wasPropertyExplicitlySet("queryString")) {
                this.queryString(model.getQueryString());
            }
            if (model.wasPropertyExplicitlySet("subSystem")) {
                this.subSystem(model.getSubSystem());
            }
            if (model.wasPropertyExplicitlySet("maxTotalCount")) {
                this.maxTotalCount(model.getMaxTotalCount());
            }
            if (model.wasPropertyExplicitlySet("timeFilter")) {
                this.timeFilter(model.getTimeFilter());
            }
            if (model.wasPropertyExplicitlySet("scopeFilters")) {
                this.scopeFilters(model.getScopeFilters());
            }
            if (model.wasPropertyExplicitlySet("queryTimeoutInSeconds")) {
                this.queryTimeoutInSeconds(model.getQueryTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("shouldRunAsync")) {
                this.shouldRunAsync(model.getShouldRunAsync());
            }
            if (model.wasPropertyExplicitlySet("asyncMode")) {
                this.asyncMode(model.getAsyncMode());
            }
            if (model.wasPropertyExplicitlySet("shouldIncludeTotalCount")) {
                this.shouldIncludeTotalCount(model.getShouldIncludeTotalCount());
            }
            if (model.wasPropertyExplicitlySet("shouldIncludeColumns")) {
                this.shouldIncludeColumns(model.getShouldIncludeColumns());
            }
            if (model.wasPropertyExplicitlySet("shouldIncludeFields")) {
                this.shouldIncludeFields(model.getShouldIncludeFields());
            }
            if (model.wasPropertyExplicitlySet("shouldUseAcceleration")) {
                this.shouldUseAcceleration(model.getShouldUseAcceleration());
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
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Flag to search all child compartments of the compartment Id specified in the compartmentId
     * query parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    /**
     * Flag to search all child compartments of the compartment Id specified in the compartmentId
     * query parameter.
     *
     * @return the value
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    /** Saved search OCID for this query if known. */
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
    private final String savedSearchId;

    /**
     * Saved search OCID for this query if known.
     *
     * @return the value
     */
    public String getSavedSearchId() {
        return savedSearchId;
    }

    /**
     * Query to perform. Must conform to logging analytic querylanguage syntax. Syntax errors will
     * be returned if present.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    private final String queryString;

    /**
     * Query to perform. Must conform to logging analytic querylanguage syntax. Syntax errors will
     * be returned if present.
     *
     * @return the value
     */
    public String getQueryString() {
        return queryString;
    }

    /** Default subsystem to qualify fields with in the queryString if not specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
    private final SubSystemName subSystem;

    /**
     * Default subsystem to qualify fields with in the queryString if not specified.
     *
     * @return the value
     */
    public SubSystemName getSubSystem() {
        return subSystem;
    }

    /**
     * Maximum number of results to count. Note a maximum of 2001 will be enforced; that is,
     * actualMaxTotalCountUsed = Math.min(maxTotalCount, 2001).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalCount")
    private final Integer maxTotalCount;

    /**
     * Maximum number of results to count. Note a maximum of 2001 will be enforced; that is,
     * actualMaxTotalCountUsed = Math.min(maxTotalCount, 2001).
     *
     * @return the value
     */
    public Integer getMaxTotalCount() {
        return maxTotalCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
    private final TimeRange timeFilter;

    public TimeRange getTimeFilter() {
        return timeFilter;
    }

    /**
     * List of filters to be applied when the query executes. More than one filter per field is not
     * permitted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
    private final java.util.List<ScopeFilter> scopeFilters;

    /**
     * List of filters to be applied when the query executes. More than one filter per field is not
     * permitted.
     *
     * @return the value
     */
    public java.util.List<ScopeFilter> getScopeFilters() {
        return scopeFilters;
    }

    /**
     * Amount of time, in seconds, allowed for a query to execute. If this time expires before the
     * query is complete, any partial results will be returned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryTimeoutInSeconds")
    private final Integer queryTimeoutInSeconds;

    /**
     * Amount of time, in seconds, allowed for a query to execute. If this time expires before the
     * query is complete, any partial results will be returned.
     *
     * @return the value
     */
    public Integer getQueryTimeoutInSeconds() {
        return queryTimeoutInSeconds;
    }

    /**
     * Option to run the query asynchronously. This will lead to a LogAnalyticsQueryJobWorkRequest
     * being submitted and the {workRequestId} will be returned to use for fetching the results.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldRunAsync")
    private final Boolean shouldRunAsync;

    /**
     * Option to run the query asynchronously. This will lead to a LogAnalyticsQueryJobWorkRequest
     * being submitted and the {workRequestId} will be returned to use for fetching the results.
     *
     * @return the value
     */
    public Boolean getShouldRunAsync() {
        return shouldRunAsync;
    }

    /**
     * Execution mode for the query if running asynchronously i.e (shouldRunAsync is set to true).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("asyncMode")
    private final JobMode asyncMode;

    /**
     * Execution mode for the query if running asynchronously i.e (shouldRunAsync is set to true).
     *
     * @return the value
     */
    public JobMode getAsyncMode() {
        return asyncMode;
    }

    /**
     * Include the total number of results from the query. Note, this value will always be equal to
     * or less than maxTotalCount.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTotalCount")
    private final Boolean shouldIncludeTotalCount;

    /**
     * Include the total number of results from the query. Note, this value will always be equal to
     * or less than maxTotalCount.
     *
     * @return the value
     */
    public Boolean getShouldIncludeTotalCount() {
        return shouldIncludeTotalCount;
    }

    /** Include columns in response */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeColumns")
    private final Boolean shouldIncludeColumns;

    /**
     * Include columns in response
     *
     * @return the value
     */
    public Boolean getShouldIncludeColumns() {
        return shouldIncludeColumns;
    }

    /** Include fields in response */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeFields")
    private final Boolean shouldIncludeFields;

    /**
     * Include fields in response
     *
     * @return the value
     */
    public Boolean getShouldIncludeFields() {
        return shouldIncludeFields;
    }

    /**
     * Controls if query should ignore pre-calculated results if available and only use raw data. If
     * set and no acceleration data is found it will fallback to raw data.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseAcceleration")
    private final Boolean shouldUseAcceleration;

    /**
     * Controls if query should ignore pre-calculated results if available and only use raw data. If
     * set and no acceleration data is found it will fallback to raw data.
     *
     * @return the value
     */
    public Boolean getShouldUseAcceleration() {
        return shouldUseAcceleration;
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
        sb.append("QueryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(", savedSearchId=").append(String.valueOf(this.savedSearchId));
        sb.append(", queryString=").append(String.valueOf(this.queryString));
        sb.append(", subSystem=").append(String.valueOf(this.subSystem));
        sb.append(", maxTotalCount=").append(String.valueOf(this.maxTotalCount));
        sb.append(", timeFilter=").append(String.valueOf(this.timeFilter));
        sb.append(", scopeFilters=").append(String.valueOf(this.scopeFilters));
        sb.append(", queryTimeoutInSeconds=").append(String.valueOf(this.queryTimeoutInSeconds));
        sb.append(", shouldRunAsync=").append(String.valueOf(this.shouldRunAsync));
        sb.append(", asyncMode=").append(String.valueOf(this.asyncMode));
        sb.append(", shouldIncludeTotalCount=")
                .append(String.valueOf(this.shouldIncludeTotalCount));
        sb.append(", shouldIncludeColumns=").append(String.valueOf(this.shouldIncludeColumns));
        sb.append(", shouldIncludeFields=").append(String.valueOf(this.shouldIncludeFields));
        sb.append(", shouldUseAcceleration=").append(String.valueOf(this.shouldUseAcceleration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryDetails)) {
            return false;
        }

        QueryDetails other = (QueryDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.savedSearchId, other.savedSearchId)
                && java.util.Objects.equals(this.queryString, other.queryString)
                && java.util.Objects.equals(this.subSystem, other.subSystem)
                && java.util.Objects.equals(this.maxTotalCount, other.maxTotalCount)
                && java.util.Objects.equals(this.timeFilter, other.timeFilter)
                && java.util.Objects.equals(this.scopeFilters, other.scopeFilters)
                && java.util.Objects.equals(this.queryTimeoutInSeconds, other.queryTimeoutInSeconds)
                && java.util.Objects.equals(this.shouldRunAsync, other.shouldRunAsync)
                && java.util.Objects.equals(this.asyncMode, other.asyncMode)
                && java.util.Objects.equals(
                        this.shouldIncludeTotalCount, other.shouldIncludeTotalCount)
                && java.util.Objects.equals(this.shouldIncludeColumns, other.shouldIncludeColumns)
                && java.util.Objects.equals(this.shouldIncludeFields, other.shouldIncludeFields)
                && java.util.Objects.equals(this.shouldUseAcceleration, other.shouldUseAcceleration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.savedSearchId == null ? 43 : this.savedSearchId.hashCode());
        result = (result * PRIME) + (this.queryString == null ? 43 : this.queryString.hashCode());
        result = (result * PRIME) + (this.subSystem == null ? 43 : this.subSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTotalCount == null ? 43 : this.maxTotalCount.hashCode());
        result = (result * PRIME) + (this.timeFilter == null ? 43 : this.timeFilter.hashCode());
        result = (result * PRIME) + (this.scopeFilters == null ? 43 : this.scopeFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.queryTimeoutInSeconds == null
                                ? 43
                                : this.queryTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldRunAsync == null ? 43 : this.shouldRunAsync.hashCode());
        result = (result * PRIME) + (this.asyncMode == null ? 43 : this.asyncMode.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeTotalCount == null
                                ? 43
                                : this.shouldIncludeTotalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeColumns == null
                                ? 43
                                : this.shouldIncludeColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeFields == null
                                ? 43
                                : this.shouldIncludeFields.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldUseAcceleration == null
                                ? 43
                                : this.shouldUseAcceleration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
