/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Query Properties applicable to JMX type of collection method
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JmxQueryProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "collectionMethod"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JmxQueryProperties extends MetricExtensionQueryProperties {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * JMX Managed Bean Query or Metric Service Table name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedBeanQuery")
        private String managedBeanQuery;

        /**
         * JMX Managed Bean Query or Metric Service Table name
         * @param managedBeanQuery the value to set
         * @return this builder
         **/
        public Builder managedBeanQuery(String managedBeanQuery) {
            this.managedBeanQuery = managedBeanQuery;
            this.__explicitlySet__.add("managedBeanQuery");
            return this;
        }
        /**
         * List of JMX attributes or Metric Service Table columns separated by semi-colon
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jmxAttributes")
        private String jmxAttributes;

        /**
         * List of JMX attributes or Metric Service Table columns separated by semi-colon
         * @param jmxAttributes the value to set
         * @return this builder
         **/
        public Builder jmxAttributes(String jmxAttributes) {
            this.jmxAttributes = jmxAttributes;
            this.__explicitlySet__.add("jmxAttributes");
            return this;
        }
        /**
         * Semi-colon separated list of key properties from Managed Bean ObjectName to be used as key metrics
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identityMetric")
        private String identityMetric;

        /**
         * Semi-colon separated list of key properties from Managed Bean ObjectName to be used as key metrics
         * @param identityMetric the value to set
         * @return this builder
         **/
        public Builder identityMetric(String identityMetric) {
            this.identityMetric = identityMetric;
            this.__explicitlySet__.add("identityMetric");
            return this;
        }
        /**
         * Prefix for an auto generated metric, in case multiple rows with non unique key values are returned
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoRowPrefix")
        private String autoRowPrefix;

        /**
         * Prefix for an auto generated metric, in case multiple rows with non unique key values are returned
         * @param autoRowPrefix the value to set
         * @return this builder
         **/
        public Builder autoRowPrefix(String autoRowPrefix) {
            this.autoRowPrefix = autoRowPrefix;
            this.__explicitlySet__.add("autoRowPrefix");
            return this;
        }
        /**
         * Indicates if Metric Service is enabled on server domain
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMetricServiceEnabled")
        private Boolean isMetricServiceEnabled;

        /**
         * Indicates if Metric Service is enabled on server domain
         * @param isMetricServiceEnabled the value to set
         * @return this builder
         **/
        public Builder isMetricServiceEnabled(Boolean isMetricServiceEnabled) {
            this.isMetricServiceEnabled = isMetricServiceEnabled;
            this.__explicitlySet__.add("isMetricServiceEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JmxQueryProperties build() {
            JmxQueryProperties model =
                    new JmxQueryProperties(
                            this.managedBeanQuery,
                            this.jmxAttributes,
                            this.identityMetric,
                            this.autoRowPrefix,
                            this.isMetricServiceEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JmxQueryProperties model) {
            if (model.wasPropertyExplicitlySet("managedBeanQuery")) {
                this.managedBeanQuery(model.getManagedBeanQuery());
            }
            if (model.wasPropertyExplicitlySet("jmxAttributes")) {
                this.jmxAttributes(model.getJmxAttributes());
            }
            if (model.wasPropertyExplicitlySet("identityMetric")) {
                this.identityMetric(model.getIdentityMetric());
            }
            if (model.wasPropertyExplicitlySet("autoRowPrefix")) {
                this.autoRowPrefix(model.getAutoRowPrefix());
            }
            if (model.wasPropertyExplicitlySet("isMetricServiceEnabled")) {
                this.isMetricServiceEnabled(model.getIsMetricServiceEnabled());
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
    public JmxQueryProperties(
            String managedBeanQuery,
            String jmxAttributes,
            String identityMetric,
            String autoRowPrefix,
            Boolean isMetricServiceEnabled) {
        super();
        this.managedBeanQuery = managedBeanQuery;
        this.jmxAttributes = jmxAttributes;
        this.identityMetric = identityMetric;
        this.autoRowPrefix = autoRowPrefix;
        this.isMetricServiceEnabled = isMetricServiceEnabled;
    }

    /**
     * JMX Managed Bean Query or Metric Service Table name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedBeanQuery")
    private final String managedBeanQuery;

    /**
     * JMX Managed Bean Query or Metric Service Table name
     * @return the value
     **/
    public String getManagedBeanQuery() {
        return managedBeanQuery;
    }

    /**
     * List of JMX attributes or Metric Service Table columns separated by semi-colon
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jmxAttributes")
    private final String jmxAttributes;

    /**
     * List of JMX attributes or Metric Service Table columns separated by semi-colon
     * @return the value
     **/
    public String getJmxAttributes() {
        return jmxAttributes;
    }

    /**
     * Semi-colon separated list of key properties from Managed Bean ObjectName to be used as key metrics
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identityMetric")
    private final String identityMetric;

    /**
     * Semi-colon separated list of key properties from Managed Bean ObjectName to be used as key metrics
     * @return the value
     **/
    public String getIdentityMetric() {
        return identityMetric;
    }

    /**
     * Prefix for an auto generated metric, in case multiple rows with non unique key values are returned
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoRowPrefix")
    private final String autoRowPrefix;

    /**
     * Prefix for an auto generated metric, in case multiple rows with non unique key values are returned
     * @return the value
     **/
    public String getAutoRowPrefix() {
        return autoRowPrefix;
    }

    /**
     * Indicates if Metric Service is enabled on server domain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricServiceEnabled")
    private final Boolean isMetricServiceEnabled;

    /**
     * Indicates if Metric Service is enabled on server domain
     * @return the value
     **/
    public Boolean getIsMetricServiceEnabled() {
        return isMetricServiceEnabled;
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
        sb.append("JmxQueryProperties(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", managedBeanQuery=").append(String.valueOf(this.managedBeanQuery));
        sb.append(", jmxAttributes=").append(String.valueOf(this.jmxAttributes));
        sb.append(", identityMetric=").append(String.valueOf(this.identityMetric));
        sb.append(", autoRowPrefix=").append(String.valueOf(this.autoRowPrefix));
        sb.append(", isMetricServiceEnabled=").append(String.valueOf(this.isMetricServiceEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JmxQueryProperties)) {
            return false;
        }

        JmxQueryProperties other = (JmxQueryProperties) o;
        return java.util.Objects.equals(this.managedBeanQuery, other.managedBeanQuery)
                && java.util.Objects.equals(this.jmxAttributes, other.jmxAttributes)
                && java.util.Objects.equals(this.identityMetric, other.identityMetric)
                && java.util.Objects.equals(this.autoRowPrefix, other.autoRowPrefix)
                && java.util.Objects.equals(
                        this.isMetricServiceEnabled, other.isMetricServiceEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedBeanQuery == null ? 43 : this.managedBeanQuery.hashCode());
        result =
                (result * PRIME)
                        + (this.jmxAttributes == null ? 43 : this.jmxAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.identityMetric == null ? 43 : this.identityMetric.hashCode());
        result =
                (result * PRIME)
                        + (this.autoRowPrefix == null ? 43 : this.autoRowPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.isMetricServiceEnabled == null
                                ? 43
                                : this.isMetricServiceEnabled.hashCode());
        return result;
    }
}
