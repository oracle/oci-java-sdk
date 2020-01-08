/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * The protection rule settings. Protection rules can allow, block, or trigger an alert if a request meets the parameters of an applied rule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProtectionRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ProtectionRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modSecurityRuleIds")
        private java.util.List<String> modSecurityRuleIds;

        public Builder modSecurityRuleIds(java.util.List<String> modSecurityRuleIds) {
            this.modSecurityRuleIds = modSecurityRuleIds;
            this.__explicitlySet__.add("modSecurityRuleIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

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
            ProtectionRule __instance__ =
                    new ProtectionRule(
                            key, modSecurityRuleIds, name, description, action, labels, exclusions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionRule o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modSecurityRuleIds(o.getModSecurityRuleIds())
                            .name(o.getName())
                            .description(o.getDescription())
                            .action(o.getAction())
                            .labels(o.getLabels())
                            .exclusions(o.getExclusions());

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

    /**
     * The unique key of the protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The list of the ModSecurity rule IDs that apply to this protection rule. For more information about ModSecurity's open source WAF rules, see [Mod Security's documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modSecurityRuleIds")
    java.util.List<String> modSecurityRuleIds;

    /**
     * The name of the protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The description of the protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
    /**
     * The action to take when the traffic is detected as malicious. If unspecified, defaults to `OFF`.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Action {
        Off("OFF"),
        Detect("DETECT"),
        Block("BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The action to take when the traffic is detected as malicious. If unspecified, defaults to `OFF`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;

    /**
     * The list of labels for the protection rule.
     * <p>
     **Note:** Protection rules with a `ResponseBody` label will have no effect unless `isResponseInspected` is true.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    java.util.List<String> labels;

    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    java.util.List<ProtectionRuleExclusion> exclusions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
