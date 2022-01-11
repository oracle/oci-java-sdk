/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage CLUSTERCOMPARE command.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClusterCompareCommandDescriptor.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ClusterCompareCommandDescriptor extends AbstractCommandDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedFields")
        private java.util.List<AbstractField> referencedFields;

        public Builder referencedFields(java.util.List<AbstractField> referencedFields) {
            this.referencedFields = referencedFields;
            this.__explicitlySet__.add("referencedFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("declaredFields")
        private java.util.List<AbstractField> declaredFields;

        public Builder declaredFields(java.util.List<AbstractField> declaredFields) {
            this.declaredFields = declaredFields;
            this.__explicitlySet__.add("declaredFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeShift")
        private String timeShift;

        public Builder timeShift(String timeShift) {
            this.timeShift = timeShift;
            this.__explicitlySet__.add("timeShift");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private Long timeStart;

        public Builder timeStart(Long timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private Long timeEnd;

        public Builder timeEnd(Long timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTrends")
        private Boolean shouldIncludeTrends;

        public Builder shouldIncludeTrends(Boolean shouldIncludeTrends) {
            this.shouldIncludeTrends = shouldIncludeTrends;
            this.__explicitlySet__.add("shouldIncludeTrends");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("span")
        private String span;

        public Builder span(String span) {
            this.span = span;
            this.__explicitlySet__.add("span");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("baselineQuery")
        private String baselineQuery;

        public Builder baselineQuery(String baselineQuery) {
            this.baselineQuery = baselineQuery;
            this.__explicitlySet__.add("baselineQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterCompareCommandDescriptor build() {
            ClusterCompareCommandDescriptor __instance__ =
                    new ClusterCompareCommandDescriptor(
                            displayQueryString,
                            internalQueryString,
                            category,
                            referencedFields,
                            declaredFields,
                            timeShift,
                            timeStart,
                            timeEnd,
                            shouldIncludeTrends,
                            span,
                            baselineQuery);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterCompareCommandDescriptor o) {
            Builder copiedBuilder =
                    displayQueryString(o.getDisplayQueryString())
                            .internalQueryString(o.getInternalQueryString())
                            .category(o.getCategory())
                            .referencedFields(o.getReferencedFields())
                            .declaredFields(o.getDeclaredFields())
                            .timeShift(o.getTimeShift())
                            .timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .shouldIncludeTrends(o.getShouldIncludeTrends())
                            .span(o.getSpan())
                            .baselineQuery(o.getBaselineQuery());

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

    @Deprecated
    public ClusterCompareCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            String timeShift,
            Long timeStart,
            Long timeEnd,
            Boolean shouldIncludeTrends,
            String span,
            String baselineQuery) {
        super(displayQueryString, internalQueryString, category, referencedFields, declaredFields);
        this.timeShift = timeShift;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.shouldIncludeTrends = shouldIncludeTrends;
        this.span = span;
        this.baselineQuery = baselineQuery;
    }

    /**
     * To shift time range of main query backwards using a relative time expression e.g -24hrs. E.g compare against the previous 24 hrs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeShift")
    String timeShift;

    /**
     * Start time to apply to base line query if specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    Long timeStart;

    /**
     * End time to apply to base line query if specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    Long timeEnd;

    /**
     * Option to calculate trends of each cluster if specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTrends")
    Boolean shouldIncludeTrends;

    /**
     * Option to control the size of buckets in the histogram e.g 8hrs  - each bar other than first and last should represent 8hr time span. Will be adjusted to a larger span if time range is very large.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("span")
    String span;

    /**
     * Query to use to compute base line to compare top level query results against to identify differences if specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineQuery")
    String baselineQuery;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
