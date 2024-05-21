/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.events.model;

/**
 * Object used to create a rule.
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
    builder = CreateRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateRuleDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "isEnabled",
        "condition",
        "compartmentId",
        "actions",
        "freeformTags",
        "definedTags"
    })
    public CreateRuleDetails(
            String displayName,
            String description,
            Boolean isEnabled,
            String condition,
            String compartmentId,
            ActionDetailsList actions,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.isEnabled = isEnabled;
        this.condition = condition;
        this.compartmentId = compartmentId;
        this.actions = actions;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A string that describes the rule. It does not have to be unique, and you can change it. Avoid entering
         * confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A string that describes the rule. It does not have to be unique, and you can change it. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A string that describes the details of the rule. It does not have to be unique, and you can change it. Avoid entering
         * confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A string that describes the details of the rule. It does not have to be unique, and you can change it. Avoid entering
         * confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Whether or not this rule is currently enabled.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether or not this rule is currently enabled.
         * <p>
         * Example: {@code true}
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * A filter that specifies the event that will trigger actions associated with this rule. A few
         * important things to remember about filters:
         * <p>
         * Fields not mentioned in the condition are ignored. You can create a valid filter that matches
         * all events with two curly brackets: {@code {}}
         * <p>
         * For more examples, see
         * [Matching Events with Filters](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/filterevents.htm).
         * * For a condition with fields to match an event, the event must contain all the field names
         * listed in the condition. Field names must appear in the condition with the same nesting
         * structure used in the event.
         * <p>
         * For a list of reference events, see
         * [Services that Produce Events](https://docs.cloud.oracle.com/iaas/Content/Events/Reference/eventsproducers.htm).
         * * Rules apply to events in the compartment in which you create them and any child compartments.
         * This means that a condition specified by a rule only matches events emitted from resources in
         * the compartment or any of its child compartments.
         * * Wildcard matching is supported with the asterisk (*) character.
         * <p>
         * For examples of wildcard matching, see
         * [Matching Events with Filters](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/filterevents.htm)
         * <p>
         * Example: {@code \\"eventType\\": \\"com.oraclecloud.databaseservice.autonomous.database.backup.end\\"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        /**
         * A filter that specifies the event that will trigger actions associated with this rule. A few
         * important things to remember about filters:
         * <p>
         * Fields not mentioned in the condition are ignored. You can create a valid filter that matches
         * all events with two curly brackets: {@code {}}
         * <p>
         * For more examples, see
         * [Matching Events with Filters](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/filterevents.htm).
         * * For a condition with fields to match an event, the event must contain all the field names
         * listed in the condition. Field names must appear in the condition with the same nesting
         * structure used in the event.
         * <p>
         * For a list of reference events, see
         * [Services that Produce Events](https://docs.cloud.oracle.com/iaas/Content/Events/Reference/eventsproducers.htm).
         * * Rules apply to events in the compartment in which you create them and any child compartments.
         * This means that a condition specified by a rule only matches events emitted from resources in
         * the compartment or any of its child compartments.
         * * Wildcard matching is supported with the asterisk (*) character.
         * <p>
         * For examples of wildcard matching, see
         * [Matching Events with Filters](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/filterevents.htm)
         * <p>
         * Example: {@code \\"eventType\\": \\"com.oraclecloud.databaseservice.autonomous.database.backup.end\\"}
         *
         * @param condition the value to set
         * @return this builder
         **/
        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to which this rule belongs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to which this rule belongs.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actions")
        private ActionDetailsList actions;

        public Builder actions(ActionDetailsList actions) {
            this.actions = actions;
            this.__explicitlySet__.add("actions");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. Exists for cross-compatibility only.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. Exists for cross-compatibility only.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        public CreateRuleDetails build() {
            CreateRuleDetails model =
                    new CreateRuleDetails(
                            this.displayName,
                            this.description,
                            this.isEnabled,
                            this.condition,
                            this.compartmentId,
                            this.actions,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRuleDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("actions")) {
                this.actions(model.getActions());
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
     * A string that describes the rule. It does not have to be unique, and you can change it. Avoid entering
     * confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A string that describes the rule. It does not have to be unique, and you can change it. Avoid entering
     * confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A string that describes the details of the rule. It does not have to be unique, and you can change it. Avoid entering
     * confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A string that describes the details of the rule. It does not have to be unique, and you can change it. Avoid entering
     * confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Whether or not this rule is currently enabled.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether or not this rule is currently enabled.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * A filter that specifies the event that will trigger actions associated with this rule. A few
     * important things to remember about filters:
     * <p>
     * Fields not mentioned in the condition are ignored. You can create a valid filter that matches
     * all events with two curly brackets: {@code {}}
     * <p>
     * For more examples, see
     * [Matching Events with Filters](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/filterevents.htm).
     * * For a condition with fields to match an event, the event must contain all the field names
     * listed in the condition. Field names must appear in the condition with the same nesting
     * structure used in the event.
     * <p>
     * For a list of reference events, see
     * [Services that Produce Events](https://docs.cloud.oracle.com/iaas/Content/Events/Reference/eventsproducers.htm).
     * * Rules apply to events in the compartment in which you create them and any child compartments.
     * This means that a condition specified by a rule only matches events emitted from resources in
     * the compartment or any of its child compartments.
     * * Wildcard matching is supported with the asterisk (*) character.
     * <p>
     * For examples of wildcard matching, see
     * [Matching Events with Filters](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/filterevents.htm)
     * <p>
     * Example: {@code \\"eventType\\": \\"com.oraclecloud.databaseservice.autonomous.database.backup.end\\"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final String condition;

    /**
     * A filter that specifies the event that will trigger actions associated with this rule. A few
     * important things to remember about filters:
     * <p>
     * Fields not mentioned in the condition are ignored. You can create a valid filter that matches
     * all events with two curly brackets: {@code {}}
     * <p>
     * For more examples, see
     * [Matching Events with Filters](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/filterevents.htm).
     * * For a condition with fields to match an event, the event must contain all the field names
     * listed in the condition. Field names must appear in the condition with the same nesting
     * structure used in the event.
     * <p>
     * For a list of reference events, see
     * [Services that Produce Events](https://docs.cloud.oracle.com/iaas/Content/Events/Reference/eventsproducers.htm).
     * * Rules apply to events in the compartment in which you create them and any child compartments.
     * This means that a condition specified by a rule only matches events emitted from resources in
     * the compartment or any of its child compartments.
     * * Wildcard matching is supported with the asterisk (*) character.
     * <p>
     * For examples of wildcard matching, see
     * [Matching Events with Filters](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/filterevents.htm)
     * <p>
     * Example: {@code \\"eventType\\": \\"com.oraclecloud.databaseservice.autonomous.database.backup.end\\"}
     *
     * @return the value
     **/
    public String getCondition() {
        return condition;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to which this rule belongs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to which this rule belongs.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    private final ActionDetailsList actions;

    public ActionDetailsList getActions() {
        return actions;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. Exists for cross-compatibility only.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. Exists for cross-compatibility only.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("CreateRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", actions=").append(String.valueOf(this.actions));
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
        if (!(o instanceof CreateRuleDetails)) {
            return false;
        }

        CreateRuleDetails other = (CreateRuleDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.actions, other.actions)
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
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.actions == null ? 43 : this.actions.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
