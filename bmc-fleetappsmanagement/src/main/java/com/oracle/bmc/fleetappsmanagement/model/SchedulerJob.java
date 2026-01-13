/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * A SchedulerJob resource. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SchedulerJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SchedulerJob extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "timeScheduled",
        "timeStarted",
        "timeEnded",
        "countOfAffectedActionGroups",
        "countOfAffectedResources",
        "countOfAffectedTargets",
        "products",
        "lifecycleOperations",
        "actionGroups",
        "schedulerDefinition",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public SchedulerJob(
            String id,
            String displayName,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeScheduled,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Integer countOfAffectedActionGroups,
            Integer countOfAffectedResources,
            Integer countOfAffectedTargets,
            java.util.List<String> products,
            java.util.List<String> lifecycleOperations,
            java.util.List<ActionGroupDetails> actionGroups,
            AssociatedSchedulerDefinition schedulerDefinition,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeScheduled = timeScheduled;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.countOfAffectedActionGroups = countOfAffectedActionGroups;
        this.countOfAffectedResources = countOfAffectedResources;
        this.countOfAffectedTargets = countOfAffectedTargets;
        this.products = products;
        this.lifecycleOperations = lifecycleOperations;
        this.actionGroups = actionGroups;
        this.schedulerDefinition = schedulerDefinition;
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
        /** Compartment OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
        /** The scheduled date and time for the Job. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The scheduled date and time for the Job.
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /** Actual start date and time for the Job. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Actual start date and time for the Job.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** Actual end date and time for the Job. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * Actual end date and time for the Job.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * Count of Action Groups affected by the Schedule. An action group is a group of entities
         * grouped for a lifecycle activity. Example - A Fleet will be considered an Action Group
         * for any lifecycle activity.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedActionGroups")
        private Integer countOfAffectedActionGroups;

        /**
         * Count of Action Groups affected by the Schedule. An action group is a group of entities
         * grouped for a lifecycle activity. Example - A Fleet will be considered an Action Group
         * for any lifecycle activity.
         *
         * @param countOfAffectedActionGroups the value to set
         * @return this builder
         */
        public Builder countOfAffectedActionGroups(Integer countOfAffectedActionGroups) {
            this.countOfAffectedActionGroups = countOfAffectedActionGroups;
            this.__explicitlySet__.add("countOfAffectedActionGroups");
            return this;
        }
        /** Count of resources affected by the schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedResources")
        private Integer countOfAffectedResources;

        /**
         * Count of resources affected by the schedule.
         *
         * @param countOfAffectedResources the value to set
         * @return this builder
         */
        public Builder countOfAffectedResources(Integer countOfAffectedResources) {
            this.countOfAffectedResources = countOfAffectedResources;
            this.__explicitlySet__.add("countOfAffectedResources");
            return this;
        }
        /** Count of targets affected by the schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedTargets")
        private Integer countOfAffectedTargets;

        /**
         * Count of targets affected by the schedule.
         *
         * @param countOfAffectedTargets the value to set
         * @return this builder
         */
        public Builder countOfAffectedTargets(Integer countOfAffectedTargets) {
            this.countOfAffectedTargets = countOfAffectedTargets;
            this.__explicitlySet__.add("countOfAffectedTargets");
            return this;
        }
        /** All products that are part of the schedule for a PRODUCT action group type. */
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<String> products;

        /**
         * All products that are part of the schedule for a PRODUCT action group type.
         *
         * @param products the value to set
         * @return this builder
         */
        public Builder products(java.util.List<String> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
            return this;
        }
        /** All LifeCycle Operations that are part of the schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleOperations")
        private java.util.List<String> lifecycleOperations;

        /**
         * All LifeCycle Operations that are part of the schedule.
         *
         * @param lifecycleOperations the value to set
         * @return this builder
         */
        public Builder lifecycleOperations(java.util.List<String> lifecycleOperations) {
            this.lifecycleOperations = lifecycleOperations;
            this.__explicitlySet__.add("lifecycleOperations");
            return this;
        }
        /** Action Groups associated with the Schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionGroups")
        private java.util.List<ActionGroupDetails> actionGroups;

        /**
         * Action Groups associated with the Schedule.
         *
         * @param actionGroups the value to set
         * @return this builder
         */
        public Builder actionGroups(java.util.List<ActionGroupDetails> actionGroups) {
            this.actionGroups = actionGroups;
            this.__explicitlySet__.add("actionGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schedulerDefinition")
        private AssociatedSchedulerDefinition schedulerDefinition;

        public Builder schedulerDefinition(AssociatedSchedulerDefinition schedulerDefinition) {
            this.schedulerDefinition = schedulerDefinition;
            this.__explicitlySet__.add("schedulerDefinition");
            return this;
        }
        /** The current state of the SchedulerJob. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the SchedulerJob.
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

        public SchedulerJob build() {
            SchedulerJob model =
                    new SchedulerJob(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeScheduled,
                            this.timeStarted,
                            this.timeEnded,
                            this.countOfAffectedActionGroups,
                            this.countOfAffectedResources,
                            this.countOfAffectedTargets,
                            this.products,
                            this.lifecycleOperations,
                            this.actionGroups,
                            this.schedulerDefinition,
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
        public Builder copy(SchedulerJob model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("countOfAffectedActionGroups")) {
                this.countOfAffectedActionGroups(model.getCountOfAffectedActionGroups());
            }
            if (model.wasPropertyExplicitlySet("countOfAffectedResources")) {
                this.countOfAffectedResources(model.getCountOfAffectedResources());
            }
            if (model.wasPropertyExplicitlySet("countOfAffectedTargets")) {
                this.countOfAffectedTargets(model.getCountOfAffectedTargets());
            }
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
            }
            if (model.wasPropertyExplicitlySet("lifecycleOperations")) {
                this.lifecycleOperations(model.getLifecycleOperations());
            }
            if (model.wasPropertyExplicitlySet("actionGroups")) {
                this.actionGroups(model.getActionGroups());
            }
            if (model.wasPropertyExplicitlySet("schedulerDefinition")) {
                this.schedulerDefinition(model.getSchedulerDefinition());
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

    /** Compartment OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /** The scheduled date and time for the Job. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The scheduled date and time for the Job.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /** Actual start date and time for the Job. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Actual start date and time for the Job.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** Actual end date and time for the Job. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * Actual end date and time for the Job.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Count of Action Groups affected by the Schedule. An action group is a group of entities
     * grouped for a lifecycle activity. Example - A Fleet will be considered an Action Group for
     * any lifecycle activity.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedActionGroups")
    private final Integer countOfAffectedActionGroups;

    /**
     * Count of Action Groups affected by the Schedule. An action group is a group of entities
     * grouped for a lifecycle activity. Example - A Fleet will be considered an Action Group for
     * any lifecycle activity.
     *
     * @return the value
     */
    public Integer getCountOfAffectedActionGroups() {
        return countOfAffectedActionGroups;
    }

    /** Count of resources affected by the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedResources")
    private final Integer countOfAffectedResources;

    /**
     * Count of resources affected by the schedule.
     *
     * @return the value
     */
    public Integer getCountOfAffectedResources() {
        return countOfAffectedResources;
    }

    /** Count of targets affected by the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedTargets")
    private final Integer countOfAffectedTargets;

    /**
     * Count of targets affected by the schedule.
     *
     * @return the value
     */
    public Integer getCountOfAffectedTargets() {
        return countOfAffectedTargets;
    }

    /** All products that are part of the schedule for a PRODUCT action group type. */
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<String> products;

    /**
     * All products that are part of the schedule for a PRODUCT action group type.
     *
     * @return the value
     */
    public java.util.List<String> getProducts() {
        return products;
    }

    /** All LifeCycle Operations that are part of the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleOperations")
    private final java.util.List<String> lifecycleOperations;

    /**
     * All LifeCycle Operations that are part of the schedule.
     *
     * @return the value
     */
    public java.util.List<String> getLifecycleOperations() {
        return lifecycleOperations;
    }

    /** Action Groups associated with the Schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionGroups")
    private final java.util.List<ActionGroupDetails> actionGroups;

    /**
     * Action Groups associated with the Schedule.
     *
     * @return the value
     */
    public java.util.List<ActionGroupDetails> getActionGroups() {
        return actionGroups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schedulerDefinition")
    private final AssociatedSchedulerDefinition schedulerDefinition;

    public AssociatedSchedulerDefinition getSchedulerDefinition() {
        return schedulerDefinition;
    }

    /** The current state of the SchedulerJob. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Waiting("WAITING"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceled("CANCELED"),
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
    /** The current state of the SchedulerJob. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the SchedulerJob.
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
        sb.append("SchedulerJob(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", countOfAffectedActionGroups=")
                .append(String.valueOf(this.countOfAffectedActionGroups));
        sb.append(", countOfAffectedResources=")
                .append(String.valueOf(this.countOfAffectedResources));
        sb.append(", countOfAffectedTargets=").append(String.valueOf(this.countOfAffectedTargets));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(", lifecycleOperations=").append(String.valueOf(this.lifecycleOperations));
        sb.append(", actionGroups=").append(String.valueOf(this.actionGroups));
        sb.append(", schedulerDefinition=").append(String.valueOf(this.schedulerDefinition));
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
        if (!(o instanceof SchedulerJob)) {
            return false;
        }

        SchedulerJob other = (SchedulerJob) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(
                        this.countOfAffectedActionGroups, other.countOfAffectedActionGroups)
                && java.util.Objects.equals(
                        this.countOfAffectedResources, other.countOfAffectedResources)
                && java.util.Objects.equals(
                        this.countOfAffectedTargets, other.countOfAffectedTargets)
                && java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(this.lifecycleOperations, other.lifecycleOperations)
                && java.util.Objects.equals(this.actionGroups, other.actionGroups)
                && java.util.Objects.equals(this.schedulerDefinition, other.schedulerDefinition)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.countOfAffectedActionGroups == null
                                ? 43
                                : this.countOfAffectedActionGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.countOfAffectedResources == null
                                ? 43
                                : this.countOfAffectedResources.hashCode());
        result =
                (result * PRIME)
                        + (this.countOfAffectedTargets == null
                                ? 43
                                : this.countOfAffectedTargets.hashCode());
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleOperations == null
                                ? 43
                                : this.lifecycleOperations.hashCode());
        result = (result * PRIME) + (this.actionGroups == null ? 43 : this.actionGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.schedulerDefinition == null
                                ? 43
                                : this.schedulerDefinition.hashCode());
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
