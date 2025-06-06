/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * It is the event in which the maintenance action will be be performed on the customer instance on
 * the scheduled date and time. <br>
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
        builder = InstanceMaintenanceEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceMaintenanceEvent
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "definedTags",
        "freeformTags",
        "id",
        "instanceId",
        "compartmentId",
        "maintenanceCategory",
        "maintenanceReason",
        "instanceAction",
        "alternativeResolutionActions",
        "timeStarted",
        "timeFinished",
        "timeWindowStart",
        "startWindowDuration",
        "estimatedDuration",
        "timeHardDueDate",
        "canReschedule",
        "timeCreated",
        "lifecycleState",
        "lifecycleDetails",
        "createdBy",
        "description",
        "correlationToken",
        "canDeleteLocalStorage",
        "additionalDetails"
    })
    public InstanceMaintenanceEvent(
            String displayName,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            String id,
            String instanceId,
            String compartmentId,
            MaintenanceCategory maintenanceCategory,
            MaintenanceReason maintenanceReason,
            InstanceAction instanceAction,
            java.util.List<InstanceMaintenanceAlternativeResolutionActions>
                    alternativeResolutionActions,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            java.util.Date timeWindowStart,
            String startWindowDuration,
            String estimatedDuration,
            java.util.Date timeHardDueDate,
            Boolean canReschedule,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            CreatedBy createdBy,
            String description,
            String correlationToken,
            Boolean canDeleteLocalStorage,
            java.util.Map<String, String> additionalDetails) {
        super();
        this.displayName = displayName;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.id = id;
        this.instanceId = instanceId;
        this.compartmentId = compartmentId;
        this.maintenanceCategory = maintenanceCategory;
        this.maintenanceReason = maintenanceReason;
        this.instanceAction = instanceAction;
        this.alternativeResolutionActions = alternativeResolutionActions;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.timeWindowStart = timeWindowStart;
        this.startWindowDuration = startWindowDuration;
        this.estimatedDuration = estimatedDuration;
        this.timeHardDueDate = timeHardDueDate;
        this.canReschedule = canReschedule;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.createdBy = createdBy;
        this.description = description;
        this.correlationToken = correlationToken;
        this.canDeleteLocalStorage = canDeleteLocalStorage;
        this.additionalDetails = additionalDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * maintenance event.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * maintenance event.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The OCID of the instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The OCID of the compartment that contains the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the instance.
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
         * This indicates the priority and allowed actions for this Maintenance. Higher priority
         * forms of Maintenance have tighter restrictions and may not be rescheduled, while lower
         * priority/severity Maintenance can be rescheduled, deferred, or even cancelled. Please see
         * the [Instance
         * Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
         * documentation for details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceCategory")
        private MaintenanceCategory maintenanceCategory;

        /**
         * This indicates the priority and allowed actions for this Maintenance. Higher priority
         * forms of Maintenance have tighter restrictions and may not be rescheduled, while lower
         * priority/severity Maintenance can be rescheduled, deferred, or even cancelled. Please see
         * the [Instance
         * Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
         * documentation for details.
         *
         * @param maintenanceCategory the value to set
         * @return this builder
         */
        public Builder maintenanceCategory(MaintenanceCategory maintenanceCategory) {
            this.maintenanceCategory = maintenanceCategory;
            this.__explicitlySet__.add("maintenanceCategory");
            return this;
        }
        /**
         * This is the reason that Maintenance is being performed. See [Instance
         * Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
         * documentation for details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceReason")
        private MaintenanceReason maintenanceReason;

        /**
         * This is the reason that Maintenance is being performed. See [Instance
         * Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
         * documentation for details.
         *
         * @param maintenanceReason the value to set
         * @return this builder
         */
        public Builder maintenanceReason(MaintenanceReason maintenanceReason) {
            this.maintenanceReason = maintenanceReason;
            this.__explicitlySet__.add("maintenanceReason");
            return this;
        }
        /**
         * This is the action that will be performed on the Instance by OCI when the Maintenance
         * begins.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceAction")
        private InstanceAction instanceAction;

        /**
         * This is the action that will be performed on the Instance by OCI when the Maintenance
         * begins.
         *
         * @param instanceAction the value to set
         * @return this builder
         */
        public Builder instanceAction(InstanceAction instanceAction) {
            this.instanceAction = instanceAction;
            this.__explicitlySet__.add("instanceAction");
            return this;
        }
        /**
         * These are alternative actions to the requested instanceAction that can be taken to
         * resolve the Maintenance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("alternativeResolutionActions")
        private java.util.List<InstanceMaintenanceAlternativeResolutionActions>
                alternativeResolutionActions;

        /**
         * These are alternative actions to the requested instanceAction that can be taken to
         * resolve the Maintenance.
         *
         * @param alternativeResolutionActions the value to set
         * @return this builder
         */
        public Builder alternativeResolutionActions(
                java.util.List<InstanceMaintenanceAlternativeResolutionActions>
                        alternativeResolutionActions) {
            this.alternativeResolutionActions = alternativeResolutionActions;
            this.__explicitlySet__.add("alternativeResolutionActions");
            return this;
        }
        /** The time at which the Maintenance actually started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time at which the Maintenance actually started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The time at which the Maintenance actually finished. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The time at which the Maintenance actually finished.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The beginning of the time window when Maintenance is scheduled to begin. The Maintenance
         * will not begin before this time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeWindowStart")
        private java.util.Date timeWindowStart;

        /**
         * The beginning of the time window when Maintenance is scheduled to begin. The Maintenance
         * will not begin before this time.
         *
         * @param timeWindowStart the value to set
         * @return this builder
         */
        public Builder timeWindowStart(java.util.Date timeWindowStart) {
            this.timeWindowStart = timeWindowStart;
            this.__explicitlySet__.add("timeWindowStart");
            return this;
        }
        /** The duration of the time window Maintenance is scheduled to begin within. */
        @com.fasterxml.jackson.annotation.JsonProperty("startWindowDuration")
        private String startWindowDuration;

        /**
         * The duration of the time window Maintenance is scheduled to begin within.
         *
         * @param startWindowDuration the value to set
         * @return this builder
         */
        public Builder startWindowDuration(String startWindowDuration) {
            this.startWindowDuration = startWindowDuration;
            this.__explicitlySet__.add("startWindowDuration");
            return this;
        }
        /**
         * This is the estimated duration of the Maintenance, once the Maintenance has entered the
         * STARTED state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedDuration")
        private String estimatedDuration;

        /**
         * This is the estimated duration of the Maintenance, once the Maintenance has entered the
         * STARTED state.
         *
         * @param estimatedDuration the value to set
         * @return this builder
         */
        public Builder estimatedDuration(String estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            this.__explicitlySet__.add("estimatedDuration");
            return this;
        }
        /**
         * It is the scheduled hard due date and time of the maintenance event. The maintenance
         * event will happen at this time and the due date will not be extended.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeHardDueDate")
        private java.util.Date timeHardDueDate;

        /**
         * It is the scheduled hard due date and time of the maintenance event. The maintenance
         * event will happen at this time and the due date will not be extended.
         *
         * @param timeHardDueDate the value to set
         * @return this builder
         */
        public Builder timeHardDueDate(java.util.Date timeHardDueDate) {
            this.timeHardDueDate = timeHardDueDate;
            this.__explicitlySet__.add("timeHardDueDate");
            return this;
        }
        /**
         * Indicates if this MaintenanceEvent is capable of being rescheduled up to the
         * timeHardDueDate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canReschedule")
        private Boolean canReschedule;

        /**
         * Indicates if this MaintenanceEvent is capable of being rescheduled up to the
         * timeHardDueDate.
         *
         * @param canReschedule the value to set
         * @return this builder
         */
        public Builder canReschedule(Boolean canReschedule) {
            this.canReschedule = canReschedule;
            this.__explicitlySet__.add("canReschedule");
            return this;
        }
        /**
         * The date and time the maintenance event was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the maintenance event was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current state of the maintenance event. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the maintenance event.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Provides more details about the state of the maintenance event. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Provides more details about the state of the maintenance event.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The creator of the maintenance event. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private CreatedBy createdBy;

        /**
         * The creator of the maintenance event.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(CreatedBy createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * It is the descriptive information about the maintenance taking place on the customer
         * instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * It is the descriptive information about the maintenance taking place on the customer
         * instance.
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
         * A unique identifier that will group Instances that have a relationship with one another
         * and must be scheduled together for the Maintenance to proceed. Any Instances that have a
         * relationship with one another from a Maintenance perspective will have a matching
         * correlationToken.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("correlationToken")
        private String correlationToken;

        /**
         * A unique identifier that will group Instances that have a relationship with one another
         * and must be scheduled together for the Maintenance to proceed. Any Instances that have a
         * relationship with one another from a Maintenance perspective will have a matching
         * correlationToken.
         *
         * @param correlationToken the value to set
         * @return this builder
         */
        public Builder correlationToken(String correlationToken) {
            this.correlationToken = correlationToken;
            this.__explicitlySet__.add("correlationToken");
            return this;
        }
        /**
         * For Instances that have local storage, this field is set to true when local storage will
         * be deleted as a result of the Maintenance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canDeleteLocalStorage")
        private Boolean canDeleteLocalStorage;

        /**
         * For Instances that have local storage, this field is set to true when local storage will
         * be deleted as a result of the Maintenance.
         *
         * @param canDeleteLocalStorage the value to set
         * @return this builder
         */
        public Builder canDeleteLocalStorage(Boolean canDeleteLocalStorage) {
            this.canDeleteLocalStorage = canDeleteLocalStorage;
            this.__explicitlySet__.add("canDeleteLocalStorage");
            return this;
        }
        /** Additional details of the maintenance in the form of json. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * Additional details of the maintenance in the form of json.
         *
         * @param additionalDetails the value to set
         * @return this builder
         */
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceMaintenanceEvent build() {
            InstanceMaintenanceEvent model =
                    new InstanceMaintenanceEvent(
                            this.displayName,
                            this.definedTags,
                            this.freeformTags,
                            this.id,
                            this.instanceId,
                            this.compartmentId,
                            this.maintenanceCategory,
                            this.maintenanceReason,
                            this.instanceAction,
                            this.alternativeResolutionActions,
                            this.timeStarted,
                            this.timeFinished,
                            this.timeWindowStart,
                            this.startWindowDuration,
                            this.estimatedDuration,
                            this.timeHardDueDate,
                            this.canReschedule,
                            this.timeCreated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.createdBy,
                            this.description,
                            this.correlationToken,
                            this.canDeleteLocalStorage,
                            this.additionalDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceMaintenanceEvent model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("maintenanceCategory")) {
                this.maintenanceCategory(model.getMaintenanceCategory());
            }
            if (model.wasPropertyExplicitlySet("maintenanceReason")) {
                this.maintenanceReason(model.getMaintenanceReason());
            }
            if (model.wasPropertyExplicitlySet("instanceAction")) {
                this.instanceAction(model.getInstanceAction());
            }
            if (model.wasPropertyExplicitlySet("alternativeResolutionActions")) {
                this.alternativeResolutionActions(model.getAlternativeResolutionActions());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("timeWindowStart")) {
                this.timeWindowStart(model.getTimeWindowStart());
            }
            if (model.wasPropertyExplicitlySet("startWindowDuration")) {
                this.startWindowDuration(model.getStartWindowDuration());
            }
            if (model.wasPropertyExplicitlySet("estimatedDuration")) {
                this.estimatedDuration(model.getEstimatedDuration());
            }
            if (model.wasPropertyExplicitlySet("timeHardDueDate")) {
                this.timeHardDueDate(model.getTimeHardDueDate());
            }
            if (model.wasPropertyExplicitlySet("canReschedule")) {
                this.canReschedule(model.getCanReschedule());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("correlationToken")) {
                this.correlationToken(model.getCorrelationToken());
            }
            if (model.wasPropertyExplicitlySet("canDeleteLocalStorage")) {
                this.canDeleteLocalStorage(model.getCanDeleteLocalStorage());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
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
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * maintenance event.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * maintenance event.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The OCID of the instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** The OCID of the compartment that contains the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the instance.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * This indicates the priority and allowed actions for this Maintenance. Higher priority forms
     * of Maintenance have tighter restrictions and may not be rescheduled, while lower
     * priority/severity Maintenance can be rescheduled, deferred, or even cancelled. Please see the
     * [Instance Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
     * documentation for details.
     */
    public enum MaintenanceCategory implements com.oracle.bmc.http.internal.BmcEnum {
        Emergency("EMERGENCY"),
        Mandatory("MANDATORY"),
        Flexible("FLEXIBLE"),
        Optional("OPTIONAL"),
        Notification("NOTIFICATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MaintenanceCategory.class);

        private final String value;
        private static java.util.Map<String, MaintenanceCategory> map;

        static {
            map = new java.util.HashMap<>();
            for (MaintenanceCategory v : MaintenanceCategory.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaintenanceCategory(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaintenanceCategory create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaintenanceCategory', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This indicates the priority and allowed actions for this Maintenance. Higher priority forms
     * of Maintenance have tighter restrictions and may not be rescheduled, while lower
     * priority/severity Maintenance can be rescheduled, deferred, or even cancelled. Please see the
     * [Instance Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
     * documentation for details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceCategory")
    private final MaintenanceCategory maintenanceCategory;

    /**
     * This indicates the priority and allowed actions for this Maintenance. Higher priority forms
     * of Maintenance have tighter restrictions and may not be rescheduled, while lower
     * priority/severity Maintenance can be rescheduled, deferred, or even cancelled. Please see the
     * [Instance Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
     * documentation for details.
     *
     * @return the value
     */
    public MaintenanceCategory getMaintenanceCategory() {
        return maintenanceCategory;
    }

    /**
     * This is the reason that Maintenance is being performed. See [Instance
     * Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
     * documentation for details.
     */
    public enum MaintenanceReason implements com.oracle.bmc.http.internal.BmcEnum {
        Evacuation("EVACUATION"),
        EnvironmentalFactors("ENVIRONMENTAL_FACTORS"),
        Decommission("DECOMMISSION"),
        HardwareReplacement("HARDWARE_REPLACEMENT"),
        FirmwareUpdate("FIRMWARE_UPDATE"),
        SecurityUpdate("SECURITY_UPDATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MaintenanceReason.class);

        private final String value;
        private static java.util.Map<String, MaintenanceReason> map;

        static {
            map = new java.util.HashMap<>();
            for (MaintenanceReason v : MaintenanceReason.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaintenanceReason(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaintenanceReason create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaintenanceReason', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This is the reason that Maintenance is being performed. See [Instance
     * Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
     * documentation for details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceReason")
    private final MaintenanceReason maintenanceReason;

    /**
     * This is the reason that Maintenance is being performed. See [Instance
     * Maintenance](https://docs.oracle.com/iaas/Content/Compute/Tasks/placeholder.htm)
     * documentation for details.
     *
     * @return the value
     */
    public MaintenanceReason getMaintenanceReason() {
        return maintenanceReason;
    }

    /**
     * This is the action that will be performed on the Instance by OCI when the Maintenance begins.
     */
    public enum InstanceAction implements com.oracle.bmc.http.internal.BmcEnum {
        RebootMigration("REBOOT_MIGRATION"),
        Terminate("TERMINATE"),
        Stop("STOP"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InstanceAction.class);

        private final String value;
        private static java.util.Map<String, InstanceAction> map;

        static {
            map = new java.util.HashMap<>();
            for (InstanceAction v : InstanceAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InstanceAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstanceAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InstanceAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This is the action that will be performed on the Instance by OCI when the Maintenance begins.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceAction")
    private final InstanceAction instanceAction;

    /**
     * This is the action that will be performed on the Instance by OCI when the Maintenance begins.
     *
     * @return the value
     */
    public InstanceAction getInstanceAction() {
        return instanceAction;
    }

    /**
     * These are alternative actions to the requested instanceAction that can be taken to resolve
     * the Maintenance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alternativeResolutionActions")
    private final java.util.List<InstanceMaintenanceAlternativeResolutionActions>
            alternativeResolutionActions;

    /**
     * These are alternative actions to the requested instanceAction that can be taken to resolve
     * the Maintenance.
     *
     * @return the value
     */
    public java.util.List<InstanceMaintenanceAlternativeResolutionActions>
            getAlternativeResolutionActions() {
        return alternativeResolutionActions;
    }

    /** The time at which the Maintenance actually started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time at which the Maintenance actually started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The time at which the Maintenance actually finished. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The time at which the Maintenance actually finished.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The beginning of the time window when Maintenance is scheduled to begin. The Maintenance will
     * not begin before this time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeWindowStart")
    private final java.util.Date timeWindowStart;

    /**
     * The beginning of the time window when Maintenance is scheduled to begin. The Maintenance will
     * not begin before this time.
     *
     * @return the value
     */
    public java.util.Date getTimeWindowStart() {
        return timeWindowStart;
    }

    /** The duration of the time window Maintenance is scheduled to begin within. */
    @com.fasterxml.jackson.annotation.JsonProperty("startWindowDuration")
    private final String startWindowDuration;

    /**
     * The duration of the time window Maintenance is scheduled to begin within.
     *
     * @return the value
     */
    public String getStartWindowDuration() {
        return startWindowDuration;
    }

    /**
     * This is the estimated duration of the Maintenance, once the Maintenance has entered the
     * STARTED state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedDuration")
    private final String estimatedDuration;

    /**
     * This is the estimated duration of the Maintenance, once the Maintenance has entered the
     * STARTED state.
     *
     * @return the value
     */
    public String getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * It is the scheduled hard due date and time of the maintenance event. The maintenance event
     * will happen at this time and the due date will not be extended.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeHardDueDate")
    private final java.util.Date timeHardDueDate;

    /**
     * It is the scheduled hard due date and time of the maintenance event. The maintenance event
     * will happen at this time and the due date will not be extended.
     *
     * @return the value
     */
    public java.util.Date getTimeHardDueDate() {
        return timeHardDueDate;
    }

    /**
     * Indicates if this MaintenanceEvent is capable of being rescheduled up to the timeHardDueDate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canReschedule")
    private final Boolean canReschedule;

    /**
     * Indicates if this MaintenanceEvent is capable of being rescheduled up to the timeHardDueDate.
     *
     * @return the value
     */
    public Boolean getCanReschedule() {
        return canReschedule;
    }

    /**
     * The date and time the maintenance event was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the maintenance event was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current state of the maintenance event. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        Started("STARTED"),
        Processing("PROCESSING"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Canceled("CANCELED"),

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
    /** The current state of the maintenance event. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the maintenance event.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Provides more details about the state of the maintenance event. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Provides more details about the state of the maintenance event.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The creator of the maintenance event. */
    public enum CreatedBy implements com.oracle.bmc.http.internal.BmcEnum {
        Customer("CUSTOMER"),
        System("SYSTEM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CreatedBy.class);

        private final String value;
        private static java.util.Map<String, CreatedBy> map;

        static {
            map = new java.util.HashMap<>();
            for (CreatedBy v : CreatedBy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CreatedBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CreatedBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CreatedBy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The creator of the maintenance event. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final CreatedBy createdBy;

    /**
     * The creator of the maintenance event.
     *
     * @return the value
     */
    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    /**
     * It is the descriptive information about the maintenance taking place on the customer
     * instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * It is the descriptive information about the maintenance taking place on the customer
     * instance.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * A unique identifier that will group Instances that have a relationship with one another and
     * must be scheduled together for the Maintenance to proceed. Any Instances that have a
     * relationship with one another from a Maintenance perspective will have a matching
     * correlationToken.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("correlationToken")
    private final String correlationToken;

    /**
     * A unique identifier that will group Instances that have a relationship with one another and
     * must be scheduled together for the Maintenance to proceed. Any Instances that have a
     * relationship with one another from a Maintenance perspective will have a matching
     * correlationToken.
     *
     * @return the value
     */
    public String getCorrelationToken() {
        return correlationToken;
    }

    /**
     * For Instances that have local storage, this field is set to true when local storage will be
     * deleted as a result of the Maintenance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canDeleteLocalStorage")
    private final Boolean canDeleteLocalStorage;

    /**
     * For Instances that have local storage, this field is set to true when local storage will be
     * deleted as a result of the Maintenance.
     *
     * @return the value
     */
    public Boolean getCanDeleteLocalStorage() {
        return canDeleteLocalStorage;
    }

    /** Additional details of the maintenance in the form of json. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * Additional details of the maintenance in the form of json.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
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
        sb.append("InstanceMaintenanceEvent(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", maintenanceCategory=").append(String.valueOf(this.maintenanceCategory));
        sb.append(", maintenanceReason=").append(String.valueOf(this.maintenanceReason));
        sb.append(", instanceAction=").append(String.valueOf(this.instanceAction));
        sb.append(", alternativeResolutionActions=")
                .append(String.valueOf(this.alternativeResolutionActions));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", timeWindowStart=").append(String.valueOf(this.timeWindowStart));
        sb.append(", startWindowDuration=").append(String.valueOf(this.startWindowDuration));
        sb.append(", estimatedDuration=").append(String.valueOf(this.estimatedDuration));
        sb.append(", timeHardDueDate=").append(String.valueOf(this.timeHardDueDate));
        sb.append(", canReschedule=").append(String.valueOf(this.canReschedule));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", correlationToken=").append(String.valueOf(this.correlationToken));
        sb.append(", canDeleteLocalStorage=").append(String.valueOf(this.canDeleteLocalStorage));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceMaintenanceEvent)) {
            return false;
        }

        InstanceMaintenanceEvent other = (InstanceMaintenanceEvent) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.maintenanceCategory, other.maintenanceCategory)
                && java.util.Objects.equals(this.maintenanceReason, other.maintenanceReason)
                && java.util.Objects.equals(this.instanceAction, other.instanceAction)
                && java.util.Objects.equals(
                        this.alternativeResolutionActions, other.alternativeResolutionActions)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.timeWindowStart, other.timeWindowStart)
                && java.util.Objects.equals(this.startWindowDuration, other.startWindowDuration)
                && java.util.Objects.equals(this.estimatedDuration, other.estimatedDuration)
                && java.util.Objects.equals(this.timeHardDueDate, other.timeHardDueDate)
                && java.util.Objects.equals(this.canReschedule, other.canReschedule)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.correlationToken, other.correlationToken)
                && java.util.Objects.equals(this.canDeleteLocalStorage, other.canDeleteLocalStorage)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceCategory == null
                                ? 43
                                : this.maintenanceCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceReason == null ? 43 : this.maintenanceReason.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceAction == null ? 43 : this.instanceAction.hashCode());
        result =
                (result * PRIME)
                        + (this.alternativeResolutionActions == null
                                ? 43
                                : this.alternativeResolutionActions.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.timeWindowStart == null ? 43 : this.timeWindowStart.hashCode());
        result =
                (result * PRIME)
                        + (this.startWindowDuration == null
                                ? 43
                                : this.startWindowDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedDuration == null ? 43 : this.estimatedDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.timeHardDueDate == null ? 43 : this.timeHardDueDate.hashCode());
        result =
                (result * PRIME)
                        + (this.canReschedule == null ? 43 : this.canReschedule.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.correlationToken == null ? 43 : this.correlationToken.hashCode());
        result =
                (result * PRIME)
                        + (this.canDeleteLocalStorage == null
                                ? 43
                                : this.canDeleteLocalStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
