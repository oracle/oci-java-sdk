/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Allowed value details of configuration item for PICK type. Value has to be from one of the possibleValues.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConfigurationItemPickAllowedValueDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "allowedValueType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfigurationItemPickAllowedValueDetails
        extends ConfigurationItemAllowedValueDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Allowed values to pick for the configuration item.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
        private java.util.List<String> possibleValues;

        /**
         * Allowed values to pick for the configuration item.
         * @param possibleValues the value to set
         * @return this builder
         **/
        public Builder possibleValues(java.util.List<String> possibleValues) {
            this.possibleValues = possibleValues;
            this.__explicitlySet__.add("possibleValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationItemPickAllowedValueDetails build() {
            ConfigurationItemPickAllowedValueDetails model =
                    new ConfigurationItemPickAllowedValueDetails(this.possibleValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationItemPickAllowedValueDetails model) {
            if (model.wasPropertyExplicitlySet("possibleValues")) {
                this.possibleValues(model.getPossibleValues());
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

    @Deprecated
    public ConfigurationItemPickAllowedValueDetails(java.util.List<String> possibleValues) {
        super();
        this.possibleValues = possibleValues;
    }

    /**
     * Allowed values to pick for the configuration item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
    private final java.util.List<String> possibleValues;

    /**
     * Allowed values to pick for the configuration item.
     * @return the value
     **/
    public java.util.List<String> getPossibleValues() {
        return possibleValues;
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
        sb.append("ConfigurationItemPickAllowedValueDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", possibleValues=").append(String.valueOf(this.possibleValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigurationItemPickAllowedValueDetails)) {
            return false;
        }

        ConfigurationItemPickAllowedValueDetails other =
                (ConfigurationItemPickAllowedValueDetails) o;
        return java.util.Objects.equals(this.possibleValues, other.possibleValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.possibleValues == null ? 43 : this.possibleValues.hashCode());
        return result;
    }
}
