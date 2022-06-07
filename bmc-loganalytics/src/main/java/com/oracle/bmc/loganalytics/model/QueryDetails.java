/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Input arguments for running a log anlaytics query. If the request is set to run in asynchronous mode
 * then shouldIncludeColumns and shouldIncludeFields can be overwritten when retrieving the results.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryDetails {
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
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
        private String savedSearchId;

        public Builder savedSearchId(String savedSearchId) {
            this.savedSearchId = savedSearchId;
            this.__explicitlySet__.add("savedSearchId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryString")
        private String queryString;

        public Builder queryString(String queryString) {
            this.queryString = queryString;
            this.__explicitlySet__.add("queryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
        private SubSystemName subSystem;

        public Builder subSystem(SubSystemName subSystem) {
            this.subSystem = subSystem;
            this.__explicitlySet__.add("subSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxTotalCount")
        private Integer maxTotalCount;

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

        @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
        private java.util.List<ScopeFilter> scopeFilters;

        public Builder scopeFilters(java.util.List<ScopeFilter> scopeFilters) {
            this.scopeFilters = scopeFilters;
            this.__explicitlySet__.add("scopeFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryTimeoutInSeconds")
        private Integer queryTimeoutInSeconds;

        public Builder queryTimeoutInSeconds(Integer queryTimeoutInSeconds) {
            this.queryTimeoutInSeconds = queryTimeoutInSeconds;
            this.__explicitlySet__.add("queryTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldRunAsync")
        private Boolean shouldRunAsync;

        public Builder shouldRunAsync(Boolean shouldRunAsync) {
            this.shouldRunAsync = shouldRunAsync;
            this.__explicitlySet__.add("shouldRunAsync");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("asyncMode")
        private JobMode asyncMode;

        public Builder asyncMode(JobMode asyncMode) {
            this.asyncMode = asyncMode;
            this.__explicitlySet__.add("asyncMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTotalCount")
        private Boolean shouldIncludeTotalCount;

        public Builder shouldIncludeTotalCount(Boolean shouldIncludeTotalCount) {
            this.shouldIncludeTotalCount = shouldIncludeTotalCount;
            this.__explicitlySet__.add("shouldIncludeTotalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeColumns")
        private Boolean shouldIncludeColumns;

        public Builder shouldIncludeColumns(Boolean shouldIncludeColumns) {
            this.shouldIncludeColumns = shouldIncludeColumns;
            this.__explicitlySet__.add("shouldIncludeColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeFields")
        private Boolean shouldIncludeFields;

        public Builder shouldIncludeFields(Boolean shouldIncludeFields) {
            this.shouldIncludeFields = shouldIncludeFields;
            this.__explicitlySet__.add("shouldIncludeFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldUseAcceleration")
        private Boolean shouldUseAcceleration;

        public Builder shouldUseAcceleration(Boolean shouldUseAcceleration) {
            this.shouldUseAcceleration = shouldUseAcceleration;
            this.__explicitlySet__.add("shouldUseAcceleration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryDetails build() {
            QueryDetails __instance__ =
                    new QueryDetails(
                            compartmentId,
                            compartmentIdInSubtree,
                            savedSearchId,
                            queryString,
                            subSystem,
                            maxTotalCount,
                            timeFilter,
                            scopeFilters,
                            queryTimeoutInSeconds,
                            shouldRunAsync,
                            asyncMode,
                            shouldIncludeTotalCount,
                            shouldIncludeColumns,
                            shouldIncludeFields,
                            shouldUseAcceleration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .compartmentIdInSubtree(o.getCompartmentIdInSubtree())
                            .savedSearchId(o.getSavedSearchId())
                            .queryString(o.getQueryString())
                            .subSystem(o.getSubSystem())
                            .maxTotalCount(o.getMaxTotalCount())
                            .timeFilter(o.getTimeFilter())
                            .scopeFilters(o.getScopeFilters())
                            .queryTimeoutInSeconds(o.getQueryTimeoutInSeconds())
                            .shouldRunAsync(o.getShouldRunAsync())
                            .asyncMode(o.getAsyncMode())
                            .shouldIncludeTotalCount(o.getShouldIncludeTotalCount())
                            .shouldIncludeColumns(o.getShouldIncludeColumns())
                            .shouldIncludeFields(o.getShouldIncludeFields())
                            .shouldUseAcceleration(o.getShouldUseAcceleration());

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
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Flag to search all child compartments of the compartment Id specified in the compartmentId query parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    /**
     * Saved search OCID for this query if known.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
    private final String savedSearchId;

    public String getSavedSearchId() {
        return savedSearchId;
    }

    /**
     * Query to perform. Must conform to logging analytic querylanguage syntax. Syntax errors will be returned if present.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    private final String queryString;

    public String getQueryString() {
        return queryString;
    }

    /**
     * Default subsystem to qualify fields with in the queryString if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
    private final SubSystemName subSystem;

    public SubSystemName getSubSystem() {
        return subSystem;
    }

    /**
     * Maximum number of results to count.  Note a maximum of 2001 will be enforced; that is, actualMaxTotalCountUsed = Math.min(maxTotalCount, 2001).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalCount")
    private final Integer maxTotalCount;

    public Integer getMaxTotalCount() {
        return maxTotalCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
    private final TimeRange timeFilter;

    public TimeRange getTimeFilter() {
        return timeFilter;
    }

    /**
     * List of filters to be applied when the query executes. More than one filter per field is not permitted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
    private final java.util.List<ScopeFilter> scopeFilters;

    public java.util.List<ScopeFilter> getScopeFilters() {
        return scopeFilters;
    }

    /**
     * Amount of time, in seconds, allowed for a query to execute. If this time expires before the query is complete, any partial results will be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryTimeoutInSeconds")
    private final Integer queryTimeoutInSeconds;

    public Integer getQueryTimeoutInSeconds() {
        return queryTimeoutInSeconds;
    }

    /**
     * Option to run the query asynchronously. This will lead to a LogAnalyticsQueryJobWorkRequest being submitted and the {workRequestId} will be returned to use for fetching the results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldRunAsync")
    private final Boolean shouldRunAsync;

    public Boolean getShouldRunAsync() {
        return shouldRunAsync;
    }

    /**
     * Execution mode for the query if running asynchronously i.e (shouldRunAsync is set to true).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asyncMode")
    private final JobMode asyncMode;

    public JobMode getAsyncMode() {
        return asyncMode;
    }

    /**
     * Include the total number of results from the query. Note, this value will always be equal to or less than maxTotalCount.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTotalCount")
    private final Boolean shouldIncludeTotalCount;

    public Boolean getShouldIncludeTotalCount() {
        return shouldIncludeTotalCount;
    }

    /**
     * Include columns in response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeColumns")
    private final Boolean shouldIncludeColumns;

    public Boolean getShouldIncludeColumns() {
        return shouldIncludeColumns;
    }

    /**
     * Include fields in response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeFields")
    private final Boolean shouldIncludeFields;

    public Boolean getShouldIncludeFields() {
        return shouldIncludeFields;
    }

    /**
     * Controls if query should ignore pre-calculated results if available and only use raw data. If set and no acceleration data is found it will fallback to raw data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseAcceleration")
    private final Boolean shouldUseAcceleration;

    public Boolean getShouldUseAcceleration() {
        return shouldUseAcceleration;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryDetails(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
