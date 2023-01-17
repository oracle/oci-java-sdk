/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsMetric.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsMetric extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "aggregationField",
        "bucketMetadata",
        "clockPeriod",
        "description",
        "editVersion",
        "fieldName",
        "fieldValues",
        "groupingField",
        "isEnabled",
        "isSystem",
        "displayName",
        "metricReference",
        "name",
        "metricType",
        "isMetricSourceEnabled",
        "operator",
        "sources",
        "entityType",
        "timeUpdated",
        "unitType",
        "isUserCustomized"
    })
    public LogAnalyticsMetric(
            String aggregationField,
            String bucketMetadata,
            String clockPeriod,
            String description,
            Long editVersion,
            String fieldName,
            java.util.List<String> fieldValues,
            String groupingField,
            Boolean isEnabled,
            Boolean isSystem,
            String displayName,
            Long metricReference,
            String name,
            MetricType metricType,
            Boolean isMetricSourceEnabled,
            Operator operator,
            java.util.List<LogAnalyticsSource> sources,
            String entityType,
            java.util.Date timeUpdated,
            String unitType,
            Boolean isUserCustomized) {
        super();
        this.aggregationField = aggregationField;
        this.bucketMetadata = bucketMetadata;
        this.clockPeriod = clockPeriod;
        this.description = description;
        this.editVersion = editVersion;
        this.fieldName = fieldName;
        this.fieldValues = fieldValues;
        this.groupingField = groupingField;
        this.isEnabled = isEnabled;
        this.isSystem = isSystem;
        this.displayName = displayName;
        this.metricReference = metricReference;
        this.name = name;
        this.metricType = metricType;
        this.isMetricSourceEnabled = isMetricSourceEnabled;
        this.operator = operator;
        this.sources = sources;
        this.entityType = entityType;
        this.timeUpdated = timeUpdated;
        this.unitType = unitType;
        this.isUserCustomized = isUserCustomized;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The aggregation field.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aggregationField")
        private String aggregationField;

        /**
         * The aggregation field.
         * @param aggregationField the value to set
         * @return this builder
         **/
        public Builder aggregationField(String aggregationField) {
            this.aggregationField = aggregationField;
            this.__explicitlySet__.add("aggregationField");
            return this;
        }
        /**
         * The bucket metadata.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketMetadata")
        private String bucketMetadata;

        /**
         * The bucket metadata.
         * @param bucketMetadata the value to set
         * @return this builder
         **/
        public Builder bucketMetadata(String bucketMetadata) {
            this.bucketMetadata = bucketMetadata;
            this.__explicitlySet__.add("bucketMetadata");
            return this;
        }
        /**
         * The clock period.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clockPeriod")
        private String clockPeriod;

        /**
         * The clock period.
         * @param clockPeriod the value to set
         * @return this builder
         **/
        public Builder clockPeriod(String clockPeriod) {
            this.clockPeriod = clockPeriod;
            this.__explicitlySet__.add("clockPeriod");
            return this;
        }
        /**
         * The metric description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The metric description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The metric edit version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        /**
         * The metric edit version.
         * @param editVersion the value to set
         * @return this builder
         **/
        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }
        /**
         * The field name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * The field name.
         * @param fieldName the value to set
         * @return this builder
         **/
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * The field values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
        private java.util.List<String> fieldValues;

        /**
         * The field values.
         * @param fieldValues the value to set
         * @return this builder
         **/
        public Builder fieldValues(java.util.List<String> fieldValues) {
            this.fieldValues = fieldValues;
            this.__explicitlySet__.add("fieldValues");
            return this;
        }
        /**
         * The grouping fields.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupingField")
        private String groupingField;

        /**
         * The grouping fields.
         * @param groupingField the value to set
         * @return this builder
         **/
        public Builder groupingField(String groupingField) {
            this.groupingField = groupingField;
            this.__explicitlySet__.add("groupingField");
            return this;
        }
        /**
         * A flag inidcating whether or not the metric is enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag inidcating whether or not the metric is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         **/
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /**
         * The metric display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The metric display name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The metric unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricReference")
        private Long metricReference;

        /**
         * The metric unique identifier.
         * @param metricReference the value to set
         * @return this builder
         **/
        public Builder metricReference(Long metricReference) {
            this.metricReference = metricReference;
            this.__explicitlySet__.add("metricReference");
            return this;
        }
        /**
         * The metric name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The metric name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The metric type, specifying the type of aggreation to perform.  Default value
         * is COUNT.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricType")
        private MetricType metricType;

        /**
         * The metric type, specifying the type of aggreation to perform.  Default value
         * is COUNT.
         *
         * @param metricType the value to set
         * @return this builder
         **/
        public Builder metricType(MetricType metricType) {
            this.metricType = metricType;
            this.__explicitlySet__.add("metricType");
            return this;
        }
        /**
         * A flag specifying whether or not the metric source is enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMetricSourceEnabled")
        private Boolean isMetricSourceEnabled;

        /**
         * A flag specifying whether or not the metric source is enabled.
         *
         * @param isMetricSourceEnabled the value to set
         * @return this builder
         **/
        public Builder isMetricSourceEnabled(Boolean isMetricSourceEnabled) {
            this.isMetricSourceEnabled = isMetricSourceEnabled;
            this.__explicitlySet__.add("isMetricSourceEnabled");
            return this;
        }
        /**
         * The metric operator.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        /**
         * The metric operator.
         * @param operator the value to set
         * @return this builder
         **/
        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }
        /**
         * The metric sources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<LogAnalyticsSource> sources;

        /**
         * The metric sources.
         * @param sources the value to set
         * @return this builder
         **/
        public Builder sources(java.util.List<LogAnalyticsSource> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }
        /**
         * The entity type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The entity type.
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * The last updated date.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last updated date.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The unit type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private String unitType;

        /**
         * The unit type.
         * @param unitType the value to set
         * @return this builder
         **/
        public Builder unitType(String unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }
        /**
         * A flag specifying whether or not this is a custom (user defined) metric.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUserCustomized")
        private Boolean isUserCustomized;

        /**
         * A flag specifying whether or not this is a custom (user defined) metric.
         *
         * @param isUserCustomized the value to set
         * @return this builder
         **/
        public Builder isUserCustomized(Boolean isUserCustomized) {
            this.isUserCustomized = isUserCustomized;
            this.__explicitlySet__.add("isUserCustomized");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsMetric build() {
            LogAnalyticsMetric model =
                    new LogAnalyticsMetric(
                            this.aggregationField,
                            this.bucketMetadata,
                            this.clockPeriod,
                            this.description,
                            this.editVersion,
                            this.fieldName,
                            this.fieldValues,
                            this.groupingField,
                            this.isEnabled,
                            this.isSystem,
                            this.displayName,
                            this.metricReference,
                            this.name,
                            this.metricType,
                            this.isMetricSourceEnabled,
                            this.operator,
                            this.sources,
                            this.entityType,
                            this.timeUpdated,
                            this.unitType,
                            this.isUserCustomized);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsMetric model) {
            if (model.wasPropertyExplicitlySet("aggregationField")) {
                this.aggregationField(model.getAggregationField());
            }
            if (model.wasPropertyExplicitlySet("bucketMetadata")) {
                this.bucketMetadata(model.getBucketMetadata());
            }
            if (model.wasPropertyExplicitlySet("clockPeriod")) {
                this.clockPeriod(model.getClockPeriod());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("editVersion")) {
                this.editVersion(model.getEditVersion());
            }
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("fieldValues")) {
                this.fieldValues(model.getFieldValues());
            }
            if (model.wasPropertyExplicitlySet("groupingField")) {
                this.groupingField(model.getGroupingField());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("metricReference")) {
                this.metricReference(model.getMetricReference());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("metricType")) {
                this.metricType(model.getMetricType());
            }
            if (model.wasPropertyExplicitlySet("isMetricSourceEnabled")) {
                this.isMetricSourceEnabled(model.getIsMetricSourceEnabled());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("sources")) {
                this.sources(model.getSources());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("unitType")) {
                this.unitType(model.getUnitType());
            }
            if (model.wasPropertyExplicitlySet("isUserCustomized")) {
                this.isUserCustomized(model.getIsUserCustomized());
            }
            return this;
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
     * The aggregation field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregationField")
    private final String aggregationField;

    /**
     * The aggregation field.
     * @return the value
     **/
    public String getAggregationField() {
        return aggregationField;
    }

    /**
     * The bucket metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketMetadata")
    private final String bucketMetadata;

    /**
     * The bucket metadata.
     * @return the value
     **/
    public String getBucketMetadata() {
        return bucketMetadata;
    }

    /**
     * The clock period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clockPeriod")
    private final String clockPeriod;

    /**
     * The clock period.
     * @return the value
     **/
    public String getClockPeriod() {
        return clockPeriod;
    }

    /**
     * The metric description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The metric description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The metric edit version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    /**
     * The metric edit version.
     * @return the value
     **/
    public Long getEditVersion() {
        return editVersion;
    }

    /**
     * The field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * The field name.
     * @return the value
     **/
    public String getFieldName() {
        return fieldName;
    }

    /**
     * The field values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
    private final java.util.List<String> fieldValues;

    /**
     * The field values.
     * @return the value
     **/
    public java.util.List<String> getFieldValues() {
        return fieldValues;
    }

    /**
     * The grouping fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupingField")
    private final String groupingField;

    /**
     * The grouping fields.
     * @return the value
     **/
    public String getGroupingField() {
        return groupingField;
    }

    /**
     * A flag inidcating whether or not the metric is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag inidcating whether or not the metric is enabled.
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     * @return the value
     **/
    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * The metric display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The metric display name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The metric unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricReference")
    private final Long metricReference;

    /**
     * The metric unique identifier.
     * @return the value
     **/
    public Long getMetricReference() {
        return metricReference;
    }

    /**
     * The metric name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The metric name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The metric type, specifying the type of aggreation to perform.  Default value
     * is COUNT.
     *
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MetricType.class);

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
     * The metric type, specifying the type of aggreation to perform.  Default value
     * is COUNT.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricType")
    private final MetricType metricType;

    /**
     * The metric type, specifying the type of aggreation to perform.  Default value
     * is COUNT.
     *
     * @return the value
     **/
    public MetricType getMetricType() {
        return metricType;
    }

    /**
     * A flag specifying whether or not the metric source is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricSourceEnabled")
    private final Boolean isMetricSourceEnabled;

    /**
     * A flag specifying whether or not the metric source is enabled.
     *
     * @return the value
     **/
    public Boolean getIsMetricSourceEnabled() {
        return isMetricSourceEnabled;
    }

    /**
     * The metric operator.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Operator.class);

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
     * The metric operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final Operator operator;

    /**
     * The metric operator.
     * @return the value
     **/
    public Operator getOperator() {
        return operator;
    }

    /**
     * The metric sources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<LogAnalyticsSource> sources;

    /**
     * The metric sources.
     * @return the value
     **/
    public java.util.List<LogAnalyticsSource> getSources() {
        return sources;
    }

    /**
     * The entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The entity type.
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
    }

    /**
     * The last updated date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last updated date.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The unit type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    private final String unitType;

    /**
     * The unit type.
     * @return the value
     **/
    public String getUnitType() {
        return unitType;
    }

    /**
     * A flag specifying whether or not this is a custom (user defined) metric.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUserCustomized")
    private final Boolean isUserCustomized;

    /**
     * A flag specifying whether or not this is a custom (user defined) metric.
     *
     * @return the value
     **/
    public Boolean getIsUserCustomized() {
        return isUserCustomized;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsMetric(");
        sb.append("super=").append(super.toString());
        sb.append("aggregationField=").append(String.valueOf(this.aggregationField));
        sb.append(", bucketMetadata=").append(String.valueOf(this.bucketMetadata));
        sb.append(", clockPeriod=").append(String.valueOf(this.clockPeriod));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", editVersion=").append(String.valueOf(this.editVersion));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", fieldValues=").append(String.valueOf(this.fieldValues));
        sb.append(", groupingField=").append(String.valueOf(this.groupingField));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", metricReference=").append(String.valueOf(this.metricReference));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", metricType=").append(String.valueOf(this.metricType));
        sb.append(", isMetricSourceEnabled=").append(String.valueOf(this.isMetricSourceEnabled));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", unitType=").append(String.valueOf(this.unitType));
        sb.append(", isUserCustomized=").append(String.valueOf(this.isUserCustomized));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsMetric)) {
            return false;
        }

        LogAnalyticsMetric other = (LogAnalyticsMetric) o;
        return java.util.Objects.equals(this.aggregationField, other.aggregationField)
                && java.util.Objects.equals(this.bucketMetadata, other.bucketMetadata)
                && java.util.Objects.equals(this.clockPeriod, other.clockPeriod)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.editVersion, other.editVersion)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.fieldValues, other.fieldValues)
                && java.util.Objects.equals(this.groupingField, other.groupingField)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.metricReference, other.metricReference)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.metricType, other.metricType)
                && java.util.Objects.equals(this.isMetricSourceEnabled, other.isMetricSourceEnabled)
                && java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.sources, other.sources)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.unitType, other.unitType)
                && java.util.Objects.equals(this.isUserCustomized, other.isUserCustomized)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.aggregationField == null ? 43 : this.aggregationField.hashCode());
        result =
                (result * PRIME)
                        + (this.bucketMetadata == null ? 43 : this.bucketMetadata.hashCode());
        result = (result * PRIME) + (this.clockPeriod == null ? 43 : this.clockPeriod.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.editVersion == null ? 43 : this.editVersion.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.fieldValues == null ? 43 : this.fieldValues.hashCode());
        result =
                (result * PRIME)
                        + (this.groupingField == null ? 43 : this.groupingField.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.metricReference == null ? 43 : this.metricReference.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.metricType == null ? 43 : this.metricType.hashCode());
        result =
                (result * PRIME)
                        + (this.isMetricSourceEnabled == null
                                ? 43
                                : this.isMetricSourceEnabled.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.unitType == null ? 43 : this.unitType.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserCustomized == null ? 43 : this.isUserCustomized.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
