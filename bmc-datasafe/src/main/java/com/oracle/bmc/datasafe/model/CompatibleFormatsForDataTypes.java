/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A list of basic masking formats compatible with and grouped by the supported data types. The data
 * types are grouped into the following categories - Character - Includes CHAR, NCHAR, VARCHAR2, and
 * NVARCHAR2 Numeric - Includes NUMBER, FLOAT, RAW, BINARY_FLOAT, and BINARY_DOUBLE Date - Includes
 * DATE and TIMESTAMP LOB - Includes BLOB, CLOB, and NCLOB All - Includes all the supported data
 * types <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CompatibleFormatsForDataTypes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CompatibleFormatsForDataTypes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"formatsForDataType"})
    public CompatibleFormatsForDataTypes(java.util.List<FormatsForDataType> formatsForDataType) {
        super();
        this.formatsForDataType = formatsForDataType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An array of lists of basic masking formats compatible with the supported data types. */
        @com.fasterxml.jackson.annotation.JsonProperty("formatsForDataType")
        private java.util.List<FormatsForDataType> formatsForDataType;

        /**
         * An array of lists of basic masking formats compatible with the supported data types.
         *
         * @param formatsForDataType the value to set
         * @return this builder
         */
        public Builder formatsForDataType(java.util.List<FormatsForDataType> formatsForDataType) {
            this.formatsForDataType = formatsForDataType;
            this.__explicitlySet__.add("formatsForDataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompatibleFormatsForDataTypes build() {
            CompatibleFormatsForDataTypes model =
                    new CompatibleFormatsForDataTypes(this.formatsForDataType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompatibleFormatsForDataTypes model) {
            if (model.wasPropertyExplicitlySet("formatsForDataType")) {
                this.formatsForDataType(model.getFormatsForDataType());
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

    /** An array of lists of basic masking formats compatible with the supported data types. */
    @com.fasterxml.jackson.annotation.JsonProperty("formatsForDataType")
    private final java.util.List<FormatsForDataType> formatsForDataType;

    /**
     * An array of lists of basic masking formats compatible with the supported data types.
     *
     * @return the value
     */
    public java.util.List<FormatsForDataType> getFormatsForDataType() {
        return formatsForDataType;
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
        sb.append("CompatibleFormatsForDataTypes(");
        sb.append("super=").append(super.toString());
        sb.append("formatsForDataType=").append(String.valueOf(this.formatsForDataType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompatibleFormatsForDataTypes)) {
            return false;
        }

        CompatibleFormatsForDataTypes other = (CompatibleFormatsForDataTypes) o;
        return java.util.Objects.equals(this.formatsForDataType, other.formatsForDataType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.formatsForDataType == null
                                ? 43
                                : this.formatsForDataType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
