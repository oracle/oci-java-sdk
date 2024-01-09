/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * A metric group defines a set of metrics to collect from a span. It uses a span filter to specify
 * which spans to process. The set is then published to a namespace, which is a product level
 * subdivision of metrics. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetricGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MetricGroup extends Config {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The name by which a configuration entity is displayed to the end user. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name by which a configuration entity is displayed to the end user.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * Span Filter. The filterId is mandatory for the creation of MetricGroups. A filterId is
         * generated when a Span Filter is created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("filterId")
        private String filterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * Span Filter. The filterId is mandatory for the creation of MetricGroups. A filterId is
         * generated when a Span Filter is created.
         *
         * @param filterId the value to set
         * @return this builder
         */
        public Builder filterId(String filterId) {
            this.filterId = filterId;
            this.__explicitlySet__.add("filterId");
            return this;
        }
        /**
         * The namespace to which the metrics are published. It must be one of several predefined
         * namespaces.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace to which the metrics are published. It must be one of several predefined
         * namespaces.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** A list of dimensions for the metric. This variable should not be used. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<Dimension> dimensions;

        /**
         * A list of dimensions for the metric. This variable should not be used.
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.List<Dimension> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /** The list of metrics in this group. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<Metric> metrics;

        /**
         * The list of metrics in this group.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<Metric> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricGroup build() {
            MetricGroup model =
                    new MetricGroup(
                            this.id,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdBy,
                            this.updatedBy,
                            this.etag,
                            this.freeformTags,
                            this.definedTags,
                            this.displayName,
                            this.filterId,
                            this.namespace,
                            this.dimensions,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricGroup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("etag")) {
                this.etag(model.getEtag());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("filterId")) {
                this.filterId(model.getFilterId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
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
    public MetricGroup(
            String id,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdBy,
            String updatedBy,
            String etag,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String filterId,
            String namespace,
            java.util.List<Dimension> dimensions,
            java.util.List<Metric> metrics) {
        super(id, timeCreated, timeUpdated, createdBy, updatedBy, etag, freeformTags, definedTags);
        this.displayName = displayName;
        this.filterId = filterId;
        this.namespace = namespace;
        this.dimensions = dimensions;
        this.metrics = metrics;
    }

    /** The name by which a configuration entity is displayed to the end user. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name by which a configuration entity is displayed to the end user.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Span
     * Filter. The filterId is mandatory for the creation of MetricGroups. A filterId is generated
     * when a Span Filter is created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filterId")
    private final String filterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Span
     * Filter. The filterId is mandatory for the creation of MetricGroups. A filterId is generated
     * when a Span Filter is created.
     *
     * @return the value
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * The namespace to which the metrics are published. It must be one of several predefined
     * namespaces.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace to which the metrics are published. It must be one of several predefined
     * namespaces.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** A list of dimensions for the metric. This variable should not be used. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<Dimension> dimensions;

    /**
     * A list of dimensions for the metric. This variable should not be used.
     *
     * @return the value
     */
    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /** The list of metrics in this group. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<Metric> metrics;

    /**
     * The list of metrics in this group.
     *
     * @return the value
     */
    public java.util.List<Metric> getMetrics() {
        return metrics;
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
        sb.append("MetricGroup(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", filterId=").append(String.valueOf(this.filterId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricGroup)) {
            return false;
        }

        MetricGroup other = (MetricGroup) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.filterId, other.filterId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.filterId == null ? 43 : this.filterId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        return result;
    }
}
