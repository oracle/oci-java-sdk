/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Additional filters attached to a product of listing <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ListingProductAdditionalFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ListingProductAdditionalFilter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"filterCode", "filterProperties"})
    public ListingProductAdditionalFilter(
            String filterCode, java.util.List<String> filterProperties) {
        super();
        this.filterCode = filterCode;
        this.filterProperties = filterProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** filter code for the product */
        @com.fasterxml.jackson.annotation.JsonProperty("filterCode")
        private String filterCode;

        /**
         * filter code for the product
         *
         * @param filterCode the value to set
         * @return this builder
         */
        public Builder filterCode(String filterCode) {
            this.filterCode = filterCode;
            this.__explicitlySet__.add("filterCode");
            return this;
        }
        /** additional properties attached to a filter */
        @com.fasterxml.jackson.annotation.JsonProperty("filterProperties")
        private java.util.List<String> filterProperties;

        /**
         * additional properties attached to a filter
         *
         * @param filterProperties the value to set
         * @return this builder
         */
        public Builder filterProperties(java.util.List<String> filterProperties) {
            this.filterProperties = filterProperties;
            this.__explicitlySet__.add("filterProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListingProductAdditionalFilter build() {
            ListingProductAdditionalFilter model =
                    new ListingProductAdditionalFilter(this.filterCode, this.filterProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListingProductAdditionalFilter model) {
            if (model.wasPropertyExplicitlySet("filterCode")) {
                this.filterCode(model.getFilterCode());
            }
            if (model.wasPropertyExplicitlySet("filterProperties")) {
                this.filterProperties(model.getFilterProperties());
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

    /** filter code for the product */
    @com.fasterxml.jackson.annotation.JsonProperty("filterCode")
    private final String filterCode;

    /**
     * filter code for the product
     *
     * @return the value
     */
    public String getFilterCode() {
        return filterCode;
    }

    /** additional properties attached to a filter */
    @com.fasterxml.jackson.annotation.JsonProperty("filterProperties")
    private final java.util.List<String> filterProperties;

    /**
     * additional properties attached to a filter
     *
     * @return the value
     */
    public java.util.List<String> getFilterProperties() {
        return filterProperties;
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
        sb.append("ListingProductAdditionalFilter(");
        sb.append("super=").append(super.toString());
        sb.append("filterCode=").append(String.valueOf(this.filterCode));
        sb.append(", filterProperties=").append(String.valueOf(this.filterProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListingProductAdditionalFilter)) {
            return false;
        }

        ListingProductAdditionalFilter other = (ListingProductAdditionalFilter) o;
        return java.util.Objects.equals(this.filterCode, other.filterCode)
                && java.util.Objects.equals(this.filterProperties, other.filterProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filterCode == null ? 43 : this.filterCode.hashCode());
        result =
                (result * PRIME)
                        + (this.filterProperties == null ? 43 : this.filterProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
