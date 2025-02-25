/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the action parameter and its possible values that is used in listParamsForActionType.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ActionParamValuesSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ActionParamValuesSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "parameterName",
        "parameterType",
        "parameterValues",
        "defaultValue",
        "isRequired"
    })
    public ActionParamValuesSummary(
            String parameterName,
            ParameterType parameterType,
            java.util.List<String> parameterValues,
            String defaultValue,
            Boolean isRequired) {
        super();
        this.parameterName = parameterName;
        this.parameterType = parameterType;
        this.parameterValues = parameterValues;
        this.defaultValue = defaultValue;
        this.isRequired = isRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of this parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
        private String parameterName;

        /**
         * The name of this parameter.
         * @param parameterName the value to set
         * @return this builder
         **/
        public Builder parameterName(String parameterName) {
            this.parameterName = parameterName;
            this.__explicitlySet__.add("parameterName");
            return this;
        }
        /**
         * The type of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterType")
        private ParameterType parameterType;

        /**
         * The type of the parameter.
         * @param parameterType the value to set
         * @return this builder
         **/
        public Builder parameterType(ParameterType parameterType) {
            this.parameterType = parameterType;
            this.__explicitlySet__.add("parameterType");
            return this;
        }
        /**
         * Possible values for this parameter. In case of integer it's min and max values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterValues")
        private java.util.List<String> parameterValues;

        /**
         * Possible values for this parameter. In case of integer it's min and max values.
         * @param parameterValues the value to set
         * @return this builder
         **/
        public Builder parameterValues(java.util.List<String> parameterValues) {
            this.parameterValues = parameterValues;
            this.__explicitlySet__.add("parameterValues");
            return this;
        }
        /**
         * The default value for this parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default value for this parameter.
         * @param defaultValue the value to set
         * @return this builder
         **/
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /**
         * Whether this parameter is required or not for this action type.\u3001
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * Whether this parameter is required or not for this action type.\u3001
         * @param isRequired the value to set
         * @return this builder
         **/
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActionParamValuesSummary build() {
            ActionParamValuesSummary model =
                    new ActionParamValuesSummary(
                            this.parameterName,
                            this.parameterType,
                            this.parameterValues,
                            this.defaultValue,
                            this.isRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActionParamValuesSummary model) {
            if (model.wasPropertyExplicitlySet("parameterName")) {
                this.parameterName(model.getParameterName());
            }
            if (model.wasPropertyExplicitlySet("parameterType")) {
                this.parameterType(model.getParameterType());
            }
            if (model.wasPropertyExplicitlySet("parameterValues")) {
                this.parameterValues(model.getParameterValues());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
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
     * The name of this parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
    private final String parameterName;

    /**
     * The name of this parameter.
     * @return the value
     **/
    public String getParameterName() {
        return parameterName;
    }

    /**
     * The type of the parameter.
     **/
    public enum ParameterType {
        Boolean("BOOLEAN"),
        String("STRING"),
        Integer("INTEGER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ParameterType.class);

        private final String value;
        private static java.util.Map<String, ParameterType> map;

        static {
            map = new java.util.HashMap<>();
            for (ParameterType v : ParameterType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ParameterType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ParameterType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ParameterType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterType")
    private final ParameterType parameterType;

    /**
     * The type of the parameter.
     * @return the value
     **/
    public ParameterType getParameterType() {
        return parameterType;
    }

    /**
     * Possible values for this parameter. In case of integer it's min and max values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterValues")
    private final java.util.List<String> parameterValues;

    /**
     * Possible values for this parameter. In case of integer it's min and max values.
     * @return the value
     **/
    public java.util.List<String> getParameterValues() {
        return parameterValues;
    }

    /**
     * The default value for this parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default value for this parameter.
     * @return the value
     **/
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Whether this parameter is required or not for this action type.\u3001
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * Whether this parameter is required or not for this action type.\u3001
     * @return the value
     **/
    public Boolean getIsRequired() {
        return isRequired;
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
        sb.append("ActionParamValuesSummary(");
        sb.append("super=").append(super.toString());
        sb.append("parameterName=").append(String.valueOf(this.parameterName));
        sb.append(", parameterType=").append(String.valueOf(this.parameterType));
        sb.append(", parameterValues=").append(String.valueOf(this.parameterValues));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionParamValuesSummary)) {
            return false;
        }

        ActionParamValuesSummary other = (ActionParamValuesSummary) o;
        return java.util.Objects.equals(this.parameterName, other.parameterName)
                && java.util.Objects.equals(this.parameterType, other.parameterType)
                && java.util.Objects.equals(this.parameterValues, other.parameterValues)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.parameterName == null ? 43 : this.parameterName.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterType == null ? 43 : this.parameterType.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterValues == null ? 43 : this.parameterValues.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
