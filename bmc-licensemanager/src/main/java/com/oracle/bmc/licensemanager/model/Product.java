/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * Details of product. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Product.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Product extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "count", "category"})
    public Product(String name, Double count, ProductCategory category) {
        super();
        this.name = name;
        this.count = count;
        this.category = category;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the product. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the product.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Units required for the missing product. */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Double count;

        /**
         * Units required for the missing product.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Double count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /** Product category base or option. */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private ProductCategory category;

        /**
         * Product category base or option.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(ProductCategory category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Product build() {
            Product model = new Product(this.name, this.count, this.category);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Product model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
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

    /** Name of the product. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the product.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Units required for the missing product. */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Double count;

    /**
     * Units required for the missing product.
     *
     * @return the value
     */
    public Double getCount() {
        return count;
    }

    /** Product category base or option. */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final ProductCategory category;

    /**
     * Product category base or option.
     *
     * @return the value
     */
    public ProductCategory getCategory() {
        return category;
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
        sb.append("Product(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }

        Product other = (Product) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.category, other.category)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
