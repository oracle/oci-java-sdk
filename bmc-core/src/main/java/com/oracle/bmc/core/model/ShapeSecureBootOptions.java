/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Configuration options for Secure Boot. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ShapeSecureBootOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShapeSecureBootOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"allowedValues", "isDefaultEnabled"})
    public ShapeSecureBootOptions(java.util.List<Boolean> allowedValues, Boolean isDefaultEnabled) {
        super();
        this.allowedValues = allowedValues;
        this.isDefaultEnabled = isDefaultEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Boolean values that indicate whether Secure Boot can be enabled or disabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<Boolean> allowedValues;

        /**
         * Boolean values that indicate whether Secure Boot can be enabled or disabled.
         *
         * @param allowedValues the value to set
         * @return this builder
         */
        public Builder allowedValues(java.util.List<Boolean> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }
        /** Whether Secure Boot is enabled by default. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultEnabled")
        private Boolean isDefaultEnabled;

        /**
         * Whether Secure Boot is enabled by default.
         *
         * @param isDefaultEnabled the value to set
         * @return this builder
         */
        public Builder isDefaultEnabled(Boolean isDefaultEnabled) {
            this.isDefaultEnabled = isDefaultEnabled;
            this.__explicitlySet__.add("isDefaultEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeSecureBootOptions build() {
            ShapeSecureBootOptions model =
                    new ShapeSecureBootOptions(this.allowedValues, this.isDefaultEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeSecureBootOptions model) {
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
            }
            if (model.wasPropertyExplicitlySet("isDefaultEnabled")) {
                this.isDefaultEnabled(model.getIsDefaultEnabled());
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

    /** Boolean values that indicate whether Secure Boot can be enabled or disabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<Boolean> allowedValues;

    /**
     * Boolean values that indicate whether Secure Boot can be enabled or disabled.
     *
     * @return the value
     */
    public java.util.List<Boolean> getAllowedValues() {
        return allowedValues;
    }

    /** Whether Secure Boot is enabled by default. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultEnabled")
    private final Boolean isDefaultEnabled;

    /**
     * Whether Secure Boot is enabled by default.
     *
     * @return the value
     */
    public Boolean getIsDefaultEnabled() {
        return isDefaultEnabled;
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
        sb.append("ShapeSecureBootOptions(");
        sb.append("super=").append(super.toString());
        sb.append("allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", isDefaultEnabled=").append(String.valueOf(this.isDefaultEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeSecureBootOptions)) {
            return false;
        }

        ShapeSecureBootOptions other = (ShapeSecureBootOptions) o;
        return java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.isDefaultEnabled, other.isDefaultEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultEnabled == null ? 43 : this.isDefaultEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
