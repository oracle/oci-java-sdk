/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Allowed value details of configuration item for LIMIT type. Value has to be between minValue and
 * maxValue. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigurationItemLimitAllowedValueDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "allowedValueType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigurationItemLimitAllowedValueDetails
        extends ConfigurationItemAllowedValueDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Minimum value limit for the configuration item. */
        @com.fasterxml.jackson.annotation.JsonProperty("minValue")
        private String minValue;

        /**
         * Minimum value limit for the configuration item.
         *
         * @param minValue the value to set
         * @return this builder
         */
        public Builder minValue(String minValue) {
            this.minValue = minValue;
            this.__explicitlySet__.add("minValue");
            return this;
        }
        /** Maximum value limit for the configuration item. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
        private String maxValue;

        /**
         * Maximum value limit for the configuration item.
         *
         * @param maxValue the value to set
         * @return this builder
         */
        public Builder maxValue(String maxValue) {
            this.maxValue = maxValue;
            this.__explicitlySet__.add("maxValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationItemLimitAllowedValueDetails build() {
            ConfigurationItemLimitAllowedValueDetails model =
                    new ConfigurationItemLimitAllowedValueDetails(this.minValue, this.maxValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationItemLimitAllowedValueDetails model) {
            if (model.wasPropertyExplicitlySet("minValue")) {
                this.minValue(model.getMinValue());
            }
            if (model.wasPropertyExplicitlySet("maxValue")) {
                this.maxValue(model.getMaxValue());
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

    @Deprecated
    public ConfigurationItemLimitAllowedValueDetails(String minValue, String maxValue) {
        super();
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    /** Minimum value limit for the configuration item. */
    @com.fasterxml.jackson.annotation.JsonProperty("minValue")
    private final String minValue;

    /**
     * Minimum value limit for the configuration item.
     *
     * @return the value
     */
    public String getMinValue() {
        return minValue;
    }

    /** Maximum value limit for the configuration item. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
    private final String maxValue;

    /**
     * Maximum value limit for the configuration item.
     *
     * @return the value
     */
    public String getMaxValue() {
        return maxValue;
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
        sb.append("ConfigurationItemLimitAllowedValueDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", minValue=").append(String.valueOf(this.minValue));
        sb.append(", maxValue=").append(String.valueOf(this.maxValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigurationItemLimitAllowedValueDetails)) {
            return false;
        }

        ConfigurationItemLimitAllowedValueDetails other =
                (ConfigurationItemLimitAllowedValueDetails) o;
        return java.util.Objects.equals(this.minValue, other.minValue)
                && java.util.Objects.equals(this.maxValue, other.maxValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.minValue == null ? 43 : this.minValue.hashCode());
        result = (result * PRIME) + (this.maxValue == null ? 43 : this.maxValue.hashCode());
        return result;
    }
}
