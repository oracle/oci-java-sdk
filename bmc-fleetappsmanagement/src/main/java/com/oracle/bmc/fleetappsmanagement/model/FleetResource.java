/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Resource added to a fleet in Fleet Application Management. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FleetResource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FleetResource extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "tenancyId",
        "resourceRegion",
        "timeCreated",
        "timeUpdated",
        "compartmentId",
        "displayName",
        "resourceId",
        "compartment",
        "complianceState",
        "tenancyName",
        "resourceType",
        "productCount",
        "targetCount",
        "product",
        "applicationType",
        "environmentType",
        "lifecycleState",
        "lifecycleDetails",
        "systemTags"
    })
    public FleetResource(
            String id,
            String tenancyId,
            String resourceRegion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String compartmentId,
            String displayName,
            String resourceId,
            String compartment,
            ComplianceState complianceState,
            String tenancyName,
            String resourceType,
            Integer productCount,
            Integer targetCount,
            String product,
            String applicationType,
            String environmentType,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.tenancyId = tenancyId;
        this.resourceRegion = resourceRegion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.resourceId = resourceId;
        this.compartment = compartment;
        this.complianceState = complianceState;
        this.tenancyName = tenancyName;
        this.resourceType = resourceType;
        this.productCount = productCount;
        this.targetCount = targetCount;
        this.product = product;
        this.applicationType = applicationType;
        this.environmentType = environmentType;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique id of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique id of the resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OCID of the tenancy to which the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * OCID of the tenancy to which the resource belongs to.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
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
        /** OCID of the compartment to which the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment to which the resource belongs to.
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
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Resource Compartment name. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartment")
        private String compartment;

        /**
         * Resource Compartment name.
         *
         * @param compartment the value to set
         * @return this builder
         */
        public Builder compartment(String compartment) {
            this.compartment = compartment;
            this.__explicitlySet__.add("compartment");
            return this;
        }
        /** Compliance State of the Resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
        private ComplianceState complianceState;

        /**
         * Compliance State of the Resource.
         *
         * @param complianceState the value to set
         * @return this builder
         */
        public Builder complianceState(ComplianceState complianceState) {
            this.complianceState = complianceState;
            this.__explicitlySet__.add("complianceState");
            return this;
        }
        /** Resource Tenancy Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
        private String tenancyName;

        /**
         * Resource Tenancy Name.
         *
         * @param tenancyName the value to set
         * @return this builder
         */
        public Builder tenancyName(String tenancyName) {
            this.tenancyName = tenancyName;
            this.__explicitlySet__.add("tenancyName");
            return this;
        }
        /** Type of the Resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Type of the Resource.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** Count of products within the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("productCount")
        private Integer productCount;

        /**
         * Count of products within the resource.
         *
         * @param productCount the value to set
         * @return this builder
         */
        public Builder productCount(Integer productCount) {
            this.productCount = productCount;
            this.__explicitlySet__.add("productCount");
            return this;
        }
        /** Count of targets within the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetCount")
        private Integer targetCount;

        /**
         * Count of targets within the resource.
         *
         * @param targetCount the value to set
         * @return this builder
         */
        public Builder targetCount(Integer targetCount) {
            this.targetCount = targetCount;
            this.__explicitlySet__.add("targetCount");
            return this;
        }
        /**
         * Product associated with the resource when the resource type is fleet. Will only be
         * returned for PRODUCT fleets that are part of a GROUP Fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private String product;

        /**
         * Product associated with the resource when the resource type is fleet. Will only be
         * returned for PRODUCT fleets that are part of a GROUP Fleet.
         *
         * @param product the value to set
         * @return this builder
         */
        public Builder product(String product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /**
         * Application Type associated with the resource when the resource type is fleet. Will only
         * be returned for ENVIRONMENT fleets that are part of a GROUP Fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private String applicationType;

        /**
         * Application Type associated with the resource when the resource type is fleet. Will only
         * be returned for ENVIRONMENT fleets that are part of a GROUP Fleet.
         *
         * @param applicationType the value to set
         * @return this builder
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            this.__explicitlySet__.add("applicationType");
            return this;
        }
        /**
         * Environment Type associated with the Fleet when the resource type is fleet. Will only be
         * returned for ENVIRONMENT fleets that are part of a GROUP Fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
        private String environmentType;

        /**
         * Environment Type associated with the Fleet when the resource type is fleet. Will only be
         * returned for ENVIRONMENT fleets that are part of a GROUP Fleet.
         *
         * @param environmentType the value to set
         * @return this builder
         */
        public Builder environmentType(String environmentType) {
            this.environmentType = environmentType;
            this.__explicitlySet__.add("environmentType");
            return this;
        }
        /** The current state of the FleetResource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the FleetResource.
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

        public FleetResource build() {
            FleetResource model =
                    new FleetResource(
                            this.id,
                            this.tenancyId,
                            this.resourceRegion,
                            this.timeCreated,
                            this.timeUpdated,
                            this.compartmentId,
                            this.displayName,
                            this.resourceId,
                            this.compartment,
                            this.complianceState,
                            this.tenancyName,
                            this.resourceType,
                            this.productCount,
                            this.targetCount,
                            this.product,
                            this.applicationType,
                            this.environmentType,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetResource model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("resourceRegion")) {
                this.resourceRegion(model.getResourceRegion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("compartment")) {
                this.compartment(model.getCompartment());
            }
            if (model.wasPropertyExplicitlySet("complianceState")) {
                this.complianceState(model.getComplianceState());
            }
            if (model.wasPropertyExplicitlySet("tenancyName")) {
                this.tenancyName(model.getTenancyName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("productCount")) {
                this.productCount(model.getProductCount());
            }
            if (model.wasPropertyExplicitlySet("targetCount")) {
                this.targetCount(model.getTargetCount());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("applicationType")) {
                this.applicationType(model.getApplicationType());
            }
            if (model.wasPropertyExplicitlySet("environmentType")) {
                this.environmentType(model.getEnvironmentType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** The unique id of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique id of the resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OCID of the tenancy to which the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * OCID of the tenancy to which the resource belongs to.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
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

    /** OCID of the compartment to which the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment to which the resource belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Resource Compartment name. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartment")
    private final String compartment;

    /**
     * Resource Compartment name.
     *
     * @return the value
     */
    public String getCompartment() {
        return compartment;
    }

    /** Compliance State of the Resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
    private final ComplianceState complianceState;

    /**
     * Compliance State of the Resource.
     *
     * @return the value
     */
    public ComplianceState getComplianceState() {
        return complianceState;
    }

    /** Resource Tenancy Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
    private final String tenancyName;

    /**
     * Resource Tenancy Name.
     *
     * @return the value
     */
    public String getTenancyName() {
        return tenancyName;
    }

    /** Type of the Resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Type of the Resource.
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** Count of products within the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("productCount")
    private final Integer productCount;

    /**
     * Count of products within the resource.
     *
     * @return the value
     */
    public Integer getProductCount() {
        return productCount;
    }

    /** Count of targets within the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCount")
    private final Integer targetCount;

    /**
     * Count of targets within the resource.
     *
     * @return the value
     */
    public Integer getTargetCount() {
        return targetCount;
    }

    /**
     * Product associated with the resource when the resource type is fleet. Will only be returned
     * for PRODUCT fleets that are part of a GROUP Fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final String product;

    /**
     * Product associated with the resource when the resource type is fleet. Will only be returned
     * for PRODUCT fleets that are part of a GROUP Fleet.
     *
     * @return the value
     */
    public String getProduct() {
        return product;
    }

    /**
     * Application Type associated with the resource when the resource type is fleet. Will only be
     * returned for ENVIRONMENT fleets that are part of a GROUP Fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    private final String applicationType;

    /**
     * Application Type associated with the resource when the resource type is fleet. Will only be
     * returned for ENVIRONMENT fleets that are part of a GROUP Fleet.
     *
     * @return the value
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Environment Type associated with the Fleet when the resource type is fleet. Will only be
     * returned for ENVIRONMENT fleets that are part of a GROUP Fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
    private final String environmentType;

    /**
     * Environment Type associated with the Fleet when the resource type is fleet. Will only be
     * returned for ENVIRONMENT fleets that are part of a GROUP Fleet.
     *
     * @return the value
     */
    public String getEnvironmentType() {
        return environmentType;
    }

    /** The current state of the FleetResource. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Deleted("DELETED"),
        Failed("FAILED"),
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
    /** The current state of the FleetResource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the FleetResource.
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
        sb.append("FleetResource(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", resourceRegion=").append(String.valueOf(this.resourceRegion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", compartment=").append(String.valueOf(this.compartment));
        sb.append(", complianceState=").append(String.valueOf(this.complianceState));
        sb.append(", tenancyName=").append(String.valueOf(this.tenancyName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", productCount=").append(String.valueOf(this.productCount));
        sb.append(", targetCount=").append(String.valueOf(this.targetCount));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", applicationType=").append(String.valueOf(this.applicationType));
        sb.append(", environmentType=").append(String.valueOf(this.environmentType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetResource)) {
            return false;
        }

        FleetResource other = (FleetResource) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.resourceRegion, other.resourceRegion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.compartment, other.compartment)
                && java.util.Objects.equals(this.complianceState, other.complianceState)
                && java.util.Objects.equals(this.tenancyName, other.tenancyName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.productCount, other.productCount)
                && java.util.Objects.equals(this.targetCount, other.targetCount)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(this.environmentType, other.environmentType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceRegion == null ? 43 : this.resourceRegion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.compartment == null ? 43 : this.compartment.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceState == null ? 43 : this.complianceState.hashCode());
        result = (result * PRIME) + (this.tenancyName == null ? 43 : this.tenancyName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.productCount == null ? 43 : this.productCount.hashCode());
        result = (result * PRIME) + (this.targetCount == null ? 43 : this.targetCount.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationType == null ? 43 : this.applicationType.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
