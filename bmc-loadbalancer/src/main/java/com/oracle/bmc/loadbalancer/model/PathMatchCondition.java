/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The path string and match condition to apply when evaluating an incoming URI for redirection.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PathMatchCondition.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "attributeName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PathMatchCondition extends RuleCondition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The path string that the redirection rule applies to.
         *
         * <p>Example: {@code /example}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
        private String attributeValue;

        /**
         * The path string that the redirection rule applies to.
         *
         * <p>Example: {@code /example}
         *
         * @param attributeValue the value to set
         * @return this builder
         */
        public Builder attributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            this.__explicitlySet__.add("attributeValue");
            return this;
        }
        /**
         * A string that specifies how to compare the PathMatchCondition object's {@code
         * attributeValue} string to the incoming URI.
         *
         * <p>**EXACT_MATCH** - The incoming URI path must exactly and completely match the {@code
         * attributeValue} string.
         *
         * <p>**FORCE_LONGEST_PREFIX_MATCH** - The system looks for the {@code attributeValue}
         * string with the best, longest match of the beginning portion of the incoming URI path.
         *
         * <p>**PREFIX_MATCH** - The beginning portion of the incoming URI path must exactly match
         * the {@code attributeValue} string.
         *
         * <p>**SUFFIX_MATCH** - The ending portion of the incoming URI path must exactly match the
         * {@code attributeValue} string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        /**
         * A string that specifies how to compare the PathMatchCondition object's {@code
         * attributeValue} string to the incoming URI.
         *
         * <p>**EXACT_MATCH** - The incoming URI path must exactly and completely match the {@code
         * attributeValue} string.
         *
         * <p>**FORCE_LONGEST_PREFIX_MATCH** - The system looks for the {@code attributeValue}
         * string with the best, longest match of the beginning portion of the incoming URI path.
         *
         * <p>**PREFIX_MATCH** - The beginning portion of the incoming URI path must exactly match
         * the {@code attributeValue} string.
         *
         * <p>**SUFFIX_MATCH** - The ending portion of the incoming URI path must exactly match the
         * {@code attributeValue} string.
         *
         * @param operator the value to set
         * @return this builder
         */
        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PathMatchCondition build() {
            PathMatchCondition model = new PathMatchCondition(this.attributeValue, this.operator);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PathMatchCondition model) {
            if (model.wasPropertyExplicitlySet("attributeValue")) {
                this.attributeValue(model.getAttributeValue());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
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
    public PathMatchCondition(String attributeValue, Operator operator) {
        super();
        this.attributeValue = attributeValue;
        this.operator = operator;
    }

    /**
     * The path string that the redirection rule applies to.
     *
     * <p>Example: {@code /example}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeValue")
    private final String attributeValue;

    /**
     * The path string that the redirection rule applies to.
     *
     * <p>Example: {@code /example}
     *
     * @return the value
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * A string that specifies how to compare the PathMatchCondition object's {@code attributeValue}
     * string to the incoming URI.
     *
     * <p>**EXACT_MATCH** - The incoming URI path must exactly and completely match the {@code
     * attributeValue} string.
     *
     * <p>**FORCE_LONGEST_PREFIX_MATCH** - The system looks for the {@code attributeValue} string
     * with the best, longest match of the beginning portion of the incoming URI path.
     *
     * <p>**PREFIX_MATCH** - The beginning portion of the incoming URI path must exactly match the
     * {@code attributeValue} string.
     *
     * <p>**SUFFIX_MATCH** - The ending portion of the incoming URI path must exactly match the
     * {@code attributeValue} string.
     */
    public enum Operator implements com.oracle.bmc.http.internal.BmcEnum {
        ExactMatch("EXACT_MATCH"),
        ForceLongestPrefixMatch("FORCE_LONGEST_PREFIX_MATCH"),
        PrefixMatch("PREFIX_MATCH"),
        SuffixMatch("SUFFIX_MATCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Operator.class);

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
     * A string that specifies how to compare the PathMatchCondition object's {@code attributeValue}
     * string to the incoming URI.
     *
     * <p>**EXACT_MATCH** - The incoming URI path must exactly and completely match the {@code
     * attributeValue} string.
     *
     * <p>**FORCE_LONGEST_PREFIX_MATCH** - The system looks for the {@code attributeValue} string
     * with the best, longest match of the beginning portion of the incoming URI path.
     *
     * <p>**PREFIX_MATCH** - The beginning portion of the incoming URI path must exactly match the
     * {@code attributeValue} string.
     *
     * <p>**SUFFIX_MATCH** - The ending portion of the incoming URI path must exactly match the
     * {@code attributeValue} string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final Operator operator;

    /**
     * A string that specifies how to compare the PathMatchCondition object's {@code attributeValue}
     * string to the incoming URI.
     *
     * <p>**EXACT_MATCH** - The incoming URI path must exactly and completely match the {@code
     * attributeValue} string.
     *
     * <p>**FORCE_LONGEST_PREFIX_MATCH** - The system looks for the {@code attributeValue} string
     * with the best, longest match of the beginning portion of the incoming URI path.
     *
     * <p>**PREFIX_MATCH** - The beginning portion of the incoming URI path must exactly match the
     * {@code attributeValue} string.
     *
     * <p>**SUFFIX_MATCH** - The ending portion of the incoming URI path must exactly match the
     * {@code attributeValue} string.
     *
     * @return the value
     */
    public Operator getOperator() {
        return operator;
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
        sb.append("PathMatchCondition(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", attributeValue=").append(String.valueOf(this.attributeValue));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PathMatchCondition)) {
            return false;
        }

        PathMatchCondition other = (PathMatchCondition) o;
        return java.util.Objects.equals(this.attributeValue, other.attributeValue)
                && java.util.Objects.equals(this.operator, other.operator)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.attributeValue == null ? 43 : this.attributeValue.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        return result;
    }
}
