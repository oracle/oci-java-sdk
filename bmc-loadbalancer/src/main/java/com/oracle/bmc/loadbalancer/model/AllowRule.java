/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Configuration of an access control rule that permits access to the application
 * resources exposed by a listener based on user specified match conditions.
 * <p>
 * This rule applies to only HTTP listeners.
 * <p>
 * Atleast one match condition should be specified in the rule.
 * <p>
 **NOTE:** When user does not specify any access control rules, the implicit default rule is to allow all traffic.
 * **NOTE:** When user adds any access control rules, all the traffic not matching with any rules will be implicitly denied.
 * **NOTE:** User can specify this rule only with the following combinations of RuleCondition types:
 *             - [\"SOURCE_IP_ADDRESS\"]
 *             - [\"SOURCE_VCN_ID\"]
 *             - [\"SOURCE_VCN_ID\", \"SOURCE_VCN_IP_ADDRESS\"]
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AllowRule.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AllowRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("conditions")
        private java.util.List<RuleCondition> conditions;

        public Builder conditions(java.util.List<RuleCondition> conditions) {
            this.conditions = conditions;
            this.__explicitlySet__.add("conditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllowRule build() {
            AllowRule __instance__ = new AllowRule(conditions, description);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowRule o) {
            Builder copiedBuilder = conditions(o.getConditions()).description(o.getDescription());

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

    @Deprecated
    public AllowRule(java.util.List<RuleCondition> conditions, String description) {
        super();
        this.conditions = conditions;
        this.description = description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    java.util.List<RuleCondition> conditions;

    /**
     * Brief description of the access control rule.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
