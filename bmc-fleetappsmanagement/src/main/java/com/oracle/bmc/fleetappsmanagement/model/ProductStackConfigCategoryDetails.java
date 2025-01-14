/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * ProductStack Config Category Details. Defines suite or stack of products on which applications
 * hosted by the resources are built and need to be managed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProductStackConfigCategoryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configCategory")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProductStackConfigCategoryDetails extends ConfigCategoryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Products that belong to the stack. For example, Oracle WebLogic and Java for the Oracle
         * Fusion Middleware product stack.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<ConfigAssociationDetails> products;

        /**
         * Products that belong to the stack. For example, Oracle WebLogic and Java for the Oracle
         * Fusion Middleware product stack.
         *
         * @param products the value to set
         * @return this builder
         */
        public Builder products(java.util.List<ConfigAssociationDetails> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subCategoryDetails")
        private ProductStackSubCategoryDetails subCategoryDetails;

        public Builder subCategoryDetails(ProductStackSubCategoryDetails subCategoryDetails) {
            this.subCategoryDetails = subCategoryDetails;
            this.__explicitlySet__.add("subCategoryDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProductStackConfigCategoryDetails build() {
            ProductStackConfigCategoryDetails model =
                    new ProductStackConfigCategoryDetails(this.products, this.subCategoryDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProductStackConfigCategoryDetails model) {
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
            }
            if (model.wasPropertyExplicitlySet("subCategoryDetails")) {
                this.subCategoryDetails(model.getSubCategoryDetails());
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

    @Deprecated
    public ProductStackConfigCategoryDetails(
            java.util.List<ConfigAssociationDetails> products,
            ProductStackSubCategoryDetails subCategoryDetails) {
        super();
        this.products = products;
        this.subCategoryDetails = subCategoryDetails;
    }

    /**
     * Products that belong to the stack. For example, Oracle WebLogic and Java for the Oracle
     * Fusion Middleware product stack.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<ConfigAssociationDetails> products;

    /**
     * Products that belong to the stack. For example, Oracle WebLogic and Java for the Oracle
     * Fusion Middleware product stack.
     *
     * @return the value
     */
    public java.util.List<ConfigAssociationDetails> getProducts() {
        return products;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subCategoryDetails")
    private final ProductStackSubCategoryDetails subCategoryDetails;

    public ProductStackSubCategoryDetails getSubCategoryDetails() {
        return subCategoryDetails;
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
        sb.append("ProductStackConfigCategoryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(", subCategoryDetails=").append(String.valueOf(this.subCategoryDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductStackConfigCategoryDetails)) {
            return false;
        }

        ProductStackConfigCategoryDetails other = (ProductStackConfigCategoryDetails) o;
        return java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(this.subCategoryDetails, other.subCategoryDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        result =
                (result * PRIME)
                        + (this.subCategoryDetails == null
                                ? 43
                                : this.subCategoryDetails.hashCode());
        return result;
    }
}
