/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The model that holds the frequency details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = AbstractFrequencyDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MonthlyFrequencyDetails.class,
            name = "MONTHLY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CustomFrequencyDetails.class,
            name = "CUSTOM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DailyFrequencyDetails.class,
            name = "DAILY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = WeeklyFrequencyDetails.class,
            name = "WEEKLY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MonthlyRuleFrequencyDetails.class,
            name = "MONTHLY_RULE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HourlyFrequencyDetails.class,
            name = "HOURLY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class AbstractFrequencyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"frequency"})
    protected AbstractFrequencyDetails(Frequency frequency) {
        super();
        this.frequency = frequency;
    }

    /** the frequency of the schedule. */
    public enum Frequency implements com.oracle.bmc.http.internal.BmcEnum {
        Hourly("HOURLY"),
        Daily("DAILY"),
        Monthly("MONTHLY"),
        Weekly("WEEKLY"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Frequency.class);

        private final String value;
        private static java.util.Map<String, Frequency> map;

        static {
            map = new java.util.HashMap<>();
            for (Frequency v : Frequency.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Frequency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Frequency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Frequency', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** the frequency of the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("frequency")
    private final Frequency frequency;

    /**
     * the frequency of the schedule.
     *
     * @return the value
     */
    public Frequency getFrequency() {
        return frequency;
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
        sb.append("AbstractFrequencyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("frequency=").append(String.valueOf(this.frequency));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractFrequencyDetails)) {
            return false;
        }

        AbstractFrequencyDetails other = (AbstractFrequencyDetails) o;
        return java.util.Objects.equals(this.frequency, other.frequency) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.frequency == null ? 43 : this.frequency.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the model */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        Hourly("HOURLY"),
        Daily("DAILY"),
        Monthly("MONTHLY"),
        Weekly("WEEKLY"),
        MonthlyRule("MONTHLY_RULE"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
