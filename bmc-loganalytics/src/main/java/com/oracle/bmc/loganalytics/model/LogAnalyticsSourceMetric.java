/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceMetric <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsSourceMetric.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsSourceMetric
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isMetricSourceEnabled",
        "metricName",
        "sourceName",
        "entityType"
    })
    public LogAnalyticsSourceMetric(
            Boolean isMetricSourceEnabled,
            String metricName,
            String sourceName,
            String entityType) {
        super();
        this.isMetricSourceEnabled = isMetricSourceEnabled;
        this.metricName = metricName;
        this.sourceName = sourceName;
        this.entityType = entityType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A flag specifying whether or not the metric source is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMetricSourceEnabled")
        private Boolean isMetricSourceEnabled;

        /**
         * A flag specifying whether or not the metric source is enabled.
         *
         * @param isMetricSourceEnabled the value to set
         * @return this builder
         */
        public Builder isMetricSourceEnabled(Boolean isMetricSourceEnabled) {
            this.isMetricSourceEnabled = isMetricSourceEnabled;
            this.__explicitlySet__.add("isMetricSourceEnabled");
            return this;
        }
        /** The metric name. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The metric name.
         *
         * @param metricName the value to set
         * @return this builder
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /** The source internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The source internal name.
         *
         * @param sourceName the value to set
         * @return this builder
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /** The entity type. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The entity type.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceMetric build() {
            LogAnalyticsSourceMetric model =
                    new LogAnalyticsSourceMetric(
                            this.isMetricSourceEnabled,
                            this.metricName,
                            this.sourceName,
                            this.entityType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceMetric model) {
            if (model.wasPropertyExplicitlySet("isMetricSourceEnabled")) {
                this.isMetricSourceEnabled(model.getIsMetricSourceEnabled());
            }
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
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

    /** A flag specifying whether or not the metric source is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricSourceEnabled")
    private final Boolean isMetricSourceEnabled;

    /**
     * A flag specifying whether or not the metric source is enabled.
     *
     * @return the value
     */
    public Boolean getIsMetricSourceEnabled() {
        return isMetricSourceEnabled;
    }

    /** The metric name. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * The metric name.
     *
     * @return the value
     */
    public String getMetricName() {
        return metricName;
    }

    /** The source internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The source internal name.
     *
     * @return the value
     */
    public String getSourceName() {
        return sourceName;
    }

    /** The entity type. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The entity type.
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
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
        sb.append("LogAnalyticsSourceMetric(");
        sb.append("super=").append(super.toString());
        sb.append("isMetricSourceEnabled=").append(String.valueOf(this.isMetricSourceEnabled));
        sb.append(", metricName=").append(String.valueOf(this.metricName));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourceMetric)) {
            return false;
        }

        LogAnalyticsSourceMetric other = (LogAnalyticsSourceMetric) o;
        return java.util.Objects.equals(this.isMetricSourceEnabled, other.isMetricSourceEnabled)
                && java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isMetricSourceEnabled == null
                                ? 43
                                : this.isMetricSourceEnabled.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
