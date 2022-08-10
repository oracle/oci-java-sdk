/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Determines the quarterly upgrade begin times (monthly maintenance group schedule ) of the Fusion environment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QuarterlyUpgradeBeginTimes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QuarterlyUpgradeBeginTimes
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"overrideType", "beginTimesValue"})
    public QuarterlyUpgradeBeginTimes(OverrideType overrideType, String beginTimesValue) {
        super();
        this.overrideType = overrideType;
        this.beginTimesValue = beginTimesValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Determines if the maintenance schedule of the Fusion environment is inherited from the Fusion environment family.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("overrideType")
        private OverrideType overrideType;

        /**
         * Determines if the maintenance schedule of the Fusion environment is inherited from the Fusion environment family.
         * @param overrideType the value to set
         * @return this builder
         **/
        public Builder overrideType(OverrideType overrideType) {
            this.overrideType = overrideType;
            this.__explicitlySet__.add("overrideType");
            return this;
        }
        /**
         * The frequency and month when maintenance occurs for the Fusion environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("beginTimesValue")
        private String beginTimesValue;

        /**
         * The frequency and month when maintenance occurs for the Fusion environment.
         * @param beginTimesValue the value to set
         * @return this builder
         **/
        public Builder beginTimesValue(String beginTimesValue) {
            this.beginTimesValue = beginTimesValue;
            this.__explicitlySet__.add("beginTimesValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QuarterlyUpgradeBeginTimes build() {
            QuarterlyUpgradeBeginTimes model =
                    new QuarterlyUpgradeBeginTimes(this.overrideType, this.beginTimesValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QuarterlyUpgradeBeginTimes model) {
            if (model.wasPropertyExplicitlySet("overrideType")) {
                this.overrideType(model.getOverrideType());
            }
            if (model.wasPropertyExplicitlySet("beginTimesValue")) {
                this.beginTimesValue(model.getBeginTimesValue());
            }
            return this;
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

    /**
     * Determines if the maintenance schedule of the Fusion environment is inherited from the Fusion environment family.
     **/
    public enum OverrideType {
        Overridden("OVERRIDDEN"),
        Inherited("INHERITED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OverrideType.class);

        private final String value;
        private static java.util.Map<String, OverrideType> map;

        static {
            map = new java.util.HashMap<>();
            for (OverrideType v : OverrideType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OverrideType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OverrideType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OverrideType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Determines if the maintenance schedule of the Fusion environment is inherited from the Fusion environment family.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overrideType")
    private final OverrideType overrideType;

    /**
     * Determines if the maintenance schedule of the Fusion environment is inherited from the Fusion environment family.
     * @return the value
     **/
    public OverrideType getOverrideType() {
        return overrideType;
    }

    /**
     * The frequency and month when maintenance occurs for the Fusion environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("beginTimesValue")
    private final String beginTimesValue;

    /**
     * The frequency and month when maintenance occurs for the Fusion environment.
     * @return the value
     **/
    public String getBeginTimesValue() {
        return beginTimesValue;
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
        sb.append("QuarterlyUpgradeBeginTimes(");
        sb.append("super=").append(super.toString());
        sb.append("overrideType=").append(String.valueOf(this.overrideType));
        sb.append(", beginTimesValue=").append(String.valueOf(this.beginTimesValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QuarterlyUpgradeBeginTimes)) {
            return false;
        }

        QuarterlyUpgradeBeginTimes other = (QuarterlyUpgradeBeginTimes) o;
        return java.util.Objects.equals(this.overrideType, other.overrideType)
                && java.util.Objects.equals(this.beginTimesValue, other.beginTimesValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.overrideType == null ? 43 : this.overrideType.hashCode());
        result =
                (result * PRIME)
                        + (this.beginTimesValue == null ? 43 : this.beginTimesValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
