/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class QueryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Flag to search all child compartments of the compartment Id specified in the compartmentId query parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    Boolean compartmentIdInSubtree;

    /**
     * Saved search OCID for this query if known, used to track usage of saved search queryString.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
    String savedSearchId;

    /**
     * Query to perform.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    String queryString;

    /**
     * Default subsystem to qualify fields with in the queryString if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
    SubSystemName subSystem;

    /**
     * Maximum number of results to count.  Note a maximum of 2001 will be enforced; that is, actualMaxTotalCountUsed = Math.min(maxTotalCount, 2001).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalCount")
    Integer maxTotalCount;

    @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
    TimeRange timeFilter;

    /**
     * List of filters to be applied when the query executes. More than one filter per field is not permitted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
    java.util.List<ScopeFilter> scopeFilters;

    /**
     * Amount of time, in seconds, allowed for a query to execute. If this time expires before the query is complete, any partial results will be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryTimeoutInSeconds")
    Integer queryTimeoutInSeconds;

    /**
     * Option to run the query asynchronously. This will lead to a LogAnalyticsQueryJobWorkRequest being submitted and the {workRequestId} will be returned to fetch the results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldRunAsync")
    Boolean shouldRunAsync;

    /**
     * Execution mode for the query if running asynchronously  (shouldRunAsync is true).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asyncMode")
    JobMode asyncMode;

    /**
     * Include the total number of results from the query. Note, this value will always be equal to or less than maxTotalCount.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTotalCount")
    Boolean shouldIncludeTotalCount;

    /**
     * Include columns in response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeColumns")
    Boolean shouldIncludeColumns;

    /**
     * Include fields in response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeFields")
    Boolean shouldIncludeFields;

    /**
     * Controls if query should ignore pre-calculated results if available and only use raw data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseAcceleration")
    Boolean shouldUseAcceleration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
