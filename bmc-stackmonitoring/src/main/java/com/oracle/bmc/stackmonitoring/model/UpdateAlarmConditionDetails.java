/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information about updating a alarm condition in the same monitoringTemplate in a compartment.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateAlarmConditionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAlarmConditionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespace",
        "compositeType",
        "resourceType",
        "metricName",
        "conditionType",
        "conditions",
        "freeformTags",
        "definedTags"
    })
    public UpdateAlarmConditionDetails(
            String namespace,
            String compositeType,
            String resourceType,
            String metricName,
            ConditionType conditionType,
            java.util.List<Condition> conditions,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.namespace = namespace;
        this.compositeType = compositeType;
        this.resourceType = resourceType;
        this.metricName = metricName;
        this.conditionType = conditionType;
        this.conditions = conditions;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The stack monitoring service or application emitting the metric that is evaluated by the
         * alarm.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The stack monitoring service or application emitting the metric that is evaluated by the
         * alarm.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The OCID of composite resource type like EBS/PEOPLE_SOFT. */
        @com.fasterxml.jackson.annotation.JsonProperty("compositeType")
        private String compositeType;

        /**
         * The OCID of composite resource type like EBS/PEOPLE_SOFT.
         *
         * @param compositeType the value to set
         * @return this builder
         */
        public Builder compositeType(String compositeType) {
            this.compositeType = compositeType;
            this.__explicitlySet__.add("compositeType");
            return this;
        }
        /** The resource type OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The resource type OCID.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
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
        /** Type of defined monitoring template. */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionType")
        private ConditionType conditionType;

        /**
         * Type of defined monitoring template.
         *
         * @param conditionType the value to set
         * @return this builder
         */
        public Builder conditionType(ConditionType conditionType) {
            this.conditionType = conditionType;
            this.__explicitlySet__.add("conditionType");
            return this;
        }
        /** Monitoring template conditions */
        @com.fasterxml.jackson.annotation.JsonProperty("conditions")
        private java.util.List<Condition> conditions;

        /**
         * Monitoring template conditions
         *
         * @param conditions the value to set
         * @return this builder
         */
        public Builder conditions(java.util.List<Condition> conditions) {
            this.conditions = conditions;
            this.__explicitlySet__.add("conditions");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAlarmConditionDetails build() {
            UpdateAlarmConditionDetails model =
                    new UpdateAlarmConditionDetails(
                            this.namespace,
                            this.compositeType,
                            this.resourceType,
                            this.metricName,
                            this.conditionType,
                            this.conditions,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAlarmConditionDetails model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("compositeType")) {
                this.compositeType(model.getCompositeType());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("conditionType")) {
                this.conditionType(model.getConditionType());
            }
            if (model.wasPropertyExplicitlySet("conditions")) {
                this.conditions(model.getConditions());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The stack monitoring service or application emitting the metric that is evaluated by the
     * alarm.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The stack monitoring service or application emitting the metric that is evaluated by the
     * alarm.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The OCID of composite resource type like EBS/PEOPLE_SOFT. */
    @com.fasterxml.jackson.annotation.JsonProperty("compositeType")
    private final String compositeType;

    /**
     * The OCID of composite resource type like EBS/PEOPLE_SOFT.
     *
     * @return the value
     */
    public String getCompositeType() {
        return compositeType;
    }

    /** The resource type OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The resource type OCID.
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
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

    /** Type of defined monitoring template. */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionType")
    private final ConditionType conditionType;

    /**
     * Type of defined monitoring template.
     *
     * @return the value
     */
    public ConditionType getConditionType() {
        return conditionType;
    }

    /** Monitoring template conditions */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    private final java.util.List<Condition> conditions;

    /**
     * Monitoring template conditions
     *
     * @return the value
     */
    public java.util.List<Condition> getConditions() {
        return conditions;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateAlarmConditionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", compositeType=").append(String.valueOf(this.compositeType));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", metricName=").append(String.valueOf(this.metricName));
        sb.append(", conditionType=").append(String.valueOf(this.conditionType));
        sb.append(", conditions=").append(String.valueOf(this.conditions));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAlarmConditionDetails)) {
            return false;
        }

        UpdateAlarmConditionDetails other = (UpdateAlarmConditionDetails) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.compositeType, other.compositeType)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.conditionType, other.conditionType)
                && java.util.Objects.equals(this.conditions, other.conditions)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compositeType == null ? 43 : this.compositeType.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionType == null ? 43 : this.conditionType.hashCode());
        result = (result * PRIME) + (this.conditions == null ? 43 : this.conditions.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
