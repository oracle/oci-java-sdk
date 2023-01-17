/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * A metric object containing raw metric data points to be posted to the Monitoring service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MetricDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MetricDataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespace",
        "resourceGroup",
        "compartmentId",
        "name",
        "dimensions",
        "metadata",
        "datapoints"
    })
    public MetricDataDetails(
            String namespace,
            String resourceGroup,
            String compartmentId,
            String name,
            java.util.Map<String, String> dimensions,
            java.util.Map<String, String> metadata,
            java.util.List<Datapoint> datapoints) {
        super();
        this.namespace = namespace;
        this.resourceGroup = resourceGroup;
        this.compartmentId = compartmentId;
        this.name = name;
        this.dimensions = dimensions;
        this.metadata = metadata;
        this.datapoints = datapoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The source service or application emitting the metric.
         *
         * <p>A valid namespace value starts with an alphabetical character and includes only
         * alphanumeric characters and underscores. The "oci_" prefix is reserved. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code my_namespace}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The source service or application emitting the metric.
         *
         * <p>A valid namespace value starts with an alphabetical character and includes only
         * alphanumeric characters and underscores. The "oci_" prefix is reserved. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code my_namespace}
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
         * Resource group to assign to the metric. A resource group is a custom string that you can
         * match when retrieving custom metrics. Only one resource group can be applied per metric.
         * A valid resourceGroup value starts with an alphabetical character and includes only
         * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
         * Avoid entering confidential information.
         *
         * <p>Example: {@code frontend-fleet}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * Resource group to assign to the metric. A resource group is a custom string that you can
         * match when retrieving custom metrics. Only one resource group can be applied per metric.
         * A valid resourceGroup value starts with an alphabetical character and includes only
         * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
         * Avoid entering confidential information.
         *
         * <p>Example: {@code frontend-fleet}
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment to use for metrics.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment to use for metrics.
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
         * The name of the metric.
         *
         * <p>A valid name value starts with an alphabetical character and includes only
         * alphanumeric characters, dots, underscores, hyphens, and dollar signs. The {@code oci_}
         * prefix is reserved. Avoid entering confidential information.
         *
         * <p>Example: {@code my_app.success_rate}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the metric.
         *
         * <p>A valid name value starts with an alphabetical character and includes only
         * alphanumeric characters, dots, underscores, hyphens, and dollar signs. The {@code oci_}
         * prefix is reserved. Avoid entering confidential information.
         *
         * <p>Example: {@code my_app.success_rate}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Qualifiers provided in a metric definition. Available dimensions vary by metric
         * namespace. Each dimension takes the form of a key-value pair. A valid dimension key
         * includes only printable ASCII, excluding spaces. The character limit for a dimension key
         * is 256. A valid dimension value includes only Unicode characters. The character limit for
         * a dimension value is 512. Empty strings are not allowed for keys or values. Avoid
         * entering confidential information.
         *
         * <p>Example: {@code "resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * Qualifiers provided in a metric definition. Available dimensions vary by metric
         * namespace. Each dimension takes the form of a key-value pair. A valid dimension key
         * includes only printable ASCII, excluding spaces. The character limit for a dimension key
         * is 256. A valid dimension value includes only Unicode characters. The character limit for
         * a dimension value is 512. Empty strings are not allowed for keys or values. Avoid
         * entering confidential information.
         *
         * <p>Example: {@code "resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * Properties describing metrics. These are not part of the unique fields identifying the
         * metric. Each metadata item takes the form of a key-value pair. The character limit for a
         * metadata key is 256. The character limit for a metadata value is 256.
         *
         * <p>Example: {@code "unit": "bytes"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Properties describing metrics. These are not part of the unique fields identifying the
         * metric. Each metadata item takes the form of a key-value pair. The character limit for a
         * metadata key is 256. The character limit for a metadata value is 256.
         *
         * <p>Example: {@code "unit": "bytes"}
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * A list of metric values with timestamps. At least one data point is required per call.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("datapoints")
        private java.util.List<Datapoint> datapoints;

        /**
         * A list of metric values with timestamps. At least one data point is required per call.
         *
         * @param datapoints the value to set
         * @return this builder
         */
        public Builder datapoints(java.util.List<Datapoint> datapoints) {
            this.datapoints = datapoints;
            this.__explicitlySet__.add("datapoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricDataDetails build() {
            MetricDataDetails model =
                    new MetricDataDetails(
                            this.namespace,
                            this.resourceGroup,
                            this.compartmentId,
                            this.name,
                            this.dimensions,
                            this.metadata,
                            this.datapoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricDataDetails model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The source service or application emitting the metric.
     *
     * <p>A valid namespace value starts with an alphabetical character and includes only
     * alphanumeric characters and underscores. The "oci_" prefix is reserved. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code my_namespace}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The source service or application emitting the metric.
     *
     * <p>A valid namespace value starts with an alphabetical character and includes only
     * alphanumeric characters and underscores. The "oci_" prefix is reserved. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code my_namespace}
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Resource group to assign to the metric. A resource group is a custom string that you can
     * match when retrieving custom metrics. Only one resource group can be applied per metric. A
     * valid resourceGroup value starts with an alphabetical character and includes only
     * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     * Avoid entering confidential information.
     *
     * <p>Example: {@code frontend-fleet}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * Resource group to assign to the metric. A resource group is a custom string that you can
     * match when retrieving custom metrics. Only one resource group can be applied per metric. A
     * valid resourceGroup value starts with an alphabetical character and includes only
     * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     * Avoid entering confidential information.
     *
     * <p>Example: {@code frontend-fleet}
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment to use for metrics.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment to use for metrics.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the metric.
     *
     * <p>A valid name value starts with an alphabetical character and includes only alphanumeric
     * characters, dots, underscores, hyphens, and dollar signs. The {@code oci_} prefix is
     * reserved. Avoid entering confidential information.
     *
     * <p>Example: {@code my_app.success_rate}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the metric.
     *
     * <p>A valid name value starts with an alphabetical character and includes only alphanumeric
     * characters, dots, underscores, hyphens, and dollar signs. The {@code oci_} prefix is
     * reserved. Avoid entering confidential information.
     *
     * <p>Example: {@code my_app.success_rate}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Qualifiers provided in a metric definition. Available dimensions vary by metric namespace.
     * Each dimension takes the form of a key-value pair. A valid dimension key includes only
     * printable ASCII, excluding spaces. The character limit for a dimension key is 256. A valid
     * dimension value includes only Unicode characters. The character limit for a dimension value
     * is 512. Empty strings are not allowed for keys or values. Avoid entering confidential
     * information.
     *
     * <p>Example: {@code "resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * Qualifiers provided in a metric definition. Available dimensions vary by metric namespace.
     * Each dimension takes the form of a key-value pair. A valid dimension key includes only
     * printable ASCII, excluding spaces. The character limit for a dimension key is 256. A valid
     * dimension value includes only Unicode characters. The character limit for a dimension value
     * is 512. Empty strings are not allowed for keys or values. Avoid entering confidential
     * information.
     *
     * <p>Example: {@code "resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * Properties describing metrics. These are not part of the unique fields identifying the
     * metric. Each metadata item takes the form of a key-value pair. The character limit for a
     * metadata key is 256. The character limit for a metadata value is 256.
     *
     * <p>Example: {@code "unit": "bytes"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Properties describing metrics. These are not part of the unique fields identifying the
     * metric. Each metadata item takes the form of a key-value pair. The character limit for a
     * metadata key is 256. The character limit for a metadata value is 256.
     *
     * <p>Example: {@code "unit": "bytes"}
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /** A list of metric values with timestamps. At least one data point is required per call. */
    @com.fasterxml.jackson.annotation.JsonProperty("datapoints")
    private final java.util.List<Datapoint> datapoints;

    /**
     * A list of metric values with timestamps. At least one data point is required per call.
     *
     * @return the value
     */
    public java.util.List<Datapoint> getDatapoints() {
        return datapoints;
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
        sb.append("MetricDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
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
        if (!(o instanceof MetricDataDetails)) {
            return false;
        }

        MetricDataDetails other = (MetricDataDetails) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.datapoints, other.datapoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.datapoints == null ? 43 : this.datapoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
