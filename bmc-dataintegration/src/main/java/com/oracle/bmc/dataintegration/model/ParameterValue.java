/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * User defined value for a parameter. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParameterValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ParameterValue
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"simpleValue", "rootObjectValue"})
    public ParameterValue(Object simpleValue, Object rootObjectValue) {
        super();
        this.simpleValue = simpleValue;
        this.rootObjectValue = rootObjectValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A simple value for the parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("simpleValue")
        private Object simpleValue;

        /**
         * A simple value for the parameter.
         *
         * @param simpleValue the value to set
         * @return this builder
         */
        public Builder simpleValue(Object simpleValue) {
            this.simpleValue = simpleValue;
            this.__explicitlySet__.add("simpleValue");
            return this;
        }
        /** This can be any object such as a file entity, a schema, or a table. */
        @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
        private Object rootObjectValue;

        /**
         * This can be any object such as a file entity, a schema, or a table.
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

        public ParameterValue build() {
            ParameterValue model = new ParameterValue(this.simpleValue, this.rootObjectValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParameterValue model) {
            if (model.wasPropertyExplicitlySet("simpleValue")) {
                this.simpleValue(model.getSimpleValue());
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

    /** A simple value for the parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("simpleValue")
    private final Object simpleValue;

    /**
     * A simple value for the parameter.
     *
     * @return the value
     */
    public Object getSimpleValue() {
        return simpleValue;
    }

    /** This can be any object such as a file entity, a schema, or a table. */
    @com.fasterxml.jackson.annotation.JsonProperty("rootObjectValue")
    private final Object rootObjectValue;

    /**
     * This can be any object such as a file entity, a schema, or a table.
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
        sb.append("ParameterValue(");
        sb.append("super=").append(super.toString());
        sb.append("simpleValue=").append(String.valueOf(this.simpleValue));
        sb.append(", rootObjectValue=").append(String.valueOf(this.rootObjectValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParameterValue)) {
            return false;
        }

        ParameterValue other = (ParameterValue) o;
        return java.util.Objects.equals(this.simpleValue, other.simpleValue)
                && java.util.Objects.equals(this.rootObjectValue, other.rootObjectValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.simpleValue == null ? 43 : this.simpleValue.hashCode());
        result =
                (result * PRIME)
                        + (this.rootObjectValue == null ? 43 : this.rootObjectValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
