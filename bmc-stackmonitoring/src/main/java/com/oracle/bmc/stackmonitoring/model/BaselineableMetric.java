/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Summary for the baseline-able metric
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
    builder = BaselineableMetric.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BaselineableMetric extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "createdBy",
        "lastUpdatedBy",
        "timeCreated",
        "timeLastUpdated",
        "id",
        "lifecycleState",
        "tenancyId",
        "compartmentId",
        "name",
        "column",
        "namespace",
        "resourceGroup",
        "isOutOfBox",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public BaselineableMetric(
            String createdBy,
            String lastUpdatedBy,
            java.util.Date timeCreated,
            java.util.Date timeLastUpdated,
            String id,
            BaselineableMetricLifeCycleStates lifecycleState,
            String tenancyId,
            String compartmentId,
            String name,
            String column,
            String namespace,
            String resourceGroup,
            Boolean isOutOfBox,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.timeCreated = timeCreated;
        this.timeLastUpdated = timeLastUpdated;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.tenancyId = tenancyId;
        this.compartmentId = compartmentId;
        this.name = name;
        this.column = column;
        this.namespace = namespace;
        this.resourceGroup = resourceGroup;
        this.isOutOfBox = isOutOfBox;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Created user id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * Created user id
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * last Updated user id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedBy")
        private String lastUpdatedBy;

        /**
         * last Updated user id
         * @param lastUpdatedBy the value to set
         * @return this builder
         **/
        public Builder lastUpdatedBy(String lastUpdatedBy) {
            this.lastUpdatedBy = lastUpdatedBy;
            this.__explicitlySet__.add("lastUpdatedBy");
            return this;
        }
        /**
         * creation date
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * creation date
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * last updated time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
        private java.util.Date timeLastUpdated;

        /**
         * last updated time
         * @param timeLastUpdated the value to set
         * @return this builder
         **/
        public Builder timeLastUpdated(java.util.Date timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            this.__explicitlySet__.add("timeLastUpdated");
            return this;
        }
        /**
         * OCID of the metric
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the metric
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The current lifecycle state of the metric extension
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private BaselineableMetricLifeCycleStates lifecycleState;

        /**
         * The current lifecycle state of the metric extension
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(BaselineableMetricLifeCycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * OCID of the tenancy
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * OCID of the tenancy
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * OCID of the compartment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * name of the metric
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * name of the metric
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * metric column name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("column")
        private String column;

        /**
         * metric column name
         * @param column the value to set
         * @return this builder
         **/
        public Builder column(String column) {
            this.column = column;
            this.__explicitlySet__.add("column");
            return this;
        }
        /**
         * namespace of the metric
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * namespace of the metric
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Resource group of the metric
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * Resource group of the metric
         * @param resourceGroup the value to set
         * @return this builder
         **/
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }
        /**
         * Is the metric created out of box, default false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOutOfBox")
        private Boolean isOutOfBox;

        /**
         * Is the metric created out of box, default false
         * @param isOutOfBox the value to set
         * @return this builder
         **/
        public Builder isOutOfBox(Boolean isOutOfBox) {
            this.isOutOfBox = isOutOfBox;
            this.__explicitlySet__.add("isOutOfBox");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BaselineableMetric build() {
            BaselineableMetric model =
                    new BaselineableMetric(
                            this.createdBy,
                            this.lastUpdatedBy,
                            this.timeCreated,
                            this.timeLastUpdated,
                            this.id,
                            this.lifecycleState,
                            this.tenancyId,
                            this.compartmentId,
                            this.name,
                            this.column,
                            this.namespace,
                            this.resourceGroup,
                            this.isOutOfBox,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BaselineableMetric model) {
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("lastUpdatedBy")) {
                this.lastUpdatedBy(model.getLastUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastUpdated")) {
                this.timeLastUpdated(model.getTimeLastUpdated());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("column")) {
                this.column(model.getColumn());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("isOutOfBox")) {
                this.isOutOfBox(model.getIsOutOfBox());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /**
     * Created user id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * Created user id
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * last Updated user id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedBy")
    private final String lastUpdatedBy;

    /**
     * last Updated user id
     * @return the value
     **/
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * creation date
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * creation date
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * last updated time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
    private final java.util.Date timeLastUpdated;

    /**
     * last updated time
     * @return the value
     **/
    public java.util.Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    /**
     * OCID of the metric
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the metric
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The current lifecycle state of the metric extension
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final BaselineableMetricLifeCycleStates lifecycleState;

    /**
     * The current lifecycle state of the metric extension
     * @return the value
     **/
    public BaselineableMetricLifeCycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * OCID of the tenancy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * OCID of the tenancy
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * OCID of the compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * name of the metric
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * name of the metric
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * metric column name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("column")
    private final String column;

    /**
     * metric column name
     * @return the value
     **/
    public String getColumn() {
        return column;
    }

    /**
     * namespace of the metric
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * namespace of the metric
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * Resource group of the metric
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * Resource group of the metric
     * @return the value
     **/
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * Is the metric created out of box, default false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOutOfBox")
    private final Boolean isOutOfBox;

    /**
     * Is the metric created out of box, default false
     * @return the value
     **/
    public Boolean getIsOutOfBox() {
        return isOutOfBox;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("BaselineableMetric(");
        sb.append("super=").append(super.toString());
        sb.append("createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", lastUpdatedBy=").append(String.valueOf(this.lastUpdatedBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastUpdated=").append(String.valueOf(this.timeLastUpdated));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", column=").append(String.valueOf(this.column));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", isOutOfBox=").append(String.valueOf(this.isOutOfBox));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaselineableMetric)) {
            return false;
        }

        BaselineableMetric other = (BaselineableMetric) o;
        return java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.lastUpdatedBy, other.lastUpdatedBy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastUpdated, other.timeLastUpdated)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.column, other.column)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.isOutOfBox, other.isOutOfBox)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.lastUpdatedBy == null ? 43 : this.lastUpdatedBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastUpdated == null ? 43 : this.timeLastUpdated.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.column == null ? 43 : this.column.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result = (result * PRIME) + (this.isOutOfBox == null ? 43 : this.isOutOfBox.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
