/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
public class AutoScalePolicyDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"triggerType", "actionType"})
    protected AutoScalePolicyDetails(TriggerType triggerType, ActionType actionType) {
        super();
        this.triggerType = triggerType;
        this.actionType = actionType;
    }

    /**
     * The type of autoscaling trigger.
     **/
    public enum TriggerType {
        MetricBased("METRIC_BASED"),
        ScheduleBased("SCHEDULE_BASED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TriggerType.class);

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
    private final TriggerType triggerType;

    /**
     * The type of autoscaling trigger.
     * @return the value
     **/
    public TriggerType getTriggerType() {
        return triggerType;
    }

    /**
     * The type of autoscaling action to take.
     **/
    public enum ActionType {
        VerticalScaling("VERTICAL_SCALING"),
        HorizontalScaling("HORIZONTAL_SCALING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActionType.class);

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
    private final ActionType actionType;

    /**
     * The type of autoscaling action to take.
     * @return the value
     **/
    public ActionType getActionType() {
        return actionType;
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
        sb.append("AutoScalePolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("triggerType=").append(String.valueOf(this.triggerType));
        sb.append(", actionType=").append(String.valueOf(this.actionType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoScalePolicyDetails)) {
            return false;
        }

        AutoScalePolicyDetails other = (AutoScalePolicyDetails) o;
        return java.util.Objects.equals(this.triggerType, other.triggerType)
                && java.util.Objects.equals(this.actionType, other.actionType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.triggerType == null ? 43 : this.triggerType.hashCode());
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of autoscaling policy.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PolicyType.class);

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
