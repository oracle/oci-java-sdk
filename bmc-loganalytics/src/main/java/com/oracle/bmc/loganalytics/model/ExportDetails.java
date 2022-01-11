/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Input arguments for running a query synchronosly and streaming the results as soon as they become available.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExportDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
        private java.util.List<ScopeFilter> scopeFilters;

        public Builder scopeFilters(java.util.List<ScopeFilter> scopeFilters) {
            this.scopeFilters = scopeFilters;
            this.__explicitlySet__.add("scopeFilters");
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

        @com.fasterxml.jackson.annotation.JsonProperty("queryTimeoutInSeconds")
        private Integer queryTimeoutInSeconds;

        public Builder queryTimeoutInSeconds(Integer queryTimeoutInSeconds) {
            this.queryTimeoutInSeconds = queryTimeoutInSeconds;
            this.__explicitlySet__.add("queryTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeColumns")
        private Boolean shouldIncludeColumns;

        public Builder shouldIncludeColumns(Boolean shouldIncludeColumns) {
            this.shouldIncludeColumns = shouldIncludeColumns;
            this.__explicitlySet__.add("shouldIncludeColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputFormat")
        private OutputFormat outputFormat;

        public Builder outputFormat(OutputFormat outputFormat) {
            this.outputFormat = outputFormat;
            this.__explicitlySet__.add("outputFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldLocalize")
        private Boolean shouldLocalize;

        public Builder shouldLocalize(Boolean shouldLocalize) {
            this.shouldLocalize = shouldLocalize;
            this.__explicitlySet__.add("shouldLocalize");
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

        public ExportDetails build() {
            ExportDetails __instance__ =
                    new ExportDetails(
                            compartmentId,
                            compartmentIdInSubtree,
                            queryString,
                            subSystem,
                            scopeFilters,
                            maxTotalCount,
                            timeFilter,
                            queryTimeoutInSeconds,
                            shouldIncludeColumns,
                            outputFormat,
                            shouldLocalize,
                            shouldUseAcceleration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .compartmentIdInSubtree(o.getCompartmentIdInSubtree())
                            .queryString(o.getQueryString())
                            .subSystem(o.getSubSystem())
                            .scopeFilters(o.getScopeFilters())
                            .maxTotalCount(o.getMaxTotalCount())
                            .timeFilter(o.getTimeFilter())
                            .queryTimeoutInSeconds(o.getQueryTimeoutInSeconds())
                            .shouldIncludeColumns(o.getShouldIncludeColumns())
                            .outputFormat(o.getOutputFormat())
                            .shouldLocalize(o.getShouldLocalize())
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
     * List of filters to be applied when the query executes. More than one filter per field is not permitted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
    java.util.List<ScopeFilter> scopeFilters;

    /**
     * Maximum number of results retrieved from data source.  Note a maximum value will be enforced; if the export results can be streamed, the maximum will be 50000000, otherwise 10000; that is, if not streamed, actualMaxTotalCountUsed = Math.min(maxTotalCount, 10000).
     * <p>
     *
     * Export will incrementally stream results depending on the queryString.
     * <p>
     * Some commands including head/tail are not compatible with streaming result delivery and therefore enforce a reduced limit on overall maxtotalcount.
     *  no sort command or sort by id, e.g. ' | sort id ' - is streaming compatible
     *  sort by time and id, e.g. ' | sort -time, id ' - is streaming compatible
     * all other cases, e.g. ' | sort -time, id, mtgtguid ' - is not streaming compatible due to the additional sort field
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalCount")
    Integer maxTotalCount;

    @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
    TimeRange timeFilter;

    /**
     * Amount of time, in seconds, allowed for a query to execute. If this time expires before the query is complete, any partial results will be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryTimeoutInSeconds")
    Integer queryTimeoutInSeconds;

    /**
     * Include columns in response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeColumns")
    Boolean shouldIncludeColumns;
    /**
     * Specifies the format for the returned results.
     **/
    public enum OutputFormat {
        Csv("CSV"),
        Json("JSON"),
        ;

        private final String value;
        private static java.util.Map<String, OutputFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (OutputFormat v : OutputFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        OutputFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutputFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OutputFormat: " + key);
        }
    };
    /**
     * Specifies the format for the returned results.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputFormat")
    OutputFormat outputFormat;

    /**
     * Localize results, including header columns, List-Of-Values and timestamp values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldLocalize")
    Boolean shouldLocalize;

    /**
     * Controls if query should ignore pre-calculated results if available and only use raw data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseAcceleration")
    Boolean shouldUseAcceleration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
