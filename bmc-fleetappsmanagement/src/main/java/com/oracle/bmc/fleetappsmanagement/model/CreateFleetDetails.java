/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The information about new Fleet. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateFleetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateFleetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "fleetType",
        "products",
        "applicationType",
        "environmentType",
        "groupType",
        "resourceSelectionType",
        "ruleSelectionCriteria",
        "notificationPreferences",
        "resources",
        "credentials",
        "isTargetAutoConfirm",
        "freeformTags",
        "definedTags"
    })
    public CreateFleetDetails(
            String displayName,
            String description,
            String compartmentId,
            Fleet.FleetType fleetType,
            java.util.List<String> products,
            String applicationType,
            String environmentType,
            Fleet.GroupType groupType,
            Fleet.ResourceSelectionType resourceSelectionType,
            SelectionCriteria ruleSelectionCriteria,
            NotificationPreferences notificationPreferences,
            java.util.List<AssociatedFleetResourceDetails> resources,
            java.util.List<AssociatedFleetCredentialDetails> credentials,
            Boolean isTargetAutoConfirm,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.fleetType = fleetType;
        this.products = products;
        this.applicationType = applicationType;
        this.environmentType = environmentType;
        this.groupType = groupType;
        this.resourceSelectionType = resourceSelectionType;
        this.ruleSelectionCriteria = ruleSelectionCriteria;
        this.notificationPreferences = notificationPreferences;
        this.resources = resources;
        this.credentials = credentials;
        this.isTargetAutoConfirm = isTargetAutoConfirm;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
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
         * A user-friendly description. To provide some insight about the resource. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. To provide some insight about the resource. Avoid entering
         * confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Tenancy OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Tenancy OCID
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
         * Type of the Fleet. PRODUCT - A fleet of product-specific resources for a product type.
         * ENVIRONMENT - A fleet of environment-specific resources for a product stack. GROUP - A
         * fleet of a fleet of either environment or product fleets. GENERIC - A fleet of resources
         * selected dynamically or manually for reporting purposes
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetType")
        private Fleet.FleetType fleetType;

        /**
         * Type of the Fleet. PRODUCT - A fleet of product-specific resources for a product type.
         * ENVIRONMENT - A fleet of environment-specific resources for a product stack. GROUP - A
         * fleet of a fleet of either environment or product fleets. GENERIC - A fleet of resources
         * selected dynamically or manually for reporting purposes
         *
         * @param fleetType the value to set
         * @return this builder
         */
        public Builder fleetType(Fleet.FleetType fleetType) {
            this.fleetType = fleetType;
            this.__explicitlySet__.add("fleetType");
            return this;
        }
        /** Products associated with the Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<String> products;

        /**
         * Products associated with the Fleet.
         *
         * @param products the value to set
         * @return this builder
         */
        public Builder products(java.util.List<String> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
            return this;
        }
        /** Product stack associated with the Fleet. Applicable for ENVIRONMENT fleet types. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private String applicationType;

        /**
         * Product stack associated with the Fleet. Applicable for ENVIRONMENT fleet types.
         *
         * @param applicationType the value to set
         * @return this builder
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            this.__explicitlySet__.add("applicationType");
            return this;
        }
        /** Environment Type associated with the Fleet. Applicable for ENVIRONMENT fleet types. */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
        private String environmentType;

        /**
         * Environment Type associated with the Fleet. Applicable for ENVIRONMENT fleet types.
         *
         * @param environmentType the value to set
         * @return this builder
         */
        public Builder environmentType(String environmentType) {
            this.environmentType = environmentType;
            this.__explicitlySet__.add("environmentType");
            return this;
        }
        /** Group Type associated with Group Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupType")
        private Fleet.GroupType groupType;

        /**
         * Group Type associated with Group Fleet.
         *
         * @param groupType the value to set
         * @return this builder
         */
        public Builder groupType(Fleet.GroupType groupType) {
            this.groupType = groupType;
            this.__explicitlySet__.add("groupType");
            return this;
        }
        /**
         * Type of resource selection in a Fleet. Select resources manually or select resources
         * based on rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceSelectionType")
        private Fleet.ResourceSelectionType resourceSelectionType;

        /**
         * Type of resource selection in a Fleet. Select resources manually or select resources
         * based on rules.
         *
         * @param resourceSelectionType the value to set
         * @return this builder
         */
        public Builder resourceSelectionType(Fleet.ResourceSelectionType resourceSelectionType) {
            this.resourceSelectionType = resourceSelectionType;
            this.__explicitlySet__.add("resourceSelectionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleSelectionCriteria")
        private SelectionCriteria ruleSelectionCriteria;

        public Builder ruleSelectionCriteria(SelectionCriteria ruleSelectionCriteria) {
            this.ruleSelectionCriteria = ruleSelectionCriteria;
            this.__explicitlySet__.add("ruleSelectionCriteria");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notificationPreferences")
        private NotificationPreferences notificationPreferences;

        public Builder notificationPreferences(NotificationPreferences notificationPreferences) {
            this.notificationPreferences = notificationPreferences;
            this.__explicitlySet__.add("notificationPreferences");
            return this;
        }
        /** Resources associated with the Fleet if resourceSelectionType is MANUAL. */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<AssociatedFleetResourceDetails> resources;

        /**
         * Resources associated with the Fleet if resourceSelectionType is MANUAL.
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<AssociatedFleetResourceDetails> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /** Credentials associated with the Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private java.util.List<AssociatedFleetCredentialDetails> credentials;

        /**
         * Credentials associated with the Fleet.
         *
         * @param credentials the value to set
         * @return this builder
         */
        public Builder credentials(java.util.List<AssociatedFleetCredentialDetails> credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }
        /**
         * A value that represents if auto-confirming of the targets can be enabled. This will allow
         * targets to be auto-confirmed in the fleet without manual intervention.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isTargetAutoConfirm")
        private Boolean isTargetAutoConfirm;

        /**
         * A value that represents if auto-confirming of the targets can be enabled. This will allow
         * targets to be auto-confirmed in the fleet without manual intervention.
         *
         * @param isTargetAutoConfirm the value to set
         * @return this builder
         */
        public Builder isTargetAutoConfirm(Boolean isTargetAutoConfirm) {
            this.isTargetAutoConfirm = isTargetAutoConfirm;
            this.__explicitlySet__.add("isTargetAutoConfirm");
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

        public CreateFleetDetails build() {
            CreateFleetDetails model =
                    new CreateFleetDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.fleetType,
                            this.products,
                            this.applicationType,
                            this.environmentType,
                            this.groupType,
                            this.resourceSelectionType,
                            this.ruleSelectionCriteria,
                            this.notificationPreferences,
                            this.resources,
                            this.credentials,
                            this.isTargetAutoConfirm,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFleetDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("fleetType")) {
                this.fleetType(model.getFleetType());
            }
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
            }
            if (model.wasPropertyExplicitlySet("applicationType")) {
                this.applicationType(model.getApplicationType());
            }
            if (model.wasPropertyExplicitlySet("environmentType")) {
                this.environmentType(model.getEnvironmentType());
            }
            if (model.wasPropertyExplicitlySet("groupType")) {
                this.groupType(model.getGroupType());
            }
            if (model.wasPropertyExplicitlySet("resourceSelectionType")) {
                this.resourceSelectionType(model.getResourceSelectionType());
            }
            if (model.wasPropertyExplicitlySet("ruleSelectionCriteria")) {
                this.ruleSelectionCriteria(model.getRuleSelectionCriteria());
            }
            if (model.wasPropertyExplicitlySet("notificationPreferences")) {
                this.notificationPreferences(model.getNotificationPreferences());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("isTargetAutoConfirm")) {
                this.isTargetAutoConfirm(model.getIsTargetAutoConfirm());
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user-friendly description. To provide some insight about the resource. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. To provide some insight about the resource. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Tenancy OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Tenancy OCID
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Type of the Fleet. PRODUCT - A fleet of product-specific resources for a product type.
     * ENVIRONMENT - A fleet of environment-specific resources for a product stack. GROUP - A fleet
     * of a fleet of either environment or product fleets. GENERIC - A fleet of resources selected
     * dynamically or manually for reporting purposes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetType")
    private final Fleet.FleetType fleetType;

    /**
     * Type of the Fleet. PRODUCT - A fleet of product-specific resources for a product type.
     * ENVIRONMENT - A fleet of environment-specific resources for a product stack. GROUP - A fleet
     * of a fleet of either environment or product fleets. GENERIC - A fleet of resources selected
     * dynamically or manually for reporting purposes
     *
     * @return the value
     */
    public Fleet.FleetType getFleetType() {
        return fleetType;
    }

    /** Products associated with the Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<String> products;

    /**
     * Products associated with the Fleet.
     *
     * @return the value
     */
    public java.util.List<String> getProducts() {
        return products;
    }

    /** Product stack associated with the Fleet. Applicable for ENVIRONMENT fleet types. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    private final String applicationType;

    /**
     * Product stack associated with the Fleet. Applicable for ENVIRONMENT fleet types.
     *
     * @return the value
     */
    public String getApplicationType() {
        return applicationType;
    }

    /** Environment Type associated with the Fleet. Applicable for ENVIRONMENT fleet types. */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
    private final String environmentType;

    /**
     * Environment Type associated with the Fleet. Applicable for ENVIRONMENT fleet types.
     *
     * @return the value
     */
    public String getEnvironmentType() {
        return environmentType;
    }

    /** Group Type associated with Group Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupType")
    private final Fleet.GroupType groupType;

    /**
     * Group Type associated with Group Fleet.
     *
     * @return the value
     */
    public Fleet.GroupType getGroupType() {
        return groupType;
    }

    /**
     * Type of resource selection in a Fleet. Select resources manually or select resources based on
     * rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceSelectionType")
    private final Fleet.ResourceSelectionType resourceSelectionType;

    /**
     * Type of resource selection in a Fleet. Select resources manually or select resources based on
     * rules.
     *
     * @return the value
     */
    public Fleet.ResourceSelectionType getResourceSelectionType() {
        return resourceSelectionType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ruleSelectionCriteria")
    private final SelectionCriteria ruleSelectionCriteria;

    public SelectionCriteria getRuleSelectionCriteria() {
        return ruleSelectionCriteria;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("notificationPreferences")
    private final NotificationPreferences notificationPreferences;

    public NotificationPreferences getNotificationPreferences() {
        return notificationPreferences;
    }

    /** Resources associated with the Fleet if resourceSelectionType is MANUAL. */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<AssociatedFleetResourceDetails> resources;

    /**
     * Resources associated with the Fleet if resourceSelectionType is MANUAL.
     *
     * @return the value
     */
    public java.util.List<AssociatedFleetResourceDetails> getResources() {
        return resources;
    }

    /** Credentials associated with the Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final java.util.List<AssociatedFleetCredentialDetails> credentials;

    /**
     * Credentials associated with the Fleet.
     *
     * @return the value
     */
    public java.util.List<AssociatedFleetCredentialDetails> getCredentials() {
        return credentials;
    }

    /**
     * A value that represents if auto-confirming of the targets can be enabled. This will allow
     * targets to be auto-confirmed in the fleet without manual intervention.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isTargetAutoConfirm")
    private final Boolean isTargetAutoConfirm;

    /**
     * A value that represents if auto-confirming of the targets can be enabled. This will allow
     * targets to be auto-confirmed in the fleet without manual intervention.
     *
     * @return the value
     */
    public Boolean getIsTargetAutoConfirm() {
        return isTargetAutoConfirm;
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
        sb.append("CreateFleetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", fleetType=").append(String.valueOf(this.fleetType));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(", applicationType=").append(String.valueOf(this.applicationType));
        sb.append(", environmentType=").append(String.valueOf(this.environmentType));
        sb.append(", groupType=").append(String.valueOf(this.groupType));
        sb.append(", resourceSelectionType=").append(String.valueOf(this.resourceSelectionType));
        sb.append(", ruleSelectionCriteria=").append(String.valueOf(this.ruleSelectionCriteria));
        sb.append(", notificationPreferences=")
                .append(String.valueOf(this.notificationPreferences));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", isTargetAutoConfirm=").append(String.valueOf(this.isTargetAutoConfirm));
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
        if (!(o instanceof CreateFleetDetails)) {
            return false;
        }

        CreateFleetDetails other = (CreateFleetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fleetType, other.fleetType)
                && java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(this.environmentType, other.environmentType)
                && java.util.Objects.equals(this.groupType, other.groupType)
                && java.util.Objects.equals(this.resourceSelectionType, other.resourceSelectionType)
                && java.util.Objects.equals(this.ruleSelectionCriteria, other.ruleSelectionCriteria)
                && java.util.Objects.equals(
                        this.notificationPreferences, other.notificationPreferences)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.isTargetAutoConfirm, other.isTargetAutoConfirm)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.fleetType == null ? 43 : this.fleetType.hashCode());
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationType == null ? 43 : this.applicationType.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result = (result * PRIME) + (this.groupType == null ? 43 : this.groupType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceSelectionType == null
                                ? 43
                                : this.resourceSelectionType.hashCode());
        result =
                (result * PRIME)
                        + (this.ruleSelectionCriteria == null
                                ? 43
                                : this.ruleSelectionCriteria.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationPreferences == null
                                ? 43
                                : this.notificationPreferences.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result =
                (result * PRIME)
                        + (this.isTargetAutoConfirm == null
                                ? 43
                                : this.isTargetAutoConfirm.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
