/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of the Custom Metric. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CustomMetric.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomMetric extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespace",
        "name",
        "description",
        "resourceGroup",
        "isAnomalyDetectionEnabled",
        "compartment",
        "unit",
        "isMetricPublished"
    })
    public CustomMetric(
            String namespace,
            String name,
            String description,
            String resourceGroup,
            Boolean isAnomalyDetectionEnabled,
            String compartment,
            String unit,
            Boolean isMetricPublished) {
        super();
        this.namespace = namespace;
        this.name = name;
        this.description = description;
        this.resourceGroup = resourceGroup;
        this.isAnomalyDetectionEnabled = isAnomalyDetectionEnabled;
        this.compartment = compartment;
        this.unit = unit;
        this.isMetricPublished = isMetricPublished;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Namespace in the Custom Metric. It defaults to {@code oracle_apm_custom} if not
         * specified. If specified, the necessary OCI policies should be set to allow APM to write
         * to that namespace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Namespace in the Custom Metric. It defaults to {@code oracle_apm_custom} if not
         * specified. If specified, the necessary OCI policies should be set to allow APM to write
         * to that namespace.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** Name of the Custom Metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the Custom Metric.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Description of the Custom Metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Custom Metric.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Resource Group of the Custom Metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * Resource Group of the Custom Metric.
         *
         * @param resourceGroup the value to set
         * @return this builder
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }
        /** Indicates whether anomaly Detection should be performed on the generated metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAnomalyDetectionEnabled")
        private Boolean isAnomalyDetectionEnabled;

        /**
         * Indicates whether anomaly Detection should be performed on the generated metric.
         *
         * @param isAnomalyDetectionEnabled the value to set
         * @return this builder
         */
        public Builder isAnomalyDetectionEnabled(Boolean isAnomalyDetectionEnabled) {
            this.isAnomalyDetectionEnabled = isAnomalyDetectionEnabled;
            this.__explicitlySet__.add("isAnomalyDetectionEnabled");
            return this;
        }
        /**
         * Compartment of the Monitoring Service. It defaults to the APM domain's compartment if not
         * specified. If specified, the necessary OCI policies should be set to allow APM to write
         * to that compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartment")
        private String compartment;

        /**
         * Compartment of the Monitoring Service. It defaults to the APM domain's compartment if not
         * specified. If specified, the necessary OCI policies should be set to allow APM to write
         * to that compartment.
         *
         * @param compartment the value to set
         * @return this builder
         */
        public Builder compartment(String compartment) {
            this.compartment = compartment;
            this.__explicitlySet__.add("compartment");
            return this;
        }
        /** Unit in which the metric value is reported. For example 'ms'. */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * Unit in which the metric value is reported. For example 'ms'.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * Used in conjunction with the dry run header. When the dry run header is set and the
         * isPublishMetric flag is set to true, the scheduled query is not created, but validations
         * happen to check if the right OCI policies have been set to write to the specified
         * namespace/compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMetricPublished")
        private Boolean isMetricPublished;

        /**
         * Used in conjunction with the dry run header. When the dry run header is set and the
         * isPublishMetric flag is set to true, the scheduled query is not created, but validations
         * happen to check if the right OCI policies have been set to write to the specified
         * namespace/compartment.
         *
         * @param isMetricPublished the value to set
         * @return this builder
         */
        public Builder isMetricPublished(Boolean isMetricPublished) {
            this.isMetricPublished = isMetricPublished;
            this.__explicitlySet__.add("isMetricPublished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomMetric build() {
            CustomMetric model =
                    new CustomMetric(
                            this.namespace,
                            this.name,
                            this.description,
                            this.resourceGroup,
                            this.isAnomalyDetectionEnabled,
                            this.compartment,
                            this.unit,
                            this.isMetricPublished);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomMetric model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("isAnomalyDetectionEnabled")) {
                this.isAnomalyDetectionEnabled(model.getIsAnomalyDetectionEnabled());
            }
            if (model.wasPropertyExplicitlySet("compartment")) {
                this.compartment(model.getCompartment());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("isMetricPublished")) {
                this.isMetricPublished(model.getIsMetricPublished());
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
     * Namespace in the Custom Metric. It defaults to {@code oracle_apm_custom} if not specified. If
     * specified, the necessary OCI policies should be set to allow APM to write to that namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Namespace in the Custom Metric. It defaults to {@code oracle_apm_custom} if not specified. If
     * specified, the necessary OCI policies should be set to allow APM to write to that namespace.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** Name of the Custom Metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the Custom Metric.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Description of the Custom Metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Custom Metric.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Resource Group of the Custom Metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * Resource Group of the Custom Metric.
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /** Indicates whether anomaly Detection should be performed on the generated metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAnomalyDetectionEnabled")
    private final Boolean isAnomalyDetectionEnabled;

    /**
     * Indicates whether anomaly Detection should be performed on the generated metric.
     *
     * @return the value
     */
    public Boolean getIsAnomalyDetectionEnabled() {
        return isAnomalyDetectionEnabled;
    }

    /**
     * Compartment of the Monitoring Service. It defaults to the APM domain's compartment if not
     * specified. If specified, the necessary OCI policies should be set to allow APM to write to
     * that compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartment")
    private final String compartment;

    /**
     * Compartment of the Monitoring Service. It defaults to the APM domain's compartment if not
     * specified. If specified, the necessary OCI policies should be set to allow APM to write to
     * that compartment.
     *
     * @return the value
     */
    public String getCompartment() {
        return compartment;
    }

    /** Unit in which the metric value is reported. For example 'ms'. */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * Unit in which the metric value is reported. For example 'ms'.
     *
     * @return the value
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Used in conjunction with the dry run header. When the dry run header is set and the
     * isPublishMetric flag is set to true, the scheduled query is not created, but validations
     * happen to check if the right OCI policies have been set to write to the specified
     * namespace/compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricPublished")
    private final Boolean isMetricPublished;

    /**
     * Used in conjunction with the dry run header. When the dry run header is set and the
     * isPublishMetric flag is set to true, the scheduled query is not created, but validations
     * happen to check if the right OCI policies have been set to write to the specified
     * namespace/compartment.
     *
     * @return the value
     */
    public Boolean getIsMetricPublished() {
        return isMetricPublished;
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
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", isAnomalyDetectionEnabled=")
                .append(String.valueOf(this.isAnomalyDetectionEnabled));
        sb.append(", compartment=").append(String.valueOf(this.compartment));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", isMetricPublished=").append(String.valueOf(this.isMetricPublished));
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
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(
                        this.isAnomalyDetectionEnabled, other.isAnomalyDetectionEnabled)
                && java.util.Objects.equals(this.compartment, other.compartment)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.isMetricPublished, other.isMetricPublished)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.isAnomalyDetectionEnabled == null
                                ? 43
                                : this.isAnomalyDetectionEnabled.hashCode());
        result = (result * PRIME) + (this.compartment == null ? 43 : this.compartment.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result =
                (result * PRIME)
                        + (this.isMetricPublished == null ? 43 : this.isMetricPublished.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
