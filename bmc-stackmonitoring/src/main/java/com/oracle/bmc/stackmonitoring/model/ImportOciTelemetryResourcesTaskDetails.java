/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
         * Flag to indicate whether status is calculated using metrics or LifeCycleState attribute
         * of the resource in OCI service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldUseMetricsFlowForStatus")
        private Boolean shouldUseMetricsFlowForStatus;

        /**
         * Flag to indicate whether status is calculated using metrics or LifeCycleState attribute
         * of the resource in OCI service.
         *
         * @param shouldUseMetricsFlowForStatus the value to set
         * @return this builder
         */
        public Builder shouldUseMetricsFlowForStatus(Boolean shouldUseMetricsFlowForStatus) {
            this.shouldUseMetricsFlowForStatus = shouldUseMetricsFlowForStatus;
            this.__explicitlySet__.add("shouldUseMetricsFlowForStatus");
            return this;
        }
        /**
         * The base URL of the OCI service to which the resource belongs to. Also this property is
         * applicable only when source is OCI_TELEMETRY_NATIVE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceBaseUrl")
        private String serviceBaseUrl;

        /**
         * The base URL of the OCI service to which the resource belongs to. Also this property is
         * applicable only when source is OCI_TELEMETRY_NATIVE.
         *
         * @param serviceBaseUrl the value to set
         * @return this builder
         */
        public Builder serviceBaseUrl(String serviceBaseUrl) {
            this.serviceBaseUrl = serviceBaseUrl;
            this.__explicitlySet__.add("serviceBaseUrl");
            return this;
        }
        /**
         * The console path prefix to use for providing service home url page navigation. For
         * example if the prefix provided is 'security/bastion/bastions', the URL used for
         * navigation will be https://<cloudhostname>/security/bastion/bastions/<resourceOcid>. If
         * not provided, service home page link will not be shown in the stack monitoring home page.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("consolePathPrefix")
        private String consolePathPrefix;

        /**
         * The console path prefix to use for providing service home url page navigation. For
         * example if the prefix provided is 'security/bastion/bastions', the URL used for
         * navigation will be https://<cloudhostname>/security/bastion/bastions/<resourceOcid>. If
         * not provided, service home page link will not be shown in the stack monitoring home page.
         *
         * @param consolePathPrefix the value to set
         * @return this builder
         */
        public Builder consolePathPrefix(String consolePathPrefix) {
            this.consolePathPrefix = consolePathPrefix;
            this.__explicitlySet__.add("consolePathPrefix");
            return this;
        }
        /**
         * Lifecycle states of the external resource which reflects the status of the resource being
         * up.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStatusMappingsForUpStatus")
        private java.util.List<String> lifecycleStatusMappingsForUpStatus;

        /**
         * Lifecycle states of the external resource which reflects the status of the resource being
         * up.
         *
         * @param lifecycleStatusMappingsForUpStatus the value to set
         * @return this builder
         */
        public Builder lifecycleStatusMappingsForUpStatus(
                java.util.List<String> lifecycleStatusMappingsForUpStatus) {
            this.lifecycleStatusMappingsForUpStatus = lifecycleStatusMappingsForUpStatus;
            this.__explicitlySet__.add("lifecycleStatusMappingsForUpStatus");
            return this;
        }
        /**
         * The resource name property in the metric dimensions. Resources imported will be using
         * this property value for resource name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceNameMapping")
        private String resourceNameMapping;

        /**
         * The resource name property in the metric dimensions. Resources imported will be using
         * this property value for resource name.
         *
         * @param resourceNameMapping the value to set
         * @return this builder
         */
        public Builder resourceNameMapping(String resourceNameMapping) {
            this.resourceNameMapping = resourceNameMapping;
            this.__explicitlySet__.add("resourceNameMapping");
            return this;
        }
        /**
         * The external resource identifier property in the metric dimensions. Resources imported
         * will be using this property value for external id.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalIdMapping")
        private String externalIdMapping;

        /**
         * The external resource identifier property in the metric dimensions. Resources imported
         * will be using this property value for external id.
         *
         * @param externalIdMapping the value to set
         * @return this builder
         */
        public Builder externalIdMapping(String externalIdMapping) {
            this.externalIdMapping = externalIdMapping;
            this.__explicitlySet__.add("externalIdMapping");
            return this;
        }
        /**
         * The resource type property in the metric dimensions. Resources imported will be using
         * this property value for resource type. If not specified, namespace will be used for
         * resource type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeMapping")
        private String resourceTypeMapping;

        /**
         * The resource type property in the metric dimensions. Resources imported will be using
         * this property value for resource type. If not specified, namespace will be used for
         * resource type.
         *
         * @param resourceTypeMapping the value to set
         * @return this builder
         */
        public Builder resourceTypeMapping(String resourceTypeMapping) {
            this.resourceTypeMapping = resourceTypeMapping;
            this.__explicitlySet__.add("resourceTypeMapping");
            return this;
        }
        /**
         * The resource name filter. Resources matching with the resource name filter will be
         * imported. Regular expressions will be accepted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceNameFilter")
        private String resourceNameFilter;

        /**
         * The resource name filter. Resources matching with the resource name filter will be
         * imported. Regular expressions will be accepted.
         *
         * @param resourceNameFilter the value to set
         * @return this builder
         */
        public Builder resourceNameFilter(String resourceNameFilter) {
            this.resourceNameFilter = resourceNameFilter;
            this.__explicitlySet__.add("resourceNameFilter");
            return this;
        }
        /**
         * The resource type filter. Resources matching with the resource type filter will be
         * imported. Regular expressions will be accepted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeFilter")
        private String resourceTypeFilter;

        /**
         * The resource type filter. Resources matching with the resource type filter will be
         * imported. Regular expressions will be accepted.
         *
         * @param resourceTypeFilter the value to set
         * @return this builder
         */
        public Builder resourceTypeFilter(String resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            this.__explicitlySet__.add("resourceTypeFilter");
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
                            this.shouldUseMetricsFlowForStatus,
                            this.serviceBaseUrl,
                            this.consolePathPrefix,
                            this.lifecycleStatusMappingsForUpStatus,
                            this.resourceNameMapping,
                            this.externalIdMapping,
                            this.resourceTypeMapping,
                            this.resourceNameFilter,
                            this.resourceTypeFilter,
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
            if (model.wasPropertyExplicitlySet("shouldUseMetricsFlowForStatus")) {
                this.shouldUseMetricsFlowForStatus(model.getShouldUseMetricsFlowForStatus());
            }
            if (model.wasPropertyExplicitlySet("serviceBaseUrl")) {
                this.serviceBaseUrl(model.getServiceBaseUrl());
            }
            if (model.wasPropertyExplicitlySet("consolePathPrefix")) {
                this.consolePathPrefix(model.getConsolePathPrefix());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStatusMappingsForUpStatus")) {
                this.lifecycleStatusMappingsForUpStatus(
                        model.getLifecycleStatusMappingsForUpStatus());
            }
            if (model.wasPropertyExplicitlySet("resourceNameMapping")) {
                this.resourceNameMapping(model.getResourceNameMapping());
            }
            if (model.wasPropertyExplicitlySet("externalIdMapping")) {
                this.externalIdMapping(model.getExternalIdMapping());
            }
            if (model.wasPropertyExplicitlySet("resourceTypeMapping")) {
                this.resourceTypeMapping(model.getResourceTypeMapping());
            }
            if (model.wasPropertyExplicitlySet("resourceNameFilter")) {
                this.resourceNameFilter(model.getResourceNameFilter());
            }
            if (model.wasPropertyExplicitlySet("resourceTypeFilter")) {
                this.resourceTypeFilter(model.getResourceTypeFilter());
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
            Boolean shouldUseMetricsFlowForStatus,
            String serviceBaseUrl,
            String consolePathPrefix,
            java.util.List<String> lifecycleStatusMappingsForUpStatus,
            String resourceNameMapping,
            String externalIdMapping,
            String resourceTypeMapping,
            String resourceNameFilter,
            String resourceTypeFilter,
            java.util.List<String> availabilityProxyMetrics,
            Integer availabilityProxyMetricCollectionInterval) {
        super();
        this.source = source;
        this.namespace = namespace;
        this.resourceGroup = resourceGroup;
        this.shouldUseMetricsFlowForStatus = shouldUseMetricsFlowForStatus;
        this.serviceBaseUrl = serviceBaseUrl;
        this.consolePathPrefix = consolePathPrefix;
        this.lifecycleStatusMappingsForUpStatus = lifecycleStatusMappingsForUpStatus;
        this.resourceNameMapping = resourceNameMapping;
        this.externalIdMapping = externalIdMapping;
        this.resourceTypeMapping = resourceTypeMapping;
        this.resourceNameFilter = resourceNameFilter;
        this.resourceTypeFilter = resourceTypeFilter;
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
     * Flag to indicate whether status is calculated using metrics or LifeCycleState attribute of
     * the resource in OCI service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseMetricsFlowForStatus")
    private final Boolean shouldUseMetricsFlowForStatus;

    /**
     * Flag to indicate whether status is calculated using metrics or LifeCycleState attribute of
     * the resource in OCI service.
     *
     * @return the value
     */
    public Boolean getShouldUseMetricsFlowForStatus() {
        return shouldUseMetricsFlowForStatus;
    }

    /**
     * The base URL of the OCI service to which the resource belongs to. Also this property is
     * applicable only when source is OCI_TELEMETRY_NATIVE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceBaseUrl")
    private final String serviceBaseUrl;

    /**
     * The base URL of the OCI service to which the resource belongs to. Also this property is
     * applicable only when source is OCI_TELEMETRY_NATIVE.
     *
     * @return the value
     */
    public String getServiceBaseUrl() {
        return serviceBaseUrl;
    }

    /**
     * The console path prefix to use for providing service home url page navigation. For example if
     * the prefix provided is 'security/bastion/bastions', the URL used for navigation will be
     * https://<cloudhostname>/security/bastion/bastions/<resourceOcid>. If not provided, service
     * home page link will not be shown in the stack monitoring home page.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consolePathPrefix")
    private final String consolePathPrefix;

    /**
     * The console path prefix to use for providing service home url page navigation. For example if
     * the prefix provided is 'security/bastion/bastions', the URL used for navigation will be
     * https://<cloudhostname>/security/bastion/bastions/<resourceOcid>. If not provided, service
     * home page link will not be shown in the stack monitoring home page.
     *
     * @return the value
     */
    public String getConsolePathPrefix() {
        return consolePathPrefix;
    }

    /**
     * Lifecycle states of the external resource which reflects the status of the resource being up.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStatusMappingsForUpStatus")
    private final java.util.List<String> lifecycleStatusMappingsForUpStatus;

    /**
     * Lifecycle states of the external resource which reflects the status of the resource being up.
     *
     * @return the value
     */
    public java.util.List<String> getLifecycleStatusMappingsForUpStatus() {
        return lifecycleStatusMappingsForUpStatus;
    }

    /**
     * The resource name property in the metric dimensions. Resources imported will be using this
     * property value for resource name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceNameMapping")
    private final String resourceNameMapping;

    /**
     * The resource name property in the metric dimensions. Resources imported will be using this
     * property value for resource name.
     *
     * @return the value
     */
    public String getResourceNameMapping() {
        return resourceNameMapping;
    }

    /**
     * The external resource identifier property in the metric dimensions. Resources imported will
     * be using this property value for external id.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalIdMapping")
    private final String externalIdMapping;

    /**
     * The external resource identifier property in the metric dimensions. Resources imported will
     * be using this property value for external id.
     *
     * @return the value
     */
    public String getExternalIdMapping() {
        return externalIdMapping;
    }

    /**
     * The resource type property in the metric dimensions. Resources imported will be using this
     * property value for resource type. If not specified, namespace will be used for resource type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeMapping")
    private final String resourceTypeMapping;

    /**
     * The resource type property in the metric dimensions. Resources imported will be using this
     * property value for resource type. If not specified, namespace will be used for resource type.
     *
     * @return the value
     */
    public String getResourceTypeMapping() {
        return resourceTypeMapping;
    }

    /**
     * The resource name filter. Resources matching with the resource name filter will be imported.
     * Regular expressions will be accepted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceNameFilter")
    private final String resourceNameFilter;

    /**
     * The resource name filter. Resources matching with the resource name filter will be imported.
     * Regular expressions will be accepted.
     *
     * @return the value
     */
    public String getResourceNameFilter() {
        return resourceNameFilter;
    }

    /**
     * The resource type filter. Resources matching with the resource type filter will be imported.
     * Regular expressions will be accepted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeFilter")
    private final String resourceTypeFilter;

    /**
     * The resource type filter. Resources matching with the resource type filter will be imported.
     * Regular expressions will be accepted.
     *
     * @return the value
     */
    public String getResourceTypeFilter() {
        return resourceTypeFilter;
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
        sb.append(", shouldUseMetricsFlowForStatus=")
                .append(String.valueOf(this.shouldUseMetricsFlowForStatus));
        sb.append(", serviceBaseUrl=").append(String.valueOf(this.serviceBaseUrl));
        sb.append(", consolePathPrefix=").append(String.valueOf(this.consolePathPrefix));
        sb.append(", lifecycleStatusMappingsForUpStatus=")
                .append(String.valueOf(this.lifecycleStatusMappingsForUpStatus));
        sb.append(", resourceNameMapping=").append(String.valueOf(this.resourceNameMapping));
        sb.append(", externalIdMapping=").append(String.valueOf(this.externalIdMapping));
        sb.append(", resourceTypeMapping=").append(String.valueOf(this.resourceTypeMapping));
        sb.append(", resourceNameFilter=").append(String.valueOf(this.resourceNameFilter));
        sb.append(", resourceTypeFilter=").append(String.valueOf(this.resourceTypeFilter));
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
                        this.shouldUseMetricsFlowForStatus, other.shouldUseMetricsFlowForStatus)
                && java.util.Objects.equals(this.serviceBaseUrl, other.serviceBaseUrl)
                && java.util.Objects.equals(this.consolePathPrefix, other.consolePathPrefix)
                && java.util.Objects.equals(
                        this.lifecycleStatusMappingsForUpStatus,
                        other.lifecycleStatusMappingsForUpStatus)
                && java.util.Objects.equals(this.resourceNameMapping, other.resourceNameMapping)
                && java.util.Objects.equals(this.externalIdMapping, other.externalIdMapping)
                && java.util.Objects.equals(this.resourceTypeMapping, other.resourceTypeMapping)
                && java.util.Objects.equals(this.resourceNameFilter, other.resourceNameFilter)
                && java.util.Objects.equals(this.resourceTypeFilter, other.resourceTypeFilter)
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
                        + (this.shouldUseMetricsFlowForStatus == null
                                ? 43
                                : this.shouldUseMetricsFlowForStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceBaseUrl == null ? 43 : this.serviceBaseUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.consolePathPrefix == null ? 43 : this.consolePathPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStatusMappingsForUpStatus == null
                                ? 43
                                : this.lifecycleStatusMappingsForUpStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceNameMapping == null
                                ? 43
                                : this.resourceNameMapping.hashCode());
        result =
                (result * PRIME)
                        + (this.externalIdMapping == null ? 43 : this.externalIdMapping.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeMapping == null
                                ? 43
                                : this.resourceTypeMapping.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceNameFilter == null
                                ? 43
                                : this.resourceNameFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeFilter == null
                                ? 43
                                : this.resourceTypeFilter.hashCode());
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
