/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The properties that define a metric. For information about metrics, see [Metrics
 * Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#MetricsOverview).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Metric.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Metric extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "namespace",
        "resourceGroup",
        "compartmentId",
        "dimensions"
    })
    public Metric(
            String name,
            String namespace,
            String resourceGroup,
            String compartmentId,
            java.util.Map<String, String> dimensions) {
        super();
        this.name = name;
        this.namespace = namespace;
        this.resourceGroup = resourceGroup;
        this.compartmentId = compartmentId;
        this.dimensions = dimensions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the metric.
         *
         * <p>Example: {@code CpuUtilization}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the metric.
         *
         * <p>Example: {@code CpuUtilization}
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
         * The source service or application emitting the metric.
         *
         * <p>Example: {@code oci_computeagent}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The source service or application emitting the metric.
         *
         * <p>Example: {@code oci_computeagent}
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
         * Resource group provided with the posted metric. A resource group is a custom string that
         * you can match when retrieving custom metrics. Only one resource group can be applied per
         * metric. A valid resourceGroup value starts with an alphabetical character and includes
         * only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs
         * ($).
         *
         * <p>Example: {@code frontend-fleet}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * Resource group provided with the posted metric. A resource group is a custom string that
         * you can match when retrieving custom metrics. Only one resource group can be applied per
         * metric. A valid resourceGroup value starts with an alphabetical character and includes
         * only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs
         * ($).
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
         * of the compartment containing the resources monitored by the metric.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the resources monitored by the metric.
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
         * Qualifiers provided in a metric definition. Available dimensions vary by metric
         * namespace. Each dimension takes the form of a key-value pair.
         *
         * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * Qualifiers provided in a metric definition. Available dimensions vary by metric
         * namespace. Each dimension takes the form of a key-value pair.
         *
         * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Metric build() {
            Metric model =
                    new Metric(
                            this.name,
                            this.namespace,
                            this.resourceGroup,
                            this.compartmentId,
                            this.dimensions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Metric model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
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
     * The name of the metric.
     *
     * <p>Example: {@code CpuUtilization}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the metric.
     *
     * <p>Example: {@code CpuUtilization}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The source service or application emitting the metric.
     *
     * <p>Example: {@code oci_computeagent}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The source service or application emitting the metric.
     *
     * <p>Example: {@code oci_computeagent}
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Resource group provided with the posted metric. A resource group is a custom string that you
     * can match when retrieving custom metrics. Only one resource group can be applied per metric.
     * A valid resourceGroup value starts with an alphabetical character and includes only
     * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     *
     * <p>Example: {@code frontend-fleet}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * Resource group provided with the posted metric. A resource group is a custom string that you
     * can match when retrieving custom metrics. Only one resource group can be applied per metric.
     * A valid resourceGroup value starts with an alphabetical character and includes only
     * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
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
     * the compartment containing the resources monitored by the metric.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the resources monitored by the metric.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Qualifiers provided in a metric definition. Available dimensions vary by metric namespace.
     * Each dimension takes the form of a key-value pair.
     *
     * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * Qualifiers provided in a metric definition. Available dimensions vary by metric namespace.
     * Each dimension takes the form of a key-value pair.
     *
     * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
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
        sb.append("Metric(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Metric)) {
            return false;
        }

        Metric other = (Metric) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
