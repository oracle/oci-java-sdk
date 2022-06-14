/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A protection rule key and the associated action to apply to that rule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProtectionRuleAction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProtectionRuleAction {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "action", "exclusions"})
    public ProtectionRuleAction(
            String key, Action action, java.util.List<ProtectionRuleExclusion> exclusions) {
        super();
        this.key = key;
        this.action = action;
        this.exclusions = exclusions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key of the protection rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key of the protection rule.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The action to apply to the protection rule. If unspecified, defaults to {@code OFF}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to apply to the protection rule. If unspecified, defaults to {@code OFF}.
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The types of requests excluded from the protection rule action. If the requests matches the criteria in the {@code exclusions}, the protection rule action will not be executed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
        private java.util.List<ProtectionRuleExclusion> exclusions;

        /**
         * The types of requests excluded from the protection rule action. If the requests matches the criteria in the {@code exclusions}, the protection rule action will not be executed.
         * @param exclusions the value to set
         * @return this builder
         **/
        public Builder exclusions(java.util.List<ProtectionRuleExclusion> exclusions) {
            this.exclusions = exclusions;
            this.__explicitlySet__.add("exclusions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionRuleAction build() {
            ProtectionRuleAction __instance__ = new ProtectionRuleAction(key, action, exclusions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionRuleAction o) {
            Builder copiedBuilder =
                    key(o.getKey()).action(o.getAction()).exclusions(o.getExclusions());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The unique key of the protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key of the protection rule.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The action to apply to the protection rule. If unspecified, defaults to {@code OFF}.
     **/
    public enum Action {
        Off("OFF"),
        Detect("DETECT"),
        Block("BLOCK"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /**
     * The action to apply to the protection rule. If unspecified, defaults to {@code OFF}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to apply to the protection rule. If unspecified, defaults to {@code OFF}.
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * The types of requests excluded from the protection rule action. If the requests matches the criteria in the {@code exclusions}, the protection rule action will not be executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    private final java.util.List<ProtectionRuleExclusion> exclusions;

    /**
     * The types of requests excluded from the protection rule action. If the requests matches the criteria in the {@code exclusions}, the protection rule action will not be executed.
     * @return the value
     **/
    public java.util.List<ProtectionRuleExclusion> getExclusions() {
        return exclusions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProtectionRuleAction(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", exclusions=").append(String.valueOf(this.exclusions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProtectionRuleAction)) {
            return false;
        }

        ProtectionRuleAction other = (ProtectionRuleAction) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.exclusions, other.exclusions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.exclusions == null ? 43 : this.exclusions.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
