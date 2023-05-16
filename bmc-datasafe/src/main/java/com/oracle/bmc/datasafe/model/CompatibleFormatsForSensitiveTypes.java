/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The list of compatible masking formats grouped by generic sensitive types. <br>
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
        builder = CompatibleFormatsForSensitiveTypes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CompatibleFormatsForSensitiveTypes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"formatsForSensitiveType"})
    public CompatibleFormatsForSensitiveTypes(
            java.util.List<FormatsForSensitiveType> formatsForSensitiveType) {
        super();
        this.formatsForSensitiveType = formatsForSensitiveType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An array of library masking formats compatible with the existing sensitive types. */
        @com.fasterxml.jackson.annotation.JsonProperty("formatsForSensitiveType")
        private java.util.List<FormatsForSensitiveType> formatsForSensitiveType;

        /**
         * An array of library masking formats compatible with the existing sensitive types.
         *
         * @param formatsForSensitiveType the value to set
         * @return this builder
         */
        public Builder formatsForSensitiveType(
                java.util.List<FormatsForSensitiveType> formatsForSensitiveType) {
            this.formatsForSensitiveType = formatsForSensitiveType;
            this.__explicitlySet__.add("formatsForSensitiveType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompatibleFormatsForSensitiveTypes build() {
            CompatibleFormatsForSensitiveTypes model =
                    new CompatibleFormatsForSensitiveTypes(this.formatsForSensitiveType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompatibleFormatsForSensitiveTypes model) {
            if (model.wasPropertyExplicitlySet("formatsForSensitiveType")) {
                this.formatsForSensitiveType(model.getFormatsForSensitiveType());
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

    /** An array of library masking formats compatible with the existing sensitive types. */
    @com.fasterxml.jackson.annotation.JsonProperty("formatsForSensitiveType")
    private final java.util.List<FormatsForSensitiveType> formatsForSensitiveType;

    /**
     * An array of library masking formats compatible with the existing sensitive types.
     *
     * @return the value
     */
    public java.util.List<FormatsForSensitiveType> getFormatsForSensitiveType() {
        return formatsForSensitiveType;
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
        sb.append("CompatibleFormatsForSensitiveTypes(");
        sb.append("super=").append(super.toString());
        sb.append("formatsForSensitiveType=").append(String.valueOf(this.formatsForSensitiveType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompatibleFormatsForSensitiveTypes)) {
            return false;
        }

        CompatibleFormatsForSensitiveTypes other = (CompatibleFormatsForSensitiveTypes) o;
        return java.util.Objects.equals(this.formatsForSensitiveType, other.formatsForSensitiveType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.formatsForSensitiveType == null
                                ? 43
                                : this.formatsForSensitiveType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
