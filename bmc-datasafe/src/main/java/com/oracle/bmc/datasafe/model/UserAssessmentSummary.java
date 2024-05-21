/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The summary of the user assessment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UserAssessmentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserAssessmentSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "description",
        "displayName",
        "id",
        "ignoredTargets",
        "ignoredAssessmentIds",
        "isBaseline",
        "isDeviatedFromBaseline",
        "lastComparedBaselineId",
        "lifecycleState",
        "lifecycleDetails",
        "scheduleAssessmentId",
        "schedule",
        "statistics",
        "targetIds",
        "timeCreated",
        "timeUpdated",
        "timeLastAssessed",
        "triggeredBy",
        "type",
        "freeformTags",
        "definedTags"
    })
    public UserAssessmentSummary(
            String compartmentId,
            String description,
            String displayName,
            String id,
            java.util.List<Object> ignoredTargets,
            java.util.List<Object> ignoredAssessmentIds,
            Boolean isBaseline,
            Boolean isDeviatedFromBaseline,
            String lastComparedBaselineId,
            UserAssessmentLifecycleState lifecycleState,
            String lifecycleDetails,
            String scheduleAssessmentId,
            String schedule,
            java.util.Map<String, java.util.Map<String, Object>> statistics,
            java.util.List<String> targetIds,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastAssessed,
            TriggeredBy triggeredBy,
            Type type,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.ignoredTargets = ignoredTargets;
        this.ignoredAssessmentIds = ignoredAssessmentIds;
        this.isBaseline = isBaseline;
        this.isDeviatedFromBaseline = isDeviatedFromBaseline;
        this.lastComparedBaselineId = lastComparedBaselineId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.scheduleAssessmentId = scheduleAssessmentId;
        this.schedule = schedule;
        this.statistics = statistics;
        this.targetIds = targetIds;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeLastAssessed = timeLastAssessed;
        this.triggeredBy = triggeredBy;
        this.type = type;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment that contains the user assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the user assessment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The description of the user assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the user assessment.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The display name of the user assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the user assessment.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the user assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the user assessment.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * List containing maps as values.
         * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ignoredTargets")
        private java.util.List<Object> ignoredTargets;

        /**
         * List containing maps as values.
         * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
         *
         * @param ignoredTargets the value to set
         * @return this builder
         **/
        public Builder ignoredTargets(java.util.List<Object> ignoredTargets) {
            this.ignoredTargets = ignoredTargets;
            this.__explicitlySet__.add("ignoredTargets");
            return this;
        }
        /**
         * List containing maps as values.
         * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ignoredAssessmentIds")
        private java.util.List<Object> ignoredAssessmentIds;

        /**
         * List containing maps as values.
         * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
         *
         * @param ignoredAssessmentIds the value to set
         * @return this builder
         **/
        public Builder ignoredAssessmentIds(java.util.List<Object> ignoredAssessmentIds) {
            this.ignoredAssessmentIds = ignoredAssessmentIds;
            this.__explicitlySet__.add("ignoredAssessmentIds");
            return this;
        }
        /**
         * Indicates if the assessment is a baseline assessment. This applies to saved user assessments only.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBaseline")
        private Boolean isBaseline;

        /**
         * Indicates if the assessment is a baseline assessment. This applies to saved user assessments only.
         * @param isBaseline the value to set
         * @return this builder
         **/
        public Builder isBaseline(Boolean isBaseline) {
            this.isBaseline = isBaseline;
            this.__explicitlySet__.add("isBaseline");
            return this;
        }
        /**
         * Indicates if the assessment has deviated from the baseline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDeviatedFromBaseline")
        private Boolean isDeviatedFromBaseline;

        /**
         * Indicates if the assessment has deviated from the baseline.
         * @param isDeviatedFromBaseline the value to set
         * @return this builder
         **/
        public Builder isDeviatedFromBaseline(Boolean isDeviatedFromBaseline) {
            this.isDeviatedFromBaseline = isDeviatedFromBaseline;
            this.__explicitlySet__.add("isDeviatedFromBaseline");
            return this;
        }
        /**
         * The OCID of the last user assessment baseline against which the latest assessment was compared.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastComparedBaselineId")
        private String lastComparedBaselineId;

        /**
         * The OCID of the last user assessment baseline against which the latest assessment was compared.
         * @param lastComparedBaselineId the value to set
         * @return this builder
         **/
        public Builder lastComparedBaselineId(String lastComparedBaselineId) {
            this.lastComparedBaselineId = lastComparedBaselineId;
            this.__explicitlySet__.add("lastComparedBaselineId");
            return this;
        }
        /**
         * The current state of the user assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private UserAssessmentLifecycleState lifecycleState;

        /**
         * The current state of the user assessment.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(UserAssessmentLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details about the current state of the user assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the user assessment.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The OCID of the user assessment that created this scheduled save assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleAssessmentId")
        private String scheduleAssessmentId;

        /**
         * The OCID of the user assessment that created this scheduled save assessment.
         * @param scheduleAssessmentId the value to set
         * @return this builder
         **/
        public Builder scheduleAssessmentId(String scheduleAssessmentId) {
            this.scheduleAssessmentId = scheduleAssessmentId;
            this.__explicitlySet__.add("scheduleAssessmentId");
            return this;
        }
        /**
         * Schedule to save the assessment periodically in the specified format:
         * <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         * Each of the above fields potentially introduce constraints. A workrequest is created only
         * when clock time satisfies all the constraints. Constraints introduced:
         * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         * <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         * 4. No constraint introduced when it is '*'. When not, day of week must equal the given value
         * <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         * 5. No constraint introduced when it is '*'. When not, day of month must equal the given value
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * Schedule to save the assessment periodically in the specified format:
         * <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         * Each of the above fields potentially introduce constraints. A workrequest is created only
         * when clock time satisfies all the constraints. Constraints introduced:
         * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         * <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         * 4. No constraint introduced when it is '*'. When not, day of week must equal the given value
         * <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         * 5. No constraint introduced when it is '*'. When not, day of month must equal the given value
         *
         * @param schedule the value to set
         * @return this builder
         **/
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }
        /**
         * Map that contains maps of values.
         *  Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private java.util.Map<String, java.util.Map<String, Object>> statistics;

        /**
         * Map that contains maps of values.
         *  Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param statistics the value to set
         * @return this builder
         **/
        public Builder statistics(java.util.Map<String, java.util.Map<String, Object>> statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
            return this;
        }
        /**
         * Array of database target OCIDs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
        private java.util.List<String> targetIds;

        /**
         * Array of database target OCIDs.
         * @param targetIds the value to set
         * @return this builder
         **/
        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            this.__explicitlySet__.add("targetIds");
            return this;
        }
        /**
         * The date and time the user assessment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the user assessment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The last date and time the user assessment was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last date and time the user assessment was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The date and time the user assessment was last executed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
        private java.util.Date timeLastAssessed;

        /**
         * The date and time the user assessment was last executed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeLastAssessed the value to set
         * @return this builder
         **/
        public Builder timeLastAssessed(java.util.Date timeLastAssessed) {
            this.timeLastAssessed = timeLastAssessed;
            this.__explicitlySet__.add("timeLastAssessed");
            return this;
        }
        /**
         * Indicates whether the user assessment was created by the system or the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
        private TriggeredBy triggeredBy;

        /**
         * Indicates whether the user assessment was created by the system or the user.
         * @param triggeredBy the value to set
         * @return this builder
         **/
        public Builder triggeredBy(TriggeredBy triggeredBy) {
            this.triggeredBy = triggeredBy;
            this.__explicitlySet__.add("triggeredBy");
            return this;
        }
        /**
         * The type of the user assessment. The possible types are:
         * <p>
         * LATEST: The latest assessment that was executed for a target. It can either be system generated as part of the scheduled assessments or user driven by refreshing the latest assessment.
         * SAVED: A saved user assessment. All user assessments are saved in the user assessment history.
         * SAVE_SCHEDULE: The schedule to periodically save the LATEST assessment of a target database.
         * COMPARTMENT: An automatic managed assessment type that stores all details of the targets in one compartment. This will keep an up-to-date status of all potential risks identified in the compartment.
         *        It is automatically updated once the latest assessment or refresh action is executed, as well as when a target is deleted or moved to a different compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of the user assessment. The possible types are:
         * <p>
         * LATEST: The latest assessment that was executed for a target. It can either be system generated as part of the scheduled assessments or user driven by refreshing the latest assessment.
         * SAVED: A saved user assessment. All user assessments are saved in the user assessment history.
         * SAVE_SCHEDULE: The schedule to periodically save the LATEST assessment of a target database.
         * COMPARTMENT: An automatic managed assessment type that stores all details of the targets in one compartment. This will keep an up-to-date status of all potential risks identified in the compartment.
         *        It is automatically updated once the latest assessment or refresh action is executed, as well as when a target is deleted or moved to a different compartment.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserAssessmentSummary build() {
            UserAssessmentSummary model =
                    new UserAssessmentSummary(
                            this.compartmentId,
                            this.description,
                            this.displayName,
                            this.id,
                            this.ignoredTargets,
                            this.ignoredAssessmentIds,
                            this.isBaseline,
                            this.isDeviatedFromBaseline,
                            this.lastComparedBaselineId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.scheduleAssessmentId,
                            this.schedule,
                            this.statistics,
                            this.targetIds,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeLastAssessed,
                            this.triggeredBy,
                            this.type,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserAssessmentSummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ignoredTargets")) {
                this.ignoredTargets(model.getIgnoredTargets());
            }
            if (model.wasPropertyExplicitlySet("ignoredAssessmentIds")) {
                this.ignoredAssessmentIds(model.getIgnoredAssessmentIds());
            }
            if (model.wasPropertyExplicitlySet("isBaseline")) {
                this.isBaseline(model.getIsBaseline());
            }
            if (model.wasPropertyExplicitlySet("isDeviatedFromBaseline")) {
                this.isDeviatedFromBaseline(model.getIsDeviatedFromBaseline());
            }
            if (model.wasPropertyExplicitlySet("lastComparedBaselineId")) {
                this.lastComparedBaselineId(model.getLastComparedBaselineId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("scheduleAssessmentId")) {
                this.scheduleAssessmentId(model.getScheduleAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
            }
            if (model.wasPropertyExplicitlySet("statistics")) {
                this.statistics(model.getStatistics());
            }
            if (model.wasPropertyExplicitlySet("targetIds")) {
                this.targetIds(model.getTargetIds());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeLastAssessed")) {
                this.timeLastAssessed(model.getTimeLastAssessed());
            }
            if (model.wasPropertyExplicitlySet("triggeredBy")) {
                this.triggeredBy(model.getTriggeredBy());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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
     * The OCID of the compartment that contains the user assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the user assessment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The description of the user assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the user assessment.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The display name of the user assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the user assessment.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the user assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the user assessment.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ignoredTargets")
    private final java.util.List<Object> ignoredTargets;

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     * @return the value
     **/
    public java.util.List<Object> getIgnoredTargets() {
        return ignoredTargets;
    }

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ignoredAssessmentIds")
    private final java.util.List<Object> ignoredAssessmentIds;

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     * @return the value
     **/
    public java.util.List<Object> getIgnoredAssessmentIds() {
        return ignoredAssessmentIds;
    }

    /**
     * Indicates if the assessment is a baseline assessment. This applies to saved user assessments only.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBaseline")
    private final Boolean isBaseline;

    /**
     * Indicates if the assessment is a baseline assessment. This applies to saved user assessments only.
     * @return the value
     **/
    public Boolean getIsBaseline() {
        return isBaseline;
    }

    /**
     * Indicates if the assessment has deviated from the baseline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeviatedFromBaseline")
    private final Boolean isDeviatedFromBaseline;

    /**
     * Indicates if the assessment has deviated from the baseline.
     * @return the value
     **/
    public Boolean getIsDeviatedFromBaseline() {
        return isDeviatedFromBaseline;
    }

    /**
     * The OCID of the last user assessment baseline against which the latest assessment was compared.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastComparedBaselineId")
    private final String lastComparedBaselineId;

    /**
     * The OCID of the last user assessment baseline against which the latest assessment was compared.
     * @return the value
     **/
    public String getLastComparedBaselineId() {
        return lastComparedBaselineId;
    }

    /**
     * The current state of the user assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final UserAssessmentLifecycleState lifecycleState;

    /**
     * The current state of the user assessment.
     * @return the value
     **/
    public UserAssessmentLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the current state of the user assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the user assessment.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The OCID of the user assessment that created this scheduled save assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleAssessmentId")
    private final String scheduleAssessmentId;

    /**
     * The OCID of the user assessment that created this scheduled save assessment.
     * @return the value
     **/
    public String getScheduleAssessmentId() {
        return scheduleAssessmentId;
    }

    /**
     * Schedule to save the assessment periodically in the specified format:
     * <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     * Each of the above fields potentially introduce constraints. A workrequest is created only
     * when clock time satisfies all the constraints. Constraints introduced:
     * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     * <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     * 4. No constraint introduced when it is '*'. When not, day of week must equal the given value
     * <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     * 5. No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * Schedule to save the assessment periodically in the specified format:
     * <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     * Each of the above fields potentially introduce constraints. A workrequest is created only
     * when clock time satisfies all the constraints. Constraints introduced:
     * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     * <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     * 4. No constraint introduced when it is '*'. When not, day of week must equal the given value
     * <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     * 5. No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     * @return the value
     **/
    public String getSchedule() {
        return schedule;
    }

    /**
     * Map that contains maps of values.
     *  Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    private final java.util.Map<String, java.util.Map<String, Object>> statistics;

    /**
     * Map that contains maps of values.
     *  Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getStatistics() {
        return statistics;
    }

    /**
     * Array of database target OCIDs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
    private final java.util.List<String> targetIds;

    /**
     * Array of database target OCIDs.
     * @return the value
     **/
    public java.util.List<String> getTargetIds() {
        return targetIds;
    }

    /**
     * The date and time the user assessment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the user assessment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last date and time the user assessment was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last date and time the user assessment was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time the user assessment was last executed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
    private final java.util.Date timeLastAssessed;

    /**
     * The date and time the user assessment was last executed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeLastAssessed() {
        return timeLastAssessed;
    }

    /**
     * Indicates whether the user assessment was created by the system or the user.
     **/
    public enum TriggeredBy {
        User("USER"),
        System("SYSTEM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TriggeredBy.class);

        private final String value;
        private static java.util.Map<String, TriggeredBy> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggeredBy v : TriggeredBy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggeredBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggeredBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggeredBy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the user assessment was created by the system or the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
    private final TriggeredBy triggeredBy;

    /**
     * Indicates whether the user assessment was created by the system or the user.
     * @return the value
     **/
    public TriggeredBy getTriggeredBy() {
        return triggeredBy;
    }

    /**
     * The type of the user assessment. The possible types are:
     * <p>
     * LATEST: The latest assessment that was executed for a target. It can either be system generated as part of the scheduled assessments or user driven by refreshing the latest assessment.
     * SAVED: A saved user assessment. All user assessments are saved in the user assessment history.
     * SAVE_SCHEDULE: The schedule to periodically save the LATEST assessment of a target database.
     * COMPARTMENT: An automatic managed assessment type that stores all details of the targets in one compartment. This will keep an up-to-date status of all potential risks identified in the compartment.
     *        It is automatically updated once the latest assessment or refresh action is executed, as well as when a target is deleted or moved to a different compartment.
     *
     **/
    public enum Type {
        Latest("LATEST"),
        Saved("SAVED"),
        SaveSchedule("SAVE_SCHEDULE"),
        Compartment("COMPARTMENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the user assessment. The possible types are:
     * <p>
     * LATEST: The latest assessment that was executed for a target. It can either be system generated as part of the scheduled assessments or user driven by refreshing the latest assessment.
     * SAVED: A saved user assessment. All user assessments are saved in the user assessment history.
     * SAVE_SCHEDULE: The schedule to periodically save the LATEST assessment of a target database.
     * COMPARTMENT: An automatic managed assessment type that stores all details of the targets in one compartment. This will keep an up-to-date status of all potential risks identified in the compartment.
     *        It is automatically updated once the latest assessment or refresh action is executed, as well as when a target is deleted or moved to a different compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of the user assessment. The possible types are:
     * <p>
     * LATEST: The latest assessment that was executed for a target. It can either be system generated as part of the scheduled assessments or user driven by refreshing the latest assessment.
     * SAVED: A saved user assessment. All user assessments are saved in the user assessment history.
     * SAVE_SCHEDULE: The schedule to periodically save the LATEST assessment of a target database.
     * COMPARTMENT: An automatic managed assessment type that stores all details of the targets in one compartment. This will keep an up-to-date status of all potential risks identified in the compartment.
     *        It is automatically updated once the latest assessment or refresh action is executed, as well as when a target is deleted or moved to a different compartment.
     *
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UserAssessmentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", ignoredTargets=").append(String.valueOf(this.ignoredTargets));
        sb.append(", ignoredAssessmentIds=").append(String.valueOf(this.ignoredAssessmentIds));
        sb.append(", isBaseline=").append(String.valueOf(this.isBaseline));
        sb.append(", isDeviatedFromBaseline=").append(String.valueOf(this.isDeviatedFromBaseline));
        sb.append(", lastComparedBaselineId=").append(String.valueOf(this.lastComparedBaselineId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", scheduleAssessmentId=").append(String.valueOf(this.scheduleAssessmentId));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", statistics=").append(String.valueOf(this.statistics));
        sb.append(", targetIds=").append(String.valueOf(this.targetIds));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeLastAssessed=").append(String.valueOf(this.timeLastAssessed));
        sb.append(", triggeredBy=").append(String.valueOf(this.triggeredBy));
        sb.append(", type=").append(String.valueOf(this.type));
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
        if (!(o instanceof UserAssessmentSummary)) {
            return false;
        }

        UserAssessmentSummary other = (UserAssessmentSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ignoredTargets, other.ignoredTargets)
                && java.util.Objects.equals(this.ignoredAssessmentIds, other.ignoredAssessmentIds)
                && java.util.Objects.equals(this.isBaseline, other.isBaseline)
                && java.util.Objects.equals(
                        this.isDeviatedFromBaseline, other.isDeviatedFromBaseline)
                && java.util.Objects.equals(
                        this.lastComparedBaselineId, other.lastComparedBaselineId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.scheduleAssessmentId, other.scheduleAssessmentId)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.statistics, other.statistics)
                && java.util.Objects.equals(this.targetIds, other.targetIds)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeLastAssessed, other.timeLastAssessed)
                && java.util.Objects.equals(this.triggeredBy, other.triggeredBy)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.ignoredTargets == null ? 43 : this.ignoredTargets.hashCode());
        result =
                (result * PRIME)
                        + (this.ignoredAssessmentIds == null
                                ? 43
                                : this.ignoredAssessmentIds.hashCode());
        result = (result * PRIME) + (this.isBaseline == null ? 43 : this.isBaseline.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeviatedFromBaseline == null
                                ? 43
                                : this.isDeviatedFromBaseline.hashCode());
        result =
                (result * PRIME)
                        + (this.lastComparedBaselineId == null
                                ? 43
                                : this.lastComparedBaselineId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleAssessmentId == null
                                ? 43
                                : this.scheduleAssessmentId.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.statistics == null ? 43 : this.statistics.hashCode());
        result = (result * PRIME) + (this.targetIds == null ? 43 : this.targetIds.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastAssessed == null ? 43 : this.timeLastAssessed.hashCode());
        result = (result * PRIME) + (this.triggeredBy == null ? 43 : this.triggeredBy.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
