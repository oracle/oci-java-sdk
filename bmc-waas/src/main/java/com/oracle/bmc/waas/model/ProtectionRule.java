/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The protection rule settings. Protection rules can allow, block, or trigger an alert if a request
 * meets the parameters of an applied rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProtectionRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProtectionRule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modSecurityRuleIds",
        "name",
        "description",
        "action",
        "labels",
        "exclusions"
    })
    public ProtectionRule(
            String key,
            java.util.List<String> modSecurityRuleIds,
            String name,
            String description,
            Action action,
            java.util.List<String> labels,
            java.util.List<ProtectionRuleExclusion> exclusions) {
        super();
        this.key = key;
        this.modSecurityRuleIds = modSecurityRuleIds;
        this.name = name;
        this.description = description;
        this.action = action;
        this.labels = labels;
        this.exclusions = exclusions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique key of the protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key of the protection rule.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
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
        /** The name of the protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the protection rule.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The description of the protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the protection rule.
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
         * The action to take when the traffic is detected as malicious. If unspecified, defaults to
         * {@code OFF}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to take when the traffic is detected as malicious. If unspecified, defaults to
         * {@code OFF}.
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
         * The list of labels for the protection rule.
         *
         * <p>*Note:** Protection rules with a {@code ResponseBody} label will have no effect unless
         * {@code isResponseInspected} is true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * The list of labels for the protection rule.
         *
         * <p>*Note:** Protection rules with a {@code ResponseBody} label will have no effect unless
         * {@code isResponseInspected} is true.
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
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

        public ProtectionRule build() {
            ProtectionRule model =
                    new ProtectionRule(
                            this.key,
                            this.modSecurityRuleIds,
                            this.name,
                            this.description,
                            this.action,
                            this.labels,
                            this.exclusions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionRule model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modSecurityRuleIds")) {
                this.modSecurityRuleIds(model.getModSecurityRuleIds());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
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

    /** The unique key of the protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key of the protection rule.
     *
     * @return the value
     */
    public String getKey() {
        return key;
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

    /** The name of the protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the protection rule.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The description of the protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the protection rule.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The action to take when the traffic is detected as malicious. If unspecified, defaults to
     * {@code OFF}.
     */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Off("OFF"),
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
     * The action to take when the traffic is detected as malicious. If unspecified, defaults to
     * {@code OFF}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to take when the traffic is detected as malicious. If unspecified, defaults to
     * {@code OFF}.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * The list of labels for the protection rule.
     *
     * <p>*Note:** Protection rules with a {@code ResponseBody} label will have no effect unless
     * {@code isResponseInspected} is true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * The list of labels for the protection rule.
     *
     * <p>*Note:** Protection rules with a {@code ResponseBody} label will have no effect unless
     * {@code isResponseInspected} is true.
     *
     * @return the value
     */
    public java.util.List<String> getLabels() {
        return labels;
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
        sb.append("ProtectionRule(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modSecurityRuleIds=").append(String.valueOf(this.modSecurityRuleIds));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", exclusions=").append(String.valueOf(this.exclusions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProtectionRule)) {
            return false;
        }

        ProtectionRule other = (ProtectionRule) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modSecurityRuleIds, other.modSecurityRuleIds)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.exclusions, other.exclusions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.modSecurityRuleIds == null
                                ? 43
                                : this.modSecurityRuleIds.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result = (result * PRIME) + (this.exclusions == null ? 43 : this.exclusions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
