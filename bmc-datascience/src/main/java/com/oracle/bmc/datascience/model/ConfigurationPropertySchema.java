/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Schema for single configuration property <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigurationPropertySchema.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigurationPropertySchema
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "keyName",
        "valueType",
        "description",
        "isMandatory",
        "defaultValue",
        "validationRegexp",
        "sampleValue"
    })
    public ConfigurationPropertySchema(
            String keyName,
            ValueType valueType,
            String description,
            Boolean isMandatory,
            String defaultValue,
            String validationRegexp,
            String sampleValue) {
        super();
        this.keyName = keyName;
        this.valueType = valueType;
        this.description = description;
        this.isMandatory = isMandatory;
        this.defaultValue = defaultValue;
        this.validationRegexp = validationRegexp;
        this.sampleValue = sampleValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of key (parameter name) */
        @com.fasterxml.jackson.annotation.JsonProperty("keyName")
        private String keyName;

        /**
         * Name of key (parameter name)
         *
         * @param keyName the value to set
         * @return this builder
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            this.__explicitlySet__.add("keyName");
            return this;
        }
        /** Type of value */
        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ValueType valueType;

        /**
         * Type of value
         *
         * @param valueType the value to set
         * @return this builder
         */
        public Builder valueType(ValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }
        /** Description of this configuration property */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of this configuration property
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * If the value is true this configuration property is mandatory and visa versa. If not
         * specified configuration property is optional.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
        private Boolean isMandatory;

        /**
         * If the value is true this configuration property is mandatory and visa versa. If not
         * specified configuration property is optional.
         *
         * @param isMandatory the value to set
         * @return this builder
         */
        public Builder isMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            this.__explicitlySet__.add("isMandatory");
            return this;
        }
        /**
         * The default value for the optional configuration property (it must not be specified for
         * mandatory configuration properties)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default value for the optional configuration property (it must not be specified for
         * mandatory configuration properties)
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** A regular expression will be used for the validation of property value. */
        @com.fasterxml.jackson.annotation.JsonProperty("validationRegexp")
        private String validationRegexp;

        /**
         * A regular expression will be used for the validation of property value.
         *
         * @param validationRegexp the value to set
         * @return this builder
         */
        public Builder validationRegexp(String validationRegexp) {
            this.validationRegexp = validationRegexp;
            this.__explicitlySet__.add("validationRegexp");
            return this;
        }
        /** Sample property value (it must match validationRegexp if it is specified) */
        @com.fasterxml.jackson.annotation.JsonProperty("sampleValue")
        private String sampleValue;

        /**
         * Sample property value (it must match validationRegexp if it is specified)
         *
         * @param sampleValue the value to set
         * @return this builder
         */
        public Builder sampleValue(String sampleValue) {
            this.sampleValue = sampleValue;
            this.__explicitlySet__.add("sampleValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationPropertySchema build() {
            ConfigurationPropertySchema model =
                    new ConfigurationPropertySchema(
                            this.keyName,
                            this.valueType,
                            this.description,
                            this.isMandatory,
                            this.defaultValue,
                            this.validationRegexp,
                            this.sampleValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationPropertySchema model) {
            if (model.wasPropertyExplicitlySet("keyName")) {
                this.keyName(model.getKeyName());
            }
            if (model.wasPropertyExplicitlySet("valueType")) {
                this.valueType(model.getValueType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isMandatory")) {
                this.isMandatory(model.getIsMandatory());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("validationRegexp")) {
                this.validationRegexp(model.getValidationRegexp());
            }
            if (model.wasPropertyExplicitlySet("sampleValue")) {
                this.sampleValue(model.getSampleValue());
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

    /** Name of key (parameter name) */
    @com.fasterxml.jackson.annotation.JsonProperty("keyName")
    private final String keyName;

    /**
     * Name of key (parameter name)
     *
     * @return the value
     */
    public String getKeyName() {
        return keyName;
    }

    /** Type of value */
    public enum ValueType implements com.oracle.bmc.http.internal.BmcEnum {
        String("STRING"),
        Secret("SECRET"),
        VaultSecretId("VAULT_SECRET_ID"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ValueType.class);

        private final String value;
        private static java.util.Map<String, ValueType> map;

        static {
            map = new java.util.HashMap<>();
            for (ValueType v : ValueType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValueType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ValueType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of value */
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    private final ValueType valueType;

    /**
     * Type of value
     *
     * @return the value
     */
    public ValueType getValueType() {
        return valueType;
    }

    /** Description of this configuration property */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of this configuration property
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * If the value is true this configuration property is mandatory and visa versa. If not
     * specified configuration property is optional.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
    private final Boolean isMandatory;

    /**
     * If the value is true this configuration property is mandatory and visa versa. If not
     * specified configuration property is optional.
     *
     * @return the value
     */
    public Boolean getIsMandatory() {
        return isMandatory;
    }

    /**
     * The default value for the optional configuration property (it must not be specified for
     * mandatory configuration properties)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default value for the optional configuration property (it must not be specified for
     * mandatory configuration properties)
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** A regular expression will be used for the validation of property value. */
    @com.fasterxml.jackson.annotation.JsonProperty("validationRegexp")
    private final String validationRegexp;

    /**
     * A regular expression will be used for the validation of property value.
     *
     * @return the value
     */
    public String getValidationRegexp() {
        return validationRegexp;
    }

    /** Sample property value (it must match validationRegexp if it is specified) */
    @com.fasterxml.jackson.annotation.JsonProperty("sampleValue")
    private final String sampleValue;

    /**
     * Sample property value (it must match validationRegexp if it is specified)
     *
     * @return the value
     */
    public String getSampleValue() {
        return sampleValue;
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
        sb.append("ConfigurationPropertySchema(");
        sb.append("super=").append(super.toString());
        sb.append("keyName=").append(String.valueOf(this.keyName));
        sb.append(", valueType=").append(String.valueOf(this.valueType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isMandatory=").append(String.valueOf(this.isMandatory));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", validationRegexp=").append(String.valueOf(this.validationRegexp));
        sb.append(", sampleValue=").append(String.valueOf(this.sampleValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigurationPropertySchema)) {
            return false;
        }

        ConfigurationPropertySchema other = (ConfigurationPropertySchema) o;
        return java.util.Objects.equals(this.keyName, other.keyName)
                && java.util.Objects.equals(this.valueType, other.valueType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isMandatory, other.isMandatory)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.validationRegexp, other.validationRegexp)
                && java.util.Objects.equals(this.sampleValue, other.sampleValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyName == null ? 43 : this.keyName.hashCode());
        result = (result * PRIME) + (this.valueType == null ? 43 : this.valueType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isMandatory == null ? 43 : this.isMandatory.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result =
                (result * PRIME)
                        + (this.validationRegexp == null ? 43 : this.validationRegexp.hashCode());
        result = (result * PRIME) + (this.sampleValue == null ? 43 : this.sampleValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
