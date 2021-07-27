/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the action of returning a specified response code and a redirect URI. Each RedirectRule
 * object is configured for a particular listener and a designated path.
 * <p>
 * The default response code is {@code 302 Found}.
 * <p>
 **NOTES:**
 * *  This rule applies only to HTTP listeners.
 * *  You can specify this rule only with the {@link #ruleCondition(RuleConditionRequest) ruleCondition}
 *    type {@code PATH}.
 * *  A listener can have only one RedirectRule object for a given original path. The
 *   {@link #pathMatchCondition(PathMatchConditionRequest) pathMatchCondition} {@code attributeValue} specifies the
 *   original path.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RedirectRule.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RedirectRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
        private Integer responseCode;

        public Builder responseCode(Integer responseCode) {
            this.responseCode = responseCode;
            this.__explicitlySet__.add("responseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditions")
        private java.util.List<RuleCondition> conditions;

        public Builder conditions(java.util.List<RuleCondition> conditions) {
            this.conditions = conditions;
            this.__explicitlySet__.add("conditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
        private RedirectUri redirectUri;

        public Builder redirectUri(RedirectUri redirectUri) {
            this.redirectUri = redirectUri;
            this.__explicitlySet__.add("redirectUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RedirectRule build() {
            RedirectRule __instance__ = new RedirectRule(responseCode, conditions, redirectUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RedirectRule o) {
            Builder copiedBuilder =
                    responseCode(o.getResponseCode())
                            .conditions(o.getConditions())
                            .redirectUri(o.getRedirectUri());

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
    public RedirectRule(
            Integer responseCode,
            java.util.List<RuleCondition> conditions,
            RedirectUri redirectUri) {
        super();
        this.responseCode = responseCode;
        this.conditions = conditions;
        this.redirectUri = redirectUri;
    }

    /**
     * The HTTP status code to return when the incoming request is redirected.
     * <p>
     * The status line returned with the code is mapped from the standard HTTP specification. Valid response
     * codes for redirection are:
     * <p>
     *  301
     * *  302
     * *  303
     * *  307
     * *  308
     * <p>
     * The default value is {@code 302} (Found).
     * <p>
     * Example: {@code 301}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
    Integer responseCode;

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    java.util.List<RuleCondition> conditions;

    @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
    RedirectUri redirectUri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
