/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Request to create cloud Exadata infrastructure. Applies to Exadata Cloud Service instances only.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCloudExadataInfrastructureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCloudExadataInfrastructureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "displayName",
        "shape",
        "computeCount",
        "storageCount",
        "maintenanceWindow",
        "freeformTags",
        "definedTags",
        "clusterPlacementGroupId",
        "subscriptionId",
        "customerContacts",
        "databaseServerType",
        "storageServerType"
    })
    public CreateCloudExadataInfrastructureDetails(
            String availabilityDomain,
            String compartmentId,
            String displayName,
            String shape,
            Integer computeCount,
            Integer storageCount,
            MaintenanceWindow maintenanceWindow,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String clusterPlacementGroupId,
            String subscriptionId,
            java.util.List<CustomerContact> customerContacts,
            String databaseServerType,
            String storageServerType) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.shape = shape;
        this.computeCount = computeCount;
        this.storageCount = storageCount;
        this.maintenanceWindow = maintenanceWindow;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.subscriptionId = subscriptionId;
        this.customerContacts = customerContacts;
        this.databaseServerType = databaseServerType;
        this.storageServerType = storageServerType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The availability domain where the cloud Exadata infrastructure is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain where the cloud Exadata infrastructure is located.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
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
         * The user-friendly name for the cloud Exadata infrastructure resource. The name does not
         * need to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud Exadata infrastructure resource. The name does not
         * need to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The shape of the cloud Exadata infrastructure resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the cloud Exadata infrastructure resource.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The number of compute servers for the cloud Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Integer computeCount;

        /**
         * The number of compute servers for the cloud Exadata infrastructure.
         *
         * @param computeCount the value to set
         * @return this builder
         */
        public Builder computeCount(Integer computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /** The number of storage servers for the cloud Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
        private Integer storageCount;

        /**
         * The number of storage servers for the cloud Exadata infrastructure.
         *
         * @param storageCount the value to set
         * @return this builder
         */
        public Builder storageCount(Integer storageCount) {
            this.storageCount = storageCount;
            this.__explicitlySet__.add("storageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group of the Exadata Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group of the Exadata Infrastructure.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** Customer contacts. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        /**
         * Customer contacts.
         *
         * @param customerContacts the value to set
         * @return this builder
         */
        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }
        /** The database server type of the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseServerType")
        private String databaseServerType;

        /**
         * The database server type of the Exadata infrastructure.
         *
         * @param databaseServerType the value to set
         * @return this builder
         */
        public Builder databaseServerType(String databaseServerType) {
            this.databaseServerType = databaseServerType;
            this.__explicitlySet__.add("databaseServerType");
            return this;
        }
        /** The storage server type of the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerType")
        private String storageServerType;

        /**
         * The storage server type of the Exadata infrastructure.
         *
         * @param storageServerType the value to set
         * @return this builder
         */
        public Builder storageServerType(String storageServerType) {
            this.storageServerType = storageServerType;
            this.__explicitlySet__.add("storageServerType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCloudExadataInfrastructureDetails build() {
            CreateCloudExadataInfrastructureDetails model =
                    new CreateCloudExadataInfrastructureDetails(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.displayName,
                            this.shape,
                            this.computeCount,
                            this.storageCount,
                            this.maintenanceWindow,
                            this.freeformTags,
                            this.definedTags,
                            this.clusterPlacementGroupId,
                            this.subscriptionId,
                            this.customerContacts,
                            this.databaseServerType,
                            this.storageServerType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCloudExadataInfrastructureDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("storageCount")) {
                this.storageCount(model.getStorageCount());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("customerContacts")) {
                this.customerContacts(model.getCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("databaseServerType")) {
                this.databaseServerType(model.getDatabaseServerType());
            }
            if (model.wasPropertyExplicitlySet("storageServerType")) {
                this.storageServerType(model.getStorageServerType());
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

    /** The availability domain where the cloud Exadata infrastructure is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain where the cloud Exadata infrastructure is located.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need
     * to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need
     * to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The shape of the cloud Exadata infrastructure resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the cloud Exadata infrastructure resource.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The number of compute servers for the cloud Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Integer computeCount;

    /**
     * The number of compute servers for the cloud Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getComputeCount() {
        return computeCount;
    }

    /** The number of storage servers for the cloud Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
    private final Integer storageCount;

    /**
     * The number of storage servers for the cloud Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getStorageCount() {
        return storageCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group of the Exadata Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group of the Exadata Infrastructure.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** Customer contacts. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * Customer contacts.
     *
     * @return the value
     */
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    /** The database server type of the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseServerType")
    private final String databaseServerType;

    /**
     * The database server type of the Exadata infrastructure.
     *
     * @return the value
     */
    public String getDatabaseServerType() {
        return databaseServerType;
    }

    /** The storage server type of the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerType")
    private final String storageServerType;

    /**
     * The storage server type of the Exadata infrastructure.
     *
     * @return the value
     */
    public String getStorageServerType() {
        return storageServerType;
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
        sb.append("CreateCloudExadataInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", storageCount=").append(String.valueOf(this.storageCount));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", databaseServerType=").append(String.valueOf(this.databaseServerType));
        sb.append(", storageServerType=").append(String.valueOf(this.storageServerType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCloudExadataInfrastructureDetails)) {
            return false;
        }

        CreateCloudExadataInfrastructureDetails other = (CreateCloudExadataInfrastructureDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.storageCount, other.storageCount)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(this.databaseServerType, other.databaseServerType)
                && java.util.Objects.equals(this.storageServerType, other.storageServerType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result = (result * PRIME) + (this.storageCount == null ? 43 : this.storageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseServerType == null
                                ? 43
                                : this.databaseServerType.hashCode());
        result =
                (result * PRIME)
                        + (this.storageServerType == null ? 43 : this.storageServerType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
