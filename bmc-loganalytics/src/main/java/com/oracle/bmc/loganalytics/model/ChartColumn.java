/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Column returned by querylanguage link command.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChartColumn.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ChartColumn extends AbstractColumn {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
        private SubSystemName subSystem;

        public Builder subSystem(SubSystemName subSystem) {
            this.subSystem = subSystem;
            this.__explicitlySet__.add("subSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<FieldValue> values;

        public Builder values(java.util.List<FieldValue> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isListOfValues")
        private Boolean isListOfValues;

        public Builder isListOfValues(Boolean isListOfValues) {
            this.isListOfValues = isListOfValues;
            this.__explicitlySet__.add("isListOfValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
        private Boolean isMultiValued;

        public Builder isMultiValued(Boolean isMultiValued) {
            this.isMultiValued = isMultiValued;
            this.__explicitlySet__.add("isMultiValued");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isGroupable")
        private Boolean isGroupable;

        public Builder isGroupable(Boolean isGroupable) {
            this.isGroupable = isGroupable;
            this.__explicitlySet__.add("isGroupable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEvaluable")
        private Boolean isEvaluable;

        public Builder isEvaluable(Boolean isEvaluable) {
            this.isEvaluable = isEvaluable;
            this.__explicitlySet__.add("isEvaluable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ValueType valueType;

        public Builder valueType(ValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originalDisplayName")
        private String originalDisplayName;

        public Builder originalDisplayName(String originalDisplayName) {
            this.originalDisplayName = originalDisplayName;
            this.__explicitlySet__.add("originalDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalName")
        private String internalName;

        public Builder internalName(String internalName) {
            this.internalName = internalName;
            this.__explicitlySet__.add("internalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intervalGap")
        private String intervalGap;

        public Builder intervalGap(String intervalGap) {
            this.intervalGap = intervalGap;
            this.__explicitlySet__.add("intervalGap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intervals")
        private java.util.List<Long> intervals;

        public Builder intervals(java.util.List<Long> intervals) {
            this.intervals = intervals;
            this.__explicitlySet__.add("intervals");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalIntervalCounts")
        private java.util.List<Long> totalIntervalCounts;

        public Builder totalIntervalCounts(java.util.List<Long> totalIntervalCounts) {
            this.totalIntervalCounts = totalIntervalCounts;
            this.__explicitlySet__.add("totalIntervalCounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("series")
        private java.util.List<ChartDataColumn> series;

        public Builder series(java.util.List<ChartDataColumn> series) {
            this.series = series;
            this.__explicitlySet__.add("series");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChartColumn build() {
            ChartColumn __instance__ =
                    new ChartColumn(
                            displayName,
                            subSystem,
                            values,
                            isListOfValues,
                            isMultiValued,
                            isGroupable,
                            isEvaluable,
                            valueType,
                            originalDisplayName,
                            internalName,
                            intervalGap,
                            intervals,
                            totalIntervalCounts,
                            series);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChartColumn o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .subSystem(o.getSubSystem())
                            .values(o.getValues())
                            .isListOfValues(o.getIsListOfValues())
                            .isMultiValued(o.getIsMultiValued())
                            .isGroupable(o.getIsGroupable())
                            .isEvaluable(o.getIsEvaluable())
                            .valueType(o.getValueType())
                            .originalDisplayName(o.getOriginalDisplayName())
                            .internalName(o.getInternalName())
                            .intervalGap(o.getIntervalGap())
                            .intervals(o.getIntervals())
                            .totalIntervalCounts(o.getTotalIntervalCounts())
                            .series(o.getSeries());

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
    public ChartColumn(
            String displayName,
            SubSystemName subSystem,
            java.util.List<FieldValue> values,
            Boolean isListOfValues,
            Boolean isMultiValued,
            Boolean isGroupable,
            Boolean isEvaluable,
            ValueType valueType,
            String originalDisplayName,
            String internalName,
            String intervalGap,
            java.util.List<Long> intervals,
            java.util.List<Long> totalIntervalCounts,
            java.util.List<ChartDataColumn> series) {
        super(
                displayName,
                subSystem,
                values,
                isListOfValues,
                isMultiValued,
                isGroupable,
                isEvaluable,
                valueType,
                originalDisplayName,
                internalName);
        this.intervalGap = intervalGap;
        this.intervals = intervals;
        this.totalIntervalCounts = totalIntervalCounts;
        this.series = series;
    }

    /**
     * Time span between each timestamp in the timeseries datapoints.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalGap")
    String intervalGap;

    /**
     * List of timestamps making up the timeseries datapoints.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervals")
    java.util.List<Long> intervals;

    /**
     * Total matching count for each timeseries datapoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalIntervalCounts")
    java.util.List<Long> totalIntervalCounts;

    /**
     * List of series data sets representing various link command results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("series")
    java.util.List<ChartDataColumn> series;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
