/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
public class WebAppFirewallPolicyRule extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "conditionLanguage", "condition", "actionName"})
    protected WebAppFirewallPolicyRule(
            String name, ConditionLanguage conditionLanguage, String condition, String actionName) {
        super();
        this.name = name;
        this.conditionLanguage = conditionLanguage;
        this.condition = condition;
        this.actionName = actionName;
    }

    /**
     * Rule name. Must be unique within the module.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Rule name. Must be unique within the module.
     * @return the value
     **/
    public String getName() {
        return name;
    }

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
    private final ConditionLanguage conditionLanguage;

    /**
     * The language used to parse condition from field {@code condition}. Available languages:
     * <p>
     * **JMESPATH** an extended JMESPath language syntax.
     *
     * @return the value
     **/
    public ConditionLanguage getConditionLanguage() {
        return conditionLanguage;
    }

    /**
     * An expression that determines whether or not the rule action should be executed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final String condition;

    /**
     * An expression that determines whether or not the rule action should be executed.
     *
     * @return the value
     **/
    public String getCondition() {
        return condition;
    }

    /**
     * References action by name from actions defined in WebAppFirewallPolicy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionName")
    private final String actionName;

    /**
     * References action by name from actions defined in WebAppFirewallPolicy.
     * @return the value
     **/
    public String getActionName() {
        return actionName;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WebAppFirewallPolicyRule(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", conditionLanguage=").append(String.valueOf(this.conditionLanguage));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", actionName=").append(String.valueOf(this.actionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebAppFirewallPolicyRule)) {
            return false;
        }

        WebAppFirewallPolicyRule other = (WebAppFirewallPolicyRule) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.conditionLanguage, other.conditionLanguage)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.actionName, other.actionName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionLanguage == null ? 43 : this.conditionLanguage.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.actionName == null ? 43 : this.actionName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

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
