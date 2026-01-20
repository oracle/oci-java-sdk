/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * A Prometheus emitter data source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreatePrometheusEmitterDataSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePrometheusEmitterDataSourceDetails extends CreateDataSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The url through which the Prometheus Exporter publishes its metrics. (http only) */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The url through which the Prometheus Exporter publishes its metrics. (http only)
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** The OCI monitoring namespace to which scraped metrics should be uploaded. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The OCI monitoring namespace to which scraped metrics should be uploaded.
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
         * Comma separated metric name list. The complete set of desired scraped metrics. Use this
         * property to limit the set of metrics uploaded if required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowMetrics")
        private String allowMetrics;

        /**
         * Comma separated metric name list. The complete set of desired scraped metrics. Use this
         * property to limit the set of metrics uploaded if required.
         *
         * @param allowMetrics the value to set
         * @return this builder
         */
        public Builder allowMetrics(String allowMetrics) {
            this.allowMetrics = allowMetrics;
            this.__explicitlySet__.add("allowMetrics");
            return this;
        }
        /**
         * The url of the network proxy that provides access to the Prometheus Exporter's endpoint
         * (url required property).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("proxyUrl")
        private String proxyUrl;

        /**
         * The url of the network proxy that provides access to the Prometheus Exporter's endpoint
         * (url required property).
         *
         * @param proxyUrl the value to set
         * @return this builder
         */
        public Builder proxyUrl(String proxyUrl) {
            this.proxyUrl = proxyUrl;
            this.__explicitlySet__.add("proxyUrl");
            return this;
        }
        /**
         * Number in milliseconds. The timeout for connecting to the Prometheus Exporter's endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionTimeout")
        private Integer connectionTimeout;

        /**
         * Number in milliseconds. The timeout for connecting to the Prometheus Exporter's endpoint.
         *
         * @param connectionTimeout the value to set
         * @return this builder
         */
        public Builder connectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            this.__explicitlySet__.add("connectionTimeout");
            return this;
        }
        /**
         * Number in milliseconds. The timeout for reading the response from the Prometheus
         * Exporter's endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("readTimeout")
        private Integer readTimeout;

        /**
         * Number in milliseconds. The timeout for reading the response from the Prometheus
         * Exporter's endpoint.
         *
         * @param readTimeout the value to set
         * @return this builder
         */
        public Builder readTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            this.__explicitlySet__.add("readTimeout");
            return this;
        }
        /**
         * Number in kilobytes. The limit on the data being sent, not to exceed the agent's fixed
         * limit of 400 (KB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("readDataLimitInKilobytes")
        private Integer readDataLimitInKilobytes;

        /**
         * Number in kilobytes. The limit on the data being sent, not to exceed the agent's fixed
         * limit of 400 (KB).
         *
         * @param readDataLimitInKilobytes the value to set
         * @return this builder
         */
        public Builder readDataLimitInKilobytes(Integer readDataLimitInKilobytes) {
            this.readDataLimitInKilobytes = readDataLimitInKilobytes;
            this.__explicitlySet__.add("readDataLimitInKilobytes");
            return this;
        }
        /** Number in minutes. The scraping occurs at the specified interval. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleMins")
        private Integer scheduleMins;

        /**
         * Number in minutes. The scraping occurs at the specified interval.
         *
         * @param scheduleMins the value to set
         * @return this builder
         */
        public Builder scheduleMins(Integer scheduleMins) {
            this.scheduleMins = scheduleMins;
            this.__explicitlySet__.add("scheduleMins");
            return this;
        }
        /** OCI monitoring resource group to assign the metric to. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * OCI monitoring resource group to assign the metric to.
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
         * The names of other user-supplied properties expressed as fixed values to be used as
         * dimensions for every uploaded datapoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metricDimensions")
        private java.util.List<MetricDimension> metricDimensions;

        /**
         * The names of other user-supplied properties expressed as fixed values to be used as
         * dimensions for every uploaded datapoint.
         *
         * @param metricDimensions the value to set
         * @return this builder
         */
        public Builder metricDimensions(java.util.List<MetricDimension> metricDimensions) {
            this.metricDimensions = metricDimensions;
            this.__explicitlySet__.add("metricDimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePrometheusEmitterDataSourceDetails build() {
            CreatePrometheusEmitterDataSourceDetails model =
                    new CreatePrometheusEmitterDataSourceDetails(
                            this.name,
                            this.compartmentId,
                            this.url,
                            this.namespace,
                            this.allowMetrics,
                            this.proxyUrl,
                            this.connectionTimeout,
                            this.readTimeout,
                            this.readDataLimitInKilobytes,
                            this.scheduleMins,
                            this.resourceGroup,
                            this.metricDimensions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePrometheusEmitterDataSourceDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("allowMetrics")) {
                this.allowMetrics(model.getAllowMetrics());
            }
            if (model.wasPropertyExplicitlySet("proxyUrl")) {
                this.proxyUrl(model.getProxyUrl());
            }
            if (model.wasPropertyExplicitlySet("connectionTimeout")) {
                this.connectionTimeout(model.getConnectionTimeout());
            }
            if (model.wasPropertyExplicitlySet("readTimeout")) {
                this.readTimeout(model.getReadTimeout());
            }
            if (model.wasPropertyExplicitlySet("readDataLimitInKilobytes")) {
                this.readDataLimitInKilobytes(model.getReadDataLimitInKilobytes());
            }
            if (model.wasPropertyExplicitlySet("scheduleMins")) {
                this.scheduleMins(model.getScheduleMins());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("metricDimensions")) {
                this.metricDimensions(model.getMetricDimensions());
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
    public CreatePrometheusEmitterDataSourceDetails(
            String name,
            String compartmentId,
            String url,
            String namespace,
            String allowMetrics,
            String proxyUrl,
            Integer connectionTimeout,
            Integer readTimeout,
            Integer readDataLimitInKilobytes,
            Integer scheduleMins,
            String resourceGroup,
            java.util.List<MetricDimension> metricDimensions) {
        super(name, compartmentId);
        this.url = url;
        this.namespace = namespace;
        this.allowMetrics = allowMetrics;
        this.proxyUrl = proxyUrl;
        this.connectionTimeout = connectionTimeout;
        this.readTimeout = readTimeout;
        this.readDataLimitInKilobytes = readDataLimitInKilobytes;
        this.scheduleMins = scheduleMins;
        this.resourceGroup = resourceGroup;
        this.metricDimensions = metricDimensions;
    }

    /** The url through which the Prometheus Exporter publishes its metrics. (http only) */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The url through which the Prometheus Exporter publishes its metrics. (http only)
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** The OCI monitoring namespace to which scraped metrics should be uploaded. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The OCI monitoring namespace to which scraped metrics should be uploaded.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Comma separated metric name list. The complete set of desired scraped metrics. Use this
     * property to limit the set of metrics uploaded if required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowMetrics")
    private final String allowMetrics;

    /**
     * Comma separated metric name list. The complete set of desired scraped metrics. Use this
     * property to limit the set of metrics uploaded if required.
     *
     * @return the value
     */
    public String getAllowMetrics() {
        return allowMetrics;
    }

    /**
     * The url of the network proxy that provides access to the Prometheus Exporter's endpoint (url
     * required property).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("proxyUrl")
    private final String proxyUrl;

    /**
     * The url of the network proxy that provides access to the Prometheus Exporter's endpoint (url
     * required property).
     *
     * @return the value
     */
    public String getProxyUrl() {
        return proxyUrl;
    }

    /** Number in milliseconds. The timeout for connecting to the Prometheus Exporter's endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionTimeout")
    private final Integer connectionTimeout;

    /**
     * Number in milliseconds. The timeout for connecting to the Prometheus Exporter's endpoint.
     *
     * @return the value
     */
    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Number in milliseconds. The timeout for reading the response from the Prometheus Exporter's
     * endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readTimeout")
    private final Integer readTimeout;

    /**
     * Number in milliseconds. The timeout for reading the response from the Prometheus Exporter's
     * endpoint.
     *
     * @return the value
     */
    public Integer getReadTimeout() {
        return readTimeout;
    }

    /**
     * Number in kilobytes. The limit on the data being sent, not to exceed the agent's fixed limit
     * of 400 (KB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readDataLimitInKilobytes")
    private final Integer readDataLimitInKilobytes;

    /**
     * Number in kilobytes. The limit on the data being sent, not to exceed the agent's fixed limit
     * of 400 (KB).
     *
     * @return the value
     */
    public Integer getReadDataLimitInKilobytes() {
        return readDataLimitInKilobytes;
    }

    /** Number in minutes. The scraping occurs at the specified interval. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleMins")
    private final Integer scheduleMins;

    /**
     * Number in minutes. The scraping occurs at the specified interval.
     *
     * @return the value
     */
    public Integer getScheduleMins() {
        return scheduleMins;
    }

    /** OCI monitoring resource group to assign the metric to. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * OCI monitoring resource group to assign the metric to.
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * The names of other user-supplied properties expressed as fixed values to be used as
     * dimensions for every uploaded datapoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricDimensions")
    private final java.util.List<MetricDimension> metricDimensions;

    /**
     * The names of other user-supplied properties expressed as fixed values to be used as
     * dimensions for every uploaded datapoint.
     *
     * @return the value
     */
    public java.util.List<MetricDimension> getMetricDimensions() {
        return metricDimensions;
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
        sb.append("CreatePrometheusEmitterDataSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", allowMetrics=").append(String.valueOf(this.allowMetrics));
        sb.append(", proxyUrl=").append(String.valueOf(this.proxyUrl));
        sb.append(", connectionTimeout=").append(String.valueOf(this.connectionTimeout));
        sb.append(", readTimeout=").append(String.valueOf(this.readTimeout));
        sb.append(", readDataLimitInKilobytes=")
                .append(String.valueOf(this.readDataLimitInKilobytes));
        sb.append(", scheduleMins=").append(String.valueOf(this.scheduleMins));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", metricDimensions=").append(String.valueOf(this.metricDimensions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePrometheusEmitterDataSourceDetails)) {
            return false;
        }

        CreatePrometheusEmitterDataSourceDetails other =
                (CreatePrometheusEmitterDataSourceDetails) o;
        return java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.allowMetrics, other.allowMetrics)
                && java.util.Objects.equals(this.proxyUrl, other.proxyUrl)
                && java.util.Objects.equals(this.connectionTimeout, other.connectionTimeout)
                && java.util.Objects.equals(this.readTimeout, other.readTimeout)
                && java.util.Objects.equals(
                        this.readDataLimitInKilobytes, other.readDataLimitInKilobytes)
                && java.util.Objects.equals(this.scheduleMins, other.scheduleMins)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.metricDimensions, other.metricDimensions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.allowMetrics == null ? 43 : this.allowMetrics.hashCode());
        result = (result * PRIME) + (this.proxyUrl == null ? 43 : this.proxyUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionTimeout == null ? 43 : this.connectionTimeout.hashCode());
        result = (result * PRIME) + (this.readTimeout == null ? 43 : this.readTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.readDataLimitInKilobytes == null
                                ? 43
                                : this.readDataLimitInKilobytes.hashCode());
        result = (result * PRIME) + (this.scheduleMins == null ? 43 : this.scheduleMins.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.metricDimensions == null ? 43 : this.metricDimensions.hashCode());
        return result;
    }
}
