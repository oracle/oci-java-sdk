/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Query parameter validation properties.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QueryParameterValidationItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryParameterValidationItem {
    @Deprecated
    @java.beans.ConstructorProperties({"required", "name"})
    public QueryParameterValidationItem(Boolean required, String name) {
        super();
        this.required = required;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Determines if the parameter is required in the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("required")
        private Boolean required;

        /**
         * Determines if the parameter is required in the request.
         * @param required the value to set
         * @return this builder
         **/
        public Builder required(Boolean required) {
            this.required = required;
            this.__explicitlySet__.add("required");
            return this;
        }
        /**
         * Parameter name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Parameter name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryParameterValidationItem build() {
            QueryParameterValidationItem __instance__ =
                    new QueryParameterValidationItem(required, name);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryParameterValidationItem o) {
            Builder copiedBuilder = required(o.getRequired()).name(o.getName());

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
     * Determines if the parameter is required in the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private final Boolean required;

    /**
     * Determines if the parameter is required in the request.
     * @return the value
     **/
    public Boolean getRequired() {
        return required;
    }

    /**
     * Parameter name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Parameter name.
     * @return the value
     **/
    public String getName() {
        return name;
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
        sb.append("QueryParameterValidationItem(");
        sb.append("required=").append(String.valueOf(this.required));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryParameterValidationItem)) {
            return false;
        }

        QueryParameterValidationItem other = (QueryParameterValidationItem) o;
        return java.util.Objects.equals(this.required, other.required)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.required == null ? 43 : this.required.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
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
