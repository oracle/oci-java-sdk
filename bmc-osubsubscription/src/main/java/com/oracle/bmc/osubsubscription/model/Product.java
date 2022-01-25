/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubsubscription.model;

/**
 * Product description
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Product.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Product {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
        private String partNumber;

        public Builder partNumber(String partNumber) {
            this.partNumber = partNumber;
            this.__explicitlySet__.add("partNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
        private String unitOfMeasure;

        public Builder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            this.__explicitlySet__.add("unitOfMeasure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billingCategory")
        private String billingCategory;

        public Builder billingCategory(String billingCategory) {
            this.billingCategory = billingCategory;
            this.__explicitlySet__.add("billingCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productCategory")
        private String productCategory;

        public Builder productCategory(String productCategory) {
            this.productCategory = productCategory;
            this.__explicitlySet__.add("productCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ucmRateCardPartType")
        private String ucmRateCardPartType;

        public Builder ucmRateCardPartType(String ucmRateCardPartType) {
            this.ucmRateCardPartType = ucmRateCardPartType;
            this.__explicitlySet__.add("ucmRateCardPartType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Product build() {
            Product __instance__ =
                    new Product(
                            partNumber,
                            name,
                            unitOfMeasure,
                            billingCategory,
                            productCategory,
                            ucmRateCardPartType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Product o) {
            Builder copiedBuilder =
                    partNumber(o.getPartNumber())
                            .name(o.getName())
                            .unitOfMeasure(o.getUnitOfMeasure())
                            .billingCategory(o.getBillingCategory())
                            .productCategory(o.getProductCategory())
                            .ucmRateCardPartType(o.getUcmRateCardPartType());

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

    /**
     * Product part numner
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    String partNumber;

    /**
     * Product name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Unit of measure
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    String unitOfMeasure;

    /**
     * Metered service billing category
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingCategory")
    String billingCategory;

    /**
     * Product category
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productCategory")
    String productCategory;

    /**
     * Rate card part type of Product
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ucmRateCardPartType")
    String ucmRateCardPartType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
