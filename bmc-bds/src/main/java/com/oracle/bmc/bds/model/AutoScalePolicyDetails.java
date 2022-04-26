/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details of an autoscale policy.
 * <p>
 * You can create following types of autoscaling policies:
 * <p>
 * - **MetricBasedVerticalScalingPolicy:** Vertical autoscaling action is triggered when a performance metric exceeds a threshold
 * - **MetricBasedHorizontalScalingPolicy:** Horizontal autoscaling action is triggered when a performance metric exceeds a threshold
 * - **ScheduleBasedVerticalScalingPolicy:** Vertical autoscaling action is triggered at the specific times that you schedule.
 * - **ScheduleBasedHorizontalScalingPolicy:** Horizontal autoscaling action is triggered at the specific times that you schedule.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType",
    defaultImpl = AutoScalePolicyDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MetricBasedVerticalScalingPolicyDetails.class,
        name = "METRIC_BASED_VERTICAL_SCALING_POLICY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ScheduleBasedVerticalScalingPolicyDetails.class,
        name = "SCHEDULE_BASED_VERTICAL_SCALING_POLICY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ScheduleBasedHorizontalScalingPolicyDetails.class,
        name = "SCHEDULE_BASED_HORIZONTAL_SCALING_POLICY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MetricBasedHorizontalScalingPolicyDetails.class,
        name = "METRIC_BASED_HORIZONTAL_SCALING_POLICY"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AutoScalePolicyDetails {

    /**
     * The type of autoscaling trigger.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TriggerType {
        MetricBased("METRIC_BASED"),
        ScheduleBased("SCHEDULE_BASED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TriggerType> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggerType v : TriggerType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggerType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggerType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggerType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of autoscaling trigger.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggerType")
    TriggerType triggerType;
    /**
     * The type of autoscaling action to take.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ActionType {
        VerticalScaling("VERTICAL_SCALING"),
        HorizontalScaling("HORIZONTAL_SCALING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ActionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActionType v : ActionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of autoscaling action to take.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    ActionType actionType;

    /**
     * Type of autoscaling policy.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PolicyType {
        MetricBasedVerticalScalingPolicy("METRIC_BASED_VERTICAL_SCALING_POLICY"),
        MetricBasedHorizontalScalingPolicy("METRIC_BASED_HORIZONTAL_SCALING_POLICY"),
        ScheduleBasedVerticalScalingPolicy("SCHEDULE_BASED_VERTICAL_SCALING_POLICY"),
        ScheduleBasedHorizontalScalingPolicy("SCHEDULE_BASED_HORIZONTAL_SCALING_POLICY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PolicyType> map;

        static {
            map = new java.util.HashMap<>();
            for (PolicyType v : PolicyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PolicyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PolicyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PolicyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
