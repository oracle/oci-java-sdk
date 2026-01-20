/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Details for converting integration instance to Disaster Recovery Enabled instance type <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConvertInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConvertInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"conversionType"})
    public ConvertInstanceDetails(ConversionType conversionType) {
        super();
        this.conversionType = conversionType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Convert given instance to specified DR instance */
        @com.fasterxml.jackson.annotation.JsonProperty("conversionType")
        private ConversionType conversionType;

        /**
         * Convert given instance to specified DR instance
         *
         * @param conversionType the value to set
         * @return this builder
         */
        public Builder conversionType(ConversionType conversionType) {
            this.conversionType = conversionType;
            this.__explicitlySet__.add("conversionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConvertInstanceDetails build() {
            ConvertInstanceDetails model = new ConvertInstanceDetails(this.conversionType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConvertInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("conversionType")) {
                this.conversionType(model.getConversionType());
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

    /** Convert given instance to specified DR instance */
    public enum ConversionType implements com.oracle.bmc.http.internal.BmcEnum {
        DisasterRecovery("DISASTER_RECOVERY"),
        ;

        private final String value;
        private static java.util.Map<String, ConversionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConversionType v : ConversionType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConversionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConversionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConversionType: " + key);
        }
    };
    /** Convert given instance to specified DR instance */
    @com.fasterxml.jackson.annotation.JsonProperty("conversionType")
    private final ConversionType conversionType;

    /**
     * Convert given instance to specified DR instance
     *
     * @return the value
     */
    public ConversionType getConversionType() {
        return conversionType;
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
        sb.append("ConvertInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("conversionType=").append(String.valueOf(this.conversionType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConvertInstanceDetails)) {
            return false;
        }

        ConvertInstanceDetails other = (ConvertInstanceDetails) o;
        return java.util.Objects.equals(this.conversionType, other.conversionType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.conversionType == null ? 43 : this.conversionType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
