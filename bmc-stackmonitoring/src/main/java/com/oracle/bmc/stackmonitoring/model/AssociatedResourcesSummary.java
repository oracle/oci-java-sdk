/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information about monitored resource. <br>
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
        builder = AssociatedResourcesSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssociatedResourcesSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "displayName",
        "type",
        "compartmentId",
        "hostName",
        "externalId",
        "managementAgentId",
        "lifecycleState",
        "license",
        "sourceType",
        "resourceCategory",
        "associatedResources"
    })
    public AssociatedResourcesSummary(
            String id,
            String name,
            String displayName,
            String type,
            String compartmentId,
            String hostName,
            String externalId,
            String managementAgentId,
            ResourceLifecycleState lifecycleState,
            LicenseType license,
            SourceType sourceType,
            ResourceCategory resourceCategory,
            java.util.List<AssociatedMonitoredResource> associatedResources) {
        super();
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.type = type;
        this.compartmentId = compartmentId;
        this.hostName = hostName;
        this.externalId = externalId;
        this.managementAgentId = managementAgentId;
        this.lifecycleState = lifecycleState;
        this.license = license;
        this.sourceType = sourceType;
        this.resourceCategory = resourceCategory;
        this.associatedResources = associatedResources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Monitored resource identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Monitored resource identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Monitored Resource Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Monitored Resource Name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Monitored resource display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Monitored resource display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Monitored Resource Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Monitored Resource Type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Monitored Resource Host Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Monitored Resource Host Name.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * External resource is any OCI resource identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is
         * not a Stack Monitoring service resource. Currently supports only following resource types
         * - Container database, non-container database, pluggable database and OCI compute
         * instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * External resource is any OCI resource identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is
         * not a Stack Monitoring service resource. Currently supports only following resource types
         * - Container database, non-container database, pluggable database and OCI compute
         * instance.
         *
         * @param externalId the value to set
         * @return this builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }
        /**
         * Management Agent Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * Management Agent Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /** The current state of the monitored resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ResourceLifecycleState lifecycleState;

        /**
         * The current state of the monitored resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ResourceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** License edition of the monitored resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("license")
        private LicenseType license;

        /**
         * License edition of the monitored resource.
         *
         * @param license the value to set
         * @return this builder
         */
        public Builder license(LicenseType license) {
            this.license = license;
            this.__explicitlySet__.add("license");
            return this;
        }
        /**
         * Source type to indicate if the resource is stack monitoring discovered, OCI native
         * resource, etc.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        /**
         * Source type to indicate if the resource is stack monitoring discovered, OCI native
         * resource, etc.
         *
         * @param sourceType the value to set
         * @return this builder
         */
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /** Resource Category to indicate the kind of resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceCategory")
        private ResourceCategory resourceCategory;

        /**
         * Resource Category to indicate the kind of resource type.
         *
         * @param resourceCategory the value to set
         * @return this builder
         */
        public Builder resourceCategory(ResourceCategory resourceCategory) {
            this.resourceCategory = resourceCategory;
            this.__explicitlySet__.add("resourceCategory");
            return this;
        }
        /** List of associated monitored resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedResources")
        private java.util.List<AssociatedMonitoredResource> associatedResources;

        /**
         * List of associated monitored resources.
         *
         * @param associatedResources the value to set
         * @return this builder
         */
        public Builder associatedResources(
                java.util.List<AssociatedMonitoredResource> associatedResources) {
            this.associatedResources = associatedResources;
            this.__explicitlySet__.add("associatedResources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedResourcesSummary build() {
            AssociatedResourcesSummary model =
                    new AssociatedResourcesSummary(
                            this.id,
                            this.name,
                            this.displayName,
                            this.type,
                            this.compartmentId,
                            this.hostName,
                            this.externalId,
                            this.managementAgentId,
                            this.lifecycleState,
                            this.license,
                            this.sourceType,
                            this.resourceCategory,
                            this.associatedResources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedResourcesSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("externalId")) {
                this.externalId(model.getExternalId());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("license")) {
                this.license(model.getLicense());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceCategory")) {
                this.resourceCategory(model.getResourceCategory());
            }
            if (model.wasPropertyExplicitlySet("associatedResources")) {
                this.associatedResources(model.getAssociatedResources());
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
     * Monitored resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Monitored resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Monitored Resource Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Monitored Resource Name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Monitored resource display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Monitored resource display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Monitored Resource Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Monitored Resource Type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Monitored Resource Host Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Monitored Resource Host Name.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * External resource is any OCI resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is not a
     * Stack Monitoring service resource. Currently supports only following resource types -
     * Container database, non-container database, pluggable database and OCI compute instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * External resource is any OCI resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is not a
     * Stack Monitoring service resource. Currently supports only following resource types -
     * Container database, non-container database, pluggable database and OCI compute instance.
     *
     * @return the value
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Management Agent Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * Management Agent Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /** The current state of the monitored resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ResourceLifecycleState lifecycleState;

    /**
     * The current state of the monitored resource.
     *
     * @return the value
     */
    public ResourceLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** License edition of the monitored resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("license")
    private final LicenseType license;

    /**
     * License edition of the monitored resource.
     *
     * @return the value
     */
    public LicenseType getLicense() {
        return license;
    }

    /**
     * Source type to indicate if the resource is stack monitoring discovered, OCI native resource,
     * etc.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    /**
     * Source type to indicate if the resource is stack monitoring discovered, OCI native resource,
     * etc.
     *
     * @return the value
     */
    public SourceType getSourceType() {
        return sourceType;
    }

    /** Resource Category to indicate the kind of resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCategory")
    private final ResourceCategory resourceCategory;

    /**
     * Resource Category to indicate the kind of resource type.
     *
     * @return the value
     */
    public ResourceCategory getResourceCategory() {
        return resourceCategory;
    }

    /** List of associated monitored resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResources")
    private final java.util.List<AssociatedMonitoredResource> associatedResources;

    /**
     * List of associated monitored resources.
     *
     * @return the value
     */
    public java.util.List<AssociatedMonitoredResource> getAssociatedResources() {
        return associatedResources;
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
        sb.append("AssociatedResourcesSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", license=").append(String.valueOf(this.license));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", resourceCategory=").append(String.valueOf(this.resourceCategory));
        sb.append(", associatedResources=").append(String.valueOf(this.associatedResources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedResourcesSummary)) {
            return false;
        }

        AssociatedResourcesSummary other = (AssociatedResourcesSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.externalId, other.externalId)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.license, other.license)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.resourceCategory, other.resourceCategory)
                && java.util.Objects.equals(this.associatedResources, other.associatedResources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.license == null ? 43 : this.license.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCategory == null ? 43 : this.resourceCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResources == null
                                ? 43
                                : this.associatedResources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
