/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * The SKU Product Id details for a resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SkuProducts.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SkuProducts extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"skuId", "skuType", "cloudCreditType"})
    public SkuProducts(String skuId, String skuType, String cloudCreditType) {
        super();
        this.skuId = skuId;
        this.skuType = skuType;
        this.cloudCreditType = cloudCreditType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Sku Id for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("skuId")
        private String skuId;

        /**
         * The Sku Id for the resource.
         *
         * @param skuId the value to set
         * @return this builder
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            this.__explicitlySet__.add("skuId");
            return this;
        }
        /** The Sku type for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("skuType")
        private String skuType;

        /**
         * The Sku type for the resource.
         *
         * @param skuType the value to set
         * @return this builder
         */
        public Builder skuType(String skuType) {
            this.skuType = skuType;
            this.__explicitlySet__.add("skuType");
            return this;
        }
        /** The cloud credit type for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudCreditType")
        private String cloudCreditType;

        /**
         * The cloud credit type for the resource.
         *
         * @param cloudCreditType the value to set
         * @return this builder
         */
        public Builder cloudCreditType(String cloudCreditType) {
            this.cloudCreditType = cloudCreditType;
            this.__explicitlySet__.add("cloudCreditType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SkuProducts build() {
            SkuProducts model = new SkuProducts(this.skuId, this.skuType, this.cloudCreditType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SkuProducts model) {
            if (model.wasPropertyExplicitlySet("skuId")) {
                this.skuId(model.getSkuId());
            }
            if (model.wasPropertyExplicitlySet("skuType")) {
                this.skuType(model.getSkuType());
            }
            if (model.wasPropertyExplicitlySet("cloudCreditType")) {
                this.cloudCreditType(model.getCloudCreditType());
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

    /** The Sku Id for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuId")
    private final String skuId;

    /**
     * The Sku Id for the resource.
     *
     * @return the value
     */
    public String getSkuId() {
        return skuId;
    }

    /** The Sku type for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuType")
    private final String skuType;

    /**
     * The Sku type for the resource.
     *
     * @return the value
     */
    public String getSkuType() {
        return skuType;
    }

    /** The cloud credit type for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudCreditType")
    private final String cloudCreditType;

    /**
     * The cloud credit type for the resource.
     *
     * @return the value
     */
    public String getCloudCreditType() {
        return cloudCreditType;
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
        sb.append("SkuProducts(");
        sb.append("super=").append(super.toString());
        sb.append("skuId=").append(String.valueOf(this.skuId));
        sb.append(", skuType=").append(String.valueOf(this.skuType));
        sb.append(", cloudCreditType=").append(String.valueOf(this.cloudCreditType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SkuProducts)) {
            return false;
        }

        SkuProducts other = (SkuProducts) o;
        return java.util.Objects.equals(this.skuId, other.skuId)
                && java.util.Objects.equals(this.skuType, other.skuType)
                && java.util.Objects.equals(this.cloudCreditType, other.cloudCreditType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.skuId == null ? 43 : this.skuId.hashCode());
        result = (result * PRIME) + (this.skuType == null ? 43 : this.skuType.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudCreditType == null ? 43 : this.cloudCreditType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
