/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * An autoscale action is triggered when a performance metric exceeds a threshold. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MetricThresholdRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MetricThresholdRule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"durationInMinutes", "operator", "value"})
    public MetricThresholdRule(Integer durationInMinutes, Operator operator, Integer value) {
        super();
        this.durationInMinutes = durationInMinutes;
        this.operator = operator;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This value is the minimum period of time the metric value exceeds the threshold value
         * before the action is triggered. The value is in minutes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("durationInMinutes")
        private Integer durationInMinutes;

        /**
         * This value is the minimum period of time the metric value exceeds the threshold value
         * before the action is triggered. The value is in minutes.
         *
         * @param durationInMinutes the value to set
         * @return this builder
         */
        public Builder durationInMinutes(Integer durationInMinutes) {
            this.durationInMinutes = durationInMinutes;
            this.__explicitlySet__.add("durationInMinutes");
            return this;
        }
        /** The comparison operator to use. Options are greater than (GT) or less than (LT). */
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        /**
         * The comparison operator to use. Options are greater than (GT) or less than (LT).
         *
         * @param operator the value to set
         * @return this builder
         */
        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }
        /** Integer non-negative value. 0 < value < 100 */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Integer value;

        /**
         * Integer non-negative value. 0 < value < 100
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(Integer value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricThresholdRule build() {
            MetricThresholdRule model =
                    new MetricThresholdRule(this.durationInMinutes, this.operator, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricThresholdRule model) {
            if (model.wasPropertyExplicitlySet("durationInMinutes")) {
                this.durationInMinutes(model.getDurationInMinutes());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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

    /**
     * This value is the minimum period of time the metric value exceeds the threshold value before
     * the action is triggered. The value is in minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("durationInMinutes")
    private final Integer durationInMinutes;

    /**
     * This value is the minimum period of time the metric value exceeds the threshold value before
     * the action is triggered. The value is in minutes.
     *
     * @return the value
     */
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    /** The comparison operator to use. Options are greater than (GT) or less than (LT). */
    public enum Operator implements com.oracle.bmc.http.internal.BmcEnum {
        Gt("GT"),
        Lt("LT"),

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
    /** The comparison operator to use. Options are greater than (GT) or less than (LT). */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final Operator operator;

    /**
     * The comparison operator to use. Options are greater than (GT) or less than (LT).
     *
     * @return the value
     */
    public Operator getOperator() {
        return operator;
    }

    /** Integer non-negative value. 0 < value < 100 */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Integer value;

    /**
     * Integer non-negative value. 0 < value < 100
     *
     * @return the value
     */
    public Integer getValue() {
        return value;
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
        sb.append("MetricThresholdRule(");
        sb.append("super=").append(super.toString());
        sb.append("durationInMinutes=").append(String.valueOf(this.durationInMinutes));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricThresholdRule)) {
            return false;
        }

        MetricThresholdRule other = (MetricThresholdRule) o;
        return java.util.Objects.equals(this.durationInMinutes, other.durationInMinutes)
                && java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.durationInMinutes == null ? 43 : this.durationInMinutes.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
