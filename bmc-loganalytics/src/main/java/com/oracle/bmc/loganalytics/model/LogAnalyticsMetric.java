/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsMetric
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsMetric.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsMetric {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("aggregationField")
        private String aggregationField;

        public Builder aggregationField(String aggregationField) {
            this.aggregationField = aggregationField;
            this.__explicitlySet__.add("aggregationField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketMetadata")
        private String bucketMetadata;

        public Builder bucketMetadata(String bucketMetadata) {
            this.bucketMetadata = bucketMetadata;
            this.__explicitlySet__.add("bucketMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clockPeriod")
        private String clockPeriod;

        public Builder clockPeriod(String clockPeriod) {
            this.clockPeriod = clockPeriod;
            this.__explicitlySet__.add("clockPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
        private java.util.List<String> fieldValues;

        public Builder fieldValues(java.util.List<String> fieldValues) {
            this.fieldValues = fieldValues;
            this.__explicitlySet__.add("fieldValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupingField")
        private String groupingField;

        public Builder groupingField(String groupingField) {
            this.groupingField = groupingField;
            this.__explicitlySet__.add("groupingField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricReference")
        private Long metricReference;

        public Builder metricReference(Long metricReference) {
            this.metricReference = metricReference;
            this.__explicitlySet__.add("metricReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricType")
        private MetricType metricType;

        public Builder metricType(MetricType metricType) {
            this.metricType = metricType;
            this.__explicitlySet__.add("metricType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMetricSourceEnabled")
        private Boolean isMetricSourceEnabled;

        public Builder isMetricSourceEnabled(Boolean isMetricSourceEnabled) {
            this.isMetricSourceEnabled = isMetricSourceEnabled;
            this.__explicitlySet__.add("isMetricSourceEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<LogAnalyticsSource> sources;

        public Builder sources(java.util.List<LogAnalyticsSource> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private String unitType;

        public Builder unitType(String unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUserCustomized")
        private Boolean isUserCustomized;

        public Builder isUserCustomized(Boolean isUserCustomized) {
            this.isUserCustomized = isUserCustomized;
            this.__explicitlySet__.add("isUserCustomized");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsMetric build() {
            LogAnalyticsMetric __instance__ =
                    new LogAnalyticsMetric(
                            aggregationField,
                            bucketMetadata,
                            clockPeriod,
                            description,
                            editVersion,
                            fieldName,
                            fieldValues,
                            groupingField,
                            isEnabled,
                            isSystem,
                            displayName,
                            metricReference,
                            name,
                            metricType,
                            isMetricSourceEnabled,
                            operator,
                            sources,
                            entityType,
                            timeUpdated,
                            unitType,
                            isUserCustomized);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsMetric o) {
            Builder copiedBuilder =
                    aggregationField(o.getAggregationField())
                            .bucketMetadata(o.getBucketMetadata())
                            .clockPeriod(o.getClockPeriod())
                            .description(o.getDescription())
                            .editVersion(o.getEditVersion())
                            .fieldName(o.getFieldName())
                            .fieldValues(o.getFieldValues())
                            .groupingField(o.getGroupingField())
                            .isEnabled(o.getIsEnabled())
                            .isSystem(o.getIsSystem())
                            .displayName(o.getDisplayName())
                            .metricReference(o.getMetricReference())
                            .name(o.getName())
                            .metricType(o.getMetricType())
                            .isMetricSourceEnabled(o.getIsMetricSourceEnabled())
                            .operator(o.getOperator())
                            .sources(o.getSources())
                            .entityType(o.getEntityType())
                            .timeUpdated(o.getTimeUpdated())
                            .unitType(o.getUnitType())
                            .isUserCustomized(o.getIsUserCustomized());

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
     * aggregation field
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregationField")
    String aggregationField;

    /**
     * bucket metadata
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketMetadata")
    String bucketMetadata;

    /**
     * clock period
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clockPeriod")
    String clockPeriod;

    /**
     * description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * edit version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    Long editVersion;

    /**
     * field name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    String fieldName;

    /**
     * field value array
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
    java.util.List<String> fieldValues;

    /**
     * grouping fields
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupingField")
    String groupingField;

    /**
     * is enabled flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * is system flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * metric display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * metric Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricReference")
    Long metricReference;

    /**
     * name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * metric type
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MetricType {
        Count("COUNT"),
        Sum("SUM"),
        Average("AVERAGE"),
        CountDistribution("COUNT_DISTRIBUTION"),
        SumDistribution("SUM_DISTRIBUTION"),
        AverageDistribution("AVERAGE_DISTRIBUTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MetricType> map;

        static {
            map = new java.util.HashMap<>();
            for (MetricType v : MetricType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MetricType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MetricType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MetricType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * metric type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricType")
    MetricType metricType;

    /**
     * is metric source map enabled flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricSourceEnabled")
    Boolean isMetricSourceEnabled;
    /**
     * operator
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Operator {
        ContainsIgnoreCase("CONTAINS_IGNORE_CASE"),
        InIgnoreCase("IN_IGNORE_CASE"),
        EqualIgnoreCase("EQUAL_IGNORE_CASE"),
        NotNull("NOT_NULL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Operator> map;

        static {
            map = new java.util.HashMap<>();
            for (Operator v : Operator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Operator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Operator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    Operator operator;

    /**
     * sources
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    java.util.List<LogAnalyticsSource> sources;

    /**
     * entity type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    String entityType;

    /**
     * last updated date
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * unit type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    String unitType;

    /**
     * user customized
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUserCustomized")
    Boolean isUserCustomized;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
