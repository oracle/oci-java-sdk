/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Composite Condition object with nested Condition
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CompositeCondition.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CompositeCondition extends Condition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("leftOperand")
        private Condition leftOperand;

        public Builder leftOperand(Condition leftOperand) {
            this.leftOperand = leftOperand;
            this.__explicitlySet__.add("leftOperand");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compositeOperator")
        private CompositeOperator compositeOperator;

        public Builder compositeOperator(CompositeOperator compositeOperator) {
            this.compositeOperator = compositeOperator;
            this.__explicitlySet__.add("compositeOperator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rightOperand")
        private Condition rightOperand;

        public Builder rightOperand(Condition rightOperand) {
            this.rightOperand = rightOperand;
            this.__explicitlySet__.add("rightOperand");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompositeCondition build() {
            CompositeCondition __instance__ =
                    new CompositeCondition(leftOperand, compositeOperator, rightOperand);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompositeCondition o) {
            Builder copiedBuilder =
                    leftOperand(o.getLeftOperand())
                            .compositeOperator(o.getCompositeOperator())
                            .rightOperand(o.getRightOperand());

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
    public CompositeCondition(
            Condition leftOperand, CompositeOperator compositeOperator, Condition rightOperand) {
        super();
        this.leftOperand = leftOperand;
        this.compositeOperator = compositeOperator;
        this.rightOperand = rightOperand;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("leftOperand")
    Condition leftOperand;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CompositeOperator {
        And("AND"),
        Or("OR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, CompositeOperator> map;

        static {
            map = new java.util.HashMap<>();
            for (CompositeOperator v : CompositeOperator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CompositeOperator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CompositeOperator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CompositeOperator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("compositeOperator")
    CompositeOperator compositeOperator;

    @com.fasterxml.jackson.annotation.JsonProperty("rightOperand")
    Condition rightOperand;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
