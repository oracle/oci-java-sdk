/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * Details of a configuration setting in the OCI Cache Default Config Set. <br>
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
        builder = DefaultConfigurationInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DefaultConfigurationInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "configKey",
        "defaultConfigValue",
        "allowedValues",
        "dataType",
        "isModifiable",
        "description"
    })
    public DefaultConfigurationInfo(
            String configKey,
            String defaultConfigValue,
            String allowedValues,
            String dataType,
            Boolean isModifiable,
            String description) {
        super();
        this.configKey = configKey;
        this.defaultConfigValue = defaultConfigValue;
        this.allowedValues = allowedValues;
        this.dataType = dataType;
        this.isModifiable = isModifiable;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The key of the configuration setting. */
        @com.fasterxml.jackson.annotation.JsonProperty("configKey")
        private String configKey;

        /**
         * The key of the configuration setting.
         *
         * @param configKey the value to set
         * @return this builder
         */
        public Builder configKey(String configKey) {
            this.configKey = configKey;
            this.__explicitlySet__.add("configKey");
            return this;
        }
        /** The default value for the configuration setting. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultConfigValue")
        private String defaultConfigValue;

        /**
         * The default value for the configuration setting.
         *
         * @param defaultConfigValue the value to set
         * @return this builder
         */
        public Builder defaultConfigValue(String defaultConfigValue) {
            this.defaultConfigValue = defaultConfigValue;
            this.__explicitlySet__.add("defaultConfigValue");
            return this;
        }
        /** Allowed values for the configuration setting. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private String allowedValues;

        /**
         * Allowed values for the configuration setting.
         *
         * @param allowedValues the value to set
         * @return this builder
         */
        public Builder allowedValues(String allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }
        /** The data type of the configuration setting. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * The data type of the configuration setting.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** Indicates if the configuration is modifiable. */
        @com.fasterxml.jackson.annotation.JsonProperty("isModifiable")
        private Boolean isModifiable;

        /**
         * Indicates if the configuration is modifiable.
         *
         * @param isModifiable the value to set
         * @return this builder
         */
        public Builder isModifiable(Boolean isModifiable) {
            this.isModifiable = isModifiable;
            this.__explicitlySet__.add("isModifiable");
            return this;
        }
        /** Description of the configuration setting. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the configuration setting.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultConfigurationInfo build() {
            DefaultConfigurationInfo model =
                    new DefaultConfigurationInfo(
                            this.configKey,
                            this.defaultConfigValue,
                            this.allowedValues,
                            this.dataType,
                            this.isModifiable,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultConfigurationInfo model) {
            if (model.wasPropertyExplicitlySet("configKey")) {
                this.configKey(model.getConfigKey());
            }
            if (model.wasPropertyExplicitlySet("defaultConfigValue")) {
                this.defaultConfigValue(model.getDefaultConfigValue());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("isModifiable")) {
                this.isModifiable(model.getIsModifiable());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** The key of the configuration setting. */
    @com.fasterxml.jackson.annotation.JsonProperty("configKey")
    private final String configKey;

    /**
     * The key of the configuration setting.
     *
     * @return the value
     */
    public String getConfigKey() {
        return configKey;
    }

    /** The default value for the configuration setting. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultConfigValue")
    private final String defaultConfigValue;

    /**
     * The default value for the configuration setting.
     *
     * @return the value
     */
    public String getDefaultConfigValue() {
        return defaultConfigValue;
    }

    /** Allowed values for the configuration setting. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final String allowedValues;

    /**
     * Allowed values for the configuration setting.
     *
     * @return the value
     */
    public String getAllowedValues() {
        return allowedValues;
    }

    /** The data type of the configuration setting. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * The data type of the configuration setting.
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    /** Indicates if the configuration is modifiable. */
    @com.fasterxml.jackson.annotation.JsonProperty("isModifiable")
    private final Boolean isModifiable;

    /**
     * Indicates if the configuration is modifiable.
     *
     * @return the value
     */
    public Boolean getIsModifiable() {
        return isModifiable;
    }

    /** Description of the configuration setting. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the configuration setting.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("DefaultConfigurationInfo(");
        sb.append("super=").append(super.toString());
        sb.append("configKey=").append(String.valueOf(this.configKey));
        sb.append(", defaultConfigValue=").append(String.valueOf(this.defaultConfigValue));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", isModifiable=").append(String.valueOf(this.isModifiable));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultConfigurationInfo)) {
            return false;
        }

        DefaultConfigurationInfo other = (DefaultConfigurationInfo) o;
        return java.util.Objects.equals(this.configKey, other.configKey)
                && java.util.Objects.equals(this.defaultConfigValue, other.defaultConfigValue)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.isModifiable, other.isModifiable)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.configKey == null ? 43 : this.configKey.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConfigValue == null
                                ? 43
                                : this.defaultConfigValue.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.isModifiable == null ? 43 : this.isModifiable.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
