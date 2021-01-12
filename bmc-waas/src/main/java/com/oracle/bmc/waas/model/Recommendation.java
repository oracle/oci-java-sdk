/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A recommended protection rule for a web application. This recommendation can be accepted to apply it to the Web Application Firewall configuration for this policy.
 * <p>
 * Use the `POST /waasPolicies/{waasPolicyId}/actions/acceptWafConfigRecommendations` method to accept recommended protection rules.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Recommendation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Recommendation {
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

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
        private String recommendedAction;

        public Builder recommendedAction(String recommendedAction) {
            this.recommendedAction = recommendedAction;
            this.__explicitlySet__.add("recommendedAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Recommendation build() {
            Recommendation __instance__ =
                    new Recommendation(
                            key, modSecurityRuleIds, name, description, labels, recommendedAction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Recommendation o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modSecurityRuleIds(o.getModSecurityRuleIds())
                            .name(o.getName())
                            .description(o.getDescription())
                            .labels(o.getLabels())
                            .recommendedAction(o.getRecommendedAction());

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
     * The unique key for the recommended protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The list of the ModSecurity rule IDs associated with the protection rule.
     * For more information about ModSecurity's open source WAF rules, see [Mod Security's documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modSecurityRuleIds")
    java.util.List<String> modSecurityRuleIds;

    /**
     * The name of the recommended protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The description of the recommended protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The list of labels for the recommended protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    java.util.List<String> labels;

    /**
     * The recommended action to apply to the protection rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
    String recommendedAction;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
