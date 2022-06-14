/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Configuration options for the Access Control Service.
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
    builder = ShapeAccessControlServiceEnabledPlatformOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShapeAccessControlServiceEnabledPlatformOptions {
    @Deprecated
    @java.beans.ConstructorProperties({"allowedValues", "isDefaultEnabled"})
    public ShapeAccessControlServiceEnabledPlatformOptions(
            java.util.List<Boolean> allowedValues, Boolean isDefaultEnabled) {
        super();
        this.allowedValues = allowedValues;
        this.isDefaultEnabled = isDefaultEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether the Access Control Service can be enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<Boolean> allowedValues;

        /**
         * Whether the Access Control Service can be enabled.
         *
         * @param allowedValues the value to set
         * @return this builder
         **/
        public Builder allowedValues(java.util.List<Boolean> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }
        /**
         * Whether the Access Control Service is enabled by default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultEnabled")
        private Boolean isDefaultEnabled;

        /**
         * Whether the Access Control Service is enabled by default.
         *
         * @param isDefaultEnabled the value to set
         * @return this builder
         **/
        public Builder isDefaultEnabled(Boolean isDefaultEnabled) {
            this.isDefaultEnabled = isDefaultEnabled;
            this.__explicitlySet__.add("isDefaultEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeAccessControlServiceEnabledPlatformOptions build() {
            ShapeAccessControlServiceEnabledPlatformOptions __instance__ =
                    new ShapeAccessControlServiceEnabledPlatformOptions(
                            allowedValues, isDefaultEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeAccessControlServiceEnabledPlatformOptions o) {
            Builder copiedBuilder =
                    allowedValues(o.getAllowedValues()).isDefaultEnabled(o.getIsDefaultEnabled());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Whether the Access Control Service can be enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<Boolean> allowedValues;

    /**
     * Whether the Access Control Service can be enabled.
     *
     * @return the value
     **/
    public java.util.List<Boolean> getAllowedValues() {
        return allowedValues;
    }

    /**
     * Whether the Access Control Service is enabled by default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultEnabled")
    private final Boolean isDefaultEnabled;

    /**
     * Whether the Access Control Service is enabled by default.
     *
     * @return the value
     **/
    public Boolean getIsDefaultEnabled() {
        return isDefaultEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ShapeAccessControlServiceEnabledPlatformOptions(");
        sb.append("allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", isDefaultEnabled=").append(String.valueOf(this.isDefaultEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeAccessControlServiceEnabledPlatformOptions)) {
            return false;
        }

        ShapeAccessControlServiceEnabledPlatformOptions other =
                (ShapeAccessControlServiceEnabledPlatformOptions) o;
        return java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.isDefaultEnabled, other.isDefaultEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
