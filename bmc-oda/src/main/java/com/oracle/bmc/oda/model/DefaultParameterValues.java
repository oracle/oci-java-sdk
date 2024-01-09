/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Default values for parameters required to import a package <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DefaultParameterValues.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DefaultParameterValues
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceTypesDefaultParameterValues"})
    public DefaultParameterValues(
            java.util.List<ResourceTypeDefaultParameterValues>
                    resourceTypesDefaultParameterValues) {
        super();
        this.resourceTypesDefaultParameterValues = resourceTypesDefaultParameterValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of resource type specific default parameter values, one set for each resource type
         * listed in the package definition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypesDefaultParameterValues")
        private java.util.List<ResourceTypeDefaultParameterValues>
                resourceTypesDefaultParameterValues;

        /**
         * A list of resource type specific default parameter values, one set for each resource type
         * listed in the package definition.
         *
         * @param resourceTypesDefaultParameterValues the value to set
         * @return this builder
         */
        public Builder resourceTypesDefaultParameterValues(
                java.util.List<ResourceTypeDefaultParameterValues>
                        resourceTypesDefaultParameterValues) {
            this.resourceTypesDefaultParameterValues = resourceTypesDefaultParameterValues;
            this.__explicitlySet__.add("resourceTypesDefaultParameterValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultParameterValues build() {
            DefaultParameterValues model =
                    new DefaultParameterValues(this.resourceTypesDefaultParameterValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultParameterValues model) {
            if (model.wasPropertyExplicitlySet("resourceTypesDefaultParameterValues")) {
                this.resourceTypesDefaultParameterValues(
                        model.getResourceTypesDefaultParameterValues());
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

    /**
     * A list of resource type specific default parameter values, one set for each resource type
     * listed in the package definition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypesDefaultParameterValues")
    private final java.util.List<ResourceTypeDefaultParameterValues>
            resourceTypesDefaultParameterValues;

    /**
     * A list of resource type specific default parameter values, one set for each resource type
     * listed in the package definition.
     *
     * @return the value
     */
    public java.util.List<ResourceTypeDefaultParameterValues>
            getResourceTypesDefaultParameterValues() {
        return resourceTypesDefaultParameterValues;
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
        sb.append("DefaultParameterValues(");
        sb.append("super=").append(super.toString());
        sb.append("resourceTypesDefaultParameterValues=")
                .append(String.valueOf(this.resourceTypesDefaultParameterValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultParameterValues)) {
            return false;
        }

        DefaultParameterValues other = (DefaultParameterValues) o;
        return java.util.Objects.equals(
                        this.resourceTypesDefaultParameterValues,
                        other.resourceTypesDefaultParameterValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceTypesDefaultParameterValues == null
                                ? 43
                                : this.resourceTypesDefaultParameterValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
