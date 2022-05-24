/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Quota policy for a usage plan.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Quota.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Quota {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Integer value;

        public Builder value(Integer value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resetPolicy")
        private ResetPolicy resetPolicy;

        public Builder resetPolicy(ResetPolicy resetPolicy) {
            this.resetPolicy = resetPolicy;
            this.__explicitlySet__.add("resetPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationOnBreach")
        private OperationOnBreach operationOnBreach;

        public Builder operationOnBreach(OperationOnBreach operationOnBreach) {
            this.operationOnBreach = operationOnBreach;
            this.__explicitlySet__.add("operationOnBreach");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Quota build() {
            Quota __instance__ = new Quota(value, unit, resetPolicy, operationOnBreach);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Quota o) {
            Builder copiedBuilder =
                    value(o.getValue())
                            .unit(o.getUnit())
                            .resetPolicy(o.getResetPolicy())
                            .operationOnBreach(o.getOperationOnBreach());

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

    /**
     * The number of requests that can be made per time period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    Integer value;
    /**
     * The unit of time over which quotas are calculated.
     * Example: {@code MINUTE} or {@code MONTH}
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Unit {
        Minute("MINUTE"),
        Hour("HOUR"),
        Day("DAY"),
        Week("WEEK"),
        Month("MONTH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Unit> map;

        static {
            map = new java.util.HashMap<>();
            for (Unit v : Unit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Unit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Unit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Unit', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The unit of time over which quotas are calculated.
     * Example: {@code MINUTE} or {@code MONTH}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    Unit unit;
    /**
     * The policy that controls when quotas will reset.
     * Example: {@code CALENDAR}
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ResetPolicy {
        Calendar("CALENDAR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ResetPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (ResetPolicy v : ResetPolicy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResetPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResetPolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResetPolicy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The policy that controls when quotas will reset.
     * Example: {@code CALENDAR}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resetPolicy")
    ResetPolicy resetPolicy;
    /**
     * What the usage plan will do when a quota is breached:
     * {@code REJECT} will allow no further requests
     * {@code ALLOW} will continue to allow further requests
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OperationOnBreach {
        Reject("REJECT"),
        Allow("ALLOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, OperationOnBreach> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationOnBreach v : OperationOnBreach.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationOnBreach(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationOnBreach create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationOnBreach', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * What the usage plan will do when a quota is breached:
     * {@code REJECT} will allow no further requests
     * {@code ALLOW} will continue to allow further requests
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationOnBreach")
    OperationOnBreach operationOnBreach;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
