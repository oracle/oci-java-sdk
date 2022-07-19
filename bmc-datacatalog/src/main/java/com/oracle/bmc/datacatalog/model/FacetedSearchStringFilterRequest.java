/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Object with string filter criteria
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FacetedSearchStringFilterRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FacetedSearchStringFilterRequest {
    @Deprecated
    @java.beans.ConstructorProperties({"field", "values"})
    public FacetedSearchStringFilterRequest(String field, java.util.List<String> values) {
        super();
        this.field = field;
        this.values = values;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * String/boolean/numerical field name that needs to filtered with
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("field")
        private String field;

        /**
         * String/boolean/numerical field name that needs to filtered with
         * @param field the value to set
         * @return this builder
         **/
        public Builder field(String field) {
            this.field = field;
            this.__explicitlySet__.add("field");
            return this;
        }
        /**
         * Array of values that the search results needs to be filtered by.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<String> values;

        /**
         * Array of values that the search results needs to be filtered by.
         * @param values the value to set
         * @return this builder
         **/
        public Builder values(java.util.List<String> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FacetedSearchStringFilterRequest build() {
            FacetedSearchStringFilterRequest __instance__ =
                    new FacetedSearchStringFilterRequest(field, values);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FacetedSearchStringFilterRequest o) {
            Builder copiedBuilder = field(o.getField()).values(o.getValues());

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
     * String/boolean/numerical field name that needs to filtered with
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("field")
    private final String field;

    /**
     * String/boolean/numerical field name that needs to filtered with
     * @return the value
     **/
    public String getField() {
        return field;
    }

    /**
     * Array of values that the search results needs to be filtered by.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<String> values;

    /**
     * Array of values that the search results needs to be filtered by.
     * @return the value
     **/
    public java.util.List<String> getValues() {
        return values;
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
        sb.append("FacetedSearchStringFilterRequest(");
        sb.append("field=").append(String.valueOf(this.field));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FacetedSearchStringFilterRequest)) {
            return false;
        }

        FacetedSearchStringFilterRequest other = (FacetedSearchStringFilterRequest) o;
        return java.util.Objects.equals(this.field, other.field)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
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
