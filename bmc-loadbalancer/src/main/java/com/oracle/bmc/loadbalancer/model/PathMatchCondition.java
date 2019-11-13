/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The path string and match condition to apply when evaluating an incoming URI for redirection.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PathMatchCondition.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "attributeName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class PathMatchCondition extends RuleCondition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
        private String attributeValue;

        public Builder attributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            this.__explicitlySet__.add("attributeValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PathMatchCondition build() {
            PathMatchCondition __instance__ = new PathMatchCondition(attributeValue, operator);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PathMatchCondition o) {
            Builder copiedBuilder = attributeValue(o.getAttributeValue()).operator(o.getOperator());

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
    public PathMatchCondition(String attributeValue, Operator operator) {
        super();
        this.attributeValue = attributeValue;
        this.operator = operator;
    }

    /**
     * The path string that the redirection rule applies to.
     * <p>
     * Example: `/example`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
    String attributeValue;
    /**
     * A string that specifies how to compare the PathMatchCondition object's `attributeValue` string to the
     * incoming URI.
     * <p>
     *  **EXACT_MATCH** - The incoming URI path must exactly and completely match the `attributeValue` string.
     * <p>
     *  **FORCE_LONGEST_PREFIX_MATCH** - The system looks for the `attributeValue` string with the best,
     *    longest match of the beginning portion of the incoming URI path.
     * <p>
     *  **PREFIX_MATCH** - The beginning portion of the incoming URI path must exactly match the
     *    `attributeValue` string.
     * <p>
     *  **SUFFIX_MATCH** - The ending portion of the incoming URI path must exactly match the `attributeValue`
     *    string.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Operator {
        ExactMatch("EXACT_MATCH"),
        ForceLongestPrefixMatch("FORCE_LONGEST_PREFIX_MATCH"),
        PrefixMatch("PREFIX_MATCH"),
        SuffixMatch("SUFFIX_MATCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Operator> map;

        static {
            map = new java.util.HashMap<>();
            for (Operator v : Operator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Operator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Operator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A string that specifies how to compare the PathMatchCondition object's `attributeValue` string to the
     * incoming URI.
     * <p>
     *  **EXACT_MATCH** - The incoming URI path must exactly and completely match the `attributeValue` string.
     * <p>
     *  **FORCE_LONGEST_PREFIX_MATCH** - The system looks for the `attributeValue` string with the best,
     *    longest match of the beginning portion of the incoming URI path.
     * <p>
     *  **PREFIX_MATCH** - The beginning portion of the incoming URI path must exactly match the
     *    `attributeValue` string.
     * <p>
     *  **SUFFIX_MATCH** - The ending portion of the incoming URI path must exactly match the `attributeValue`
     *    string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    Operator operator;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
