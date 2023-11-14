/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Default DB Configuration <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DefaultConfigParams.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DefaultConfigParams
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "configKey",
        "defaultConfigValue",
        "allowedValues",
        "isRestartRequired",
        "dataType",
        "isOverridable",
        "description"
    })
    public DefaultConfigParams(
            String configKey,
            String defaultConfigValue,
            String allowedValues,
            Boolean isRestartRequired,
            String dataType,
            Boolean isOverridable,
            String description) {
        super();
        this.configKey = configKey;
        this.defaultConfigValue = defaultConfigValue;
        this.allowedValues = allowedValues;
        this.isRestartRequired = isRestartRequired;
        this.dataType = dataType;
        this.isOverridable = isOverridable;
        this.description = description;
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
        /** Default value */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultConfigValue")
        private String defaultConfigValue;

        /**
         * Default value
         *
         * @param defaultConfigValue the value to set
         * @return this builder
         */
        public Builder defaultConfigValue(String defaultConfigValue) {
            this.defaultConfigValue = defaultConfigValue;
            this.__explicitlySet__.add("defaultConfigValue");
            return this;
        }
        /** Range or list of allowed values */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private String allowedValues;

        /**
         * Range or list of allowed values
         *
         * @param allowedValues the value to set
         * @return this builder
         */
        public Builder allowedValues(String allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }
        /** If true, modfying this configuration value will requires restart. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRestartRequired")
        private Boolean isRestartRequired;

        /**
         * If true, modfying this configuration value will requires restart.
         *
         * @param isRestartRequired the value to set
         * @return this builder
         */
        public Builder isRestartRequired(Boolean isRestartRequired) {
            this.isRestartRequired = isRestartRequired;
            this.__explicitlySet__.add("isRestartRequired");
            return this;
        }
        /** Describes about the Datatype value. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * Describes about the Datatype value.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** This flags tells whether the value is overridable or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverridable")
        private Boolean isOverridable;

        /**
         * This flags tells whether the value is overridable or not.
         *
         * @param isOverridable the value to set
         * @return this builder
         */
        public Builder isOverridable(Boolean isOverridable) {
            this.isOverridable = isOverridable;
            this.__explicitlySet__.add("isOverridable");
            return this;
        }
        /** Details about the Postgresql params. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Details about the Postgresql params.
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

        public DefaultConfigParams build() {
            DefaultConfigParams model =
                    new DefaultConfigParams(
                            this.configKey,
                            this.defaultConfigValue,
                            this.allowedValues,
                            this.isRestartRequired,
                            this.dataType,
                            this.isOverridable,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultConfigParams model) {
            if (model.wasPropertyExplicitlySet("configKey")) {
                this.configKey(model.getConfigKey());
            }
            if (model.wasPropertyExplicitlySet("defaultConfigValue")) {
                this.defaultConfigValue(model.getDefaultConfigValue());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
            }
            if (model.wasPropertyExplicitlySet("isRestartRequired")) {
                this.isRestartRequired(model.getIsRestartRequired());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("isOverridable")) {
                this.isOverridable(model.getIsOverridable());
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

    /** Default value */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultConfigValue")
    private final String defaultConfigValue;

    /**
     * Default value
     *
     * @return the value
     */
    public String getDefaultConfigValue() {
        return defaultConfigValue;
    }

    /** Range or list of allowed values */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final String allowedValues;

    /**
     * Range or list of allowed values
     *
     * @return the value
     */
    public String getAllowedValues() {
        return allowedValues;
    }

    /** If true, modfying this configuration value will requires restart. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRestartRequired")
    private final Boolean isRestartRequired;

    /**
     * If true, modfying this configuration value will requires restart.
     *
     * @return the value
     */
    public Boolean getIsRestartRequired() {
        return isRestartRequired;
    }

    /** Describes about the Datatype value. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * Describes about the Datatype value.
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    /** This flags tells whether the value is overridable or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverridable")
    private final Boolean isOverridable;

    /**
     * This flags tells whether the value is overridable or not.
     *
     * @return the value
     */
    public Boolean getIsOverridable() {
        return isOverridable;
    }

    /** Details about the Postgresql params. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details about the Postgresql params.
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
        sb.append("DefaultConfigParams(");
        sb.append("super=").append(super.toString());
        sb.append("configKey=").append(String.valueOf(this.configKey));
        sb.append(", defaultConfigValue=").append(String.valueOf(this.defaultConfigValue));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", isRestartRequired=").append(String.valueOf(this.isRestartRequired));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", isOverridable=").append(String.valueOf(this.isOverridable));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultConfigParams)) {
            return false;
        }

        DefaultConfigParams other = (DefaultConfigParams) o;
        return java.util.Objects.equals(this.configKey, other.configKey)
                && java.util.Objects.equals(this.defaultConfigValue, other.defaultConfigValue)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.isRestartRequired, other.isRestartRequired)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.isOverridable, other.isOverridable)
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
        result =
                (result * PRIME)
                        + (this.isRestartRequired == null ? 43 : this.isRestartRequired.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverridable == null ? 43 : this.isOverridable.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
