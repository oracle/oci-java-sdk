/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * A TargetResponderRecipeResponderRule resource contains a specific instance of a single responder
 * rule.
 *
 * <p>A TargetResponderRecipeRule resource: * Is effectively a copy of a ResponderRecipeRule
 * resource in which users can make certain changes if it\u2019s Oracle-managed, and other changes
 * if it\u2019s user-managed. * Is visible on the Cloud Guard Targets, Target Details page. * Is
 * effectively located in a specific OCI compartment, through the ThreatResponderRecipe resource to
 * which it belongs. * Can be modified by users, programmatically or through the UI. * Changes that
 * can be made here apply locally, to resources in OCI compartments mapped to the target that
 * attaches the associated responder recipe (in a TargetResponderRecipe resource), and override any
 * changes made in rules associated with the corresponding ResponderRecipe resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TargetResponderRecipeResponderRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TargetResponderRecipeResponderRule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "responderRuleId",
        "displayName",
        "description",
        "type",
        "policies",
        "supportedModes",
        "details",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails"
    })
    public TargetResponderRecipeResponderRule(
            String responderRuleId,
            String displayName,
            String description,
            ResponderType type,
            java.util.List<String> policies,
            java.util.List<SupportedModes> supportedModes,
            ResponderRuleDetails details,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.responderRuleId = responderRuleId;
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.policies = policies;
        this.supportedModes = supportedModes;
        this.details = details;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the responder rule */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
        private String responderRuleId;

        /**
         * Unique identifier for the responder rule
         *
         * @param responderRuleId the value to set
         * @return this builder
         */
        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            this.__explicitlySet__.add("responderRuleId");
            return this;
        }
        /** Responder rule display name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Responder rule display name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Responder rule description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Responder rule description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Type of responder */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private ResponderType type;

        /**
         * Type of responder
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(ResponderType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** List of policies */
        @com.fasterxml.jackson.annotation.JsonProperty("policies")
        private java.util.List<String> policies;

        /**
         * List of policies
         *
         * @param policies the value to set
         * @return this builder
         */
        public Builder policies(java.util.List<String> policies) {
            this.policies = policies;
            this.__explicitlySet__.add("policies");
            return this;
        }
        /** Supported execution modes for the responder rule */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedModes")
        private java.util.List<SupportedModes> supportedModes;

        /**
         * Supported execution modes for the responder rule
         *
         * @param supportedModes the value to set
         * @return this builder
         */
        public Builder supportedModes(java.util.List<SupportedModes> supportedModes) {
            this.supportedModes = supportedModes;
            this.__explicitlySet__.add("supportedModes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private ResponderRuleDetails details;

        public Builder details(ResponderRuleDetails details) {
            this.details = details;
            this.__explicitlySet__.add("details");
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
        /**
         * The date and time the target responder recipe rule was created. Format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the target responder recipe rule was created. Format defined by
         * RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the target responder recipe rule was last updated. Format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the target responder recipe rule was last updated. Format defined by
         * RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current lifecycle state of the responder rule */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the responder rule
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetResponderRecipeResponderRule build() {
            TargetResponderRecipeResponderRule model =
                    new TargetResponderRecipeResponderRule(
                            this.responderRuleId,
                            this.displayName,
                            this.description,
                            this.type,
                            this.policies,
                            this.supportedModes,
                            this.details,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetResponderRecipeResponderRule model) {
            if (model.wasPropertyExplicitlySet("responderRuleId")) {
                this.responderRuleId(model.getResponderRuleId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("policies")) {
                this.policies(model.getPolicies());
            }
            if (model.wasPropertyExplicitlySet("supportedModes")) {
                this.supportedModes(model.getSupportedModes());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** Unique identifier for the responder rule */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    private final String responderRuleId;

    /**
     * Unique identifier for the responder rule
     *
     * @return the value
     */
    public String getResponderRuleId() {
        return responderRuleId;
    }

    /** Responder rule display name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Responder rule display name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Responder rule description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Responder rule description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Type of responder */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final ResponderType type;

    /**
     * Type of responder
     *
     * @return the value
     */
    public ResponderType getType() {
        return type;
    }

    /** List of policies */
    @com.fasterxml.jackson.annotation.JsonProperty("policies")
    private final java.util.List<String> policies;

    /**
     * List of policies
     *
     * @return the value
     */
    public java.util.List<String> getPolicies() {
        return policies;
    }

    /** */
    public enum SupportedModes implements com.oracle.bmc.http.internal.BmcEnum {
        Autoaction("AUTOACTION"),
        Useraction("USERACTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SupportedModes.class);

        private final String value;
        private static java.util.Map<String, SupportedModes> map;

        static {
            map = new java.util.HashMap<>();
            for (SupportedModes v : SupportedModes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SupportedModes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SupportedModes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SupportedModes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Supported execution modes for the responder rule */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedModes")
    private final java.util.List<SupportedModes> supportedModes;

    /**
     * Supported execution modes for the responder rule
     *
     * @return the value
     */
    public java.util.List<SupportedModes> getSupportedModes() {
        return supportedModes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final ResponderRuleDetails details;

    public ResponderRuleDetails getDetails() {
        return details;
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

    /**
     * The date and time the target responder recipe rule was created. Format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the target responder recipe rule was created. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the target responder recipe rule was last updated. Format defined by
     * RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the target responder recipe rule was last updated. Format defined by
     * RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current lifecycle state of the responder rule */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the responder rule
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
        sb.append("TargetResponderRecipeResponderRule(");
        sb.append("super=").append(super.toString());
        sb.append("responderRuleId=").append(String.valueOf(this.responderRuleId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", policies=").append(String.valueOf(this.policies));
        sb.append(", supportedModes=").append(String.valueOf(this.supportedModes));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetResponderRecipeResponderRule)) {
            return false;
        }

        TargetResponderRecipeResponderRule other = (TargetResponderRecipeResponderRule) o;
        return java.util.Objects.equals(this.responderRuleId, other.responderRuleId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.policies, other.policies)
                && java.util.Objects.equals(this.supportedModes, other.supportedModes)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.responderRuleId == null ? 43 : this.responderRuleId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.policies == null ? 43 : this.policies.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedModes == null ? 43 : this.supportedModes.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
