/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Scaling configuration for the metric expression rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "scalingConfigurationType",
        defaultImpl = ScalingConfiguration.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CustomExpressionQueryScalingConfiguration.class,
            name = "QUERY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PredefinedExpressionThresholdScalingConfiguration.class,
            name = "THRESHOLD")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ScalingConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pendingDuration", "instanceCountAdjustment"})
    protected ScalingConfiguration(String pendingDuration, Integer instanceCountAdjustment) {
        super();
        this.pendingDuration = pendingDuration;
        this.instanceCountAdjustment = instanceCountAdjustment;
    }

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm
     * state changes from "OK" to "FIRING" or vice versa. For example, a value of 5 minutes means
     * that the alarm must persist in breaching the condition for five minutes before the alarm
     * updates its state to "FIRING"; likewise, the alarm must persist in not breaching the
     * condition for five minutes before the alarm updates its state to "OK."
     *
     * <p>The duration is specified as a string in ISO 8601 format ({@code PT10M} for ten minutes or
     * {@code PT1H} for one hour). Minimum: PT3M. Maximum: PT1H. Default: PT3M.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
    private final String pendingDuration;

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm
     * state changes from "OK" to "FIRING" or vice versa. For example, a value of 5 minutes means
     * that the alarm must persist in breaching the condition for five minutes before the alarm
     * updates its state to "FIRING"; likewise, the alarm must persist in not breaching the
     * condition for five minutes before the alarm updates its state to "OK."
     *
     * <p>The duration is specified as a string in ISO 8601 format ({@code PT10M} for ten minutes or
     * {@code PT1H} for one hour). Minimum: PT3M. Maximum: PT1H. Default: PT3M.
     *
     * @return the value
     */
    public String getPendingDuration() {
        return pendingDuration;
    }

    /** The value is used for adjusting the count of instances by. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceCountAdjustment")
    private final Integer instanceCountAdjustment;

    /**
     * The value is used for adjusting the count of instances by.
     *
     * @return the value
     */
    public Integer getInstanceCountAdjustment() {
        return instanceCountAdjustment;
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
        sb.append("ScalingConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("pendingDuration=").append(String.valueOf(this.pendingDuration));
        sb.append(", instanceCountAdjustment=")
                .append(String.valueOf(this.instanceCountAdjustment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScalingConfiguration)) {
            return false;
        }

        ScalingConfiguration other = (ScalingConfiguration) o;
        return java.util.Objects.equals(this.pendingDuration, other.pendingDuration)
                && java.util.Objects.equals(
                        this.instanceCountAdjustment, other.instanceCountAdjustment)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.pendingDuration == null ? 43 : this.pendingDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceCountAdjustment == null
                                ? 43
                                : this.instanceCountAdjustment.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of scaling configuration. */
    public enum ScalingConfigurationType implements com.oracle.bmc.http.internal.BmcEnum {
        Threshold("THRESHOLD"),
        Query("QUERY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ScalingConfigurationType.class);

        private final String value;
        private static java.util.Map<String, ScalingConfigurationType> map;

        static {
            map = new java.util.HashMap<>();
            for (ScalingConfigurationType v : ScalingConfigurationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ScalingConfigurationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScalingConfigurationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ScalingConfigurationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
