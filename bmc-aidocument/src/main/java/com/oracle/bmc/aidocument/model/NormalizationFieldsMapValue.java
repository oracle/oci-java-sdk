/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * Object for the value in the NormalizationFields map <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NormalizationFieldsMapValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NormalizationFieldsMapValue
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"normalizationType"})
    public NormalizationFieldsMapValue(String normalizationType) {
        super();
        this.normalizationType = normalizationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A string mapping to the normalization type. */
        @com.fasterxml.jackson.annotation.JsonProperty("normalizationType")
        private String normalizationType;

        /**
         * A string mapping to the normalization type.
         *
         * @param normalizationType the value to set
         * @return this builder
         */
        public Builder normalizationType(String normalizationType) {
            this.normalizationType = normalizationType;
            this.__explicitlySet__.add("normalizationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NormalizationFieldsMapValue build() {
            NormalizationFieldsMapValue model =
                    new NormalizationFieldsMapValue(this.normalizationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NormalizationFieldsMapValue model) {
            if (model.wasPropertyExplicitlySet("normalizationType")) {
                this.normalizationType(model.getNormalizationType());
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

    /** A string mapping to the normalization type. */
    @com.fasterxml.jackson.annotation.JsonProperty("normalizationType")
    private final String normalizationType;

    /**
     * A string mapping to the normalization type.
     *
     * @return the value
     */
    public String getNormalizationType() {
        return normalizationType;
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
        sb.append("NormalizationFieldsMapValue(");
        sb.append("super=").append(super.toString());
        sb.append("normalizationType=").append(String.valueOf(this.normalizationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NormalizationFieldsMapValue)) {
            return false;
        }

        NormalizationFieldsMapValue other = (NormalizationFieldsMapValue) o;
        return java.util.Objects.equals(this.normalizationType, other.normalizationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.normalizationType == null ? 43 : this.normalizationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
