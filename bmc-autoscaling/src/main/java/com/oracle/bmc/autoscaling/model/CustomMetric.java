/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.model;

/**
 * Metric details for triggering an autoscaling action based on a custom MQL query. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CustomMetric.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricSource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomMetric extends MetricBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
        private String pendingDuration;

        public Builder pendingDuration(String pendingDuration) {
            this.pendingDuration = pendingDuration;
            this.__explicitlySet__.add("pendingDuration");
            return this;
        }
        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms
         * feature of the Monitoring service interprets results for each returned time series as
         * Boolean values, where zero represents false and a non-zero value represents true. A true
         * value means that the trigger rule condition has been met. The query must specify a
         * metric, statistic, interval, and trigger rule (threshold or absence). Supported values
         * for interval: {@code 1m}-{@code 60m} (also {@code 1h}). You can optionally specify
         * dimensions and grouping functions. Supported grouping functions: {@code grouping()},
         * {@code groupBy()}.
         *
         * <p>Example of threshold alarm:
         *
         * <p>-----
         *
         * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.groupBy(availabilityDomain).percentile(0.9)
         * > 85
         *
         * <p>-----
         */
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms
         * feature of the Monitoring service interprets results for each returned time series as
         * Boolean values, where zero represents false and a non-zero value represents true. A true
         * value means that the trigger rule condition has been met. The query must specify a
         * metric, statistic, interval, and trigger rule (threshold or absence). Supported values
         * for interval: {@code 1m}-{@code 60m} (also {@code 1h}). You can optionally specify
         * dimensions and grouping functions. Supported grouping functions: {@code grouping()},
         * {@code groupBy()}.
         *
         * <p>Example of threshold alarm:
         *
         * <p>-----
         *
         * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.groupBy(availabilityDomain).percentile(0.9)
         * > 85
         *
         * <p>-----
         *
         * @param query the value to set
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /** The namespace for the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace for the query.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The resource group for the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * The resource group for the query.
         *
         * @param resourceGroup the value to set
         * @return this builder
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }
        /** The OCID of the compartment containing the metrics. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentId")
        private String metricCompartmentId;

        /**
         * The OCID of the compartment containing the metrics.
         *
         * @param metricCompartmentId the value to set
         * @return this builder
         */
        public Builder metricCompartmentId(String metricCompartmentId) {
            this.metricCompartmentId = metricCompartmentId;
            this.__explicitlySet__.add("metricCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomMetric build() {
            CustomMetric model =
                    new CustomMetric(
                            this.pendingDuration,
                            this.query,
                            this.namespace,
                            this.resourceGroup,
                            this.metricCompartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomMetric model) {
            if (model.wasPropertyExplicitlySet("pendingDuration")) {
                this.pendingDuration(model.getPendingDuration());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("metricCompartmentId")) {
                this.metricCompartmentId(model.getMetricCompartmentId());
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

    @Deprecated
    public CustomMetric(
            String pendingDuration,
            String query,
            String namespace,
            String resourceGroup,
            String metricCompartmentId) {
        super(pendingDuration);
        this.query = query;
        this.namespace = namespace;
        this.resourceGroup = resourceGroup;
        this.metricCompartmentId = metricCompartmentId;
    }

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature
     * of the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the
     * trigger rule condition has been met. The query must specify a metric, statistic, interval,
     * and trigger rule (threshold or absence). Supported values for interval: {@code 1m}-{@code
     * 60m} (also {@code 1h}). You can optionally specify dimensions and grouping functions.
     * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
     *
     * <p>Example of threshold alarm:
     *
     * <p>-----
     *
     * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.groupBy(availabilityDomain).percentile(0.9)
     * > 85
     *
     * <p>-----
     */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature
     * of the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the
     * trigger rule condition has been met. The query must specify a metric, statistic, interval,
     * and trigger rule (threshold or absence). Supported values for interval: {@code 1m}-{@code
     * 60m} (also {@code 1h}). You can optionally specify dimensions and grouping functions.
     * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
     *
     * <p>Example of threshold alarm:
     *
     * <p>-----
     *
     * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.groupBy(availabilityDomain).percentile(0.9)
     * > 85
     *
     * <p>-----
     *
     * @return the value
     */
    public String getQuery() {
        return query;
    }

    /** The namespace for the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace for the query.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The resource group for the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * The resource group for the query.
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /** The OCID of the compartment containing the metrics. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentId")
    private final String metricCompartmentId;

    /**
     * The OCID of the compartment containing the metrics.
     *
     * @return the value
     */
    public String getMetricCompartmentId() {
        return metricCompartmentId;
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
        sb.append("CustomMetric(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", metricCompartmentId=").append(String.valueOf(this.metricCompartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomMetric)) {
            return false;
        }

        CustomMetric other = (CustomMetric) o;
        return java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.metricCompartmentId, other.metricCompartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.metricCompartmentId == null
                                ? 43
                                : this.metricCompartmentId.hashCode());
        return result;
    }
}
