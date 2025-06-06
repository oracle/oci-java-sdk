/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A protection rule key and the associated action to apply to that rule. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProtectionRuleAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProtectionRuleAction
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The action to apply to the protection rule. If unspecified, defaults to {@code OFF}. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to apply to the protection rule. If unspecified, defaults to {@code OFF}.
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
         * The types of requests excluded from the protection rule action. If the requests matches
         * the criteria in the {@code exclusions}, the protection rule action will not be executed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
        private java.util.List<ProtectionRuleExclusion> exclusions;

        /**
         * The types of requests excluded from the protection rule action. If the requests matches
         * the criteria in the {@code exclusions}, the protection rule action will not be executed.
         *
         * @param exclusions the value to set
         * @return this builder
         */
        public Builder exclusions(java.util.List<ProtectionRuleExclusion> exclusions) {
            this.exclusions = exclusions;
            this.__explicitlySet__.add("exclusions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionRuleAction build() {
            ProtectionRuleAction model =
                    new ProtectionRuleAction(this.key, this.action, this.exclusions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionRuleAction model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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

    /** The action to apply to the protection rule. If unspecified, defaults to {@code OFF}. */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** The action to apply to the protection rule. If unspecified, defaults to {@code OFF}. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to apply to the protection rule. If unspecified, defaults to {@code OFF}.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * The types of requests excluded from the protection rule action. If the requests matches the
     * criteria in the {@code exclusions}, the protection rule action will not be executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    private final java.util.List<ProtectionRuleExclusion> exclusions;

    /**
     * The types of requests excluded from the protection rule action. If the requests matches the
     * criteria in the {@code exclusions}, the protection rule action will not be executed.
     *
     * @return the value
     */
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
        sb.append("ProtectionRuleAction(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", exclusions=").append(String.valueOf(this.exclusions));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.exclusions == null ? 43 : this.exclusions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
