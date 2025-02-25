/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Detailed information of the Monitoring Template
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitoringTemplate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonitoringTemplate extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "tenantId",
        "compartmentId",
        "description",
        "status",
        "lifecycleState",
        "destinations",
        "isAlarmsEnabled",
        "isSplitNotificationEnabled",
        "members",
        "repeatNotificationDuration",
        "messageFormat",
        "totalAlarmConditions",
        "totalAppliedAlarmConditions",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MonitoringTemplate(
            String id,
            String displayName,
            String tenantId,
            String compartmentId,
            String description,
            MonitoringTemplateLifeCycleDetails status,
            MonitoringTemplateLifeCycleStates lifecycleState,
            java.util.List<String> destinations,
            Boolean isAlarmsEnabled,
            Boolean isSplitNotificationEnabled,
            java.util.List<MemberReference> members,
            String repeatNotificationDuration,
            MessageFormat messageFormat,
            Float totalAlarmConditions,
            Float totalAppliedAlarmConditions,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.tenantId = tenantId;
        this.compartmentId = compartmentId;
        this.description = description;
        this.status = status;
        this.lifecycleState = lifecycleState;
        this.destinations = destinations;
        this.isAlarmsEnabled = isAlarmsEnabled;
        this.isSplitNotificationEnabled = isSplitNotificationEnabled;
        this.members = members;
        this.repeatNotificationDuration = repeatNotificationDuration;
        this.messageFormat = messageFormat;
        this.totalAlarmConditions = totalAlarmConditions;
        this.totalAppliedAlarmConditions = totalAppliedAlarmConditions;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitoringTemplate
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitoringTemplate
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name for the monitoring template. It should be unique, and it's mutable in nature. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the monitoring template. It should be unique, and it's mutable in nature. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Tenant Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * Tenant Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * The OCID of the compartment containing the monitoringTemplate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the monitoringTemplate.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly description for the monitoring template. It does not have to be unique, and it's changeable. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description for the monitoring template. It does not have to be unique, and it's changeable. Avoid entering confidential information.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The current status of the monitoring template i.e. whether it is Applied or NotApplied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private MonitoringTemplateLifeCycleDetails status;

        /**
         * The current status of the monitoring template i.e. whether it is Applied or NotApplied.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(MonitoringTemplateLifeCycleDetails status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The current lifecycle state of the monitoring template.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MonitoringTemplateLifeCycleStates lifecycleState;

        /**
         * The current lifecycle state of the monitoring template.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(MonitoringTemplateLifeCycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A list of destinations for alarm notifications. Each destination is represented by the OCID of a related resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<String> destinations;

        /**
         * A list of destinations for alarm notifications. Each destination is represented by the OCID of a related resource.
         * @param destinations the value to set
         * @return this builder
         **/
        public Builder destinations(java.util.List<String> destinations) {
            this.destinations = destinations;
            this.__explicitlySet__.add("destinations");
            return this;
        }
        /**
         * Whether the alarm is enabled or disabled. Default value is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAlarmsEnabled")
        private Boolean isAlarmsEnabled;

        /**
         * Whether the alarm is enabled or disabled. Default value is enabled.
         * @param isAlarmsEnabled the value to set
         * @return this builder
         **/
        public Builder isAlarmsEnabled(Boolean isAlarmsEnabled) {
            this.isAlarmsEnabled = isAlarmsEnabled;
            this.__explicitlySet__.add("isAlarmsEnabled");
            return this;
        }
        /**
         * Whether the alarm notification is enabled or disabled, it will be Enabled by default.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSplitNotificationEnabled")
        private Boolean isSplitNotificationEnabled;

        /**
         * Whether the alarm notification is enabled or disabled, it will be Enabled by default.
         * @param isSplitNotificationEnabled the value to set
         * @return this builder
         **/
        public Builder isSplitNotificationEnabled(Boolean isSplitNotificationEnabled) {
            this.isSplitNotificationEnabled = isSplitNotificationEnabled;
            this.__explicitlySet__.add("isSplitNotificationEnabled");
            return this;
        }
        /**
         * List of members of this monitoring template.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("members")
        private java.util.List<MemberReference> members;

        /**
         * List of members of this monitoring template.
         * @param members the value to set
         * @return this builder
         **/
        public Builder members(java.util.List<MemberReference> members) {
            this.members = members;
            this.__explicitlySet__.add("members");
            return this;
        }
        /**
         * The frequency for re-submitting alarm notifications, if the alarm keeps firing without interruption. Format defined by ISO 8601. For example, PT4H indicates four hours. Minimum- PT1M. Maximum - P30D.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repeatNotificationDuration")
        private String repeatNotificationDuration;

        /**
         * The frequency for re-submitting alarm notifications, if the alarm keeps firing without interruption. Format defined by ISO 8601. For example, PT4H indicates four hours. Minimum- PT1M. Maximum - P30D.
         * @param repeatNotificationDuration the value to set
         * @return this builder
         **/
        public Builder repeatNotificationDuration(String repeatNotificationDuration) {
            this.repeatNotificationDuration = repeatNotificationDuration;
            this.__explicitlySet__.add("repeatNotificationDuration");
            return this;
        }
        /**
         * The format to use for alarm notifications.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
        private MessageFormat messageFormat;

        /**
         * The format to use for alarm notifications.
         * @param messageFormat the value to set
         * @return this builder
         **/
        public Builder messageFormat(MessageFormat messageFormat) {
            this.messageFormat = messageFormat;
            this.__explicitlySet__.add("messageFormat");
            return this;
        }
        /**
         * Total Alarm Conditions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalAlarmConditions")
        private Float totalAlarmConditions;

        /**
         * Total Alarm Conditions
         * @param totalAlarmConditions the value to set
         * @return this builder
         **/
        public Builder totalAlarmConditions(Float totalAlarmConditions) {
            this.totalAlarmConditions = totalAlarmConditions;
            this.__explicitlySet__.add("totalAlarmConditions");
            return this;
        }
        /**
         * Total Applied Alarm Conditions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalAppliedAlarmConditions")
        private Float totalAppliedAlarmConditions;

        /**
         * Total Applied Alarm Conditions
         * @param totalAppliedAlarmConditions the value to set
         * @return this builder
         **/
        public Builder totalAppliedAlarmConditions(Float totalAppliedAlarmConditions) {
            this.totalAppliedAlarmConditions = totalAppliedAlarmConditions;
            this.__explicitlySet__.add("totalAppliedAlarmConditions");
            return this;
        }
        /**
         * The date and time the monitoringTemplate was created. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the monitoringTemplate was created. Format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the monitoringTemplate was last updated. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the monitoringTemplate was last updated. Format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitoringTemplate build() {
            MonitoringTemplate model =
                    new MonitoringTemplate(
                            this.id,
                            this.displayName,
                            this.tenantId,
                            this.compartmentId,
                            this.description,
                            this.status,
                            this.lifecycleState,
                            this.destinations,
                            this.isAlarmsEnabled,
                            this.isSplitNotificationEnabled,
                            this.members,
                            this.repeatNotificationDuration,
                            this.messageFormat,
                            this.totalAlarmConditions,
                            this.totalAppliedAlarmConditions,
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
        public Builder copy(MonitoringTemplate model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("destinations")) {
                this.destinations(model.getDestinations());
            }
            if (model.wasPropertyExplicitlySet("isAlarmsEnabled")) {
                this.isAlarmsEnabled(model.getIsAlarmsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSplitNotificationEnabled")) {
                this.isSplitNotificationEnabled(model.getIsSplitNotificationEnabled());
            }
            if (model.wasPropertyExplicitlySet("members")) {
                this.members(model.getMembers());
            }
            if (model.wasPropertyExplicitlySet("repeatNotificationDuration")) {
                this.repeatNotificationDuration(model.getRepeatNotificationDuration());
            }
            if (model.wasPropertyExplicitlySet("messageFormat")) {
                this.messageFormat(model.getMessageFormat());
            }
            if (model.wasPropertyExplicitlySet("totalAlarmConditions")) {
                this.totalAlarmConditions(model.getTotalAlarmConditions());
            }
            if (model.wasPropertyExplicitlySet("totalAppliedAlarmConditions")) {
                this.totalAppliedAlarmConditions(model.getTotalAppliedAlarmConditions());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitoringTemplate
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitoringTemplate
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name for the monitoring template. It should be unique, and it's mutable in nature. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the monitoring template. It should be unique, and it's mutable in nature. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Tenant Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * Tenant Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    /**
     * The OCID of the compartment containing the monitoringTemplate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the monitoringTemplate.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly description for the monitoring template. It does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description for the monitoring template. It does not have to be unique, and it's changeable. Avoid entering confidential information.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The current status of the monitoring template i.e. whether it is Applied or NotApplied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final MonitoringTemplateLifeCycleDetails status;

    /**
     * The current status of the monitoring template i.e. whether it is Applied or NotApplied.
     * @return the value
     **/
    public MonitoringTemplateLifeCycleDetails getStatus() {
        return status;
    }

    /**
     * The current lifecycle state of the monitoring template.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MonitoringTemplateLifeCycleStates lifecycleState;

    /**
     * The current lifecycle state of the monitoring template.
     * @return the value
     **/
    public MonitoringTemplateLifeCycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A list of destinations for alarm notifications. Each destination is represented by the OCID of a related resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinations")
    private final java.util.List<String> destinations;

    /**
     * A list of destinations for alarm notifications. Each destination is represented by the OCID of a related resource.
     * @return the value
     **/
    public java.util.List<String> getDestinations() {
        return destinations;
    }

    /**
     * Whether the alarm is enabled or disabled. Default value is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAlarmsEnabled")
    private final Boolean isAlarmsEnabled;

    /**
     * Whether the alarm is enabled or disabled. Default value is enabled.
     * @return the value
     **/
    public Boolean getIsAlarmsEnabled() {
        return isAlarmsEnabled;
    }

    /**
     * Whether the alarm notification is enabled or disabled, it will be Enabled by default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSplitNotificationEnabled")
    private final Boolean isSplitNotificationEnabled;

    /**
     * Whether the alarm notification is enabled or disabled, it will be Enabled by default.
     * @return the value
     **/
    public Boolean getIsSplitNotificationEnabled() {
        return isSplitNotificationEnabled;
    }

    /**
     * List of members of this monitoring template.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("members")
    private final java.util.List<MemberReference> members;

    /**
     * List of members of this monitoring template.
     * @return the value
     **/
    public java.util.List<MemberReference> getMembers() {
        return members;
    }

    /**
     * The frequency for re-submitting alarm notifications, if the alarm keeps firing without interruption. Format defined by ISO 8601. For example, PT4H indicates four hours. Minimum- PT1M. Maximum - P30D.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repeatNotificationDuration")
    private final String repeatNotificationDuration;

    /**
     * The frequency for re-submitting alarm notifications, if the alarm keeps firing without interruption. Format defined by ISO 8601. For example, PT4H indicates four hours. Minimum- PT1M. Maximum - P30D.
     * @return the value
     **/
    public String getRepeatNotificationDuration() {
        return repeatNotificationDuration;
    }

    /**
     * The format to use for alarm notifications.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
    private final MessageFormat messageFormat;

    /**
     * The format to use for alarm notifications.
     * @return the value
     **/
    public MessageFormat getMessageFormat() {
        return messageFormat;
    }

    /**
     * Total Alarm Conditions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalAlarmConditions")
    private final Float totalAlarmConditions;

    /**
     * Total Alarm Conditions
     * @return the value
     **/
    public Float getTotalAlarmConditions() {
        return totalAlarmConditions;
    }

    /**
     * Total Applied Alarm Conditions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalAppliedAlarmConditions")
    private final Float totalAppliedAlarmConditions;

    /**
     * Total Applied Alarm Conditions
     * @return the value
     **/
    public Float getTotalAppliedAlarmConditions() {
        return totalAppliedAlarmConditions;
    }

    /**
     * The date and time the monitoringTemplate was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the monitoringTemplate was created. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the monitoringTemplate was last updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the monitoringTemplate was last updated. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("MonitoringTemplate(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", destinations=").append(String.valueOf(this.destinations));
        sb.append(", isAlarmsEnabled=").append(String.valueOf(this.isAlarmsEnabled));
        sb.append(", isSplitNotificationEnabled=")
                .append(String.valueOf(this.isSplitNotificationEnabled));
        sb.append(", members=").append(String.valueOf(this.members));
        sb.append(", repeatNotificationDuration=")
                .append(String.valueOf(this.repeatNotificationDuration));
        sb.append(", messageFormat=").append(String.valueOf(this.messageFormat));
        sb.append(", totalAlarmConditions=").append(String.valueOf(this.totalAlarmConditions));
        sb.append(", totalAppliedAlarmConditions=")
                .append(String.valueOf(this.totalAppliedAlarmConditions));
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
        if (!(o instanceof MonitoringTemplate)) {
            return false;
        }

        MonitoringTemplate other = (MonitoringTemplate) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.destinations, other.destinations)
                && java.util.Objects.equals(this.isAlarmsEnabled, other.isAlarmsEnabled)
                && java.util.Objects.equals(
                        this.isSplitNotificationEnabled, other.isSplitNotificationEnabled)
                && java.util.Objects.equals(this.members, other.members)
                && java.util.Objects.equals(
                        this.repeatNotificationDuration, other.repeatNotificationDuration)
                && java.util.Objects.equals(this.messageFormat, other.messageFormat)
                && java.util.Objects.equals(this.totalAlarmConditions, other.totalAlarmConditions)
                && java.util.Objects.equals(
                        this.totalAppliedAlarmConditions, other.totalAppliedAlarmConditions)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.destinations == null ? 43 : this.destinations.hashCode());
        result =
                (result * PRIME)
                        + (this.isAlarmsEnabled == null ? 43 : this.isAlarmsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isSplitNotificationEnabled == null
                                ? 43
                                : this.isSplitNotificationEnabled.hashCode());
        result = (result * PRIME) + (this.members == null ? 43 : this.members.hashCode());
        result =
                (result * PRIME)
                        + (this.repeatNotificationDuration == null
                                ? 43
                                : this.repeatNotificationDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.messageFormat == null ? 43 : this.messageFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.totalAlarmConditions == null
                                ? 43
                                : this.totalAlarmConditions.hashCode());
        result =
                (result * PRIME)
                        + (this.totalAppliedAlarmConditions == null
                                ? 43
                                : this.totalAppliedAlarmConditions.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
