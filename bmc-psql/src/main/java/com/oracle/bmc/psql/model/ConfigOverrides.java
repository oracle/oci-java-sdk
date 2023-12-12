/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Configuration overrides for a PostgreSQL instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ConfigOverrides.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigOverrides
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"configKey", "overridenConfigValue"})
    public ConfigOverrides(String configKey, String overridenConfigValue) {
        super();
        this.configKey = configKey;
        this.overridenConfigValue = overridenConfigValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Configuration variable name. */
        @com.fasterxml.jackson.annotation.JsonProperty("configKey")
        private String configKey;

        /**
         * Configuration variable name.
         *
         * @param configKey the value to set
         * @return this builder
         */
        public Builder configKey(String configKey) {
            this.configKey = configKey;
            this.__explicitlySet__.add("configKey");
            return this;
        }
        /** User-selected variable value. */
        @com.fasterxml.jackson.annotation.JsonProperty("overridenConfigValue")
        private String overridenConfigValue;

        /**
         * User-selected variable value.
         *
         * @param overridenConfigValue the value to set
         * @return this builder
         */
        public Builder overridenConfigValue(String overridenConfigValue) {
            this.overridenConfigValue = overridenConfigValue;
            this.__explicitlySet__.add("overridenConfigValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigOverrides build() {
            ConfigOverrides model = new ConfigOverrides(this.configKey, this.overridenConfigValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigOverrides model) {
            if (model.wasPropertyExplicitlySet("configKey")) {
                this.configKey(model.getConfigKey());
            }
            if (model.wasPropertyExplicitlySet("overridenConfigValue")) {
                this.overridenConfigValue(model.getOverridenConfigValue());
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

    /** Configuration variable name. */
    @com.fasterxml.jackson.annotation.JsonProperty("configKey")
    private final String configKey;

    /**
     * Configuration variable name.
     *
     * @return the value
     */
    public String getConfigKey() {
        return configKey;
    }

    /** User-selected variable value. */
    @com.fasterxml.jackson.annotation.JsonProperty("overridenConfigValue")
    private final String overridenConfigValue;

    /**
     * User-selected variable value.
     *
     * @return the value
     */
    public String getOverridenConfigValue() {
        return overridenConfigValue;
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
        sb.append("ConfigOverrides(");
        sb.append("super=").append(super.toString());
        sb.append("configKey=").append(String.valueOf(this.configKey));
        sb.append(", overridenConfigValue=").append(String.valueOf(this.overridenConfigValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigOverrides)) {
            return false;
        }

        ConfigOverrides other = (ConfigOverrides) o;
        return java.util.Objects.equals(this.configKey, other.configKey)
                && java.util.Objects.equals(this.overridenConfigValue, other.overridenConfigValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.configKey == null ? 43 : this.configKey.hashCode());
        result =
                (result * PRIME)
                        + (this.overridenConfigValue == null
                                ? 43
                                : this.overridenConfigValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
