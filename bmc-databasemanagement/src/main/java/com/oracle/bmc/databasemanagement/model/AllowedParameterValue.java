/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A valid value for a database parameter. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AllowedParameterValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AllowedParameterValue
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ordinal", "value", "isDefault"})
    public AllowedParameterValue(java.math.BigDecimal ordinal, String value, Boolean isDefault) {
        super();
        this.ordinal = ordinal;
        this.value = value;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ordinal number in the list (1-based). */
        @com.fasterxml.jackson.annotation.JsonProperty("ordinal")
        private java.math.BigDecimal ordinal;

        /**
         * The ordinal number in the list (1-based).
         *
         * @param ordinal the value to set
         * @return this builder
         */
        public Builder ordinal(java.math.BigDecimal ordinal) {
            this.ordinal = ordinal;
            this.__explicitlySet__.add("ordinal");
            return this;
        }
        /** The parameter value at ordinal. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The parameter value at ordinal.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Indicates whether the given ordinal value is the default value for the parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates whether the given ordinal value is the default value for the parameter.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllowedParameterValue build() {
            AllowedParameterValue model =
                    new AllowedParameterValue(this.ordinal, this.value, this.isDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowedParameterValue model) {
            if (model.wasPropertyExplicitlySet("ordinal")) {
                this.ordinal(model.getOrdinal());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
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

    /** The ordinal number in the list (1-based). */
    @com.fasterxml.jackson.annotation.JsonProperty("ordinal")
    private final java.math.BigDecimal ordinal;

    /**
     * The ordinal number in the list (1-based).
     *
     * @return the value
     */
    public java.math.BigDecimal getOrdinal() {
        return ordinal;
    }

    /** The parameter value at ordinal. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The parameter value at ordinal.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Indicates whether the given ordinal value is the default value for the parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates whether the given ordinal value is the default value for the parameter.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
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
        sb.append("AllowedParameterValue(");
        sb.append("super=").append(super.toString());
        sb.append("ordinal=").append(String.valueOf(this.ordinal));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllowedParameterValue)) {
            return false;
        }

        AllowedParameterValue other = (AllowedParameterValue) o;
        return java.util.Objects.equals(this.ordinal, other.ordinal)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ordinal == null ? 43 : this.ordinal.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
