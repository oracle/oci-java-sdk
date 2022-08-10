/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the script parameters, paramName must be from the script content and
 * these details can be used to overwrite the default parameter present in the script content.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScriptParameter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScriptParameter extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"paramName", "paramValue", "isSecret"})
    public ScriptParameter(String paramName, String paramValue, Boolean isSecret) {
        super();
        this.paramName = paramName;
        this.paramValue = paramValue;
        this.isSecret = isSecret;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paramName")
        private String paramName;

        /**
         * Name of the parameter.
         * @param paramName the value to set
         * @return this builder
         **/
        public Builder paramName(String paramName) {
            this.paramName = paramName;
            this.__explicitlySet__.add("paramName");
            return this;
        }
        /**
         * Value of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paramValue")
        private String paramValue;

        /**
         * Value of the parameter.
         * @param paramValue the value to set
         * @return this builder
         **/
        public Builder paramValue(String paramValue) {
            this.paramValue = paramValue;
            this.__explicitlySet__.add("paramValue");
            return this;
        }
        /**
         * If the parameter value is secret and should be kept confidential, then set isSecret to true.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSecret")
        private Boolean isSecret;

        /**
         * If the parameter value is secret and should be kept confidential, then set isSecret to true.
         * @param isSecret the value to set
         * @return this builder
         **/
        public Builder isSecret(Boolean isSecret) {
            this.isSecret = isSecret;
            this.__explicitlySet__.add("isSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScriptParameter build() {
            ScriptParameter model =
                    new ScriptParameter(this.paramName, this.paramValue, this.isSecret);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScriptParameter model) {
            if (model.wasPropertyExplicitlySet("paramName")) {
                this.paramName(model.getParamName());
            }
            if (model.wasPropertyExplicitlySet("paramValue")) {
                this.paramValue(model.getParamValue());
            }
            if (model.wasPropertyExplicitlySet("isSecret")) {
                this.isSecret(model.getIsSecret());
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
     * Name of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paramName")
    private final String paramName;

    /**
     * Name of the parameter.
     * @return the value
     **/
    public String getParamName() {
        return paramName;
    }

    /**
     * Value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paramValue")
    private final String paramValue;

    /**
     * Value of the parameter.
     * @return the value
     **/
    public String getParamValue() {
        return paramValue;
    }

    /**
     * If the parameter value is secret and should be kept confidential, then set isSecret to true.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecret")
    private final Boolean isSecret;

    /**
     * If the parameter value is secret and should be kept confidential, then set isSecret to true.
     * @return the value
     **/
    public Boolean getIsSecret() {
        return isSecret;
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
        sb.append("ScriptParameter(");
        sb.append("super=").append(super.toString());
        sb.append("paramName=").append(String.valueOf(this.paramName));
        sb.append(", paramValue=").append(String.valueOf(this.paramValue));
        sb.append(", isSecret=").append(String.valueOf(this.isSecret));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScriptParameter)) {
            return false;
        }

        ScriptParameter other = (ScriptParameter) o;
        return java.util.Objects.equals(this.paramName, other.paramName)
                && java.util.Objects.equals(this.paramValue, other.paramValue)
                && java.util.Objects.equals(this.isSecret, other.isSecret)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.paramName == null ? 43 : this.paramName.hashCode());
        result = (result * PRIME) + (this.paramValue == null ? 43 : this.paramValue.hashCode());
        result = (result * PRIME) + (this.isSecret == null ? 43 : this.isSecret.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
