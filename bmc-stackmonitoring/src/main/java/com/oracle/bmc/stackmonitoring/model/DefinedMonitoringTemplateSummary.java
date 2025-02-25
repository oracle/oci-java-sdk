/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Summary information about defined Monitoring Template for specified resourceType.
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
    builder = DefinedMonitoringTemplateSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DefinedMonitoringTemplateSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "namespace",
        "compositeType",
        "resourceType",
        "definedAlarmConditions",
        "timeCreated",
        "timeUpdated",
        "systemTags"
    })
    public DefinedMonitoringTemplateSummary(
            String id,
            String displayName,
            String namespace,
            String compositeType,
            String resourceType,
            java.util.List<DefinedAlarmCondition> definedAlarmConditions,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.namespace = namespace;
        this.compositeType = compositeType;
        this.resourceType = resourceType;
        this.definedAlarmConditions = definedAlarmConditions;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the definedMonitoringTemplate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the definedMonitoringTemplate.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the definedMonitoringTemplate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the definedMonitoringTemplate.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The stack monitoring service or application emitting the metric that is evaluated by the alarm.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The stack monitoring service or application emitting the metric that is evaluated by the alarm.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Type of composite resource type OCID like EBS/PEOPLE_SOFT.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compositeType")
        private String compositeType;

        /**
         * Type of composite resource type OCID like EBS/PEOPLE_SOFT.
         * @param compositeType the value to set
         * @return this builder
         **/
        public Builder compositeType(String compositeType) {
            this.compositeType = compositeType;
            this.__explicitlySet__.add("compositeType");
            return this;
        }
        /**
         * The resource types OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The resource types OCID.
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Defined Monitoring template alarm conditions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedAlarmConditions")
        private java.util.List<DefinedAlarmCondition> definedAlarmConditions;

        /**
         * Defined Monitoring template alarm conditions
         * @param definedAlarmConditions the value to set
         * @return this builder
         **/
        public Builder definedAlarmConditions(
                java.util.List<DefinedAlarmCondition> definedAlarmConditions) {
            this.definedAlarmConditions = definedAlarmConditions;
            this.__explicitlySet__.add("definedAlarmConditions");
            return this;
        }
        /**
         * The date and time the monitoringTemplate was created. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the monitoringTemplate was created. Format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the monitoringTemplate was updated. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the monitoringTemplate was updated. Format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        public DefinedMonitoringTemplateSummary build() {
            DefinedMonitoringTemplateSummary model =
                    new DefinedMonitoringTemplateSummary(
                            this.id,
                            this.displayName,
                            this.namespace,
                            this.compositeType,
                            this.resourceType,
                            this.definedAlarmConditions,
                            this.timeCreated,
                            this.timeUpdated,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefinedMonitoringTemplateSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("compositeType")) {
                this.compositeType(model.getCompositeType());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("definedAlarmConditions")) {
                this.definedAlarmConditions(model.getDefinedAlarmConditions());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the definedMonitoringTemplate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the definedMonitoringTemplate.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the definedMonitoringTemplate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the definedMonitoringTemplate.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The stack monitoring service or application emitting the metric that is evaluated by the alarm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The stack monitoring service or application emitting the metric that is evaluated by the alarm.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * Type of composite resource type OCID like EBS/PEOPLE_SOFT.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compositeType")
    private final String compositeType;

    /**
     * Type of composite resource type OCID like EBS/PEOPLE_SOFT.
     * @return the value
     **/
    public String getCompositeType() {
        return compositeType;
    }

    /**
     * The resource types OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The resource types OCID.
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Defined Monitoring template alarm conditions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedAlarmConditions")
    private final java.util.List<DefinedAlarmCondition> definedAlarmConditions;

    /**
     * Defined Monitoring template alarm conditions
     * @return the value
     **/
    public java.util.List<DefinedAlarmCondition> getDefinedAlarmConditions() {
        return definedAlarmConditions;
    }

    /**
     * The date and time the monitoringTemplate was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the monitoringTemplate was created. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the monitoringTemplate was updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the monitoringTemplate was updated. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("DefinedMonitoringTemplateSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", compositeType=").append(String.valueOf(this.compositeType));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", definedAlarmConditions=").append(String.valueOf(this.definedAlarmConditions));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefinedMonitoringTemplateSummary)) {
            return false;
        }

        DefinedMonitoringTemplateSummary other = (DefinedMonitoringTemplateSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.compositeType, other.compositeType)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(
                        this.definedAlarmConditions, other.definedAlarmConditions)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compositeType == null ? 43 : this.compositeType.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.definedAlarmConditions == null
                                ? 43
                                : this.definedAlarmConditions.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
