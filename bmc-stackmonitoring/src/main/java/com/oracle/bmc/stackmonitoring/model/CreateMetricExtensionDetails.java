/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information about new metric extension resource. The combination of metric extension name and
 * resource type should be unique in a compartment. <br>
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
        builder = CreateMetricExtensionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMetricExtensionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "displayName",
        "resourceType",
        "compartmentId",
        "description",
        "collectionRecurrences",
        "metricList",
        "queryProperties"
    })
    public CreateMetricExtensionDetails(
            String name,
            String displayName,
            String resourceType,
            String compartmentId,
            String description,
            String collectionRecurrences,
            java.util.List<Metric> metricList,
            MetricExtensionQueryProperties queryProperties) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.resourceType = resourceType;
        this.compartmentId = compartmentId;
        this.description = description;
        this.collectionRecurrences = collectionRecurrences;
        this.metricList = metricList;
        this.queryProperties = queryProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Metric Extension Resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Metric Extension Resource name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Metric Extension display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Metric Extension display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Resource type to which Metric Extension applies */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Resource type to which Metric Extension applies
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Description of the metric extension. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the metric extension.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Schedule of metric extension should use RFC 5545 format i.e. recur-rule-part =
         * "FREQ";INTERVAL where FREQ rule part identifies the type of recurrence rule. Valid values
         * are "MINUTELY","HOURLY","DAILY" to specify repeating events based on an interval of a
         * minute, an hour and a day or more. Example- FREQ=DAILY;INTERVAL=1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("collectionRecurrences")
        private String collectionRecurrences;

        /**
         * Schedule of metric extension should use RFC 5545 format i.e. recur-rule-part =
         * "FREQ";INTERVAL where FREQ rule part identifies the type of recurrence rule. Valid values
         * are "MINUTELY","HOURLY","DAILY" to specify repeating events based on an interval of a
         * minute, an hour and a day or more. Example- FREQ=DAILY;INTERVAL=1
         *
         * @param collectionRecurrences the value to set
         * @return this builder
         */
        public Builder collectionRecurrences(String collectionRecurrences) {
            this.collectionRecurrences = collectionRecurrences;
            this.__explicitlySet__.add("collectionRecurrences");
            return this;
        }
        /** List of metrics which are part of this metric extension */
        @com.fasterxml.jackson.annotation.JsonProperty("metricList")
        private java.util.List<Metric> metricList;

        /**
         * List of metrics which are part of this metric extension
         *
         * @param metricList the value to set
         * @return this builder
         */
        public Builder metricList(java.util.List<Metric> metricList) {
            this.metricList = metricList;
            this.__explicitlySet__.add("metricList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryProperties")
        private MetricExtensionQueryProperties queryProperties;

        public Builder queryProperties(MetricExtensionQueryProperties queryProperties) {
            this.queryProperties = queryProperties;
            this.__explicitlySet__.add("queryProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMetricExtensionDetails build() {
            CreateMetricExtensionDetails model =
                    new CreateMetricExtensionDetails(
                            this.name,
                            this.displayName,
                            this.resourceType,
                            this.compartmentId,
                            this.description,
                            this.collectionRecurrences,
                            this.metricList,
                            this.queryProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMetricExtensionDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("collectionRecurrences")) {
                this.collectionRecurrences(model.getCollectionRecurrences());
            }
            if (model.wasPropertyExplicitlySet("metricList")) {
                this.metricList(model.getMetricList());
            }
            if (model.wasPropertyExplicitlySet("queryProperties")) {
                this.queryProperties(model.getQueryProperties());
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

    /** Metric Extension Resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Metric Extension Resource name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Metric Extension display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Metric Extension display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Resource type to which Metric Extension applies */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Resource type to which Metric Extension applies
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Description of the metric extension. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the metric extension.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Schedule of metric extension should use RFC 5545 format i.e. recur-rule-part =
     * "FREQ";INTERVAL where FREQ rule part identifies the type of recurrence rule. Valid values are
     * "MINUTELY","HOURLY","DAILY" to specify repeating events based on an interval of a minute, an
     * hour and a day or more. Example- FREQ=DAILY;INTERVAL=1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionRecurrences")
    private final String collectionRecurrences;

    /**
     * Schedule of metric extension should use RFC 5545 format i.e. recur-rule-part =
     * "FREQ";INTERVAL where FREQ rule part identifies the type of recurrence rule. Valid values are
     * "MINUTELY","HOURLY","DAILY" to specify repeating events based on an interval of a minute, an
     * hour and a day or more. Example- FREQ=DAILY;INTERVAL=1
     *
     * @return the value
     */
    public String getCollectionRecurrences() {
        return collectionRecurrences;
    }

    /** List of metrics which are part of this metric extension */
    @com.fasterxml.jackson.annotation.JsonProperty("metricList")
    private final java.util.List<Metric> metricList;

    /**
     * List of metrics which are part of this metric extension
     *
     * @return the value
     */
    public java.util.List<Metric> getMetricList() {
        return metricList;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryProperties")
    private final MetricExtensionQueryProperties queryProperties;

    public MetricExtensionQueryProperties getQueryProperties() {
        return queryProperties;
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
        sb.append("CreateMetricExtensionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", collectionRecurrences=").append(String.valueOf(this.collectionRecurrences));
        sb.append(", metricList=").append(String.valueOf(this.metricList));
        sb.append(", queryProperties=").append(String.valueOf(this.queryProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMetricExtensionDetails)) {
            return false;
        }

        CreateMetricExtensionDetails other = (CreateMetricExtensionDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.collectionRecurrences, other.collectionRecurrences)
                && java.util.Objects.equals(this.metricList, other.metricList)
                && java.util.Objects.equals(this.queryProperties, other.queryProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.collectionRecurrences == null
                                ? 43
                                : this.collectionRecurrences.hashCode());
        result = (result * PRIME) + (this.metricList == null ? 43 : this.metricList.hashCode());
        result =
                (result * PRIME)
                        + (this.queryProperties == null ? 43 : this.queryProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
