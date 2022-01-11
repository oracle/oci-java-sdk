/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An ordered list of routing rules.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateRoutingPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateRoutingPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionLanguageVersion")
        private ConditionLanguageVersion conditionLanguageVersion;

        public Builder conditionLanguageVersion(ConditionLanguageVersion conditionLanguageVersion) {
            this.conditionLanguageVersion = conditionLanguageVersion;
            this.__explicitlySet__.add("conditionLanguageVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<RoutingRule> rules;

        public Builder rules(java.util.List<RoutingRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateRoutingPolicyDetails build() {
            CreateRoutingPolicyDetails __instance__ =
                    new CreateRoutingPolicyDetails(name, conditionLanguageVersion, rules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRoutingPolicyDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .conditionLanguageVersion(o.getConditionLanguageVersion())
                            .rules(o.getRules());

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
     * The name for this list of routing rules. It must be unique and it cannot be changed. Avoid entering
     * confidential information.
     * <p>
     * Example: {@code example_routing_rules}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The version of the language in which {@code condition} of {@code rules} are composed.
     *
     **/
    public enum ConditionLanguageVersion {
        V1("V1"),
        ;

        private final String value;
        private static java.util.Map<String, ConditionLanguageVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (ConditionLanguageVersion v : ConditionLanguageVersion.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConditionLanguageVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConditionLanguageVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConditionLanguageVersion: " + key);
        }
    };
    /**
     * The version of the language in which {@code condition} of {@code rules} are composed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionLanguageVersion")
    ConditionLanguageVersion conditionLanguageVersion;

    /**
     * The list of routing rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    java.util.List<RoutingRule> rules;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
