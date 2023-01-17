/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of discovery analytics data. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DiscoveryAnalyticsSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DiscoveryAnalyticsSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"metricName", "dimensions", "count"})
    public DiscoveryAnalyticsSummary(MetricName metricName, Dimensions dimensions, Long count) {
        super();
        this.metricName = metricName;
        this.dimensions = dimensions;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the aggregation metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private MetricName metricName;

        /**
         * The name of the aggregation metric.
         *
         * @param metricName the value to set
         * @return this builder
         */
        public Builder metricName(MetricName metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private Dimensions dimensions;

        public Builder dimensions(Dimensions dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /** The total count for the aggregation metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Long count;

        /**
         * The total count for the aggregation metric.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Long count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveryAnalyticsSummary build() {
            DiscoveryAnalyticsSummary model =
                    new DiscoveryAnalyticsSummary(this.metricName, this.dimensions, this.count);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveryAnalyticsSummary model) {
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
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

    /** The name of the aggregation metric. */
    public enum MetricName implements com.oracle.bmc.http.internal.BmcEnum {
        SensitiveDataModel("SENSITIVE_DATA_MODEL"),
        SensitiveType("SENSITIVE_TYPE"),
        SensitiveSchema("SENSITIVE_SCHEMA"),
        SensitiveTable("SENSITIVE_TABLE"),
        SensitiveColumn("SENSITIVE_COLUMN"),
        SensitiveDataValue("SENSITIVE_DATA_VALUE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MetricName.class);

        private final String value;
        private static java.util.Map<String, MetricName> map;

        static {
            map = new java.util.HashMap<>();
            for (MetricName v : MetricName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MetricName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MetricName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MetricName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The name of the aggregation metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final MetricName metricName;

    /**
     * The name of the aggregation metric.
     *
     * @return the value
     */
    public MetricName getMetricName() {
        return metricName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final Dimensions dimensions;

    public Dimensions getDimensions() {
        return dimensions;
    }

    /** The total count for the aggregation metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Long count;

    /**
     * The total count for the aggregation metric.
     *
     * @return the value
     */
    public Long getCount() {
        return count;
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
        sb.append("DiscoveryAnalyticsSummary(");
        sb.append("super=").append(super.toString());
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryAnalyticsSummary)) {
            return false;
        }

        DiscoveryAnalyticsSummary other = (DiscoveryAnalyticsSummary) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.count, other.count)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
