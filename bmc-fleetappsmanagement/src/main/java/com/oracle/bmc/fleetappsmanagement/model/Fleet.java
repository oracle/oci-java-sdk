/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * A fleet is a collection or grouping of resources based on criteria. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Fleet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Fleet extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "resourceRegion",
        "displayName",
        "description",
        "timeCreated",
        "timeUpdated",
        "fleetType",
        "products",
        "applicationType",
        "environmentType",
        "groupType",
        "resourceSelectionType",
        "ruleSelectionCriteria",
        "notificationPreferences",
        "resources",
        "properties",
        "credentials",
        "isTargetAutoConfirm",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Fleet(
            String id,
            String compartmentId,
            String resourceRegion,
            String displayName,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            FleetType fleetType,
            java.util.List<String> products,
            String applicationType,
            String environmentType,
            GroupType groupType,
            ResourceSelectionType resourceSelectionType,
            SelectionCriteria ruleSelectionCriteria,
            NotificationPreferences notificationPreferences,
            java.util.List<AssociatedFleetResourceDetails> resources,
            java.util.List<AssociatedFleetPropertyDetails> properties,
            java.util.List<AssociatedFleetCredentialDetails> credentials,
            Boolean isTargetAutoConfirm,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.resourceRegion = resourceRegion;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.fleetType = fleetType;
        this.products = products;
        this.applicationType = applicationType;
        this.environmentType = environmentType;
        this.groupType = groupType;
        this.resourceSelectionType = resourceSelectionType;
        this.ruleSelectionCriteria = ruleSelectionCriteria;
        this.notificationPreferences = notificationPreferences;
        this.resources = resources;
        this.properties = properties;
        this.credentials = credentials;
        this.isTargetAutoConfirm = isTargetAutoConfirm;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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
        /** Associated region */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceRegion")
        private String resourceRegion;

        /**
         * Associated region
         *
         * @param resourceRegion the value to set
         * @return this builder
         */
        public Builder resourceRegion(String resourceRegion) {
            this.resourceRegion = resourceRegion;
            this.__explicitlySet__.add("resourceRegion");
            return this;
        }
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
        /** The time this resource was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time this resource was last updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time this resource was last updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Type of the Fleet. PRODUCT - A fleet of product-specific resources for a product type.
         * ENVIRONMENT - A fleet of environment-specific resources for a product stack. GROUP - A
         * fleet of a fleet of either environment or product fleets. GENERIC - A fleet of resources
         * selected dynamically or manually for reporting purposes
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetType")
        private FleetType fleetType;

        /**
         * Type of the Fleet. PRODUCT - A fleet of product-specific resources for a product type.
         * ENVIRONMENT - A fleet of environment-specific resources for a product stack. GROUP - A
         * fleet of a fleet of either environment or product fleets. GENERIC - A fleet of resources
         * selected dynamically or manually for reporting purposes
         *
         * @param fleetType the value to set
         * @return this builder
         */
        public Builder fleetType(FleetType fleetType) {
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
        /** Group Type associated with Group Fleet. Applicable for GROUP fleet types. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupType")
        private GroupType groupType;

        /**
         * Group Type associated with Group Fleet. Applicable for GROUP fleet types.
         *
         * @param groupType the value to set
         * @return this builder
         */
        public Builder groupType(GroupType groupType) {
            this.groupType = groupType;
            this.__explicitlySet__.add("groupType");
            return this;
        }
        /**
         * Type of resource selection in a Fleet. Select resources manually or select resources
         * based on rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceSelectionType")
        private ResourceSelectionType resourceSelectionType;

        /**
         * Type of resource selection in a Fleet. Select resources manually or select resources
         * based on rules.
         *
         * @param resourceSelectionType the value to set
         * @return this builder
         */
        public Builder resourceSelectionType(ResourceSelectionType resourceSelectionType) {
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
        /** The lifecycle state of the Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The lifecycle state of the Fleet.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Fleet build() {
            Fleet model =
                    new Fleet(
                            this.id,
                            this.compartmentId,
                            this.resourceRegion,
                            this.displayName,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.fleetType,
                            this.products,
                            this.applicationType,
                            this.environmentType,
                            this.groupType,
                            this.resourceSelectionType,
                            this.ruleSelectionCriteria,
                            this.notificationPreferences,
                            this.resources,
                            this.properties,
                            this.credentials,
                            this.isTargetAutoConfirm,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Fleet model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceRegion")) {
                this.resourceRegion(model.getResourceRegion());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("isTargetAutoConfirm")) {
                this.isTargetAutoConfirm(model.getIsTargetAutoConfirm());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** Associated region */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceRegion")
    private final String resourceRegion;

    /**
     * Associated region
     *
     * @return the value
     */
    public String getResourceRegion() {
        return resourceRegion;
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

    /** The time this resource was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time this resource was last updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time this resource was last updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Type of the Fleet. PRODUCT - A fleet of product-specific resources for a product type.
     * ENVIRONMENT - A fleet of environment-specific resources for a product stack. GROUP - A fleet
     * of a fleet of either environment or product fleets. GENERIC - A fleet of resources selected
     * dynamically or manually for reporting purposes
     */
    public enum FleetType implements com.oracle.bmc.http.internal.BmcEnum {
        Product("PRODUCT"),
        Environment("ENVIRONMENT"),
        Generic("GENERIC"),
        Group("GROUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FleetType.class);

        private final String value;
        private static java.util.Map<String, FleetType> map;

        static {
            map = new java.util.HashMap<>();
            for (FleetType v : FleetType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FleetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FleetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FleetType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of the Fleet. PRODUCT - A fleet of product-specific resources for a product type.
     * ENVIRONMENT - A fleet of environment-specific resources for a product stack. GROUP - A fleet
     * of a fleet of either environment or product fleets. GENERIC - A fleet of resources selected
     * dynamically or manually for reporting purposes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetType")
    private final FleetType fleetType;

    /**
     * Type of the Fleet. PRODUCT - A fleet of product-specific resources for a product type.
     * ENVIRONMENT - A fleet of environment-specific resources for a product stack. GROUP - A fleet
     * of a fleet of either environment or product fleets. GENERIC - A fleet of resources selected
     * dynamically or manually for reporting purposes
     *
     * @return the value
     */
    public FleetType getFleetType() {
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

    /** Group Type associated with Group Fleet. Applicable for GROUP fleet types. */
    public enum GroupType implements com.oracle.bmc.http.internal.BmcEnum {
        Environment("ENVIRONMENT"),
        Product("PRODUCT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GroupType.class);

        private final String value;
        private static java.util.Map<String, GroupType> map;

        static {
            map = new java.util.HashMap<>();
            for (GroupType v : GroupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GroupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GroupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GroupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Group Type associated with Group Fleet. Applicable for GROUP fleet types. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupType")
    private final GroupType groupType;

    /**
     * Group Type associated with Group Fleet. Applicable for GROUP fleet types.
     *
     * @return the value
     */
    public GroupType getGroupType() {
        return groupType;
    }

    /**
     * Type of resource selection in a Fleet. Select resources manually or select resources based on
     * rules.
     */
    public enum ResourceSelectionType implements com.oracle.bmc.http.internal.BmcEnum {
        Dynamic("DYNAMIC"),
        Manual("MANUAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceSelectionType.class);

        private final String value;
        private static java.util.Map<String, ResourceSelectionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceSelectionType v : ResourceSelectionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceSelectionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceSelectionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceSelectionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of resource selection in a Fleet. Select resources manually or select resources based on
     * rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceSelectionType")
    private final ResourceSelectionType resourceSelectionType;

    /**
     * Type of resource selection in a Fleet. Select resources manually or select resources based on
     * rules.
     *
     * @return the value
     */
    public ResourceSelectionType getResourceSelectionType() {
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

    /** The lifecycle state of the Fleet. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),
        Failed("FAILED"),
        Updating("UPDATING"),
        NeedsAttention("NEEDS_ATTENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The lifecycle state of the Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycle state of the Fleet.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Fleet(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceRegion=").append(String.valueOf(this.resourceRegion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", isTargetAutoConfirm=").append(String.valueOf(this.isTargetAutoConfirm));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof Fleet)) {
            return false;
        }

        Fleet other = (Fleet) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceRegion, other.resourceRegion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.isTargetAutoConfirm, other.isTargetAutoConfirm)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceRegion == null ? 43 : this.resourceRegion.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result =
                (result * PRIME)
                        + (this.isTargetAutoConfirm == null
                                ? 43
                                : this.isTargetAutoConfirm.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
