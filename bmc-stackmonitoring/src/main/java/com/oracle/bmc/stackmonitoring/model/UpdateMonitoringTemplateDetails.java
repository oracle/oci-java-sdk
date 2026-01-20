/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information about updating a monitoring template. The monitoring template displayName should
 * be unique in a compartment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMonitoringTemplateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateMonitoringTemplateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "destinations",
        "isAlarmsEnabled",
        "isSplitNotificationEnabled",
        "members",
        "repeatNotificationDuration",
        "messageFormat",
        "freeformTags",
        "definedTags"
    })
    public UpdateMonitoringTemplateDetails(
            String displayName,
            String description,
            java.util.List<String> destinations,
            Boolean isAlarmsEnabled,
            Boolean isSplitNotificationEnabled,
            java.util.List<MemberReference> members,
            String repeatNotificationDuration,
            MessageFormat messageFormat,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.destinations = destinations;
        this.isAlarmsEnabled = isAlarmsEnabled;
        this.isSplitNotificationEnabled = isSplitNotificationEnabled;
        this.members = members;
        this.repeatNotificationDuration = repeatNotificationDuration;
        this.messageFormat = messageFormat;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A user-friendly name for the monitoring template. It is unique and mutable in nature. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the monitoring template. It is unique and mutable in nature.
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
         * A user-friendly description for the monitoring template. It does not have to be unique,
         * and it's changeable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description for the monitoring template. It does not have to be unique,
         * and it's changeable.
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
         * A list of destinations for alarm notifications. Each destination is represented by the
         * OCID of a related resource
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<String> destinations;

        /**
         * A list of destinations for alarm notifications. Each destination is represented by the
         * OCID of a related resource
         *
         * @param destinations the value to set
         * @return this builder
         */
        public Builder destinations(java.util.List<String> destinations) {
            this.destinations = destinations;
            this.__explicitlySet__.add("destinations");
            return this;
        }
        /**
         * User can create the out of box alarm only for multiple resourceTypes not for individual
         * resource instances and groups for specified compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAlarmsEnabled")
        private Boolean isAlarmsEnabled;

        /**
         * User can create the out of box alarm only for multiple resourceTypes not for individual
         * resource instances and groups for specified compartment.
         *
         * @param isAlarmsEnabled the value to set
         * @return this builder
         */
        public Builder isAlarmsEnabled(Boolean isAlarmsEnabled) {
            this.isAlarmsEnabled = isAlarmsEnabled;
            this.__explicitlySet__.add("isAlarmsEnabled");
            return this;
        }
        /** Whether the alarm notification is enabled or disabled, it will be Enabled by default. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSplitNotificationEnabled")
        private Boolean isSplitNotificationEnabled;

        /**
         * Whether the alarm notification is enabled or disabled, it will be Enabled by default.
         *
         * @param isSplitNotificationEnabled the value to set
         * @return this builder
         */
        public Builder isSplitNotificationEnabled(Boolean isSplitNotificationEnabled) {
            this.isSplitNotificationEnabled = isSplitNotificationEnabled;
            this.__explicitlySet__.add("isSplitNotificationEnabled");
            return this;
        }
        /** List of members of this monitoring template. */
        @com.fasterxml.jackson.annotation.JsonProperty("members")
        private java.util.List<MemberReference> members;

        /**
         * List of members of this monitoring template.
         *
         * @param members the value to set
         * @return this builder
         */
        public Builder members(java.util.List<MemberReference> members) {
            this.members = members;
            this.__explicitlySet__.add("members");
            return this;
        }
        /**
         * The frequency for re-submitting alarm notifications, if the alarm keeps firing without
         * interruption. Format defined by ISO 8601. For example, PT4H indicates four hours.
         * Minimum- PT1M. Maximum - P30D.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repeatNotificationDuration")
        private String repeatNotificationDuration;

        /**
         * The frequency for re-submitting alarm notifications, if the alarm keeps firing without
         * interruption. Format defined by ISO 8601. For example, PT4H indicates four hours.
         * Minimum- PT1M. Maximum - P30D.
         *
         * @param repeatNotificationDuration the value to set
         * @return this builder
         */
        public Builder repeatNotificationDuration(String repeatNotificationDuration) {
            this.repeatNotificationDuration = repeatNotificationDuration;
            this.__explicitlySet__.add("repeatNotificationDuration");
            return this;
        }
        /** The format to use for alarm notifications. */
        @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
        private MessageFormat messageFormat;

        /**
         * The format to use for alarm notifications.
         *
         * @param messageFormat the value to set
         * @return this builder
         */
        public Builder messageFormat(MessageFormat messageFormat) {
            this.messageFormat = messageFormat;
            this.__explicitlySet__.add("messageFormat");
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

        public UpdateMonitoringTemplateDetails build() {
            UpdateMonitoringTemplateDetails model =
                    new UpdateMonitoringTemplateDetails(
                            this.displayName,
                            this.description,
                            this.destinations,
                            this.isAlarmsEnabled,
                            this.isSplitNotificationEnabled,
                            this.members,
                            this.repeatNotificationDuration,
                            this.messageFormat,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMonitoringTemplateDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** A user-friendly name for the monitoring template. It is unique and mutable in nature. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the monitoring template. It is unique and mutable in nature.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user-friendly description for the monitoring template. It does not have to be unique, and
     * it's changeable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description for the monitoring template. It does not have to be unique, and
     * it's changeable.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * A list of destinations for alarm notifications. Each destination is represented by the OCID
     * of a related resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinations")
    private final java.util.List<String> destinations;

    /**
     * A list of destinations for alarm notifications. Each destination is represented by the OCID
     * of a related resource
     *
     * @return the value
     */
    public java.util.List<String> getDestinations() {
        return destinations;
    }

    /**
     * User can create the out of box alarm only for multiple resourceTypes not for individual
     * resource instances and groups for specified compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAlarmsEnabled")
    private final Boolean isAlarmsEnabled;

    /**
     * User can create the out of box alarm only for multiple resourceTypes not for individual
     * resource instances and groups for specified compartment.
     *
     * @return the value
     */
    public Boolean getIsAlarmsEnabled() {
        return isAlarmsEnabled;
    }

    /** Whether the alarm notification is enabled or disabled, it will be Enabled by default. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSplitNotificationEnabled")
    private final Boolean isSplitNotificationEnabled;

    /**
     * Whether the alarm notification is enabled or disabled, it will be Enabled by default.
     *
     * @return the value
     */
    public Boolean getIsSplitNotificationEnabled() {
        return isSplitNotificationEnabled;
    }

    /** List of members of this monitoring template. */
    @com.fasterxml.jackson.annotation.JsonProperty("members")
    private final java.util.List<MemberReference> members;

    /**
     * List of members of this monitoring template.
     *
     * @return the value
     */
    public java.util.List<MemberReference> getMembers() {
        return members;
    }

    /**
     * The frequency for re-submitting alarm notifications, if the alarm keeps firing without
     * interruption. Format defined by ISO 8601. For example, PT4H indicates four hours. Minimum-
     * PT1M. Maximum - P30D.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repeatNotificationDuration")
    private final String repeatNotificationDuration;

    /**
     * The frequency for re-submitting alarm notifications, if the alarm keeps firing without
     * interruption. Format defined by ISO 8601. For example, PT4H indicates four hours. Minimum-
     * PT1M. Maximum - P30D.
     *
     * @return the value
     */
    public String getRepeatNotificationDuration() {
        return repeatNotificationDuration;
    }

    /** The format to use for alarm notifications. */
    @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
    private final MessageFormat messageFormat;

    /**
     * The format to use for alarm notifications.
     *
     * @return the value
     */
    public MessageFormat getMessageFormat() {
        return messageFormat;
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
        sb.append("UpdateMonitoringTemplateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", destinations=").append(String.valueOf(this.destinations));
        sb.append(", isAlarmsEnabled=").append(String.valueOf(this.isAlarmsEnabled));
        sb.append(", isSplitNotificationEnabled=")
                .append(String.valueOf(this.isSplitNotificationEnabled));
        sb.append(", members=").append(String.valueOf(this.members));
        sb.append(", repeatNotificationDuration=")
                .append(String.valueOf(this.repeatNotificationDuration));
        sb.append(", messageFormat=").append(String.valueOf(this.messageFormat));
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
        if (!(o instanceof UpdateMonitoringTemplateDetails)) {
            return false;
        }

        UpdateMonitoringTemplateDetails other = (UpdateMonitoringTemplateDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.destinations, other.destinations)
                && java.util.Objects.equals(this.isAlarmsEnabled, other.isAlarmsEnabled)
                && java.util.Objects.equals(
                        this.isSplitNotificationEnabled, other.isSplitNotificationEnabled)
                && java.util.Objects.equals(this.members, other.members)
                && java.util.Objects.equals(
                        this.repeatNotificationDuration, other.repeatNotificationDuration)
                && java.util.Objects.equals(this.messageFormat, other.messageFormat)
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
