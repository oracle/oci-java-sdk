/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of a Scheduling Plan. <br>
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
        builder = SchedulingPlanSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SchedulingPlanSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "schedulingPolicyId",
        "resourceId",
        "displayName",
        "lifecycleState",
        "lifecycleDetails",
        "isUsingRecommendedScheduledActions",
        "planIntent",
        "estimatedTimeInMins",
        "serviceType",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public SchedulingPlanSummary(
            String id,
            String compartmentId,
            String schedulingPolicyId,
            String resourceId,
            String displayName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Boolean isUsingRecommendedScheduledActions,
            PlanIntent planIntent,
            Integer estimatedTimeInMins,
            ServiceType serviceType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.schedulingPolicyId = schedulingPolicyId;
        this.resourceId = resourceId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.isUsingRecommendedScheduledActions = isUsingRecommendedScheduledActions;
        this.planIntent = planIntent;
        this.estimatedTimeInMins = estimatedTimeInMins;
        this.serviceType = serviceType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Scheduling Plan.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Scheduling Plan.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Scheduling Policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedulingPolicyId")
        private String schedulingPolicyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Scheduling Policy.
         *
         * @param schedulingPolicyId the value to set
         * @return this builder
         */
        public Builder schedulingPolicyId(String schedulingPolicyId) {
            this.schedulingPolicyId = schedulingPolicyId;
            this.__explicitlySet__.add("schedulingPolicyId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** The display name of the Scheduling Plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the Scheduling Plan.
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
         * The current state of the Scheduling Plan. Valid states are CREATING, NEEDS_ATTENTION,
         * AVAILABLE, UPDATING, FAILED, DELETING and DELETED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Scheduling Plan. Valid states are CREATING, NEEDS_ATTENTION,
         * AVAILABLE, UPDATING, FAILED, DELETING and DELETED.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** If true, recommended scheduled actions will be generated for the scheduling plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUsingRecommendedScheduledActions")
        private Boolean isUsingRecommendedScheduledActions;

        /**
         * If true, recommended scheduled actions will be generated for the scheduling plan.
         *
         * @param isUsingRecommendedScheduledActions the value to set
         * @return this builder
         */
        public Builder isUsingRecommendedScheduledActions(
                Boolean isUsingRecommendedScheduledActions) {
            this.isUsingRecommendedScheduledActions = isUsingRecommendedScheduledActions;
            this.__explicitlySet__.add("isUsingRecommendedScheduledActions");
            return this;
        }
        /**
         * The current intent the Scheduling Plan. Valid states is
         * EXADATA_INFRASTRUCTURE_FULL_SOFTWARE_UPDATE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("planIntent")
        private PlanIntent planIntent;

        /**
         * The current intent the Scheduling Plan. Valid states is
         * EXADATA_INFRASTRUCTURE_FULL_SOFTWARE_UPDATE.
         *
         * @param planIntent the value to set
         * @return this builder
         */
        public Builder planIntent(PlanIntent planIntent) {
            this.planIntent = planIntent;
            this.__explicitlySet__.add("planIntent");
            return this;
        }
        /** The estimated time for the Scheduling Plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
        private Integer estimatedTimeInMins;

        /**
         * The estimated time for the Scheduling Plan.
         *
         * @param estimatedTimeInMins the value to set
         * @return this builder
         */
        public Builder estimatedTimeInMins(Integer estimatedTimeInMins) {
            this.estimatedTimeInMins = estimatedTimeInMins;
            this.__explicitlySet__.add("estimatedTimeInMins");
            return this;
        }
        /** The service type of the Scheduling Plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private ServiceType serviceType;

        /**
         * The service type of the Scheduling Plan.
         *
         * @param serviceType the value to set
         * @return this builder
         */
        public Builder serviceType(ServiceType serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /** The date and time the Scheduling Plan Resource was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Scheduling Plan Resource was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the Scheduling Plan Resource was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the Scheduling Plan Resource was updated.
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        public SchedulingPlanSummary build() {
            SchedulingPlanSummary model =
                    new SchedulingPlanSummary(
                            this.id,
                            this.compartmentId,
                            this.schedulingPolicyId,
                            this.resourceId,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.isUsingRecommendedScheduledActions,
                            this.planIntent,
                            this.estimatedTimeInMins,
                            this.serviceType,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchedulingPlanSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("schedulingPolicyId")) {
                this.schedulingPolicyId(model.getSchedulingPolicyId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("isUsingRecommendedScheduledActions")) {
                this.isUsingRecommendedScheduledActions(
                        model.getIsUsingRecommendedScheduledActions());
            }
            if (model.wasPropertyExplicitlySet("planIntent")) {
                this.planIntent(model.getPlanIntent());
            }
            if (model.wasPropertyExplicitlySet("estimatedTimeInMins")) {
                this.estimatedTimeInMins(model.getEstimatedTimeInMins());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Scheduling Plan.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Scheduling Plan.
     *
     * @return the value
     */
    public String getId() {
        return id;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Scheduling Policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulingPolicyId")
    private final String schedulingPolicyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Scheduling Policy.
     *
     * @return the value
     */
    public String getSchedulingPolicyId() {
        return schedulingPolicyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** The display name of the Scheduling Plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the Scheduling Plan.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The current state of the Scheduling Plan. Valid states are CREATING, NEEDS_ATTENTION,
     * AVAILABLE, UPDATING, FAILED, DELETING and DELETED.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        NeedsAttention("NEEDS_ATTENTION"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Failed("FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),

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
    /**
     * The current state of the Scheduling Plan. Valid states are CREATING, NEEDS_ATTENTION,
     * AVAILABLE, UPDATING, FAILED, DELETING and DELETED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Scheduling Plan. Valid states are CREATING, NEEDS_ATTENTION,
     * AVAILABLE, UPDATING, FAILED, DELETING and DELETED.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** If true, recommended scheduled actions will be generated for the scheduling plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUsingRecommendedScheduledActions")
    private final Boolean isUsingRecommendedScheduledActions;

    /**
     * If true, recommended scheduled actions will be generated for the scheduling plan.
     *
     * @return the value
     */
    public Boolean getIsUsingRecommendedScheduledActions() {
        return isUsingRecommendedScheduledActions;
    }

    /**
     * The current intent the Scheduling Plan. Valid states is
     * EXADATA_INFRASTRUCTURE_FULL_SOFTWARE_UPDATE.
     */
    public enum PlanIntent implements com.oracle.bmc.http.internal.BmcEnum {
        ExadataInfrastructureFullSoftwareUpdate("EXADATA_INFRASTRUCTURE_FULL_SOFTWARE_UPDATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlanIntent.class);

        private final String value;
        private static java.util.Map<String, PlanIntent> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanIntent v : PlanIntent.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlanIntent(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlanIntent create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlanIntent', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current intent the Scheduling Plan. Valid states is
     * EXADATA_INFRASTRUCTURE_FULL_SOFTWARE_UPDATE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("planIntent")
    private final PlanIntent planIntent;

    /**
     * The current intent the Scheduling Plan. Valid states is
     * EXADATA_INFRASTRUCTURE_FULL_SOFTWARE_UPDATE.
     *
     * @return the value
     */
    public PlanIntent getPlanIntent() {
        return planIntent;
    }

    /** The estimated time for the Scheduling Plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
    private final Integer estimatedTimeInMins;

    /**
     * The estimated time for the Scheduling Plan.
     *
     * @return the value
     */
    public Integer getEstimatedTimeInMins() {
        return estimatedTimeInMins;
    }

    /** The service type of the Scheduling Plan. */
    public enum ServiceType implements com.oracle.bmc.http.internal.BmcEnum {
        Exacc("EXACC"),
        Exacs("EXACS"),
        Fpppcs("FPPPCS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServiceType.class);

        private final String value;
        private static java.util.Map<String, ServiceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceType v : ServiceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServiceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServiceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServiceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The service type of the Scheduling Plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final ServiceType serviceType;

    /**
     * The service type of the Scheduling Plan.
     *
     * @return the value
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /** The date and time the Scheduling Plan Resource was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Scheduling Plan Resource was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the Scheduling Plan Resource was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the Scheduling Plan Resource was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("SchedulingPlanSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", schedulingPolicyId=").append(String.valueOf(this.schedulingPolicyId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", isUsingRecommendedScheduledActions=")
                .append(String.valueOf(this.isUsingRecommendedScheduledActions));
        sb.append(", planIntent=").append(String.valueOf(this.planIntent));
        sb.append(", estimatedTimeInMins=").append(String.valueOf(this.estimatedTimeInMins));
        sb.append(", serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof SchedulingPlanSummary)) {
            return false;
        }

        SchedulingPlanSummary other = (SchedulingPlanSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.schedulingPolicyId, other.schedulingPolicyId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(
                        this.isUsingRecommendedScheduledActions,
                        other.isUsingRecommendedScheduledActions)
                && java.util.Objects.equals(this.planIntent, other.planIntent)
                && java.util.Objects.equals(this.estimatedTimeInMins, other.estimatedTimeInMins)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
                        + (this.schedulingPolicyId == null
                                ? 43
                                : this.schedulingPolicyId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isUsingRecommendedScheduledActions == null
                                ? 43
                                : this.isUsingRecommendedScheduledActions.hashCode());
        result = (result * PRIME) + (this.planIntent == null ? 43 : this.planIntent.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedTimeInMins == null
                                ? 43
                                : this.estimatedTimeInMins.hashCode());
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
