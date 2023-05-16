/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubsubscription.model;

/**
 * Product description <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Product.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Product extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "partNumber",
        "name",
        "unitOfMeasure",
        "billingCategory",
        "productCategory",
        "ucmRateCardPartType"
    })
    public Product(
            String partNumber,
            String name,
            String unitOfMeasure,
            String billingCategory,
            String productCategory,
            String ucmRateCardPartType) {
        super();
        this.partNumber = partNumber;
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.billingCategory = billingCategory;
        this.productCategory = productCategory;
        this.ucmRateCardPartType = ucmRateCardPartType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Product part numner */
        @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
        private String partNumber;

        /**
         * Product part numner
         *
         * @param partNumber the value to set
         * @return this builder
         */
        public Builder partNumber(String partNumber) {
            this.partNumber = partNumber;
            this.__explicitlySet__.add("partNumber");
            return this;
        }
        /** Product name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Product name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Unit of measure */
        @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
        private String unitOfMeasure;

        /**
         * Unit of measure
         *
         * @param unitOfMeasure the value to set
         * @return this builder
         */
        public Builder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            this.__explicitlySet__.add("unitOfMeasure");
            return this;
        }
        /** Metered service billing category */
        @com.fasterxml.jackson.annotation.JsonProperty("billingCategory")
        private String billingCategory;

        /**
         * Metered service billing category
         *
         * @param billingCategory the value to set
         * @return this builder
         */
        public Builder billingCategory(String billingCategory) {
            this.billingCategory = billingCategory;
            this.__explicitlySet__.add("billingCategory");
            return this;
        }
        /** Product category */
        @com.fasterxml.jackson.annotation.JsonProperty("productCategory")
        private String productCategory;

        /**
         * Product category
         *
         * @param productCategory the value to set
         * @return this builder
         */
        public Builder productCategory(String productCategory) {
            this.productCategory = productCategory;
            this.__explicitlySet__.add("productCategory");
            return this;
        }
        /** Rate card part type of Product */
        @com.fasterxml.jackson.annotation.JsonProperty("ucmRateCardPartType")
        private String ucmRateCardPartType;

        /**
         * Rate card part type of Product
         *
         * @param ucmRateCardPartType the value to set
         * @return this builder
         */
        public Builder ucmRateCardPartType(String ucmRateCardPartType) {
            this.ucmRateCardPartType = ucmRateCardPartType;
            this.__explicitlySet__.add("ucmRateCardPartType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Product build() {
            Product model =
                    new Product(
                            this.partNumber,
                            this.name,
                            this.unitOfMeasure,
                            this.billingCategory,
                            this.productCategory,
                            this.ucmRateCardPartType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Product model) {
            if (model.wasPropertyExplicitlySet("partNumber")) {
                this.partNumber(model.getPartNumber());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("unitOfMeasure")) {
                this.unitOfMeasure(model.getUnitOfMeasure());
            }
            if (model.wasPropertyExplicitlySet("billingCategory")) {
                this.billingCategory(model.getBillingCategory());
            }
            if (model.wasPropertyExplicitlySet("productCategory")) {
                this.productCategory(model.getProductCategory());
            }
            if (model.wasPropertyExplicitlySet("ucmRateCardPartType")) {
                this.ucmRateCardPartType(model.getUcmRateCardPartType());
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

    /** Product part numner */
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    private final String partNumber;

    /**
     * Product part numner
     *
     * @return the value
     */
    public String getPartNumber() {
        return partNumber;
    }

    /** Product name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Product name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Unit of measure */
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    private final String unitOfMeasure;

    /**
     * Unit of measure
     *
     * @return the value
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /** Metered service billing category */
    @com.fasterxml.jackson.annotation.JsonProperty("billingCategory")
    private final String billingCategory;

    /**
     * Metered service billing category
     *
     * @return the value
     */
    public String getBillingCategory() {
        return billingCategory;
    }

    /** Product category */
    @com.fasterxml.jackson.annotation.JsonProperty("productCategory")
    private final String productCategory;

    /**
     * Product category
     *
     * @return the value
     */
    public String getProductCategory() {
        return productCategory;
    }

    /** Rate card part type of Product */
    @com.fasterxml.jackson.annotation.JsonProperty("ucmRateCardPartType")
    private final String ucmRateCardPartType;

    /**
     * Rate card part type of Product
     *
     * @return the value
     */
    public String getUcmRateCardPartType() {
        return ucmRateCardPartType;
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
        sb.append("partNumber=").append(String.valueOf(this.partNumber));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", unitOfMeasure=").append(String.valueOf(this.unitOfMeasure));
        sb.append(", billingCategory=").append(String.valueOf(this.billingCategory));
        sb.append(", productCategory=").append(String.valueOf(this.productCategory));
        sb.append(", ucmRateCardPartType=").append(String.valueOf(this.ucmRateCardPartType));
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
        return java.util.Objects.equals(this.partNumber, other.partNumber)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.unitOfMeasure, other.unitOfMeasure)
                && java.util.Objects.equals(this.billingCategory, other.billingCategory)
                && java.util.Objects.equals(this.productCategory, other.productCategory)
                && java.util.Objects.equals(this.ucmRateCardPartType, other.ucmRateCardPartType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.partNumber == null ? 43 : this.partNumber.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.unitOfMeasure == null ? 43 : this.unitOfMeasure.hashCode());
        result =
                (result * PRIME)
                        + (this.billingCategory == null ? 43 : this.billingCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.productCategory == null ? 43 : this.productCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.ucmRateCardPartType == null
                                ? 43
                                : this.ucmRateCardPartType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
