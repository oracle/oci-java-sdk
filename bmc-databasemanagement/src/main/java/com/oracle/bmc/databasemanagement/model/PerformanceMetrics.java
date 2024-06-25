/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The Data Guard performance metric details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PerformanceMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PerformanceMetrics extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "dimensions", "metadata", "datapoints"})
    public PerformanceMetrics(
            String name,
            Object dimensions,
            Object metadata,
            java.util.List<DataPoints> datapoints) {
        super();
        this.name = name;
        this.dimensions = dimensions;
        this.metadata = metadata;
        this.datapoints = datapoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the metric.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The dimensions of the Data Guard performance metrics, such as primary database ID, primary database unique name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private Object dimensions;

        /**
         * The dimensions of the Data Guard performance metrics, such as primary database ID, primary database unique name.
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(Object dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * The metadata of the metric, such as Unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private Object metadata;

        /**
         * The metadata of the metric, such as Unit.
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The aggregated datapoints of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datapoints")
        private java.util.List<DataPoints> datapoints;

        /**
         * The aggregated datapoints of the metric.
         * @param datapoints the value to set
         * @return this builder
         **/
        public Builder datapoints(java.util.List<DataPoints> datapoints) {
            this.datapoints = datapoints;
            this.__explicitlySet__.add("datapoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PerformanceMetrics build() {
            PerformanceMetrics model =
                    new PerformanceMetrics(
                            this.name, this.dimensions, this.metadata, this.datapoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PerformanceMetrics model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("datapoints")) {
                this.datapoints(model.getDatapoints());
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
     * The name of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the metric.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The dimensions of the Data Guard performance metrics, such as primary database ID, primary database unique name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final Object dimensions;

    /**
     * The dimensions of the Data Guard performance metrics, such as primary database ID, primary database unique name.
     * @return the value
     **/
    public Object getDimensions() {
        return dimensions;
    }

    /**
     * The metadata of the metric, such as Unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final Object metadata;

    /**
     * The metadata of the metric, such as Unit.
     * @return the value
     **/
    public Object getMetadata() {
        return metadata;
    }

    /**
     * The aggregated datapoints of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datapoints")
    private final java.util.List<DataPoints> datapoints;

    /**
     * The aggregated datapoints of the metric.
     * @return the value
     **/
    public java.util.List<DataPoints> getDatapoints() {
        return datapoints;
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
        sb.append("PerformanceMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", datapoints=").append(String.valueOf(this.datapoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PerformanceMetrics)) {
            return false;
        }

        PerformanceMetrics other = (PerformanceMetrics) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.datapoints, other.datapoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.datapoints == null ? 43 : this.datapoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
