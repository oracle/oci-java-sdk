/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyPriorityRule.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ruleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SteeringPolicyPriorityRule extends SteeringPolicyRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cases")
        private java.util.List<SteeringPolicyPriorityRuleCase> cases;

        public Builder cases(java.util.List<SteeringPolicyPriorityRuleCase> cases) {
            this.cases = cases;
            this.__explicitlySet__.add("cases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultAnswerData")
        private java.util.List<SteeringPolicyPriorityAnswerData> defaultAnswerData;

        public Builder defaultAnswerData(
                java.util.List<SteeringPolicyPriorityAnswerData> defaultAnswerData) {
            this.defaultAnswerData = defaultAnswerData;
            this.__explicitlySet__.add("defaultAnswerData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyPriorityRule build() {
            SteeringPolicyPriorityRule __instance__ =
                    new SteeringPolicyPriorityRule(description, cases, defaultAnswerData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyPriorityRule o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .cases(o.getCases())
                            .defaultAnswerData(o.getDefaultAnswerData());

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
    public SteeringPolicyPriorityRule(
            String description,
            java.util.List<SteeringPolicyPriorityRuleCase> cases,
            java.util.List<SteeringPolicyPriorityAnswerData> defaultAnswerData) {
        super(description);
        this.cases = cases;
        this.defaultAnswerData = defaultAnswerData;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cases")
    java.util.List<SteeringPolicyPriorityRuleCase> cases;

    /**
     * Defines a default set of answer conditions and values that are applied to an answer when
     * `cases` is not defined for the rule or a matching case does not have any matching
     * `answerCondition`s in its `answerData`. `defaultAnswerData` is **not** applied if `cases` is
     * defined and there are no matching cases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultAnswerData")
    java.util.List<SteeringPolicyPriorityAnswerData> defaultAnswerData;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
