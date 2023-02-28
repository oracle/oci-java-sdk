/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details of metric to post to OCI Monitoring if ingest time rule condition(s) are satisfied. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IngestTimeRuleMetricExtractionAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class IngestTimeRuleMetricExtractionAction extends IngestTimeRuleAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The compartment OCID (/iaas/Content/General/Concepts/identifiers.htm) of the extracted
         * metric.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID (/iaas/Content/General/Concepts/identifiers.htm) of the extracted
         * metric.
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
         * The namespace of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters and underscores (_).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters and underscores (_).
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
         * The metric name of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters, periods (.), underscores (_),
         * hyphens (-), and dollar signs ($).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The metric name of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters, periods (.), underscores (_),
         * hyphens (-), and dollar signs ($).
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
         * The resourceGroup of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters, periods (.), underscores (_),
         * hyphens (-), and dollar signs ($).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * The resourceGroup of the extracted metric. A valid value starts with an alphabetical
         * character and includes only alphanumeric characters, periods (.), underscores (_),
         * hyphens (-), and dollar signs ($).
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
         * Additional dimensions to publish for the extracted metric. A valid list contains the
         * source field names whose values are to be published as dimensions. The source name itself
         * is specified using a special macro SOURCE_NAME
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<String> dimensions;

        /**
         * Additional dimensions to publish for the extracted metric. A valid list contains the
         * source field names whose values are to be published as dimensions. The source name itself
         * is specified using a special macro SOURCE_NAME
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.List<String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngestTimeRuleMetricExtractionAction build() {
            IngestTimeRuleMetricExtractionAction model =
                    new IngestTimeRuleMetricExtractionAction(
                            this.compartmentId,
                            this.namespace,
                            this.metricName,
                            this.resourceGroup,
                            this.dimensions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngestTimeRuleMetricExtractionAction model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
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

    @Deprecated
    public IngestTimeRuleMetricExtractionAction(
            String compartmentId,
            String namespace,
            String metricName,
            String resourceGroup,
            java.util.List<String> dimensions) {
        super();
        this.compartmentId = compartmentId;
        this.namespace = namespace;
        this.metricName = metricName;
        this.resourceGroup = resourceGroup;
        this.dimensions = dimensions;
    }

    /**
     * The compartment OCID (/iaas/Content/General/Concepts/identifiers.htm) of the extracted
     * metric.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID (/iaas/Content/General/Concepts/identifiers.htm) of the extracted
     * metric.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The namespace of the extracted metric. A valid value starts with an alphabetical character
     * and includes only alphanumeric characters and underscores (_).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace of the extracted metric. A valid value starts with an alphabetical character
     * and includes only alphanumeric characters and underscores (_).
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * The metric name of the extracted metric. A valid value starts with an alphabetical character
     * and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and
     * dollar signs ($).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * The metric name of the extracted metric. A valid value starts with an alphabetical character
     * and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and
     * dollar signs ($).
     *
     * @return the value
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * The resourceGroup of the extracted metric. A valid value starts with an alphabetical
     * character and includes only alphanumeric characters, periods (.), underscores (_), hyphens
     * (-), and dollar signs ($).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * The resourceGroup of the extracted metric. A valid value starts with an alphabetical
     * character and includes only alphanumeric characters, periods (.), underscores (_), hyphens
     * (-), and dollar signs ($).
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * Additional dimensions to publish for the extracted metric. A valid list contains the source
     * field names whose values are to be published as dimensions. The source name itself is
     * specified using a special macro SOURCE_NAME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<String> dimensions;

    /**
     * Additional dimensions to publish for the extracted metric. A valid list contains the source
     * field names whose values are to be published as dimensions. The source name itself is
     * specified using a special macro SOURCE_NAME
     *
     * @return the value
     */
    public java.util.List<String> getDimensions() {
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
        sb.append("IngestTimeRuleMetricExtractionAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", metricName=").append(String.valueOf(this.metricName));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngestTimeRuleMetricExtractionAction)) {
            return false;
        }

        IngestTimeRuleMetricExtractionAction other = (IngestTimeRuleMetricExtractionAction) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        return result;
    }
}
