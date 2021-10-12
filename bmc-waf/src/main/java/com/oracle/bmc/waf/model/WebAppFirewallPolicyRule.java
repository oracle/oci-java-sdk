/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Base schema for WebAppFirewallPolicyRules, including properties common to all of them.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = WebAppFirewallPolicyRule.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ProtectionRule.class,
        name = "PROTECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RequestRateLimitingRule.class,
        name = "REQUEST_RATE_LIMITING"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AccessControlRule.class,
        name = "ACCESS_CONTROL"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WebAppFirewallPolicyRule {

    /**
     * Rule name. Must be unique within the module.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The language used to parse condition from field {@code condition}. Available languages:
     * <p>
     * **JMESPATH** an extended JMESPath language syntax.
     *
     **/
    public enum ConditionLanguage {
        Jmespath("JMESPATH"),
        ;

        private final String value;
        private static java.util.Map<String, ConditionLanguage> map;

        static {
            map = new java.util.HashMap<>();
            for (ConditionLanguage v : ConditionLanguage.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConditionLanguage(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConditionLanguage create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConditionLanguage: " + key);
        }
    };
    /**
     * The language used to parse condition from field {@code condition}. Available languages:
     * <p>
     * **JMESPATH** an extended JMESPath language syntax.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionLanguage")
    ConditionLanguage conditionLanguage;

    /**
     * An expression that determines whether or not the rule action should be executed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    String condition;

    /**
     * References action by name from actions defined in WebAppFirewallPolicy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionName")
    String actionName;

    /**
     * Type of WebAppFirewallPolicyRule.
     **/
    public enum Type {
        AccessControl("ACCESS_CONTROL"),
        Protection("PROTECTION"),
        RequestRateLimiting("REQUEST_RATE_LIMITING"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
}
