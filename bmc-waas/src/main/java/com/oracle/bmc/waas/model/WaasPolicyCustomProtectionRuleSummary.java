/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The OCID and action of a custom protection rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WaasPolicyCustomProtectionRuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class WaasPolicyCustomProtectionRuleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "action",
        "modSecurityRuleIds",
        "exclusions"
    })
    public WaasPolicyCustomProtectionRuleSummary(
            String id,
            String displayName,
            Action action,
            java.util.List<String> modSecurityRuleIds,
            java.util.List<ProtectionRuleExclusion> exclusions) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.action = action;
        this.modSecurityRuleIds = modSecurityRuleIds;
        this.exclusions = exclusions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * custom protection rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * custom protection rule.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The user-friendly name of the custom protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name of the custom protection rule.
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
         * The action to take when the custom protection rule is triggered. {@code DETECT} - Logs
         * the request when the criteria of the custom protection rule are met. {@code BLOCK} -
         * Blocks the request when the criteria of the custom protection rule are met.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to take when the custom protection rule is triggered. {@code DETECT} - Logs
         * the request when the criteria of the custom protection rule are met. {@code BLOCK} -
         * Blocks the request when the criteria of the custom protection rule are met.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The list of the ModSecurity rule IDs that apply to this protection rule. For more
         * information about ModSecurity's open source WAF rules, see [Mod Security's
         * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modSecurityRuleIds")
        private java.util.List<String> modSecurityRuleIds;

        /**
         * The list of the ModSecurity rule IDs that apply to this protection rule. For more
         * information about ModSecurity's open source WAF rules, see [Mod Security's
         * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
         *
         * @param modSecurityRuleIds the value to set
         * @return this builder
         */
        public Builder modSecurityRuleIds(java.util.List<String> modSecurityRuleIds) {
            this.modSecurityRuleIds = modSecurityRuleIds;
            this.__explicitlySet__.add("modSecurityRuleIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
        private java.util.List<ProtectionRuleExclusion> exclusions;

        public Builder exclusions(java.util.List<ProtectionRuleExclusion> exclusions) {
            this.exclusions = exclusions;
            this.__explicitlySet__.add("exclusions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WaasPolicyCustomProtectionRuleSummary build() {
            WaasPolicyCustomProtectionRuleSummary model =
                    new WaasPolicyCustomProtectionRuleSummary(
                            this.id,
                            this.displayName,
                            this.action,
                            this.modSecurityRuleIds,
                            this.exclusions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WaasPolicyCustomProtectionRuleSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("modSecurityRuleIds")) {
                this.modSecurityRuleIds(model.getModSecurityRuleIds());
            }
            if (model.wasPropertyExplicitlySet("exclusions")) {
                this.exclusions(model.getExclusions());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * custom protection rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * custom protection rule.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-friendly name of the custom protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name of the custom protection rule.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The action to take when the custom protection rule is triggered. {@code DETECT} - Logs the
     * request when the criteria of the custom protection rule are met. {@code BLOCK} - Blocks the
     * request when the criteria of the custom protection rule are met.
     */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Detect("DETECT"),
        Block("BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action to take when the custom protection rule is triggered. {@code DETECT} - Logs the
     * request when the criteria of the custom protection rule are met. {@code BLOCK} - Blocks the
     * request when the criteria of the custom protection rule are met.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to take when the custom protection rule is triggered. {@code DETECT} - Logs the
     * request when the criteria of the custom protection rule are met. {@code BLOCK} - Blocks the
     * request when the criteria of the custom protection rule are met.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * The list of the ModSecurity rule IDs that apply to this protection rule. For more information
     * about ModSecurity's open source WAF rules, see [Mod Security's
     * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modSecurityRuleIds")
    private final java.util.List<String> modSecurityRuleIds;

    /**
     * The list of the ModSecurity rule IDs that apply to this protection rule. For more information
     * about ModSecurity's open source WAF rules, see [Mod Security's
     * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
     *
     * @return the value
     */
    public java.util.List<String> getModSecurityRuleIds() {
        return modSecurityRuleIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    private final java.util.List<ProtectionRuleExclusion> exclusions;

    public java.util.List<ProtectionRuleExclusion> getExclusions() {
        return exclusions;
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
        sb.append("WaasPolicyCustomProtectionRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", modSecurityRuleIds=").append(String.valueOf(this.modSecurityRuleIds));
        sb.append(", exclusions=").append(String.valueOf(this.exclusions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaasPolicyCustomProtectionRuleSummary)) {
            return false;
        }

        WaasPolicyCustomProtectionRuleSummary other = (WaasPolicyCustomProtectionRuleSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.modSecurityRuleIds, other.modSecurityRuleIds)
                && java.util.Objects.equals(this.exclusions, other.exclusions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.modSecurityRuleIds == null
                                ? 43
                                : this.modSecurityRuleIds.hashCode());
        result = (result * PRIME) + (this.exclusions == null ? 43 : this.exclusions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
