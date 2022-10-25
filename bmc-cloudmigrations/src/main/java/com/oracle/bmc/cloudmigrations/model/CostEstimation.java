/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Cost estimation description
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CostEstimation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CostEstimation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compute",
        "storage",
        "osImage",
        "currencyCode",
        "totalEstimationPerMonth",
        "totalEstimationPerMonthBySubscription",
        "subscriptionId"
    })
    public CostEstimation(
            ComputeCostEstimation compute,
            StorageCostEstimation storage,
            OsImageEstimation osImage,
            String currencyCode,
            java.math.BigDecimal totalEstimationPerMonth,
            java.math.BigDecimal totalEstimationPerMonthBySubscription,
            String subscriptionId) {
        super();
        this.compute = compute;
        this.storage = storage;
        this.osImage = osImage;
        this.currencyCode = currencyCode;
        this.totalEstimationPerMonth = totalEstimationPerMonth;
        this.totalEstimationPerMonthBySubscription = totalEstimationPerMonthBySubscription;
        this.subscriptionId = subscriptionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("compute")
        private ComputeCostEstimation compute;

        public Builder compute(ComputeCostEstimation compute) {
            this.compute = compute;
            this.__explicitlySet__.add("compute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storage")
        private StorageCostEstimation storage;

        public Builder storage(StorageCostEstimation storage) {
            this.storage = storage;
            this.__explicitlySet__.add("storage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osImage")
        private OsImageEstimation osImage;

        public Builder osImage(OsImageEstimation osImage) {
            this.osImage = osImage;
            this.__explicitlySet__.add("osImage");
            return this;
        }
        /**
         * Currency code in the ISO format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * Currency code in the ISO format.
         * @param currencyCode the value to set
         * @return this builder
         **/
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /**
         * Total estimation per month
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalEstimationPerMonth")
        private java.math.BigDecimal totalEstimationPerMonth;

        /**
         * Total estimation per month
         * @param totalEstimationPerMonth the value to set
         * @return this builder
         **/
        public Builder totalEstimationPerMonth(java.math.BigDecimal totalEstimationPerMonth) {
            this.totalEstimationPerMonth = totalEstimationPerMonth;
            this.__explicitlySet__.add("totalEstimationPerMonth");
            return this;
        }
        /**
         * Total estimation per month by subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalEstimationPerMonthBySubscription")
        private java.math.BigDecimal totalEstimationPerMonthBySubscription;

        /**
         * Total estimation per month by subscription.
         * @param totalEstimationPerMonthBySubscription the value to set
         * @return this builder
         **/
        public Builder totalEstimationPerMonthBySubscription(
                java.math.BigDecimal totalEstimationPerMonthBySubscription) {
            this.totalEstimationPerMonthBySubscription = totalEstimationPerMonthBySubscription;
            this.__explicitlySet__.add("totalEstimationPerMonthBySubscription");
            return this;
        }
        /**
         * Subscription ID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * Subscription ID
         * @param subscriptionId the value to set
         * @return this builder
         **/
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CostEstimation build() {
            CostEstimation model =
                    new CostEstimation(
                            this.compute,
                            this.storage,
                            this.osImage,
                            this.currencyCode,
                            this.totalEstimationPerMonth,
                            this.totalEstimationPerMonthBySubscription,
                            this.subscriptionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CostEstimation model) {
            if (model.wasPropertyExplicitlySet("compute")) {
                this.compute(model.getCompute());
            }
            if (model.wasPropertyExplicitlySet("storage")) {
                this.storage(model.getStorage());
            }
            if (model.wasPropertyExplicitlySet("osImage")) {
                this.osImage(model.getOsImage());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("totalEstimationPerMonth")) {
                this.totalEstimationPerMonth(model.getTotalEstimationPerMonth());
            }
            if (model.wasPropertyExplicitlySet("totalEstimationPerMonthBySubscription")) {
                this.totalEstimationPerMonthBySubscription(
                        model.getTotalEstimationPerMonthBySubscription());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            return this;
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

    @com.fasterxml.jackson.annotation.JsonProperty("compute")
    private final ComputeCostEstimation compute;

    public ComputeCostEstimation getCompute() {
        return compute;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    private final StorageCostEstimation storage;

    public StorageCostEstimation getStorage() {
        return storage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("osImage")
    private final OsImageEstimation osImage;

    public OsImageEstimation getOsImage() {
        return osImage;
    }

    /**
     * Currency code in the ISO format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * Currency code in the ISO format.
     * @return the value
     **/
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Total estimation per month
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalEstimationPerMonth")
    private final java.math.BigDecimal totalEstimationPerMonth;

    /**
     * Total estimation per month
     * @return the value
     **/
    public java.math.BigDecimal getTotalEstimationPerMonth() {
        return totalEstimationPerMonth;
    }

    /**
     * Total estimation per month by subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalEstimationPerMonthBySubscription")
    private final java.math.BigDecimal totalEstimationPerMonthBySubscription;

    /**
     * Total estimation per month by subscription.
     * @return the value
     **/
    public java.math.BigDecimal getTotalEstimationPerMonthBySubscription() {
        return totalEstimationPerMonthBySubscription;
    }

    /**
     * Subscription ID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * Subscription ID
     * @return the value
     **/
    public String getSubscriptionId() {
        return subscriptionId;
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
        sb.append("CostEstimation(");
        sb.append("super=").append(super.toString());
        sb.append("compute=").append(String.valueOf(this.compute));
        sb.append(", storage=").append(String.valueOf(this.storage));
        sb.append(", osImage=").append(String.valueOf(this.osImage));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", totalEstimationPerMonth=")
                .append(String.valueOf(this.totalEstimationPerMonth));
        sb.append(", totalEstimationPerMonthBySubscription=")
                .append(String.valueOf(this.totalEstimationPerMonthBySubscription));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CostEstimation)) {
            return false;
        }

        CostEstimation other = (CostEstimation) o;
        return java.util.Objects.equals(this.compute, other.compute)
                && java.util.Objects.equals(this.storage, other.storage)
                && java.util.Objects.equals(this.osImage, other.osImage)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(
                        this.totalEstimationPerMonth, other.totalEstimationPerMonth)
                && java.util.Objects.equals(
                        this.totalEstimationPerMonthBySubscription,
                        other.totalEstimationPerMonthBySubscription)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.compute == null ? 43 : this.compute.hashCode());
        result = (result * PRIME) + (this.storage == null ? 43 : this.storage.hashCode());
        result = (result * PRIME) + (this.osImage == null ? 43 : this.osImage.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result =
                (result * PRIME)
                        + (this.totalEstimationPerMonth == null
                                ? 43
                                : this.totalEstimationPerMonth.hashCode());
        result =
                (result * PRIME)
                        + (this.totalEstimationPerMonthBySubscription == null
                                ? 43
                                : this.totalEstimationPerMonthBySubscription.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
