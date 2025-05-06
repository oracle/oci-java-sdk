/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Input arguments for running a query synchronosly and streaming the results as soon as they become
 * available. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "compartmentIdInSubtree",
        "queryString",
        "subSystem",
        "scopeFilters",
        "maxTotalCount",
        "timeFilter",
        "queryTimeoutInSeconds",
        "shouldIncludeColumns",
        "outputFormat",
        "shouldLocalize",
        "shouldUseAcceleration"
    })
    public ExportDetails(
            String compartmentId,
            Boolean compartmentIdInSubtree,
            String queryString,
            SubSystemName subSystem,
            java.util.List<ScopeFilter> scopeFilters,
            Integer maxTotalCount,
            TimeRange timeFilter,
            Integer queryTimeoutInSeconds,
            Boolean shouldIncludeColumns,
            OutputFormat outputFormat,
            Boolean shouldLocalize,
            Boolean shouldUseAcceleration) {
        super();
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.queryString = queryString;
        this.subSystem = subSystem;
        this.scopeFilters = scopeFilters;
        this.maxTotalCount = maxTotalCount;
        this.timeFilter = timeFilter;
        this.queryTimeoutInSeconds = queryTimeoutInSeconds;
        this.shouldIncludeColumns = shouldIncludeColumns;
        this.outputFormat = outputFormat;
        this.shouldLocalize = shouldLocalize;
        this.shouldUseAcceleration = shouldUseAcceleration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compartment Identifier [OCID]
         * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID]
         * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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
        /** Query to perform. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryString")
        private String queryString;

        /**
         * Query to perform.
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
         * Maximum number of results retrieved from data source is determined by the specific query
         * used and the maxTotalCount input field. If the export results can be streamed, the
         * maximum will be 1,000,000. If the results cannot be streamed, the maximum limit is 500
         * for queries that include the link command and 10,000 for the queries that do not include
         * the link command.
         *
         * <p>Queries that include certain commands such as head, tail or stats cannot be streamed
         * and are subject to a maximum of 10,000 results. Queries that include the sort command
         * cannot be streamed unless the sort fields are restricted to id and/or time. The maximum
         * number of results retrieved is the lesser of the maxTotalCount input provided and the
         * applicable limit described above.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTotalCount")
        private Integer maxTotalCount;

        /**
         * Maximum number of results retrieved from data source is determined by the specific query
         * used and the maxTotalCount input field. If the export results can be streamed, the
         * maximum will be 1,000,000. If the results cannot be streamed, the maximum limit is 500
         * for queries that include the link command and 10,000 for the queries that do not include
         * the link command.
         *
         * <p>Queries that include certain commands such as head, tail or stats cannot be streamed
         * and are subject to a maximum of 10,000 results. Queries that include the sort command
         * cannot be streamed unless the sort fields are restricted to id and/or time. The maximum
         * number of results retrieved is the lesser of the maxTotalCount input provided and the
         * applicable limit described above.
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
        /** Specifies the format for the returned results. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputFormat")
        private OutputFormat outputFormat;

        /**
         * Specifies the format for the returned results.
         *
         * @param outputFormat the value to set
         * @return this builder
         */
        public Builder outputFormat(OutputFormat outputFormat) {
            this.outputFormat = outputFormat;
            this.__explicitlySet__.add("outputFormat");
            return this;
        }
        /** Localize results, including header columns, List-Of-Values and timestamp values. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldLocalize")
        private Boolean shouldLocalize;

        /**
         * Localize results, including header columns, List-Of-Values and timestamp values.
         *
         * @param shouldLocalize the value to set
         * @return this builder
         */
        public Builder shouldLocalize(Boolean shouldLocalize) {
            this.shouldLocalize = shouldLocalize;
            this.__explicitlySet__.add("shouldLocalize");
            return this;
        }
        /**
         * Controls if query should ignore pre-calculated results if available and only use raw
         * data.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldUseAcceleration")
        private Boolean shouldUseAcceleration;

        /**
         * Controls if query should ignore pre-calculated results if available and only use raw
         * data.
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

        public ExportDetails build() {
            ExportDetails model =
                    new ExportDetails(
                            this.compartmentId,
                            this.compartmentIdInSubtree,
                            this.queryString,
                            this.subSystem,
                            this.scopeFilters,
                            this.maxTotalCount,
                            this.timeFilter,
                            this.queryTimeoutInSeconds,
                            this.shouldIncludeColumns,
                            this.outputFormat,
                            this.shouldLocalize,
                            this.shouldUseAcceleration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentIdInSubtree")) {
                this.compartmentIdInSubtree(model.getCompartmentIdInSubtree());
            }
            if (model.wasPropertyExplicitlySet("queryString")) {
                this.queryString(model.getQueryString());
            }
            if (model.wasPropertyExplicitlySet("subSystem")) {
                this.subSystem(model.getSubSystem());
            }
            if (model.wasPropertyExplicitlySet("scopeFilters")) {
                this.scopeFilters(model.getScopeFilters());
            }
            if (model.wasPropertyExplicitlySet("maxTotalCount")) {
                this.maxTotalCount(model.getMaxTotalCount());
            }
            if (model.wasPropertyExplicitlySet("timeFilter")) {
                this.timeFilter(model.getTimeFilter());
            }
            if (model.wasPropertyExplicitlySet("queryTimeoutInSeconds")) {
                this.queryTimeoutInSeconds(model.getQueryTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("shouldIncludeColumns")) {
                this.shouldIncludeColumns(model.getShouldIncludeColumns());
            }
            if (model.wasPropertyExplicitlySet("outputFormat")) {
                this.outputFormat(model.getOutputFormat());
            }
            if (model.wasPropertyExplicitlySet("shouldLocalize")) {
                this.shouldLocalize(model.getShouldLocalize());
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
     * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID]
     * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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

    /** Query to perform. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    private final String queryString;

    /**
     * Query to perform.
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
     * Maximum number of results retrieved from data source is determined by the specific query used
     * and the maxTotalCount input field. If the export results can be streamed, the maximum will be
     * 1,000,000. If the results cannot be streamed, the maximum limit is 500 for queries that
     * include the link command and 10,000 for the queries that do not include the link command.
     *
     * <p>Queries that include certain commands such as head, tail or stats cannot be streamed and
     * are subject to a maximum of 10,000 results. Queries that include the sort command cannot be
     * streamed unless the sort fields are restricted to id and/or time. The maximum number of
     * results retrieved is the lesser of the maxTotalCount input provided and the applicable limit
     * described above.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalCount")
    private final Integer maxTotalCount;

    /**
     * Maximum number of results retrieved from data source is determined by the specific query used
     * and the maxTotalCount input field. If the export results can be streamed, the maximum will be
     * 1,000,000. If the results cannot be streamed, the maximum limit is 500 for queries that
     * include the link command and 10,000 for the queries that do not include the link command.
     *
     * <p>Queries that include certain commands such as head, tail or stats cannot be streamed and
     * are subject to a maximum of 10,000 results. Queries that include the sort command cannot be
     * streamed unless the sort fields are restricted to id and/or time. The maximum number of
     * results retrieved is the lesser of the maxTotalCount input provided and the applicable limit
     * described above.
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

    /** Specifies the format for the returned results. */
    public enum OutputFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Csv("CSV"),
        Json("JSON"),
        Parquet("PARQUET"),
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
    /** Specifies the format for the returned results. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputFormat")
    private final OutputFormat outputFormat;

    /**
     * Specifies the format for the returned results.
     *
     * @return the value
     */
    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    /** Localize results, including header columns, List-Of-Values and timestamp values. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldLocalize")
    private final Boolean shouldLocalize;

    /**
     * Localize results, including header columns, List-Of-Values and timestamp values.
     *
     * @return the value
     */
    public Boolean getShouldLocalize() {
        return shouldLocalize;
    }

    /**
     * Controls if query should ignore pre-calculated results if available and only use raw data.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseAcceleration")
    private final Boolean shouldUseAcceleration;

    /**
     * Controls if query should ignore pre-calculated results if available and only use raw data.
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
        sb.append("ExportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(", queryString=").append(String.valueOf(this.queryString));
        sb.append(", subSystem=").append(String.valueOf(this.subSystem));
        sb.append(", scopeFilters=").append(String.valueOf(this.scopeFilters));
        sb.append(", maxTotalCount=").append(String.valueOf(this.maxTotalCount));
        sb.append(", timeFilter=").append(String.valueOf(this.timeFilter));
        sb.append(", queryTimeoutInSeconds=").append(String.valueOf(this.queryTimeoutInSeconds));
        sb.append(", shouldIncludeColumns=").append(String.valueOf(this.shouldIncludeColumns));
        sb.append(", outputFormat=").append(String.valueOf(this.outputFormat));
        sb.append(", shouldLocalize=").append(String.valueOf(this.shouldLocalize));
        sb.append(", shouldUseAcceleration=").append(String.valueOf(this.shouldUseAcceleration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportDetails)) {
            return false;
        }

        ExportDetails other = (ExportDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.queryString, other.queryString)
                && java.util.Objects.equals(this.subSystem, other.subSystem)
                && java.util.Objects.equals(this.scopeFilters, other.scopeFilters)
                && java.util.Objects.equals(this.maxTotalCount, other.maxTotalCount)
                && java.util.Objects.equals(this.timeFilter, other.timeFilter)
                && java.util.Objects.equals(this.queryTimeoutInSeconds, other.queryTimeoutInSeconds)
                && java.util.Objects.equals(this.shouldIncludeColumns, other.shouldIncludeColumns)
                && java.util.Objects.equals(this.outputFormat, other.outputFormat)
                && java.util.Objects.equals(this.shouldLocalize, other.shouldLocalize)
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
        result = (result * PRIME) + (this.queryString == null ? 43 : this.queryString.hashCode());
        result = (result * PRIME) + (this.subSystem == null ? 43 : this.subSystem.hashCode());
        result = (result * PRIME) + (this.scopeFilters == null ? 43 : this.scopeFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTotalCount == null ? 43 : this.maxTotalCount.hashCode());
        result = (result * PRIME) + (this.timeFilter == null ? 43 : this.timeFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.queryTimeoutInSeconds == null
                                ? 43
                                : this.queryTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeColumns == null
                                ? 43
                                : this.shouldIncludeColumns.hashCode());
        result = (result * PRIME) + (this.outputFormat == null ? 43 : this.outputFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldLocalize == null ? 43 : this.shouldLocalize.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldUseAcceleration == null
                                ? 43
                                : this.shouldUseAcceleration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
