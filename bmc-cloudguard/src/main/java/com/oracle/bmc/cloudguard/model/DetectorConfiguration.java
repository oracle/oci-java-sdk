/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * A single configuration applied to a detector
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetectorConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetectorConfiguration {
    @Deprecated
    @java.beans.ConstructorProperties({"configKey", "name", "value", "dataType", "values"})
    public DetectorConfiguration(
            String configKey,
            String name,
            String value,
            String dataType,
            java.util.List<ConfigValue> values) {
        super();
        this.configKey = configKey;
        this.name = name;
        this.value = value;
        this.dataType = dataType;
        this.values = values;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique name of the configuration
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configKey")
        private String configKey;

        /**
         * Unique name of the configuration
         * @param configKey the value to set
         * @return this builder
         **/
        public Builder configKey(String configKey) {
            this.configKey = configKey;
            this.__explicitlySet__.add("configKey");
            return this;
        }
        /**
         * configuration name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * configuration name
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * configuration value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * configuration value
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * configuration data type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * configuration data type
         * @param dataType the value to set
         * @return this builder
         **/
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /**
         * List of configuration values
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<ConfigValue> values;

        /**
         * List of configuration values
         * @param values the value to set
         * @return this builder
         **/
        public Builder values(java.util.List<ConfigValue> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectorConfiguration build() {
            DetectorConfiguration __instance__ =
                    new DetectorConfiguration(configKey, name, value, dataType, values);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectorConfiguration o) {
            Builder copiedBuilder =
                    configKey(o.getConfigKey())
                            .name(o.getName())
                            .value(o.getValue())
                            .dataType(o.getDataType())
                            .values(o.getValues());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique name of the configuration
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configKey")
    private final String configKey;

    /**
     * Unique name of the configuration
     * @return the value
     **/
    public String getConfigKey() {
        return configKey;
    }

    /**
     * configuration name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * configuration name
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * configuration value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * configuration value
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * configuration data type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * configuration data type
     * @return the value
     **/
    public String getDataType() {
        return dataType;
    }

    /**
     * List of configuration values
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<ConfigValue> values;

    /**
     * List of configuration values
     * @return the value
     **/
    public java.util.List<ConfigValue> getValues() {
        return values;
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
        sb.append("DetectorConfiguration(");
        sb.append("configKey=").append(String.valueOf(this.configKey));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectorConfiguration)) {
            return false;
        }

        DetectorConfiguration other = (DetectorConfiguration) o;
        return java.util.Objects.equals(this.configKey, other.configKey)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.configKey == null ? 43 : this.configKey.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
