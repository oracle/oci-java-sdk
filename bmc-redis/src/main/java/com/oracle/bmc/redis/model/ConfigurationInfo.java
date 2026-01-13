/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * Details of a configuration setting in the OCI Cache Config Set. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigurationInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigurationInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"configKey", "configValue"})
    public ConfigurationInfo(String configKey, String configValue) {
        super();
        this.configKey = configKey;
        this.configValue = configValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Key is the configuration key. */
        @com.fasterxml.jackson.annotation.JsonProperty("configKey")
        private String configKey;

        /**
         * Key is the configuration key.
         *
         * @param configKey the value to set
         * @return this builder
         */
        public Builder configKey(String configKey) {
            this.configKey = configKey;
            this.__explicitlySet__.add("configKey");
            return this;
        }
        /**
         * Value of the configuration as a string. Can represent a string, boolean, or number.
         * Example: "true", "42", or "someString".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configValue")
        private String configValue;

        /**
         * Value of the configuration as a string. Can represent a string, boolean, or number.
         * Example: "true", "42", or "someString".
         *
         * @param configValue the value to set
         * @return this builder
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            this.__explicitlySet__.add("configValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationInfo build() {
            ConfigurationInfo model = new ConfigurationInfo(this.configKey, this.configValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationInfo model) {
            if (model.wasPropertyExplicitlySet("configKey")) {
                this.configKey(model.getConfigKey());
            }
            if (model.wasPropertyExplicitlySet("configValue")) {
                this.configValue(model.getConfigValue());
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

    /** Key is the configuration key. */
    @com.fasterxml.jackson.annotation.JsonProperty("configKey")
    private final String configKey;

    /**
     * Key is the configuration key.
     *
     * @return the value
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * Value of the configuration as a string. Can represent a string, boolean, or number. Example:
     * "true", "42", or "someString".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configValue")
    private final String configValue;

    /**
     * Value of the configuration as a string. Can represent a string, boolean, or number. Example:
     * "true", "42", or "someString".
     *
     * @return the value
     */
    public String getConfigValue() {
        return configValue;
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
        sb.append("ConfigurationInfo(");
        sb.append("super=").append(super.toString());
        sb.append("configKey=").append(String.valueOf(this.configKey));
        sb.append(", configValue=").append(String.valueOf(this.configValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigurationInfo)) {
            return false;
        }

        ConfigurationInfo other = (ConfigurationInfo) o;
        return java.util.Objects.equals(this.configKey, other.configKey)
                && java.util.Objects.equals(this.configValue, other.configValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.configKey == null ? 43 : this.configKey.hashCode());
        result = (result * PRIME) + (this.configValue == null ? 43 : this.configValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
