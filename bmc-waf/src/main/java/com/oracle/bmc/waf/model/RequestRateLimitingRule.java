/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Rule that represents RequestRateLimitingConfigurations.
 * Only actions of the following types are allowed to be referenced in this rule:
 *  * CHECK
 *  * RETURN_HTTP_RESPONSE
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestRateLimitingRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestRateLimitingRule extends WebAppFirewallPolicyRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionLanguage")
        private ConditionLanguage conditionLanguage;

        public Builder conditionLanguage(ConditionLanguage conditionLanguage) {
            this.conditionLanguage = conditionLanguage;
            this.__explicitlySet__.add("conditionLanguage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionName")
        private String actionName;

        public Builder actionName(String actionName) {
            this.actionName = actionName;
            this.__explicitlySet__.add("actionName");
            return this;
        }
        /**
         * Rate Limiting Configurations.
         * Each configuration counts requests towards its own {@code requestsLimit}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<RequestRateLimitingConfiguration> configurations;

        /**
         * Rate Limiting Configurations.
         * Each configuration counts requests towards its own {@code requestsLimit}.
         *
         * @param configurations the value to set
         * @return this builder
         **/
        public Builder configurations(
                java.util.List<RequestRateLimitingConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestRateLimitingRule build() {
            RequestRateLimitingRule __instance__ =
                    new RequestRateLimitingRule(
                            name, conditionLanguage, condition, actionName, configurations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestRateLimitingRule o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .conditionLanguage(o.getConditionLanguage())
                            .condition(o.getCondition())
                            .actionName(o.getActionName())
                            .configurations(o.getConfigurations());

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

    @Deprecated
    public RequestRateLimitingRule(
            String name,
            ConditionLanguage conditionLanguage,
            String condition,
            String actionName,
            java.util.List<RequestRateLimitingConfiguration> configurations) {
        super(name, conditionLanguage, condition, actionName);
        this.configurations = configurations;
    }

    /**
     * Rate Limiting Configurations.
     * Each configuration counts requests towards its own {@code requestsLimit}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<RequestRateLimitingConfiguration> configurations;

    /**
     * Rate Limiting Configurations.
     * Each configuration counts requests towards its own {@code requestsLimit}.
     *
     * @return the value
     **/
    public java.util.List<RequestRateLimitingConfiguration> getConfigurations() {
        return configurations;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RequestRateLimitingRule(");
        sb.append("super=").append(super.toString());
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestRateLimitingRule)) {
            return false;
        }

        RequestRateLimitingRule other = (RequestRateLimitingRule) o;
        return java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
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
