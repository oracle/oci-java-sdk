/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * Evaluated type of dimension value.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JmesPathDimensionValue.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JmesPathDimensionValue extends DimensionValueDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The location to use for deriving the dimension value (evaluated).
         * The path must start with {@code logContent} in an acceptable notation style with supported [JMESPath selectors](https://jmespath.org/specification.html): expression with dot and index operator ({@code .} and {@code {@link #metricDataDetails(MetricDataDetailsRequest) metricDataDetails}.
         * The returned value depends on the results of evaluation.
         * If the evaluated value is valid, then the evaluated value is returned without double quotes. (Any front or trailing double quotes are trimmed before returning the value. For example, the evaluated value {@code "compartmentId"} is returned as {@code compartmentId}.)
         * If the evaluated value is invalid, then the returned value is {@code SCH_EVAL_INVALID_VALUE}.
         * If the evaluated value is empty, then the returned value is {@code SCH_EVAL_VALUE_EMPTY}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The location to use for deriving the dimension value (evaluated).
         * The path must start with {@code logContent} in an acceptable notation style with supported [JMESPath selectors](https://jmespath.org/specification.html): expression with dot and index operator ({@code .} and {@code {@link #metricDataDetails(MetricDataDetailsRequest) metricDataDetails}.
         * The returned value depends on the results of evaluation.
         * If the evaluated value is valid, then the evaluated value is returned without double quotes. (Any front or trailing double quotes are trimmed before returning the value. For example, the evaluated value {@code "compartmentId"} is returned as {@code compartmentId}.)
         * If the evaluated value is invalid, then the returned value is {@code SCH_EVAL_INVALID_VALUE}.
         * If the evaluated value is empty, then the returned value is {@code SCH_EVAL_VALUE_EMPTY}.
         *
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JmesPathDimensionValue build() {
            JmesPathDimensionValue __instance__ = new JmesPathDimensionValue(path);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JmesPathDimensionValue o) {
            Builder copiedBuilder = path(o.getPath());

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
    public JmesPathDimensionValue(String path) {
        super();
        this.path = path;
    }

    /**
     * The location to use for deriving the dimension value (evaluated).
     * The path must start with {@code logContent} in an acceptable notation style with supported [JMESPath selectors](https://jmespath.org/specification.html): expression with dot and index operator ({@code .} and {@code {@link #metricDataDetails(MetricDataDetailsRequest) metricDataDetails}.
     * The returned value depends on the results of evaluation.
     * If the evaluated value is valid, then the evaluated value is returned without double quotes. (Any front or trailing double quotes are trimmed before returning the value. For example, the evaluated value {@code "compartmentId"} is returned as {@code compartmentId}.)
     * If the evaluated value is invalid, then the returned value is {@code SCH_EVAL_INVALID_VALUE}.
     * If the evaluated value is empty, then the returned value is {@code SCH_EVAL_VALUE_EMPTY}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The location to use for deriving the dimension value (evaluated).
     * The path must start with {@code logContent} in an acceptable notation style with supported [JMESPath selectors](https://jmespath.org/specification.html): expression with dot and index operator ({@code .} and {@code {@link #metricDataDetails(MetricDataDetailsRequest) metricDataDetails}.
     * The returned value depends on the results of evaluation.
     * If the evaluated value is valid, then the evaluated value is returned without double quotes. (Any front or trailing double quotes are trimmed before returning the value. For example, the evaluated value {@code "compartmentId"} is returned as {@code compartmentId}.)
     * If the evaluated value is invalid, then the returned value is {@code SCH_EVAL_INVALID_VALUE}.
     * If the evaluated value is empty, then the returned value is {@code SCH_EVAL_VALUE_EMPTY}.
     *
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JmesPathDimensionValue(");
        sb.append("super=").append(super.toString());
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JmesPathDimensionValue)) {
            return false;
        }

        JmesPathDimensionValue other = (JmesPathDimensionValue) o;
        return java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
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
