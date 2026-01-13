/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
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
        "details",
        "products",
        "environmentType",
        "resourceSelection",
        "notificationPreferences",
        "resources",
        "credentials",
        "properties",
        "parentFleetId",
        "isTargetAutoConfirm",
        "freeformTags",
        "definedTags"
    })
    public CreateFleetDetails(
            String displayName,
            String description,
            String compartmentId,
            FleetDetails details,
            java.util.List<String> products,
            String environmentType,
            ResourceSelection resourceSelection,
            java.util.List<NotificationPreference> notificationPreferences,
            java.util.List<AssociatedFleetResourceDetails> resources,
            java.util.List<AssociatedFleetCredentialDetails> credentials,
            java.util.List<AssociatedFleetPropertyDetails> properties,
            String parentFleetId,
            Boolean isTargetAutoConfirm,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.details = details;
        this.products = products;
        this.environmentType = environmentType;
        this.resourceSelection = resourceSelection;
        this.notificationPreferences = notificationPreferences;
        this.resources = resources;
        this.credentials = credentials;
        this.properties = properties;
        this.parentFleetId = parentFleetId;
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
        /** compartment OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * compartment OCID
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private FleetDetails details;

        public Builder details(FleetDetails details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /**
         * Products associated with the Fleet. Provide PlatformConfiguration Ids corresponding to
         * all the Products that need to be managed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<String> products;

        /**
         * Products associated with the Fleet. Provide PlatformConfiguration Ids corresponding to
         * all the Products that need to be managed.
         *
         * @param products the value to set
         * @return this builder
         */
        public Builder products(java.util.List<String> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
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

        @com.fasterxml.jackson.annotation.JsonProperty("resourceSelection")
        private ResourceSelection resourceSelection;

        public Builder resourceSelection(ResourceSelection resourceSelection) {
            this.resourceSelection = resourceSelection;
            this.__explicitlySet__.add("resourceSelection");
            return this;
        }
        /** Notification Preferences associated with the Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationPreferences")
        private java.util.List<NotificationPreference> notificationPreferences;

        /**
         * Notification Preferences associated with the Fleet.
         *
         * @param notificationPreferences the value to set
         * @return this builder
         */
        public Builder notificationPreferences(
                java.util.List<NotificationPreference> notificationPreferences) {
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
        /** Properties associated with the Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<AssociatedFleetPropertyDetails> properties;

        /**
         * Properties associated with the Fleet.
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.List<AssociatedFleetPropertyDetails> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * fleet that would be the parent for this fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parentFleetId")
        private String parentFleetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * fleet that would be the parent for this fleet.
         *
         * @param parentFleetId the value to set
         * @return this builder
         */
        public Builder parentFleetId(String parentFleetId) {
            this.parentFleetId = parentFleetId;
            this.__explicitlySet__.add("parentFleetId");
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
                            this.details,
                            this.products,
                            this.environmentType,
                            this.resourceSelection,
                            this.notificationPreferences,
                            this.resources,
                            this.credentials,
                            this.properties,
                            this.parentFleetId,
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
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
            }
            if (model.wasPropertyExplicitlySet("environmentType")) {
                this.environmentType(model.getEnvironmentType());
            }
            if (model.wasPropertyExplicitlySet("resourceSelection")) {
                this.resourceSelection(model.getResourceSelection());
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
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("parentFleetId")) {
                this.parentFleetId(model.getParentFleetId());
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

    /** compartment OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * compartment OCID
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final FleetDetails details;

    public FleetDetails getDetails() {
        return details;
    }

    /**
     * Products associated with the Fleet. Provide PlatformConfiguration Ids corresponding to all
     * the Products that need to be managed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<String> products;

    /**
     * Products associated with the Fleet. Provide PlatformConfiguration Ids corresponding to all
     * the Products that need to be managed.
     *
     * @return the value
     */
    public java.util.List<String> getProducts() {
        return products;
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

    @com.fasterxml.jackson.annotation.JsonProperty("resourceSelection")
    private final ResourceSelection resourceSelection;

    public ResourceSelection getResourceSelection() {
        return resourceSelection;
    }

    /** Notification Preferences associated with the Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationPreferences")
    private final java.util.List<NotificationPreference> notificationPreferences;

    /**
     * Notification Preferences associated with the Fleet.
     *
     * @return the value
     */
    public java.util.List<NotificationPreference> getNotificationPreferences() {
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

    /** Properties associated with the Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<AssociatedFleetPropertyDetails> properties;

    /**
     * Properties associated with the Fleet.
     *
     * @return the value
     */
    public java.util.List<AssociatedFleetPropertyDetails> getProperties() {
        return properties;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * fleet that would be the parent for this fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parentFleetId")
    private final String parentFleetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * fleet that would be the parent for this fleet.
     *
     * @return the value
     */
    public String getParentFleetId() {
        return parentFleetId;
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
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(", environmentType=").append(String.valueOf(this.environmentType));
        sb.append(", resourceSelection=").append(String.valueOf(this.resourceSelection));
        sb.append(", notificationPreferences=")
                .append(String.valueOf(this.notificationPreferences));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", parentFleetId=").append(String.valueOf(this.parentFleetId));
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
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(this.environmentType, other.environmentType)
                && java.util.Objects.equals(this.resourceSelection, other.resourceSelection)
                && java.util.Objects.equals(
                        this.notificationPreferences, other.notificationPreferences)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.parentFleetId, other.parentFleetId)
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
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceSelection == null ? 43 : this.resourceSelection.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationPreferences == null
                                ? 43
                                : this.notificationPreferences.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.parentFleetId == null ? 43 : this.parentFleetId.hashCode());
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
