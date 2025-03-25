/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The destination metric for data transferred from the source.
 * For configuration instructions, see
 * [Creating a Connector](https://docs.oracle.com/iaas/Content/connector-hub/create-service-connector.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitoringTargetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonitoringTargetDetails extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The namespace of the metric.
         * Example: {@code oci_computeagent}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricNamespace")
        private String metricNamespace;

        /**
         * The namespace of the metric.
         * Example: {@code oci_computeagent}
         *
         * @param metricNamespace the value to set
         * @return this builder
         **/
        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = metricNamespace;
            this.__explicitlySet__.add("metricNamespace");
            return this;
        }
        /**
         * The name of the metric.
         * Example: {@code CpuUtilization}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metric")
        private String metric;

        /**
         * The name of the metric.
         * Example: {@code CpuUtilization}
         *
         * @param metric the value to set
         * @return this builder
         **/
        public Builder metric(String metric) {
            this.metric = metric;
            this.__explicitlySet__.add("metric");
            return this;
        }
        /**
         * List of dimension names and values.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<DimensionDetails> dimensions;

        /**
         * List of dimension names and values.
         *
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.List<DimensionDetails> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitoringTargetDetails build() {
            MonitoringTargetDetails model =
                    new MonitoringTargetDetails(
                            this.compartmentId, this.metricNamespace, this.metric, this.dimensions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitoringTargetDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("metricNamespace")) {
                this.metricNamespace(model.getMetricNamespace());
            }
            if (model.wasPropertyExplicitlySet("metric")) {
                this.metric(model.getMetric());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
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

    @Deprecated
    public MonitoringTargetDetails(
            String compartmentId,
            String metricNamespace,
            String metric,
            java.util.List<DimensionDetails> dimensions) {
        super();
        this.compartmentId = compartmentId;
        this.metricNamespace = metricNamespace;
        this.metric = metric;
        this.dimensions = dimensions;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The namespace of the metric.
     * Example: {@code oci_computeagent}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricNamespace")
    private final String metricNamespace;

    /**
     * The namespace of the metric.
     * Example: {@code oci_computeagent}
     *
     * @return the value
     **/
    public String getMetricNamespace() {
        return metricNamespace;
    }

    /**
     * The name of the metric.
     * Example: {@code CpuUtilization}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    private final String metric;

    /**
     * The name of the metric.
     * Example: {@code CpuUtilization}
     *
     * @return the value
     **/
    public String getMetric() {
        return metric;
    }

    /**
     * List of dimension names and values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<DimensionDetails> dimensions;

    /**
     * List of dimension names and values.
     *
     * @return the value
     **/
    public java.util.List<DimensionDetails> getDimensions() {
        return dimensions;
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
        sb.append("MonitoringTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", metricNamespace=").append(String.valueOf(this.metricNamespace));
        sb.append(", metric=").append(String.valueOf(this.metric));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitoringTargetDetails)) {
            return false;
        }

        MonitoringTargetDetails other = (MonitoringTargetDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.metricNamespace, other.metricNamespace)
                && java.util.Objects.equals(this.metric, other.metric)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.metricNamespace == null ? 43 : this.metricNamespace.hashCode());
        result = (result * PRIME) + (this.metric == null ? 43 : this.metric.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        return result;
    }
}
