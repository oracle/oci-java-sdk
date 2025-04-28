/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Rule that represents RequestRateLimitingConfigurations. Only actions of the following types are
 * allowed to be referenced in this rule: * CHECK * RETURN_HTTP_RESPONSE <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestRateLimitingRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
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
         * Rate Limiting Configurations. Each configuration counts requests towards its own {@code
         * requestsLimit}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<RequestRateLimitingConfiguration> configurations;

        /**
         * Rate Limiting Configurations. Each configuration counts requests towards its own {@code
         * requestsLimit}.
         *
         * @param configurations the value to set
         * @return this builder
         */
        public Builder configurations(
                java.util.List<RequestRateLimitingConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestRateLimitingRule build() {
            RequestRateLimitingRule model =
                    new RequestRateLimitingRule(
                            this.name,
                            this.conditionLanguage,
                            this.condition,
                            this.actionName,
                            this.configurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestRateLimitingRule model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("conditionLanguage")) {
                this.conditionLanguage(model.getConditionLanguage());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("actionName")) {
                this.actionName(model.getActionName());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
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
     * Rate Limiting Configurations. Each configuration counts requests towards its own {@code
     * requestsLimit}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<RequestRateLimitingConfiguration> configurations;

    /**
     * Rate Limiting Configurations. Each configuration counts requests towards its own {@code
     * requestsLimit}.
     *
     * @return the value
     */
    public java.util.List<RequestRateLimitingConfiguration> getConfigurations() {
        return configurations;
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
        sb.append("RequestRateLimitingRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        return result;
    }
}
