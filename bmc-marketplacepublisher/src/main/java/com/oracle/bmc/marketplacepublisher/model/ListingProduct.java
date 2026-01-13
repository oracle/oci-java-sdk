/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Products associated with listing. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListingProduct.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ListingProduct
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "categories", "additionalFilters"})
    public ListingProduct(
            String code,
            java.util.List<String> categories,
            java.util.List<ListingProductAdditionalFilter> additionalFilters) {
        super();
        this.code = code;
        this.categories = categories;
        this.additionalFilters = additionalFilters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Product Code */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * Product Code
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /** List of category codes within a Product which are applicable to the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<String> categories;

        /**
         * List of category codes within a Product which are applicable to the listing revision.
         *
         * @param categories the value to set
         * @return this builder
         */
        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }
        /** Custom filter for the product */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalFilters")
        private java.util.List<ListingProductAdditionalFilter> additionalFilters;

        /**
         * Custom filter for the product
         *
         * @param additionalFilters the value to set
         * @return this builder
         */
        public Builder additionalFilters(
                java.util.List<ListingProductAdditionalFilter> additionalFilters) {
            this.additionalFilters = additionalFilters;
            this.__explicitlySet__.add("additionalFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListingProduct build() {
            ListingProduct model =
                    new ListingProduct(this.code, this.categories, this.additionalFilters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListingProduct model) {
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("categories")) {
                this.categories(model.getCategories());
            }
            if (model.wasPropertyExplicitlySet("additionalFilters")) {
                this.additionalFilters(model.getAdditionalFilters());
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

    /** Product Code */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * Product Code
     *
     * @return the value
     */
    public String getCode() {
        return code;
    }

    /** List of category codes within a Product which are applicable to the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<String> categories;

    /**
     * List of category codes within a Product which are applicable to the listing revision.
     *
     * @return the value
     */
    public java.util.List<String> getCategories() {
        return categories;
    }

    /** Custom filter for the product */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalFilters")
    private final java.util.List<ListingProductAdditionalFilter> additionalFilters;

    /**
     * Custom filter for the product
     *
     * @return the value
     */
    public java.util.List<ListingProductAdditionalFilter> getAdditionalFilters() {
        return additionalFilters;
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
        sb.append("ListingProduct(");
        sb.append("super=").append(super.toString());
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(", additionalFilters=").append(String.valueOf(this.additionalFilters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListingProduct)) {
            return false;
        }

        ListingProduct other = (ListingProduct) o;
        return java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.additionalFilters, other.additionalFilters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalFilters == null ? 43 : this.additionalFilters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
