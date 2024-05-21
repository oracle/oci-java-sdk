/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * A TargetDetectorRecipeDetectorRule resource contains a specific instance of a
 * single detector rule in one of the supported detector types (for example,
 * activity, configuration, or threat).
 * <p>
 * A TargetDetectorRecipeDetectorRule resource:
 * * Is effectively a copy of a DetectorRecipeRule resource (made when
 * a detector recipe is attached to a target) in which users can make
 * certain changes if it\u2019s Oracle-managed, and other changes if it\u2019s user-managed.
 * * Is visible on the Cloud Guard Targets, Target Details page.
 * * Is effectively located in a specific OCI compartment, through the
 * ThreatDetectorRecipe resource to which it belongs.
 * * Can be modified by users, programmatically or through the UI.
 * * Changes that can be made here apply locally, to resources in OCI compartments
 * mapped to the target that attaches the associated detector recipe
 * (in a TargetDetectorRecipe resource), and override any changes made in rules
 * associated with the corresponding DetectorRecipe resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TargetDetectorRecipeDetectorRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TargetDetectorRecipeDetectorRule
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "detectorRuleId",
        "displayName",
        "description",
        "recommendation",
        "detector",
        "serviceType",
        "resourceType",
        "details",
        "managedListTypes",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "dataSourceId",
        "entitiesMappings",
        "locks"
    })
    public TargetDetectorRecipeDetectorRule(
            String detectorRuleId,
            String displayName,
            String description,
            String recommendation,
            DetectorEnum detector,
            String serviceType,
            String resourceType,
            TargetDetectorDetails details,
            java.util.List<ManagedListTypes> managedListTypes,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String dataSourceId,
            java.util.List<EntitiesMapping> entitiesMappings,
            java.util.List<ResourceLock> locks) {
        super();
        this.detectorRuleId = detectorRuleId;
        this.displayName = displayName;
        this.description = description;
        this.recommendation = recommendation;
        this.detector = detector;
        this.serviceType = serviceType;
        this.resourceType = resourceType;
        this.details = details;
        this.managedListTypes = managedListTypes;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.dataSourceId = dataSourceId;
        this.entitiesMappings = entitiesMappings;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
        private String detectorRuleId;

        /**
         * The unique identifier of the detector rule
         * @param detectorRuleId the value to set
         * @return this builder
         **/
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            this.__explicitlySet__.add("detectorRuleId");
            return this;
        }
        /**
         * Display name for TargetDetectorRecipeDetectorRule resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for TargetDetectorRecipeDetectorRule resource
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Description for TargetDetectorRecipeDetectorRule resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description for TargetDetectorRecipeDetectorRule resource
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Recommendation for TargetDetectorRecipeDetectorRule resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        /**
         * Recommendation for TargetDetectorRecipeDetectorRule resource
         * @param recommendation the value to set
         * @return this builder
         **/
        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }
        /**
         * Detector type for the rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detector")
        private DetectorEnum detector;

        /**
         * Detector type for the rule
         * @param detector the value to set
         * @return this builder
         **/
        public Builder detector(DetectorEnum detector) {
            this.detector = detector;
            this.__explicitlySet__.add("detector");
            return this;
        }
        /**
         * Service type of the configuration to which the rule is applied
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private String serviceType;

        /**
         * Service type of the configuration to which the rule is applied
         * @param serviceType the value to set
         * @return this builder
         **/
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /**
         * The type of resource which is monitored by the detector rule.
         * For example, Instance, Database, VCN, Policy. To find the resource type for a
         * particular rule, see [Detector Recipe Reference]
         * (/iaas/cloud-guard/using/detect-recipes.htm#detect-recipes-reference).
         * <p>
         * Or try [Detector Recipe Reference]
         * (/cloud-guard/using/detect-recipes.htm#detect-recipes-reference).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The type of resource which is monitored by the detector rule.
         * For example, Instance, Database, VCN, Policy. To find the resource type for a
         * particular rule, see [Detector Recipe Reference]
         * (/iaas/cloud-guard/using/detect-recipes.htm#detect-recipes-reference).
         * <p>
         * Or try [Detector Recipe Reference]
         * (/cloud-guard/using/detect-recipes.htm#detect-recipes-reference).
         *
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private TargetDetectorDetails details;

        public Builder details(TargetDetectorDetails details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /**
         * List of managed list types related to this rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedListTypes")
        private java.util.List<ManagedListTypes> managedListTypes;

        /**
         * List of managed list types related to this rule
         * @param managedListTypes the value to set
         * @return this builder
         **/
        public Builder managedListTypes(java.util.List<ManagedListTypes> managedListTypes) {
            this.managedListTypes = managedListTypes;
            this.__explicitlySet__.add("managedListTypes");
            return this;
        }
        /**
         * The date and time the target detector recipe rule was created. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the target detector recipe rule was created. Format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the target detector recipe rule was last updated. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the target detector recipe rule was last updated. Format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current lifecycle state of the detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the detector rule
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The ID of the attached data source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
        private String dataSourceId;

        /**
         * The ID of the attached data source
         * @param dataSourceId the value to set
         * @return this builder
         **/
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            this.__explicitlySet__.add("dataSourceId");
            return this;
        }
        /**
         * Data source entities mapping for a detector rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitiesMappings")
        private java.util.List<EntitiesMapping> entitiesMappings;

        /**
         * Data source entities mapping for a detector rule
         * @param entitiesMappings the value to set
         * @return this builder
         **/
        public Builder entitiesMappings(java.util.List<EntitiesMapping> entitiesMappings) {
            this.entitiesMappings = entitiesMappings;
            this.__explicitlySet__.add("entitiesMappings");
            return this;
        }
        /**
         * Locks associated with this resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         * @param locks the value to set
         * @return this builder
         **/
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetDetectorRecipeDetectorRule build() {
            TargetDetectorRecipeDetectorRule model =
                    new TargetDetectorRecipeDetectorRule(
                            this.detectorRuleId,
                            this.displayName,
                            this.description,
                            this.recommendation,
                            this.detector,
                            this.serviceType,
                            this.resourceType,
                            this.details,
                            this.managedListTypes,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.dataSourceId,
                            this.entitiesMappings,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetDetectorRecipeDetectorRule model) {
            if (model.wasPropertyExplicitlySet("detectorRuleId")) {
                this.detectorRuleId(model.getDetectorRuleId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("recommendation")) {
                this.recommendation(model.getRecommendation());
            }
            if (model.wasPropertyExplicitlySet("detector")) {
                this.detector(model.getDetector());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("managedListTypes")) {
                this.managedListTypes(model.getManagedListTypes());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("dataSourceId")) {
                this.dataSourceId(model.getDataSourceId());
            }
            if (model.wasPropertyExplicitlySet("entitiesMappings")) {
                this.entitiesMappings(model.getEntitiesMappings());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
     * The unique identifier of the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
    private final String detectorRuleId;

    /**
     * The unique identifier of the detector rule
     * @return the value
     **/
    public String getDetectorRuleId() {
        return detectorRuleId;
    }

    /**
     * Display name for TargetDetectorRecipeDetectorRule resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for TargetDetectorRecipeDetectorRule resource
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description for TargetDetectorRecipeDetectorRule resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description for TargetDetectorRecipeDetectorRule resource
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Recommendation for TargetDetectorRecipeDetectorRule resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    private final String recommendation;

    /**
     * Recommendation for TargetDetectorRecipeDetectorRule resource
     * @return the value
     **/
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * Detector type for the rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detector")
    private final DetectorEnum detector;

    /**
     * Detector type for the rule
     * @return the value
     **/
    public DetectorEnum getDetector() {
        return detector;
    }

    /**
     * Service type of the configuration to which the rule is applied
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final String serviceType;

    /**
     * Service type of the configuration to which the rule is applied
     * @return the value
     **/
    public String getServiceType() {
        return serviceType;
    }

    /**
     * The type of resource which is monitored by the detector rule.
     * For example, Instance, Database, VCN, Policy. To find the resource type for a
     * particular rule, see [Detector Recipe Reference]
     * (/iaas/cloud-guard/using/detect-recipes.htm#detect-recipes-reference).
     * <p>
     * Or try [Detector Recipe Reference]
     * (/cloud-guard/using/detect-recipes.htm#detect-recipes-reference).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The type of resource which is monitored by the detector rule.
     * For example, Instance, Database, VCN, Policy. To find the resource type for a
     * particular rule, see [Detector Recipe Reference]
     * (/iaas/cloud-guard/using/detect-recipes.htm#detect-recipes-reference).
     * <p>
     * Or try [Detector Recipe Reference]
     * (/cloud-guard/using/detect-recipes.htm#detect-recipes-reference).
     *
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final TargetDetectorDetails details;

    public TargetDetectorDetails getDetails() {
        return details;
    }

    /**
     **/
    public enum ManagedListTypes {
        CidrBlock("CIDR_BLOCK"),
        Users("USERS"),
        Groups("GROUPS"),
        Ipv4Address("IPV4ADDRESS"),
        Ipv6Address("IPV6ADDRESS"),
        ResourceOcid("RESOURCE_OCID"),
        Region("REGION"),
        Country("COUNTRY"),
        State("STATE"),
        City("CITY"),
        Tags("TAGS"),
        Generic("GENERIC"),
        FusionAppsRole("FUSION_APPS_ROLE"),
        FusionAppsPermission("FUSION_APPS_PERMISSION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManagedListTypes.class);

        private final String value;
        private static java.util.Map<String, ManagedListTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagedListTypes v : ManagedListTypes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagedListTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagedListTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagedListTypes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * List of managed list types related to this rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedListTypes")
    private final java.util.List<ManagedListTypes> managedListTypes;

    /**
     * List of managed list types related to this rule
     * @return the value
     **/
    public java.util.List<ManagedListTypes> getManagedListTypes() {
        return managedListTypes;
    }

    /**
     * The date and time the target detector recipe rule was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the target detector recipe rule was created. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the target detector recipe rule was last updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the target detector recipe rule was last updated. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current lifecycle state of the detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the detector rule
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The ID of the attached data source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
    private final String dataSourceId;

    /**
     * The ID of the attached data source
     * @return the value
     **/
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * Data source entities mapping for a detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesMappings")
    private final java.util.List<EntitiesMapping> entitiesMappings;

    /**
     * Data source entities mapping for a detector rule
     * @return the value
     **/
    public java.util.List<EntitiesMapping> getEntitiesMappings() {
        return entitiesMappings;
    }

    /**
     * Locks associated with this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     * @return the value
     **/
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("TargetDetectorRecipeDetectorRule(");
        sb.append("super=").append(super.toString());
        sb.append("detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", recommendation=").append(String.valueOf(this.recommendation));
        sb.append(", detector=").append(String.valueOf(this.detector));
        sb.append(", serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", managedListTypes=").append(String.valueOf(this.managedListTypes));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", dataSourceId=").append(String.valueOf(this.dataSourceId));
        sb.append(", entitiesMappings=").append(String.valueOf(this.entitiesMappings));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetDetectorRecipeDetectorRule)) {
            return false;
        }

        TargetDetectorRecipeDetectorRule other = (TargetDetectorRecipeDetectorRule) o;
        return java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.recommendation, other.recommendation)
                && java.util.Objects.equals(this.detector, other.detector)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.managedListTypes, other.managedListTypes)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.dataSourceId, other.dataSourceId)
                && java.util.Objects.equals(this.entitiesMappings, other.entitiesMappings)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.detectorRuleId == null ? 43 : this.detectorRuleId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendation == null ? 43 : this.recommendation.hashCode());
        result = (result * PRIME) + (this.detector == null ? 43 : this.detector.hashCode());
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result =
                (result * PRIME)
                        + (this.managedListTypes == null ? 43 : this.managedListTypes.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.dataSourceId == null ? 43 : this.dataSourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.entitiesMappings == null ? 43 : this.entitiesMappings.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
