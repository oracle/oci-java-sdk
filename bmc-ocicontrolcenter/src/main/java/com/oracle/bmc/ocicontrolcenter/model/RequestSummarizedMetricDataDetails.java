/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocicontrolcenter.model;

/**
 * The request details for retrieving aggregated data. Use the query and optional properties to
 * filter the returned results. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230515")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestSummarizedMetricDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestSummarizedMetricDataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespaceName",
        "metricName",
        "compartmentId",
        "dimensions",
        "startTime",
        "endTime"
    })
    public RequestSummarizedMetricDataDetails(
            String namespaceName,
            String metricName,
            String compartmentId,
            java.util.Map<String, DimensionValue> dimensions,
            java.util.Date startTime,
            java.util.Date endTime) {
        super();
        this.namespaceName = namespaceName;
        this.metricName = metricName;
        this.compartmentId = compartmentId;
        this.dimensions = dimensions;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The source service or application to use when searching for metric data points to
         * aggregate. For a list of valid namespaces, see {@link
         * #listNamespaces(ListNamespacesRequest) listNamespaces}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * The source service or application to use when searching for metric data points to
         * aggregate. For a list of valid namespaces, see {@link
         * #listNamespaces(ListNamespacesRequest) listNamespaces}.
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /**
         * The name of a metric for retrieving aggregated data. For a list of valid metrics for a
         * given namespace, see {@link #listMetricProperties(ListMetricPropertiesRequest)
         * listMetricProperties}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The name of a metric for retrieving aggregated data. For a list of valid metrics for a
         * given namespace, see {@link #listMetricProperties(ListMetricPropertiesRequest)
         * listMetricProperties}.
         *
         * @param metricName the value to set
         * @return this builder
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /**
         * The OCID of the compartment to use for authorization to read metrics. To use the root
         * compartment, provide the tenancyId.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment to use for authorization to read metrics. To use the root
         * compartment, provide the tenancyId.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Qualifiers to use when searching for metric data. For a list of valid dimensions for a
         * given metric, see {@link #listMetricProperties(ListMetricPropertiesRequest)
         * listMetricProperties}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, DimensionValue> dimensions;

        /**
         * Qualifiers to use when searching for metric data. For a list of valid dimensions for a
         * given metric, see {@link #listMetricProperties(ListMetricPropertiesRequest)
         * listMetricProperties}.
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.Map<String, DimensionValue> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * The beginning of the sampled time range to use when searching for metric data points.
         * Format is defined by <a href="https://www.rfc-editor.org/rfc/rfc3339">RFC3339</a>. The
         * response includes metric data points for the sampled time. Example
         * 2019-02-01T02:02:29.600Z
         */
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private java.util.Date startTime;

        /**
         * The beginning of the sampled time range to use when searching for metric data points.
         * Format is defined by <a href="https://www.rfc-editor.org/rfc/rfc3339">RFC3339</a>. The
         * response includes metric data points for the sampled time. Example
         * 2019-02-01T02:02:29.600Z
         *
         * @param startTime the value to set
         * @return this builder
         */
        public Builder startTime(java.util.Date startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /**
         * The end of the sampled time range to use when searching for metric data points. Format is
         * defined by <a href="https://www.rfc-editor.org/rfc/rfc3339">RFC3339</a>. The response
         * excludes metric data points for sampled time. Example 2019-02-01T02:02:29.600Z
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private java.util.Date endTime;

        /**
         * The end of the sampled time range to use when searching for metric data points. Format is
         * defined by <a href="https://www.rfc-editor.org/rfc/rfc3339">RFC3339</a>. The response
         * excludes metric data points for sampled time. Example 2019-02-01T02:02:29.600Z
         *
         * @param endTime the value to set
         * @return this builder
         */
        public Builder endTime(java.util.Date endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestSummarizedMetricDataDetails build() {
            RequestSummarizedMetricDataDetails model =
                    new RequestSummarizedMetricDataDetails(
                            this.namespaceName,
                            this.metricName,
                            this.compartmentId,
                            this.dimensions,
                            this.startTime,
                            this.endTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestSummarizedMetricDataDetails model) {
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("endTime")) {
                this.endTime(model.getEndTime());
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

    /**
     * The source service or application to use when searching for metric data points to aggregate.
     * For a list of valid namespaces, see {@link #listNamespaces(ListNamespacesRequest)
     * listNamespaces}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * The source service or application to use when searching for metric data points to aggregate.
     * For a list of valid namespaces, see {@link #listNamespaces(ListNamespacesRequest)
     * listNamespaces}.
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * The name of a metric for retrieving aggregated data. For a list of valid metrics for a given
     * namespace, see {@link #listMetricProperties(ListMetricPropertiesRequest)
     * listMetricProperties}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * The name of a metric for retrieving aggregated data. For a list of valid metrics for a given
     * namespace, see {@link #listMetricProperties(ListMetricPropertiesRequest)
     * listMetricProperties}.
     *
     * @return the value
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * The OCID of the compartment to use for authorization to read metrics. To use the root
     * compartment, provide the tenancyId.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment to use for authorization to read metrics. To use the root
     * compartment, provide the tenancyId.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Qualifiers to use when searching for metric data. For a list of valid dimensions for a given
     * metric, see {@link #listMetricProperties(ListMetricPropertiesRequest) listMetricProperties}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, DimensionValue> dimensions;

    /**
     * Qualifiers to use when searching for metric data. For a list of valid dimensions for a given
     * metric, see {@link #listMetricProperties(ListMetricPropertiesRequest) listMetricProperties}.
     *
     * @return the value
     */
    public java.util.Map<String, DimensionValue> getDimensions() {
        return dimensions;
    }

    /**
     * The beginning of the sampled time range to use when searching for metric data points. Format
     * is defined by <a href="https://www.rfc-editor.org/rfc/rfc3339">RFC3339</a>. The response
     * includes metric data points for the sampled time. Example 2019-02-01T02:02:29.600Z
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final java.util.Date startTime;

    /**
     * The beginning of the sampled time range to use when searching for metric data points. Format
     * is defined by <a href="https://www.rfc-editor.org/rfc/rfc3339">RFC3339</a>. The response
     * includes metric data points for the sampled time. Example 2019-02-01T02:02:29.600Z
     *
     * @return the value
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * The end of the sampled time range to use when searching for metric data points. Format is
     * defined by <a href="https://www.rfc-editor.org/rfc/rfc3339">RFC3339</a>. The response
     * excludes metric data points for sampled time. Example 2019-02-01T02:02:29.600Z
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final java.util.Date endTime;

    /**
     * The end of the sampled time range to use when searching for metric data points. Format is
     * defined by <a href="https://www.rfc-editor.org/rfc/rfc3339">RFC3339</a>. The response
     * excludes metric data points for sampled time. Example 2019-02-01T02:02:29.600Z
     *
     * @return the value
     */
    public java.util.Date getEndTime() {
        return endTime;
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
        sb.append("RequestSummarizedMetricDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", metricName=").append(String.valueOf(this.metricName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedMetricDataDetails)) {
            return false;
        }

        RequestSummarizedMetricDataDetails other = (RequestSummarizedMetricDataDetails) o;
        return java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
