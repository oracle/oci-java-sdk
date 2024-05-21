/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Details of a metric which is part of this metric extension
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Metric.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Metric extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "displayName",
        "isDimension",
        "computeExpression",
        "dataType",
        "isHidden",
        "metricCategory",
        "unit"
    })
    public Metric(
            String name,
            String displayName,
            Boolean isDimension,
            String computeExpression,
            DataType dataType,
            Boolean isHidden,
            MetricCategory metricCategory,
            String unit) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.isDimension = isDimension;
        this.computeExpression = computeExpression;
        this.dataType = dataType;
        this.isHidden = isHidden;
        this.metricCategory = metricCategory;
        this.unit = unit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the metric.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Display name of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the metric.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Current metric need to be included as dimension or not
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDimension")
        private Boolean isDimension;

        /**
         * Current metric need to be included as dimension or not
         * @param isDimension the value to set
         * @return this builder
         **/
        public Builder isDimension(Boolean isDimension) {
            this.isDimension = isDimension;
            this.__explicitlySet__.add("isDimension");
            return this;
        }
        /**
         * Compute Expression to calculate the value of this metric
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeExpression")
        private String computeExpression;

        /**
         * Compute Expression to calculate the value of this metric
         * @param computeExpression the value to set
         * @return this builder
         **/
        public Builder computeExpression(String computeExpression) {
            this.computeExpression = computeExpression;
            this.__explicitlySet__.add("computeExpression");
            return this;
        }
        /**
         * Data type of value of this metric
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private DataType dataType;

        /**
         * Data type of value of this metric
         * @param dataType the value to set
         * @return this builder
         **/
        public Builder dataType(DataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /**
         * Flag to marks whether a metric has to be uploaded or not. When isHidden = false -> Metric is uploaded, isHidden = true -> Metric is NOT uploaded
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        /**
         * Flag to marks whether a metric has to be uploaded or not. When isHidden = false -> Metric is uploaded, isHidden = true -> Metric is NOT uploaded
         * @param isHidden the value to set
         * @return this builder
         **/
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }
        /**
         * Metric category
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricCategory")
        private MetricCategory metricCategory;

        /**
         * Metric category
         * @param metricCategory the value to set
         * @return this builder
         **/
        public Builder metricCategory(MetricCategory metricCategory) {
            this.metricCategory = metricCategory;
            this.__explicitlySet__.add("metricCategory");
            return this;
        }
        /**
         * Unit of metric value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * Unit of metric value
         * @param unit the value to set
         * @return this builder
         **/
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Metric build() {
            Metric model =
                    new Metric(
                            this.name,
                            this.displayName,
                            this.isDimension,
                            this.computeExpression,
                            this.dataType,
                            this.isHidden,
                            this.metricCategory,
                            this.unit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Metric model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isDimension")) {
                this.isDimension(model.getIsDimension());
            }
            if (model.wasPropertyExplicitlySet("computeExpression")) {
                this.computeExpression(model.getComputeExpression());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
            }
            if (model.wasPropertyExplicitlySet("metricCategory")) {
                this.metricCategory(model.getMetricCategory());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
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
     * Name of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the metric.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Display name of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the metric.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Current metric need to be included as dimension or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDimension")
    private final Boolean isDimension;

    /**
     * Current metric need to be included as dimension or not
     * @return the value
     **/
    public Boolean getIsDimension() {
        return isDimension;
    }

    /**
     * Compute Expression to calculate the value of this metric
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeExpression")
    private final String computeExpression;

    /**
     * Compute Expression to calculate the value of this metric
     * @return the value
     **/
    public String getComputeExpression() {
        return computeExpression;
    }

    /**
     * Data type of value of this metric
     **/
    public enum DataType {
        String("STRING"),
        Number("NUMBER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataType.class);

        private final String value;
        private static java.util.Map<String, DataType> map;

        static {
            map = new java.util.HashMap<>();
            for (DataType v : DataType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Data type of value of this metric
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final DataType dataType;

    /**
     * Data type of value of this metric
     * @return the value
     **/
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Flag to marks whether a metric has to be uploaded or not. When isHidden = false -> Metric is uploaded, isHidden = true -> Metric is NOT uploaded
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    private final Boolean isHidden;

    /**
     * Flag to marks whether a metric has to be uploaded or not. When isHidden = false -> Metric is uploaded, isHidden = true -> Metric is NOT uploaded
     * @return the value
     **/
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Metric category
     **/
    public enum MetricCategory {
        Load("LOAD"),
        Utilization("UTILIZATION"),
        Capacity("CAPACITY"),
        Availability("AVAILABILITY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MetricCategory.class);

        private final String value;
        private static java.util.Map<String, MetricCategory> map;

        static {
            map = new java.util.HashMap<>();
            for (MetricCategory v : MetricCategory.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MetricCategory(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MetricCategory create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MetricCategory', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Metric category
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricCategory")
    private final MetricCategory metricCategory;

    /**
     * Metric category
     * @return the value
     **/
    public MetricCategory getMetricCategory() {
        return metricCategory;
    }

    /**
     * Unit of metric value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * Unit of metric value
     * @return the value
     **/
    public String getUnit() {
        return unit;
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
        sb.append("Metric(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isDimension=").append(String.valueOf(this.isDimension));
        sb.append(", computeExpression=").append(String.valueOf(this.computeExpression));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", isHidden=").append(String.valueOf(this.isHidden));
        sb.append(", metricCategory=").append(String.valueOf(this.metricCategory));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Metric)) {
            return false;
        }

        Metric other = (Metric) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isDimension, other.isDimension)
                && java.util.Objects.equals(this.computeExpression, other.computeExpression)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && java.util.Objects.equals(this.metricCategory, other.metricCategory)
                && java.util.Objects.equals(this.unit, other.unit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isDimension == null ? 43 : this.isDimension.hashCode());
        result =
                (result * PRIME)
                        + (this.computeExpression == null ? 43 : this.computeExpression.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.isHidden == null ? 43 : this.isHidden.hashCode());
        result =
                (result * PRIME)
                        + (this.metricCategory == null ? 43 : this.metricCategory.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
