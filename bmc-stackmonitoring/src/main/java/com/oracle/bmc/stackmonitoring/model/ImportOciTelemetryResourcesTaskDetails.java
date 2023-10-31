/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Request details for importing resources from Telemetry like resources from OCI Native Services
 * and prometheus. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportOciTelemetryResourcesTaskDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportOciTelemetryResourcesTaskDetails extends MonitoredResourceTaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Source from where the metrics pushed to telemetry. Possible values: *
         * OCI_TELEMETRY_NATIVE - The metrics are pushed to telemetry from OCI Native Services. *
         * OCI_TELEMETRY_PROMETHEUS - The metrics are pushed to telemetry from Prometheus.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private Source source;

        /**
         * Source from where the metrics pushed to telemetry. Possible values: *
         * OCI_TELEMETRY_NATIVE - The metrics are pushed to telemetry from OCI Native Services. *
         * OCI_TELEMETRY_PROMETHEUS - The metrics are pushed to telemetry from Prometheus.
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(Source source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** Name space to be used for OCI Native service resources discovery. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Name space to be used for OCI Native service resources discovery.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The resource group to use while fetching metrics from telemetry. If not specified,
         * resource group will be skipped in the list metrics request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * The resource group to use while fetching metrics from telemetry. If not specified,
         * resource group will be skipped in the list metrics request.
         *
         * @param resourceGroup the value to set
         * @return this builder
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }
        /**
         * List of metrics to be used to calculate the availability of the resource. Resource is
         * considered to be up if at least one of the specified metrics is available for the
         * resource during the specified interval using the property
         * 'availabilityProxyMetricCollectionIntervalInSeconds'. If no metrics are specified,
         * availability will not be calculated for the resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityProxyMetrics")
        private java.util.List<String> availabilityProxyMetrics;

        /**
         * List of metrics to be used to calculate the availability of the resource. Resource is
         * considered to be up if at least one of the specified metrics is available for the
         * resource during the specified interval using the property
         * 'availabilityProxyMetricCollectionIntervalInSeconds'. If no metrics are specified,
         * availability will not be calculated for the resource.
         *
         * @param availabilityProxyMetrics the value to set
         * @return this builder
         */
        public Builder availabilityProxyMetrics(java.util.List<String> availabilityProxyMetrics) {
            this.availabilityProxyMetrics = availabilityProxyMetrics;
            this.__explicitlySet__.add("availabilityProxyMetrics");
            return this;
        }
        /**
         * Metrics collection interval in seconds used when calculating the availability of the
         * resource based on metrics specified using the property 'availabilityProxyMetrics'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityProxyMetricCollectionInterval")
        private Integer availabilityProxyMetricCollectionInterval;

        /**
         * Metrics collection interval in seconds used when calculating the availability of the
         * resource based on metrics specified using the property 'availabilityProxyMetrics'.
         *
         * @param availabilityProxyMetricCollectionInterval the value to set
         * @return this builder
         */
        public Builder availabilityProxyMetricCollectionInterval(
                Integer availabilityProxyMetricCollectionInterval) {
            this.availabilityProxyMetricCollectionInterval =
                    availabilityProxyMetricCollectionInterval;
            this.__explicitlySet__.add("availabilityProxyMetricCollectionInterval");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportOciTelemetryResourcesTaskDetails build() {
            ImportOciTelemetryResourcesTaskDetails model =
                    new ImportOciTelemetryResourcesTaskDetails(
                            this.source,
                            this.namespace,
                            this.resourceGroup,
                            this.availabilityProxyMetrics,
                            this.availabilityProxyMetricCollectionInterval);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportOciTelemetryResourcesTaskDetails model) {
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("availabilityProxyMetrics")) {
                this.availabilityProxyMetrics(model.getAvailabilityProxyMetrics());
            }
            if (model.wasPropertyExplicitlySet("availabilityProxyMetricCollectionInterval")) {
                this.availabilityProxyMetricCollectionInterval(
                        model.getAvailabilityProxyMetricCollectionInterval());
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
    public ImportOciTelemetryResourcesTaskDetails(
            Source source,
            String namespace,
            String resourceGroup,
            java.util.List<String> availabilityProxyMetrics,
            Integer availabilityProxyMetricCollectionInterval) {
        super();
        this.source = source;
        this.namespace = namespace;
        this.resourceGroup = resourceGroup;
        this.availabilityProxyMetrics = availabilityProxyMetrics;
        this.availabilityProxyMetricCollectionInterval = availabilityProxyMetricCollectionInterval;
    }

    /**
     * Source from where the metrics pushed to telemetry. Possible values: * OCI_TELEMETRY_NATIVE -
     * The metrics are pushed to telemetry from OCI Native Services. * OCI_TELEMETRY_PROMETHEUS -
     * The metrics are pushed to telemetry from Prometheus.
     */
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        OciTelemetryNative("OCI_TELEMETRY_NATIVE"),
        OciTelemetryPrometheus("OCI_TELEMETRY_PROMETHEUS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Source.class);

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Source', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Source from where the metrics pushed to telemetry. Possible values: * OCI_TELEMETRY_NATIVE -
     * The metrics are pushed to telemetry from OCI Native Services. * OCI_TELEMETRY_PROMETHEUS -
     * The metrics are pushed to telemetry from Prometheus.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final Source source;

    /**
     * Source from where the metrics pushed to telemetry. Possible values: * OCI_TELEMETRY_NATIVE -
     * The metrics are pushed to telemetry from OCI Native Services. * OCI_TELEMETRY_PROMETHEUS -
     * The metrics are pushed to telemetry from Prometheus.
     *
     * @return the value
     */
    public Source getSource() {
        return source;
    }

    /** Name space to be used for OCI Native service resources discovery. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Name space to be used for OCI Native service resources discovery.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * The resource group to use while fetching metrics from telemetry. If not specified, resource
     * group will be skipped in the list metrics request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * The resource group to use while fetching metrics from telemetry. If not specified, resource
     * group will be skipped in the list metrics request.
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * List of metrics to be used to calculate the availability of the resource. Resource is
     * considered to be up if at least one of the specified metrics is available for the resource
     * during the specified interval using the property
     * 'availabilityProxyMetricCollectionIntervalInSeconds'. If no metrics are specified,
     * availability will not be calculated for the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityProxyMetrics")
    private final java.util.List<String> availabilityProxyMetrics;

    /**
     * List of metrics to be used to calculate the availability of the resource. Resource is
     * considered to be up if at least one of the specified metrics is available for the resource
     * during the specified interval using the property
     * 'availabilityProxyMetricCollectionIntervalInSeconds'. If no metrics are specified,
     * availability will not be calculated for the resource.
     *
     * @return the value
     */
    public java.util.List<String> getAvailabilityProxyMetrics() {
        return availabilityProxyMetrics;
    }

    /**
     * Metrics collection interval in seconds used when calculating the availability of the resource
     * based on metrics specified using the property 'availabilityProxyMetrics'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityProxyMetricCollectionInterval")
    private final Integer availabilityProxyMetricCollectionInterval;

    /**
     * Metrics collection interval in seconds used when calculating the availability of the resource
     * based on metrics specified using the property 'availabilityProxyMetrics'.
     *
     * @return the value
     */
    public Integer getAvailabilityProxyMetricCollectionInterval() {
        return availabilityProxyMetricCollectionInterval;
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
        sb.append("ImportOciTelemetryResourcesTaskDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", availabilityProxyMetrics=")
                .append(String.valueOf(this.availabilityProxyMetrics));
        sb.append(", availabilityProxyMetricCollectionInterval=")
                .append(String.valueOf(this.availabilityProxyMetricCollectionInterval));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportOciTelemetryResourcesTaskDetails)) {
            return false;
        }

        ImportOciTelemetryResourcesTaskDetails other = (ImportOciTelemetryResourcesTaskDetails) o;
        return java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(
                        this.availabilityProxyMetrics, other.availabilityProxyMetrics)
                && java.util.Objects.equals(
                        this.availabilityProxyMetricCollectionInterval,
                        other.availabilityProxyMetricCollectionInterval)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityProxyMetrics == null
                                ? 43
                                : this.availabilityProxyMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityProxyMetricCollectionInterval == null
                                ? 43
                                : this.availabilityProxyMetricCollectionInterval.hashCode());
        return result;
    }
}
