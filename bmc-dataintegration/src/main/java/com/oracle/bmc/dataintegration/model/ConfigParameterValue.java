/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Contains the parameter configuration values. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigParameterValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigParameterValue
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stringValue",
        "intValue",
        "objectValue",
        "refValue",
        "parameterValue",
        "rootObjectValue"
    })
    public ConfigParameterValue(
            String stringValue,
            Integer intValue,
            Object objectValue,
            Object refValue,
            String parameterValue,
            Object rootObjectValue) {
        super();
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.objectValue = objectValue;
        this.refValue = refValue;
        this.parameterValue = parameterValue;
        this.rootObjectValue = rootObjectValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A string value of the parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("stringValue")
        private String stringValue;

        /**
         * A string value of the parameter.
         *
         * @param stringValue the value to set
         * @return this builder
         */
        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            this.__explicitlySet__.add("stringValue");
            return this;
        }
        /** An integer value of the parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("intValue")
        private Integer intValue;

        /**
         * An integer value of the parameter.
         *
         * @param intValue the value to set
         * @return this builder
         */
        public Builder intValue(Integer intValue) {
            this.intValue = intValue;
            this.__explicitlySet__.add("intValue");
            return this;
        }
        /** An object value of the parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectValue")
        private Object objectValue;

        /**
         * An object value of the parameter.
         *
         * @param objectValue the value to set
         * @return this builder
         */
        public Builder objectValue(Object objectValue) {
            this.objectValue = objectValue;
            this.__explicitlySet__.add("objectValue");
            return this;
        }
        /** The root object reference value. */
        @com.fasterxml.jackson.annotation.JsonProperty("refValue")
        private Object refValue;

        /**
         * The root object reference value.
         *
         * @param refValue the value to set
         * @return this builder
         */
        public Builder refValue(Object refValue) {
            this.refValue = refValue;
            this.__explicitlySet__.add("refValue");
            return this;
        }
        /** Reference to the parameter by its key. */
        @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
        private String parameterValue;

        /**
         * Reference to the parameter by its key.
         *
         * @param parameterValue the value to set
         * @return this builder
         */
        public Builder parameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            this.__explicitlySet__.add("parameterValue");
            return this;
        }
        /** The root object value, used in custom parameters. */
        @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
        private Object rootObjectValue;

        /**
         * The root object value, used in custom parameters.
         *
         * @param rootObjectValue the value to set
         * @return this builder
         */
        public Builder rootObjectValue(Object rootObjectValue) {
            this.rootObjectValue = rootObjectValue;
            this.__explicitlySet__.add("rootObjectValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigParameterValue build() {
            ConfigParameterValue model =
                    new ConfigParameterValue(
                            this.stringValue,
                            this.intValue,
                            this.objectValue,
                            this.refValue,
                            this.parameterValue,
                            this.rootObjectValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigParameterValue model) {
            if (model.wasPropertyExplicitlySet("stringValue")) {
                this.stringValue(model.getStringValue());
            }
            if (model.wasPropertyExplicitlySet("intValue")) {
                this.intValue(model.getIntValue());
            }
            if (model.wasPropertyExplicitlySet("objectValue")) {
                this.objectValue(model.getObjectValue());
            }
            if (model.wasPropertyExplicitlySet("refValue")) {
                this.refValue(model.getRefValue());
            }
            if (model.wasPropertyExplicitlySet("parameterValue")) {
                this.parameterValue(model.getParameterValue());
            }
            if (model.wasPropertyExplicitlySet("rootObjectValue")) {
                this.rootObjectValue(model.getRootObjectValue());
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

    /** A string value of the parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("stringValue")
    private final String stringValue;

    /**
     * A string value of the parameter.
     *
     * @return the value
     */
    public String getStringValue() {
        return stringValue;
    }

    /** An integer value of the parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("intValue")
    private final Integer intValue;

    /**
     * An integer value of the parameter.
     *
     * @return the value
     */
    public Integer getIntValue() {
        return intValue;
    }

    /** An object value of the parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectValue")
    private final Object objectValue;

    /**
     * An object value of the parameter.
     *
     * @return the value
     */
    public Object getObjectValue() {
        return objectValue;
    }

    /** The root object reference value. */
    @com.fasterxml.jackson.annotation.JsonProperty("refValue")
    private final Object refValue;

    /**
     * The root object reference value.
     *
     * @return the value
     */
    public Object getRefValue() {
        return refValue;
    }

    /** Reference to the parameter by its key. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
    private final String parameterValue;

    /**
     * Reference to the parameter by its key.
     *
     * @return the value
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /** The root object value, used in custom parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
    private final Object rootObjectValue;

    /**
     * The root object value, used in custom parameters.
     *
     * @return the value
     */
    public Object getRootObjectValue() {
        return rootObjectValue;
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
        sb.append("ConfigParameterValue(");
        sb.append("super=").append(super.toString());
        sb.append("stringValue=").append(String.valueOf(this.stringValue));
        sb.append(", intValue=").append(String.valueOf(this.intValue));
        sb.append(", objectValue=").append(String.valueOf(this.objectValue));
        sb.append(", refValue=").append(String.valueOf(this.refValue));
        sb.append(", parameterValue=").append(String.valueOf(this.parameterValue));
        sb.append(", rootObjectValue=").append(String.valueOf(this.rootObjectValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigParameterValue)) {
            return false;
        }

        ConfigParameterValue other = (ConfigParameterValue) o;
        return java.util.Objects.equals(this.stringValue, other.stringValue)
                && java.util.Objects.equals(this.intValue, other.intValue)
                && java.util.Objects.equals(this.objectValue, other.objectValue)
                && java.util.Objects.equals(this.refValue, other.refValue)
                && java.util.Objects.equals(this.parameterValue, other.parameterValue)
                && java.util.Objects.equals(this.rootObjectValue, other.rootObjectValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stringValue == null ? 43 : this.stringValue.hashCode());
        result = (result * PRIME) + (this.intValue == null ? 43 : this.intValue.hashCode());
        result = (result * PRIME) + (this.objectValue == null ? 43 : this.objectValue.hashCode());
        result = (result * PRIME) + (this.refValue == null ? 43 : this.refValue.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterValue == null ? 43 : this.parameterValue.hashCode());
        result =
                (result * PRIME)
                        + (this.rootObjectValue == null ? 43 : this.rootObjectValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
