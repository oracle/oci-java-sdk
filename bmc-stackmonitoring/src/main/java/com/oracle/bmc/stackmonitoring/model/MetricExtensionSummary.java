/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Summary information about metric extension resources <br>
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
        builder = MetricExtensionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MetricExtensionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "displayName",
        "description",
        "resourceType",
        "compartmentId",
        "status",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "collectionMethod",
        "enabledOnResourcesCount",
        "resourceUri"
    })
    public MetricExtensionSummary(
            String id,
            String name,
            String displayName,
            String description,
            String resourceType,
            String compartmentId,
            MetricExtensionLifeCycleDetails status,
            MetricExtensionLifeCycleStates lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            MetricExtensionCollectionMethods collectionMethod,
            Integer enabledOnResourcesCount,
            String resourceUri) {
        super();
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.resourceType = resourceType;
        this.compartmentId = compartmentId;
        this.status = status;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.collectionMethod = collectionMethod;
        this.enabledOnResourcesCount = enabledOnResourcesCount;
        this.resourceUri = resourceUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * metric extension.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * metric extension.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
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
        /** Metric Extension resource display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Metric Extension resource display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /** The current state of the metric extension. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private MetricExtensionLifeCycleDetails status;

        /**
         * The current state of the metric extension.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(MetricExtensionLifeCycleDetails status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The current lifecycle state of the metric extension */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MetricExtensionLifeCycleStates lifecycleState;

        /**
         * The current lifecycle state of the metric extension
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(MetricExtensionLifeCycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Metric Extension creation time. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Metric Extension creation time. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Metric Extension updation time. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Metric Extension updation time. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Type of possible collection methods. */
        @com.fasterxml.jackson.annotation.JsonProperty("collectionMethod")
        private MetricExtensionCollectionMethods collectionMethod;

        /**
         * Type of possible collection methods.
         *
         * @param collectionMethod the value to set
         * @return this builder
         */
        public Builder collectionMethod(MetricExtensionCollectionMethods collectionMethod) {
            this.collectionMethod = collectionMethod;
            this.__explicitlySet__.add("collectionMethod");
            return this;
        }
        /** Count of resources on which this metric extension is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("enabledOnResourcesCount")
        private Integer enabledOnResourcesCount;

        /**
         * Count of resources on which this metric extension is enabled.
         *
         * @param enabledOnResourcesCount the value to set
         * @return this builder
         */
        public Builder enabledOnResourcesCount(Integer enabledOnResourcesCount) {
            this.enabledOnResourcesCount = enabledOnResourcesCount;
            this.__explicitlySet__.add("enabledOnResourcesCount");
            return this;
        }
        /** The URI path that the user can do a GET on to access the metric extension metadata */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
        private String resourceUri;

        /**
         * The URI path that the user can do a GET on to access the metric extension metadata
         *
         * @param resourceUri the value to set
         * @return this builder
         */
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            this.__explicitlySet__.add("resourceUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricExtensionSummary build() {
            MetricExtensionSummary model =
                    new MetricExtensionSummary(
                            this.id,
                            this.name,
                            this.displayName,
                            this.description,
                            this.resourceType,
                            this.compartmentId,
                            this.status,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.collectionMethod,
                            this.enabledOnResourcesCount,
                            this.resourceUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricExtensionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("collectionMethod")) {
                this.collectionMethod(model.getCollectionMethod());
            }
            if (model.wasPropertyExplicitlySet("enabledOnResourcesCount")) {
                this.enabledOnResourcesCount(model.getEnabledOnResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("resourceUri")) {
                this.resourceUri(model.getResourceUri());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of metric
     * extension.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of metric
     * extension.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** Metric Extension resource display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Metric Extension resource display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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

    /** The current state of the metric extension. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final MetricExtensionLifeCycleDetails status;

    /**
     * The current state of the metric extension.
     *
     * @return the value
     */
    public MetricExtensionLifeCycleDetails getStatus() {
        return status;
    }

    /** The current lifecycle state of the metric extension */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MetricExtensionLifeCycleStates lifecycleState;

    /**
     * The current lifecycle state of the metric extension
     *
     * @return the value
     */
    public MetricExtensionLifeCycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** Metric Extension creation time. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Metric Extension creation time. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Metric Extension updation time. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Metric Extension updation time. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Type of possible collection methods. */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionMethod")
    private final MetricExtensionCollectionMethods collectionMethod;

    /**
     * Type of possible collection methods.
     *
     * @return the value
     */
    public MetricExtensionCollectionMethods getCollectionMethod() {
        return collectionMethod;
    }

    /** Count of resources on which this metric extension is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("enabledOnResourcesCount")
    private final Integer enabledOnResourcesCount;

    /**
     * Count of resources on which this metric extension is enabled.
     *
     * @return the value
     */
    public Integer getEnabledOnResourcesCount() {
        return enabledOnResourcesCount;
    }

    /** The URI path that the user can do a GET on to access the metric extension metadata */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceUri")
    private final String resourceUri;

    /**
     * The URI path that the user can do a GET on to access the metric extension metadata
     *
     * @return the value
     */
    public String getResourceUri() {
        return resourceUri;
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
        sb.append("MetricExtensionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", collectionMethod=").append(String.valueOf(this.collectionMethod));
        sb.append(", enabledOnResourcesCount=")
                .append(String.valueOf(this.enabledOnResourcesCount));
        sb.append(", resourceUri=").append(String.valueOf(this.resourceUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricExtensionSummary)) {
            return false;
        }

        MetricExtensionSummary other = (MetricExtensionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.collectionMethod, other.collectionMethod)
                && java.util.Objects.equals(
                        this.enabledOnResourcesCount, other.enabledOnResourcesCount)
                && java.util.Objects.equals(this.resourceUri, other.resourceUri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.collectionMethod == null ? 43 : this.collectionMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.enabledOnResourcesCount == null
                                ? 43
                                : this.enabledOnResourcesCount.hashCode());
        result = (result * PRIME) + (this.resourceUri == null ? 43 : this.resourceUri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
