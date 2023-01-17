/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Default values needed to import a resource type for a package. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceTypeDefaultParameterValues.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ResourceTypeDefaultParameterValues
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceType", "parameterValues"})
    public ResourceTypeDefaultParameterValues(
            String resourceType, java.util.Map<String, String> parameterValues) {
        super();
        this.resourceType = resourceType;
        this.parameterValues = parameterValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of resource to which these resourceType-specific parameter values apply */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The type of resource to which these resourceType-specific parameter values apply
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** A list of parameter values used to import the package. */
        @com.fasterxml.jackson.annotation.JsonProperty("parameterValues")
        private java.util.Map<String, String> parameterValues;

        /**
         * A list of parameter values used to import the package.
         *
         * @param parameterValues the value to set
         * @return this builder
         */
        public Builder parameterValues(java.util.Map<String, String> parameterValues) {
            this.parameterValues = parameterValues;
            this.__explicitlySet__.add("parameterValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceTypeDefaultParameterValues build() {
            ResourceTypeDefaultParameterValues model =
                    new ResourceTypeDefaultParameterValues(this.resourceType, this.parameterValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceTypeDefaultParameterValues model) {
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("parameterValues")) {
                this.parameterValues(model.getParameterValues());
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

    /** The type of resource to which these resourceType-specific parameter values apply */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The type of resource to which these resourceType-specific parameter values apply
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** A list of parameter values used to import the package. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameterValues")
    private final java.util.Map<String, String> parameterValues;

    /**
     * A list of parameter values used to import the package.
     *
     * @return the value
     */
    public java.util.Map<String, String> getParameterValues() {
        return parameterValues;
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
        sb.append("ResourceTypeDefaultParameterValues(");
        sb.append("super=").append(super.toString());
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", parameterValues=").append(String.valueOf(this.parameterValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceTypeDefaultParameterValues)) {
            return false;
        }

        ResourceTypeDefaultParameterValues other = (ResourceTypeDefaultParameterValues) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.parameterValues, other.parameterValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterValues == null ? 43 : this.parameterValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
