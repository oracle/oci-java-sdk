/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Specific metric mapping configurations for Agent Extension Handlers. <br>
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
        builder = AgentExtensionHandlerMetricMappingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AgentExtensionHandlerMetricMappingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "collectorMetricName",
        "telemetryMetricName",
        "isSkipUpload",
        "metricUploadIntervalInSeconds"
    })
    public AgentExtensionHandlerMetricMappingDetails(
            String collectorMetricName,
            String telemetryMetricName,
            Boolean isSkipUpload,
            Integer metricUploadIntervalInSeconds) {
        super();
        this.collectorMetricName = collectorMetricName;
        this.telemetryMetricName = telemetryMetricName;
        this.isSkipUpload = isSkipUpload;
        this.metricUploadIntervalInSeconds = metricUploadIntervalInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Metric name as defined by the collector. */
        @com.fasterxml.jackson.annotation.JsonProperty("collectorMetricName")
        private String collectorMetricName;

        /**
         * Metric name as defined by the collector.
         *
         * @param collectorMetricName the value to set
         * @return this builder
         */
        public Builder collectorMetricName(String collectorMetricName) {
            this.collectorMetricName = collectorMetricName;
            this.__explicitlySet__.add("collectorMetricName");
            return this;
        }
        /** Metric name to be upload to telemetry. */
        @com.fasterxml.jackson.annotation.JsonProperty("telemetryMetricName")
        private String telemetryMetricName;

        /**
         * Metric name to be upload to telemetry.
         *
         * @param telemetryMetricName the value to set
         * @return this builder
         */
        public Builder telemetryMetricName(String telemetryMetricName) {
            this.telemetryMetricName = telemetryMetricName;
            this.__explicitlySet__.add("telemetryMetricName");
            return this;
        }
        /** Is ignoring this metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSkipUpload")
        private Boolean isSkipUpload;

        /**
         * Is ignoring this metric.
         *
         * @param isSkipUpload the value to set
         * @return this builder
         */
        public Builder isSkipUpload(Boolean isSkipUpload) {
            this.isSkipUpload = isSkipUpload;
            this.__explicitlySet__.add("isSkipUpload");
            return this;
        }
        /**
         * Metric upload interval in seconds. Any metric sent by telegraf/collectd before the
         * configured interval expires will be dropped.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metricUploadIntervalInSeconds")
        private Integer metricUploadIntervalInSeconds;

        /**
         * Metric upload interval in seconds. Any metric sent by telegraf/collectd before the
         * configured interval expires will be dropped.
         *
         * @param metricUploadIntervalInSeconds the value to set
         * @return this builder
         */
        public Builder metricUploadIntervalInSeconds(Integer metricUploadIntervalInSeconds) {
            this.metricUploadIntervalInSeconds = metricUploadIntervalInSeconds;
            this.__explicitlySet__.add("metricUploadIntervalInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AgentExtensionHandlerMetricMappingDetails build() {
            AgentExtensionHandlerMetricMappingDetails model =
                    new AgentExtensionHandlerMetricMappingDetails(
                            this.collectorMetricName,
                            this.telemetryMetricName,
                            this.isSkipUpload,
                            this.metricUploadIntervalInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentExtensionHandlerMetricMappingDetails model) {
            if (model.wasPropertyExplicitlySet("collectorMetricName")) {
                this.collectorMetricName(model.getCollectorMetricName());
            }
            if (model.wasPropertyExplicitlySet("telemetryMetricName")) {
                this.telemetryMetricName(model.getTelemetryMetricName());
            }
            if (model.wasPropertyExplicitlySet("isSkipUpload")) {
                this.isSkipUpload(model.getIsSkipUpload());
            }
            if (model.wasPropertyExplicitlySet("metricUploadIntervalInSeconds")) {
                this.metricUploadIntervalInSeconds(model.getMetricUploadIntervalInSeconds());
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

    /** Metric name as defined by the collector. */
    @com.fasterxml.jackson.annotation.JsonProperty("collectorMetricName")
    private final String collectorMetricName;

    /**
     * Metric name as defined by the collector.
     *
     * @return the value
     */
    public String getCollectorMetricName() {
        return collectorMetricName;
    }

    /** Metric name to be upload to telemetry. */
    @com.fasterxml.jackson.annotation.JsonProperty("telemetryMetricName")
    private final String telemetryMetricName;

    /**
     * Metric name to be upload to telemetry.
     *
     * @return the value
     */
    public String getTelemetryMetricName() {
        return telemetryMetricName;
    }

    /** Is ignoring this metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipUpload")
    private final Boolean isSkipUpload;

    /**
     * Is ignoring this metric.
     *
     * @return the value
     */
    public Boolean getIsSkipUpload() {
        return isSkipUpload;
    }

    /**
     * Metric upload interval in seconds. Any metric sent by telegraf/collectd before the configured
     * interval expires will be dropped.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricUploadIntervalInSeconds")
    private final Integer metricUploadIntervalInSeconds;

    /**
     * Metric upload interval in seconds. Any metric sent by telegraf/collectd before the configured
     * interval expires will be dropped.
     *
     * @return the value
     */
    public Integer getMetricUploadIntervalInSeconds() {
        return metricUploadIntervalInSeconds;
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
        sb.append("AgentExtensionHandlerMetricMappingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("collectorMetricName=").append(String.valueOf(this.collectorMetricName));
        sb.append(", telemetryMetricName=").append(String.valueOf(this.telemetryMetricName));
        sb.append(", isSkipUpload=").append(String.valueOf(this.isSkipUpload));
        sb.append(", metricUploadIntervalInSeconds=")
                .append(String.valueOf(this.metricUploadIntervalInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentExtensionHandlerMetricMappingDetails)) {
            return false;
        }

        AgentExtensionHandlerMetricMappingDetails other =
                (AgentExtensionHandlerMetricMappingDetails) o;
        return java.util.Objects.equals(this.collectorMetricName, other.collectorMetricName)
                && java.util.Objects.equals(this.telemetryMetricName, other.telemetryMetricName)
                && java.util.Objects.equals(this.isSkipUpload, other.isSkipUpload)
                && java.util.Objects.equals(
                        this.metricUploadIntervalInSeconds, other.metricUploadIntervalInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.collectorMetricName == null
                                ? 43
                                : this.collectorMetricName.hashCode());
        result =
                (result * PRIME)
                        + (this.telemetryMetricName == null
                                ? 43
                                : this.telemetryMetricName.hashCode());
        result = (result * PRIME) + (this.isSkipUpload == null ? 43 : this.isSkipUpload.hashCode());
        result =
                (result * PRIME)
                        + (this.metricUploadIntervalInSeconds == null
                                ? 43
                                : this.metricUploadIntervalInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
